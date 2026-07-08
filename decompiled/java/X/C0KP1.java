package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KP1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KP1 implements InterfaceC518120KTq {
    public final C0KNX LIZ;
    public final C0KP2 LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public final Map<String, String> LIZLLL;

    public static final C0KM7 LIZIZ() {
        ISubscribeService iSubscribeService;
        C0KM7 c0km7LIZ;
        Context contextLIZ = C176600m4.LIZ();
        return (contextLIZ == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7LIZ = C0KBB.LIZ(contextLIZ)) == null) ? new C0KM7() : c0km7LIZ;
    }

    public C0KP1(C0KNX c0knx, C0KP2 c0kp2) {
        this.LIZ = c0knx;
        this.LIZIZ = c0kp2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = c0knx.LJ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZLLL = linkedHashMap;
    }
}
