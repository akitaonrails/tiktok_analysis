package X;

import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0VHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VHQ implements Runnable {
    public final C795230VHl LL = new C795230VHl();

    public abstract void LIZIZ();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZIZ();
            this.LL.LIZ(InterfaceC795220VHk.LIZ);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.LL.LIZ(new C795200VHi(th));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (!C2179971ATj.LIZ(th2)) {
                    throw th2;
                }
            }
        }
    }

    public static void LIZ(C0VI1 c0vi1, String str) {
        boolean z;
        WorkDatabase workDatabase = c0vi1.LIZJ;
        InterfaceC794970VGl interfaceC794970VGlLJIIIIZZ = workDatabase.LJIIIIZZ();
        InterfaceC795120VHa interfaceC795120VHaLIZ = workDatabase.LIZ();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C0VIH c0vih = (C0VIH) interfaceC794970VGlLJIIIIZZ;
            C0VIP c0vipLJFF = c0vih.LJFF(str2);
            if (c0vipLJFF != C0VIP.SUCCEEDED && c0vipLJFF != C0VIP.FAILED) {
                c0vih.LJIILLIIL(C0VIP.CANCELLED, str2);
            }
            linkedList.addAll(((C795190VHh) interfaceC795120VHaLIZ).LIZ(str2));
        }
        C0VH8 c0vh8 = c0vi1.LJFF;
        synchronized (c0vh8.LLJIJIL) {
            try {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Processor cancelling %s", new Object[]{str});
                c0vi8LIZ.getClass();
                ((HashSet) c0vh8.LLJ).add(str);
                C0VHL c0vhl = (C0VHL) ((HashMap) c0vh8.LLILZLL).remove(str);
                if (c0vhl != null) {
                    z = true;
                } else {
                    c0vhl = (C0VHL) ((HashMap) c0vh8.LLIZ).remove(str);
                }
                C0VH8.LIZIZ(str, c0vhl);
                if (z) {
                    c0vh8.LJIIIIZZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator<C0VHP> it2 = c0vi1.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJ(str);
        }
    }
}
