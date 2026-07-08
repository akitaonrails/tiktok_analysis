package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169140gWu implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;

    public C1169140gWu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169140gWu)) {
            return false;
        }
        C1169140gWu c1169140gWu = (C1169140gWu) obj;
        return Intrinsics.LJFF(this.LL, c1169140gWu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1169140gWu.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistInfoState(viewModelKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playlistPreviousPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1169140gWu(int i) {
        this("", "");
    }

    public C1169140gWu(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
