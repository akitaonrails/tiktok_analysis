package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1274204yi extends C09AY implements Function0<Boolean> {
    public C1274204yi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        C01GW c01gw = C1274404yk.LIZIZ;
        Object value = c01gw.getValue();
        List<Integer> list = C1274404yk.LIZ;
        if (Intrinsics.LJFF(value, list)) {
            z = true;
        } else {
            z = false;
            if (((List) c01gw.getValue()).size() == list.size()) {
                Iterator<Integer> it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    if (it2.next().intValue() != ((Number) ListProtector.get((List) C1274404yk.LIZIZ.getValue(), i)).intValue()) {
                        break;
                    }
                    i = i2;
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
