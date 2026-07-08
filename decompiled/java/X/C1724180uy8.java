package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import go5.c;
import org.json.JSONArray;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: renamed from: X.0uy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1724180uy8 {
    public final Application LIZ;
    public String LIZIZ;
    public JSONObject LIZJ;
    public JSONArray LIZLLL;
    public JSONObject LJ;
    public JSONArray LJFF;
    public JSONArray LJI;
    public JSONArray LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public InterfaceC1724090uxz LJIIL;
    public String LJIILIIL;
    public AbstractC808800Vo6 LJIILJJIL;
    public InterfaceC1724010uxr LJIILL;
    public String LJIILLIIL;
    public final Cert LJIIZILJ = CertProviderManagerKt.findCert("bpea-pipo_sdk_open_camera", 1476788227);
    public final Cert LJIJ = CertProviderManagerKt.findCert("bpea-ecom_ocr_close_camera", 1476788484);
    public Cert LJIJI;
    public String LJIJJ;
    public InterfaceC1724220uyC LJIJJLI;
    public c LJIL;
    public a$a LJJ;
    public InterfaceC1724190uy9 LJJI;
    public InterfaceC930803kQ LJJIFFI;

    public final C1724170uy7 LIZ() {
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject != null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = jSONObject.optJSONArray("bank_card_rules");
            }
            if (this.LJI == null) {
                this.LJI = this.LIZJ.optJSONArray("methods");
            }
            if (this.LJII == null) {
                this.LJII = this.LIZJ.optJSONArray("stored_methods");
            }
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new JSONArray();
        }
        if (this.LJI == null) {
            this.LJI = new JSONArray();
        }
        if (this.LJII == null) {
            this.LJII = new JSONArray();
        }
        if (this.LJFF == null) {
            this.LJFF = new JSONArray();
        }
        TextUtils.isEmpty(this.LJIIJ);
        if (TextUtils.isEmpty(this.LJIIIIZZ)) {
            C1717770unn.LIZJ().isDebug();
            this.LJIIIIZZ = "k8vif92e";
        }
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            this.LJIIIZ = "bytedance";
        }
        if (TextUtils.isEmpty(this.LJIILIIL)) {
            this.LJIILIIL = "en";
        }
        if (this.LJIIL == null) {
            this.LJIIL = new InterfaceC1724090uxz() { // from class: X.0uyA
                @Override // X.InterfaceC1724090uxz
                public final void onEventV3(String str, JSONObject jSONObject2) {
                }
            };
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = AbstractC808800Vo6.LIZ;
        }
        return new C1724170uy7(this);
    }

    public C1724180uy8(Application application) {
        this.LIZ = application;
    }
}
