package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.13Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20022113Vr implements InterfaceC570310MYj {
    public final C01GW LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC570310MYj
    public final List<File> LJ() {
        List<File> listLJJLL;
        C0VSJ c0vsj = new C0VSJ(this.LJ);
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            return C13BV.INSTANCE;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        return (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) ? C13BV.INSTANCE : listLJJLL;
    }

    @Override // X.InterfaceC570310MYj
    public final String getRoot() {
        return (String) this.LIZ.getValue();
    }

    public C20022113Vr() {
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        String strLIZIZ4;
        this.LIZ = C452501pT.LIZ(((Boolean) C280860Azc.LIZ.getValue()).booleanValue() ? EnumC452301pR.NONE : EnumC452301pR.SYNCHRONIZED, new C20021713Vn());
        if (C287580BOy.LIZ()) {
            strLIZIZ = (String) C20021913Vp.LIZIZ.getValue();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getRoot());
            sbLIZ.append("creative");
            sbLIZ.append(File.separator);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ = strLIZIZ;
        if (C287580BOy.LIZ()) {
            strLIZIZ2 = (String) C20021913Vp.LIZJ.getValue();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(getRoot());
            sbLIZ2.append("public");
            sbLIZ2.append(File.separator);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LIZJ = strLIZIZ2;
        if (C287580BOy.LIZ()) {
            strLIZIZ3 = (String) C20021913Vp.LIZLLL.getValue();
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(getRoot());
            sbLIZ3.append("persistent");
            sbLIZ3.append(File.separator);
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        this.LIZLLL = strLIZIZ3;
        if (C287580BOy.LIZ()) {
            strLIZIZ4 = (String) C20021913Vp.LJ.getValue();
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(getRoot());
            sbLIZ4.append("cache");
            sbLIZ4.append(File.separator);
            strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        this.LJ = strLIZIZ4;
    }

    @Override // X.InterfaceC570310MYj
    public final String LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC570310MYj
    public final String getCacheRoot() {
        return this.LJ;
    }

    @Override // X.InterfaceC570310MYj
    public final String getCreativeRoot() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC570310MYj
    public final String getPersistentRoot() {
        return this.LIZLLL;
    }

    public static String LJIJI(CreativeInfo creativeInfo) {
        String sessionId = creativeInfo.getSessionId();
        if (sessionId != null && sessionId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(creativeInfo.getCreationId());
            sbLIZ.append(File.separator);
            sbLIZ.append(creativeInfo.getSessionId());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return creativeInfo.getCreationId();
    }

    @Override // X.InterfaceC570310MYj
    public final String LIZIZ(CreativeInfo creativeInfo) {
        String strLJIJI = LJIJI(creativeInfo);
        StringBuilder sb = new StringBuilder(this.LIZIZ);
        if (creativeInfo.getVersion() < 0) {
            sb.append(strLJIJI);
            sb.append(File.separator);
            return sb.toString();
        }
        sb.append(strLJIJI);
        String str = File.separator;
        sb.append(str);
        sb.append(creativeInfo.getVersion());
        sb.append(str);
        return sb.toString();
    }

    @Override // X.InterfaceC570310MYj
    public final String LIZLLL(CreativeInfo creativeInfo) {
        return this.LJ + LJIJI(creativeInfo) + File.separator;
    }

    @Override // X.InterfaceC570310MYj
    public final String LJII(CreativeInfo creativeInfo) {
        return this.LIZLLL + LJIJI(creativeInfo) + File.separator;
    }

    @Override // X.InterfaceC570310MYj
    public final String LJIIZILJ(CreativeInfo creativeInfo) {
        return this.LIZIZ + LJIJI(creativeInfo) + File.separator;
    }

    @Override // X.InterfaceC570310MYj
    public final String LJIILIIL(EnumC20227914Cv enumC20227914Cv, String str) {
        return this.LIZJ + enumC20227914Cv.getNameSpace() + File.separator + str;
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIIIIZZ(EnumC20228014Cw enumC20228014Cw, String str, boolean z) {
        StringBuilder sb = new StringBuilder(this.LJ);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(enumC20228014Cw.getNameSpace());
        if (str.length() > 0) {
            sb.append(str2);
            sb.append(str);
        }
        C0VSJ c0vsj = new C0VSJ(sb.toString());
        if (z) {
            C570490MZb.LJFF(c0vsj);
        }
        return c0vsj;
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIIIZ(EnumC20227914Cv enumC20227914Cv, String str, boolean z) {
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(LJIILIIL(enumC20227914Cv, str));
            if (z) {
                C570490MZb.LJI(c0vsj);
            }
            return c0vsj;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIIJ(EnumC20227914Cv enumC20227914Cv, String str, boolean z) {
        C0VSJ c0vsj = new C0VSJ(LJIILIIL(enumC20227914Cv, str));
        if (z) {
            C570490MZb.LJFF(c0vsj);
        }
        return c0vsj;
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LIZ(CreativeInfo creativeInfo, C0MI0 c0mi0, String str, boolean z) {
        C0VSJ c0vsj = new C0VSJ(C2298208zU.LJ(this, creativeInfo, c0mi0, str, 8));
        if (z) {
            C570490MZb.LJFF(c0vsj);
        }
        return c0vsj;
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LIZJ(CreativeInfo creativeInfo, EnumC20228214Cy enumC20228214Cy, String str, boolean z) {
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(C2298208zU.LIZLLL(this, creativeInfo, enumC20228214Cy, str, false, 8));
            if (z) {
                C570490MZb.LJI(c0vsj);
            }
            return c0vsj;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJI(CreativeInfo creativeInfo, EnumC20228014Cw enumC20228014Cw, String str, boolean z) {
        C0VSJ c0vsj = new C0VSJ(C2298208zU.LIZIZ(this, creativeInfo, enumC20228014Cw, str, 8));
        if (z) {
            C570490MZb.LJFF(c0vsj);
        }
        return c0vsj;
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIIJJI(CreativeInfo creativeInfo, EnumC20228014Cw enumC20228014Cw, String str, boolean z) {
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(C2298208zU.LIZIZ(this, creativeInfo, enumC20228014Cw, str, 8));
            if (z) {
                C570490MZb.LJI(c0vsj);
            }
            return c0vsj;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIIL(CreativeInfo creativeInfo, C0MI0 c0mi0, String str, boolean z) {
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(C2298208zU.LJ(this, creativeInfo, c0mi0, str, 8));
            if (z) {
                C570490MZb.LJI(c0vsj);
            }
            return c0vsj;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final String LJIILJJIL(CreativeInfo creativeInfo, EnumC20228214Cy enumC20228214Cy, String str, boolean z) {
        String creationId = creativeInfo.getCreationId();
        if (creationId != null && creationId.length() != 0 && creativeInfo.getVersion() >= 0) {
            StringBuilder sb = new StringBuilder(this.LIZIZ);
            sb.append(LJIJI(creativeInfo));
            String str2 = File.separator;
            sb.append(str2);
            sb.append(creativeInfo.getVersion());
            sb.append(str2);
            sb.append(enumC20228214Cy.getNameSpace());
            if (z) {
                C570490MZb.LJFF(new C0VSJ(sb.toString()));
            }
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final String LJIILL(CreativeInfo creativeInfo, C0MI0 c0mi0, String str, boolean z) {
        String creationId = creativeInfo.getCreationId();
        if (creationId != null && creationId.length() != 0 && creativeInfo.getVersion() >= 0) {
            StringBuilder sb = new StringBuilder(this.LIZLLL);
            sb.append(LJIJI(creativeInfo));
            String str2 = File.separator;
            sb.append(str2);
            sb.append(c0mi0.getNameSpace());
            if (z) {
                C570490MZb.LJFF(new C0VSJ(sb.toString()));
            }
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC570310MYj
    public final C0VSJ LJIILLIIL(CreativeInfo creativeInfo, EnumC20228214Cy enumC20228214Cy, String str, boolean z) {
        C0VSJ c0vsj = new C0VSJ(C2298208zU.LIZLLL(this, creativeInfo, enumC20228214Cy, str, false, 8));
        if (z) {
            C570490MZb.LJFF(c0vsj);
        }
        return c0vsj;
    }

    @Override // X.InterfaceC570310MYj
    public final String LJIJ(CreativeInfo creativeInfo, EnumC20228014Cw enumC20228014Cw, String str, boolean z) {
        String creationId = creativeInfo.getCreationId();
        if (creationId != null && creationId.length() != 0 && creativeInfo.getVersion() >= 0) {
            StringBuilder sb = new StringBuilder(this.LJ);
            sb.append(LJIJI(creativeInfo));
            String str2 = File.separator;
            sb.append(str2);
            sb.append(enumC20228014Cw.getNameSpace());
            if (z) {
                C570490MZb.LJFF(new C0VSJ(sb.toString()));
            }
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
