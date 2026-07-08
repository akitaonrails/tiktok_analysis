package X;

import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.139z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C199657139z implements InterfaceC199652139u {
    public final /* synthetic */ C13A0 LIZ;

    public /* synthetic */ C199657139z(C13A0 c13a0) {
        this.LIZ = c13a0;
    }

    public final void LIZ(Object obj, String str) {
        C13A0 c13a0 = this.LIZ;
        if (c13a0.LIZIZ && obj != null) {
            C13A1 c13a1 = c13a0.LIZ;
            c13a1.getClass();
            String string = UUID.randomUUID().toString();
            ((ConcurrentHashMap) c13a1.LIZ).put(string, new C2031807xc(obj, string, SystemClock.elapsedRealtime(), c13a1.LIZIZ));
        }
    }
}
