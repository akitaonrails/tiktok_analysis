package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.jvm.internal.AwS599S0100000_20;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543730qH5 {
    public final C1543410qGZ LIZ;

    public C1543730qH5(C1543410qGZ c1543410qGZ) {
        this.LIZ = c1543410qGZ;
    }

    public final void LIZ(String str, String str2, JSONObject jSONObject, final AwS599S0100000_20 awS599S0100000_20) {
        C1543190qGD c1543190qGD = this.LIZ.LIZ.LIZ;
        C1543200qGE c1543200qGE = c1543190qGD.LIZIZ;
        if (c1543200qGE != null) {
            C1543910qHN c1543910qHN = new C1543910qHN(c1543190qGD);
            c1543910qHN.LJI = str;
            c1543910qHN.LJ = jSONObject.optString("__callback_id", "prefetch_callback");
            c1543910qHN.LJFF = str2;
            c1543910qHN.LJII = jSONObject.optString("__msg_type", "callback");
            c1543910qHN.LJIIIIZZ = jSONObject.optJSONObject("data");
            c1543910qHN.LJIIJ = LivePreviewCTASmartDisplayManager.DEFAULT;
            c1543910qHN.LJIJ = EnumC1543740qH6.Other;
            c1543200qGE.LIZ(c1543910qHN, new InterfaceC1543240qGI() { // from class: X.0qH9
                @Override // X.InterfaceC1543240qGI
                public final void LJFF(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN2) {
                    awS599S0100000_20.invoke(c1543440qGc.LIZIZ());
                }
            }, c1543190qGD, null);
        }
    }
}
