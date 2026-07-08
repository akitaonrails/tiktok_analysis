package Y;

import X.C1605720rt4;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C727780Sgi;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragmentV2;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS7S1300000_7 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
        int height;
        if (!((LiveNewAudienceEndFragmentV2) this.l3).isAdded() || ((LiveNewAudienceEndFragmentV2) this.l3).getView() == null || (height = ((ViewGroup) this.l1).getHeight()) <= 0) {
            return;
        }
        LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2 = (LiveNewAudienceEndFragmentV2) this.l3;
        if (height != liveNewAudienceEndFragmentV2.LLLIIII) {
            liveNewAudienceEndFragmentV2.LLLIIII = height;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx_container remaining height(px)=");
            sbLIZ.append(height);
            sbLIZ.append(", from=");
            sbLIZ.append(this.s0);
            C20441214yg.LIZIZ("LiveNewAudienceEndFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        Runnable runnable = (Runnable) this.l2;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void run$0(ARunnableS7S1300000_7 aRunnableS7S1300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewAudienceEndFragmentV2@97bd.updateLynxContainerRemainHeightAsync$1");
        try {
            aRunnableS7S1300000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewAudienceEndFragmentV2@97bd.updateLynxContainerRemainHeightAsync$1");
    }

    public static final void run$1(ARunnableS7S1300000_7 aRunnableS7S1300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SocPubStatusCache@d9ef.observeWithLc$1$2$1");
        try {
            ((MutableLiveData) aRunnableS7S1300000_7.l1).removeObservers((LifecycleOwner) aRunnableS7S1300000_7.l2);
            if (!((MutableLiveData) aRunnableS7S1300000_7.l1).hasObservers()) {
                ((C1605720rt4) aRunnableS7S1300000_7.l3).LIZIZ().remove(aRunnableS7S1300000_7.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocPubStatusCache@d9ef.observeWithLc$1$2$1");
    }

    public ARunnableS7S1300000_7(LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2, ViewGroup viewGroup, ARunnableS16S0400000_7 aRunnableS16S0400000_7, int i) {
        this.$t = i;
        this.l3 = liveNewAudienceEndFragmentV2;
        this.l1 = viewGroup;
        this.s0 = "initEndPageLynxIfNeed";
        this.l2 = aRunnableS16S0400000_7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS7S1300000_7(MutableLiveData mutableLiveData, MutableLiveData<C727780Sgi> mutableLiveData2, LifecycleOwner lifecycleOwner, C1605720rt4 c1605720rt4, String str) {
        this.$t = str;
        this.l1 = mutableLiveData;
        this.l2 = mutableLiveData2;
        this.l3 = lifecycleOwner;
        this.s0 = c1605720rt4;
    }
}
