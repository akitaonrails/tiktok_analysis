package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550010qRD extends AbstractC1550140qRQ implements InterfaceC1313120kH8, InterfaceC1287040jb4 {
    public static final Map<C13IQ<Object>, C1550030qRF<Object>> LJ;
    public final InterfaceC1522470pin LIZJ;
    public final InterfaceC1550070qRJ LIZLLL;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ = linkedHashMap;
        C1550030qRF<InterfaceC1550160qRS> c1550030qRF = C1550040qRG.LIZ;
        linkedHashMap.put(c1550030qRF.LIZ, c1550030qRF);
        C1550030qRF<InterfaceC1550170qRT> c1550030qRF2 = C1550050qRH.LIZ;
        linkedHashMap.put(c1550030qRF2.LIZ, c1550030qRF2);
    }

    @Override // X.InterfaceC1287040jb4
    public final List<String> LIZ() {
        return this.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC1287040jb4
    public final String LIZIZ() {
        return this.LIZLLL.LIZIZ();
    }

    @Override // X.InterfaceC1287040jb4
    public final boolean LIZLLL() {
        this.LIZLLL.LIZLLL();
        return false;
    }

    @Override // X.InterfaceC1287040jb4
    public final String LJ() {
        return this.LIZLLL.LJ();
    }

    @Override // X.InterfaceC1287040jb4
    public final boolean LJFF() {
        this.LIZLLL.LJFF();
        return false;
    }

    public C1550010qRD(C1522450pil c1522450pil, C1522460pim c1522460pim) {
        this.LIZJ = c1522450pil;
        this.LIZLLL = c1522460pim;
    }

    @Override // X.InterfaceC1313120kH8
    public final void LJI(Integer num, JSONObject jSONObject) {
        try {
            this.LIZJ.LIZ(num, jSONObject, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1313120kH8
    public final void LIZJ(Exception exc, String str, Map<String, String> map) {
        try {
            this.LIZJ.LIZJ(exc, str, map);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
