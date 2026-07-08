package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Spa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733280Spa implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C733280Spa() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C733280Spa)) {
            return false;
        }
        C733280Spa c733280Spa = (C733280Spa) obj;
        return Intrinsics.LJFF(this.LL, c733280Spa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c733280Spa.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoQuickCommentState(onClickQuickEmojiEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onQuickCommentReadyEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C733280Spa(C291001Au<String> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
