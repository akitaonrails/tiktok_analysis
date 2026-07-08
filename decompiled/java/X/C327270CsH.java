package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327270CsH implements InterfaceC327250CsF {
    public final String LIZ;
    public final Aweme LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C327270CsH)) {
            return false;
        }
        C327270CsH c327270CsH = (C327270CsH) obj;
        return Intrinsics.LJFF(this.LIZ, c327270CsH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c327270CsH.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Available(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C327270CsH(String str, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = aweme;
    }
}
