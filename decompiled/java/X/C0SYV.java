package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYV implements InterfaceC0148002o {
    public final String LL;

    public C0SYV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SYV) && Intrinsics.LJFF(this.LL, ((C0SYV) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelBottomBarShareState(shareCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SYV(int i) {
        this("");
    }

    public C0SYV(String str) {
        this.LL = str;
    }
}
