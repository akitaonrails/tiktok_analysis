package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699210Rbj {
    public final String LIZ;
    public final C699400Rc2 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699210Rbj)) {
            return false;
        }
        C699210Rbj c699210Rbj = (C699210Rbj) obj;
        return Intrinsics.LJFF(this.LIZ, c699210Rbj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c699210Rbj.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegisteredSlotReplay(boundSlotKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cachedState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C699210Rbj(String str, C699400Rc2 c699400Rc2) {
        this.LIZ = str;
        this.LIZIZ = c699400Rc2;
    }
}
