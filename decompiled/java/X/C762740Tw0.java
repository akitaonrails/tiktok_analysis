package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762740Tw0 extends AbstractC762710Tvx {
    public final MusicSong LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C762740Tw0) && Intrinsics.LJFF(this.LIZ, ((C762740Tw0) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchFirstTrendingSongSuccess(musicSong=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C762740Tw0(MusicSong musicSong) {
        this.LIZ = musicSong;
    }
}
