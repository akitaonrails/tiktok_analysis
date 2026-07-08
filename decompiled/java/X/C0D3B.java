package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3B extends C0D3D {
    public final String LL;

    public final C0D3B copy(String str) {
        return new C0D3B(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D3B) && Intrinsics.LJFF(this.LL, ((C0D3B) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Heading(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getText() {
        return this.LL;
    }

    public C0D3B(String str) {
        this.LL = str;
    }
}
