package Y;

import X.C09JN;
import X.C1207604ny;
import X.C191859104b;
import X.C191865104h;
import X.C191868104k;
import X.C191871104n;
import X.C191874104q;
import X.C191880104w;
import X.C1C7U;
import X.EnumC191875104r;
import X.InterfaceC1519050pdH;
import com.ss.android.ugc.aweme.network.model.LogPbBean;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.data.base.PrivacyUpdateCommonResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class AfS3S1001000_28 implements C09JN {
    public final int $t;
    public int i1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S1001000_28 afS3S1001000_28, Object obj) {
        PrivacyUserSettingsV2 privacyUserSettings;
        C1C7U.LIZ("RestrictionDataManager@a9fa.updateAgreementRecord$1");
        PrivacyUpdateCommonResponse privacyUpdateCommonResponse = (PrivacyUpdateCommonResponse) obj;
        if (!C1207604ny.LIZ()) {
            InterfaceC1519050pdH interfaceC1519050pdH = C191874104q.LIZ;
            C191874104q.LIZLLL(afS3S1001000_28.i1, afS3S1001000_28.s0);
        }
        if (privacyUpdateCommonResponse != null && (privacyUserSettings = privacyUpdateCommonResponse.getPrivacyUserSettings()) != null) {
            C191871104n.LJ().getClass();
            PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
            if (privacyUserSettingsV2LIZJ == null) {
                privacyUserSettingsV2LIZJ = new PrivacyUserSettingsV2(0);
            }
            privacyUserSettingsV2LIZJ.LIZJ(privacyUserSettings);
            C191859104b.LJ(privacyUserSettingsV2LIZJ);
        }
        C1C7U.LIZIZ("RestrictionDataManager@a9fa.updateAgreementRecord$1");
    }

    public static final void accept$1(AfS3S1001000_28 afS3S1001000_28, Object obj) {
        PrivacyUserSettingsV2 privacyUserSettings;
        boolean z;
        C1C7U.LIZ("UserSettingsApiManager@d79.updateDirectMessageSettingWithWriteBack$1");
        PrivacyUpdateCommonResponse privacyUpdateCommonResponse = (PrivacyUpdateCommonResponse) obj;
        PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
        if (privacyUserSettingsV2LIZJ != null) {
            privacyUserSettingsV2LIZJ.LIZIZ(afS3S1001000_28.i1, afS3S1001000_28.s0);
            C191859104b.LJ(privacyUserSettingsV2LIZJ);
        }
        C191868104k.LIZ(EnumC191875104r.SETTING);
        String str = null;
        if (privacyUpdateCommonResponse != null) {
            privacyUserSettings = privacyUpdateCommonResponse.getPrivacyUserSettings();
        } else {
            privacyUserSettings = null;
        }
        boolean z2 = true;
        if (privacyUserSettings != null) {
            PrivacyUserSettingsV2 privacyUserSettings2 = privacyUpdateCommonResponse.getPrivacyUserSettings();
            LogPbBean logPb = privacyUpdateCommonResponse.getLogPb();
            if (logPb != null) {
                str = logPb.imprId;
            }
            C191859104b.LIZ(privacyUserSettings2, str);
            z = false;
        } else {
            z = true;
        }
        if (privacyUpdateCommonResponse.getPrivacySettingsRestriction() != null) {
            Map<String, PrivacySettingsRestrictionItem> map = privacyUpdateCommonResponse.getPrivacySettingsRestriction().account;
            if (map != null) {
                C191874104q.LJFF(0, map);
            }
            Map<String, PrivacySettingsRestrictionItem> map2 = privacyUpdateCommonResponse.getPrivacySettingsRestriction().videoPrivacy;
            if (map2 != null) {
                C191874104q.LJFF(2, map2);
            }
            z2 = false;
        }
        C191865104h.LIZ("update_dm_setting", z, z2);
        C1C7U.LIZIZ("UserSettingsApiManager@d79.updateDirectMessageSettingWithWriteBack$1");
    }

    public static final void accept$2(AfS3S1001000_28 afS3S1001000_28, Object obj) {
        C1C7U.LIZ("UserSettingsApiManager@d79.updatePrivacySetting$1");
        PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
        if (privacyUserSettingsV2LIZJ != null) {
            String str = afS3S1001000_28.s0;
            int i = afS3S1001000_28.i1;
            privacyUserSettingsV2LIZJ.LIZIZ(i, str);
            if (Intrinsics.LJFF(str, "viewer_history")) {
                privacyUserSettingsV2LIZJ.LIZIZ(i, "profile_view_history");
                privacyUserSettingsV2LIZJ.LIZIZ(i, "video_view_history");
            }
            C191859104b.LJ(privacyUserSettingsV2LIZJ);
        }
        C1C7U.LIZIZ("UserSettingsApiManager@d79.updatePrivacySetting$1");
    }

    public static final void accept$3(AfS3S1001000_28 afS3S1001000_28, Object obj) {
        C1C7U.LIZ("TPSCDataManager@cd66.updateAgreementRecord$1");
        if (C1207604ny.LIZ()) {
            C191880104w c191880104w = C191880104w.LIZ;
            String str = afS3S1001000_28.s0;
            int i = afS3S1001000_28.i1;
            c191880104w.getClass();
            C191880104w.LJIILL(i, str);
        }
        C1C7U.LIZIZ("TPSCDataManager@cd66.updateAgreementRecord$1");
    }

    public AfS3S1001000_28(String str, int i, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
