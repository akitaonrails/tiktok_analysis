package X;

import android.widget.TextView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361120EDu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C0EE1 LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final Function0<TextView> LJIIJJI;
    public final Function1<TextView, Unit> LJIIL;
    public final Function1<TextView, Unit> LJIILIIL;

    public C361120EDu(boolean z, int i, int i2, C0EE1 c0ee1, int i3, int i4, int i5, float f, Function0 function0, Function1 function1, Function1 function12, int i6) {
        boolean z2;
        int i7;
        int i8;
        boolean z3 = z;
        int i9 = i;
        int i10 = i2;
        C0EE1 c0ee12 = c0ee1;
        int i11 = i3;
        int i12 = i4;
        Function0 function02 = function0;
        float f2 = f;
        Function1 function13 = function1;
        if ((i6 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z3 = (i6 & 2) != 0 ? false : z3;
        i9 = (i6 & 4) != 0 ? -1 : i9;
        i10 = (i6 & 8) != 0 ? i9 : i10;
        c0ee12 = (i6 & 16) != 0 ? C0EE1.UP : c0ee12;
        if ((i6 & 32) != 0) {
            i7 = 12;
        } else {
            i7 = 0;
        }
        if ((i6 & 64) != 0) {
            i8 = 14;
        } else {
            i8 = 0;
        }
        i11 = (i6 & 128) != 0 ? 3 : i11;
        i12 = (i6 & 256) != 0 ? 30 : i12;
        int i13 = (i6 & 512) == 0 ? i5 : 0;
        f2 = (i6 & 1024) != 0 ? 0.3f : f2;
        function02 = (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function02;
        function13 = (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function13;
        Function1 function14 = (i6 & 8192) == 0 ? function12 : null;
        this.LIZ = z2;
        this.LIZIZ = z3;
        this.LIZJ = i9;
        this.LIZLLL = i10;
        this.LJ = c0ee12;
        this.LJFF = i7;
        this.LJI = i8;
        this.LJII = i11;
        this.LJIIIIZZ = i12;
        this.LJIIIZ = i13;
        this.LJIIJ = f2;
        this.LJIIJJI = function02;
        this.LJIIL = function13;
        this.LJIILIIL = function14;
    }
}
