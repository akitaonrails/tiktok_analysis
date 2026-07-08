package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0SPN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SPN {
    public final ConcurrentHashMap<Integer, List<InterfaceC469401sC>> LIZ = new ConcurrentHashMap<>();

    public int LIZ() {
        return 0;
    }

    public final void LJ(int i, int i2) {
        Iterator<Map.Entry<Integer, List<InterfaceC469401sC>>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, List<InterfaceC469401sC>> next = it2.next();
            if (next.getKey().intValue() < i || next.getKey().intValue() > i2) {
                for (InterfaceC469401sC interfaceC469401sC : next.getValue()) {
                    if (interfaceC469401sC != null) {
                        interfaceC469401sC.cancel();
                    }
                }
                it2.remove();
            }
        }
    }

    public final void LIZLLL(String str, Context context, List list, C1846520y9S c1846520y9S, IntRange intRange) {
        EnumC1334360kpO enumC1334360kpO;
        int i = c1846520y9S.LL;
        int i2 = c1846520y9S.LLILLJJLI;
        int i3 = c1846520y9S.LLILLL;
        if (i3 > 0) {
            if (i > i2) {
                return;
            }
        } else if (i3 >= 0 || i2 > i) {
            return;
        }
        boolean z = true;
        while (true) {
            if (AwemeExtKt.isPhotoMode((Aweme) ListProtector.get(list, i))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start preload aweme ");
                sbLIZ.append(i);
                C2344809Gs.LIZLLL(3, "BasePreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
                Aweme aweme = (Aweme) ListProtector.get(list, i);
                if (z) {
                    enumC1334360kpO = EnumC1334360kpO.HIGH;
                } else {
                    enumC1334360kpO = EnumC1334360kpO.MEDIUM;
                }
                C823050WQl.LIZLLL().execute(new RunnableC720040SMg(context, enumC1334360kpO, aweme, str, new AwS119S0101000_11(this, i, 2), intRange));
                z = false;
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public void LIZIZ(String str, Context context, List<? extends Aweme> list, int i, int i2, int i3) {
        int i4 = 0;
        if (list != null && !list.isEmpty() && C0SPR.LIZ().enable) {
            int iLIZ = LIZ();
            if (iLIZ < 1) {
                iLIZ = 1;
            }
            int i5 = i + 2;
            if (i5 >= 0) {
                i4 = i5;
            }
            int i6 = (iLIZ + i4) - 1;
            int size = list.size() - 1;
            if (i6 > size) {
                i6 = size;
            }
            LIZLLL(str, context, list, new IntRange(i4, i6), new IntRange(i2, i3));
            Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i, list);
            if (aweme != null) {
                aweme.getAid();
            }
        }
    }
}
