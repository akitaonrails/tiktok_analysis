package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759206uk {
    public static final C1759206uk LIZ = new C1759206uk();
    public static final C2252321DDq LIZIZ = C1BNE.LIZ(Boolean.FALSE);
    public static final C1759306ul LIZJ = new InterfaceC989510brB<PrivacySettingsRestriction>() { // from class: X.06ul
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacySettingsRestriction privacySettingsRestriction) {
            C1759206uk c1759206uk = C1759206uk.LIZ;
            C1759206uk.LIZ();
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean LIZIZ() {
        /*
            r2 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r2)
            com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r1 = r0.getImPrivacySettings()
            java.lang.String r0 = "group_chat"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r4 = r1.LJJ(r2, r0)
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            r3 = 1
            if (r0 != 0) goto L24
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L38
        L24:
            X.0Z40 r0 = com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService r0 = X.C0Z40.LIZIZ()
            if (r0 == 0) goto L38
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != r3) goto L38
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L38:
            r2 = 0
            if (r4 == 0) goto L58
            int r0 = r4.showType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L58
            int r0 = r1.intValue()
            if (r0 == 0) goto L59
            int r0 = r1.intValue()
            if (r0 == r3) goto L59
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L58
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L58:
            return r2
        L59:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759206uk.LIZIZ():java.lang.Boolean");
    }

    public static final boolean LIZ() {
        Boolean boolLIZIZ = LIZIZ();
        C2252321DDq c2252321DDq = LIZIZ;
        if (!Intrinsics.LJFF(boolLIZIZ, c2252321DDq.getValue())) {
            c2252321DDq.setValue(Boolean.valueOf(Intrinsics.LJFF(boolLIZIZ, Boolean.TRUE)));
        }
        return Intrinsics.LJFF(boolLIZIZ, Boolean.TRUE);
    }
}
