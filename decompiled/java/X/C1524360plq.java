package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0plq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524360plq implements InterfaceC1304870k3p {
    public static final /* synthetic */ int LIZJ = 0;
    public final ConcurrentHashMap<Integer, C1524410plv> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        C0X9S<?> c0x9s;
        Iterator<Map.Entry<Integer, C1524410plv>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            C1524410plv value = it2.next().getValue();
            if (value.LJIIIIZZ == 0) {
                value.LJIIIIZZ = 1;
                C1502060pBs c1502060pBs = value.LJII;
                if (c1502060pBs != null && (c0x9s = c1502060pBs.LIZIZ.LIZJ) != null) {
                    c0x9s.cancel();
                }
            }
        }
        this.LIZ.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1524380pls LJJZ(X.C1524410plv r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1524360plq.LJJZ(X.0plv):X.0pls");
    }

    @Override // X.InterfaceC1304870k3p
    public final boolean LJFF(int i) {
        return this.LIZIZ.containsKey(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1304870k3p
    public final void LJJLIIIJLJLI(int i) {
        this.LIZIZ.remove(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1304870k3p
    public final void cancel(int i) {
        C0X9S<?> c0x9s;
        if (this.LIZ.contains(Integer.valueOf(i))) {
            C1524410plv c1524410plv = this.LIZ.get(Integer.valueOf(i));
            if (c1524410plv != null && c1524410plv.LJIIIIZZ == 0) {
                c1524410plv.LJIIIIZZ = 1;
                C1502060pBs c1502060pBs = c1524410plv.LJII;
                if (c1502060pBs != null && (c0x9s = c1502060pBs.LIZIZ.LIZJ) != null) {
                    c0x9s.cancel();
                    return;
                }
                return;
            }
            return;
        }
        this.LIZIZ.put(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // X.InterfaceC1304870k3p
    public final void LJJIJLIJ(C1524410plv c1524410plv, InterfaceC1304860k3o interfaceC1304860k3o) {
        this.LIZ.put(Integer.valueOf(c1524410plv.LIZ), c1524410plv);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1304850k3n(c1524410plv, interfaceC1304860k3o, this, null), 3);
    }

    @Override // X.InterfaceC1304870k3p
    public final void LJJLIL(String str, C1301560jyU c1301560jyU) throws JSONException {
        C1524420plw c1524420plw = new C1524420plw(str, "GET");
        c1524420plw.LIZJ = C1524520pm6.LIZ.incrementAndGet();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content-type", "application/json");
        c1524420plw.LJFF = new C1502140pC0(jSONObject, null, 2);
        c1524420plw.LJI = new C1524430plx(null, null);
        c1524420plw.LJ = "arraybuffer";
        LJJIJLIJ(c1524420plw.LIZ(), c1301560jyU);
    }
}
