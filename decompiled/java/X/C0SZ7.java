package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZ7 implements InterfaceC0148002o {
    public final String LL;

    public C0SZ7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SZ7) && Intrinsics.LJFF(this.LL, ((C0SZ7) obj).LL);
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
        sbLIZ.append("PostModeShareState(shareCountText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SZ7(int i) {
        this("");
    }

    public C0SZ7(String str) {
        this.LL = str;
    }
}
