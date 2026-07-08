package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454890Hsd implements InterfaceC454940Hsi {
    public final C19EG LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454890Hsd)) {
            return false;
        }
        C454890Hsd c454890Hsd = (C454890Hsd) obj;
        return Intrinsics.LJFF(this.LIZ, c454890Hsd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454890Hsd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c454890Hsd.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromQuoted(fragmentActivity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454890Hsd(C19EG c19eg, String str, String str2) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
