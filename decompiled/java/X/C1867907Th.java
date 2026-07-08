package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C1867907Th implements InterfaceC454700HsK {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1867907Th) && Intrinsics.LJFF(this.LL, ((C1867907Th) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomStickerEnterMethod(value=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC454700HsK
    public final String getValue() {
        return this.LL;
    }

    public C1867907Th(String str) {
        this.LL = str;
    }
}
