package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436950HBl implements InterfaceC1891350zJl {
    public final C436960HBm LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C436950HBl) && Intrinsics.LJFF(this.LL, ((C436950HBl) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarPreviewPowerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C436950HBl(C436960HBm c436960HBm) {
        this.LL = c436960HBm;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C436950HBl)) {
            return false;
        }
        C436950HBl c436950HBl = (C436950HBl) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c436950HBl.LL.LIZ, this.LL.LIZ) || !Intrinsics.LJFF(c436950HBl.LL.LIZIZ, this.LL.LIZIZ) || !Intrinsics.LJFF(c436950HBl.LL.LIZLLL, this.LL.LIZLLL)) {
            return false;
        }
        String str = c436950HBl.LL.LJFF;
        if (!Intrinsics.LJFF(str, str)) {
            return false;
        }
        String str2 = c436950HBl.LL.LJ;
        if (!Intrinsics.LJFF(str2, str2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
