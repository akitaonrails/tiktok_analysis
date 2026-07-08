package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PS7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PS7 implements InterfaceC1618170sD9<C0PS7> {
    public final boolean LL;
    public final String LLILLJJLI;

    public C0PS7() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PS7)) {
            return false;
        }
        C0PS7 c0ps7 = (C0PS7) obj;
        return this.LL == c0ps7.LL && Intrinsics.LJFF(this.LLILLJJLI, c0ps7.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchETEState(isOnSevenScreen=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sevenScreenSearchId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C0PS7(int i) {
        this(false, "");
    }

    public C0PS7(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
        C0P8T.LIZ();
    }
}
