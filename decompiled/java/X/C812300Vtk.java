package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Vtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812300Vtk {
    public final C818880WAk LIZ;
    public final C812200Vta LIZIZ;
    public final C812350Vtp LIZJ;
    public final InterfaceC812380Vts<InterfaceC812430Vtx> LIZLLL;
    public final InterfaceC812380Vts<InterfaceC812410Vtv> LJ;
    public final InterfaceC812420Vtw LJFF;

    public final AbstractC835450Wpz<String> LIZ(AbstractC835450Wpz<Bundle> abstractC835450Wpz) {
        return abstractC835450Wpz.LJII(new Executor() { // from class: X.0Vtt
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new InterfaceC835680WqM() { // from class: X.0Vtn
            @Override // X.InterfaceC835680WqM
            public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz2) throws IOException {
                this.LIZ.getClass();
                BaseBundle baseBundle = (BaseBundle) abstractC835450Wpz2.LJIIJJI(IOException.class);
                if (baseBundle != null) {
                    String string = baseBundle.getString("registration_id");
                    if (string == null && (string = baseBundle.getString("unregistered")) == null) {
                        String string2 = baseBundle.getString("error");
                        if (!"RST".equals(string2)) {
                            if (string2 != null) {
                                throw new IOException(string2);
                            }
                            throw new IOException("SERVICE_NOT_AVAILABLE");
                        }
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    return string;
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    public final void LIZIZ(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        EnumC812320Vtm enumC812320VtmLIZ;
        C786410Ut5.LJJJI("scope", str2, bundle);
        C786410Ut5.LJJJI("sender", str, bundle);
        C786410Ut5.LJJJI("subtype", str, bundle);
        C818880WAk c818880WAk = this.LIZ;
        c818880WAk.LIZ();
        C786410Ut5.LJJJI("gmp_app_id", c818880WAk.LIZJ.LIZIZ, bundle);
        C812200Vta c812200Vta = this.LIZIZ;
        synchronized (c812200Vta) {
            if (c812200Vta.LIZLLL == 0) {
                try {
                    PackageInfo packageInfoY3 = C786410Ut5.Y3(c812200Vta.LIZ.getPackageManager(), "com.google.android.gms", 0);
                    if (packageInfoY3 != null) {
                        c812200Vta.LIZLLL = packageInfoY3.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i = c812200Vta.LIZLLL;
            } else {
                i = c812200Vta.LIZLLL;
            }
        }
        C786410Ut5.LJJJI("gmsv", Integer.toString(i), bundle);
        C786410Ut5.LJJJI("osv", Integer.toString(Build.VERSION.SDK_INT), bundle);
        C786410Ut5.LJJJI("app_ver", this.LIZIZ.LIZ(), bundle);
        C786410Ut5.LJJJI("app_ver_name", this.LIZIZ.LIZIZ(), bundle);
        C818880WAk c818880WAk2 = this.LIZ;
        c818880WAk2.LIZ();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c818880WAk2.LIZIZ.getBytes()), 11);
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
            strEncodeToString = "[HASH-ERROR]";
        }
        C786410Ut5.LJJJI("firebase-app-name-hash", strEncodeToString, bundle);
        try {
            String strLIZ = ((AbstractC20128113pH) C835460Wq0.LIZ(this.LJFF.getToken())).LIZ();
            if (!TextUtils.isEmpty(strLIZ)) {
                C786410Ut5.LJJJI("Goog-Firebase-Installations-Auth", strLIZ, bundle);
            }
        } catch (InterruptedException | ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        C786410Ut5.LJJJI("appid", (String) C835460Wq0.LIZ(this.LJFF.getId()), bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fcm-");
        sbLIZ.append("23.1.1");
        C786410Ut5.LJJJI("cliv", C2188811AlT.LIZIZ(sbLIZ), bundle);
        InterfaceC812410Vtv interfaceC812410Vtv = this.LJ.get();
        InterfaceC812430Vtx interfaceC812430Vtx = this.LIZLLL.get();
        if (interfaceC812410Vtv != null && interfaceC812430Vtx != null && (enumC812320VtmLIZ = interfaceC812410Vtv.LIZ()) != EnumC812320Vtm.NONE) {
            C786410Ut5.LJJJI("Firebase-Client-Log-Type", Integer.toString(enumC812320VtmLIZ.getCode()), bundle);
            C786410Ut5.LJJJI("Firebase-Client", interfaceC812430Vtx.getUserAgent(), bundle);
        }
    }

    public final AbstractC835450Wpz<Bundle> LIZJ(String str, String str2, final Bundle bundle) {
        int i;
        try {
            LIZIZ(str, str2, bundle);
            final C812350Vtp c812350Vtp = this.LIZJ;
            C812260Vtg c812260Vtg = c812350Vtp.LIZJ;
            synchronized (c812260Vtg) {
                if (c812260Vtg.LIZIZ == 0) {
                    try {
                        PackageInfo packageInfoLIZIZ = C812450Vtz.LIZ(c812260Vtg.LIZ).LIZIZ(0, "com.google.android.gms");
                        if (packageInfoLIZIZ != null) {
                            c812260Vtg.LIZIZ = packageInfoLIZIZ.versionCode;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        new StringBuilder(String.valueOf(e).length() + 23);
                    }
                    i = c812260Vtg.LIZIZ;
                } else {
                    i = c812260Vtg.LIZIZ;
                }
            }
            if (i < 12000000) {
                if (c812350Vtp.LIZJ.LIZ() != 0) {
                    return c812350Vtp.LIZIZ(bundle).LJIIIIZZ(C812350Vtp.LJIIIZ, new InterfaceC835680WqM() { // from class: X.0Vtl
                        @Override // X.InterfaceC835680WqM
                        public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                            BaseBundle baseBundle;
                            C812350Vtp c812350Vtp2 = c812350Vtp;
                            Bundle bundle2 = bundle;
                            c812350Vtp2.getClass();
                            if (abstractC835450Wpz.LJIILJJIL() && (baseBundle = (BaseBundle) abstractC835450Wpz.LJIIJ()) != null && baseBundle.containsKey("google.messenger")) {
                                return c812350Vtp2.LIZIZ(bundle2).LJIILLIIL(C812350Vtp.LJIIIZ, new InterfaceC835700WqO() { // from class: X.0Vto
                                    @Override // X.InterfaceC835700WqO
                                    public final C835510Wq5 then(Object obj) {
                                        BaseBundle baseBundle2 = (BaseBundle) obj;
                                        int i2 = C812350Vtp.LJII;
                                        if (baseBundle2 != null && baseBundle2.containsKey("google.messenger")) {
                                            return C835460Wq0.LJ(null);
                                        }
                                        return C835460Wq0.LJ(baseBundle2);
                                    }
                                });
                            }
                            return abstractC835450Wpz;
                        }
                    });
                }
                return C835460Wq0.LIZLLL(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C811800Vsw c811800VswLIZ = C811800Vsw.LIZ(c812350Vtp.LIZIZ);
            c811800VswLIZ.getClass();
            final int iLIZIZ = c811800VswLIZ.LIZIZ();
            return c811800VswLIZ.LIZJ(new AbstractC812540Vu8<Bundle>(iLIZIZ, bundle) { // from class: X.0VuF
                @Override // X.AbstractC812540Vu8
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.AbstractC812540Vu8
                public final void LIZ(Bundle bundle2) {
                    Bundle bundle3 = bundle2.getBundle("data");
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    LIZLLL(bundle3);
                }
            }).LJII(C812350Vtp.LJIIIZ, new InterfaceC835680WqM() { // from class: X.0Vsv
                @Override // X.InterfaceC835680WqM
                public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) throws IOException {
                    if (abstractC835450Wpz.LJIILJJIL()) {
                        return abstractC835450Wpz.LJIIJ();
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        new StringBuilder(String.valueOf(abstractC835450Wpz.LJIIIZ()).length() + 22);
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", abstractC835450Wpz.LJIIIZ());
                }
            });
        } catch (InterruptedException | ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return C835460Wq0.LIZLLL(e2);
        }
    }

    public C812300Vtk(C818880WAk c818880WAk, C812200Vta c812200Vta, InterfaceC812380Vts<InterfaceC812430Vtx> interfaceC812380Vts, InterfaceC812380Vts<InterfaceC812410Vtv> interfaceC812380Vts2, InterfaceC812420Vtw interfaceC812420Vtw) {
        c818880WAk.LIZ();
        C812350Vtp c812350Vtp = new C812350Vtp(c818880WAk.LIZ);
        this.LIZ = c818880WAk;
        this.LIZIZ = c812200Vta;
        this.LIZJ = c812350Vtp;
        this.LIZLLL = interfaceC812380Vts;
        this.LJ = interfaceC812380Vts2;
        this.LJFF = interfaceC812420Vtw;
    }
}
