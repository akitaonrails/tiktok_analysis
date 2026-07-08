package X;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Wfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C829090Wfj {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static boolean zza;
    public static boolean zzb;
    public static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    public static final AtomicBoolean zzc = new AtomicBoolean();

    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static int getApkVersion(Context context) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), "com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static int getClientVersion(Context context) {
        PackageInfo packageInfoLIZIZ;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfoLIZIZ = C812450Vtz.LIZ(context).LIZIZ(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            packageInfoLIZIZ = null;
        }
        if (packageInfoLIZIZ == null || (applicationInfo = packageInfoLIZIZ.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    public static String getErrorString(int i) {
        return ConnectionResult.LLI(i);
    }

    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C829100Wfk.getInstance().getErrorResolutionIntent(null, i, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return C786410Ut5.m4(context, 3, "com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zza) {
            try {
                PackageInfo packageInfoLIZIZ = C812450Vtz.LIZ(context).LIZIZ(64, "com.google.android.gms");
                C828930WfT.LIZ(context);
                if (packageInfoLIZIZ != null && !C828930WfT.LIZLLL(packageInfoLIZIZ, false) && C828930WfT.LIZLLL(packageInfoLIZIZ, true)) {
                    zzb = true;
                } else {
                    zzb = false;
                }
                zza = true;
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                zza = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                zza = true;
                throw th;
            }
        }
        if (!zzb && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public static boolean isRestrictedUserProfile(Context context) {
        Object objH2 = C786410Ut5.H2(context, "user");
        C0W3J.LJIIIIZZ(objH2);
        Bundle applicationRestrictions = ((UserManager) objH2).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return true;
        }
        return false;
    }

    public static boolean isSidewinderDevice(Context context) {
        if (C829120Wfm.LIZIZ == null) {
            C829120Wfm.LIZIZ = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return C829120Wfm.LIZIZ.booleanValue();
    }

    public static void ensurePlayServicesAvailable(Context context, int i) {
        final int iIsGooglePlayServicesAvailable = C829100Wfk.getInstance().isGooglePlayServicesAvailable(context, i);
        if (iIsGooglePlayServicesAvailable != 0) {
            final Intent errorResolutionIntent = C829100Wfk.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            if (errorResolutionIntent == null) {
                throw new C812710VuP(iIsGooglePlayServicesAvailable);
            }
            final String str = "Google Play Services not available";
            throw new C829180Wfs(iIsGooglePlayServicesAvailable, str, errorResolutionIntent) { // from class: X.0Wfr
                public final int LLILLJJLI;

                public int getConnectionStatusCode() {
                    return this.LLILLJJLI;
                }

                {
                    new Exception(str, errorResolutionIntent) { // from class: X.0Wfs
                        public final Intent LL;

                        public Intent getIntent() {
                            return new Intent(this.LL);
                        }

                        {
                            this.LL = errorResolutionIntent;
                        }
                    };
                    this.LLILLJJLI = iIsGooglePlayServicesAvailable;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829090Wfj.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return C828950WfV.LIZ(context, i);
    }

    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean zza(Context context, String str) {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it2 = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next().getAppPackageName())) {
                    return true;
                }
            }
            try {
                ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), str, 8192);
                if (zEquals) {
                    return applicationInfoV3.enabled;
                }
                if (!applicationInfoV3.enabled || isRestrictedUserProfile(context)) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C829100Wfk.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    public static boolean uidHasPackageName(Context context, int i, String str) {
        return C828950WfV.LIZIZ(context, i, str);
    }
}
