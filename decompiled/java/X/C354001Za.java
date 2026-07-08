package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C354001Za implements InterfaceC951240arS<Object> {
    public final boolean LIZ;
    public final C01ZA LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354001Za)) {
            return false;
        }
        C354001Za c354001Za = (C354001Za) obj;
        return this.LIZ == c354001Za.LIZ && Intrinsics.LJFF(this.LIZIZ, c354001Za.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizTextHeaderSelectedRecordInfo(isSelected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textHeaderRecordInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C354001Za)) {
            return false;
        }
        C354001Za c354001Za = (C354001Za) obj;
        if (c354001Za.LIZ != this.LIZ || !Intrinsics.LJFF(c354001Za.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C354001Za;
    }

    public C354001Za(boolean z, C01ZA c01za) {
        this.LIZ = z;
        this.LIZIZ = c01za;
    }
}
