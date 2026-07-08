package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0v5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728670v5N implements InterfaceC149400hg {
    public static final C1729160v6A LJLZ(String str) {
        if (str != null && str.length() != 0) {
            return (C1729160v6A) ((HashMap) C1728690v5P.LIZ.getValue()).get(str);
        }
        return null;
    }

    public static final void LLJLILLLLZIIL(C1729160v6A c1729160v6A, String str) {
        if (str != null && str.length() != 0) {
            if (c1729160v6A == null) {
                ((HashMap) C1728690v5P.LIZ.getValue()).remove(str);
            } else {
                ((HashMap) C1728690v5P.LIZ.getValue()).put(str, c1729160v6A);
            }
        }
    }
}
