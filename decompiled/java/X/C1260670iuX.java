package X;

import android.app.Activity;
import android.view.ViewStub;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.NoticeData;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PhotoNoticeResponse;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PostStatistics;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260670iuX {
    public final ViewStub LIZ;
    public final int LIZIZ;
    public final Activity LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3060));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3061));

    public final void LJFF() {
        ((SmartRoute) this.LJ.getValue()).withParam("url", new C0XI4(C1237504sn.LIZ()).LJFF());
        ((SmartRoute) this.LJ.getValue()).open();
    }

    public final void LIZ(PhotoNoticeResponse photoNoticeResponse, long j) {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        PostStatistics postStatistics;
        PostStatistics postStatistics2;
        PostStatistics postStatistics3;
        PostStatistics postStatistics4;
        SmartRoute smartRoute = (SmartRoute) this.LJ.getValue();
        smartRoute.withParam("notice_type", photoNoticeResponse.notice_type);
        NoticeData noticeData = photoNoticeResponse.notice_data;
        String str = null;
        if (noticeData != null && (postStatistics4 = noticeData.post_statistics) != null) {
            dValueOf = Double.valueOf(postStatistics4.comments);
        } else {
            dValueOf = null;
        }
        smartRoute.withParam("comments", dValueOf);
        NoticeData noticeData2 = photoNoticeResponse.notice_data;
        if (noticeData2 != null && (postStatistics3 = noticeData2.post_statistics) != null) {
            dValueOf2 = Double.valueOf(postStatistics3.likes);
        } else {
            dValueOf2 = null;
        }
        smartRoute.withParam("likes", dValueOf2);
        NoticeData noticeData3 = photoNoticeResponse.notice_data;
        if (noticeData3 != null && (postStatistics2 = noticeData3.post_statistics) != null) {
            dValueOf3 = Double.valueOf(postStatistics2.new_followers);
        } else {
            dValueOf3 = null;
        }
        smartRoute.withParam("new_followers", dValueOf3);
        NoticeData noticeData4 = photoNoticeResponse.notice_data;
        if (noticeData4 != null && (postStatistics = noticeData4.post_statistics) != null) {
            dValueOf4 = Double.valueOf(postStatistics.views);
        } else {
            dValueOf4 = null;
        }
        smartRoute.withParam("views", dValueOf4);
        NoticeData noticeData5 = photoNoticeResponse.notice_data;
        if (noticeData5 != null) {
            str = noticeData5.item_id;
        }
        smartRoute.withParam("item_id", str);
        smartRoute.withParam("retrieval_time", j);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableString LIZIZ(java.lang.Object r6, android.app.Activity r7, java.lang.Object... r8) {
        /*
            r0 = 2131839793(0x7f114b31, float:1.9312848E38)
            java.lang.String r5 = r7.getString(r0)
            boolean r1 = r6 instanceof java.lang.Integer
            r0 = 0
            if (r1 == 0) goto Lf
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
        Lf:
            r3 = 32
            if (r0 == 0) goto L41
            int r2 = r0.intValue()
            X.0CmK r1 = new X.0CmK
            r0 = 2
            r1.<init>(r0)
            r1.LIZIZ(r8)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.LIZ(r0)
            int r0 = r1.LIZJ()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.LIZLLL(r0)
            java.lang.String r0 = r7.getString(r2, r0)
            if (r0 != 0) goto L5a
        L41:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L8a
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8a
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
        L5a:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            r1 = 0
            r0 = 6
            int r3 = kotlin.text.a0.LJJJJI(r4, r5, r1, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = 2131100571(0x7f06039b, float:1.7813527E38)
            int r0 = X.C960203pA.LIZ(r0, r7)
            r1.<init>(r0)
            int r0 = r5.length()
            int r0 = r0 + r3
            r2 = 33
            X.C786410Ut5.p2(r4, r1, r3, r0, r2)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r0 = 1
            r1.<init>(r0)
            int r0 = r5.length()
            int r0 = r0 + r3
            X.C786410Ut5.p2(r4, r1, r3, r0, r2)
            return r4
        L8a:
            r0 = r5
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1260670iuX.LIZIZ(java.lang.Object, android.app.Activity, java.lang.Object[]):android.text.SpannableString");
    }

    public C1260670iuX(ViewStub viewStub, int i, Activity activity, C1257230ioz c1257230ioz) {
        this.LIZ = viewStub;
        this.LIZIZ = i;
        this.LIZJ = activity;
    }

    public static void LIZLLL(C1260670iuX c1260670iuX, String str, String str2, String str3) {
        c1260670iuX.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("current_page", "personal_homepage");
        c2344009Gk.LJIIIIZZ("button_type", "learn_more");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("notice_type", "educate_phase_iii");
        c2344009Gk.LJIIIIZZ("notice_sub_type", "");
        c2344009Gk.LJIIIIZZ("category_name", str);
        c2344009Gk.LJIIIIZZ("session_id", str2);
        c2344009Gk.LJIIIIZZ("dismiss_method", str3);
        c2344009Gk.LJIIIIZZ("topic_id", "");
        c2344009Gk.LJIIIIZZ("search_topic_id", "");
        C20684815ws.LJIILLIIL("photo_intro_close", c2344009Gk.LIZ);
    }

    public static void LIZJ(C1260670iuX c1260670iuX, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        if ((i & 1) != 0) {
            str = "learn_more";
        }
        String str7 = "";
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i & 64) == 0) {
            str7 = null;
        }
        c1260670iuX.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("current_page", "personal_homepage");
        c2344009Gk.LJIIIIZZ("button_type", str);
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("notice_type", str2);
        c2344009Gk.LJIIIIZZ("notice_sub_type", str3);
        c2344009Gk.LJIIIIZZ("category_name", str4);
        c2344009Gk.LJIIIIZZ("session_id", str5);
        c2344009Gk.LJIIIIZZ("topic_id", str6);
        c2344009Gk.LJIIIIZZ("search_topic_id", str7);
        C20684815ws.LJIILLIIL("photo_intro_click", c2344009Gk.LIZ);
    }

    public static void LJ(C1260670iuX c1260670iuX, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        if ((i & 1) != 0) {
            str = "learn_more";
        }
        String str7 = "";
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i & 64) == 0) {
            str7 = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("current_page", "personal_homepage");
        c2344009Gk.LJIIIIZZ("button_type", str);
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("notice_type", str2);
        c2344009Gk.LJIIIIZZ("notice_sub_type", str3);
        c2344009Gk.LJIIIIZZ("category_name", str4);
        c2344009Gk.LJIIIIZZ("session_id", str5);
        c2344009Gk.LJIIIIZZ("topic_id", str6);
        c2344009Gk.LJIIIIZZ("search_topic_id", str7);
        C20684815ws.LJIILLIIL("photo_intro_show", c2344009Gk.LIZ);
    }
}
