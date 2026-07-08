package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347490lAZ {
    public static final C1347490lAZ LIZ = new C1347490lAZ();
    public static final Keva LIZIZ = Keva.getRepo("comment_safety_storage");

    public static boolean LIZIZ(String str, String str2) {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interacted_timestamp_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        C1387320mCo c1387320mCoLIZJ = C1387310mCn.LIZJ();
        if (j >= c1387320mCoLIZJ.LIZ && j <= c1387320mCoLIZJ.LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[PHI: r2
      0x0015: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:10:0x0013, B:8:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r5, int r6, boolean r7) {
        /*
            boolean r0 = X.C306520Bzu.LIZ()
            r4 = 0
            if (r0 == 0) goto L8
            return r4
        L8:
            java.lang.String r3 = ""
            if (r5 == 0) goto L12
            java.lang.String r2 = r5.getAid()
            if (r2 != 0) goto L15
        L12:
            r2 = r3
            if (r5 == 0) goto L1c
        L15:
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            if (r0 == 0) goto L1c
            r3 = r0
        L1c:
            int r0 = r2.length()
            r1 = 1
            if (r0 == 0) goto L47
            int r0 = r3.length()
            if (r0 == 0) goto L47
            boolean r0 = X.C729980SkG.LJIIIIZZ(r5)
            if (r0 == 0) goto L47
            if (r7 == 0) goto L47
            if (r6 == 0) goto L46
            r0 = 2
            if (r6 == r0) goto L46
            r0 = 3
            if (r6 == r0) goto L3b
            if (r6 != r1) goto L47
        L3b:
            X.0lAZ r0 = X.C1347490lAZ.LIZ
            r0.getClass()
            boolean r0 = LIZIZ(r2, r3)
            if (r0 != 0) goto L47
        L46:
            r4 = 1
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347490lAZ.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean):boolean");
    }

    public static final boolean LIZLLL(Aweme aweme, int i, boolean z) {
        if (C306520Bzu.LIZ() || aweme == null || !C729980SkG.LJIIIIZZ(aweme) || !z) {
            return false;
        }
        if (i != 1 && i != 3) {
            return false;
        }
        C1347490lAZ c1347490lAZ = LIZ;
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        c1347490lAZ.getClass();
        if (!LIZIZ(aid, authorUid)) {
            return false;
        }
        return true;
    }

    public static final SpannableStringBuilder LIZ(final Activity activity, final Aweme aweme, final int i, int i2, final long j, final AwS565S0100000_21 awS565S0100000_21) {
        String strJ4;
        String quantityString;
        Context contextLIZIZ;
        Context contextLIZIZ2;
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                strJ4 = activity.getString(2131829130);
            } else {
                strJ4 = activity.getResources().getQuantityString(2131755146, i2, Integer.valueOf(i2));
            }
        } else {
            strJ4 = C786410Ut5.j4(activity.getString(2131829043), Arrays.copyOf(new Object[]{""}, 1));
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            quantityString = activity.getString(2131829131);
        } else {
            quantityString = activity.getResources().getQuantityString(2131755147, i2, Integer.valueOf(i2));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4 + ' ' + quantityString);
        int length = strJ4.length() + 1;
        int length2 = length + quantityString.length();
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0l5x
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String str;
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    int i3 = i;
                    long j2 = j;
                    Activity activity2 = activity;
                    Function0<Unit> function0 = awS565S0100000_21;
                    String str2 = "";
                    String str3 = "1";
                    if (i3 == 0 || i3 == 1) {
                        str = "2";
                    } else if (i3 != 2 && i3 != 3) {
                        str = "";
                    } else {
                        str = "1";
                    }
                    if (!C1347490lAZ.LIZLLL(aweme2, i3, true)) {
                        str3 = "2";
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(j2, "comments_number");
                    String aid = aweme2.getAid();
                    if (aid != null) {
                        str2 = aid;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", str2);
                    c2344009Gk.LJIIIIZZ("reminder_degree", str);
                    c2344009Gk.LJIIIIZZ("reminder_status", str3);
                    C20684815ws.LJIILLIIL("filtered_comment_review_byvideo_ck", c2344009Gk.LIZ);
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme://webview?url=");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("https://www.tiktok.com/inapp/filtered_comments/comments?aweme_id=");
                        sbLIZ2.append(aweme2.getAid());
                        sbLIZ2.append("&enable_report_optimization=1&hide_nav_bar=1");
                        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ2), "UTF-8"));
                        sbLIZ.append("&use_spark=1");
                        SmartRouter.buildRoute(activity2, C2188811AlT.LIZIZ(sbLIZ)).open();
                        if (function0 != null) {
                            function0.invoke();
                        }
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C296030Biz.LIZ() || (C296030Biz.LIZIZ() & 2) > 0) {
                        C1344220l5I c1344220l5I = C1344220l5I.LIZ;
                        String aid2 = aweme2.getAid();
                        c1344220l5I.getClass();
                        C1344220l5I.LIZIZ(aid2);
                    }
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, length, length2, 18);
        if (C295780Bia.LIZIZ) {
            contextLIZIZ = C1354730lMF.LIZIZ(activity);
        } else {
            contextLIZIZ = null;
        }
        if (contextLIZIZ == null) {
            contextLIZIZ2 = C1354730lMF.LIZIZ(activity);
        } else {
            contextLIZIZ2 = contextLIZIZ;
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C475630Ikz.LIZIZ(R.attr.a1k, contextLIZIZ2)), 0, strJ4.length(), 18);
        if (contextLIZIZ == null) {
            contextLIZIZ = C1354730lMF.LIZIZ(activity);
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C475630Ikz.LIZIZ(R.attr.a1h, contextLIZIZ)), length, length2, 18);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), length, length2, 18);
        return spannableStringBuilder;
    }
}
