package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795190VHh implements InterfaceC795120VHa {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;

    public C795190VHh(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854570Xfj(abstractC796540VMm, 12);
    }

    public final List<String> LIZ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(cursorLIZIZ.getString(0));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final boolean LIZIZ(String str) {
        boolean z = true;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return z2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }
}
