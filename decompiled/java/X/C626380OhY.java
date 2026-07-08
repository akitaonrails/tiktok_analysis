package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626380OhY implements InterfaceC0148002o {
    public final List<C1240530iO3> LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626380OhY)) {
            return false;
        }
        C626380OhY c626380OhY = (C626380OhY) obj;
        return Intrinsics.LJFF(this.LL, c626380OhY.LL) && this.LLILLJJLI == c626380OhY.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c626380OhY.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSearchDetailState(searchContentList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C626380OhY(List<C1240530iO3> list, boolean z, String str) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }
}
