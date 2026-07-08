package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0lss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374960lss {
    public static final C1374960lss LIZ = new C1374960lss();

    public static AbstractC19483511Kn LIZ(C1374960lss c1374960lss, String str, final String str2, String str3, int i, BaseSharePackage baseSharePackage, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            baseSharePackage = null;
        }
        c1374960lss.getClass();
        if (!C10EU.LJIIIIZZ() && str2 != null && str2.length() != 0) {
            String strLIZ = C1375910luP.LIZ(str, str2, str3, baseSharePackage);
            if (TextUtils.isEmpty(strLIZ)) {
                return null;
            }
            return C621180OYa.LIZIZ.LJIJI(i, str, str3, strLIZ);
        }
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lt1
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                String str4 = str2;
                if (str4 == null) {
                    str4 = "";
                }
                c11ky.onSuccess(str4);
            }
        });
    }
}
