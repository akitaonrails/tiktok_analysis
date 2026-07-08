package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317400CcM implements InterfaceC0148002o {
    public final InterfaceC549230LgP LL;

    public C317400CcM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C317400CcM) && Intrinsics.LJFF(this.LL, ((C317400CcM) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileAITheaterState(currentState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C317400CcM(int i) {
        this(C558690Lvf.LIZ);
    }

    public C317400CcM(InterfaceC549230LgP interfaceC549230LgP) {
        this.LL = interfaceC549230LgP;
    }
}
