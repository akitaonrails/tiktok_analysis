package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677050Qh5 implements InterfaceC0148002o {
    public final String LL;
    public final n LLILLJJLI;
    public final C676940Qgu LLILLL;

    public C677050Qh5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C677050Qh5)) {
            return false;
        }
        C677050Qh5 c677050Qh5 = (C677050Qh5) obj;
        return Intrinsics.LJFF(this.LL, c677050Qh5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c677050Qh5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c677050Qh5.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n nVar = this.LLILLJJLI;
        return ((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECSearchFilterVMState(searchInitParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", firstChunkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabSortFilterState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C677050Qh5(int i) {
        this(null, null, new C676940Qgu(0));
    }

    public C677050Qh5(String str, n nVar, C676940Qgu c676940Qgu) {
        this.LL = str;
        this.LLILLJJLI = nVar;
        this.LLILLL = c676940Qgu;
    }
}
