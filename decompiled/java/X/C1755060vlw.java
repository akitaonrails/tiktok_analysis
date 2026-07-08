package X;

import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0vlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755060vlw extends C09AY implements Function0<C1755070vlx> {
    public final /* synthetic */ PdpBodyAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755060vlw(PdpBodyAssem pdpBodyAssem) {
        super(0);
        this.LL = pdpBodyAssem;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vlx] */
    @Override // kotlin.jvm.functions.Function0
    public final C1755070vlx invoke() {
        final PdpBodyAssem pdpBodyAssem = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.0vlx
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                Context context;
                PdpViewModel pdpViewModelLp;
                C19EG activity;
                DialogFragment dialogFragment;
                Dialog dialog;
                Window window;
                C1054004Ag c1054004Ag;
                PdpBodyAssem pdpBodyAssem2 = pdpBodyAssem;
                if (pdpBodyAssem2.LLLIIIL || !pdpBodyAssem2.LLLIIL || !C948503nH.LIZJ(pdpBodyAssem2) || pdpBodyAssem.zp()) {
                    return;
                }
                PdpViewModel pdpViewModelLp2 = pdpBodyAssem.lp();
                Window window2 = null;
                if (pdpViewModelLp2 != null && (c1054004Ag = pdpViewModelLp2.LLJLILLLLZIIL) != null) {
                    c1054004Ag.LJJIJL(pdpBodyAssem.ip(), null);
                }
                Fragment fragmentLJI = C724240Sb0.LJI(pdpBodyAssem);
                if (fragmentLJI != null && (context = fragmentLJI.getContext()) != null && (pdpViewModelLp = pdpBodyAssem.lp()) != null && pdpViewModelLp.LLJIJIL && C10460047e.LIZ() && !C1486180omG.LIZIZ(context)) {
                    Fragment fragmentLJI2 = C724240Sb0.LJI(pdpBodyAssem);
                    Fragment parentFragment = fragmentLJI2 != null ? fragmentLJI2.getParentFragment() : null;
                    if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(pdpBodyAssem);
                        if (fragmentLJI3 != null && (activity = fragmentLJI3.getActivity()) != null) {
                            window2 = activity.getWindow();
                        }
                    } else {
                        window2 = window;
                    }
                    C1486180omG.LIZ(window2, new AwS392S0200000_26(pdpBodyAssem, context, 46));
                }
                PdpBodyAssem pdpBodyAssem3 = pdpBodyAssem;
                pdpBodyAssem3.LLLIIIL = true;
                C786410Ut5.LJLIIL(1000L, pdpBodyAssem3.LLLIIIIL, new ARunnableS126S0100000_26(pdpBodyAssem3, 37));
            }
        };
    }
}
