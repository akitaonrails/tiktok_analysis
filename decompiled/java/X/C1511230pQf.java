package X;

import com.ss.android.ugc.aweme.ml.ab.SmartSocialRecUserPopupConfig;

/* JADX INFO: renamed from: X.0pQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511230pQf extends AbstractC1511510pR7 implements InterfaceC1488230opZ {
    public static final C1511230pQf LIZ = new C1511230pQf();
    public static boolean LIZIZ;
    public static SmartSocialRecUserPopupConfig LIZJ;
    public static C1511470pR3 LIZLLL;

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 lastResult() {
        return null;
    }

    public C1511230pQf() {
        super("social_smart_rec_popup_freq_control");
    }

    public final void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        if (!C1511240pQg.LIZ) {
            C1511240pQg.LIZIZ = (SmartSocialRecUserPopupConfig) C0C64.LJIILLIIL().LJJII(SmartSocialRecUserPopupConfig.class, null, "social_smart_rec_popup_freq_control", true);
            C1511240pQg.LIZ = true;
        }
        SmartSocialRecUserPopupConfig smartSocialRecUserPopupConfig = C1511240pQg.LIZIZ;
        if (smartSocialRecUserPopupConfig != null) {
            LIZJ = smartSocialRecUserPopupConfig;
            String scene = smartSocialRecUserPopupConfig.getScene();
            String str = scene != null ? scene : "social_smart_rec_popup_freq_control";
            LIZLLL = new C1511470pR3(str);
            C1510230pP3 c1510230pP3 = new C1510230pP3(str);
            c1510230pP3.LIZIZ = LIZJ;
            C1511470pR3 c1511470pR3 = LIZLLL;
            if (c1511470pR3 != null) {
                c1511470pR3.configService(c1510230pP3);
            }
            C1511480pR4 c1511480pR4 = C1511480pR4.LJIIZILJ.get(str);
            if (c1511480pR4 != null) {
                C1510500pPU c1510500pPU = new C1510500pPU(0, null, 0, 31);
                c1510500pPU.LIZ = 200;
                c1510500pPU.LIZJ = 0;
                c1510500pPU.LIZLLL = "close_suggested_accounts_pop_up";
                c1511480pR4.LJII(c1510500pPU, LIZ);
            }
        }
        preloadEnv();
    }

    @Override // X.AbstractC1511510pR7
    public final boolean enable() {
        return LIZJ != null;
    }

    @Override // X.AbstractC1511510pR7
    public final void preloadEnv() {
        C1511470pR3 c1511470pR3 = LIZLLL;
        if (c1511470pR3 != null) {
            c1511470pR3.preloadEnv();
        }
    }

    @Override // X.AbstractC1511510pR7
    public final C1512100pS4 runSync(C1509310pNZ c1509310pNZ) {
        C1511470pR3 c1511470pR3;
        if (!enable() || LIZJ == null || (c1511470pR3 = LIZLLL) == null || c1509310pNZ == null) {
            return null;
        }
        return c1511470pR3.runSync(c1509310pNZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // X.InterfaceC1488230opZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(org.json.JSONObject r15, X.C1509310pNZ r16) {
        /*
            r14 = this;
            r6 = 0
            X.0pOl r0 = com.ss.ugc.clientai.core.api.FeatureServiceManager.Companion     // Catch: java.lang.Throwable -> L46
            r0.getClass()     // Catch: java.lang.Throwable -> L46
            com.ss.ugc.clientai.core.api.FeatureServiceManager r2 = X.C1510050pOl.LIZ()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "f_social_recommend"
            r0 = 2
            r9 = 0
            com.ss.ugc.clientai.core.api.FeatureProducer r7 = com.ss.ugc.clientai.core.api.FeatureServiceManager.getProducer$default(r2, r1, r6, r0, r9)     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L41
            java.lang.String r8 = "u_duration_recommend_popup"
            com.ss.android.ugc.aweme.ml.ab.SmartSocialRecUserPopupConfig r0 = X.C1511230pQf.LIZJ     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L20
            java.lang.String r10 = r0.getScene()     // Catch: java.lang.Throwable -> L46
            if (r10 != 0) goto L22
        L20:
            java.lang.String r10 = "SmartSocialRecUserNegativeFeedback"
        L22:
            r12 = 10
            r11 = r9
            r13 = r9
            java.lang.Number r0 = com.ss.ugc.clientai.core.api.FeatureProducer.getNumericFeature$default(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L41
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L46
        L30:
            java.lang.String r3 = "ss_result"
            r1 = 4
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            java.lang.String r0 = "gt"
        L3a:
            r15.put(r3, r0)     // Catch: java.lang.Throwable -> L46
            goto L44
        L3e:
            java.lang.String r0 = "lt"
            goto L3a
        L41:
            r4 = 0
            goto L30
        L44:
            r0 = 1
            return r0
        L46:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "RecUserPopupNegativeFeedback"
            X.C1AF0.LJFF(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511230pQf.LIZ(org.json.JSONObject, X.0pNZ):boolean");
    }
}
