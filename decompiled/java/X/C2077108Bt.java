package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.feed.LiveSamsungFoldScreenDeviceListSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2077108Bt implements InterfaceC2075508Bd, InterfaceC497760Jfa {
    public static final String[] LIZ = LiveSamsungFoldScreenDeviceListSetting.INSTANCE.getConfig();

    @Override // X.InterfaceC497760Jfa
    public final boolean LIZ() {
        if (!u.LJIJI(Build.MANUFACTURER, "Samsung", true)) {
            return false;
        }
        return C13LQ.LJIILLIIL(Build.MODEL, LIZ);
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
                return u.LJIJI(Build.MANUFACTURER, "Samsung", true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isDigHoleScreen Exception: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LIZIZ("SAMSUNG_TAG", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
