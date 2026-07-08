package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844660XBo implements Cloneable {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{r='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", a='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("https")) {
            throw new IllegalArgumentException("url protocol should be https");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C844660XBo)) {
            return false;
        }
        C844660XBo c844660XBo = (C844660XBo) obj;
        if (TextUtils.equals(this.LLILLJJLI, c844660XBo.LLILLJJLI) && TextUtils.equals(this.LL, c844660XBo.LL) && TextUtils.equals(this.LLILLL, c844660XBo.LLILLL)) {
            return true;
        }
        return false;
    }

    public C844660XBo(String str, String str2) {
        String strReplace = str.replace("/service/2/device_register/", "/service/2/dsign/");
        LIZ(str);
        this.LL = str;
        LIZ(str2);
        this.LLILLJJLI = str2;
        LIZ(strReplace);
        this.LLILLL = strReplace;
    }
}
