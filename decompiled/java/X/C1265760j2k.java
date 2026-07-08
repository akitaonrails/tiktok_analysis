package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0j2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265760j2k extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void onClick$1(C1265760j2k c1265760j2k, View view) {
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
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                textPaint.setUnderlineText(false);
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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1265760j2k(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1265760j2k c1265760j2k, View view) {
        ComplianceServiceProvider.LJFF().jumpToAgsStatusPage((Context) c1265760j2k.l0, "float_comment");
    }

    public static final void onClick$2(C1265760j2k c1265760j2k, View view) {
        Context context = ((BottomMusicShootCommentAssem) c1265760j2k.l0).getContext();
        if (context != null) {
            ComplianceServiceProvider.LJFF().jumpToAgsStatusPage(context, "float_comment");
        }
    }

    public static final void onClick$3(C1265760j2k c1265760j2k, View view) {
        String str;
        BrandedContentToolSchema brandedContentToolSchemaLIZ = C1209830haX.LIZ();
        if (brandedContentToolSchemaLIZ == null || (str = brandedContentToolSchemaLIZ.brandedContentPolicy) == null) {
            str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c1265760j2k.l0, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", UriProtector.parse(str).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", "general").build().toString());
        smartRouteBuildRoute.open();
    }

    public static final void updateDrawState$1(C1265760j2k c1265760j2k, TextPaint textPaint) {
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) c1265760j2k.l0;
        baseMyProfileGuideWidget.getClass();
        textPaint.setColor(C960203pA.LIZ(R.attr.a04, C1745060vVo.LIZ(baseMyProfileGuideWidget)));
        textPaint.setUnderlineText(false);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$3(C1265760j2k c1265760j2k, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.e1, (Context) c1265760j2k.l0));
        textPaint.setUnderlineText(false);
    }
}
