package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Odf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623970Odf implements InterfaceC1891350zJl {
    public final MissionStruct LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C623970Odf) && Intrinsics.LJFF(this.LL, ((C623970Odf) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        MissionStruct missionStruct = this.LL;
        if (missionStruct == null) {
            return 0;
        }
        return missionStruct.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchCardItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C623970Odf(MissionStruct missionStruct) {
        this.LL = missionStruct;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C623970Odf c623970Odf;
        MissionStruct missionStruct;
        MissionStruct missionStruct2 = this.LL;
        if (missionStruct2 == null || !(interfaceC1891350zJl instanceof C623970Odf) || (c623970Odf = (C623970Odf) interfaceC1891350zJl) == null || (missionStruct = c623970Odf.LL) == null || missionStruct.mid != missionStruct2.mid) {
            return false;
        }
        return true;
    }
}
