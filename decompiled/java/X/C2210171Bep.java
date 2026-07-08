package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2210171Bep implements C0XD6, C0XD3 {
    public final C0XD6 LIZ;
    public final InterfaceC2211291Bgd LIZIZ;
    public JSONObject LIZJ;
    public C0XBN LIZLLL;
    public boolean LJ;

    public final void LIZJ() {
        synchronized (this) {
            try {
                if (this.LJ) {
                    InterfaceC2211291Bgd interfaceC2211291Bgd = this.LIZIZ;
                    JSONObject jSONObject = this.LIZJ;
                    C2210831Bft c2210831Bft = (C2210831Bft) interfaceC2211291Bgd;
                    c2210831Bft.LIZ.LLJJJJ |= 4;
                    C2209911BeP c2209911BeP = c2210831Bft.LIZ;
                    c2209911BeP.LLIZLLLIL.LJII(jSONObject);
                    if ((c2209911BeP.LLJJJJ & 8) == 0) {
                        c2209911BeP.LLJILJILJ.removeMessages(2);
                        C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 2);
                    }
                    c2210831Bft.LIZ.LLILLL.LJJZZI.LJFF(0, C2209911BeP.LLJL, "bdinstall onUpdate", new Object[0]);
                } else {
                    JSONObject jSONObject2 = this.LIZJ;
                    if (jSONObject2 != null && this.LIZLLL != null) {
                        this.LJ = true;
                        C2210831Bft c2210831Bft2 = (C2210831Bft) this.LIZIZ;
                        c2210831Bft2.LIZ.LLJJJJ |= 2;
                        C2209911BeP c2209911BeP2 = c2210831Bft2.LIZ;
                        c2209911BeP2.LLIZLLLIL.LJII(jSONObject2);
                        if ((c2209911BeP2.LLJJJJ & 8) == 0) {
                            c2209911BeP2.LLJILJILJ.removeMessages(2);
                            C786410Ut5.LJLILLLLZI(c2209911BeP2.LLJILJILJ, 2);
                        }
                        c2210831Bft2.LIZ.LLILLL.LJJZZI.LJFF(0, C2209911BeP.LLJL, "bdinstall onLoad", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0XD6
    public final void LIZ(C0XBN c0xbn) {
        this.LIZ.LIZ(c0xbn);
        this.LIZLLL = c0xbn;
        LIZJ();
    }

    @Override // X.C0XD3
    public final void LIZIZ(JSONObject jSONObject) {
        this.LIZJ = jSONObject;
        LIZJ();
    }

    public C2210171Bep(C2210131Bel c2210131Bel, C2210831Bft c2210831Bft) {
        this.LIZ = c2210131Bel;
        this.LIZIZ = c2210831Bft;
    }
}
