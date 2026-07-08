package Y;

import X.AbstractC20142713rd;
import X.C1C7U;
import X.C20140713rJ;
import X.C20140913rL;
import X.C20634615om;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.detail.keyframe.ui.TakoDetailKeyFrameBottomAssemAssem;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS41S0101000_30 implements Runnable {
    public final int $t;
    public int i1;
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

    public static final void run$0(ARunnableS41S0101000_30 aRunnableS41S0101000_30) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        C1C7U.LIZ("TakoDetailKeyFrameBottomAssemAssem@9ac5.onViewCreated$5$2");
        try {
            TakoDetailKeyFrameBottomAssemAssem takoDetailKeyFrameBottomAssemAssem = (TakoDetailKeyFrameBottomAssemAssem) aRunnableS41S0101000_30.l0;
            C20634615om c20634615om = takoDetailKeyFrameBottomAssemAssem.LLLFFI;
            if (c20634615om != null) {
                c20634615om.LIZ = aRunnableS41S0101000_30.i1;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = takoDetailKeyFrameBottomAssemAssem.LLJLLIL;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.startSmoothScroll(((TakoDetailKeyFrameBottomAssemAssem) aRunnableS41S0101000_30.l0).LLLFFI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoDetailKeyFrameBottomAssemAssem@9ac5.onViewCreated$5$2");
    }

    public static final void run$1(ARunnableS41S0101000_30 aRunnableS41S0101000_30) {
        ((AbstractC20142713rd) aRunnableS41S0101000_30.l0).LIZJ(aRunnableS41S0101000_30.i1);
    }

    public static final void run$2(ARunnableS41S0101000_30 aRunnableS41S0101000_30) {
        boolean zLIZ;
        try {
            C20140913rL c20140913rL = (C20140913rL) aRunnableS41S0101000_30.l0;
            int i = aRunnableS41S0101000_30.i1;
            AbstractC20142713rd abstractC20142713rd = ((C20140713rJ) c20140913rL).LIZ;
            if (abstractC20142713rd != null) {
                abstractC20142713rd.LIZJ(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public ARunnableS41S0101000_30(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
