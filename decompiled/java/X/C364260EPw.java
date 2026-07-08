package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364260EPw {
    public final Boolean LIZ;
    public final boolean LIZIZ;
    public final Pair<Boolean, Boolean> LIZJ;
    public final boolean LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final boolean LJFF;
    public final C364110EPh LJI;
    public final int LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final C375830EoP<NLETrackSlot> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final Integer LJIIJJI;
    public final C375830EoP<Pair<String, String>> LJIIL;
    public final C375830EoP<String> LJIILIIL;
    public final C375830EoP<Pair<Boolean, List<NLETrackSlot>>> LJIILJJIL;
    public final NLETrackSlot LJIILL;
    public final Pair<Boolean, Boolean> LJIILLIIL;
    public final C364270EPx LJIIZILJ;
    public final boolean LJIJ;
    public final C375830EoP<Boolean> LJIJI;
    public final C375830EoP<Unit> LJIJJ;
    public final C375830EoP<Boolean> LJIJJLI;
    public final C375830EoP<Unit> LJIL;

    public C364260EPw() {
        this(0, 8388607);
    }

    public C364260EPw(int i, int i2) {
        boolean z;
        Pair pair;
        boolean z2;
        Pair pair2;
        C364270EPx c364270EPx;
        boolean z3;
        int i3 = i;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            Boolean bool = Boolean.FALSE;
            pair = new Pair(bool, bool);
        } else {
            pair = null;
        }
        if ((i2 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i3 = (i2 & 128) != 0 ? 0 : i3;
        if ((65536 & i2) != 0) {
            pair2 = new Pair(null, Boolean.FALSE);
        } else {
            pair2 = null;
        }
        if ((131072 & i2) != 0) {
            c364270EPx = new C364270EPx(0);
        } else {
            c364270EPx = null;
        }
        if ((i2 & 262144) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(null, z, pair, false, null, z2, null, i3, null, null, null, null, null, null, null, null, pair2, c364270EPx, z3, null, null, null, null);
    }

    public C364260EPw(Boolean bool, boolean z, Pair<Boolean, Boolean> pair, boolean z2, Pair<Integer, Integer> pair2, boolean z3, C364110EPh c364110EPh, int i, C375830EoP<Unit> c375830EoP, C375830EoP<NLETrackSlot> c375830EoP2, C375830EoP<Unit> c375830EoP3, Integer num, C375830EoP<Pair<String, String>> c375830EoP4, C375830EoP<String> c375830EoP5, C375830EoP<Pair<Boolean, List<NLETrackSlot>>> c375830EoP6, NLETrackSlot nLETrackSlot, Pair<Boolean, Boolean> pair3, C364270EPx c364270EPx, boolean z4, C375830EoP<Boolean> c375830EoP7, C375830EoP<Unit> c375830EoP8, C375830EoP<Boolean> c375830EoP9, C375830EoP<Unit> c375830EoP10) {
        this.LIZ = bool;
        this.LIZIZ = z;
        this.LIZJ = pair;
        this.LIZLLL = z2;
        this.LJ = pair2;
        this.LJFF = z3;
        this.LJI = c364110EPh;
        this.LJII = i;
        this.LJIIIIZZ = c375830EoP;
        this.LJIIIZ = c375830EoP2;
        this.LJIIJ = c375830EoP3;
        this.LJIIJJI = num;
        this.LJIIL = c375830EoP4;
        this.LJIILIIL = c375830EoP5;
        this.LJIILJJIL = c375830EoP6;
        this.LJIILL = nLETrackSlot;
        this.LJIILLIIL = pair3;
        this.LJIIZILJ = c364270EPx;
        this.LJIJ = z4;
        this.LJIJI = c375830EoP7;
        this.LJIJJ = c375830EoP8;
        this.LJIJJLI = c375830EoP9;
        this.LJIL = c375830EoP10;
    }

    public static C364260EPw LIZ(C364260EPw c364260EPw, Boolean bool, boolean z, Pair pair, boolean z2, Pair pair2, boolean z3, C364110EPh c364110EPh, int i, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, Integer num, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, NLETrackSlot nLETrackSlot, Pair pair3, C364270EPx c364270EPx, boolean z4, C375830EoP c375830EoP7, C375830EoP c375830EoP8, C375830EoP c375830EoP9, C375830EoP c375830EoP10, int i2) {
        C375830EoP c375830EoP11 = c375830EoP10;
        C375830EoP c375830EoP12 = c375830EoP9;
        C364270EPx c364270EPx2 = c364270EPx;
        Pair pair4 = pair3;
        Integer num2 = num;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        C375830EoP c375830EoP13 = c375830EoP4;
        C375830EoP c375830EoP14 = c375830EoP3;
        C375830EoP c375830EoP15 = c375830EoP8;
        C375830EoP c375830EoP16 = c375830EoP2;
        int i3 = i;
        C375830EoP c375830EoP17 = c375830EoP6;
        C375830EoP c375830EoP18 = c375830EoP;
        C364110EPh c364110EPh2 = c364110EPh;
        C375830EoP c375830EoP19 = c375830EoP7;
        Pair pair5 = pair2;
        C375830EoP c375830EoP20 = c375830EoP5;
        boolean z5 = z3;
        boolean z6 = z2;
        Pair pair6 = pair;
        boolean z7 = z4;
        boolean z8 = z;
        Boolean bool2 = bool;
        if ((i2 & 1) != 0) {
            bool2 = c364260EPw.LIZ;
        }
        if ((i2 & 2) != 0) {
            z8 = c364260EPw.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            pair6 = c364260EPw.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z6 = c364260EPw.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            pair5 = c364260EPw.LJ;
        }
        if ((i2 & 32) != 0) {
            z5 = c364260EPw.LJFF;
        }
        if ((i2 & 64) != 0) {
            c364110EPh2 = c364260EPw.LJI;
        }
        if ((i2 & 128) != 0) {
            i3 = c364260EPw.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP18 = c364260EPw.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c375830EoP16 = c364260EPw.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            c375830EoP14 = c364260EPw.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = c364260EPw.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP13 = c364260EPw.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            c375830EoP20 = c364260EPw.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            c375830EoP17 = c364260EPw.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            nLETrackSlot2 = c364260EPw.LJIILL;
        }
        if ((65536 & i2) != 0) {
            pair4 = c364260EPw.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            c364270EPx2 = c364260EPw.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            z7 = c364260EPw.LJIJ;
        }
        if ((524288 & i2) != 0) {
            c375830EoP19 = c364260EPw.LJIJI;
        }
        if ((1048576 & i2) != 0) {
            c375830EoP15 = c364260EPw.LJIJJ;
        }
        if ((2097152 & i2) != 0) {
            c375830EoP12 = c364260EPw.LJIJJLI;
        }
        if ((i2 & 4194304) != 0) {
            c375830EoP11 = c364260EPw.LJIL;
        }
        c364260EPw.getClass();
        C364110EPh c364110EPh3 = c364110EPh2;
        int i4 = i3;
        C375830EoP c375830EoP21 = c375830EoP18;
        C375830EoP c375830EoP22 = c375830EoP16;
        return new C364260EPw(bool2, z8, pair6, z6, pair5, z5, c364110EPh3, i4, c375830EoP21, c375830EoP22, c375830EoP14, num2, c375830EoP13, c375830EoP20, c375830EoP17, nLETrackSlot2, pair4, c364270EPx2, z7, c375830EoP19, c375830EoP15, c375830EoP12, c375830EoP11);
    }
}
