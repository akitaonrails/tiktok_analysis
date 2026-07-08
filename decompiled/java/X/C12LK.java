package X;

import Y.ARunnableS98S0200000_29;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12LK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LK implements C12L6 {
    public static volatile C12LK LIZJ;
    public static final ReentrantLock LIZLLL = new ReentrantLock();
    public final C12LN LIZ;
    public final CopyOnWriteArrayList<C12LM> LIZIZ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.12LL] */
    public C12LK(SidecarCompat sidecarCompat) {
        this.LIZ = sidecarCompat;
        if (sidecarCompat != 0) {
            sidecarCompat.LJ(new C12LO() { // from class: X.12LL
                @Override // X.C12LO
                public final void LIZ(Activity activity, C0N9B c0n9b) {
                    for (C12LM c12lm : this.LIZ.LIZIZ) {
                        if (Intrinsics.LJFF(c12lm.LIZ, activity)) {
                            c12lm.LIZLLL = c0n9b;
                            c12lm.LIZIZ.execute(new ARunnableS98S0200000_29(c12lm, c0n9b, 38));
                        }
                    }
                }
            });
        }
    }

    @Override // X.C12L6
    public final void LIZ(C092O<C0N9B> c092o) {
        synchronized (LIZLLL) {
            try {
                if (this.LIZ == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (C12LM c12lm : this.LIZIZ) {
                    if (c12lm.LIZJ == c092o) {
                        arrayList.add(c12lm);
                    }
                }
                this.LIZIZ.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C12LM) it2.next()).LIZ;
                    CopyOnWriteArrayList<C12LM> copyOnWriteArrayList = this.LIZIZ;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<C12LM> it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().LIZ, activity)) {
                                break;
                            }
                        }
                    }
                    C12LN c12ln = this.LIZ;
                    if (c12ln != null) {
                        c12ln.LIZ(activity);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C12L6
    public final void LIZIZ(Context context, C12L7 c12l7, C12LA c12la) {
        Activity activity;
        boolean z;
        C12LM next;
        C0N9B c0n9b;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            ReentrantLock reentrantLock = LIZLLL;
            reentrantLock.lock();
            try {
                C12LN c12ln = this.LIZ;
                if (c12ln == null) {
                    c12la.accept(new C0N9B(C13BV.INSTANCE));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList<C12LM> copyOnWriteArrayList = this.LIZIZ;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<C12LM> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                C12LM c12lm = new C12LM(activity, c12l7, c12la);
                this.LIZIZ.add(c12lm);
                if (!z) {
                    c12ln.LIZIZ(activity);
                } else {
                    Iterator<C12LM> it3 = this.LIZIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(activity, next.LIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C12LM c12lm2 = next;
                    if (c12lm2 != null && (c0n9b = c12lm2.LIZLLL) != null) {
                        c12lm.LIZLLL = c0n9b;
                        c12lm.LIZIZ.execute(new ARunnableS98S0200000_29(c12lm, c0n9b, 38));
                    }
                }
                reentrantLock.unlock();
                if (Unit.LIZ != null) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        c12la.accept(new C0N9B(C13BV.INSTANCE));
    }
}
