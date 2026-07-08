package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zabc;
import com.google.android.gms.internal.base.zaq;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0WkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831920WkI extends AbstractC831960WkM implements InterfaceC832210Wkl {
    public final Lock LIZIZ;
    public final C831940WkK LIZJ;
    public InterfaceC832020WkS LIZLLL;
    public final int LJ;
    public final Context LJFF;
    public final Looper LJI;
    public volatile boolean LJIIIIZZ;
    public final zabc LJIIJJI;
    public final GoogleApiAvailability LJIIL;
    public C2420409e6 LJIILIIL;
    public final Map<C832230Wkn<?>, InterfaceC831160Wj4> LJIILJJIL;
    public final C831470WjZ LJIILLIIL;
    public final Map<C832010WkR<?>, Boolean> LJIIZILJ;
    public final AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> LJIJ;
    public final ArrayList<C831910WkH> LJIJJ;
    public Integer LJIJJLI;
    public final C832040WkU LJIL;
    public final Queue<AbstractC831980WkO<?, ?>> LJII = new LinkedList();
    public final long LJIIIZ = 120000;
    public final long LJIIJ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public Set<Scope> LJIILL = new HashSet();
    public final C832110Wkb LJIJI = new C832110Wkb();

    @Override // X.AbstractC831960WkM
    public final Context LJIIIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC831960WkM
    public final Looper LJIIJ() {
        return this.LJI;
    }

    @Override // X.AbstractC831960WkM
    public final void LIZLLL() {
        this.LIZIZ.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.LJ >= 0) {
                C0W3J.LJIIJ("Sign-in mode should have been set explicitly by auto-manage.", this.LJIJJLI != null);
            } else {
                Integer num = this.LJIJJLI;
                if (num == null) {
                    this.LJIJJLI = Integer.valueOf(LJIILLIIL(this.LJIILJJIL.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.LJIJJLI;
            C0W3J.LJIIIIZZ(num2);
            int iIntValue = num2.intValue();
            this.LIZIZ.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue == 2) {
                    }
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(iIntValue);
                    C0W3J.LIZ(sb.toString(), z);
                    LJIJ(iIntValue);
                    LJIJI();
                    this.LIZIZ.unlock();
                    this.LIZIZ.unlock();
                    return;
                }
                i = iIntValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(iIntValue);
                C0W3J.LIZ(sb2.toString(), z);
                LJIJ(iIntValue);
                LJIJI();
                this.LIZIZ.unlock();
                this.LIZIZ.unlock();
                return;
            } finally {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ.unlock();
            }
            iIntValue = i;
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // X.AbstractC831960WkM
    public final void LJ() {
        Lock lock;
        boolean zLJI;
        this.LIZIZ.lock();
        try {
            C832040WkU c832040WkU = this.LJIL;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) c832040WkU.LIZ.toArray(new BasePendingResult[0])) {
                basePendingResult.LJI.set(null);
                synchronized (basePendingResult.LIZ) {
                    try {
                        if (basePendingResult.LIZJ.get() == null || !basePendingResult.LJIIL) {
                            basePendingResult.LIZLLL();
                        }
                        zLJI = basePendingResult.LJI();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (zLJI) {
                    c832040WkU.LIZ.remove(basePendingResult);
                }
            }
            InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
            if (interfaceC832020WkS != null) {
                interfaceC832020WkS.LJFF();
            }
            C832110Wkb c832110Wkb = this.LJIJI;
            Iterator<C831430WjV<?>> it2 = c832110Wkb.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ = null;
            }
            c832110Wkb.LIZ.clear();
            for (AbstractC831980WkO<?, ?> abstractC831980WkO : this.LJII) {
                abstractC831980WkO.LJI.set(null);
                abstractC831980WkO.LIZLLL();
            }
            ((LinkedList) this.LJII).clear();
            if (this.LIZLLL == null) {
                lock = this.LIZIZ;
            } else {
                LJIIZILJ();
                C831940WkK c831940WkK = this.LIZJ;
                c831940WkK.LLILZIL = false;
                c831940WkK.LLILZLL.incrementAndGet();
                lock = this.LIZIZ;
            }
            lock.unlock();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LIZIZ.unlock();
            throw th2;
        }
    }

    @Override // X.AbstractC831960WkM
    public final boolean LJIIJJI() {
        InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
        return interfaceC832020WkS != null && interfaceC832020WkS.LJI();
    }

    @Override // X.AbstractC831960WkM
    public final void LJIILIIL() {
        InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
        if (interfaceC832020WkS != null) {
            interfaceC832020WkS.LJ();
        }
    }

    public final boolean LJIIZILJ() {
        if (!this.LJIIIIZZ) {
            return false;
        }
        this.LJIIIIZZ = false;
        this.LJIIJJI.removeMessages(2);
        this.LJIIJJI.removeMessages(1);
        C2420409e6 c2420409e6 = this.LJIILIIL;
        if (c2420409e6 != null) {
            synchronized (c2420409e6) {
                Context context = c2420409e6.LIZ;
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, c2420409e6);
                }
                c2420409e6.LIZ = null;
            }
            this.LJIILIIL = null;
        }
        return true;
    }

    public final void LJIJI() {
        this.LIZJ.LLILZIL = true;
        InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
        C0W3J.LJIIIIZZ(interfaceC832020WkS);
        interfaceC832020WkS.LIZLLL();
    }

    @Override // X.InterfaceC832210Wkl
    public final void LIZ(ConnectionResult connectionResult) {
        if (!this.LJIIL.isPlayServicesPossiblyUpdating(this.LJFF, connectionResult.zzb)) {
            LJIIZILJ();
        }
        if (!this.LJIIIIZZ) {
            C831940WkK c831940WkK = this.LIZJ;
            C0W3J.LIZLLL("onConnectionFailure must only be called on the Handler thread", c831940WkK.LLIZLLLIL);
            c831940WkK.LLIZLLLIL.removeMessages(1);
            synchronized (c831940WkK.LLJ) {
                try {
                    ArrayList<InterfaceC832270Wkr> arrayList = new ArrayList(c831940WkK.LLILZ);
                    int i = c831940WkK.LLILZLL.get();
                    for (InterfaceC832270Wkr interfaceC832270Wkr : arrayList) {
                        if (!c831940WkK.LLILZIL || c831940WkK.LLILZLL.get() != i) {
                            break;
                        } else if (c831940WkK.LLILZ.contains(interfaceC832270Wkr)) {
                            interfaceC832270Wkr.LJJJZ(connectionResult);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C831940WkK c831940WkK2 = this.LIZJ;
            c831940WkK2.LLILZIL = false;
            c831940WkK2.LLILZLL.incrementAndGet();
        }
    }

    @Override // X.InterfaceC832210Wkl
    public final void LIZIZ(Bundle bundle) {
        while (!this.LJII.isEmpty()) {
            LJI((AbstractC831980WkO) ((LinkedList) this.LJII).remove());
        }
        C831940WkK c831940WkK = this.LIZJ;
        C0W3J.LIZLLL("onConnectionSuccess must only be called on the Handler thread", c831940WkK.LLIZLLLIL);
        synchronized (c831940WkK.LLJ) {
            try {
                C0W3J.LJIIJJI(!c831940WkK.LLIZ);
                c831940WkK.LLIZLLLIL.removeMessages(1);
                c831940WkK.LLIZ = true;
                C0W3J.LJIIJJI(c831940WkK.LLILLL.isEmpty());
                ArrayList<InterfaceC832260Wkq> arrayList = new ArrayList(c831940WkK.LLILLJJLI);
                int i = c831940WkK.LLILZLL.get();
                for (InterfaceC832260Wkq interfaceC832260Wkq : arrayList) {
                    if (!c831940WkK.LLILZIL || !c831940WkK.LL.isConnected() || c831940WkK.LLILZLL.get() != i) {
                        break;
                    } else if (!c831940WkK.LLILLL.contains(interfaceC832260Wkq)) {
                        interfaceC832260Wkq.zk(bundle);
                    }
                }
                c831940WkK.LLILLL.clear();
                c831940WkK.LLIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC832210Wkl
    public final void LIZJ(int i) {
        if (i == 1) {
            if (!this.LJIIIIZZ) {
                this.LJIIIIZZ = true;
                if (this.LJIILIIL == null) {
                    try {
                        this.LJIILIIL = this.LJIIL.zac(C786410Ut5.N3(this.LJFF), new AbstractC2420509e7(this) { // from class: X.0WkT
                            public final WeakReference<C831920WkI> LIZ;

                            @Override // X.AbstractC2420509e7
                            public final void LIZ() {
                                C831920WkI c831920WkI = this.LIZ.get();
                                if (c831920WkI == null) {
                                    return;
                                }
                                c831920WkI.LIZIZ.lock();
                                try {
                                    if (c831920WkI.LJIIIIZZ) {
                                        c831920WkI.LJIJI();
                                    }
                                    c831920WkI.LIZIZ.unlock();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c831920WkI.LIZIZ.unlock();
                                    throw th;
                                }
                            }

                            {
                                this.LIZ = new WeakReference<>(this);
                            }
                        });
                    } catch (SecurityException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                zabc zabcVar = this.LJIIJJI;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.LJIIIZ);
                zabc zabcVar2 = this.LJIIJJI;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.LJIIJ);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.LJIL.LIZ.toArray(new BasePendingResult[0])) {
            basePendingResult.LJFF(C832040WkU.LIZJ);
        }
        C831940WkK c831940WkK = this.LIZJ;
        C0W3J.LIZLLL("onUnintentionalDisconnection must only be called on the Handler thread", c831940WkK.LLIZLLLIL);
        c831940WkK.LLIZLLLIL.removeMessages(1);
        synchronized (c831940WkK.LLJ) {
            try {
                c831940WkK.LLIZ = true;
                ArrayList<InterfaceC832260Wkq> arrayList = new ArrayList(c831940WkK.LLILLJJLI);
                int i2 = c831940WkK.LLILZLL.get();
                for (InterfaceC832260Wkq interfaceC832260Wkq : arrayList) {
                    if (!c831940WkK.LLILZIL || c831940WkK.LLILZLL.get() != i2) {
                        break;
                    } else if (c831940WkK.LLILLJJLI.contains(interfaceC832260Wkq)) {
                        interfaceC832260Wkq.Js(i);
                    }
                }
                c831940WkK.LLILLL.clear();
                c831940WkK.LLIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C831940WkK c831940WkK2 = this.LIZJ;
        c831940WkK2.LLILZIL = false;
        c831940WkK2.LLILZLL.incrementAndGet();
        if (i == 2) {
            LJIJI();
        }
    }

    @Override // X.AbstractC831960WkM
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LJI(T t) {
        String str;
        Lock lock;
        C832010WkR<?> c832010WkR = t.LJIILL;
        boolean zContainsKey = this.LJIILJJIL.containsKey(t.LJIILJJIL);
        if (c832010WkR != null) {
            str = c832010WkR.LIZJ;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C0W3J.LIZ(sb.toString(), zContainsKey);
        this.LIZIZ.lock();
        try {
            InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
            if (interfaceC832020WkS != null) {
                if (this.LJIIIIZZ) {
                    ((LinkedList) this.LJII).add(t);
                    while (!this.LJII.isEmpty()) {
                        AbstractC831980WkO abstractC831980WkO = (AbstractC831980WkO) ((LinkedList) this.LJII).remove();
                        C832040WkU c832040WkU = this.LJIL;
                        c832040WkU.LIZ.add(abstractC831980WkO);
                        abstractC831980WkO.LJI.set(c832040WkU.LIZIZ);
                        abstractC831980WkO.LJIILJJIL(Status.RESULT_INTERNAL_ERROR);
                    }
                    lock = this.LIZIZ;
                } else {
                    t = (T) interfaceC832020WkS.LIZ(t);
                    lock = this.LIZIZ;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC831960WkM
    public final InterfaceC831160Wj4 LJIIIIZZ(C832160Wkg c832160Wkg) {
        InterfaceC831160Wj4 interfaceC831160Wj4 = this.LJIILJJIL.get(c832160Wkg);
        C0W3J.LJIIIZ(interfaceC831160Wj4, "Appropriate Api was not requested.");
        return interfaceC831160Wj4;
    }

    @Override // X.AbstractC831960WkM
    public final boolean LJIIL(InterfaceC832980Wm0 interfaceC832980Wm0) {
        InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
        if (interfaceC832020WkS != null && interfaceC832020WkS.LIZJ(interfaceC832980Wm0)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC831960WkM
    public final void LJIILJJIL(C832070WkX c832070WkX) {
        C831940WkK c831940WkK = this.LIZJ;
        c831940WkK.getClass();
        synchronized (c831940WkK.LLJ) {
            try {
                if (!c831940WkK.LLILZ.remove(c832070WkX)) {
                    new StringBuilder(String.valueOf(c832070WkX).length() + 57);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILL(C832070WkX c832070WkX) {
        this.LIZJ.LIZ(c832070WkX);
    }

    public final void LJIJ(int i) {
        String str;
        Integer num = this.LJIJJLI;
        if (num == null) {
            this.LJIJJLI = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str2 = "UNKNOWN";
            if (i == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (i == 2) {
                str = "SIGN_IN_MODE_OPTIONAL";
            } else if (i != 3) {
                str = "UNKNOWN";
            } else {
                str = "SIGN_IN_MODE_NONE";
            }
            int iIntValue = this.LJIJJLI.intValue();
            if (iIntValue == 1) {
                str2 = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue == 2) {
                str2 = "SIGN_IN_MODE_OPTIONAL";
            } else if (iIntValue == 3) {
                str2 = "SIGN_IN_MODE_NONE";
            }
            StringBuilder sb = new StringBuilder(str.length() + 51 + str2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(str);
            sb.append(". Mode was already set to ");
            sb.append(str2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.LIZLLL != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (InterfaceC831160Wj4 interfaceC831160Wj4 : this.LJIILJJIL.values()) {
            zRequiresSignIn |= interfaceC831160Wj4.requiresSignIn();
            zProvidesSignIn |= interfaceC831160Wj4.providesSignIn();
        }
        int iIntValue2 = this.LJIJJLI.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zRequiresSignIn) {
                Context context = this.LJFF;
                Lock lock = this.LIZIZ;
                Looper looper = this.LJI;
                GoogleApiAvailability googleApiAvailability = this.LJIIL;
                Map<C832230Wkn<?>, InterfaceC831160Wj4> map = this.LJIILJJIL;
                C831470WjZ c831470WjZ = this.LJIILLIIL;
                Map<C832010WkR<?>, Boolean> map2 = this.LJIIZILJ;
                AbstractC831970WkN<? extends InterfaceC831550Wjh, C831610Wjn> abstractC831970WkN = this.LJIJ;
                ArrayList<C831910WkH> arrayList = this.LJIJJ;
                C830490Whz c830490Whz = new C830490Whz();
                C830490Whz c830490Whz2 = new C830490Whz();
                InterfaceC831160Wj4 interfaceC831160Wj42 = null;
                for (Map.Entry<C832230Wkn<?>, InterfaceC831160Wj4> entry : map.entrySet()) {
                    InterfaceC831160Wj4 value = entry.getValue();
                    if (true == value.providesSignIn()) {
                        interfaceC831160Wj42 = value;
                    }
                    if (value.requiresSignIn()) {
                        c830490Whz.put(entry.getKey(), value);
                    } else {
                        c830490Whz2.put(entry.getKey(), value);
                    }
                }
                C0W3J.LJIIJ("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c830490Whz.isEmpty());
                C830490Whz c830490Whz3 = new C830490Whz();
                C830490Whz c830490Whz4 = new C830490Whz();
                for (C832010WkR<?> c832010WkR : map2.keySet()) {
                    C832160Wkg<?> c832160Wkg = c832010WkR.LIZIZ;
                    if (c830490Whz.containsKey(c832160Wkg)) {
                        c830490Whz3.put(c832010WkR, map2.get(c832010WkR));
                    } else if (c830490Whz2.containsKey(c832160Wkg)) {
                        c830490Whz4.put(c832010WkR, map2.get(c832010WkR));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C831910WkH c831910WkH = (C831910WkH) ListProtector.get(arrayList, i2);
                    if (c830490Whz3.containsKey(c831910WkH.LL)) {
                        arrayList2.add(c831910WkH);
                    } else if (c830490Whz4.containsKey(c831910WkH.LL)) {
                        arrayList3.add(c831910WkH);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                }
                this.LIZLLL = new C831850WkB(context, this, lock, looper, googleApiAvailability, c830490Whz, c830490Whz2, c831470WjZ, abstractC831970WkN, interfaceC831160Wj42, arrayList2, arrayList3, c830490Whz3, c830490Whz4);
                return;
            }
        } else if (zRequiresSignIn) {
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.LIZLLL = new C831840WkA(this.LJFF, this, this.LIZIZ, this.LJI, this.LJIIL, this.LJIILJJIL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJJ, this);
    }

    public static int LJIILLIIL(Iterable<InterfaceC831160Wj4> iterable, boolean z) {
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (InterfaceC831160Wj4 interfaceC831160Wj4 : iterable) {
            zRequiresSignIn |= interfaceC831160Wj4.requiresSignIn();
            zProvidesSignIn |= interfaceC831160Wj4.providesSignIn();
        }
        if (zRequiresSignIn) {
            if (zProvidesSignIn && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override // X.AbstractC831960WkM
    public final void LJFF(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.LJFF);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.LJIIIIZZ);
        printWriter.append(" mWorkQueue.size()=").print(((LinkedList) this.LJII).size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.LJIL.LIZ.size());
        InterfaceC832020WkS interfaceC832020WkS = this.LIZLLL;
        if (interfaceC832020WkS != null) {
            interfaceC832020WkS.LIZIZ(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Wkm] */
    public C831920WkI(Context context, Lock lock, Looper looper, C831470WjZ c831470WjZ, GoogleApiAvailability googleApiAvailability, C832180Wki c832180Wki, C830490Whz c830490Whz, List list, List list2, C830490Whz c830490Whz2, int i, int i2, ArrayList arrayList) {
        this.LJIJJLI = null;
        ?? r1 = new InterfaceC832950Wlx() { // from class: X.0Wkm
            @Override // X.InterfaceC832950Wlx
            public final boolean isConnected() {
                return this.LL.LJIIJJI();
            }
        };
        this.LJFF = context;
        this.LIZIZ = lock;
        this.LIZJ = new C831940WkK(looper, r1);
        this.LJI = looper;
        this.LJIIJJI = new zabc(this, looper);
        this.LJIIL = googleApiAvailability;
        this.LJ = i;
        if (i >= 0) {
            this.LJIJJLI = Integer.valueOf(i2);
        }
        this.LJIIZILJ = c830490Whz;
        this.LJIILJJIL = c830490Whz2;
        this.LJIJJ = arrayList;
        this.LJIL = new C832040WkU();
        for (Object obj : (ArrayList) list) {
            C831940WkK c831940WkK = this.LIZJ;
            c831940WkK.getClass();
            C0W3J.LJIIIIZZ(obj);
            synchronized (c831940WkK.LLJ) {
                try {
                    if (c831940WkK.LLILLJJLI.contains(obj)) {
                        new StringBuilder(String.valueOf(obj).length() + 62);
                    } else {
                        c831940WkK.LLILLJJLI.add((InterfaceC832260Wkq) obj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c831940WkK.LL.isConnected()) {
                zaq zaqVar = c831940WkK.LLIZLLLIL;
                C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(1, obj));
            }
        }
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            this.LIZJ.LIZ((InterfaceC832270Wkr) it2.next());
        }
        this.LJIILLIIL = c831470WjZ;
        this.LJIJ = c832180Wki;
    }
}
