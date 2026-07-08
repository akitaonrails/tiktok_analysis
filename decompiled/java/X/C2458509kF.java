package X;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.09kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2458509kF implements C1BLY {
    public final C2459309kN LIZ;
    public final C2457009k0 LIZIZ;
    public final C08TE LIZJ;
    public final C2121708Sx LIZLLL;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.C1BLY
    public final synchronized void LIZ() {
        this.LIZIZ.LIZ();
    }

    @Override // X.C1BLY
    public final Set<String> LJI() {
        Set<String> setLIZJ = this.LIZJ.LIZJ();
        return setLIZJ == null ? Collections.emptySet() : setLIZJ;
    }

    @Override // X.C1BLY
    public final Set LJFF() {
        if (C08OD.LIZIZ()) {
            C08OD.LIZJ();
        }
        return this.LIZJ.LIZIZ();
    }

    public static List LJIIIIZZ(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Locale) it2.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    @Override // X.C1BLY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC835450Wpz<java.lang.Integer> LIZIZ(final X.C2459809kS r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2458509kF.LIZIZ(X.09kS):X.0Wpz");
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LIZJ(final List<String> list) {
        C2121708Sx c2121708Sx = this.LIZLLL;
        c2121708Sx.getClass();
        synchronized (C2121708Sx.class) {
            try {
                HashSet hashSet = new HashSet(c2121708Sx.LIZ());
                Iterator<String> it2 = list.iterator();
                boolean zAdd = false;
                while (it2.hasNext()) {
                    zAdd |= hashSet.add(it2.next());
                }
                if (zAdd) {
                    try {
                        C810670Vr7.LIZJ(c2121708Sx.LIZ, 0, "playcore_split_install_internal").edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        final C2459309kN c2459309kN = this.LIZ;
        if (c2459309kN.LIZIZ == null) {
            return C2459309kN.LIZLLL();
        }
        C2459309kN.LIZJ.LIZLLL("deferredUninstall(%s)", list);
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        c2459309kN.LIZIZ.LIZJ(new AbstractRunnableC2463609l4(c835520Wq6) { // from class: X.09kJ
            /* JADX WARN: Type inference failed for: r2v1, types: [X.09ln] */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.09kM, android.os.IInterface] */
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                try {
                    C2459309kN c2459309kN2 = c2459309kN;
                    c2459309kN2.LIZIZ.LJIIL.LLLF(c2459309kN2.LIZ, C2459309kN.LIZIZ(list), C2459309kN.LIZJ(), new BinderC2467709lj(c2459309kN, c835520Wq6) { // from class: X.09ln
                        @Override // X.BinderC2467709lj, X.InterfaceC2468209lo
                        public final void u0(Bundle bundle) {
                            super.u0(bundle);
                            this.LL.LIZLLL(null);
                        }
                    });
                } catch (RemoteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2459309kN.LIZJ.LIZJ("deferredUninstall(%s)", e2, list);
                    c835520Wq6.LIZJ(new RuntimeException(e2));
                }
            }
        }, c835520Wq6);
        return c835520Wq6.LIZ;
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LIZLLL(final int i) {
        final C2459309kN c2459309kN = this.LIZ;
        if (c2459309kN.LIZIZ == null) {
            return C2459309kN.LIZLLL();
        }
        C2459309kN.LIZJ.LIZLLL("cancelInstall(%d)", Integer.valueOf(i));
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        c2459309kN.LIZIZ.LIZJ(new AbstractRunnableC2463609l4(c835520Wq6) { // from class: X.09kL
            /* JADX WARN: Type inference failed for: r2v1, types: [X.09ll] */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.09kM, android.os.IInterface] */
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                try {
                    C2459309kN c2459309kN2 = c2459309kN;
                    c2459309kN2.LIZIZ.LJIIL.K0(c2459309kN2.LIZ, i, C2459309kN.LIZJ(), new BinderC2467709lj(c2459309kN, c835520Wq6) { // from class: X.09ll
                        @Override // X.BinderC2467709lj, X.InterfaceC2468209lo
                        public final void LJLJLLL(int i2, Bundle bundle) {
                            super.LJLJLLL(i2, bundle);
                            this.LL.LIZLLL(null);
                        }
                    });
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2459309kN.LIZJ.LIZJ("cancelInstall(%d)", e, Integer.valueOf(i));
                    c835520Wq6.LIZJ(new RuntimeException(e));
                }
            }
        }, c835520Wq6);
        return c835520Wq6.LIZ;
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LJII(final List<String> list) {
        final C2459309kN c2459309kN = this.LIZ;
        if (c2459309kN.LIZIZ == null) {
            return C2459309kN.LIZLLL();
        }
        C2459309kN.LIZJ.LIZLLL("deferredInstall(%s)", list);
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        c2459309kN.LIZIZ.LIZJ(new AbstractRunnableC2463609l4(c835520Wq6) { // from class: X.09kK
            /* JADX WARN: Type inference failed for: r2v1, types: [X.09lm] */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.09kM, android.os.IInterface] */
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                try {
                    C2459309kN c2459309kN2 = c2459309kN;
                    c2459309kN2.LIZIZ.LJIIL.LLLI(c2459309kN2.LIZ, C2459309kN.LIZIZ(list), C2459309kN.LIZJ(), new BinderC2467709lj(c2459309kN, c835520Wq6) { // from class: X.09lm
                        @Override // X.BinderC2467709lj, X.InterfaceC2468209lo
                        public final void LJJZ(Bundle bundle) {
                            super.LJJZ(bundle);
                            this.LL.LIZLLL(null);
                        }
                    });
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2459309kN.LIZJ.LIZJ("deferredInstall(%s)", e, list);
                    c835520Wq6.LIZJ(new RuntimeException(e));
                }
            }
        }, c835520Wq6);
        return c835520Wq6.LIZ;
    }

    @Override // X.C1BLY
    public final boolean LJ(AbstractC2457909k9 abstractC2457909k9, Activity activity) throws IntentSender.SendIntentException {
        if (abstractC2457909k9.LJII() == 8 && abstractC2457909k9.LJFF() != null) {
            activity.startIntentSenderForResult(abstractC2457909k9.LJFF().getIntentSender(), 8, null, 0, 0, 0);
            return true;
        }
        return false;
    }

    public C2458509kF(C2459309kN c2459309kN, C2457009k0 c2457009k0, C08TE c08te, C2121708Sx c2121708Sx) {
        this.LIZ = c2459309kN;
        this.LIZIZ = c2457009k0;
        this.LIZJ = c08te;
        this.LIZLLL = c2121708Sx;
    }
}
