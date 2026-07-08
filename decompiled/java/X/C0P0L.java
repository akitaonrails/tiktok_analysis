package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionLineTextStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P0L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0L implements InterfaceC1891350zJl {
    public final MissionLineTextStruct LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P0L) && Intrinsics.LJFF(this.LL, ((C0P0L) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        MissionLineTextStruct missionLineTextStruct = this.LL;
        if (missionLineTextStruct == null) {
            return 0;
        }
        return missionLineTextStruct.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiddleContentItem(line=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P0L(MissionLineTextStruct missionLineTextStruct) {
        this.LL = missionLineTextStruct;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
