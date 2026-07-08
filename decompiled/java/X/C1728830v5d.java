package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0v5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728830v5d implements InterfaceC149400hg {
    public static final C1729210v6F LJLZ(String str) {
        if (str != null && str.length() != 0) {
            return (C1729210v6F) ((HashMap) C1728840v5e.LIZ.getValue()).get(str);
        }
        return null;
    }

    public static final void LLJLILLLLZIIL(C1729210v6F c1729210v6F, String str) {
        if (str != null && str.length() != 0) {
            if (c1729210v6F == null) {
                ((HashMap) C1728840v5e.LIZ.getValue()).remove(str);
            } else {
                ((HashMap) C1728840v5e.LIZ.getValue()).put(str, c1729210v6F);
            }
        }
    }
}
