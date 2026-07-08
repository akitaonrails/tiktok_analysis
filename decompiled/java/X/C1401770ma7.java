package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ma7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401770ma7 extends ClickableSpan {
    public final int $t;
    public Object l0;

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
                textPaint.setUnderlineText(false);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            case 3:
            default:
                super.updateDrawState(textPaint);
                break;
            case 4:
                updateDrawState$3(this, textPaint);
                break;
        }
    }

    public C1401770ma7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1401770ma7 c1401770ma7, View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "challenge");
        c2344009Gk.LJIIIIZZ("secuid", ((C19417710xz) c1401770ma7.l0).getMChallenge().getAuthor().getSecUid());
        c2344009Gk.LJIIIIZZ("page_type", "challenge");
        c2344009Gk.LJIIIIZZ("tag_id", ((C19417710xz) c1401770ma7.l0).getMChallenge().getCid());
        C20684815ws.LJIILLIIL("click_account_button", c2344009Gk.LIZ);
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", ((C19417710xz) c1401770ma7.l0).getMChallenge().getAuthor().getUid());
        smartRouteBuildRoute.withParam("sec_user_id", ((C19417710xz) c1401770ma7.l0).getMChallenge().getAuthor().getSecUid());
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(C1401770ma7 c1401770ma7, View view) {
        ((C1355450lNP) c1401770ma7.l0).getClass();
        C1355450lNP.LJFF();
    }

    public static final void onClick$2(C1401770ma7 c1401770ma7, View view) {
        C1348710lCX c1348710lCX = C1348710lCX.LIZ;
        Context context = (Context) c1401770ma7.l0;
        c1348710lCX.getClass();
        C1348710lCX.LIZJ(context, "cmt_zone_bottom_banner");
    }

    public static final void onClick$3(C1401770ma7 c1401770ma7, View view) {
        ((Function0) c1401770ma7.l0).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$4(X.C1401770ma7 r8, android.view.View r9) {
        /*
            java.lang.Object r2 = r8.l0
            android.content.Context r2 = (android.content.Context) r2
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            java.lang.String r4 = r0.getAppLanguage()
            int r1 = r4.hashCode()
            r0 = -1295825987(0xffffffffb2c343bd, float:-2.2731792E-8)
            java.lang.String r3 = "es-419"
            if (r1 == r0) goto L5d
            r0 = 3246(0xcae, float:4.549E-42)
            if (r1 == r0) goto L54
            r0 = 3276(0xccc, float:4.59E-42)
            if (r1 != r0) goto L27
            java.lang.String r0 = "fr"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L29
        L27:
            java.lang.String r4 = "en"
        L29:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme://roma_redirect/?spark_page=asset-ecosystem-inapp-content&slug="
            r1.append(r0)
            com.ss.android.ugc.tools.chat.experiment.AiChatSettings r0 = X.C342380DbY.LIZ()
            java.lang.String r0 = r0.learnMoreSlug
            r1.append(r0)
            java.lang.String r0 = "&locale="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "&theme=dark"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r2, r0)
            r0.open()
            return
        L54:
            java.lang.String r0 = "es"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L64
            goto L27
        L5d:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L64
            goto L27
        L64:
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r4 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L8e
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L8e
            android.app.Application r0 = X.C0CHQ.LIZ
            java.util.Locale r0 = r1.LJIJJLI(r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.toLanguageTag()
        L86:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L27
            r4 = r3
            goto L29
        L8e:
            r0 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401770ma7.onClick$4(X.0ma7, android.view.View):void");
    }

    public static final void updateDrawState$0(C1401770ma7 c1401770ma7, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1k, ((C19417710xz) c1401770ma7.l0).getContext()));
    }

    public static final void updateDrawState$3(C1401770ma7 c1401770ma7, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) c1401770ma7.l0);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }
}
