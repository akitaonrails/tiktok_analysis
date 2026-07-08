package Y;

import X.C09JN;
import X.C1C7U;
import X.C468350IYf;
import X.C468450IYp;
import X.C468460IYq;
import android.util.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class AfS78S0101000_7 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS78S0101000_7 afS78S0101000_7, Object obj) {
        C468460IYq c468460IYq = (C468460IYq) afS78S0101000_7.l0;
        int i = afS78S0101000_7.i1;
        c468460IYq.getClass();
        if (((Boolean) obj).booleanValue() && c468460IYq.LL) {
            c468460IYq.P5(i);
        }
    }

    public static final void accept$1(AfS78S0101000_7 afS78S0101000_7, Object obj) {
        C468450IYp c468450IYp = (C468450IYp) afS78S0101000_7.l0;
        int i = afS78S0101000_7.i1;
        c468450IYp.getClass();
        C1C7U.LIZ("DrawerFeedLiveAdapterV2$DrawerEndViewHolder@3309.bind$1L");
        if (((Boolean) ((Pair) obj).first).booleanValue() && c468450IYp.LL) {
            C468450IYp.P5(i);
        }
        C1C7U.LIZIZ("DrawerFeedLiveAdapterV2$DrawerEndViewHolder@3309.bind$1L");
    }

    public static final void accept$2(AfS78S0101000_7 afS78S0101000_7, Object obj) {
        C1C7U.LIZ("BaseDrawerVerticalSuggestViewHolder@2d9d.bind$1");
        if (((Boolean) obj).booleanValue()) {
            C468350IYf c468350IYf = (C468350IYf) afS78S0101000_7.l0;
            if (c468350IYf.LL) {
                c468350IYf.R5(afS78S0101000_7.i1);
            }
        }
        C1C7U.LIZIZ("BaseDrawerVerticalSuggestViewHolder@2d9d.bind$1");
    }

    public AfS78S0101000_7(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
