package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795260VHo implements InterfaceC795140VHc {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;

    public C795260VHo(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854570Xfj(abstractC796540VMm, 18);
    }

    public final List<String> LIZ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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
}
