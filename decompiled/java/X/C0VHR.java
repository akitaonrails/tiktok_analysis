package X;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VHR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHR {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VI8.LIZIZ("Schedulers");
    }

    public static void LIZ(C0VHM c0vhm, WorkDatabase workDatabase, List<C0VHP> list) {
        int i;
        if (list != null && list.size() != 0) {
            InterfaceC794970VGl interfaceC794970VGlLJIIIIZZ = workDatabase.LJIIIIZZ();
            workDatabase.beginTransaction();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = c0vhm.LJII / 2;
                } else {
                    i = c0vhm.LJII;
                }
                C0VIH c0vih = (C0VIH) interfaceC794970VGlLJIIIIZZ;
                List<C0VIG> listLIZJ = c0vih.LIZJ(i);
                List listLIZIZ = c0vih.LIZIZ();
                if (((ArrayList) listLIZJ).size() > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator it2 = ((ArrayList) listLIZJ).iterator();
                    while (it2.hasNext()) {
                        c0vih.LJIIL(jCurrentTimeMillis, ((C0VIG) it2.next()).LIZ);
                    }
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                ArrayList arrayList = (ArrayList) listLIZJ;
                if (arrayList.size() > 0) {
                    C0VIG[] c0vigArr = (C0VIG[]) arrayList.toArray(new C0VIG[arrayList.size()]);
                    for (C0VHP c0vhp : list) {
                        if (c0vhp.LIZIZ()) {
                            c0vhp.LIZ(c0vigArr);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) listLIZIZ;
                if (arrayList2.size() > 0) {
                    C0VIG[] c0vigArr2 = (C0VIG[]) arrayList2.toArray(new C0VIG[arrayList2.size()]);
                    for (C0VHP c0vhp2 : list) {
                        if (!c0vhp2.LIZIZ()) {
                            c0vhp2.LIZ(c0vigArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                workDatabase.endTransaction();
                throw th;
            }
        }
    }
}
