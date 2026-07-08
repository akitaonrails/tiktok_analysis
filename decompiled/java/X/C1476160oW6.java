package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1476160oW6 {
    public final ReentrantLock LIZ = new ReentrantLock();
    public final ArrayList<C1471550oOf> LIZIZ = new ArrayList<>();
    public long LIZJ = 0;

    public final C1471550oOf LIZ() {
        this.LIZ.lock();
        if (this.LIZIZ.size() == 0) {
            this.LIZ.unlock();
            return null;
        }
        C1471550oOf c1471550oOf = (C1471550oOf) ListProtector.get(this.LIZIZ, r1.size() - 1);
        this.LIZ.unlock();
        return c1471550oOf;
    }

    public final long LIZJ() {
        this.LIZ.lock();
        long size = this.LIZIZ.size();
        this.LIZ.unlock();
        return size;
    }

    public final C1471550oOf LJFF() {
        this.LIZ.lock();
        if (this.LIZIZ.size() == 0) {
            this.LIZ.unlock();
            return null;
        }
        C1471550oOf c1471550oOf = (C1471550oOf) ListProtector.get(this.LIZIZ, r1.size() - 1);
        this.LIZIZ.remove(c1471550oOf);
        this.LIZ.unlock();
        return c1471550oOf;
    }

    public final ArrayList<C1471550oOf> LJIIIZ() {
        try {
            this.LIZ.lock();
            ArrayList<C1471550oOf> arrayList = new ArrayList<>();
            arrayList.addAll(this.LIZIZ);
            this.LIZ.unlock();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.unlock();
            throw th;
        }
    }

    public final boolean LIZIZ(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        this.LIZ.lock();
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            if (((C1476150oW5) ListProtector.get(this.LIZIZ, i)).LIZLLL(str) != null) {
                bool = Boolean.TRUE;
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return bool.booleanValue();
    }

    public final boolean LIZLLL(C1471550oOf c1471550oOf) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z = false;
        if (c1471550oOf == null || ((CopyOnWriteArrayList) c1471550oOf.LJIILLIIL).size() == 0) {
            return false;
        }
        this.LIZ.lock();
        if (this.LIZJ >= 1) {
            if (this.LIZIZ.size() >= this.LIZJ) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf.booleanValue()) {
            bool = Boolean.FALSE;
        } else {
            this.LIZIZ.add(c1471550oOf);
            bool = Boolean.TRUE;
        }
        this.LIZ.unlock();
        return bool.booleanValue();
    }

    public final C1471550oOf LJ(String str) {
        C1471550oOf c1471550oOf = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C1471550oOf c1471550oOf2 = (C1471550oOf) ListProtector.get(this.LIZIZ, i);
            if (c1471550oOf2.LIZLLL(str) != null) {
                c1471550oOf = c1471550oOf2;
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c1471550oOf;
    }

    public final C1471550oOf LJI(String str) {
        C1471550oOf c1471550oOf = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C1471550oOf c1471550oOf2 = (C1471550oOf) ListProtector.get(this.LIZIZ, i);
            if (c1471550oOf2.LIZLLL(str) != null) {
                c1471550oOf = c1471550oOf2;
                this.LIZIZ.remove(c1471550oOf2);
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c1471550oOf;
    }

    public final void LJII(C1471550oOf c1471550oOf) {
        if (!TextUtils.isEmpty(c1471550oOf.LIZ) && LJIIIIZZ(c1471550oOf.LIZ) != null) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1471550oOf.LJIILLIIL).iterator();
        while (it2.hasNext() && LJI(((C1476220oWC) it2.next()).LIZ) == null) {
        }
    }

    public final C1471550oOf LJIIIIZZ(String str) {
        C1471550oOf c1471550oOf = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZ.lock();
        int i = 0;
        while (true) {
            if (i >= this.LIZIZ.size()) {
                break;
            }
            C1471550oOf c1471550oOf2 = (C1471550oOf) ListProtector.get(this.LIZIZ, i);
            if (!TextUtils.isEmpty(c1471550oOf2.LIZ) && c1471550oOf2.LIZ.equals(str)) {
                c1471550oOf = c1471550oOf2;
                this.LIZIZ.remove(c1471550oOf2);
                break;
            }
            i++;
        }
        this.LIZ.unlock();
        return c1471550oOf;
    }
}
