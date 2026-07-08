package X;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BT8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BT8 {
    public static C1BTA LIZ;

    public static C837010WsV LIZ(Bitmap bitmap) {
        C0W3J.LJIIIZ(bitmap, "image must not be null");
        try {
            C1BTA c1bta = LIZ;
            C0W3J.LJIIIZ(c1bta, "IBitmapDescriptorFactory is not initialized");
            return new C837010WsV(c1bta.LLLZIL(bitmap));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
