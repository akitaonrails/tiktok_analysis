package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I2E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2E implements InterfaceC0148002o {
    public final C291001Au<C0I2G> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I2E) && Intrinsics.LJFF(this.LL, ((C0I2E) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickReplyEmojiState(replyMessageEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I2E(C291001Au<C0I2G> c291001Au) {
        this.LL = c291001Au;
    }
}
