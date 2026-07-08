package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceInteractionFragmentV2;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnDismissListenerC786070UsX implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC786070UsX dialogInterfaceOnDismissListenerC786070UsX, DialogInterface dialogInterface) {
        GameDualDeviceInteractionFragmentV2 gameDualDeviceInteractionFragmentV2 = (GameDualDeviceInteractionFragmentV2) dialogInterfaceOnDismissListenerC786070UsX.l0;
        if (gameDualDeviceInteractionFragmentV2.LLJLILLLLZIIL == ((LiveDialogFragment) dialogInterfaceOnDismissListenerC786070UsX.l1)) {
            gameDualDeviceInteractionFragmentV2.LLJLILLLLZIIL = null;
        }
        if (gameDualDeviceInteractionFragmentV2.LLJZ) {
            gameDualDeviceInteractionFragmentV2.ZR(0.5f, 0, -1, 0);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC786070UsX dialogInterfaceOnDismissListenerC786070UsX, DialogInterface dialogInterface) {
        ((DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC786070UsX.l0).onDismiss(dialogInterface);
        VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = (VideoViewHistoryAuthorizationFragment) dialogInterfaceOnDismissListenerC786070UsX.l1;
        videoViewHistoryAuthorizationFragment.getClass();
        C19EG activity = videoViewHistoryAuthorizationFragment.getActivity();
        if (activity != null) {
            activity.hashCode();
        }
        C1440005kM.LIZ(new C745620TMq(0));
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC786070UsX dialogInterfaceOnDismissListenerC786070UsX, DialogInterface dialogInterface) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        ((DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC786070UsX.l0).onDismiss(dialogInterface);
        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = (VideoViewHistoryAuthorizationFragmentV2) dialogInterfaceOnDismissListenerC786070UsX.l1;
        videoViewHistoryAuthorizationFragmentV2.getClass();
        String str6 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ)) {
            str = "close";
        } else if (abstractC343940De4LJIIJJI instanceof AbstractC745580TMm) {
            str = "save";
        } else {
            str = "leave_page";
        }
        C19EG activity = videoViewHistoryAuthorizationFragmentV2.getActivity();
        if (activity != null) {
            activity.hashCode();
        }
        C1440005kM.LIZ(new C745620TMq(0));
        String str7 = videoViewHistoryAuthorizationFragmentV2.LLJ;
        Boolean bool = videoViewHistoryAuthorizationFragmentV2.LLJIJIL;
        Boolean bool2 = Boolean.TRUE;
        String str8 = "auto_scene";
        if (Intrinsics.LJFF(bool, bool2)) {
            str2 = "auto_scene";
        } else {
            str2 = "click_bar";
        }
        if (videoViewHistoryAuthorizationFragmentV2.LLJILJILJ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C1350920lG6.LJIL("video_views_pop_up_click", str7, str2, str, str3, videoViewHistoryAuthorizationFragmentV2.PR(), "one_button", null, null, 384);
        if (!videoViewHistoryAuthorizationFragmentV2.LLJI) {
            if (!Intrinsics.LJFF(videoViewHistoryAuthorizationFragmentV2.LLJIJIL, bool2)) {
                str8 = "click_bar";
            }
            VideoViewAuthorizationViewModel videoViewAuthorizationViewModelSR = videoViewHistoryAuthorizationFragmentV2.SR();
            String str9 = videoViewHistoryAuthorizationFragmentV2.LLJILJIL;
            int i2 = 1;
            if (videoViewHistoryAuthorizationFragmentV2.LLJILJILJ) {
                i = 1;
            } else {
                i = 2;
            }
            boolean zLJFF = Intrinsics.LJFF(videoViewHistoryAuthorizationFragmentV2.LLJIJIL, bool2);
            String str10 = videoViewHistoryAuthorizationFragmentV2.LLJ;
            if (str10 == null) {
                str10 = "";
            }
            videoViewAuthorizationViewModelSR.xQ2(str9, str10, str8, str, "two_button", i, zLJFF);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDismiss ");
            if (!videoViewHistoryAuthorizationFragmentV2.LLJILJILJ) {
                i2 = 2;
            }
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (videoViewHistoryAuthorizationFragmentV2.SR().wQ2()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (Intrinsics.LJFF(videoViewHistoryAuthorizationFragmentV2.LLJ, "personal_homepage")) {
                    str4 = "video_views_page_self";
                } else {
                    str4 = "video_views_page_others";
                }
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                if (videoViewHistoryAuthorizationFragmentV2.LLJILJILJ) {
                    str5 = "on";
                } else {
                    str5 = "off";
                }
                c2344009Gk.LJIIIIZZ("to_status", str5);
                c2344009Gk.LJIIIIZZ("action", "change_status");
                C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk.LIZ);
            }
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC786070UsX dialogInterfaceOnDismissListenerC786070UsX, DialogInterface dialogInterface) {
        Fragment fragmentLIZ;
        ((Function0) dialogInterfaceOnDismissListenerC786070UsX.l0).invoke();
        String str = TuxSheet._pnsPageId;
        if (!(C1391190mJ3.LJIIJJI(dialogInterface) instanceof C745590TMn) && (fragmentLIZ = C946803n0.LIZ((View) dialogInterfaceOnDismissListenerC786070UsX.l1)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
            c1389890mGx.LJIIIZ(2131822449);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC786070UsX dialogInterfaceOnDismissListenerC786070UsX, DialogInterface dialogInterface) {
        if (!((C013C) dialogInterfaceOnDismissListenerC786070UsX.l0).element) {
            ((C750510TcH) dialogInterfaceOnDismissListenerC786070UsX.l1).LJIIIZ();
        }
    }

    public DialogInterfaceOnDismissListenerC786070UsX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
