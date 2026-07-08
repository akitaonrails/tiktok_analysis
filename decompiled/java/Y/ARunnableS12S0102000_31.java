package Y;

import X.C1ANM;
import X.C1C7U;
import X.C20603715jn;
import X.C2252611DEt;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.PowerPageState;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS12S0102000_31 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        PowerPageLoader powerPageLoader;
        C2252611DEt c2252611DEt;
        Integer numValueOf = Integer.valueOf(((PowerPageLoader) this.l0).LLILZIL.LIZIZ);
        if (this.i1 <= (numValueOf.intValue() >= 0 ? numValueOf.intValue() : ((PowerPageLoader) this.l0).LLILZIL.LIZ) && (((c2252611DEt = (powerPageLoader = (PowerPageLoader) this.l0).LLJJIII) == null || c2252611DEt.isCancelled() || c2252611DEt.isCompleted()) && powerPageLoader.LJ().LIZIZ.LIZIZ.LIZ.LIZJ == PowerPageState.Loaded)) {
            ((PowerPageLoader) this.l0).LJI(null);
        }
        int i = this.i2 - this.i1;
        PowerPageLoader powerPageLoader2 = (PowerPageLoader) this.l0;
        C20603715jn c20603715jn = powerPageLoader2.LLILZIL;
        if (i > c20603715jn.LIZ + 1 || !c20603715jn.LJIIJ) {
            return;
        }
        C2252611DEt c2252611DEt2 = powerPageLoader2.LLJJIJI;
        if ((c2252611DEt2 == null || c2252611DEt2.isCancelled() || c2252611DEt2.isCompleted()) && powerPageLoader2.LJ().LIZIZ.LIZIZ.LIZIZ.LIZJ == PowerPageState.Loaded) {
            PowerPageLoader powerPageLoader3 = (PowerPageLoader) this.l0;
            if (powerPageLoader3.LLJ.getSecond() != null) {
                powerPageLoader3.LJII(null);
            }
        }
    }

    public static final void run$0(ARunnableS12S0102000_31 aRunnableS12S0102000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PowerPageLoader@be3.onBindViewHolder$1");
        try {
            aRunnableS12S0102000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerPageLoader@be3.onBindViewHolder$1");
    }

    public static final void run$1(ARunnableS12S0102000_31 aRunnableS12S0102000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CameoPlayerScene@cabc.legacyVideoEngineCallback$1$onVideoSizeChanged$1");
        try {
            ((C1ANM) aRunnableS12S0102000_31.l0).LLLLLJIL(aRunnableS12S0102000_31.i1, aRunnableS12S0102000_31.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameoPlayerScene@cabc.legacyVideoEngineCallback$1$onVideoSizeChanged$1");
    }

    public static final void run$2(ARunnableS12S0102000_31 aRunnableS12S0102000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CameoPlayerScene@cabc.playListener$1$onVideoSizeChanged$1");
        try {
            ((C1ANM) aRunnableS12S0102000_31.l0).LLLLLJIL(aRunnableS12S0102000_31.i1, aRunnableS12S0102000_31.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameoPlayerScene@cabc.playListener$1$onVideoSizeChanged$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS12S0102000_31(Object obj, PowerPageLoader<Object> powerPageLoader, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = powerPageLoader;
        this.i2 = i;
    }
}
