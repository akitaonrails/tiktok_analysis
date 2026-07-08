package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;

/* JADX INFO: renamed from: X.13Vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20021913Vp {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final String LJFF;
    public static final C01GW LJI;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZ = C452501pT.LIZ(enumC452301pR, new C20021613Vm());
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C20022013Vq());
        LIZJ = C452501pT.LIZ(enumC452301pR, new C1446390nk5());
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C20021813Vo());
        LJ = C452501pT.LIZ(enumC452301pR, new C571710MbZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("([0-9a-zA-Z-]+(_[0-9]+)?)");
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("(([0-9a-zA-Z-]+)");
        sbLIZ.append(str);
        sbLIZ.append(")?");
        LJFF = C2188811AlT.LIZIZ(sbLIZ);
        if (!((Boolean) C0AT6.LIZ.getValue()).booleanValue()) {
            enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        }
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new C20022213Vs());
        LJI = c01gwLIZ;
        if (((Boolean) C0ASO.LIZ.getValue()).booleanValue()) {
            return;
        }
        c01gwLIZ.getValue();
    }

    public static final File LIZ() {
        return C0CHQ.LIZ.getFilesDir();
    }

    public static final String LIZIZ() {
        return LIZ().getAbsolutePath();
    }

    public static final String LIZJ(CreativeInfo creativeInfo, String str, EnumC20228214Cy enumC20228214Cy) {
        int iNextInt = AbstractC19994813Le.Default.nextInt(1, 99999);
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(iNextInt);
        String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
        while (new C0VSJ(strLIZLLL).exists()) {
            int iNextInt2 = AbstractC19994813Le.Default.nextInt(1, 99999);
            InterfaceC570310MYj pathService2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('_');
            sbLIZ2.append(iNextInt2);
            strLIZLLL = C2298208zU.LIZLLL(pathService2, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ2), false, 8);
        }
        return strLIZLLL;
    }
}
