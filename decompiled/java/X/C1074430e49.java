package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074430e49 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LL;
    public final AbstractC1623806Xk<List<User>> LLILLJJLI;

    public C1074430e49() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074430e49)) {
            return false;
        }
        C1074430e49 c1074430e49 = (C1074430e49) obj;
        return Intrinsics.LJFF(this.LL, c1074430e49.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1074430e49.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FacebookMaFWidgetVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1074430e49(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1074430e49(AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk, AbstractC1623806Xk<? extends List<? extends User>> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }
}
