package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELT {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Integer LIZLLL;
    public final NLEResType LJ;
    public String LJFF;
    public final String LJI;
    public final String LJII;
    public final float LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final Float LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    public C0ELT() {
        this(null, 0L, 0L, null, null, null, null, null, 0.0f, null, false, null, false, false, false, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ELT)) {
            return false;
        }
        C0ELT c0elt = (C0ELT) obj;
        return Intrinsics.LJFF(this.LIZ, c0elt.LIZ) && this.LIZIZ == c0elt.LIZIZ && this.LIZJ == c0elt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0elt.LIZLLL) && this.LJ == c0elt.LJ && Intrinsics.LJFF(this.LJFF, c0elt.LJFF) && Intrinsics.LJFF(this.LJI, c0elt.LJI) && Intrinsics.LJFF(this.LJII, c0elt.LJII) && Float.compare(this.LJIIIIZZ, c0elt.LJIIIIZZ) == 0 && Intrinsics.LJFF(this.LJIIIZ, c0elt.LJIIIZ) && this.LJIIJ == c0elt.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0elt.LJIIJJI) && this.LJIIL == c0elt.LJIIL && this.LJIILIIL == c0elt.LJIILIIL && this.LJIILJJIL == c0elt.LJIILJJIL;
    }

    public final String toString() {
        return "GenerateTrackData(coverPath=" + this.LIZ + ", duration=" + this.LIZIZ + ", sourceClipDurationMs=" + this.LIZJ + ", insertPosition=" + this.LIZLLL + ", resourceType=" + this.LJ + ", path=" + this.LJFF + ", epAIGCAsyncTaskId=" + this.LJI + ", mediaItemID=" + this.LJII + ", progress=" + this.LJIIIIZZ + ", i2vSlotID=" + this.LJIIIZ + ", isImageUploaded=" + this.LJIIJ + ", speed=" + this.LJIIJJI + ", addToPip=" + this.LJIIL + ", appendMode=" + this.LJIILIIL + ", inheritEditProperties=" + this.LJIILJJIL + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        Float f = this.LJIIJJI;
        return ((((((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL);
    }

    public C0ELT(String str, long j, long j2, Integer num, NLEResType nLEResType, String str2, String str3, String str4, float f, String str5, boolean z, Float f2, boolean z2, boolean z3, boolean z4, int i) {
        long j3 = j2;
        long j4 = j;
        String str6 = str2;
        NLEResType nLEResType2 = nLEResType;
        Integer num2 = num;
        boolean z5 = z;
        float f3 = f;
        String str7 = str4;
        String str8 = str3;
        boolean z6 = z3;
        boolean z7 = z4;
        boolean z8 = z2;
        Float f4 = f2;
        String str9 = (i & 1) != 0 ? "" : str;
        j4 = (i & 2) != 0 ? 0L : j4;
        j3 = (i & 4) != 0 ? -1L : j3;
        num2 = (i & 8) != 0 ? null : num2;
        nLEResType2 = (i & 16) != 0 ? NLEResType.IMAGE : nLEResType2;
        str6 = (i & 32) != 0 ? "" : str6;
        str8 = (i & 64) != 0 ? "" : str8;
        str7 = (i & 128) != 0 ? "" : str7;
        f3 = (i & 256) != 0 ? 0.0f : f3;
        String str10 = (i & 512) == 0 ? str5 : "";
        z5 = (i & 1024) != 0 ? false : z5;
        f4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f4;
        z8 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z8;
        z6 = (i & 8192) != 0 ? false : z6;
        z7 = (i & 16384) != 0 ? false : z7;
        this.LIZ = str9;
        this.LIZIZ = j4;
        this.LIZJ = j3;
        this.LIZLLL = num2;
        this.LJ = nLEResType2;
        this.LJFF = str6;
        this.LJI = str8;
        this.LJII = str7;
        this.LJIIIIZZ = f3;
        this.LJIIIZ = str10;
        this.LJIIJ = z5;
        this.LJIIJJI = f4;
        this.LJIIL = z8;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z7;
    }
}
