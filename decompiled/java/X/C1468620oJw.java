package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468620oJw {
    public Boolean LIZ;
    public Integer LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Boolean LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Float LJIIJ;
    public Boolean LJIIJJI;
    public Integer LJIIL;
    public Integer LJIILIIL;
    public Integer LJIILJJIL;
    public Boolean LJIILL;
    public Integer LJIILLIIL;
    public Boolean LJIIZILJ;
    public Integer LJIJ;
    public Integer LJIJI;
    public Float LJIJJ;
    public Boolean LJIJJLI;
    public final Map<String, String> LJIL = new HashMap();
    public Boolean LJJ;
    public Integer LJJI;
    public Integer LJJIFFI;
    public Bundle LJJII;

    public final void LIZ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        ((HashMap) this.LJIL).clear();
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean bool = this.LIZ;
            if (bool != null) {
                jSONObject.put("e", bool.booleanValue() ? 1 : 0);
            }
            Integer num = this.LJJI;
            if (num != null) {
                jSONObject.put("st", num);
            }
            Integer num2 = this.LJIIIIZZ;
            if (num2 != null) {
                jSONObject.put("mw", num2);
            }
            Integer num3 = this.LJIIIZ;
            if (num3 != null) {
                jSONObject.put("mh", num3);
            }
            Integer num4 = this.LJJIFFI;
            if (num4 != null) {
                jSONObject.put("sw", num4);
            }
            Integer num5 = this.LJIJ;
            if (num5 != null) {
                jSONObject.put("cw", num5);
            }
            Integer num6 = this.LJIJI;
            if (num6 != null) {
                jSONObject.put("ch", num6);
            }
            Integer num7 = this.LIZIZ;
            if (num7 != null) {
                jSONObject.put("ft", num7);
            }
            Integer num8 = this.LJIIL;
            if (num8 != null) {
                jSONObject.put("cft", num8);
            }
            Long l = this.LIZJ;
            if (l != null) {
                jSONObject.put("mid", l);
            }
            Long l2 = this.LIZLLL;
            if (l2 != null) {
                jSONObject.put("mad", l2);
            }
            Integer num9 = this.LJIILIIL;
            if (num9 != null) {
                jSONObject.put("cd", num9);
            }
            Integer num10 = this.LJFF;
            if (num10 != null) {
                jSONObject.put("ss", num10);
            }
            Integer num11 = this.LJIILLIIL;
            if (num11 != null) {
                jSONObject.put("cs", num11);
            }
            Boolean bool2 = this.LJI;
            if (bool2 != null) {
                jSONObject.put("es", bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.LJIIZILJ;
            if (bool3 != null) {
                jSONObject.put("is", bool3.booleanValue() ? 1 : 0);
            }
            Float f = this.LJIIJ;
            if (f != null) {
                jSONObject.put("mf", f);
            }
            Float f2 = this.LJIJJ;
            if (f2 != null) {
                jSONObject.put("cf", f2);
            }
            Boolean bool4 = this.LJIIJJI;
            if (bool4 != null) {
                jSONObject.put("eh", bool4.booleanValue() ? 1 : 0);
            }
            Boolean bool5 = this.LJIJJLI;
            if (bool5 != null) {
                jSONObject.put("ih", bool5.booleanValue() ? 1 : 0);
            }
            if (this.LJIL != null) {
                jSONObject.put("ei", new JSONObject(this.LJIL));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1468620oJw() {
        LIZ();
    }
}
