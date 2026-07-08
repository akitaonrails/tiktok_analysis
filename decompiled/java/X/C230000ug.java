package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C230000ug implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public C230000ug() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C230000ug) && Intrinsics.LJFF(this.LL, ((C230000ug) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartReplySuggestedReplyState(leaveBotChat=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C230000ug(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
