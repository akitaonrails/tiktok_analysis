package X;

import android.graphics.drawable.Drawable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.0FTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390690FTn {
    public final int LIZ;
    public final int LIZIZ;
    public final Function0<Drawable> LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final Function0<Drawable> LJ;
    public final int LJFF;
    public final Integer LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final Function0<Unit> LJIIL;
    public final Function0<Unit> LJIILIIL;
    public final Integer LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final float LJIJI;
    public final float LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C390690FTn() {
        AwS430S0200000_29 awS430S0200000_29 = null;
        this(0, 0 == true ? 1 : 0, awS430S0200000_29, awS430S0200000_29, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777215);
    }

    public /* synthetic */ C390690FTn(int i, int i2, AwS430S0200000_29 awS430S0200000_29, Function0 function0, float f, boolean z, boolean z2, boolean z3, int i3) {
        int i4;
        int i5;
        Pair pair;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        float f3 = f;
        Function0 function02 = function0;
        AwS430S0200000_29 awS430S0200000_292 = awS430S0200000_29;
        int i13 = i2;
        int i14 = i;
        if ((i3 & 1) != 0) {
            i4 = 100;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            i5 = 100;
        } else {
            i5 = 0;
        }
        if ((i3 & 8) != 0) {
            pair = new Pair(16, 16);
        } else {
            pair = null;
        }
        i14 = (i3 & 32) != 0 ? R.raw.icon_camera_plus_fill : i14;
        if ((i3 & 128) != 0) {
            i6 = R.attr.zh;
        } else {
            i6 = 0;
        }
        if ((i3 & 256) != 0) {
            i7 = R.attr.ng;
        } else {
            i7 = 0;
        }
        i13 = (i3 & 512) != 0 ? 2131825072 : i13;
        if ((i3 & 1024) != 0) {
            i8 = 2131825084;
        } else {
            i8 = 0;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str = "";
        } else {
            str = null;
        }
        awS430S0200000_292 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : awS430S0200000_292;
        function02 = (i3 & 8192) != 0 ? null : function02;
        if ((32768 & i3) != 0) {
            i9 = R.attr.a04;
        } else {
            i9 = 0;
        }
        if ((65536 & i3) != 0) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        if ((131072 & i3) != 0) {
            i11 = R.attr.a1p;
        } else {
            i11 = 0;
        }
        if ((262144 & i3) != 0) {
            i12 = R.attr.a1h;
        } else {
            i12 = 0;
        }
        if ((524288 & i3) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this(i4, i5, null, pair, null, i14, null, i6, i7, i13, i8, str, awS430S0200000_292, function02, null, i9, i10, i11, i12, f2, (1048576 & i3) != 0 ? 1.0f : f3, (2097152 & i3) != 0 ? false : z6, (4194304 & i3) != 0 ? true : z5, (i3 & 8388608) != 0 ? false : z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C390690FTn(int i, int i2, Function0<? extends Drawable> function0, Pair<Integer, Integer> pair, Function0<? extends Drawable> function02, int i3, Integer num, int i4, int i5, int i6, int i7, String str, Function0<Unit> function03, Function0<Unit> function04, Integer num2, int i8, int i9, int i10, int i11, float f, float f2, boolean z, boolean z2, boolean z3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = function0;
        this.LIZLLL = pair;
        this.LJ = function02;
        this.LJFF = i3;
        this.LJI = num;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LJIIJ = i7;
        this.LJIIJJI = str;
        this.LJIIL = function03;
        this.LJIILIIL = function04;
        this.LJIILJJIL = num2;
        this.LJIILL = i8;
        this.LJIILLIIL = i9;
        this.LJIIZILJ = i10;
        this.LJIJ = i11;
        this.LJIJI = f;
        this.LJIJJ = f2;
        this.LJIJJLI = z;
        this.LJIL = z2;
        this.LJJ = z3;
    }
}
