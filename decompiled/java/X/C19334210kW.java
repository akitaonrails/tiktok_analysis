package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.CampaignPSPBusinessService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.SdkLaunchTask;
import com.ss.android.ugc.aweme.notice.api.ab.MultiAccountPopupPanelExp;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334210kW implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
            case 2:
                onAccountResult$2(this, i, z, i2, user);
                break;
        }
    }

    public C19334210kW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C19334210kW c19334210kW, int i, boolean z, int i2, User user) {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        if (i != 1 && i != 2) {
            if (i == 3) {
                ((SdkLaunchTask) c19334210kW.l0).LL.getClass();
                C191871104n.LJ().getClass();
                C191859104b.LJ(null);
                C191859104b.LIZIZ = null;
                return;
            }
            return;
        }
        C191819102n.LIZ.getClass();
        if (C191819102n.LJ().LJIIJ().LIZ()) {
            return;
        }
        ((SdkLaunchTask) c19334210kW.l0).LL.getClass();
        C191871104n.LJ().getClass();
        C191859104b.LJ(null);
        C191859104b.LIZIZ = null;
        ((SdkLaunchTask) c19334210kW.l0).LIZ("switch_account");
        if (!C294580Bge.LIZ() || (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) == null) {
            return;
        }
        iPNSConsentConfigServiceLJIIIZ.LJ(null, null);
    }

    public static final void onAccountResult$1(C19334210kW c19334210kW, int i, boolean z, int i2, User user) {
        String uid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAccountResult, success:");
        sbLIZ.append(z);
        sbLIZ.append(", type:");
        sbLIZ.append(i);
        sbLIZ.append(", uid:");
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z && C1697810uHb.LJIIJJI(1, 2, 3).contains(Integer.valueOf(i))) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (!Intrinsics.LJFF(((CampaignPSPBusinessService) c19334210kW.l0).LIZJ, curUserId)) {
                synchronized (C1886920zCc.LIZIZ) {
                    try {
                        ((HashMap) C1886920zCc.LIZJ).clear();
                        ((HashMap) C1886920zCc.LJ).clear();
                        ((HashMap) C1886920zCc.LJFF).clear();
                        ((HashMap) C1886920zCc.LIZLLL).clear();
                        C1886920zCc.LJII.clear();
                        C1886920zCc.LJIIIIZZ.clear();
                        for (InterfaceC830890Wid interfaceC830890Wid : ((HashMap) C1886920zCc.LJI).values()) {
                            InterfaceC1886910zCb interfaceC1886910zCb = C1886920zCc.LIZ;
                            if (interfaceC1886910zCb != null) {
                                interfaceC1886910zCb.LIZ(interfaceC830890Wid);
                            }
                        }
                        ((HashMap) C1886920zCc.LJI).clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                ((CampaignPSPBusinessService) c19334210kW.l0).LIZJ = curUserId;
            }
        }
    }

    public static final void onAccountResult$2(C19334210kW c19334210kW, int i, boolean z, int i2, User user) {
        ((C1912640zs6) c19334210kW.l0).getClass();
        if (z && i == 2) {
            C1912640zs6.LJFF = C1904220zeW.LL.LJIIZILJ();
            C1912640zs6.LJIIL = false;
            SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0WVV
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    MultiAccountPopupPanelExp.Meta meta = MultiAccountPopupPanelExp.LIZ;
                    MultiAccountPopupPanelExp.LIZIZ = (MultiAccountPopupPanelExp.Meta) C0C64.LJIILLIIL().LJJII(MultiAccountPopupPanelExp.Meta.class, MultiAccountPopupPanelExp.LIZ, "multi_account_push_guide_config", false);
                    C1912640zs6 c1912640zs6 = C1912640zs6.LIZ;
                    C1912640zs6.LJIIL = true;
                }
            });
        }
    }
}
