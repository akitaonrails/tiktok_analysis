package X;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveNetOptV2;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHarmonyOSDisablePipSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Igf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472950Igf {
    public static boolean LIZ;
    public static Boolean LIZIZ;

    public static boolean LIZJ() {
        Boolean bool = LIZIZ;
        if (bool != null) {
            if (!bool.booleanValue()) {
                return false;
            }
        } else {
            if (C497740JfY.LJII() == null || C497740JfY.LJII().getPackageManager() == null) {
                return false;
            }
            if (TopLiveNetOptV2.INSTANCE.getValue().getOptPipOnResume()) {
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                boolean zHasSystemFeature = C497740JfY.LJII().getPackageManager().hasSystemFeature("android.software.picture_in_picture");
                LIZIZ = Boolean.valueOf(zHasSystemFeature);
                if (!zHasSystemFeature) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT < 26 || !C497740JfY.LJII().getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                return false;
            }
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Fi()) {
            return false;
        }
        return ((C2104308Mf.LIZ() && LiveHarmonyOSDisablePipSetting.INSTANCE.getValue()) || LIZ) ? false : true;
    }

    public static boolean LIZLLL() {
        return LIZJ() && LIZ(C497740JfY.LJII()) && InterfaceC1106030et7.c5.LIZIZ().booleanValue();
    }

    public static boolean LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (((AppOpsManager) C786410Ut5.H2(context, "appops")).checkOpNoThrow("android:picture_in_picture", Binder.getCallingUid(), C786410Ut5.N3(context).getPackageName()) == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Activity activity) {
        if (Build.VERSION.SDK_INT < 24 || activity == null || !activity.isInPictureInPictureMode()) {
            return false;
        }
        return true;
    }

    public static void LJ(Context context) {
        if (context == null) {
            return;
        }
        if (!LIZ(context)) {
            InterfaceC1106030et7.c5.LJFF(Boolean.FALSE);
            C20441214yg.LJIIIZ("picture_in_picture", " syncPipPermissionValue LIVE_PIP_SWITCHER_OPEN -> false");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncPipPermissionValue return ");
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.c5;
        sbLIZ.append(c20337914i1.LIZIZ());
        C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
        c20337914i1.LIZIZ().booleanValue();
    }
}
