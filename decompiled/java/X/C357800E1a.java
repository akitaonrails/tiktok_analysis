package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357800E1a {
    public final C0E1Y LIZ;
    public final NLETrackSlot LIZIZ = null;
    public final NLETrack LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C357800E1a)) {
            return false;
        }
        C357800E1a c357800E1a = (C357800E1a) obj;
        return this.LIZ == c357800E1a.LIZ && Intrinsics.LJFF(this.LIZIZ, c357800E1a.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c357800E1a.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        NLETrackSlot nLETrackSlot = this.LIZIZ;
        int iHashCode2 = (iHashCode + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31;
        NLETrack nLETrack = this.LIZJ;
        return iHashCode2 + (nLETrack != null ? nLETrack.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerBottomBarClickEvent(eventType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", track=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C357800E1a(C0E1Y c0e1y) {
        this.LIZ = c0e1y;
    }
}
