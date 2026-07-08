package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestApplyRouteSimplifySetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ap5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949770ap5 extends AbstractC926260aDA {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C926050aCp LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949770ap5)) {
            return false;
        }
        C949770ap5 c949770ap5 = (C949770ap5) obj;
        return this.LIZ == c949770ap5.LIZ && this.LIZIZ == c949770ap5.LIZIZ && this.LIZJ == c949770ap5.LIZJ && Intrinsics.LJFF(this.LIZLLL, c949770ap5.LIZLLL) && this.LJ == c949770ap5.LJ;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        C926050aCp c926050aCp = this.LIZLLL;
        return ((iY2 + (c926050aCp == null ? 0 : c926050aCp.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reject(channelId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterCtx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", useApplyDirectUpAbility=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C949770ap5(long j, long j2, long j3, C926050aCp c926050aCp) {
        boolean zEnable = MultiGuestApplyRouteSimplifySetting.INSTANCE.enable();
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = c926050aCp;
        this.LJ = zEnable;
    }
}
