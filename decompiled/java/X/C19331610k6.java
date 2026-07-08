package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessAssem;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.10k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19331610k6 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void updateDrawState$4(C19331610k6 c19331610k6, TextPaint textPaint) {
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
                updateDrawState$3(this, textPaint);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            case 6:
                updateDrawState$6(this, textPaint);
                break;
            case 7:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C19331610k6 c19331610k6, View view) {
        String url;
        Function1 function1 = (Function1) c19331610k6.l0;
        URLSpan uRLSpan = (URLSpan) c19331610k6.l1;
        if (uRLSpan != null) {
            url = uRLSpan.getURL();
        } else {
            url = null;
        }
        function1.invoke(url);
    }

    public static final void onClick$1(C19331610k6 c19331610k6, View view) {
        ((TTKRegistrationBaseFragment) c19331610k6.l0).PR(((URLSpan) c19331610k6.l1).getURL());
    }

    public static final void onClick$2(C19331610k6 c19331610k6, View view) {
        ((GoPasswordlessAssem) c19331610k6.l0).Lo();
        C19EG c19eg = (C19EG) c19331610k6.l1;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ("https://support.tiktok.com/en/log-in-troubleshoot/log-in/log-in-with-a-passkey");
        sparkContext.LJJJZ("use_spark", "1");
        c1537900q7g.getClass();
        new C1541950qED(c19eg, sparkContext).LIZIZ();
    }

    public static final void onClick$3(C19331610k6 c19331610k6, View view) {
        String idStr;
        String str;
        C10I5 c10i5 = (C10I5) c19331610k6.l0;
        Context context = (Context) c19331610k6.l1;
        c10i5.getClass();
        if (C10I4.LIZ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LIZ(activityLIZ, c10i5.LLILLJJLI.getAid(), "video_edit_page", "");
            }
        } else if (C10I4.LIZIZ()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, c10i5.LLILLJJLI.getAid());
            smartRouteBuildRoute.open();
        } else {
            new AwS429S0200000_28(c10i5, context, 70);
        }
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        String aid = c10i5.LLILLJJLI.getAid();
        Music music = c10i5.LLILLJJLI.getMusic();
        C20515215Pi c20515215Pi = null;
        if (music != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        if (C10I5.LJIILL(c10i5.LLILLJJLI)) {
            str = "copyright";
        } else {
            str = "other";
        }
        c1458310o3J.getClass();
        C1458310o3J.LJFF(aid, idStr, "replace", str);
        c10i5.LLILZLL = true;
        C20515215Pi c20515215Pi2 = c10i5.LLILZIL;
        if (c20515215Pi2 != null) {
            c20515215Pi = c20515215Pi2;
        }
        c20515215Pi.LIZIZ();
    }

    public static final void onClick$4(C19331610k6 c19331610k6, View view) {
        String creationId;
        ((PublishDefaultPermissionFragment) c19331610k6.l0).oS();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c19331610k6.l1, "//privacy/setting/friends_list");
        smartRouteBuildRoute.withParam("enter_from", "publish");
        VideoPublishEditModel videoPublishEditModel = ((PublishDefaultPermissionFragment) c19331610k6.l0).aS().getVideoPublishEditModel();
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        smartRouteBuildRoute.withParam("creation_id", creationId);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$5(C19331610k6 c19331610k6, View view) {
        ((AgeGateFragment) c19331610k6.l0).MR(((URLSpan) c19331610k6.l1).getURL());
    }

    public static final void onClick$6(C19331610k6 c19331610k6, View view) {
        ((AgeGateCelebrationSettingFragment) c19331610k6.l0).VR(((URLSpan) c19331610k6.l1).getURL());
    }

    public static final void onClick$7(C19331610k6 c19331610k6, View view) {
        UniversalPopupAction universalPopupAction;
        String str;
        UniversalPopupBodyLinkList universalPopupBodyLinkList = (UniversalPopupBodyLinkList) c19331610k6.l0;
        if (universalPopupBodyLinkList != null && (universalPopupAction = universalPopupBodyLinkList.action) != null && (str = universalPopupAction.actionId) != null) {
            ((Function1) c19331610k6.l1).invoke(str);
        }
    }

    public static final void updateDrawState$0(C19331610k6 c19331610k6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        C844470XAv.LIZ.getClass();
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, C844470XAv.LIZ()));
    }

    public static final void updateDrawState$1(C19331610k6 c19331610k6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C19331610k6 c19331610k6, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, (Context) c19331610k6.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(62);
            textPaint.setTypeface(c444890HcV.getTypeface());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$5(C19331610k6 c19331610k6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$6(C19331610k6 c19331610k6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C19331610k6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
