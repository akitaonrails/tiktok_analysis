package X;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: X.08SY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SY {
    public static String LIZ(int i) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0VSJ LIZIZ(int i) {
        String absolutePath;
        C844470XAv.LIZ.getClass();
        File fileW2 = C786410Ut5.w2(C844470XAv.LIZ());
        if (fileW2 != null) {
            C2354709Kn.LJI(fileW2);
            absolutePath = fileW2.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        if (!TextUtils.isEmpty(absolutePath)) {
            C0VSJ c0vsj = new C0VSJ(absolutePath, LIZ(i));
            if (c0vsj.exists()) {
                return c0vsj;
            }
        }
        return null;
    }
}
