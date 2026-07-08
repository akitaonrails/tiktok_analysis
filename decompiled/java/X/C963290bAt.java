package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963290bAt implements InterfaceC111300bX {
    public final DataChannel LL;
    public final C960870b6z LLILLJJLI;
    public final Function1<EnumC963280bAs, Unit> LLILLL;
    public final C963270bAr LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963290bAt)) {
            return false;
        }
        C963290bAt c963290bAt = (C963290bAt) obj;
        return Intrinsics.LJFF(this.LL, c963290bAt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c963290bAt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c963290bAt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c963290bAt.LLILZ);
    }

    public final int hashCode() {
        DataChannel dataChannel = this.LL;
        return ((((((dataChannel == null ? 0 : dataChannel.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostFollowPromptHierarchyData(dataChannel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dialogParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventTracker=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963290bAt(DataChannel dataChannel, C960870b6z c960870b6z, AwS594S0100000_15 awS594S0100000_15, C963270bAr c963270bAr) {
        this.LL = dataChannel;
        this.LLILLJJLI = c960870b6z;
        this.LLILLL = awS594S0100000_15;
        this.LLILZ = c963270bAr;
    }
}
