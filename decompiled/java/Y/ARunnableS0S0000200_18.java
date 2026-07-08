package Y;

import X.C1199450hJn;
import X.C1199460hJo;
import X.C1C7U;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS0S0000200_18 implements Runnable {
    public final int $t;
    public long j0;
    public long j1;

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
        C1199460hJo c1199460hJo = C1199460hJo.LIZ;
        C1199450hJn c1199450hJn = new C1199450hJn("poi_collect_list");
        c1199450hJn.LIZLLL = "page_render";
        c1199450hJn.LIZ(System.currentTimeMillis() - this.j0);
        c1199460hJo.getClass();
        C1199460hJo.LIZ(c1199450hJn);
        C1199450hJn c1199450hJn2 = new C1199450hJn("poi_collect_list");
        c1199450hJn2.LIZLLL = "first_frame";
        c1199450hJn2.LIZ(System.currentTimeMillis() - this.j1);
        C1199460hJo.LIZ(c1199450hJn2);
    }

    public final void LIZ$1() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1199460hJo c1199460hJo = C1199460hJo.LIZ;
        C1199450hJn c1199450hJn = new C1199450hJn("poi_search");
        c1199450hJn.LIZLLL = "page_render";
        c1199450hJn.LIZ(jCurrentTimeMillis - this.j0);
        c1199460hJo.getClass();
        C1199460hJo.LIZ(c1199450hJn);
        C1199450hJn c1199450hJn2 = new C1199450hJn("poi_search");
        c1199450hJn2.LIZLLL = "first_frame";
        c1199450hJn2.LIZ(jCurrentTimeMillis - this.j1);
        C1199460hJo.LIZ(c1199450hJn2);
    }

    public static final void run$0(ARunnableS0S0000200_18 aRunnableS0S0000200_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiCollectListAssem@e888.onViewCreated$4$1$1");
        try {
            aRunnableS0S0000200_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiCollectListAssem@e888.onViewCreated$4$1$1");
    }

    public static final void run$1(ARunnableS0S0000200_18 aRunnableS0S0000200_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiSearchAssem@e687.handleRefreshSuccess$1$1");
        try {
            aRunnableS0S0000200_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiSearchAssem@e687.handleRefreshSuccess$1$1");
    }

    public ARunnableS0S0000200_18(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
