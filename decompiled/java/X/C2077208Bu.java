package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.feed.LiveHuaweiFoldScreenDeviceListSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.08Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2077208Bu implements InterfaceC2075508Bd, InterfaceC497760Jfa {
    public static final List<String> LIZ = Arrays.asList("RLI-AN00", "TET-AN00", "ALT-AL10");

    @Override // X.InterfaceC497760Jfa
    public final boolean LIZ() {
        String str = Build.MODEL;
        C20441214yg.LIZ(str);
        if (LiveHuaweiFoldScreenDeviceListSetting.contains(str)) {
            return true;
        }
        return LIZ.contains(str);
    }

    @Override // X.InterfaceC497760Jfa
    public final int LIZIZ(Configuration configuration) {
        if (!LIZ()) {
            return -1;
        }
        if (configuration != null) {
            float f = (configuration.screenHeightDp * 1.0f) / configuration.screenWidthDp;
            if (f >= 0.75f && f <= 1.3333334f) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC2075508Bd
    public final boolean LIZJ(Context context) {
        try {
            try {
                try {
                    try {
                        Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                        return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
                    } catch (ClassNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LIZIZ("HW_TAG", "hasNotchInScreen ClassNotFoundException");
                        return false;
                    }
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LIZIZ("HW_TAG", "hasNotchInScreen NoSuchMethodException");
                    return false;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20441214yg.LIZIZ("HW_TAG", "hasNotchInScreen Exception");
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
