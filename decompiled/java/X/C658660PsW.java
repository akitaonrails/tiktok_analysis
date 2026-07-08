package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658660PsW implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C658660PsW)) {
            return false;
        }
        C658660PsW c658660PsW = (C658660PsW) obj;
        return Intrinsics.LJFF(this.LIZ, c658660PsW.LIZ) && this.LIZIZ == c658660PsW.LIZIZ && this.LIZJ == c658660PsW.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLiveForLynxWindowVisibilityChangeEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPlayingWhenLeave=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C658660PsW(String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
