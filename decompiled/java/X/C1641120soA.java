package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0soA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641120soA {
    public final boolean LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public float LIZLLL;
    public final int LJ;
    public float LJFF;
    public float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final float LJIILJJIL;
    public final boolean LJIILL;
    public final Function1<? super C1641170soF, Unit> LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final boolean LJJ;
    public final int LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public int LJJIIJZLJL;
    public final Function0<Boolean> LJJIIZ;
    public final Function0<Unit> LJJIIZI;
    public final Function2<? super Integer, ? super Activity, ? extends ViewGroup> LJJIJ;

    public C1641120soA(int i, float f, float f2, float f3, float f4, boolean z, boolean z2, int i2) {
        float f5;
        int i3;
        float f6;
        float f7;
        float f8;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6 = z2;
        float f9 = f4;
        float f10 = f2;
        boolean z7 = z;
        int i9 = (i2 & 2) != 0 ? R.color.vz : i;
        if ((i2 & 4) != 0) {
            f5 = 8.0f;
        } else {
            f5 = 0.0f;
        }
        float f11 = (i2 & 8) == 0 ? f : 8.0f;
        if ((i2 & 16) != 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        f10 = (i2 & 32) != 0 ? 54.0f : f10;
        float f12 = (i2 & 64) == 0 ? f3 : 54.0f;
        if ((i2 & 128) != 0) {
            f6 = -2.0f;
        } else {
            f6 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f7 = -2.0f;
        } else {
            f7 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f8 = -1.0f;
        } else {
            f8 = 0.0f;
        }
        float f13 = (i2 & 1024) == 0 ? 0.0f : -2.0f;
        float f14 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 2.0f : 0.0f;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i4 = R.drawable.dht;
        } else {
            i4 = 0;
        }
        if ((i2 & 8192) != 0) {
            i5 = R.drawable.dhu;
        } else {
            i5 = 0;
        }
        f9 = (i2 & 16384) != 0 ? 1.1f : f9;
        if ((32768 & i2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z7 = (131072 & i2) != 0 ? false : z7;
        z6 = (262144 & i2) != 0 ? false : z6;
        if ((524288 & i2) != 0) {
            i6 = 12;
        } else {
            i6 = 0;
        }
        if ((1048576 & i2) != 0) {
            i7 = 20;
        } else {
            i7 = 0;
        }
        if ((2097152 & i2) != 0) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        if ((8388608 & i2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 67108864) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(569);
        AFwS311S0000000_25 aFwS311S0000000_25 = AFwS311S0000000_25.get$arr$(75);
        this.LIZ = false;
        this.LIZIZ = i9;
        this.LIZJ = f5;
        this.LIZLLL = f11;
        this.LJ = i3;
        this.LJFF = f10;
        this.LJI = f12;
        this.LJII = f6;
        this.LJIIIIZZ = f7;
        this.LJIIIZ = f8;
        this.LJIIJ = f13;
        this.LJIIJJI = f14;
        this.LJIIL = i4;
        this.LJIILIIL = i5;
        this.LJIILJJIL = f9;
        this.LJIILL = z3;
        this.LJIILLIIL = null;
        this.LJIIZILJ = z7;
        this.LJIJ = z6;
        this.LJIJI = i6;
        this.LJIJJ = i7;
        this.LJIJJLI = i8;
        this.LJIL = 0;
        this.LJJ = z4;
        this.LJJI = 0;
        this.LJJIFFI = z5;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = 4;
        this.LJJIIZ = aFwS214S0000000_25;
        this.LJJIIZI = null;
        this.LJJIJ = aFwS311S0000000_25;
    }
}
