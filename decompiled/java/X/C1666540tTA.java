package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666540tTA {
    public final boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final Function0<Unit> LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final Function0<Unit> LJIIL;
    public final Function0<Unit> LJIILIIL;
    public final Function0<Unit> LJIILJJIL;
    public final Function0<Unit> LJIILL;
    public final Function0<Unit> LJIILLIIL;
    public final Function0<Unit> LJIIZILJ;
    public final Function2<Integer, Integer, Unit> LJIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1666540tTA() {
        boolean z = false;
        this(z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666540tTA)) {
            return false;
        }
        C1666540tTA c1666540tTA = (C1666540tTA) obj;
        return this.LIZ == c1666540tTA.LIZ && Intrinsics.LJFF(this.LIZIZ, c1666540tTA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1666540tTA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1666540tTA.LIZLLL) && Intrinsics.LJFF(this.LJ, c1666540tTA.LJ) && this.LJFF == c1666540tTA.LJFF && this.LJI == c1666540tTA.LJI && this.LJII == c1666540tTA.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1666540tTA.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1666540tTA.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1666540tTA.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1666540tTA.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1666540tTA.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1666540tTA.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1666540tTA.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1666540tTA.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1666540tTA.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1666540tTA.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1666540tTA.LJIJ);
    }

    public static C1666540tTA LIZ(C1666540tTA c1666540tTA, boolean z, String str, int i) {
        Boolean bool;
        Boolean bool2;
        Integer num;
        boolean z2;
        boolean z3;
        Function0<Unit> function0;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function0<Unit> function010;
        String str2 = str;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c1666540tTA.LIZ;
        }
        Function2<Integer, Integer, Unit> function2 = null;
        if ((i & 2) != 0) {
            bool = c1666540tTA.LIZIZ;
        } else {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = c1666540tTA.LIZJ;
        } else {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            num = c1666540tTA.LIZLLL;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = c1666540tTA.LJ;
        }
        boolean z5 = false;
        if ((i & 32) != 0) {
            z2 = c1666540tTA.LJFF;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c1666540tTA.LJI;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            z5 = c1666540tTA.LJII;
        }
        if ((i & 256) != 0) {
            function0 = c1666540tTA.LJIIIIZZ;
        } else {
            function0 = null;
        }
        if ((i & 512) != 0) {
            function02 = c1666540tTA.LJIIIZ;
        } else {
            function02 = null;
        }
        if ((i & 1024) != 0) {
            function03 = c1666540tTA.LJIIJ;
        } else {
            function03 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function04 = c1666540tTA.LJIIJJI;
        } else {
            function04 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function05 = c1666540tTA.LJIIL;
        } else {
            function05 = null;
        }
        if ((i & 8192) != 0) {
            function06 = c1666540tTA.LJIILIIL;
        } else {
            function06 = null;
        }
        if ((i & 16384) != 0) {
            function07 = c1666540tTA.LJIILJJIL;
        } else {
            function07 = null;
        }
        if ((32768 & i) != 0) {
            function08 = c1666540tTA.LJIILL;
        } else {
            function08 = null;
        }
        if ((65536 & i) != 0) {
            function09 = c1666540tTA.LJIILLIIL;
        } else {
            function09 = null;
        }
        if ((131072 & i) != 0) {
            function010 = c1666540tTA.LJIIZILJ;
        } else {
            function010 = null;
        }
        if ((i & 262144) != 0) {
            function2 = c1666540tTA.LJIJ;
        }
        c1666540tTA.getClass();
        return new C1666540tTA(z4, bool, bool2, num, str2, z2, z3, z5, function0, function02, function03, function04, function05, function06, function07, function08, function09, function010, function2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1666540tTA(boolean z, Boolean bool, Boolean bool2, String str, boolean z2, boolean z3, boolean z4, C2221471Bx3 c2221471Bx3, C2221491Bx5 c2221491Bx5, C2221511Bx7 c2221511Bx7, C2221531Bx9 c2221531Bx9, C2221551BxB c2221551BxB, C2221581BxE c2221581BxE, C2221601BxG c2221601BxG, C2221621BxI c2221621BxI, C2221461Bx2 c2221461Bx2, int i) {
        AFwS214S0000000_25 aFwS214S0000000_25;
        Function0 function0 = c2221621BxI;
        Function0 function02 = c2221601BxG;
        Function2 function2 = c2221461Bx2;
        Function0 function03 = c2221581BxE;
        Function0 function04 = c2221491Bx5;
        Function0 function05 = c2221471Bx3;
        Function0 function06 = c2221551BxB;
        boolean z5 = z4;
        boolean z6 = z3;
        Boolean bool3 = bool2;
        Function0 function07 = c2221531Bx9;
        String str2 = str;
        boolean z7 = z2;
        Boolean bool4 = bool;
        Function0 function08 = c2221511Bx7;
        boolean z8 = (i & 1) != 0 ? true : z;
        bool4 = (i & 2) != 0 ? null : bool4;
        bool3 = (i & 4) != 0 ? null : bool3;
        str2 = (i & 16) != 0 ? "" : str2;
        z7 = (i & 32) != 0 ? false : z7;
        z6 = (i & 64) != 0 ? false : z6;
        z5 = (i & 128) != 0 ? false : z5;
        function05 = (i & 256) != 0 ? AFwS214S0000000_25.get$arr$(383) : function05;
        function04 = (i & 512) != 0 ? AFwS214S0000000_25.get$arr$(384) : function04;
        function08 = (i & 1024) != 0 ? AFwS214S0000000_25.get$arr$(385) : function08;
        function07 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? AFwS214S0000000_25.get$arr$(386) : function07;
        function06 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? AFwS214S0000000_25.get$arr$(387) : function06;
        function03 = (i & 8192) != 0 ? AFwS214S0000000_25.get$arr$(388) : function03;
        function02 = (i & 16384) != 0 ? AFwS214S0000000_25.get$arr$(389) : function02;
        function0 = (32768 & i) != 0 ? AFwS214S0000000_25.get$arr$(390) : function0;
        if ((65536 & i) != 0) {
            aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(391);
        } else {
            aFwS214S0000000_25 = null;
        }
        this(z8, bool4, bool3, null, str2, z7, z6, z5, function05, function04, function08, function07, function06, function03, function02, function0, aFwS214S0000000_25, (131072 & i) != 0 ? AFwS214S0000000_25.get$arr$(382) : null, (i & 262144) != 0 ? AFwS286S0000000_3.get$arr$(10) : function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1666540tTA(boolean z, Boolean bool, Boolean bool2, Integer num, String str, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LIZ = z;
        this.LIZIZ = bool;
        this.LIZJ = bool2;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = function0;
        this.LJIIIZ = function02;
        this.LJIIJ = function03;
        this.LJIIJJI = function04;
        this.LJIIL = function05;
        this.LJIILIIL = function06;
        this.LJIILJJIL = function07;
        this.LJIILL = function08;
        this.LJIILLIIL = function09;
        this.LJIIZILJ = function010;
        this.LJIJ = function2;
    }
}
