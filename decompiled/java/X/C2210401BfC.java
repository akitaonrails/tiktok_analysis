package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210401BfC implements C0XD4 {
    public final /* synthetic */ C2210131Bel LIZ;

    public C2210401BfC(C2210131Bel c2210131Bel) {
        this.LIZ = c2210131Bel;
    }

    @Override // X.C0XD4
    public final void LIZIZ(final String str, final String str2, final String str3) {
        C2210131Bel c2210131Bel = this.LIZ;
        c2210131Bel.LJII = str;
        c2210131Bel.LJIIIIZZ = str2;
        c2210131Bel.LJIIIZ = str3;
        C2210481BfK c2210481BfK = c2210131Bel.LIZLLL.LJIJJ;
        if (c2210481BfK != null) {
            c2210481BfK.LIZIZ(str, str2, str3);
        }
        this.LIZ.LIZLLL.LJJJJLI.LJIIIZ(str);
        if (!C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("local_did_load", new InterfaceC800590Var() { // from class: X.1BfD
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("appId", this.LIZLLL.LIZ.LIZLLL.LJIIIZ);
                        jSONObject.put("did", str);
                        jSONObject.put("ssid", str3);
                        jSONObject.put("installId", str2);
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    @Override // X.C0XD4
    public final void LIZ(String str, final String str2, String str3, final String str4, boolean z, String str5, final String str6) {
        C2210131Bel c2210131Bel = this.LIZ;
        c2210131Bel.LJII = str2;
        c2210131Bel.LJIIIIZZ = str4;
        c2210131Bel.LJIIIZ = str6;
        C2210481BfK c2210481BfK = c2210131Bel.LIZLLL.LJIJJ;
        if (c2210481BfK != null) {
            c2210481BfK.LIZ(str, str2, str3, str4, z, str5, str6);
        }
        this.LIZ.LIZLLL.LJJJJLI.LJIIIZ(str2);
        if (!C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("device_register_end", new InterfaceC800590Var() { // from class: X.1BfE
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("appId", this.LIZLLL.LIZ.LIZLLL.LJIIIZ);
                        jSONObject.put("did", str2);
                        jSONObject.put("installId", str4);
                        jSONObject.put("ssid", str6);
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return jSONObject;
                    }
                }
            });
        }
    }
}
