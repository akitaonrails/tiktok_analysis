package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8O implements C0V8P {
    public final C0V8P LIZ;

    @Override // X.C0V8P
    public final C823150WQv<C0V88> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // X.C0V8P
    public final long LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.C0V8P
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // X.C0V8P
    public final void start() {
        this.LIZ.start();
    }

    public C0V8O() {
        if (C792400V6o.LJIIIZ()) {
            this.LIZ = new C0V8N();
        } else {
            this.LIZ = new C0V8U();
        }
    }

    @Override // X.C0V8P
    public final void LIZLLL(double d) {
        this.LIZ.LIZLLL(d);
    }

    @Override // X.C0V8P
    public final void LJI(JSONObject jSONObject) {
        this.LIZ.LJI(jSONObject);
    }

    @Override // X.C0V8P
    public final void LJII(double d) {
        this.LIZ.LJII(d);
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIZ(String str) {
        return this.LIZ.LJIIIZ(str);
    }

    @Override // X.C0V8P
    public final void LJIIJJI(String str) {
        this.LIZ.LJIIJJI(str);
    }

    @Override // X.C0V8P
    public final void LJJLIIIJ(String str) {
        this.LIZ.LJJLIIIJ(str);
    }

    @Override // X.C0V8P
    public final void LJ(String str, JSONObject jSONObject) {
        this.LIZ.LJ(str, jSONObject);
    }

    @Override // X.C0V8P
    public final void LJFF(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BizTrafficStats.trafficStats ");
            sbLIZ.append(j);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LJFF(j, str, str2, str3, jSONObject, jSONObject2);
    }
}
