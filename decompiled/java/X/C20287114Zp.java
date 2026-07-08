package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.14Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287114Zp {
    public static final C20287114Zp LIZ = new C20287114Zp();

    public static void LIZ(int i, Aweme aweme) {
        String aid;
        String aid2;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        LIZIZ(i, C14Z4.LIZ(aweme).getType(), aid, null);
        C20291314aV c20291314aV = C20291314aV.LIZ;
        if (aweme != null && (aid2 = aweme.getAid()) != null) {
            str = aid2;
        }
        c20291314aV.getClass();
        C20291314aV.LJIIL(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[PHI: r6
      0x001e: PHI (r6v6 java.lang.String) = (r6v0 java.lang.String), (r6v7 java.lang.String) binds: [B:12:0x001c, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c A[PHI: r6 r7
      0x002c: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:34:0x0088, B:17:0x0026, B:19:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r7v1 int) = (r7v0 int), (r7v4 int), (r7v4 int) binds: [B:34:0x0088, B:17:0x0026, B:19:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[PHI: r6
      0x0087: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v6 java.lang.String) binds: [B:12:0x001c, B:14:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, com.ss.android.ugc.aweme.feed.model.survey.Option[] r20) {
        /*
            X.14ZW r0 = X.C14ZW.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r4 = X.C14ZW.LJ(r19)
            if (r4 != 0) goto Lc
            return
        Lc:
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r2 = r4.questions
            java.lang.String r3 = ""
            r1 = 0
            if (r2 == 0) goto L1b
            r0 = r2[r1]
            if (r0 == 0) goto L1b
            java.lang.String r6 = r0.id
            if (r6 != 0) goto L1e
        L1b:
            r6 = r3
            if (r2 == 0) goto L87
        L1e:
            r0 = r2[r1]
            if (r0 == 0) goto L87
            int r7 = r0.type
        L24:
            r0 = r2[r1]
            if (r0 == 0) goto L2c
            java.lang.String r8 = r0.title
            if (r8 != 0) goto L2d
        L2c:
            r8 = r3
        L2d:
            r0 = 1
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r12 = new com.ss.android.ugc.aweme.feed.model.survey.Question[r0]
            com.ss.android.ugc.aweme.feed.model.survey.Question r5 = new com.ss.android.ugc.aweme.feed.model.survey.Question
            java.lang.String r9 = ""
            r10 = r20
            r5.<init>(r6, r7, r8, r9, r10)
            r12[r1] = r5
            java.lang.String r5 = r4.surveyKey
            java.lang.String r6 = r4.id
            java.lang.String r7 = r4.relationsKey
            java.util.List<com.ss.android.ugc.aweme.feed.model.survey.TriggerData> r8 = r4.triggerActions
            java.lang.String r9 = r4.title
            java.lang.String r10 = r4.cancelText
            java.lang.String r11 = r4.submitText
            com.ss.android.ugc.aweme.feed.model.survey.ForceVideo r13 = r4.forceVideo
            com.ss.android.ugc.aweme.feed.model.survey.ForceVideo r14 = r4.videoCover
            com.ss.android.ugc.aweme.feed.model.survey.ForceVideo r15 = r4.customizeButton
            java.lang.String r1 = r4.extra
            java.lang.String r0 = r4.templateUrl
            r16 = r1
            r17 = r0
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r4.copy(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r19 == 0) goto L63
            java.lang.String r2 = r19.getAid()
            if (r2 != 0) goto L64
        L63:
            r2 = r3
        L64:
            java.lang.String r1 = X.C08JS.LIZLLL(r0)
            X.14Z0 r0 = X.C14Z4.LIZ(r19)
            int r0 = r0.getType()
            r4 = r18
            LIZIZ(r4, r0, r2, r1)
            X.14aV r1 = X.C20291314aV.LIZ
            if (r19 == 0) goto L80
            java.lang.String r0 = r19.getAid()
            if (r0 == 0) goto L80
            r3 = r0
        L80:
            r1.getClass()
            X.C20291314aV.LJIIL(r3)
            return
        L87:
            r7 = 0
            if (r2 == 0) goto L2c
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20287114Zp.LIZJ(int, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.survey.Option[]):void");
    }

    public static void LIZIZ(int i, int i2, String str, String str2) {
        InterfaceC20298314bd.LIZ.getClass();
        ((InterfaceC20298314bd) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build().retrofit.LIZ(InterfaceC20298314bd.class)).LIZ(str, 1, i, str2, i2).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00QL
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SurveyReportEvent@408.reportSurveyAction$1");
                C1C7U.LIZIZ("SurveyReportEvent@408.reportSurveyAction$1");
            }
        }, new C09JN() { // from class: X.087D
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SurveyReportEvent@408.reportSurveyAction$2");
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.printStackTrace();
                }
                C1C7U.LIZIZ("SurveyReportEvent@408.reportSurveyAction$2");
            }
        });
    }
}
