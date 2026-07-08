package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10FD, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FD extends AnonymousClass1041 implements InterfaceC191854103w {
    public final Integer LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final Function2<View, Boolean, Unit> LJFF;
    public final Function1<View, Unit> LJI;
    public final Function2<View, Boolean, Boolean> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final C192009109v LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    public C10FD() {
        throw null;
    }

    @Override // X.InterfaceC191854103w
    public final boolean x0() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZJ(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZLLL(boolean z) {
        this.LJIILIIL = z;
    }

    public C10FD(Integer num, CharSequence charSequence, CharSequence charSequence2, Function2 function2, Function1 function1, Function2 function22, boolean z, boolean z2, boolean z3, boolean z4, C192009109v c192009109v, boolean z5, Function0 function0, int i) {
        Function2 function23 = function2;
        CharSequence charSequence3 = charSequence2;
        Function2 function24 = function22;
        Function1 function12 = function1;
        boolean z6 = z2;
        boolean z7 = z;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z5;
        C192009109v c192009109v2 = c192009109v;
        Function0 function02 = function0;
        Integer num2 = (i & 1) != 0 ? null : num;
        charSequence3 = (i & 4) != 0 ? null : charSequence3;
        function23 = (i & 8) != 0 ? null : function23;
        function12 = (i & 16) != 0 ? null : function12;
        function24 = (i & 32) != 0 ? null : function24;
        z7 = (i & 64) != 0 ? false : z7;
        z6 = (i & 128) != 0 ? false : z6;
        z9 = (i & 256) != 0 ? true : z9;
        z8 = (i & 512) != 0 ? false : z8;
        c192009109v2 = (i & 1024) != 0 ? null : c192009109v2;
        z10 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z10;
        function02 = (i & 8192) != 0 ? null : function02;
        this.LIZJ = num2;
        this.LIZLLL = charSequence;
        this.LJ = charSequence3;
        this.LJFF = function23;
        this.LJI = function12;
        this.LJII = function24;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = z6;
        this.LJIIJ = z9;
        this.LJIIJJI = z8;
        this.LJIIL = c192009109v2;
        this.LJIILIIL = z10;
        this.LJIILJJIL = false;
        this.LIZ = function02;
        this.LIZIZ = null;
    }
}
