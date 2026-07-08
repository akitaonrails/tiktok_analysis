package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664806fW implements InterfaceC1668206g4 {
    public static final C1664806fW LIZ = new C1664806fW();
    public static final C2252331DDr LIZIZ = C09IR.LIZIZ(1, 0, null, 6);
    public static Pair<String, ? extends IMUser> LIZJ;

    public static Keva LJFF() {
        return Keva.getRepo("BusinessInboxSwitchService");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // X.InterfaceC1668206g4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r8 = this;
            long r0 = X.C461720I8s.LIZJ()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            long r3 = r7.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 0
            if (r0 <= 0) goto L82
            r0 = 1
            r5 = 0
            if (r0 == 0) goto L82
            long r3 = r7.longValue()
            kotlin.Pair<java.lang.String, ? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r2 = X.C1664806fW.LIZJ
            if (r2 == 0) goto L83
            java.lang.Object r1 = r2.getFirst()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L83
            java.lang.Object r2 = r2.getSecond()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
        L33:
            if (r2 == 0) goto L3f
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r2.getImUserBizInfo()
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r5 = r0.getUserB2CAccountInfo()
        L3f:
            java.util.Objects.toString(r5)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            boolean r0 = LJI(r0)
            if (r0 == 0) goto L5d
            X.06fU r0 = X.C1664606fU.LIZ
            r0.getClass()
            java.lang.Boolean r1 = X.C1664606fU.LIZ(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7c
        L5d:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r6)
            com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r0 = r0.getImPrivacySettings()
            boolean r0 = r0.LJII()
            if (r0 != 0) goto L82
            X.06fU r0 = X.C1664606fU.LIZ
            r0.getClass()
            java.lang.Boolean r1 = X.C1664606fU.LIZIZ(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
        L7c:
            X.10Ec r0 = X.C19212010Ec.LIZJ
            boolean r6 = r0.LJJJZ()
        L82:
            return r6
        L83:
            r2 = r5
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1664806fW.LIZIZ():boolean");
    }

    @Override // X.InterfaceC1668206g4
    public final C01S9<Pair<String, EnumC1665006fY>> LJ() {
        return LIZIZ;
    }

    public static boolean LJI(String str) {
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ever_entered_business_inbox:");
        sbLIZ.append(str);
        return kevaLJFF.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.InterfaceC1668206g4
    public final Boolean LIZJ(IMUser iMUser) {
        C1664606fU.LIZ.getClass();
        return C1664606fU.LIZIZ(iMUser);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    @Override // X.InterfaceC1668206g4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1664806fW.LIZLLL(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser):boolean");
    }

    @Override // X.InterfaceC1668206g4
    public final void LIZ(String str, EnumC1665006fY enumC1665006fY) {
        LIZIZ.LIZJ(null);
        int i = C1664906fX.LIZ[enumC1665006fY.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Keva kevaLJFF = LJFF();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("guide_creator_switch_business_inbox_show_time:");
                sbLIZ.append(str);
                int i2 = kevaLJFF.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                Keva kevaLJFF2 = LJFF();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("guide_creator_switch_business_inbox_show_time:");
                sbLIZ2.append(str);
                kevaLJFF2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2 + 1);
                Keva kevaLJFF3 = LJFF();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("guide_creator_switch_business_inbox_last_timestamp:");
                sbLIZ3.append(str);
                kevaLJFF3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
                return;
            }
            return;
        }
        Keva kevaLJFF4 = LJFF();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("auto_upgrade_guide_show_state:");
        sbLIZ4.append(str);
        kevaLJFF4.storeInt(C2188811AlT.LIZIZ(sbLIZ4), 2);
    }
}
