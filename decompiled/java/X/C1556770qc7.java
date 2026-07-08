package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556770qc7 implements InterfaceC0148002o {
    public final String LL;
    public final EnumC1563010qmB LLILLJJLI;

    public C1556770qc7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556770qc7)) {
            return false;
        }
        C1556770qc7 c1556770qc7 = (C1556770qc7) obj;
        return Intrinsics.LJFF(this.LL, c1556770qc7.LL) && this.LLILLJJLI == c1556770qc7.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellFeaturedVideosIconState(musicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pinnedVideoStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556770qc7(int i) {
        this("", EnumC1563010qmB.NOT_ALLOWED_SHOWN);
    }

    public C1556770qc7(String str, EnumC1563010qmB enumC1563010qmB) {
        this.LL = str;
        this.LLILLJJLI = enumC1563010qmB;
    }
}
