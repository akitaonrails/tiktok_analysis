package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269600j8w extends C1269610j8x {
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public TEBundle LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final String LJIILLIIL;

    @Override // X.C1269610j8x
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(" sequenceNumber:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" eventType:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" nodeMask:");
        sbLIZ.append(C1269570j8t.LIZ(this.LJFF));
        sbLIZ.append(" effectInWidth:");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" effectInHeight:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" videoAdapterParams:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(" encodeWidth:");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(" encodeHeight:");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" encodeFps:");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" extraInfo:");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1269610j8x
    public final JSONObject LIZJ(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_generate");
                JSONObject jSONObject = new JSONObject();
                int i2 = this.LJII;
                if (i2 != 0) {
                    jSONObject.put("effectInWidth", i2);
                }
                int i3 = this.LJIIIIZZ;
                if (i3 != 0) {
                    jSONObject.put("effectInHeight", i3);
                }
                int i4 = this.LJIIIZ;
                if (i4 != 0) {
                    jSONObject.put("effectTurboWidth", i4);
                }
                int i5 = this.LJIIJ;
                if (i5 != 0) {
                    jSONObject.put("effectTurboHeight", i5);
                }
                int i6 = this.LJIILIIL;
                if (i6 != 0) {
                    jSONObject.put("encodeWidth", i6);
                }
                int i7 = this.LJIILJJIL;
                if (i7 != 0) {
                    jSONObject.put("encodeHeight", i7);
                }
                int i8 = this.LJIILL;
                if (i8 != 0) {
                    jSONObject.put("encodeFps", i8);
                }
                if (this.LJIIJJI != null) {
                    jSONObject.put("videoAdapterParams", this.LJIIL);
                }
                jSONObject.put("event_type", this.LIZLLL);
                String str = this.LJ;
                if (str != null) {
                    jSONObject.put("extraInfo", str);
                }
                jSONObjectLIZ.put("event_info", jSONObject);
                return jSONObjectLIZ;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLIZ;
    }

    @Override // X.C1269610j8x
    public final JSONObject LIZLLL(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_handle");
                JSONObject jSONObject = new JSONObject();
                int i2 = this.LJII;
                if (i2 != 0) {
                    jSONObject.put("effectInWidth", i2);
                }
                int i3 = this.LJIIIIZZ;
                if (i3 != 0) {
                    jSONObject.put("effectInHeight", i3);
                }
                int i4 = this.LJIIIZ;
                if (i4 != 0) {
                    jSONObject.put("effectTurboWidth", i4);
                }
                int i5 = this.LJIIJ;
                if (i5 != 0) {
                    jSONObject.put("effectTurboHeight", i5);
                }
                int i6 = this.LJIILIIL;
                if (i6 != 0) {
                    jSONObject.put("encodeWidth", i6);
                }
                int i7 = this.LJIILJJIL;
                if (i7 != 0) {
                    jSONObject.put("encodeHeight", i7);
                }
                int i8 = this.LJIILL;
                if (i8 != 0) {
                    jSONObject.put("encodeFps", i8);
                }
                if (this.LJIIJJI != null) {
                    jSONObject.put("videoAdapterParams", this.LJIIL);
                }
                jSONObject.put("event_type", this.LIZLLL);
                String str = this.LJ;
                if (str != null) {
                    jSONObject.put("extraInfo", str);
                }
                jSONObjectLIZ.put("event_info", jSONObject);
                return jSONObjectLIZ;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLIZ;
    }

    public C1269600j8w(int i, EnumC1269590j8v enumC1269590j8v, int i2, String str) {
        super(i, enumC1269590j8v, i2, str);
        this.LJIILLIIL = "TTLHUpdateVideoParametersEvent";
    }
}
