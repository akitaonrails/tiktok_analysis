package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E75, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E75 {
    public final boolean LIZ;
    public final NLETrack LIZIZ;
    public final NLETrackSlot LIZJ;
    public final Integer LIZLLL;
    public final C0E6E LJ;
    public final EnumC358760E4s LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Boolean LJIIJ;
    public final boolean LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E75)) {
            return false;
        }
        C0E75 c0e75 = (C0E75) obj;
        return this.LIZ == c0e75.LIZ && Intrinsics.LJFF(this.LIZIZ, c0e75.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0e75.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0e75.LIZLLL) && this.LJ == c0e75.LJ && this.LJFF == c0e75.LJFF && this.LJI == c0e75.LJI && this.LJII == c0e75.LJII && this.LJIIIIZZ == c0e75.LJIIIIZZ && this.LJIIIZ == c0e75.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0e75.LJIIJ) && this.LJIIJJI == c0e75.LJIIJJI;
    }

    public final String toString() {
        return "TrackPanelSelectState(updateMainTrack=" + this.LIZ + ", track=" + this.LIZIZ + ", slot=" + this.LIZJ + ", selectIndex=" + this.LIZLLL + ", editType=" + this.LJ + ", selectType=" + this.LJFF + ", autoSeek=" + this.LJI + ", useAlphaAnim=" + this.LJII + ", isDragMode=" + this.LJIIIIZZ + ", isPassiveSelect=" + this.LJIIIZ + ", shouldShowKeyFrame=" + this.LJIIJ + ", autoPause=" + this.LJIIJJI + ')';
    }

    public static C0E75 LIZ(C0E75 c0e75, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, int i) {
        boolean z;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        EnumC358760E4s enumC358760E4s2 = enumC358760E4s;
        C0E6E c0e6e2 = c0e6e;
        boolean z6 = false;
        if ((i & 1) != 0) {
            z = c0e75.LIZ;
        } else {
            z = false;
        }
        Boolean bool = null;
        if ((i & 2) != 0) {
            nLETrack = c0e75.LIZIZ;
        } else {
            nLETrack = null;
        }
        if ((i & 4) != 0) {
            nLETrackSlot = c0e75.LIZJ;
        } else {
            nLETrackSlot = null;
        }
        if ((i & 8) != 0) {
            num = c0e75.LIZLLL;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            c0e6e2 = c0e75.LJ;
        }
        if ((i & 32) != 0) {
            enumC358760E4s2 = c0e75.LJFF;
        }
        if ((i & 64) != 0) {
            z2 = c0e75.LJI;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            z3 = c0e75.LJII;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = c0e75.LJIIIIZZ;
        } else {
            z4 = false;
        }
        if ((i & 512) != 0) {
            z5 = c0e75.LJIIIZ;
        } else {
            z5 = false;
        }
        if ((i & 1024) != 0) {
            bool = c0e75.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c0e75.LJIIJJI;
        }
        c0e75.getClass();
        return new C0E75(z, nLETrack, nLETrackSlot, num, c0e6e2, enumC358760E4s2, z2, z3, z4, z5, bool, z6);
    }

    public C0E75(boolean z, NLETrack nLETrack, NLETrackSlot nLETrackSlot, Integer num, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, boolean z6) {
        this.LIZ = z;
        this.LIZIZ = nLETrack;
        this.LIZJ = nLETrackSlot;
        this.LIZLLL = num;
        this.LJ = c0e6e;
        this.LJFF = enumC358760E4s;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
        this.LJIIJ = bool;
        this.LJIIJJI = z6;
    }

    public /* synthetic */ C0E75(boolean z, NLETrack nLETrack, NLETrackSlot nLETrackSlot, Integer num, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, boolean z6, int i) {
        this(z, (i & 2) != 0 ? null : nLETrack, (i & 4) != 0 ? null : nLETrackSlot, (i & 8) != 0 ? null : num, (i & 16) != 0 ? C0E6E.NONE : c0e6e, (i & 32) != 0 ? EnumC358760E4s.NORMAL : enumC358760E4s, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) == 0 ? bool : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z6);
    }
}
