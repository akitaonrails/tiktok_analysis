package X;

import com.ss.ugc.android.editor.track.PlayPositionState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359410E7f {
    public final PlayPositionState LIZ;
    public final Float LIZIZ;

    public C359410E7f() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359410E7f)) {
            return false;
        }
        C359410E7f c359410E7f = (C359410E7f) obj;
        return Intrinsics.LJFF(this.LIZ, c359410E7f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c359410E7f.LIZIZ);
    }

    public final int hashCode() {
        PlayPositionState playPositionState = this.LIZ;
        int iHashCode = (playPositionState == null ? 0 : playPositionState.hashCode()) * 31;
        Float f = this.LIZIZ;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackPanelSceneInitData(playPositionState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trackScale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C359410E7f(PlayPositionState playPositionState, Float f) {
        this.LIZ = playPositionState;
        this.LIZIZ = f;
    }
}
