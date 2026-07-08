package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2003307t1 implements InterfaceC0148002o {
    public final Boolean LL;
    public final boolean LLILLJJLI;

    public C2003307t1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2003307t1)) {
            return false;
        }
        C2003307t1 c2003307t1 = (C2003307t1) obj;
        return Intrinsics.LJFF(this.LL, c2003307t1.LL) && this.LLILLJJLI == c2003307t1.LLILLJJLI;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarIconFlipPrerequisiteState(willPrivacyPopupShow=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconFlipColdStartCanShow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2003307t1(int i) {
        this(false, Boolean.TRUE);
    }

    public C2003307t1(boolean z, Boolean bool) {
        this.LL = bool;
        this.LLILLJJLI = z;
    }
}
