package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19225510Jh implements Function1 {
    public final /* synthetic */ C1846400y9G LL;
    public final /* synthetic */ Challenge LLILLJJLI;

    public /* synthetic */ C19225510Jh(C1846400y9G c1846400y9G, Challenge challenge) {
        this.LL = c1846400y9G;
        this.LLILLJJLI = challenge;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1846400y9G c1846400y9G = this.LL;
        Challenge challenge = this.LLILLJJLI;
        SpannableString spannableString = (SpannableString) obj;
        final Context context = c1846400y9G.LIZ.getContext();
        final String cid = challenge.getCid();
        final String challengeName = challenge.getChallengeName();
        String string = spannableString.toString();
        Matcher matcher = C2273441Dyg.LIZ.matcher(string);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            final String string2 = string.subSequence(iStart, iEnd).toString();
            if (C2431009fo.LIZJ(string2)) {
                C786410Ut5.p2(spannableString, new ClickableSpan(context, string2, cid, challengeName) { // from class: X.0HjR
                    public static final /* synthetic */ int LLILZIL = 0;
                    public final String LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;
                    public final Context LLILZ;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("tag_id", this.LLILLJJLI);
                        C20684815ws.LJIILLIIL("click_tag_link", c2344009Gk.LIZ);
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLJFF, "aweme://ame/webview/");
                            smartRouteBuildRoute.withParam(UriProtector.parse(this.LL));
                            smartRouteBuildRoute.withParam("show_load_dialog", false);
                            smartRouteBuildRoute.withParam("hide_nav_bar", false);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("#");
                            sbLIZ.append(this.LLILLL);
                            smartRouteBuildRoute.withParam("title", C2188811AlT.LIZIZ(sbLIZ));
                            smartRouteBuildRoute.open();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(C446980Hfs.LIZ(this.LLILZ, R.color.o3));
                    }

                    {
                        this.LLILZ = context;
                        this.LL = string2;
                        this.LLILLJJLI = cid;
                        this.LLILLL = challengeName;
                    }
                }, iStart, iEnd, 17);
            }
        }
        final C19225410Jg c19225410Jg = new C19225410Jg(c1846400y9G.LIZ.getContext(), challenge.getCid(), challenge.getChallengeName());
        String string3 = spannableString.toString();
        Pattern pattern = C2273441Dyg.LIZ;
        if (pattern.matcher(string3).find()) {
            String string4 = spannableString.toString();
            Matcher matcher2 = pattern.matcher(string4);
            while (matcher2.find()) {
                int iStart2 = matcher2.start();
                int iEnd2 = matcher2.end();
                final String string5 = string4.subSequence(iStart2, iEnd2).toString();
                C786410Ut5.p2(spannableString, new StyleSpan(0), iStart2, iEnd2, 17);
                final int iIntValue = C1308910kAL.LIZJ(R.attr.a1h, c19225410Jg.LIZJ).intValue();
                final int iIntValue2 = C1308910kAL.LIZJ(R.attr.a1h, c19225410Jg.LIZJ).intValue();
                C786410Ut5.p2(spannableString, new AbstractC431340Gvk(iIntValue, iIntValue2) { // from class: X.10Jf
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C19225410Jg c19225410Jg2 = c19225410Jg;
                        String strLIZIZ = string5;
                        c19225410Jg2.getClass();
                        if (!C2431009fo.LIZJ(strLIZIZ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("http://");
                            sbLIZ.append(strLIZIZ);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("tag_id", c19225410Jg2.LIZ);
                        C20684815ws.LJIILLIIL("click_tag_link", c2344009Gk.LIZ);
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLJFF, "aweme://ame/webview/");
                            smartRouteBuildRoute.withParam(UriProtector.parse(strLIZIZ));
                            smartRouteBuildRoute.withParam("show_load_dialog", false);
                            smartRouteBuildRoute.withParam("hide_nav_bar", false);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("#");
                            sbLIZ2.append(c19225410Jg2.LIZIZ);
                            smartRouteBuildRoute.withParam("title", C2188811AlT.LIZIZ(sbLIZ2));
                            smartRouteBuildRoute.open();
                        }
                    }
                }, iStart2, iEnd2, 17);
            }
        }
        return spannableString;
    }
}
