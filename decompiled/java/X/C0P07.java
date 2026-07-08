package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0P07, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P07 {
    public static final C0P07 LIZ = new C0P07();

    public static void LIZ(Cert cert, Cert cert2, LocationData locationData, String str, String str2) {
        if (locationData != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            boolean z = true;
            if (locationData.latitude != 0.0d || locationData.longitude != 0.0d) {
                z = false;
            }
            c2344009Gk.LJ(Boolean.valueOf(z), "isZero");
            c2344009Gk.LJIIIIZZ("bpeaCertToken", cert.certToken());
            c2344009Gk.LJIIIIZZ("decryptCertToken", cert2.certToken());
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("business", str);
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
            C20684815ws.LJIILLIIL("location_mob_check_decrypted_result", c2344009Gk.LIZ);
        }
    }
}
