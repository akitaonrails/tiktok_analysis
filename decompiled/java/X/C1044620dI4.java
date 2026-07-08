package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.component.danmaku.model.Danmu;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0dI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044620dI4 {
    public static final Map<Integer, List<Double>> LIZ;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        LIZ = C2097608Jq.LJIIIIZZ(new Pair(1, Collections.singletonList(dValueOf)), new Pair(2, C1697810uHb.LJIIJJI(dValueOf, Double.valueOf(0.58d))), new Pair(3, C1697810uHb.LJIIJJI(dValueOf, Double.valueOf(0.38d), Double.valueOf(0.72d))), new Pair(4, C1697810uHb.LJIIJJI(dValueOf, Double.valueOf(0.28d), Double.valueOf(0.56d), Double.valueOf(0.84d))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[LOOP:1: B:38:0x009d->B:39:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f A[PHI: r7
      0x015f: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v6 int) binds: [B:64:0x013a, B:66:0x0140, B:68:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.HashSet, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1044600dI2 LIZ(android.content.Context r37, X.C1044610dI3 r38, X.C1044700dIC r39, X.C1044630dI5 r40, long r41) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1044620dI4.LIZ(android.content.Context, X.0dI3, X.0dIC, X.0dI5, long):X.0dI2");
    }

    public static void LIZIZ(Context context, List list, long j, Danmu danmu, long j2, C1044630dI5 c1044630dI5) {
        AbstractC1044720dIE c1044660dI8;
        if (TextUtils.isEmpty(danmu.text)) {
            return;
        }
        int i = danmu.type;
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                c1044660dI8 = new C1044660dI8();
            } else {
                c1044660dI8 = new AbstractC1044650dI7() { // from class: X.0dI9
                    public final int LJJII = 2;
                    public final boolean LJJIII = true;
                    public final boolean LJJIIJ = true;

                    @Override // X.AbstractC1044720dIE
                    public final int LJFF() {
                        return this.LJJII;
                    }

                    @Override // X.AbstractC1044720dIE
                    public final boolean LJI() {
                        return this.LJJIII;
                    }

                    @Override // X.AbstractC1044720dIE
                    public final boolean LJII() {
                        return this.LJJIIJ;
                    }
                };
            }
        } else {
            c1044660dI8 = new AbstractC1044650dI7() { // from class: X.0dIA
                public final int LJJII = 1;
                public final boolean LJJIII = true;
                public final boolean LJJIIJ = true;

                @Override // X.AbstractC1044720dIE
                public final int LJFF() {
                    return this.LJJII;
                }

                @Override // X.AbstractC1044720dIE
                public final boolean LJI() {
                    return this.LJJIII;
                }

                @Override // X.AbstractC1044720dIE
                public final boolean LJII() {
                    return this.LJJIIJ;
                }
            };
        }
        c1044660dI8.LJIJJLI = C0GTM.LIZ(R.attr.im, context);
        c1044660dI8.LJIL = C0GTM.LIZ(R.attr.a1i, context);
        int i3 = danmu.bizId;
        c1044660dI8.LJIILJJIL = i3;
        c1044660dI8.LJIIJJI = danmu.text;
        if (c1044660dI8 instanceof AbstractC1044650dI7) {
            AbstractC1044650dI7 abstractC1044650dI7 = (AbstractC1044650dI7) c1044660dI8;
            abstractC1044650dI7.LJJ = danmu.jumpModel;
            abstractC1044650dI7.LJJI = danmu.botConfig;
            abstractC1044650dI7.LJJIFFI = danmu.ecAgentSchema;
        }
        C1044640dI6 c1044640dI6 = (C1044640dI6) ((LinkedHashMap) c1044630dI5.LIZ).get(Integer.valueOf(i3));
        if (c1044640dI6 == null) {
            c1044640dI6 = new C1044640dI6(c1044660dI8.LJFF(), 7);
        }
        c1044660dI8.LJIILL = c1044640dI6.LIZJ;
        c1044660dI8.LJIILLIIL = new AwS417S0200000_16(c1044630dI5, c1044660dI8, 40);
        if (c1044660dI8 instanceof C1044660dI8) {
            C1044660dI8 c1044660dI82 = (C1044660dI8) c1044660dI8;
            c1044660dI82.LJJ = c1044640dI6.LIZ;
            c1044660dI82.LJJI = c1044640dI6.LIZIZ;
        }
        int i4 = c1044660dI8.LJIILJJIL;
        Map<Integer, Set<WeakReference<AbstractC1044720dIE>>> map = c1044630dI5.LIZIZ;
        Integer numValueOf = Integer.valueOf(i4);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object linkedHashSet = linkedHashMap.get(numValueOf);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(numValueOf, linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        C19719612Di.LJJIII(set, AFwS252S0000000_16.get$arr$(375), true);
        set.add(new WeakReference(c1044660dI8));
        c1044660dI8.LIZJ = j;
        c1044660dI8.LIZLLL = j2;
        int i5 = danmu.type;
        if (i5 != 1 && i5 != 2) {
            i2 = 0;
        }
        c1044660dI8.LJII = i2;
        c1044660dI8.LJ = 1001;
        ((ArrayList) list).add(c1044660dI8);
    }
}
