package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448640HiY {
    public static final C448640HiY LIZ = new C448640HiY();

    public static String LIZ(String str) {
        boolean z;
        String strLIZLLL;
        String string;
        String string2 = a0.LJLIIIL(str).toString();
        if (string2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearch = (IQRCodeServiceForVisualSearch) PluggableExtentionKt.pluggableSpi$default(IQRCodeServiceForVisualSearch.class, false, false, false, 14, null);
        if (iQRCodeServiceForVisualSearch != null && (strLIZLLL = iQRCodeServiceForVisualSearch.LIZLLL(string2)) != null && (string = a0.LJLIIIL(strLIZLLL).toString()) != null && string.length() > 0) {
            return string;
        }
        if (string2.length() <= 0) {
            return null;
        }
        return string2;
    }
}
