package X;

import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;

/* JADX INFO: renamed from: X.0yXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861560yXi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z) {
        if (!z) {
            return false;
        }
        AnonymousClass1425.LIZ.getClass();
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LJIIJJI();
        }
        ITakoNetworkGate iTakoNetworkGate = (ITakoNetworkGate) C21140317o9.LIZ.getValue();
        if (iTakoNetworkGate == null || !iTakoNetworkGate.isOffline()) {
            return false;
        }
        return true;
    }
}
