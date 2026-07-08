package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0v5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728940v5o implements InterfaceC149400hg {
    public static final C1729110v65 LJLZ(String str) {
        if (str != null && str.length() != 0) {
            return (C1729110v65) ((HashMap) C594380NSy.LIZ.getValue()).get(str);
        }
        return null;
    }

    public static final void LLJLILLLLZIIL(String str, boolean z) {
        Keva kevaLIZ = C1729070v61.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_enable_auto_display_");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    public static final void LLZLLIL(C1729110v65 c1729110v65, String str) {
        if (str != null && str.length() != 0) {
            if (c1729110v65 == null) {
                ((HashMap) C594380NSy.LIZ.getValue()).remove(str);
            } else {
                ((HashMap) C594380NSy.LIZ.getValue()).put(str, c1729110v65);
            }
        }
    }
}
