package X;

import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.00iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C154600iW {
    public static CharSequence LIZ(Text text, InterfaceC1133840fby interfaceC1133840fby) {
        if (text == null) {
            return null;
        }
        String str = text.defaultPattern;
        String str2 = text.key;
        if (str2 != null && str2.length() != 0) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str3 = text.key;
            c1124870fNVLIZJ.getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str3);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                str = strLIZIZ;
            }
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return C1133830fbx.LJIILJJIL(str, text, interfaceC1133840fby);
    }
}
