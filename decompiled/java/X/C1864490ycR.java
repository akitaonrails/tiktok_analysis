package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeQAFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragmentViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditFragment;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS113S0110000_27;

/* JADX INFO: renamed from: X.0ycR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864490ycR extends AbstractC2173821A5s {
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
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
            case 6:
                LIZIZ$6(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1864490ycR c1864490ycR) {
        ((MultiGuestConnectDistributeFragment) c1864490ycR.l0).NR();
    }

    public static final void LIZIZ$1(C1864490ycR c1864490ycR) {
        MultiGuestConnectDistributeQAFragment multiGuestConnectDistributeQAFragment = (MultiGuestConnectDistributeQAFragment) c1864490ycR.l0;
        multiGuestConnectDistributeQAFragment.getClass();
        C20441214yg.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", "handleOnBackPressed");
        multiGuestConnectDistributeQAFragment.NR().setState(new AwS113S0110000_27(EnumC1778380wNY.STATUS_SETTING_PAGE, false, 7));
    }

    public static final void LIZIZ$2(C1864490ycR c1864490ycR) {
        if (((MultiGuestLiveSettingDialog) c1864490ycR.l0).getChildFragmentManager().LJJLIIIIJ() > 0) {
            ((MultiGuestLiveSettingDialog) c1864490ycR.l0).getChildFragmentManager().LJLLILLLL();
        } else {
            c1864490ycR.LJFF(false);
            ((MultiGuestLiveSettingDialog) c1864490ycR.l0).requireActivity().onBackPressed();
        }
    }

    public static final void LIZIZ$3(C1864490ycR c1864490ycR) {
        FragmentManager supportFragmentManager;
        C19EG activity = ((PreviewPhotoFragment) c1864490ycR.l0).getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJLLILLLL();
        }
    }

    public static final void LIZIZ$4(C1864490ycR c1864490ycR) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        C1561230qjJ.LIZ.getClass();
        if (C1561230qjJ.LIZ()) {
            TakoImageCreateFragmentViewModel takoImageCreateFragmentViewModelVR = ((TakoImageCreateFragment) c1864490ycR.l0).VR();
            BottomSheetBehavior<View> bottomSheetBehavior2 = takoImageCreateFragmentViewModelVR.LLILLJJLI;
            if ((bottomSheetBehavior2 != null && bottomSheetBehavior2.getState() == 3) || ((bottomSheetBehavior = takoImageCreateFragmentViewModelVR.LLILLJJLI) != null && bottomSheetBehavior.getState() == 4)) {
                BottomSheetBehavior<View> bottomSheetBehavior3 = takoImageCreateFragmentViewModelVR.LLILLJJLI;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.setState(5);
                }
                takoImageCreateFragmentViewModelVR.setState(AFwS240S0000000_9.get$arr$(975));
                return;
            }
            ((TakoImageCreateFragment) c1864490ycR.l0).SR(10001);
            return;
        }
        ((TakoImageCreateFragment) c1864490ycR.l0).SR(10001);
    }

    public static final void LIZIZ$5(C1864490ycR c1864490ycR) {
        C19EG activity = ((TakoImageEditFragment) c1864490ycR.l0).getActivity();
        if (activity != null) {
            C2204961BRm.LLJJJ(activity, 10001, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcUL93MSPufveHmvHesfuUlNXDDEYy8mQ6NPXq", null));
        }
        ((TakoImageEditFragment) c1864490ycR.l0).finish();
    }

    public static final void LIZIZ$6(C1864490ycR c1864490ycR) {
        ((C20134113qF) c1864490ycR.l0).LJIIZILJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864490ycR(C20134113qF c20134113qF, int i) {
        super(false);
        this.$t = i;
        this.l0 = c20134113qF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864490ycR(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864490ycR(MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment, boolean z, int i) {
        super(z);
        this.$t = i;
        this.l0 = multiGuestConnectDistributeFragment;
    }
}
