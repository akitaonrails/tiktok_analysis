package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.tnc.TNCManager;

/* JADX INFO: renamed from: X.0oyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493750oyT implements InterfaceC1494860p0G {
    @Override // X.InterfaceC1494860p0G
    public final InterfaceC1493760oyU get() {
        return new InterfaceC1493760oyU() { // from class: X.0oyQ
            @Override // X.InterfaceC1493760oyU
            public final InterfaceC1494830p0D LIZ(Request request) {
                Context context = TTNetInit.getTTNetDepend().getContext();
                C1493780oyW c1493780oyWLJII = C1493780oyW.LJII(context);
                if (C2104008Mc.LIZIZ(context)) {
                    TNCManager tNCManagerLJI = TNCManager.LJI();
                    c1493780oyWLJII.getClass();
                    C1493780oyW.LJIIJJI = tNCManagerLJI;
                }
                return c1493780oyWLJII.LIZ(request);
            }
        };
    }
}
