package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933280aOU implements InterfaceC951240arS<Object> {
    public final C933270aOT LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C933280aOU)) {
            return false;
        }
        C933280aOU c933280aOU = (C933280aOU) obj;
        return Intrinsics.LJFF(this.LIZ, c933280aOU.LIZ) && this.LIZIZ == c933280aOU.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectableSwitchSpotUserInfo(userInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if ((obj instanceof C933280aOU) && Intrinsics.LJFF(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C933280aOU;
    }

    public C933280aOU(C933270aOT c933270aOT, boolean z) {
        this.LIZ = c933270aOT;
        this.LIZIZ = z;
    }
}
