package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KJG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJG implements InterfaceC515600KJy {
    public final String LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KJG)) {
            return false;
        }
        C0KJG c0kjg = (C0KJG) obj;
        return Intrinsics.LJFF(this.LL, c0kjg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0kjg.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkFlashItem(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", componentId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return this.LLILLJJLI;
    }

    public C0KJG(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
