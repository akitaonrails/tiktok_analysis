package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1713806nQ {
    public final List<StickerItem> LIZ;
    public final String LIZIZ;
    public final InterfaceC453460HqK LIZJ;
    public final InterfaceC453160Hpq LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1713806nQ)) {
            return false;
        }
        C1713806nQ c1713806nQ = (C1713806nQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1713806nQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1713806nQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1713806nQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1713806nQ.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC453460HqK interfaceC453460HqK = this.LIZJ;
        int iHashCode2 = (iHashCode + (interfaceC453460HqK == null ? 0 : interfaceC453460HqK.hashCode())) * 31;
        InterfaceC453160Hpq interfaceC453160Hpq = this.LIZLLL;
        return iHashCode2 + (interfaceC453160Hpq != null ? interfaceC453160Hpq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeMsgStickerData(stickerList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", querySessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exposureTracker=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1713806nQ(List<StickerItem> list, String str, InterfaceC453460HqK interfaceC453460HqK, InterfaceC453160Hpq interfaceC453160Hpq) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = interfaceC453460HqK;
        this.LIZLLL = interfaceC453160Hpq;
    }
}
