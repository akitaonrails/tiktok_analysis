package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0jKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276760jKU {
    public static C1276750jKT LIZJ(String str, String str2) {
        EnumC1276720jKQ enumC1276720jKQ = EnumC1276720jKQ.ALTERNATE_IMAGE_PROCESS_NONE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("external_");
        sbLIZ.append(str);
        C1276750jKT c1276750jKT = new C1276750jKT(C2188811AlT.LIZIZ(sbLIZ), "");
        c1276750jKT.LJ = 1.0f;
        c1276750jKT.LJFF = 1.0f;
        c1276750jKT.LJIIIZ = str2;
        c1276750jKT.LJIIIIZZ = EnumC1276740jKS.RENDER_HIDDEN;
        c1276750jKT.LJIILL = EnumC1276690jKN.MIXED_STREAM_RENDER_MODE_BOTTOM_CROP;
        c1276750jKT.LJI = 0;
        c1276750jKT.LJIILIIL = EnumC1276730jKR.ALTERNATE_IMAGE_FILL_MODE;
        c1276750jKT.LJIILJJIL = enumC1276720jKQ;
        return c1276750jKT;
    }

    public static C1276750jKT LIZIZ(String str, C1282280jTO c1282280jTO, EnumC1276740jKS enumC1276740jKS, EnumC1276730jKR enumC1276730jKR) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal_");
        sbLIZ.append(str);
        C1276750jKT c1276750jKT = new C1276750jKT(C2188811AlT.LIZIZ(sbLIZ), c1282280jTO.LJII);
        c1276750jKT.LIZJ = (float) c1282280jTO.LIZ;
        c1276750jKT.LIZLLL = (float) c1282280jTO.LIZIZ;
        c1276750jKT.LJ = (float) c1282280jTO.LIZJ;
        c1276750jKT.LJFF = (float) c1282280jTO.LIZLLL;
        c1276750jKT.LJI = 1;
        c1276750jKT.LJIIIIZZ = enumC1276740jKS;
        c1276750jKT.LJIILIIL = enumC1276730jKR;
        c1276750jKT.LJIILJJIL = EnumC1276720jKQ.ALTERNATE_IMAGE_PROCESS_NONE;
        return c1276750jKT;
    }

    public static C1276750jKT LIZ(String str, RectF rectF, String str2, int i, EnumC1276740jKS enumC1276740jKS, EnumC1276730jKR enumC1276730jKR) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal_");
        sbLIZ.append(str);
        C1276750jKT c1276750jKT = new C1276750jKT(C2188811AlT.LIZIZ(sbLIZ), str2);
        c1276750jKT.LIZJ = rectF.left;
        c1276750jKT.LIZLLL = rectF.top;
        c1276750jKT.LJ = rectF.width();
        c1276750jKT.LJFF = rectF.height();
        c1276750jKT.LJI = i;
        c1276750jKT.LJIIIIZZ = enumC1276740jKS;
        c1276750jKT.LJIILIIL = enumC1276730jKR;
        c1276750jKT.LJIILJJIL = EnumC1276720jKQ.ALTERNATE_IMAGE_PROCESS_NONE;
        return c1276750jKT;
    }
}
