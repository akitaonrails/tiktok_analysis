package X;

import Y.AObjectS356S0100000_13;
import Y.AObjectS388S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854720Xfy implements C0XTR {
    public final int $t;
    public Object l0;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
            case 3:
                onResult$3(this, i, i2, obj);
                break;
            case 4:
                onResult$4(this, i, i2, obj);
                break;
            case 5:
                onResult$5(this, i, i2, obj);
                break;
            case 6:
                onResult$6(this, i, i2, obj);
                break;
            case 7:
                onResult$7(this, i, i2, obj);
                break;
            case 8:
                onResult$8(this, i, i2, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onResult$9(this, i, i2, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onResult$10(this, i, i2, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onResult$11(this, i, i2, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onResult$12(this, i, i2, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onResult$13(this, i, i2, obj);
                break;
        }
    }

    public C854720Xfy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        ForcePhoneVerificationManager.INSTANCE.conditionalBindLoginSuccessOrCancel();
        Activity activity = (Activity) c854720Xfy.l0;
        if ((activity instanceof AuthorizeActivity) || (activity instanceof AuthorizeNewActivity)) {
            ((BaseActivity) activity).finish();
        }
    }

    public static final void onResult$1(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i2 == 1) {
            BindOrModifyPhoneActivity bindOrModifyPhoneActivity = (BindOrModifyPhoneActivity) ((InputPhoneFragment) c854720Xfy.l0).getActivity();
            bindOrModifyPhoneActivity.LLILZLL = true;
            bindOrModifyPhoneActivity.LLIZ = (Bundle) obj;
            bindOrModifyPhoneActivity.LLIZLLLIL = Integer.valueOf(i);
            bindOrModifyPhoneActivity.finish();
        }
    }

    public static final void onResult$10(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("platform", "phone", bundle);
            if (obj instanceof C851860XbM) {
                JSONObject jSONObject = new JSONObject(((C851860XbM) obj).LIZIZ);
                C852810Xct c852810Xct = C852810Xct.LIZ;
                String strOptString = jSONObject.optString("ticket", "");
                c852810Xct.getClass();
                C852810Xct.LJIJJ(bundle, strOptString);
            }
            C19EG activity = ((ChangeEmailFragment) c854720Xfy.l0).getActivity();
            if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
                commonFlowActivity.LLLZLZ(i, bundle);
            }
        }
    }

    public static final void onResult$11(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("platform", "phone", bundle);
            JSONObject jSONObject = new JSONObject(((C851860XbM) obj).LIZIZ);
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String strOptString = jSONObject.optString("ticket", "");
            c852810Xct.getClass();
            C852810Xct.LJIJJ(bundle, strOptString);
            C19EG activity = ((ConfirmEmailFragment) c854720Xfy.l0).getActivity();
            if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
                commonFlowActivity.LLLZLZ(i, bundle);
            }
        }
    }

    public static final void onResult$12(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i2 == 1) {
            VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) c854720Xfy.l0;
            Bundle arguments = verifyEmailCodeFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            verifyEmailCodeFragment.WR(arguments);
        }
    }

    public static final void onResult$13(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i2 != 1) {
            ((BaseOTLIntentHandlerActivity) c854720Xfy.l0).LLLZIL(false);
        }
    }

    public static final void onResult$2(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i2 == 1) {
            VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) c854720Xfy.l0;
            Bundle arguments = verifyEmailCodeFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            verifyEmailCodeFragment.WR(arguments);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResult$3(X.C854720Xfy r15, int r16, int r17, java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C854720Xfy.onResult$3(X.0Xfy, int, int, java.lang.Object):void");
    }

    public static final void onResult$4(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        Class<? extends Activity> mainActivityClass;
        if (i == 1 && i2 == 1) {
            Intent intentLIZ = C848610XQt.LIZ(((Activity) c854720Xfy.l0).getIntent());
            IDeeplinkSdkService iDeeplinkSdkService = (IDeeplinkSdkService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkSdkService.class, false, false, false, 14, null);
            if (iDeeplinkSdkService != null) {
                iDeeplinkSdkService.LIZIZ((Activity) c854720Xfy.l0, intentLIZ, false, new C1962707mT(false, intentLIZ, "saf_require_login", null, null, null, null, null, 248));
                return;
            }
            return;
        }
        if (!((Activity) c854720Xfy.l0).isFinishing() && !((Activity) c854720Xfy.l0).isDestroyed()) {
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (iMainService != null) {
                mainActivityClass = iMainService.getMainActivityClass();
            } else {
                mainActivityClass = null;
            }
            Intent intent = new Intent((Activity) c854720Xfy.l0, mainActivityClass);
            intent.putExtra("from_require_login", true);
            intent.setFlags(268468224);
            Activity activity = (Activity) c854720Xfy.l0;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+nisb6k2v/7DheZ5JAy0YDBLp6E=", null));
            Activity activity2 = (Activity) c854720Xfy.l0;
            if (activity2 instanceof DeepLinkActivityV2) {
                ((C199Y) activity2).finish();
            }
        }
    }

    public static final void onResult$5(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        Function1<Integer, Unit> function1 = ((C848800XRm) c854720Xfy.l0).LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    public static final void onResult$6(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            SmartRouter.buildRoute((Context) c854720Xfy.l0, "//contentpreference").open();
        }
    }

    public static final void onResult$7(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        Bundle bundle = (Bundle) c854720Xfy.l0;
        if (i2 == 1) {
            bundle.putBoolean("should_force_logout", true);
            if ((obj instanceof Bundle) && ((BaseBundle) obj).getBoolean("ocl_checkbox_checked")) {
                ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIL(C0XWD.LOGOUT, "settings_page", "logout_page", new AObjectS388S0100000_13(bundle, 4), new AObjectS356S0100000_13(bundle, 2));
            } else {
                C0XQ7.LIZJ().logoutWithLoadingIndicator("user_logout", "user_logout", bundle, null);
            }
        }
    }

    public static final void onResult$8(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        if (i == EnumC852660Xce.VERIFY.getValue() && i2 == 1) {
            ((InterfaceC849390XTt) c854720Xfy.l0).LIZ();
        } else {
            ((InterfaceC849390XTt) c854720Xfy.l0).LIZIZ();
        }
    }

    public static final void onResult$9(C854720Xfy c854720Xfy, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            C19EG activity = ((BindEmailFragment) c854720Xfy.l0).getActivity();
            if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
                commonFlowActivity.LLLZLZ(i, null);
            }
        }
    }
}
