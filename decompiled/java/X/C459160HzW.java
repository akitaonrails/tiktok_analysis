package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459160HzW implements InterfaceC879330YeZ {
    public final String LIZ;
    public final EnumC879260YeS LIZIZ;

    @Override // X.InterfaceC879330YeZ
    public final int LIZJ() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C459160HzW)) {
            return false;
        }
        C459160HzW c459160HzW = (C459160HzW) obj;
        return Intrinsics.LJFF(this.LIZ, c459160HzW.LIZ) && this.LIZIZ == c459160HzW.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    @Override // X.InterfaceC879330YeZ
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("e:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Emoji:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC879330YeZ
    public final String LIZIZ() {
        return this.LIZ;
    }

    public /* synthetic */ C459160HzW(String str) {
        this(str, EnumC879260YeS.HUMAN);
    }

    public C459160HzW(String str, EnumC879260YeS enumC879260YeS) {
        this.LIZ = str;
        this.LIZIZ = enumC879260YeS;
    }
}
