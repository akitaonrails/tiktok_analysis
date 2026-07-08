package X;

import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import kotlin.jvm.internal.AFwS206S0000000_18;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163670gO5 implements InterfaceC1292250jjT {
    public static final C1163670gO5 LIZ = new C1163670gO5();
    public static volatile Double LIZIZ = Double.valueOf(-1.0d);
    public static boolean LIZJ = true;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(722));
    public static final InterfaceC1162920gMs LJ;

    @Override // X.InterfaceC1292250jjT
    public final String name() {
        return "fps";
    }

    static {
        InterfaceC1162920gMs interfaceC1162920gMsNt0 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).nt0("live_fluency_for_test");
        LJ = interfaceC1162920gMsNt0;
        interfaceC1162920gMsNt0.LIZIZ(new C0VVO() { // from class: X.0gO6
            @Override // X.C0VVO
            public final void LIZIZ(double d) {
                C1163670gO5 c1163670gO5 = C1163670gO5.LIZ;
                C1163670gO5.LIZIZ = Double.valueOf(d);
            }
        });
        interfaceC1162920gMsNt0.LIZJ(null);
    }

    @Override // X.InterfaceC1292250jjT
    public final JSONObject LIZ() throws JSONException {
        InterfaceC1162920gMs interfaceC1162920gMs = LJ;
        interfaceC1162920gMs.stop();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fps", LIZIZ);
        if (LIZJ) {
            interfaceC1162920gMs.LIZJ(null);
        }
        return jSONObject;
    }
}
