package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20133613qA {
    public final ReentrantLock LIZ = new ReentrantLock(true);
    public final C2252321DDq LIZIZ;
    public final C2252321DDq LIZJ;
    public boolean LIZLLL;
    public final AnonymousClass0951 LJ;
    public final AnonymousClass0951 LJFF;

    public abstract NavBackStackEntry LIZ(C20131713pr c20131713pr, Bundle bundle);

    public AbstractC20133613qA() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LIZIZ = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C08CX.INSTANCE);
        this.LIZJ = c2252321DDqLIZ2;
        this.LJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJFF = C09IC.LIZIZ(c2252321DDqLIZ2);
    }

    public void LIZIZ(NavBackStackEntry navBackStackEntry) {
        C2252321DDq c2252321DDq = this.LIZJ;
        c2252321DDq.setValue(C15442062u.LJI(navBackStackEntry, (Set) c2252321DDq.getValue()));
    }

    public void LJ(NavBackStackEntry navBackStackEntry) {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            C2252321DDq c2252321DDq = this.LIZIZ;
            c2252321DDq.setValue(C13LP.LJLILLLLZI(navBackStackEntry, (Collection) c2252321DDq.getValue()));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJFF(NavBackStackEntry navBackStackEntry) {
        Object objLJJLIIIJL = C13LP.LJJLIIIJL((List) this.LJ.getValue());
        if (objLJJLIIIJL != null) {
            C2252321DDq c2252321DDq = this.LIZJ;
            c2252321DDq.setValue(C15442062u.LJIIIIZZ(objLJJLIIIJL, (Set) c2252321DDq.getValue()));
        }
        C2252321DDq c2252321DDq2 = this.LIZJ;
        c2252321DDq2.setValue(C15442062u.LJIIIIZZ(navBackStackEntry, (Set) c2252321DDq2.getValue()));
        LJ(navBackStackEntry);
    }

    public void LIZJ(NavBackStackEntry navBackStackEntry, boolean z) {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            C2252321DDq c2252321DDq = this.LIZIZ;
            Iterable iterable = (Iterable) c2252321DDq.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!Intrinsics.LJFF((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c2252321DDq.setValue(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public void LIZLLL(NavBackStackEntry navBackStackEntry, boolean z) {
        C2252321DDq c2252321DDq = this.LIZJ;
        c2252321DDq.setValue(C15442062u.LJIIIIZZ(navBackStackEntry, (Set) c2252321DDq.getValue()));
        List list = (List) this.LJ.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (!Intrinsics.LJFF(objPrevious, navBackStackEntry) && ((List) this.LJ.getValue()).lastIndexOf(objPrevious) < ((List) this.LJ.getValue()).lastIndexOf(navBackStackEntry)) {
                if (objPrevious != null) {
                    C2252321DDq c2252321DDq2 = this.LIZJ;
                    c2252321DDq2.setValue(C15442062u.LJIIIIZZ(objPrevious, (Set) c2252321DDq2.getValue()));
                }
            }
        }
        LIZJ(navBackStackEntry, z);
    }
}
