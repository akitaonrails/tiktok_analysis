package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordFragment;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0P47, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P47 extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C0P47 c0p47) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        TakoRecordFragmentViewModel takoRecordFragmentViewModelSR = ((TakoRecordFragment) c0p47.l0).SR();
        if (takoRecordFragmentViewModelSR.getState().LLILLJJLI.LIZ != null) {
            takoRecordFragmentViewModelSR.wQ2(!takoRecordFragmentViewModelSR.LLIZ);
            takoRecordFragmentViewModelSR.setState(AFwS240S0000000_9.get$arr$(928));
            return;
        }
        TakoRecordFragmentViewModel takoRecordFragmentViewModelSR2 = ((TakoRecordFragment) c0p47.l0).SR();
        BottomSheetBehavior<View> bottomSheetBehavior2 = takoRecordFragmentViewModelSR2.LLILLJJLI;
        if ((bottomSheetBehavior2 != null && bottomSheetBehavior2.getState() == 3) || ((bottomSheetBehavior = takoRecordFragmentViewModelSR2.LLILLJJLI) != null && bottomSheetBehavior.getState() == 4)) {
            BottomSheetBehavior<View> bottomSheetBehavior3 = takoRecordFragmentViewModelSR2.LLILLJJLI;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.setState(5);
            }
            takoRecordFragmentViewModelSR2.setState(AFwS240S0000000_9.get$arr$(927));
            return;
        }
        C19EG activity = ((TakoRecordFragment) c0p47.l0).getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public static final void LIZIZ$1(C0P47 c0p47) {
        String str;
        if (((BulletinPageFragment) c0p47.l0).UR().isFullScreen()) {
            ((BulletinPageFragment) c0p47.l0).UR().setState(new AwS588S0100000_9(C0OSF.NORMAL, 534));
            C0OPQ c0opq = C0OPQ.LIZ;
            BulletinPageFragment bulletinPageFragment = (BulletinPageFragment) c0p47.l0;
            long j = bulletinPageFragment.LLIZ;
            boolean z = ((BulletinEditViewModel) bulletinPageFragment.LLJJ.getValue()).LLILZ;
            if (((BulletinEditViewModel) ((BulletinPageFragment) c0p47.l0).LLJJ.getValue()).LLIZLLLIL) {
                str = ((BulletinEditViewModel) ((BulletinPageFragment) c0p47.l0).LLJJ.getValue()).LLIZ;
            } else {
                str = null;
            }
            Map<String, String> map = ((BulletinEditViewModel) ((BulletinPageFragment) c0p47.l0).LLJJ.getValue()).LLILZIL;
            c0opq.getClass();
            C0OPQ.LJJIJ(j, "return", str, map, z);
            return;
        }
        c0p47.LJFF(false);
        ((BulletinPageFragment) c0p47.l0).requireActivity().getOnBackPressedDispatcher().LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P47(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
