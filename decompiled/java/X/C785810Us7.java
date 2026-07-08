package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveReplayFaqSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LiveAiSummaryDescSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLearnMoreFragment;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Us7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785810Us7 extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$1(C785810Us7 c785810Us7, TextPaint textPaint) {
    }

    public static final void updateDrawState$4(C785810Us7 c785810Us7, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            case 3:
                textPaint.setUnderlineText(false);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            case 6:
                textPaint.setUnderlineText(false);
                break;
            case 7:
                updateDrawState$7(this, textPaint);
                break;
            case 8:
                updateDrawState$8(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C785810Us7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C785810Us7 c785810Us7, View view) {
        C781270Ukn.LJIILIIL().YC1(((PreviewReplayWidget) c785810Us7.l0).context, LiveReplayFaqSetting.INSTANCE.getValue(), null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_faq_enter_click");
        c474500IjALIZ.LJJII("livetake_page", "event_page");
        c474500IjALIZ.LIZ();
        ((PreviewReplayWidget) c785810Us7.l0).P1("1");
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            ((PreviewReplayWidget) c785810Us7.l0).L1();
        }
    }

    public static final void onClick$1(C785810Us7 c785810Us7, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C16F5) c785810Us7.l0).getContext(), "//privacy/setting/friends_list");
        smartRouteBuildRoute.withParam("enter_from", "live");
        smartRouteBuildRoute.open();
    }

    public static final void onClick$2(C785810Us7 c785810Us7, View view) {
        SmartRouter.buildRoute((Context) c785810Us7.l0, "aweme://privacy/setting").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "personal_favourite_page");
        C20684815ws.LJIILLIIL("enter_privacy_setting", c2344009Gk.LIZ);
    }

    public static final void onClick$3(C785810Us7 c785810Us7, View view) {
        ManageByParentIntermediateActivity manageByParentIntermediateActivity = (ManageByParentIntermediateActivity) c785810Us7.l0;
        ComplianceServiceProvider.LJIIJJI().LJIILIIL();
        SmartRouter.buildRoute(manageByParentIntermediateActivity, "aweme://roma_redirect/?spark_page=fp_teen_page&enter_from=settings&wellbeing_challenge_enter_from=family_pairing_page").open();
    }

    public static final void onClick$4(C785810Us7 c785810Us7, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((LiveAiSummaryDescSheet) c785810Us7.l0, C343970De7.LIZ);
        ((LiveAiSummaryDescSheet) c785810Us7.l0).MR(2);
        Map<String, String> mapNR = ((LiveAiSummaryDescSheet) c785810Us7.l0).NR();
        mapNR.put("click_status", "-1");
        C20684815ws.LJIILLIIL("livesdk_summary_feedback_click", mapNR);
        C0U4R c0u4r = new C0U4R();
        c0u4r.LJII = C475510Ikn.LJ((LiveAiSummaryDescSheet) c785810Us7.l0);
        c0u4r.LIZJ = "ttlive_AIsummary_toastReported";
        c0u4r.LIZLLL = 2131851027;
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
    }

    public static final void onClick$5(C785810Us7 c785810Us7, View view) {
        String strT2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://support.tiktok.com/");
        C1070520dxq.LIZ.getClass();
        ILanguageService iLanguageService = (ILanguageService) PluggableExtentionKt.pluggableSpi$default(ILanguageService.class, false, false, false, 14, null);
        if (iLanguageService == null || (strT2 = iLanguageService.getAppLanguage()) == null) {
            strT2 = C786410Ut5.t2(Locale.getDefault());
        }
        if (Intrinsics.LJFF(strT2, "he")) {
            strT2 = "he_IL";
        } else if (Intrinsics.LJFF(strT2, "zh-Hant")) {
            strT2 = "zh-Hant-TW";
        }
        sbLIZ.append(strT2);
        sbLIZ.append("/account-and-privacy/account-privacy-settings/link-your-email-on-android-devices");
        Uri uriBuild = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", C2188811AlT.LIZIZ(sbLIZ)).build();
        IBulletService iBulletService = (IBulletService) PluggableExtentionKt.pluggableSpi$default(IBulletService.class, false, false, false, 14, null);
        if (iBulletService != null) {
            iBulletService.LIZ((Context) c785810Us7.l0, uriBuild.toString());
        }
    }

    public static final void onClick$6(C785810Us7 c785810Us7, View view) {
        C746350TPl.LIZ.LJII().LJ(Boolean.TRUE);
        SmartRouter.buildRoute((Context) c785810Us7.l0, "aweme://privacy/setting").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "personal_favourite_page");
        C20684815ws.LJIILLIIL("enter_privacy_setting", c2344009Gk.LIZ);
    }

    public static final void onClick$7(C785810Us7 c785810Us7, View view) {
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(((C1833380xoG) c785810Us7.l0).LIZ, true);
        if (fragmentManagerLJIL != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = new AutoPostLearnMoreFragment();
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.show(fragmentManagerLJIL, "auto_post_learn_more");
        }
    }

    public static final void onClick$8(C785810Us7 c785810Us7, View view) {
        String lowerCase;
        Context context = ((C19660211w0) c785810Us7.l0).LLILZLL;
        if (context != null) {
            Uri.Builder builderAuthority = new Uri.Builder().scheme("sslocal").authority("webview_popup");
            String appLanguage = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
            String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
            if (storeRegionUpperCase != null) {
                lowerCase = storeRegionUpperCase.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://www.tiktok.com/in_app/redirect?region=");
            sbLIZ.append(lowerCase);
            sbLIZ.append("&language=");
            sbLIZ.append(appLanguage);
            sbLIZ.append("&projectKey=privacy-policy");
            String string = builderAuthority.appendQueryParameter("url", C2188811AlT.LIZIZ(sbLIZ)).appendQueryParameter("height", "80%").appendQueryParameter("target_handler", "webcast").appendQueryParameter("show_title_bar", "1").appendQueryParameter("title", context.getString(R.string.raj)).appendQueryParameter("show_title_close", "1").appendQueryParameter("show_title_share", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("container_bg_color", "FFFFFF").build().toString();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().Cw(sparkContext);
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public static final void updateDrawState$0(C785810Us7 c785810Us7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$5(C785810Us7 c785810Us7, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1j, (Context) c785810Us7.l0));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$7(C785810Us7 c785810Us7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C1383370m6R.LJFF(R.attr.a1j));
    }

    public static final void updateDrawState$8(C785810Us7 c785810Us7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
