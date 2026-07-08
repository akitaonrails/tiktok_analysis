package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightGuideDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightIntroDialogFragment;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class DialogInterfaceOnCancelListenerC521720Kd8 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC521720Kd8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        String str;
        AnonymousClass0956 anonymousClass0956 = ((LightSurveyFeedbackSheet) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = ((LightSurveyFeedbackSheet) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLILZLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        SurveyViewModel surveyViewModel = ((LightSurveyFeedbackSheet) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLILZ;
        if (surveyViewModel != null) {
            surveyViewModel.EQ2();
        }
        LightSurveyFeedbackSheet lightSurveyFeedbackSheet = (LightSurveyFeedbackSheet) dialogInterfaceOnCancelListenerC521720Kd8.l0;
        if (lightSurveyFeedbackSheet.LLJI) {
            str = "submit";
        } else {
            str = "user_close";
        }
        lightSurveyFeedbackSheet.NR(C2097908Jt.LIZJ(new Pair("exit_method", str)));
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        AbstractC439520HLi abstractC439520HLi;
        InterfaceC481680Iuk interfaceC481680Iuk;
        HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragment = (HangoutRandomMatchPanelFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0;
        if (!hangoutRandomMatchPanelFragment.LLJJJJ) {
            hangoutRandomMatchPanelFragment.LLJJJJ = true;
            TuxPanel tuxPanel = hangoutRandomMatchPanelFragment.LLJJJIL;
            if (tuxPanel != null) {
                abstractC439520HLi = tuxPanel.LLJILLL;
            } else {
                abstractC439520HLi = null;
            }
            if (Intrinsics.LJFF(abstractC439520HLi, C439530HLj.LIZ)) {
                InterfaceC481680Iuk interfaceC481680Iuk2 = ((HangoutRandomMatchPanelFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLJJIII;
                if (interfaceC481680Iuk2 != null) {
                    interfaceC481680Iuk2.l();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(abstractC439520HLi, C439550HLl.LIZ) || (interfaceC481680Iuk = ((HangoutRandomMatchPanelFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLJJIII) == null) {
                return;
            }
            interfaceC481680Iuk.q();
        }
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        ((ViewerHighLightGuideDialogFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0).MR("click", "blank");
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        ((ViewerHighLightGuideDialogFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0).MR("click", "blank");
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        C0JHC c0jhcZQ2;
        PcsCourseManageVM pcsCourseManageVM = ((C0JH3) dialogInterfaceOnCancelListenerC521720Kd8.l0).LLILLL;
        if (pcsCourseManageVM != null) {
            c0jhcZQ2 = pcsCourseManageVM.zQ2();
        } else {
            c0jhcZQ2 = null;
        }
        C489110JGb.LJIIIZ(c0jhcZQ2, "cancel", "click");
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        C490770JMl.LJ(Long.valueOf(((C0JMR) dialogInterfaceOnCancelListenerC521720Kd8.l0).LIZ), "click", "cancel");
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC521720Kd8 dialogInterfaceOnCancelListenerC521720Kd8, DialogInterface dialogInterface) {
        ((ViewerHighLightIntroDialogFragment) dialogInterfaceOnCancelListenerC521720Kd8.l0).MR("click", "blank");
    }
}
