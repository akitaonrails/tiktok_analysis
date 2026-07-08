package X;

import android.content.ContentValues;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;

/* JADX INFO: renamed from: X.0Oac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622080Oac {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC622260Oau LIZ = C622190Oan.LIZ;

    public final void LIZ(C619390ORd c619390ORd) {
        SQLiteDatabase sQLiteDatabaseLJ = this.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ == null) {
            return;
        }
        C622210Oap c622210Oap = new C622210Oap("write_style_struct", this.LIZ);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC622150Oaj.STYLE_ID.getKey(), c619390ORd.LIZ);
            contentValues.put(EnumC622150Oaj.STYLE_JSON.getKey(), c619390ORd.LIZIZ);
            sQLiteDatabaseLJ.LJJJZ("bulletin_style_struct", contentValues, 5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insertBulletinBoardStyleStruct failed, styleId: ");
            sbLIZ.append(c619390ORd.LIZ);
            C622290Oax.LIZJ("BulletinBoardStyleStructDao", C2188811AlT.LIZIZ(sbLIZ), e);
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c622210Oap.LIZ(enumC622250Oat, message, null);
        }
    }
}
