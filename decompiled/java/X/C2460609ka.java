package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.09ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2460609ka {
    public final C2460409kY LIZ;

    public C2460609ka(C2460409kY c2460409kY) {
        this.LIZ = c2460409kY;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.09kb] */
    public final C835510Wq5 LIZ(final C10W3 c10w3) {
        final C2460409kY c2460409kY = this.LIZ;
        final C2464409lC c2464409lC = c2460409kY.LIZIZ;
        if (c2464409lC != null) {
            try {
                PackageInfo packageInfoY3 = C786410Ut5.Y3(c2460409kY.LIZ.getPackageManager(), "com.android.vending", 64);
                ApplicationInfo applicationInfo = packageInfoY3.applicationInfo;
                if (applicationInfo != null && applicationInfo.enabled && C2460209kW.LIZ(packageInfoY3.signatures) && packageInfoY3.versionCode >= 82380000) {
                    final C835520Wq6 c835520Wq6 = new C835520Wq6();
                    final ?? r0 = new AbstractRunnableC2461209kg(c835520Wq6) { // from class: X.09kb
                        @Override // X.AbstractRunnableC2461209kg
                        public final void LIZJ() {
                            try {
                                C2460409kY c2460409kY2 = c2460409kY;
                                InterfaceC2460809kc interfaceC2460809kc = (InterfaceC2460809kc) c2460409kY2.LIZIZ.LJIIL;
                                String packageName = c2460409kY2.LIZ.getPackageName();
                                Bundle bundle = new Bundle();
                                bundle.putInt("playcore.version.code", 3);
                                interfaceC2460809kc.LLJJJ(packageName, bundle, new BinderC2460909kd(c2460409kY2, c835520Wq6));
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C10W3 c10w32 = c10w3;
                                C2460309kX c2460309kX = C2460409kY.LIZJ;
                                Object[] objArr = {c10w32};
                                if (Log.isLoggable("PlayCore", 6)) {
                                    C2460309kX.LIZJ(c2460309kX.LIZ, "checkAgeSignals(%s)", objArr);
                                } else {
                                    c2460309kX.getClass();
                                }
                                c835520Wq6.LIZJ(new C812850Vud(-100));
                            }
                        }

                        @Override // X.AbstractRunnableC2461209kg
                        public final void LIZIZ(Exception exc) {
                            if (exc instanceof C2464909lH) {
                                super.LIZIZ(new C812850Vud(-5));
                            } else {
                                super.LIZIZ(exc);
                            }
                        }
                    };
                    C786410Ut5.LJJZZIII(c2464409lC.LIZ(), new AbstractRunnableC2461209kg(c835520Wq6) { // from class: X.09lF
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.AbstractRunnableC2461209kg
                        public final void LIZJ() {
                            final C2464409lC c2464409lC2 = c2464409lC;
                            synchronized (c2464409lC2.LJFF) {
                                try {
                                    final C835520Wq6 c835520Wq62 = c835520Wq6;
                                    ((HashSet) c2464409lC2.LJ).add(c835520Wq62);
                                    c835520Wq62.LIZ.LIZIZ((InterfaceC834580Woa<TResult>) new InterfaceC834580Woa() { // from class: X.09lG
                                        @Override // X.InterfaceC834580Woa
                                        public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                                            C2464409lC c2464409lC3 = c2464409lC2;
                                            C835520Wq6 c835520Wq63 = c835520Wq62;
                                            synchronized (c2464409lC3.LJFF) {
                                                try {
                                                    ((HashSet) c2464409lC3.LJ).remove(c835520Wq63);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    throw th;
                                                }
                                            }
                                        }
                                    });
                                    if (c2464409lC2.LJIIJ.getAndIncrement() > 0) {
                                        c2464409lC2.LIZIZ.LIZ("Already connected to the service.", new Object[0]);
                                    }
                                    C2464409lC.LIZIZ(c2464409lC2, r0);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    });
                    return c835520Wq6.LIZ;
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2460309kX c2460309kX = C2460409kY.LIZJ;
            Object[] objArr = {-6};
            if (Log.isLoggable("PlayCore", 6)) {
                C2460309kX.LIZJ(c2460309kX.LIZ, "onError(%d)", objArr);
            } else {
                c2460309kX.getClass();
            }
            return C835460Wq0.LIZLLL(new C812850Vud(-6));
        }
        C2460309kX c2460309kX2 = C2460409kY.LIZJ;
        Object[] objArr2 = {-2};
        if (Log.isLoggable("PlayCore", 6)) {
            C2460309kX.LIZJ(c2460309kX2.LIZ, "onError(%d)", objArr2);
        } else {
            c2460309kX2.getClass();
        }
        return C835460Wq0.LIZLLL(new C812850Vud(-2));
    }
}
