package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762700Tvw extends AbstractC762710Tvx {
    public final MusicSong LIZ;
    public final C763160Twg LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C762700Tvw)) {
            return false;
        }
        C762700Tvw c762700Tvw = (C762700Tvw) obj;
        return Intrinsics.LJFF(this.LIZ, c762700Tvw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c762700Tvw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateFavoriteSongList(musicSong=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C762700Tvw(MusicSong musicSong, C763160Twg c763160Twg) {
        this.LIZ = musicSong;
        this.LIZIZ = c763160Twg;
    }
}
