package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.tnc.TNCManager;

/* JADX INFO: renamed from: X.0oy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493530oy7 implements InterfaceC1493760oyU {
    @Override // X.InterfaceC1493760oyU
    public final InterfaceC1494830p0D LIZ(Request request) {
        InterfaceC1493760oyU interfaceC1493760oyULJII;
        if (request.getExtraInfo() instanceof C1494160oz8) {
            request.getExtraInfo().getClass();
        }
        request.getUrl();
        if (C1493430oxx.LIZ()) {
            interfaceC1493760oyULJII = C1493450oxz.LIZ();
        } else {
            Context context = TTNetInit.getTTNetDepend().getContext();
            interfaceC1493760oyULJII = C1493780oyW.LJII(context);
            if (C2104008Mc.LIZJ(context)) {
                TNCManager tNCManagerLJI = TNCManager.LJI();
                interfaceC1493760oyULJII.getClass();
                C1493780oyW.LJIIJJI = tNCManagerLJI;
            }
        }
        if (interfaceC1493760oyULJII != null) {
            return interfaceC1493760oyULJII.LIZ(request);
        }
        return null;
    }
}
