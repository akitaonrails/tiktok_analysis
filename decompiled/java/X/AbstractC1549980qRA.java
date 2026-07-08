package X;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1549980qRA extends AbstractC1550140qRQ implements InterfaceC1550100qRM {
    public final Uri LIZJ;
    public final C1550020qRE LIZLLL;
    public final Map<String, String> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC1550100qRM
    public final void LJII() {
    }

    @Override // X.InterfaceC1550100qRM
    public final void LJIIIZ() {
    }

    public abstract void LJIIJJI(AbstractC1550060qRI abstractC1550060qRI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    @Override // X.InterfaceC1550100qRM
    public final C1549990qRB LJIIIIZZ() {
        return (C1549990qRB) this.LJFF.getValue();
    }

    public final C1550000qRC LJIIJ() {
        return (C1550000qRC) this.LJI.getValue();
    }

    public AbstractC1549980qRA(Uri uri, C1550020qRE c1550020qRE, Map<String, String> map) {
        this.LIZJ = uri;
        this.LIZLLL = c1550020qRE;
        this.LJ = map;
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS567S0100000_23(this, 208));
        this.LJI = C452501pT.LIZ(enumC452301pR, new AwS567S0100000_23(this, 207));
    }

    public final void LJIILIIL(String str, String str2, Exception exc) {
        InterfaceC1313120kH8 interfaceC1313120kH8 = (InterfaceC1313120kH8) this.LIZLLL.LIZ(InterfaceC1313120kH8.class);
        if (interfaceC1313120kH8 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            linkedHashMap.put("type", str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hybrid ");
            sbLIZ.append(str2);
            sbLIZ.append(" report failed");
            interfaceC1313120kH8.LIZJ(exc, C2188811AlT.LIZIZ(sbLIZ), linkedHashMap);
        }
    }
}
