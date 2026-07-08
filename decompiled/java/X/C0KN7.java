package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KN7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KN7 implements InterfaceC1791700wj2, InterfaceC518120KTq {
    public final C0KNX LIZ;
    public final C0KO6 LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public final Map<String, String> LIZLLL;

    @Override // X.InterfaceC518120KTq
    public final void LIZ(C0KPG c0kpg) {
    }

    public static final C0KM7 LIZLLL() {
        ISubscribeService iSubscribeService;
        C0KM7 c0km7LIZ;
        Context contextLIZ = C176600m4.LIZ();
        return (contextLIZ == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7LIZ = C0KBB.LIZ(contextLIZ)) == null) ? new C0KM7() : c0km7LIZ;
    }

    public C0KN7(C0KNX c0knx, C0KO6 c0ko6) {
        this.LIZ = c0knx;
        this.LIZIZ = c0ko6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = c0knx.LJ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZLLL = linkedHashMap;
    }
}
