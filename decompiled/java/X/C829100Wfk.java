package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0Wfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C829100Wfk {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C829090Wfj.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final C829100Wfk zza = new C829100Wfk();

    public static C829100Wfk getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        C829090Wfj.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(Context context) {
        return C829090Wfj.getApkVersion(context);
    }

    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public String getErrorString(int i) {
        return C829090Wfj.getErrorString(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isUserResolvableError(int i) {
        return C829090Wfj.isUserRecoverableError(i);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int iIsGooglePlayServicesAvailable = C829090Wfj.isGooglePlayServicesAvailable(context, i);
        if (C829090Wfj.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        return C829090Wfj.isPlayServicesPossiblyUpdating(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return C829090Wfj.zza(context, str);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i) {
        C829090Wfj.ensurePlayServicesAvailable(context, i);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = C0TIY.LIZ;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && C829120Wfm.LIZ(context)) {
            int i3 = C0TIY.LIZ;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C812450Vtz.LIZ(context).LIZIZ(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String string = sb.toString();
        int i4 = C0TIY.LIZ;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("market://details").buildUpon().appendQueryParameter(FollowStatusChangeMethod.PARAM_UID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, 201326592);
    }
}
