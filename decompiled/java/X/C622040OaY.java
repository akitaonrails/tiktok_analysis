package X;

import android.content.ContentValues;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622040OaY {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC622260Oau LIZ = C622190Oan.LIZ;

    public final void LIZ(C619390ORd c619390ORd) {
        SQLiteDatabase sQLiteDatabaseLJ = this.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ == null) {
            return;
        }
        C622210Oap c622210Oap = new C622210Oap("write_publish_user", this.LIZ);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC622140Oai.USER_ID.getKey(), c619390ORd.LIZ);
            contentValues.put(EnumC622140Oai.PUBLISH_USER.getKey(), c619390ORd.LIZIZ);
            sQLiteDatabaseLJ.LJJJZ("bulletin_publish_user", contentValues, 5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insertBulletinBoardPublishUser failed, userId: ");
            sbLIZ.append(c619390ORd.LIZ);
            C622290Oax.LIZJ("BulletinBoardPublishUserDao", C2188811AlT.LIZIZ(sbLIZ), e);
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c622210Oap.LIZ(enumC622250Oat, message, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final List<C619390ORd> LIZIZ(List<String> list) {
        C619390ORd c619390ORd;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            SQLiteDatabase sQLiteDatabaseLJ = this.LIZ.LIZJ().LJ();
            C619390ORd c619390ORd2 = null;
            if (sQLiteDatabaseLJ != null) {
                C622210Oap c622210Oap = new C622210Oap("get_publish_user", this.LIZ);
                try {
                    EnumC622140Oai enumC622140Oai = EnumC622140Oai.PUBLISH_USER;
                    String[] strArr = {enumC622140Oai.getKey()};
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(EnumC622140Oai.USER_ID.getKey());
                    sbLIZ.append(" = ?");
                    C908020Zjk c908020ZjkLJJLIL = sQLiteDatabaseLJ.LJJLIL("bulletin_publish_user", strArr, C2188811AlT.LIZIZ(sbLIZ), new String[]{str}, null);
                    try {
                        if (c908020ZjkLJJLIL.moveToFirst()) {
                            c619390ORd = new C619390ORd(str, C622120Oag.LIZLLL(c908020ZjkLJJLIL, enumC622140Oai.getKey()));
                        } else {
                            c619390ORd = null;
                        }
                        C2107108Nh.LIZ(c908020ZjkLJJLIL, null);
                        c619390ORd2 = c619390ORd;
                    } finally {
                        th = th;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("queryBulletinBoardPublishUser failed, userId: ");
                    sbLIZ2.append(str);
                    C622290Oax.LIZJ("BulletinBoardPublishUserDao", C2188811AlT.LIZIZ(sbLIZ2), e);
                    EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c622210Oap.LIZ(enumC622250Oat, message, null);
                }
            }
            if (c619390ORd2 != null) {
                arrayList.add(c619390ORd2);
            }
        }
        return arrayList;
    }
}
