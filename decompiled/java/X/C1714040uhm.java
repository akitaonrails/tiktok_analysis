package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0uhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714040uhm {
    public static final C1714040uhm LJII = new C1714040uhm(EnumC1714450uiR.FULL_PAGE, null, 0 == true ? 1 : 0, "default", 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 118);
    public final EnumC1714450uiR LIZ;
    public final Float LIZIZ;
    public final EnumC925903jd LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final HashMap<String, String> LJI;

    public static C1714040uhm LIZ(C1714040uhm c1714040uhm, EnumC1714450uiR enumC1714450uiR, String str, boolean z, int i) {
        Float f;
        EnumC925903jd enumC925903jd;
        String str2;
        boolean z2 = z;
        String str3 = str;
        EnumC1714450uiR enumC1714450uiR2 = enumC1714450uiR;
        if ((i & 1) != 0) {
            enumC1714450uiR2 = c1714040uhm.LIZ;
        }
        HashMap<String, String> map = null;
        if ((i & 2) != 0) {
            f = c1714040uhm.LIZIZ;
        } else {
            f = null;
        }
        if ((i & 4) != 0) {
            enumC925903jd = c1714040uhm.LIZJ;
        } else {
            enumC925903jd = null;
        }
        if ((i & 8) != 0) {
            str3 = c1714040uhm.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c1714040uhm.LJ;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            z2 = c1714040uhm.LJFF;
        }
        if ((i & 64) != 0) {
            map = c1714040uhm.LJI;
        }
        c1714040uhm.getClass();
        return new C1714040uhm(enumC1714450uiR2, f, enumC925903jd, str3, str2, z2, map);
    }

    public C1714040uhm(EnumC1714450uiR enumC1714450uiR, Float f, EnumC925903jd enumC925903jd, String str, String str2, boolean z, HashMap<String, String> map) {
        this.LIZ = enumC1714450uiR;
        this.LIZIZ = f;
        this.LIZJ = enumC925903jd;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = map;
    }

    public /* synthetic */ C1714040uhm(EnumC1714450uiR enumC1714450uiR, Float f, EnumC925903jd enumC925903jd, String str, String str2, boolean z, HashMap map, int i) {
        this(enumC1714450uiR, (i & 2) != 0 ? null : f, (i & 4) != 0 ? EnumC925903jd.NORMAL : enumC925903jd, (i & 8) != 0 ? "default" : str, (i & 16) == 0 ? str2 : "default", (i & 32) != 0 ? true : z, (i & 64) != 0 ? new HashMap() : map);
    }
}
