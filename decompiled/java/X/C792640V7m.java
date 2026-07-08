package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0V7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C792640V7m implements InterfaceC792670V7p {
    public final /* synthetic */ C792630V7l LIZ;

    public C792640V7m(C792630V7l c792630V7l) {
        this.LIZ = c792630V7l;
    }

    public final void LIZ(float f, long j) {
        synchronized (this.LIZ.LLJILJILJ) {
            try {
                if (TextUtils.isEmpty(this.LIZ.LLJIJIL)) {
                    return;
                }
                C792630V7l c792630V7l = this.LIZ;
                if (!c792630V7l.LLILLJJLI && !c792630V7l.LLJJIJI) {
                    if (c792630V7l.LLJILLL == 0) {
                        C791560V3i.LIZLLL().getClass();
                        c792630V7l.LLJJI = C08OX.LIZIZ();
                        C792630V7l c792630V7l2 = this.LIZ;
                        c792630V7l2.LLJJIII = c792630V7l2.LLJJIJIIJIL.LIZ();
                        this.LIZ.LLJJIJIL.clear();
                    }
                    C792630V7l c792630V7l3 = this.LIZ;
                    long j2 = c792630V7l3.LLJILLL + 1;
                    c792630V7l3.LLJILLL = j2;
                    float f2 = c792630V7l3.LLJJ + f;
                    c792630V7l3.LLJJ = f2;
                    if (j2 > 20) {
                        if (f2 > 200.0f) {
                            C792650V7n c792650V7n = new C792650V7n();
                            c792650V7n.LIZ = f2 / j2;
                            c792650V7n.LIZLLL = j;
                            C791560V3i.LIZLLL().getClass();
                            long jLIZIZ = C08OX.LIZIZ();
                            C792630V7l c792630V7l4 = this.LIZ;
                            c792650V7n.LIZIZ = jLIZIZ - c792630V7l4.LLJJI;
                            long jLIZ = c792630V7l4.LLJJIJIIJIL.LIZ();
                            C792630V7l c792630V7l5 = this.LIZ;
                            c792650V7n.LIZJ = jLIZ - c792630V7l5.LLJJIII;
                            CopyOnWriteArrayList<Long> copyOnWriteArrayList = c792630V7l5.LLJJIJIL;
                            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
                                for (int i = 0; i < copyOnWriteArrayList.size() - 1; i++) {
                                    StringBuilder sb = c792650V7n.LJ;
                                    sb.append(ListProtector.get(copyOnWriteArrayList, i));
                                    sb.append(',');
                                }
                                c792650V7n.LJ.append(ListProtector.get(copyOnWriteArrayList, copyOnWriteArrayList.size() - 1));
                            }
                            C792630V7l c792630V7l6 = this.LIZ;
                            c792630V7l6.LLJILJIL.put(c792630V7l6.LLJIJIL, c792650V7n);
                        }
                        this.LIZ.LJIILLIIL();
                    }
                    return;
                }
                c792630V7l.LJIILL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
