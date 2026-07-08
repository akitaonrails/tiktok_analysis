package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546050qKp implements InterfaceC1545600qK6 {
    @Override // X.InterfaceC1545600qK6
    public final int LIZ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || iSparkHostApi.LJLLJ() == null) {
            return 0;
        }
        return R.style.xm;
    }

    @Override // X.InterfaceC1545600qK6
    public final int LJ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || iSparkHostApi.LJLLJ() == null) {
            return 0;
        }
        return R.style.y0;
    }

    @Override // X.InterfaceC1545600qK6
    public final Integer LIZIZ(Context context) {
        return C1308910kAL.LIZJ(R.attr.bx, context);
    }

    @Override // X.InterfaceC1545600qK6
    public final boolean LIZJ(Activity activity) {
        if (activity != null) {
            return C960203pA.LIZIZ(activity);
        }
        return false;
    }

    @Override // X.InterfaceC1545600qK6
    public final EnumC1540340qBc LIZLLL(Context context) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null) {
            return EnumC1540340qBc.OTHER;
        }
        iSparkHostApi.LJLLJ().getClass();
        C1308910kAL.LIZ(R.attr.g0d, context);
        String lowerCase = String.valueOf(C1308910kAL.LJIIIIZZ(context)).toLowerCase(Locale.getDefault());
        if (Intrinsics.LJFF(lowerCase, "TikTok Theme Light".toLowerCase(Locale.getDefault()))) {
            return EnumC1540340qBc.LIGHT;
        }
        if (Intrinsics.LJFF(lowerCase, "TikTok Theme Default".toLowerCase(Locale.getDefault()))) {
            return EnumC1540340qBc.LIGHT;
        }
        if (Intrinsics.LJFF(lowerCase, "TikTok Theme Dark".toLowerCase(Locale.getDefault()))) {
            return EnumC1540340qBc.DARK;
        }
        if (Intrinsics.LJFF(lowerCase, "TikTok Theme Const".toLowerCase(Locale.getDefault()))) {
            return EnumC1540340qBc.DARK;
        }
        return EnumC1540340qBc.OTHER;
    }
}
