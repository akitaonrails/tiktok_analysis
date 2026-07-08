package Y;

import X.C1742510vRh;
import X.C1742530vRj;
import X.C1C7U;
import X.EnumC1334250kpD;
import X.EnumC1742470vRd;
import com.ss.android.ugc.aweme.ecommerce.ab.EquivalentApi;
import com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS7S1200100_26 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1742530vRj next;
        EquivalentApi next2;
        FullyRenderedLogger fullyRenderedLogger = (FullyRenderedLogger) this.l2;
        C1742510vRh c1742510vRh = fullyRenderedLogger.LIZJ;
        if (c1742510vRh == null) {
            return;
        }
        List<C1742530vRj> list = c1742510vRh.LJI;
        String str = this.s0;
        Iterator<C1742530vRj> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C1742530vRj c1742530vRj = next;
            if (Intrinsics.LJFF(str, c1742530vRj.LIZ)) {
                break;
            }
            Iterator<EquivalentApi> it3 = fullyRenderedLogger.LJI().serverEquivalentApiConfig.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (next2.equivalentApis.contains(str)) {
                        break;
                    }
                }
            }
            EquivalentApi equivalentApi = next2;
            if (Intrinsics.LJFF(equivalentApi != null ? equivalentApi.primaryApi : null, c1742530vRj.LIZ)) {
                break;
            }
        }
        C1742530vRj c1742530vRj2 = next;
        if (c1742530vRj2 != null) {
            String str2 = this.s0;
            EnumC1334250kpD enumC1334250kpD = (EnumC1334250kpD) this.l1;
            long jLongValue = this.j3;
            FullyRenderedLogger fullyRenderedLogger2 = (FullyRenderedLogger) this.l2;
            if (c1742530vRj2.LIZLLL != EnumC1334250kpD.SUCCESS) {
                c1742530vRj2.LIZLLL = enumC1334250kpD;
                if (jLongValue <= 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l = c1742530vRj2.LIZIZ;
                    jLongValue = jCurrentTimeMillis - (l != null ? l.longValue() : c1742510vRh.LIZLLL);
                }
                c1742530vRj2.LJ = jLongValue;
                c1742530vRj2.LIZJ = Long.valueOf(System.currentTimeMillis());
                C1742510vRh c1742510vRh2 = fullyRenderedLogger2.LIZJ;
                if ((c1742510vRh2 != null ? c1742510vRh2.LIZ : null) == EnumC1742470vRd.DEAL_RUNTIME && c1742510vRh2 != null) {
                    c1742510vRh2.LIZIZ = fullyRenderedLogger2.LJI().dealsToSubPageNames.get(str2);
                }
                fullyRenderedLogger2.LJIIJ();
            }
        }
    }

    public final void LIZ$1() {
        ArrayList<C1742530vRj> arrayList;
        C1742530vRj next;
        C1742510vRh c1742510vRh = ((FullyRenderedLogger) this.l1).LIZJ;
        if (c1742510vRh == null || (arrayList = c1742510vRh.LJII) == null) {
            return;
        }
        String str = this.s0;
        Iterator<C1742530vRj> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C1742530vRj c1742530vRj = next;
            if (Intrinsics.LJFF(c1742530vRj.LIZ, str) && !c1742530vRj.LIZLLL.isFinished()) {
                break;
            }
        }
        C1742530vRj c1742530vRj2 = next;
        if (c1742530vRj2 != null) {
            EnumC1334250kpD enumC1334250kpD = (EnumC1334250kpD) this.l2;
            long j = this.j3;
            FullyRenderedLogger fullyRenderedLogger = (FullyRenderedLogger) this.l1;
            c1742530vRj2.LIZLLL = enumC1334250kpD;
            c1742530vRj2.LJ = j;
            Long l = c1742530vRj2.LIZIZ;
            c1742530vRj2.LIZJ = l != null ? Long.valueOf(Long.valueOf(l.longValue() + j).longValue()) : Long.valueOf(System.currentTimeMillis());
            fullyRenderedLogger.LJIIJ();
        }
    }

    public static final void run$0(ARunnableS7S1200100_26 aRunnableS7S1200100_26) {
        boolean zLIZ;
        C1C7U.LIZ("FullyRenderedLogger@7d0c.onApiEnd$1");
        try {
            aRunnableS7S1200100_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullyRenderedLogger@7d0c.onApiEnd$1");
    }

    public static final void run$1(ARunnableS7S1200100_26 aRunnableS7S1200100_26) {
        boolean zLIZ;
        C1C7U.LIZ("FullyRenderedLogger@7d0c.onImageRequestEnded$1");
        try {
            aRunnableS7S1200100_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullyRenderedLogger@7d0c.onImageRequestEnded$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS7S1200100_26(long r2, X.EnumC1334250kpD r4, com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L11
            r0 = r1
            r0.l1 = r5
            r0.s0 = r6
            r0.l2 = r4
            r0.j3 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r6
            r0.l1 = r4
            r0.j3 = r2
            r0.l2 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S1200100_26.<init>(long, X.0kpD, com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger, java.lang.String, int):void");
    }
}
