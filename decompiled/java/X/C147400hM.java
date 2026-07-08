package X;

import java.util.Map;

/* JADX INFO: renamed from: X.00hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C147400hM {
    public static final void LIZ(C474500IjA c474500IjA, byte[] bArr) {
        if (bArr != null) {
            for (Map.Entry<String, Object> entry : C500260Jjc.LJLZ(bArr).entrySet()) {
                c474500IjA.LJJII(entry.getValue(), entry.getKey());
            }
        }
    }
}
