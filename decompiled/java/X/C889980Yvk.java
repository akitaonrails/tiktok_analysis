package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889980Yvk implements InterfaceC888860Ytw {
    public final ViewGroup LIZ;
    public final EnumC871430YGn LIZIZ;
    public final String LIZJ;
    public final Function0<Boolean> LIZLLL;
    public String LJ;

    @Override // X.InterfaceC888860Ytw
    public final void LJI(Context context) {
    }

    @Override // X.InterfaceC888860Ytw
    public final EnumC610450Nwx getType() {
        return EnumC610450Nwx.MESSAGE_REQUEST_RECEIVE_MR_IN_INBOX;
    }

    @Override // X.InterfaceC888860Ytw
    public final void LJII(Context context) {
        C889990Yvl c889990Yvl = new C889990Yvl(this.LIZ.getContext());
        c889990Yvl.setOnDismiss$im_chatlist_impl_release(new AwS558S0100000_14(this, 1549));
        this.LJ = "business_dm_permission_guide";
        this.LIZ.addView(c889990Yvl);
        String str = this.LJ;
        if (str != null) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            String str2 = this.LIZJ;
            c885310YoD.getClass();
            C885310YoD.LJJIJ(str2, str, "show");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    @Override // X.InterfaceC888860Ytw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = X.C888810Ytr.LIZ(r6)
            r5 = 1
            if (r0 == 0) goto Lc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        Lc:
            X.0YGn r1 = r6.LIZIZ
            X.0YGn r0 = X.EnumC871430YGn.ALL_RISKY
            r3 = 0
            if (r1 == r0) goto Lbf
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r3)
            com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r1 = r0.getImPrivacySettings()
            java.lang.String r0 = "dm_setting_others"
            int r0 = r1.LJIIIZ(r0)
            if (r0 == r5) goto Lbf
            boolean r0 = r1.LJIILL()
            if (r0 == 0) goto Lbf
            X.05KY r0 = new X.05KY
            r2 = 0
            r0.<init>(r2)
            java.lang.Object r4 = X.C23250099c.LJFF(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r4
            if (r4 == 0) goto Lbf
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldShow, userB2CAccountInfo: "
            r1.append(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r4.getImUserBizInfo()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r2 = r0.getUserB2CAccountInfo()
        L4a:
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.06g9 r2 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r0 = X.C1668706g9.LIZ(r2)
            X.06nD r0 = r0.LJFF()
            java.lang.Boolean r1 = r0.LJ(r4)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r0 = X.C1668706g9.LIZ(r2)
            X.06g4 r0 = r0.LJIJJ()
            java.lang.Boolean r1 = r0.LIZJ(r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lbf
            com.bytedance.keva.Keva r1 = X.C890000Yvm.LIZ()
            java.lang.String r0 = "guide_banner_shown_time"
            int r1 = r1.getInt(r0, r3)
            r0 = 2
            if (r1 >= r0) goto Lbf
            com.bytedance.keva.Keva r3 = X.C890000Yvm.LIZ()
            java.lang.String r2 = "guide_banner_last_show_timestamp"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            X.01GW r0 = X.C890010Yvn.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.common.setting.BusinessDMPermissionConfig r0 = (com.ss.android.ugc.aweme.im.common.setting.BusinessDMPermissionConfig) r0
            long r0 = r0.guideBannerShowIntervalInDay
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lbf
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r6.LIZLLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbf
        Lba:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        Lbf:
            r5 = 0
            goto Lba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889980Yvk.LJIIIIZZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public C889980Yvk(ViewGroup viewGroup, EnumC871430YGn enumC871430YGn, String str, AwS558S0100000_14 awS558S0100000_14) {
        this.LIZ = viewGroup;
        this.LIZIZ = enumC871430YGn;
        this.LIZJ = str;
        this.LIZLLL = awS558S0100000_14;
    }
}
