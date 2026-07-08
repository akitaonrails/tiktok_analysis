package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LYE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYE extends C0LYM {
    public final ShortVideoContext LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LYE)) {
            return false;
        }
        C0LYE c0lye = (C0LYE) obj;
        return Intrinsics.LJFF(this.LIZ, c0lye.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lye.LIZIZ);
    }

    public final int hashCode() {
        ShortVideoContext shortVideoContext = this.LIZ;
        return ((shortVideoContext == null ? 0 : shortVideoContext.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendToDrafts(shortVideoContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYE(ShortVideoContext shortVideoContext, String str) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = str;
    }
}
