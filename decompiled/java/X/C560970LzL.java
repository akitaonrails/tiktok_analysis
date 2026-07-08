package X;

import android.content.Context;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560970LzL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(240));

    public static boolean LIZIZ() {
        return LIZ(C786410Ut5.M3(C0CHQ.LIZ));
    }

    public static boolean LIZLLL() {
        return LIZJ(C786410Ut5.M3(C0CHQ.LIZ));
    }

    public static final boolean LIZ(Context context) {
        if (context == null || !C0XF1.LIZLLL(context) || ((INetworkStateService) LIZ.getValue()).isFakeNetwork()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Context context) {
        if (context == null || !C0XF1.LIZLLL(context)) {
            return false;
        }
        C01GW c01gw = LIZ;
        if (((INetworkStateService) c01gw.getValue()).isFakeNetwork() || ((INetworkStateService) c01gw.getValue()).isWeakNetwork()) {
            return false;
        }
        return true;
    }
}
