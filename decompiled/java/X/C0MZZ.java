package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.data.media.MediaPhotoExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZZ {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final MediaPhotoExtraData LJIILL;

    public C0MZZ() {
        this(null, null, null, 0, 0, 0, 0L, false, null, null, null, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MZZ)) {
            return false;
        }
        C0MZZ c0mzz = (C0MZZ) obj;
        return this.LIZ == c0mzz.LIZ && Intrinsics.LJFF(this.LIZIZ, c0mzz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mzz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mzz.LIZLLL) && this.LJ == c0mzz.LJ && this.LJFF == c0mzz.LJFF && this.LJI == c0mzz.LJI && Intrinsics.LJFF(this.LJII, c0mzz.LJII) && this.LJIIIIZZ == c0mzz.LJIIIIZZ && this.LJIIIZ == c0mzz.LJIIIZ && this.LJIIJ == c0mzz.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0mzz.LJIIJJI) && this.LJIIL == c0mzz.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c0mzz.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0mzz.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c0mzz.LJIILL);
    }

    public final String toString() {
        return "Photo(position=" + this.LIZ + ", id=" + this.LIZIZ + ", path=" + this.LIZJ + ", mimeType=" + this.LIZLLL + ", duration=" + this.LJ + ", isChecked=" + this.LJFF + ", num=" + this.LJI + ", pictureType=" + this.LJII + ", width=" + this.LJIIIIZZ + ", height=" + this.LJIIIZ + ", size=" + this.LJIIJ + ", fileName=" + this.LJIIJJI + ", isVideo=" + this.LJIIL + ", videoCoverPath=" + this.LJIILIIL + ", originPath=" + this.LJIILJJIL + ", photoExtraData=" + this.LJIILL + ')';
    }

    public C0MZZ(String str, String str2, String str3, int i, int i2, int i3, long j, boolean z, String str4, String str5, MediaPhotoExtraData mediaPhotoExtraData, int i4) {
        String str6;
        boolean z2 = z;
        String str7 = str4;
        MediaPhotoExtraData mediaPhotoExtraData2 = mediaPhotoExtraData;
        str = (i4 & 2) != 0 ? "" : str;
        str2 = (i4 & 4) != 0 ? "" : str2;
        str3 = (i4 & 8) != 0 ? "" : str3;
        i = (i4 & 16) != 0 ? 0 : i;
        i2 = (i4 & 256) != 0 ? 0 : i2;
        i3 = (i4 & 512) != 0 ? 0 : i3;
        j = (i4 & 1024) != 0 ? 0L : j;
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        z2 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2;
        str7 = (i4 & 8192) != 0 ? "" : str7;
        String str8 = (i4 & 16384) == 0 ? str5 : "";
        mediaPhotoExtraData2 = (i4 & 32768) != 0 ? new MediaPhotoExtraData(0) : mediaPhotoExtraData2;
        this.LIZ = 0;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = false;
        this.LJI = 0;
        this.LJII = null;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
        this.LJIIJ = j;
        this.LJIIJJI = str6;
        this.LJIIL = z2;
        this.LJIILIIL = str7;
        this.LJIILJJIL = str8;
        this.LJIILL = mediaPhotoExtraData2;
    }
}
