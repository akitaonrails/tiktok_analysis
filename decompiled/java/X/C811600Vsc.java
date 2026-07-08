package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811600Vsc {
    public static final Object LIZJ = new Object();
    public static ServiceConnectionC811720Vso LIZLLL;
    public final Context LIZ;
    public final ExecutorC811650Vsh LIZIZ = new ExecutorC811650Vsh();

    public C811600Vsc(Context context) {
        this.LIZ = context;
    }

    public static ServiceConnectionC811720Vso LIZJ(Context context) {
        ServiceConnectionC811720Vso serviceConnectionC811720Vso;
        synchronized (LIZJ) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = new ServiceConnectionC811720Vso(context);
                }
                serviceConnectionC811720Vso = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return serviceConnectionC811720Vso;
    }

    public final AbstractC835450Wpz<Integer> LIZIZ(final Intent intent) {
        String stringExtra;
        boolean z;
        try {
            stringExtra = intent.getStringExtra("gcm.rawData64");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        boolean z2 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.LIZ;
        if (C811660Vsi.LIZ() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return LIZ(context, intent);
        }
        return C835460Wq0.LIZJ(this.LIZIZ, new Callable() { // from class: X.0VO5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                C1C7U.LIZ("FcmBroadcastProcessor@f037.startMessagingService$1L");
                C790540Uzk c790540UzkLIZ = C790540Uzk.LIZ();
                ((ArrayDeque) c790540UzkLIZ.LIZLLL).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c790540UzkLIZ) {
                    str = c790540UzkLIZ.LIZ;
                    if (str == null) {
                        ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                            str = null;
                        } else {
                            if (str2.startsWith(e3.d)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(context2.getPackageName());
                                sbLIZ.append(serviceInfo.name);
                                c790540UzkLIZ.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                c790540UzkLIZ.LIZ = serviceInfo.name;
                            }
                            str = c790540UzkLIZ.LIZ;
                        }
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i = (c790540UzkLIZ.LIZJ(context2) ? C811610Vsd.LIZJ(context2, intent3) : C786410Ut5.s3(context2, intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    i = 402;
                } catch (SecurityException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    i = 401;
                }
                Integer numValueOf = Integer.valueOf(i);
                C1C7U.LIZIZ("FcmBroadcastProcessor@f037.startMessagingService$1L");
                return numValueOf;
            }
        }).LJIIIIZZ(this.LIZIZ, new InterfaceC835680WqM() { // from class: X.0Vse
            @Override // X.InterfaceC835680WqM
            public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                Context context2 = context;
                Intent intent2 = intent;
                if (C811660Vsi.LIZ() && ((Integer) abstractC835450Wpz.LJIIJ()).intValue() == 402) {
                    return C811600Vsc.LIZ(context2, intent2).LJII(new ExecutorC811650Vsh(), new InterfaceC835680WqM() { // from class: X.0Vsg
                        @Override // X.InterfaceC835680WqM
                        public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz2) {
                            return 403;
                        }
                    });
                }
                return abstractC835450Wpz;
            }
        });
    }

    public final AbstractC835450Wpz LIZLLL(Intent intent) {
        if (C809750Vpd.LIZ()) {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJIJ("from_firebase_to_fcm", "", false);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            C818260W8a.LJI("FcmBroadcastProcessor.process() lancet hook", EnumC809870Vpp.FIREBASE, EnumC818290W8d.INFO);
            c810890VrT.LJ("FcmBroadcastProcessor_process", true);
            AbstractC835450Wpz<Integer> abstractC835450WpzLIZIZ = LIZIZ(intent);
            c810890VrT.LJIJ("FcmBroadcastProcessor_process", "", false);
            c810890VrT.LJ("from_fcm_to_enhanced", false);
            return abstractC835450WpzLIZIZ;
        }
        return LIZIZ(intent);
    }

    public static C835510Wq5 LIZ(Context context, final Intent intent) {
        if (C790540Uzk.LIZ().LIZJ(context)) {
            ServiceConnectionC811720Vso serviceConnectionC811720VsoLIZJ = LIZJ(context);
            synchronized (C811610Vsd.LIZIZ) {
                try {
                    C811610Vsd.LIZ(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        C811610Vsd.LIZJ.LIZ(C811610Vsd.LIZ);
                    }
                    serviceConnectionC811720VsoLIZJ.LIZIZ(intent).LIZIZ(new InterfaceC834580Woa() { // from class: X.0Vsf
                        @Override // X.InterfaceC834580Woa
                        public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                            C811610Vsd.LIZIZ(intent);
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            LIZJ(context).LIZIZ(intent);
        }
        return C835460Wq0.LJ(-1);
    }
}
