package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2;

/* JADX INFO: renamed from: X.108O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108O {
    public static final C108O LIZ = new C108O();

    public static RemoveOffProps LIZ() {
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV2LJII = C191880104w.LJII("account_level_off");
        try {
            RemoveOffProps removeOffProps = (RemoveOffProps) C1703730uR9.LIZ().LJII(privacySettingsAgreementRecordV2LJII != null ? privacySettingsAgreementRecordV2LJII.props : null, RemoveOffProps.class);
            Integer num = removeOffProps.abGroup;
            if (num != null) {
                if (num.intValue() == 2) {
                    removeOffProps.LIZ = true;
                    removeOffProps.LIZIZ = false;
                } else if (num.intValue() == 1) {
                    removeOffProps.LIZ = false;
                    removeOffProps.LIZIZ = true;
                }
                String str = removeOffProps.confirmActionRecords;
                int iHashCode = str.hashCode();
                if (iHashCode != -1043441214) {
                    if (iHashCode != 142085783) {
                        if (iHashCode == 2029193655 && str.equals("account_level_off_comment_reuse")) {
                            removeOffProps.LIZJ = true;
                            removeOffProps.LIZLLL = true;
                            removeOffProps.LJ = 2131824554;
                            removeOffProps.LJFF = 2131824552;
                            removeOffProps.LJI = 2131824553;
                            removeOffProps.LJII = 2131824558;
                            return removeOffProps;
                        }
                    } else if (str.equals("account_level_off_reuse")) {
                        removeOffProps.LIZJ = true;
                        removeOffProps.LJ = 2131824561;
                        removeOffProps.LJFF = 2131824559;
                        removeOffProps.LJI = 2131824560;
                        removeOffProps.LJII = 2131824558;
                        return removeOffProps;
                    }
                } else if (str.equals("account_level_off_comment")) {
                    removeOffProps.LIZLLL = true;
                    removeOffProps.LJ = 2131824557;
                    removeOffProps.LJFF = 2131824555;
                    removeOffProps.LJI = 2131824556;
                    removeOffProps.LJII = 2131824558;
                    return removeOffProps;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            return (RemoveOffProps) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        }
    }
}
