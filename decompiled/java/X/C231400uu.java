package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231400uu implements InterfaceC0148002o {
    public final C291001Au<String> LL;

    public C231400uu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231400uu) && Intrinsics.LJFF(this.LL, ((C231400uu) obj).LL);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryV2AnimVMState(msgUUIDToAnimate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231400uu(C291001Au<String> c291001Au) {
        this.LL = c291001Au;
    }
}
