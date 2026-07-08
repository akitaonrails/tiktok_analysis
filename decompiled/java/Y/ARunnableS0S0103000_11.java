package Y;

import X.C087H;
import X.C0SLX;
import X.C199596137q;
import X.C1C7U;
import X.C692910RFx;
import X.C709340Rs4;
import X.C724270Sb3;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.mob.ComponentSizeParams;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobComponent;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS0S0103000_11 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ$0() {
        InteractAreaSizeMobComponent interactAreaSizeMobComponent = (InteractAreaSizeMobComponent) this.l0;
        int i = this.i1;
        int i2 = this.i2;
        int i3 = this.i3;
        C724270Sb3 c724270Sb3 = interactAreaSizeMobComponent.LLJI;
        CharSequence aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        C199596137q c199596137q = C709340Rs4.LIZIZ;
        Object objLIZ = c199596137q.LIZ(aid, C087H.LL);
        c199596137q.LL.put((K) aid, (V) objLIZ);
        Map map = (Map) objLIZ;
        int width = interactAreaSizeMobComponent.LJJIJL().getWidth();
        if (width == 0) {
            width = C692910RFx.LJFF;
        }
        if (i == 0) {
            map.remove("bottom_bar");
        } else {
            map.put("bottom_bar", new ComponentSizeParams("bottom_bar", width, i));
        }
        if (i2 <= 0.0f) {
            map.remove("bottom_container");
        } else {
            map.put("bottom_container", new ComponentSizeParams("bottom_container", i3, i2));
        }
        interactAreaSizeMobComponent.mp();
    }

    public static final void run$0(ARunnableS0S0103000_11 aRunnableS0S0103000_11) {
        boolean zLIZ;
        C1C7U.LIZ("SlidePhotosViewPagerV2@4fed.smoothScrollTo$$inlined$postDelayed$default$1");
        try {
            super/*X.19g8*/.LJJIJL(aRunnableS0S0103000_11.i1, aRunnableS0S0103000_11.i2, aRunnableS0S0103000_11.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlidePhotosViewPagerV2@4fed.smoothScrollTo$$inlined$postDelayed$default$1");
    }

    public static final void run$1(ARunnableS0S0103000_11 aRunnableS0S0103000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.onBottomSizeChangeInternal$1$1");
        try {
            aRunnableS0S0103000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.onBottomSizeChangeInternal$1$1");
    }

    public ARunnableS0S0103000_11(C0SLX c0slx, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = c0slx;
        this.i1 = i;
        this.i2 = 0;
        this.i3 = i2;
    }

    public ARunnableS0S0103000_11(InteractAreaSizeMobComponent interactAreaSizeMobComponent, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = interactAreaSizeMobComponent;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
