package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0acn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942150acn {
    public final EnumC939140aXw LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C942150acn)) {
            return false;
        }
        C942150acn c942150acn = (C942150acn) obj;
        return this.LIZ == c942150acn.LIZ && Intrinsics.LJFF(this.LIZIZ, c942150acn.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPreviewLayoutSnapshot(layoutType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sharedBgImageFilePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942150acn(EnumC939140aXw enumC939140aXw, String str) {
        this.LIZ = enumC939140aXw;
        this.LIZIZ = str;
    }
}
