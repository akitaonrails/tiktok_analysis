package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622050OaZ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC622260Oau LIZ = C622190Oan.LIZ;

    public final boolean LIZ(List<C619060OPw> list) {
        String str = "";
        SQLiteDatabase sQLiteDatabaseLJ = this.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ == null) {
            return false;
        }
        ArrayList<Pair> arrayList = (ArrayList) C621860OaG.LIZIZ(list);
        if (arrayList.isEmpty()) {
            return false;
        }
        C622210Oap c622210Oap = new C622210Oap("write_items", this.LIZ);
        try {
            try {
                sQLiteDatabaseLJ.LJI(true);
                for (Pair pair : arrayList) {
                    sQLiteDatabaseLJ.LJJ((String) pair.getFirst(), (Object[]) pair.getSecond());
                }
                sQLiteDatabaseLJ.LJJIIZ();
                this.LIZ.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insertBulletinItems success, itemSize: ");
                sbLIZ.append(list.size());
                C622290Oax.LJFF("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ));
                c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
                sQLiteDatabaseLJ.LJJIIZI();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("insertBulletinItems failed, itemSize: ");
                sbLIZ2.append(list.size());
                C622290Oax.LIZJ("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ2), e);
                EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                c622210Oap.LIZ(enumC622250Oat, str, null);
                sQLiteDatabaseLJ.LJJIIZI();
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJ.LJJIIZI();
            throw th;
        }
    }
}
