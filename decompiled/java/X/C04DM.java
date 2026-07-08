package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04DM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DM extends C04DL {
    public final C04BX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04DM) && Intrinsics.LJFF(this.LIZIZ, ((C04DM) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSkcItemImgVO(skcItemData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DL
    public final C04BX LIZ() {
        return this.LIZIZ;
    }

    public C04DM(C04BX c04bx) {
        super(c04bx);
        this.LIZIZ = c04bx;
    }
}
