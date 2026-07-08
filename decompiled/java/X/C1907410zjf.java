package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Map;

/* JADX INFO: renamed from: X.0zjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907410zjf {
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(X.C1246520iXi r4) {
        /*
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r2.templateNotice
            r3 = 0
            if (r0 != 0) goto L63
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r0 = r2.textNotice
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.getSchemaUrl()
            return r0
        L10:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r1 = r2.announcement
            if (r1 == 0) goto L22
            java.lang.String r0 = r1.getSchemaUrl()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L22
            java.lang.String r3 = r1.getSchemaUrl()
        L22:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.AdHelperNotice r1 = r0.adHelperNotice
            if (r1 == 0) goto L32
            java.lang.String r0 = r1.schemaUrl
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L32
            java.lang.String r3 = r1.schemaUrl
        L32:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.BusinessAccountNotice r1 = r0.businessAccountNotice
            if (r1 == 0) goto L42
            java.lang.String r0 = r1.schemaUrl
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L42
            java.lang.String r3 = r1.schemaUrl
        L42:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.TcmNotice r1 = r0.tcmNotice
            if (r1 == 0) goto L52
            java.lang.String r0 = r1.schemaUrl
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L52
            java.lang.String r3 = r1.schemaUrl
        L52:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.PromoteNotice r1 = r0.promoteNotice
            if (r1 == 0) goto L62
            java.lang.String r0 = r1.schemaUrl
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L62
            java.lang.String r3 = r1.schemaUrl
        L62:
            return r3
        L63:
            java.lang.String r0 = r0.schemaUrl
            if (r0 != 0) goto Lc0
            X.01GW r0 = X.C262090AOx.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto La7
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r2.templateNotice
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
            if (r0 == 0) goto La7
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton> r0 = r0.bottomButtons
            if (r0 == 0) goto La7
            java.util.Iterator r2 = r0.iterator()
        L86:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton r0 = (com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton) r0
            java.lang.String r0 = r0.schemaUrl
            if (r0 == 0) goto L86
            int r0 = r0.length()
            if (r0 != 0) goto L9f
            goto L86
        L9e:
            r1 = r3
        L9f:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton r1 = (com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton) r1
            if (r1 == 0) goto La7
            java.lang.String r0 = r1.schemaUrl
            if (r0 != 0) goto Lbf
        La7:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r4.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r1 = r0.templateNotice
            if (r1 == 0) goto Lbe
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r0.rightSchemaUrl
            if (r0 != 0) goto Lbf
            if (r1 == 0) goto Lbe
        Lb7:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
            if (r0 == 0) goto Lbe
            java.lang.String r3 = r0.bannerSchemaUrl
            return r3
        Lbe:
            return r3
        Lbf:
            return r0
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907410zjf.LIZIZ(X.0iXi):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C2344009Gk r9, X.C1246520iXi r10) {
        /*
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r4 = r10.LL
            long r1 = r4.taskId
            java.lang.String r5 = "enter_from"
            java.lang.String r0 = "official_message_mix"
            r9.LJFF(r5, r0)
            java.lang.String r6 = "account_type"
            java.lang.String r7 = "ai_remix"
            java.lang.String r8 = "ai_theater"
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r4.templateNotice     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.messageExtra     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L3e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            r5.<init>(r0)     // Catch: org.json.JSONException -> L59
        L20:
            java.lang.String r0 = "business_extra"
            java.lang.String r0 = r5.optString(r0)     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L38
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            r5.<init>(r0)     // Catch: org.json.JSONException -> L59
        L2d:
            java.lang.String r0 = r5.optString(r6)     // Catch: org.json.JSONException -> L59
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L46
            goto L44
        L38:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            r5.<init>()     // Catch: org.json.JSONException -> L59
            goto L2d
        L3e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            r5.<init>()     // Catch: org.json.JSONException -> L59
            goto L20
        L44:
            r7 = r8
            goto L66
        L46:
            java.lang.String r0 = r5.optString(r6)     // Catch: org.json.JSONException -> L59
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)     // Catch: org.json.JSONException -> L59
            if (r0 != 0) goto L66
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo r0 = r4.channelInfo     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L65
            java.lang.String r7 = r0.accountType     // Catch: org.json.JSONException -> L59
            if (r7 != 0) goto L66
            goto L65
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo r0 = r4.channelInfo
            if (r0 == 0) goto L65
            java.lang.String r7 = r0.accountType
            if (r7 != 0) goto L66
        L65:
            r7 = r3
        L66:
            r9.LJFF(r6, r7)
            java.lang.String r5 = "content_id"
            java.lang.String r0 = r4.nid
            r9.LJFF(r5, r0)
            java.lang.String r5 = "template_id"
            java.lang.String r0 = r4.getTemplateId()
            r9.LJFF(r5, r0)
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto Lbb
            r1 = 0
        L80:
            java.lang.String r0 = "task_id"
            r9.LJFF(r0, r1)
            java.lang.String r0 = LIZIZ(r10)
            r2 = 0
            if (r0 == 0) goto Lb9
            int r0 = r0.length()
            if (r0 == 0) goto Lb9
            r0 = 0
        L93:
            r1 = r0 ^ 1
            java.lang.String r0 = "is_land"
            r9.LIZJ(r1, r0)
            boolean r0 = X.C1902710zc5.LIZJ()
            if (r0 != 0) goto La5
            boolean r0 = r4.hasRead
            if (r0 == 0) goto La5
            r2 = 1
        La5:
            java.lang.String r0 = "is_read"
            r9.LIZJ(r2, r0)
            X.0iXS r0 = X.C1902890zcN.LIZ
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.LIZJ
            if (r0 == 0) goto Lb3
            r3 = r0
        Lb3:
            java.lang.String r0 = "cell_type"
            r9.LJFF(r0, r3)
            return
        Lb9:
            r0 = 1
            goto L93
        Lbb:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907410zjf.LIZ(X.09Gk, X.0iXi):void");
    }

    public static final void LIZJ(C1246520iXi c1246520iXi, String str) {
        String str2;
        MusNotice musNotice = c1246520iXi.LL;
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        if (generalTemplateNotice != null) {
            str2 = generalTemplateNotice.messageExtra;
        } else {
            str2 = null;
        }
        Map<String, String> mapLIZ = C1075780e6K.LIZ(str2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLIZ);
        LIZ(c2344009Gk, c1246520iXi);
        c2344009Gk.LJIIIIZZ("type", str);
        c2344009Gk.LIZJ(musNotice.channelCategory, "category_type");
        C20684815ws.LJIILLIIL("message_manage_click", c2344009Gk.LIZ);
    }
}
