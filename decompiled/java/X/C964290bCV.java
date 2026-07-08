package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964290bCV implements InterfaceC0148002o {
    public final boolean LL;
    public final List<InterfaceC963820bBk> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C964290bCV)) {
            return false;
        }
        C964290bCV c964290bCV = (C964290bCV) obj;
        return this.LL == c964290bCV.LL && Intrinsics.LJFF(this.LLILLJJLI, c964290bCV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c964290bCV.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowPromptPageState(isVertical=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", closePageEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C964290bCV(boolean z, List<? extends InterfaceC963820bBk> list, C291001Au<Boolean> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = c291001Au;
    }
}
