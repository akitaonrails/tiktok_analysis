package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;

/* JADX INFO: renamed from: X.0ORT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORT {
    public static final /* synthetic */ int LIZ = 0;

    public static C619390ORd LIZ(BulletinStyleStruct bulletinStyleStruct) {
        try {
            String str = bulletinStyleStruct.styleId;
            if (str != null) {
                return new C619390ORd(str, C619030OPt.LIZIZ(bulletinStyleStruct));
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convertToBulletinExtraDB Error. ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
