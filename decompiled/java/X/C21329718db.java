package X;

import com.tiktok.myna.render.render.MynaElement;

/* JADX INFO: renamed from: X.18db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21329718db {
    public boolean LIZ = false;
    public boolean LIZIZ = false;

    public final void LIZ(MynaElement mynaElement) {
        String str;
        String str2;
        C21329618da c21329618da = mynaElement.bindInfo;
        if (c21329618da != null) {
            String str3 = c21329618da.LJIIIZ;
            if (str3 == null || str3.length() == 0) {
                C21329618da c21329618da2 = mynaElement.bindInfo;
                if (c21329618da2 == null || (str2 = c21329618da2.LJIIJ) == null || str2.length() == 0) {
                    C21329618da c21329618da3 = mynaElement.bindInfo;
                    if (c21329618da3 != null && (str = c21329618da3.LJIIJJI) != null && str.length() != 0) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.LIZ = false;
        this.LIZIZ = false;
    }
}
