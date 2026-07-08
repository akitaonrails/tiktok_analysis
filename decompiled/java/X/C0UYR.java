package X;

import android.graphics.Rect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UYR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYR {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final EnumC918970a1P LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final Function0<Rect> LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;

    public C0UYR() {
        throw null;
    }

    public final String toString() {
        return "AnchorLayoutParams(width=" + this.LIZ + ", height=" + this.LIZIZ + ", leftMargin=" + this.LIZJ + ", topMargin=" + this.LIZLLL + ", multiLiveType=" + this.LJ + ", resetFullScreen=" + this.LJFF + ", isInZoom=" + this.LJI + ", needMarginTop=" + this.LJII + ", gravity=" + this.LJIIIIZZ + ", getLayoutRect=" + this.LJIIIZ + ", zOrderMode=" + this.LJIIJ + ", visible=" + this.LJIIJJI + ')';
    }

    public C0UYR(int i, int i2, int i3, int i4, EnumC918970a1P enumC918970a1P, boolean z, boolean z2, boolean z3, int i5, Function0 function0, boolean z4, int i6, int i7) {
        enumC918970a1P = (i7 & 16) != 0 ? EnumC918970a1P.NORMAL : enumC918970a1P;
        z = (i7 & 32) != 0 ? false : z;
        z2 = (i7 & 64) != 0 ? false : z2;
        z3 = (i7 & 128) != 0 ? true : z3;
        i5 = (i7 & 256) != 0 ? -1 : i5;
        function0 = (i7 & 512) != 0 ? AFwS199S0000000_12.get$arr$(250) : function0;
        boolean z5 = (i7 & 1024) == 0 ? z4 : false;
        int i8 = (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i6 : -1;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = enumC918970a1P;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = function0;
        this.LJIIJ = z5;
        this.LJIIJJI = i8;
    }
}
