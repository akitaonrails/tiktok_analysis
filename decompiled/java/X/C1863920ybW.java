package X;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ybW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863920ybW implements InterfaceC1618180sDA<C1863920ybW> {
    public final C0PHT LL;
    public final String LLILLJJLI;

    public C1863920ybW() {
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
        if (!(obj instanceof C1863920ybW)) {
            return false;
        }
        C1863920ybW c1863920ybW = (C1863920ybW) obj;
        return Intrinsics.LJFF(this.LL, c1863920ybW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1863920ybW.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoStreamBindingState(streamRoot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sourceId=");
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

    public /* synthetic */ C1863920ybW(int i) {
        this(new C0PHT(null, 511), UUID.randomUUID().toString());
    }

    public C1863920ybW(C0PHT c0pht, String str) {
        this.LL = c0pht;
        this.LLILLJJLI = str;
    }
}
