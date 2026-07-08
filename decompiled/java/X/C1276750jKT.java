package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276750jKT extends C1276670jKL {
    public static final /* synthetic */ int LJIJ = 0;
    public final String LJIILLIIL;
    public final String LJIIZILJ;

    static {
        new C1276760jKU();
    }

    public final int hashCode() {
        return (this.LJIILLIIL.hashCode() * 31) + this.LJIIZILJ.hashCode();
    }

    public final JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mark_id", this.LJIILLIIL);
        jSONObject.put("interact_id", this.LJIIZILJ);
        LIZ(this.LIZJ, "x", jSONObject);
        LIZ(this.LIZLLL, "y", jSONObject);
        LIZ(this.LJ, "w", jSONObject);
        LIZ(this.LJFF, "h", jSONObject);
        LIZ(this.LJIIJJI, "r", jSONObject);
        jSONObject.put("zorder", this.LJI);
        jSONObject.put("render_mode", this.LJIIIIZZ);
        jSONObject.put("alpha", Float.valueOf(this.LJII));
        jSONObject.put("image_url", this.LJIIIZ);
        jSONObject.put("image_process", this.LJIILJJIL);
        jSONObject.put("image_process_value", this.LJIIJ);
        jSONObject.put("image_fill_mode", this.LJIILIIL);
        return jSONObject;
    }

    @Override // X.C1276670jKL
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJIIZILJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1276750jKT) {
            C1276750jKT c1276750jKT = (C1276750jKT) obj;
            c1276750jKT.getClass();
            if (this.LIZJ == c1276750jKT.LIZJ && this.LIZLLL == c1276750jKT.LIZLLL && this.LJ == c1276750jKT.LJ && this.LJFF == c1276750jKT.LJFF && this.LJI == c1276750jKT.LJI && Intrinsics.LJFF(null, null) && this.LJIIIIZZ == c1276750jKT.LJIIIIZZ && this.LJII == c1276750jKT.LJII && Intrinsics.LJFF(this.LJIIIZ, c1276750jKT.LJIIIZ) && this.LJIILJJIL == c1276750jKT.LJIILJJIL && this.LJIIJ == c1276750jKT.LJIIJ && this.LJIILIIL == c1276750jKT.LJIILIIL && Intrinsics.LJFF(this.LJIIZILJ, c1276750jKT.LJIIZILJ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1276750jKT(String str, String str2) {
        this.LJIILLIIL = str;
        this.LJIIZILJ = str2;
    }

    public static void LIZ(double d, String str, JSONObject jSONObject) throws JSONException {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            jSONObject.put(str, d);
        } else {
            jSONObject.put(str, "NaN");
        }
    }
}
