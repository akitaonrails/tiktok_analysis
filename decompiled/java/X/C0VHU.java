package X;

import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0VHU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHU extends C0VHQ {
    public final /* synthetic */ C0VI1 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    @Override // X.C0VHQ
    public final void LIZIZ() {
        WorkDatabase workDatabase = this.LLILLJJLI.LIZJ;
        workDatabase.beginTransaction();
        try {
            Iterator it2 = ((ArrayList) ((C0VIH) workDatabase.LJIIIIZZ()).LJI(this.LLILLL)).iterator();
            while (it2.hasNext()) {
                C0VHQ.LIZ(this.LLILLJJLI, (String) it2.next());
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (this.LLILZ) {
                C0VI1 c0vi1 = this.LLILLJJLI;
                C0VHR.LIZ(c0vi1.LIZIZ, c0vi1.LIZJ, c0vi1.LJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            workDatabase.endTransaction();
            throw th;
        }
    }

    public C0VHU(C0VI1 c0vi1, String str, boolean z) {
        this.LLILLJJLI = c0vi1;
        this.LLILLL = str;
        this.LLILZ = z;
    }
}
