package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3C, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3C extends C0D3D {
    public final String LL;
    public final String LLILLJJLI;

    public final C0D3C copy(String str, String str2) {
        return new C0D3C(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3C)) {
            return false;
        }
        C0D3C c0d3c = (C0D3C) obj;
        return Intrinsics.LJFF(this.LL, c0d3c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0d3c.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paragraph(subtitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSubtitle() {
        return this.LL;
    }

    public final String getText() {
        return this.LLILLJJLI;
    }

    public C0D3C(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
