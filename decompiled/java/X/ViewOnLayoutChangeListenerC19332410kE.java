package X;

import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.AgeGateForNUJRevampFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;

/* JADX INFO: renamed from: X.10kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewOnLayoutChangeListenerC19332410kE implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC19332410kE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC19332410kE viewOnLayoutChangeListenerC19332410kE, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19332410kE);
        if (((AgeGateForNUJRevampFragment) viewOnLayoutChangeListenerC19332410kE.l0).isAdded()) {
            ((AgeGateForNUJRevampFragment) viewOnLayoutChangeListenerC19332410kE.l0).iT();
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC19332410kE viewOnLayoutChangeListenerC19332410kE, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        if (C10TN.LIZ() && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            iUnKnownOwnershipBusinessOuterService.updateRootViewAndState(view);
        }
        if (view != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19332410kE);
        }
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28((NewUserJourneyFragment) viewOnLayoutChangeListenerC19332410kE.l0, 111));
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC19332410kE viewOnLayoutChangeListenerC19332410kE, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C10LZ) viewOnLayoutChangeListenerC19332410kE.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19332410kE);
        C10LZ c10lz = (C10LZ) viewOnLayoutChangeListenerC19332410kE.l0;
        c10lz.getClass();
        HandlerHook.viewPost(c10lz, new ARunnableS128S0100000_28(c10lz, 123));
    }
}
