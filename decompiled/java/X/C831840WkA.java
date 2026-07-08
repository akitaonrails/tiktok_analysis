package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.zabh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0WkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831840WkA implements InterfaceC832020WkS, InterfaceC832260Wkq {
    public final Lock LL;
    public final Condition LLILLJJLI;
    public final Context LLILLL;
    public final C829100Wfk LLILZ;
    public final zabh LLILZIL;
    public final Map<C832230Wkn<?>, InterfaceC831160Wj4> LLILZLL;
    public final Map<C832230Wkn<?>, ConnectionResult> LLIZ = new HashMap();
    public final C831470WjZ LLIZLLLIL;
    public final Map<C832010WkR<?>, Boolean> LLJ;
    public final AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> LLJI;
    public volatile InterfaceC831990WkP LLJIJIL;
    public int LLJILJIL;
    public final C831920WkI LLJILJILJ;
    public final InterfaceC832210Wkl LLJILLL;

    @Override // X.InterfaceC832020WkS
    public final boolean LIZJ(InterfaceC832980Wm0 interfaceC832980Wm0) {
        return false;
    }

    @Override // X.InterfaceC832020WkS
    public final void LJ() {
    }

    @Override // X.InterfaceC832020WkS
    public final void LIZLLL() {
        this.LLJIJIL.LJ();
    }

    @Override // X.InterfaceC832020WkS
    public final void LJFF() {
        if (this.LLJIJIL.LJI()) {
            ((HashMap) this.LLIZ).clear();
        }
    }

    @Override // X.InterfaceC832020WkS
    public final boolean LJI() {
        return this.LLJIJIL instanceof C831860WkC;
    }

    public final void LJII() {
        this.LL.lock();
        try {
            this.LLJIJIL = new C831830Wk9(this);
            this.LLJIJIL.LIZLLL();
            this.LLILLJJLI.signalAll();
            this.LL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
        this.LL.lock();
        try {
            this.LLJIJIL.LJFF(i);
            this.LL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC832020WkS
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LIZ(T t) {
        t.LJIIJJI();
        return (T) this.LLJIJIL.LIZIZ(t);
    }

    public final void LJIIIIZZ(AbstractC832250Wkp abstractC832250Wkp) {
        this.LLILZIL.sendMessage(this.LLILZIL.obtainMessage(1, abstractC832250Wkp));
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        this.LL.lock();
        try {
            this.LLJIJIL.LIZJ(bundle);
            this.LL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC832020WkS
    public final void LIZIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.LLJIJIL);
        for (C832010WkR<?> c832010WkR : this.LLJ.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c832010WkR.LIZJ).println(":");
            InterfaceC831160Wj4 interfaceC831160Wj4 = this.LLILZLL.get(c832010WkR.LIZIZ);
            C0W3J.LJIIIIZZ(interfaceC831160Wj4);
            interfaceC831160Wj4.dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    public C831840WkA(Context context, C831920WkI c831920WkI, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, Map map, C831470WjZ c831470WjZ, Map map2, AbstractC831970WkN abstractC831970WkN, ArrayList arrayList, InterfaceC832210Wkl interfaceC832210Wkl) {
        this.LLILLL = context;
        this.LL = lock;
        this.LLILZ = googleApiAvailability;
        this.LLILZLL = map;
        this.LLIZLLLIL = c831470WjZ;
        this.LLJ = map2;
        this.LLJI = abstractC831970WkN;
        this.LLJILJILJ = c831920WkI;
        this.LLJILLL = interfaceC832210Wkl;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C831910WkH) ListProtector.get(arrayList, i)).LLILLL = this;
        }
        this.LLILZIL = new zabh(this, looper);
        this.LLILLJJLI = lock.newCondition();
        this.LLJIJIL = new C831830Wk9(this);
    }
}
