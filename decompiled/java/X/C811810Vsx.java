package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Vsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811810Vsx {
    public static final C2460109kV LJFF = new C2460109kV("AppEngageService");
    public static final Intent LJI = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.android.vending");
    public static final Intent LJII = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.google.android.engage.verifyapp");
    public static C811810Vsx LJIIIIZZ;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C812000VtG LJ;

    public C811810Vsx(Context context) {
        String string;
        boolean z;
        Bundle bundle;
        this.LIZJ = context.getPackageName();
        boolean z2 = false;
        try {
            bundle = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C811880Vt4.LIZ.LIZ("Package name not found.", e, new Object[0]);
        }
        if (bundle != null) {
            string = bundle.getString("com.google.android.engage.service.ENV");
        } else {
            string = null;
        }
        string = string == null ? "DEBUG" : string;
        try {
            String upperCase = string.toUpperCase(Locale.getDefault());
            upperCase.getClass();
            if (!upperCase.equals("DEBUG")) {
                if (upperCase.equals("PRODUCTION")) {
                    if (1 - 1 == 0) {
                        this.LIZLLL = "1.5.5";
                        if (C2460009kU.LIZ(context)) {
                            Context contextN3 = C786410Ut5.N3(context);
                            this.LJ = new C812000VtG(contextN3 == null ? context : contextN3, LJFF, LJI);
                            try {
                            } catch (PackageManager.NameNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            if (C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 0).versionCode < 83441400) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.LIZ = z;
                            try {
                                if (C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 0).versionCode >= 84080000) {
                                    z2 = true;
                                }
                            } catch (PackageManager.NameNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                            this.LIZIZ = z2;
                            return;
                        }
                        this.LJ = null;
                        this.LIZ = false;
                        this.LIZIZ = false;
                        return;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (IllegalArgumentException e4) {
            TryCatchGuardChecker.doCheck(e4);
            C811880Vt4.LIZ.LIZ("Env [" + string + "] is not supported. Supported values: 'debug' and 'production'.", e4, new Object[0]);
        }
        this.LIZLLL = "1.5.5-debug";
        this.LIZ = true;
        this.LIZIZ = true;
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.google.android.engage.verifyapp", 0);
            Context contextN32 = C786410Ut5.N3(context);
            this.LJ = new C812000VtG(contextN32 != null ? contextN32 : context, LJFF, LJII);
        } catch (PackageManager.NameNotFoundException e5) {
            TryCatchGuardChecker.doCheck(e5);
            this.LJ = null;
        }
    }

    public final C835510Wq5 LIZ(C811200Vry c811200Vry) {
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("engage_sdk_version", this.LIZLLL, bundle);
        C786410Ut5.LJJJI("calling_package_name", this.LIZJ, bundle);
        Bundle bundle2 = new Bundle();
        if (!c811200Vry.LIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            AbstractC19875512pd abstractC19875512pd = c811200Vry.LIZ;
            int size = abstractC19875512pd.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C811360VsE) ListProtector.get(abstractC19875512pd, i)).LIZ());
            }
            C786410Ut5.LJJIL(bundle2, "A", arrayList);
        }
        C786410Ut5.LJJIIZI(bundle, bundle2, "clusters_v2");
        if (this.LJ == null) {
            return C835460Wq0.LIZLLL(new C812840Vuc(1));
        }
        if (!this.LIZIZ) {
            C2460109kV c2460109kV = LJFF;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 3)) {
                C2460109kV.LIZLLL(c2460109kV.LIZ, "Publish clusters skipped. Please upgrade your play store version to 40.8 or above.", objArr);
            } else {
                c2460109kV.getClass();
            }
            return C835460Wq0.LJ(new Bundle());
        }
        return LIZIZ(new InterfaceC811950VtB() { // from class: X.0Vt7
            @Override // X.InterfaceC811950VtB
            public final void LIZ(InterfaceC811930Vt9 interfaceC811930Vt9, C835520Wq6 c835520Wq6) {
                interfaceC811930Vt9.LLLJL(bundle, new BinderC812190VtZ(this.LIZ, c835520Wq6));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VtC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C835510Wq5 LIZIZ(final InterfaceC811950VtB interfaceC811950VtB) {
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        final C812000VtG c812000VtG = this.LJ;
        if (c812000VtG == null) {
            return C835460Wq0.LIZLLL(new C812840Vuc(1));
        }
        final ?? r0 = new AbstractRunnableC811970VtD(this, c835520Wq6) { // from class: X.0VtC
            public final /* synthetic */ C811810Vsx LLILZ;

            @Override // X.AbstractRunnableC811970VtD
            public final void LIZIZ() {
                try {
                    InterfaceC811930Vt9 interfaceC811930Vt9 = (InterfaceC811930Vt9) this.LLILZ.LJ.LJIIL;
                    if (interfaceC811930Vt9 != null) {
                        interfaceC811950VtB.LIZ(interfaceC811930Vt9, c835520Wq6);
                    } else {
                        c835520Wq6.LIZJ(new C812840Vuc(2));
                    }
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c835520Wq6.LIZJ(new C812840Vuc(3));
                }
            }

            {
                this.LLILZ = this;
            }
        };
        C786410Ut5.LJJZZIII(c812000VtG.LIZ(), new AbstractRunnableC811970VtD(c835520Wq6) { // from class: X.0VtE
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractRunnableC811970VtD
            public final void LIZIZ() {
                synchronized (c812000VtG.LJFF) {
                    try {
                        final C812000VtG c812000VtG2 = c812000VtG;
                        final C835520Wq6 c835520Wq62 = c835520Wq6;
                        ((HashSet) c812000VtG2.LJ).add(c835520Wq62);
                        c835520Wq62.LIZ.LIZIZ((InterfaceC834580Woa<TResult>) new InterfaceC834580Woa() { // from class: X.0VtF
                            @Override // X.InterfaceC834580Woa
                            public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                                C812000VtG c812000VtG3 = c812000VtG2;
                                C835520Wq6 c835520Wq63 = c835520Wq62;
                                synchronized (c812000VtG3.LJFF) {
                                    try {
                                        ((HashSet) c812000VtG3.LJ).remove(c835520Wq63);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        });
                        if (c812000VtG.LJIIJ.getAndIncrement() > 0) {
                            c812000VtG.LIZIZ.LIZIZ("Already connected to the service.", new Object[0]);
                        }
                        C812000VtG.LIZIZ(c812000VtG, r0);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
        return (C835510Wq5) c835520Wq6.LIZ.LJIIIIZZ(EnumC2272608vM.LL, (InterfaceC835680WqM<TResult, AbstractC835450Wpz<TContinuationResult>>) new InterfaceC835680WqM() { // from class: X.0Vsz
            @Override // X.InterfaceC835680WqM
            public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                C2460109kV c2460109kV = C811810Vsx.LJFF;
                if (abstractC835450Wpz.LJIIL()) {
                    return C835460Wq0.LIZLLL(new C812840Vuc(3));
                }
                if (abstractC835450Wpz.LJIILJJIL()) {
                    BaseBundle baseBundle = (BaseBundle) abstractC835450Wpz.LJIIJ();
                    int i = baseBundle.getInt("service_error_code", -1);
                    String string = baseBundle.getString("service_error_message", "");
                    if (i > 0) {
                        if (!TextUtils.isEmpty(string)) {
                            return C835460Wq0.LIZLLL(new C812840Vuc(i, string));
                        }
                        return C835460Wq0.LIZLLL(new C812840Vuc(i));
                    }
                    return C835460Wq0.LJ(baseBundle);
                }
                Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                if (excLJIIIZ != null) {
                    if (excLJIIIZ instanceof C812060VtM) {
                        return C835460Wq0.LIZLLL(new C812840Vuc(2));
                    }
                    return C835460Wq0.LIZLLL(excLJIIIZ);
                }
                return C835460Wq0.LIZLLL(new C812840Vuc(3));
            }
        });
    }
}
