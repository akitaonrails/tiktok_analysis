package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642570PIh implements InterfaceC1858000yRy {
    public final List<TakoVideoItem> LL;
    public final InterfaceC1858000yRy LLILLJJLI;
    public int LLILLL = C1919107fR.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C642570PIh)) {
            return false;
        }
        C642570PIh c642570PIh = (C642570PIh) obj;
        return Intrinsics.LJFF(this.LL, c642570PIh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c642570PIh.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOutItem(awemelist=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return C1860820yWW.LIZ(this.LLILLJJLI, this.LL);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }

    public C642570PIh(InterfaceC1858000yRy interfaceC1858000yRy, List list) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1858000yRy;
    }
}
