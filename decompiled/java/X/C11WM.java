package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11WM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11WM extends C11WS {
    public final boolean LIZ;
    public boolean LIZLLL;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJ = -1;
    public String LJFF = "";
    public String LJI = "";
    public String LJIIL = "";
    public Map<String, String> LJIILIIL = new LinkedHashMap();

    public C11WM(boolean z) {
        this.LIZ = z;
    }

    @Override // X.C11WS
    public void LIZ(Map<String, String> map) {
        boolean z;
        this.LJIILIIL = map;
        String str = map.get("title");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LIZJ = str;
        String str3 = map.get("url");
        if (str3 == null) {
            str3 = "";
        }
        this.LIZIZ = str3;
        String str4 = map.get("anchor_type");
        if (str4 == null) {
            str4 = "";
        }
        this.LJII = str4;
        String str5 = map.get("anchor_subtype");
        if (str5 == null) {
            str5 = "";
        }
        this.LJI = str5;
        String str6 = map.get("noRedirect");
        boolean z2 = false;
        if (str6 != null && u.LJIJI(str6, "true", true)) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        String str7 = map.get("show_keyboard");
        if (str7 != null && str7.equals("1")) {
            z2 = true;
        }
        this.LJIIIZ = z2;
        this.LJIIL = this.LIZJ;
        String str8 = map.get("fcp_anchor_spark");
        if (str8 != null) {
            str8.equals("1");
        }
        String str9 = map.get("url");
        if (str9 != null) {
            str2 = str9;
        }
        this.LJIIJ = str2;
    }
}
