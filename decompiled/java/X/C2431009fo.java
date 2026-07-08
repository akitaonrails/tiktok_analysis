package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.09fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2431009fo {
    public static boolean LIZJ(String str) {
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        if (!str.toLowerCase().startsWith("http://") && !str.toLowerCase().startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Activity activity) {
        if (!"mounted".equals(C786410Ut5.X3())) {
            C12ES.LJ(activity, 2130970439, activity.getString(2131839844));
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        try {
            C2429209fW.LIZ().appendDataFlowId(intent, 1207965186);
            LIZ(activity, 10003, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C12ES.LJ(activity, 2130970439, activity.getString(2131839842));
        }
    }

    public static void LJ(Activity activity) {
        if (!"mounted".equals(C786410Ut5.X3())) {
            C12ES.LJ(activity, 2130970439, activity.getString(2131839844));
            return;
        }
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        try {
            C2429209fW.LIZ().appendDataFlowId(intent, 1207965186);
            LIZ(activity, 10003, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C12ES.LJ(activity, 2130970439, activity.getString(2131839842));
        }
    }

    public static String LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        long jLongValue = CastLongProtector.valueOf(str).longValue();
        StringBuilder sb = new StringBuilder();
        do {
            long j = jLongValue % 23;
            jLongValue /= 23;
            if (j > 9) {
                sb.insert(0, (char) ((j + 97) - 10));
            } else {
                sb.insert(0, j);
            }
        } while (jLongValue != 0);
        return sb.toString();
    }

    public static Uri LIZIZ(Context context, File file) {
        if (context != null && Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ), file);
        }
        return Uri.fromFile(file);
    }

    public static void LIZ(Activity activity, int i, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDELHzRFuhQQ==", null));
    }

    public static void LJFF(int i, Activity activity, Fragment fragment) throws Throwable {
        if (!"mounted".equals(C786410Ut5.X3())) {
            C12ES.LJ(activity, 2130970439, activity.getString(2131839844));
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965186);
        try {
            if (fragment != null) {
                C1701330uNH.LIZ(intent, fragment);
                C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDELHzRFuhQQ==", null));
            } else {
                LIZ(activity, i, intent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C12ES.LJ(activity, 2130970439, activity.getString(2131839842));
        }
    }
}
