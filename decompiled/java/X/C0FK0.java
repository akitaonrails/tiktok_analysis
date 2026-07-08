package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FK0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FK0 {
    public final Function0<Boolean> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function0<Boolean> LJFF;
    public final Function0<Boolean> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Pair<Integer, Integer> LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final Function0<Boolean> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final List<String> LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final String LJIJJLI;
    public final C388040FJi LJIL;
    public final C0FKY LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;
    public final float LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;

    public C0FK0() {
        this(null, false, false, false, null, null, null, false, false, false, null, false, false, null, false, null, 0, 0, false, null, null, null, false, false, false, false, false, 0.0f, false, false, false, -1, 1023);
    }

    public C0FK0(AwS406S0200000_5 awS406S0200000_5, boolean z, boolean z2, boolean z3, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, Function0 function0, boolean z4, boolean z5, boolean z6, Pair pair, boolean z7, boolean z8, AwS549S0100000_5 awS549S0100000_53, boolean z9, List list, int i, int i2, boolean z10, String str, C388040FJi c388040FJi, C0FKY c0fky, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f, boolean z16, boolean z17, boolean z18, int i3, int i4) {
        boolean z19;
        Function0<Boolean> function02 = awS549S0100000_5;
        boolean z20 = z3;
        boolean z21 = z2;
        boolean z22 = z;
        boolean z23 = z18;
        boolean z24 = z17;
        float f2 = f;
        boolean z25 = z14;
        boolean z26 = z13;
        boolean z27 = z12;
        boolean z28 = z15;
        C388040FJi c388040FJi2 = c388040FJi;
        boolean z29 = z11;
        String str2 = str;
        boolean z30 = z10;
        int i5 = i2;
        int i6 = i;
        boolean z31 = z9;
        AwS549S0100000_5 awS549S0100000_54 = awS549S0100000_53;
        boolean z32 = z8;
        boolean z33 = z7;
        Pair pair2 = pair;
        Function0 function03 = function0;
        boolean z34 = z16;
        List arrayList = list;
        boolean z35 = z4;
        C0FKY c0fky2 = c0fky;
        boolean z36 = z6;
        boolean z37 = z5;
        Function0<Boolean> function04 = awS549S0100000_52;
        AwS406S0200000_5 awS406S0200000_52 = (i3 & 4) != 0 ? null : awS406S0200000_5;
        z22 = (i3 & 8) != 0 ? false : z22;
        z21 = (i3 & 16) != 0 ? false : z21;
        z20 = (i3 & 32) != 0 ? false : z20;
        function02 = (i3 & 64) != 0 ? AFwS191S0000000_5.get$arr$(384) : function02;
        function04 = (i3 & 128) != 0 ? AFwS191S0000000_5.get$arr$(385) : function04;
        function03 = (i3 & 256) != 0 ? AFwS191S0000000_5.get$arr$(386) : function03;
        z35 = (i3 & 512) != 0 ? false : z35;
        z37 = (i3 & 1024) != 0 ? false : z37;
        z36 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z36;
        pair2 = (i3 & 8192) != 0 ? new Pair(12, 64) : pair2;
        z33 = (i3 & 16384) != 0 ? false : z33;
        z32 = (32768 & i3) != 0 ? false : z32;
        awS549S0100000_54 = (65536 & i3) != 0 ? null : awS549S0100000_54;
        z31 = (131072 & i3) != 0 ? false : z31;
        arrayList = (2097152 & i3) != 0 ? new ArrayList() : arrayList;
        i6 = (4194304 & i3) != 0 ? -1 : i6;
        i5 = (8388608 & i3) != 0 ? 60 : i5;
        if ((16777216 & i3) != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        z30 = (33554432 & i3) != 0 ? false : z30;
        str2 = (67108864 & i3) != 0 ? "" : str2;
        c388040FJi2 = (134217728 & i3) != 0 ? new C388040FJi(false, false, false, false, 31) : c388040FJi2;
        c0fky2 = (268435456 & i3) != 0 ? new C0FKY(false, false, false, false, 63) : c0fky2;
        z29 = (536870912 & i3) != 0 ? false : z29;
        z27 = (1073741824 & i3) != 0 ? false : z27;
        z26 = (i3 & Integer.MIN_VALUE) != 0 ? false : z26;
        z25 = (i4 & 1) != 0 ? false : z25;
        z28 = (i4 & 4) != 0 ? false : z28;
        f2 = (i4 & 8) != 0 ? 0.0f : f2;
        z34 = (i4 & 16) != 0 ? false : z34;
        z24 = (i4 & 32) != 0 ? false : z24;
        z23 = (i4 & 256) != 0 ? false : z23;
        this.LIZ = awS406S0200000_52;
        this.LIZIZ = z22;
        this.LIZJ = z21;
        this.LIZLLL = z20;
        this.LJ = function02;
        this.LJFF = function04;
        this.LJI = function03;
        this.LJII = z35;
        this.LJIIIIZZ = z37;
        this.LJIIIZ = z36;
        this.LJIIJ = pair2;
        this.LJIIJJI = z33;
        this.LJIIL = z32;
        this.LJIILIIL = awS549S0100000_54;
        this.LJIILJJIL = z31;
        this.LJIILL = false;
        this.LJIILLIIL = arrayList;
        this.LJIIZILJ = i6;
        this.LJIJ = i5;
        this.LJIJI = z19;
        this.LJIJJ = z30;
        this.LJIJJLI = str2;
        this.LJIL = c388040FJi2;
        this.LJJ = c0fky2;
        this.LJJI = z29;
        this.LJJIFFI = z27;
        this.LJJII = z26;
        this.LJJIII = z25;
        this.LJJIIJ = z28;
        this.LJJIIJZLJL = f2;
        this.LJJIIZ = z34;
        this.LJJIIZI = z24;
        this.LJJIJ = false;
        this.LJJIJIIJI = z23;
        this.LJJIJIIJIL = false;
    }
}
