package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0zoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910500zoe implements InterfaceC1141530foN {
    public Organization LLILLJJLI;
    public InterfaceC1910510zof LLILZ;
    public Map<String, String> LL = C2097608Jq.LJ();
    public String LLILLL = "";

    public final void LIZIZ() {
        C1548820qPI.LIZLLL("donation_added_nonprofit", this);
        C1548820qPI.LIZLLL("donation_updated_nonprofit", this);
        C1548820qPI.LIZLLL("donation_removed_nonprofit", this);
        C1548820qPI.LIZLLL("donation_show_amplify_share", this);
        C1548820qPI.LIZLLL("donation_add_to_post", this);
    }

    public final void LIZLLL() {
        C1548820qPI.LJIIIIZZ("donation_added_nonprofit", this);
        C1548820qPI.LJIIIIZZ("donation_updated_nonprofit", this);
        C1548820qPI.LJIIIIZZ("donation_removed_nonprofit", this);
        C1548820qPI.LJIIIIZZ("donation_show_amplify_share", this);
        C1548820qPI.LJIIIIZZ("donation_add_to_post", this);
    }

    public static Map LIZ(InterfaceC1107590evd interfaceC1107590evd) {
        Map<String, Object> mapLIZ;
        InterfaceC1107590evd map = interfaceC1107590evd.getMap("loggingData");
        if (map != null && (mapLIZ = map.LIZ()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            return linkedHashMap;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Map<String, String> mapLJ;
        Map<String, String> mapLJ2;
        Map<String, String> mapLJ3;
        boolean z;
        Map<String, String> mapLJ4;
        Map<String, String> mapLJ5;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (mapLJ = LIZ(interfaceC1107590evd)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        this.LL = mapLJ;
        String str = c262100zr.LIZ;
        Organization organizationLIZJ = null;
        switch (str.hashCode()) {
            case -1521356763:
                if (str.equals("donation_added_nonprofit")) {
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null) {
                        organizationLIZJ = LIZJ(interfaceC1107590evd2, "donation_added_nonprofit");
                    }
                    this.LLILLJJLI = organizationLIZJ;
                    this.LLILLL = "donation_added_nonprofit";
                    InterfaceC1910510zof interfaceC1910510zof = this.LLILZ;
                    if (interfaceC1910510zof != null) {
                        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd3 == null || (mapLJ2 = LIZ(interfaceC1107590evd3)) == null) {
                            mapLJ2 = C2097608Jq.LJ();
                        }
                        interfaceC1910510zof.LJI(organizationLIZJ, mapLJ2);
                    }
                }
                break;
            case -1191855776:
                if (str.equals("donation_updated_nonprofit")) {
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null) {
                        organizationLIZJ = LIZJ(interfaceC1107590evd4, "donation_updated_nonprofit");
                    }
                    this.LLILLJJLI = organizationLIZJ;
                    this.LLILLL = "donation_updated_nonprofit";
                    InterfaceC1910510zof interfaceC1910510zof2 = this.LLILZ;
                    if (interfaceC1910510zof2 != null) {
                        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd5 == null || (mapLJ3 = LIZ(interfaceC1107590evd5)) == null) {
                            mapLJ3 = C2097608Jq.LJ();
                        }
                        interfaceC1910510zof2.LIZLLL(organizationLIZJ, mapLJ3);
                    }
                }
                break;
            case -1018316097:
                if (str.equals("donation_show_amplify_share")) {
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        organizationLIZJ = LIZJ(interfaceC1107590evd6, "donation_show_amplify_share");
                    }
                    this.LLILLJJLI = organizationLIZJ;
                    this.LLILLL = "donation_show_amplify_share";
                    InterfaceC1910510zof interfaceC1910510zof3 = this.LLILZ;
                    if (interfaceC1910510zof3 != null) {
                        InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd7 != null) {
                            z = interfaceC1107590evd7.getBoolean("hasFundraiserInProfile");
                        } else {
                            z = false;
                        }
                        InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd8 == null || (mapLJ4 = LIZ(interfaceC1107590evd8)) == null) {
                            mapLJ4 = C2097608Jq.LJ();
                        }
                        interfaceC1910510zof3.LJFF(organizationLIZJ, z, mapLJ4);
                    }
                }
                break;
            case 275652889:
                if (str.equals("donation_add_to_post")) {
                    InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd9 != null) {
                        organizationLIZJ = LIZJ(interfaceC1107590evd9, "donation_add_to_post");
                    }
                    this.LLILLJJLI = organizationLIZJ;
                    this.LLILLL = "donation_add_to_post";
                    InterfaceC1910510zof interfaceC1910510zof4 = this.LLILZ;
                    if (interfaceC1910510zof4 != null) {
                        InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd10 == null || (mapLJ5 = LIZ(interfaceC1107590evd10)) == null) {
                            mapLJ5 = C2097608Jq.LJ();
                        }
                        interfaceC1910510zof4.LJ(organizationLIZJ, mapLJ5);
                    }
                }
                break;
            case 1972463301:
                if (str.equals("donation_removed_nonprofit")) {
                    this.LLILLJJLI = null;
                    this.LLILLL = "donation_removed_nonprofit";
                    InterfaceC1910510zof interfaceC1910510zof5 = this.LLILZ;
                    if (interfaceC1910510zof5 != null) {
                        interfaceC1910510zof5.LIZJ();
                    }
                }
                break;
        }
    }

    public static Organization LIZJ(InterfaceC1107590evd interfaceC1107590evd, String str) {
        C1872780ypo.LIZ.getClass();
        try {
            return (Organization) C7740030o.LIZ().getGson().LJII(C786410Ut5.J3(C1872780ypo.LIZIZ(interfaceC1107590evd)), Organization.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("action", str);
            C20684815ws.LJIILLIIL("customize_fundraiser_jsb_org_parse_error", c0lab.LIZ);
            C2344809Gs.LJI(e);
            return null;
        }
    }
}
