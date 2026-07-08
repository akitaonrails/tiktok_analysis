package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2446009iE implements InterfaceC0148002o {
    public final C291001Au<C2446709iL> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2446009iE) && Intrinsics.LJFF(this.LL, ((C2446009iE) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowingSuggestState(showState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2446009iE() {
        this(new C291001Au(new C2446709iL(false)));
    }

    public C2446009iE(C291001Au<C2446709iL> c291001Au) {
        this.LL = c291001Au;
    }
}
