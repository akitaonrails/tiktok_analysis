package X;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13TX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TX implements C13TY {
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public C13TX(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(MessageDigest messageDigest) {
        messageDigest.update(this.LIZIZ.getBytes(C13TY.LIZ));
    }

    public final boolean equals(Object obj) {
        C13TX c13tx;
        String str = this.LIZIZ;
        String str2 = null;
        if ((obj instanceof C13TX) && (c13tx = (C13TX) obj) != null) {
            str2 = c13tx.LIZIZ;
        }
        return Intrinsics.LJFF(str, str2);
    }
}
