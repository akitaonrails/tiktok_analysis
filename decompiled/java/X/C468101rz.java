package X;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.01rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C468101rz {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(int i, Context context, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (str.length() != 0 && i > 0) {
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt.LJIJJ();
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(context);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJIIIIZZ = i;
            c1331670kl3LJIIIZ.LJIIIZ = i;
            c1331670kl3LJIIIZ.LJJII(new C511301yx(c2252611DEt, 5));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLJIJ;
        }
        return null;
    }
}
