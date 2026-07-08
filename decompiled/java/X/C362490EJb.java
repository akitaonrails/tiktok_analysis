package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362490EJb {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final Function0<Unit> LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final Integer LJIIIZ;
    public final int LJIIJ;
    public final Integer LJIIJJI;
    public final int LJIIL;
    public final Integer LJIILIIL;
    public final C0EE1 LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final Integer LJIJ;
    public final boolean LJIJI;
    public final View LJIJJ;
    public final Function0<Unit> LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final Function2<? super C357590E0f, ? super ViewGroup, ? extends View> LJJIII;

    public C362490EJb(String str, boolean z, int i, Function0 function0, int i2, int i3, int i4, Integer num, int i5, Integer num2, int i6, boolean z2, boolean z3, boolean z4, Integer num3, boolean z5, boolean z6, boolean z7, boolean z8, Function2 function2, int i7) {
        int i8;
        int i9;
        C0EE1 c0ee1;
        boolean z9;
        Integer num4 = num2;
        int i10 = i5;
        Integer num5 = num;
        int i11 = i4;
        int i12 = i3;
        int i13 = i2;
        Function0 function02 = function0;
        int i14 = i;
        boolean z10 = z;
        Function2 function22 = function2;
        boolean z11 = z8;
        boolean z12 = z6;
        boolean z13 = z5;
        boolean z14 = z4;
        boolean z15 = z3;
        boolean z16 = z7;
        Integer num6 = num3;
        boolean z17 = z2;
        int i15 = i6;
        String str2 = (i7 & 1) != 0 ? "" : str;
        z10 = (i7 & 2) != 0 ? true : z10;
        i14 = (i7 & 4) != 0 ? 44 : i14;
        function02 = (i7 & 8) != 0 ? null : function02;
        i13 = (i7 & 16) != 0 ? 52 : i13;
        if ((i7 & 32) != 0) {
            if (C357780E0y.LIZ()) {
                i12 = 20;
            } else {
                i12 = 16;
            }
        }
        i11 = (i7 & 64) != 0 ? 54 : i11;
        if ((i7 & 128) != 0) {
            i8 = 34;
        } else {
            i8 = 0;
        }
        if ((i7 & 256) != 0) {
            i9 = R.color.gv;
        } else {
            i9 = 0;
        }
        num5 = (i7 & 512) != 0 ? null : num5;
        i10 = (i7 & 1024) != 0 ? -7829368 : i10;
        num4 = (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num4;
        i15 = (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i15;
        if ((i7 & 16384) != 0) {
            c0ee1 = C0EE1.UP;
        } else {
            c0ee1 = null;
        }
        z17 = (32768 & i7) != 0 ? false : z17;
        z15 = (65536 & i7) != 0 ? false : z15;
        z14 = (131072 & i7) != 0 ? false : z14;
        num6 = (262144 & i7) != 0 ? null : num6;
        z13 = (8388608 & i7) != 0 ? false : z13;
        z12 = (33554432 & i7) != 0 ? false : z12;
        z16 = (67108864 & i7) != 0 ? false : z16;
        if ((134217728 & i7) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        z11 = (268435456 & i7) != 0 ? false : z11;
        function22 = (i7 & 536870912) != 0 ? null : function22;
        this.LIZ = str2;
        this.LIZIZ = z10;
        this.LIZJ = i14;
        this.LIZLLL = function02;
        this.LJ = i13;
        this.LJFF = i12;
        this.LJI = i11;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = num5;
        this.LJIIJ = i10;
        this.LJIIJJI = num4;
        this.LJIIL = i15;
        this.LJIILIIL = null;
        this.LJIILJJIL = c0ee1;
        this.LJIILL = z17;
        this.LJIILLIIL = z15;
        this.LJIIZILJ = z14;
        this.LJIJ = num6;
        this.LJIJI = false;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = z13;
        this.LJJ = z12;
        this.LJJI = z16;
        this.LJJIFFI = z9;
        this.LJJII = z11;
        this.LJJIII = function22;
    }
}
