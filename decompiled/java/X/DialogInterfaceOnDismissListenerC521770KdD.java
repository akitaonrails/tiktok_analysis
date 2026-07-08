package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.widget.LiveDetectInfoView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class DialogInterfaceOnDismissListenerC521770KdD implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Exception {
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
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onDismiss$12(this, dialogInterface);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onDismiss$13(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC521770KdD(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public DialogInterfaceOnDismissListenerC521770KdD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        String str;
        AnonymousClass0956 anonymousClass0956 = ((LightSurveyFeedbackSheet) dialogInterfaceOnDismissListenerC521770KdD.l0).LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = ((LightSurveyFeedbackSheet) dialogInterfaceOnDismissListenerC521770KdD.l0).LLILZLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        SurveyViewModel surveyViewModel = ((LightSurveyFeedbackSheet) dialogInterfaceOnDismissListenerC521770KdD.l0).LLILZ;
        if (surveyViewModel != null) {
            surveyViewModel.EQ2();
        }
        LightSurveyFeedbackSheet lightSurveyFeedbackSheet = (LightSurveyFeedbackSheet) dialogInterfaceOnDismissListenerC521770KdD.l0;
        if (lightSurveyFeedbackSheet.LLJI) {
            str = "submit";
        } else {
            str = "user_close";
        }
        lightSurveyFeedbackSheet.NR(C2097908Jt.LIZJ(new Pair("exit_method", str)));
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        C439540HLk c439540HLk;
        HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragment = (HangoutRandomMatchPanelFragment) dialogInterfaceOnDismissListenerC521770KdD.l0;
        if (!hangoutRandomMatchPanelFragment.LLJJJJ) {
            TuxPanel tuxPanel = hangoutRandomMatchPanelFragment.LLJJJIL;
            if (tuxPanel != null) {
                c439540HLk = tuxPanel.LLJJ;
            } else {
                c439540HLk = null;
            }
            if (Intrinsics.LJFF(c439540HLk, C439540HLk.LIZ)) {
                InterfaceC481680Iuk interfaceC481680Iuk = ((HangoutRandomMatchPanelFragment) dialogInterfaceOnDismissListenerC521770KdD.l0).LLJJIII;
                if (interfaceC481680Iuk != null) {
                    interfaceC481680Iuk.m();
                }
            } else {
                InterfaceC481680Iuk interfaceC481680Iuk2 = ((HangoutRandomMatchPanelFragment) dialogInterfaceOnDismissListenerC521770KdD.l0).LLJJIII;
                if (interfaceC481680Iuk2 != null) {
                    interfaceC481680Iuk2.p();
                }
            }
        }
        ((HangoutRandomMatchPanelFragment) dialogInterfaceOnDismissListenerC521770KdD.l0).LLJJJJ = false;
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C1106110etF) dialogInterfaceOnDismissListenerC521770KdD.l0).LLJIJIL.zW(ToolBarShareVisibleChannel.class, Boolean.FALSE);
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$12(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$13(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((CompletionBlock) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0KVX.class, null), "");
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((LiveDetectInfoView) dialogInterfaceOnDismissListenerC521770KdD.l0).LLIZLLLIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) throws Exception {
        Dialog dialog;
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) dialogInterfaceOnDismissListenerC521770KdD.l0).element;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            C2211631BhB.LIZIZ(dialog);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        Runnable runnable = (Runnable) dialogInterfaceOnDismissListenerC521770KdD.l0;
        C1C7U.LIZ("ExceptionUtils@db8a.displayAlert$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("ExceptionUtils@db8a.displayAlert$1L");
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C19489311Mt) dialogInterfaceOnDismissListenerC521770KdD.l0).onSuccess(Boolean.TRUE);
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC521770KdD dialogInterfaceOnDismissListenerC521770KdD, DialogInterface dialogInterface) {
        ((C475870IlN) dialogInterfaceOnDismissListenerC521770KdD.l0).notifyDataSetChanged();
    }
}
