package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631690Oq7 implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C291001Au<String> LLILLL;

    public C631690Oq7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631690Oq7)) {
            return false;
        }
        C631690Oq7 c631690Oq7 = (C631690Oq7) obj;
        return Intrinsics.LJFF(this.LL, c631690Oq7.LL) && this.LLILLJJLI == c631690Oq7.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c631690Oq7.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<String> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellCollectIconState(musicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCollect=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toastEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C631690Oq7(int i) {
        this(null, "", false);
    }

    public C631690Oq7(C291001Au c291001Au, String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au;
    }

    public static C631690Oq7 LIZ(C631690Oq7 c631690Oq7, String str, boolean z, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            str = c631690Oq7.LL;
        }
        if ((i & 2) != 0) {
            z = c631690Oq7.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c631690Oq7.LLILLL;
        }
        c631690Oq7.getClass();
        return new C631690Oq7(c291001Au, str, z);
    }
}
