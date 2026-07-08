package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10FB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C10FB extends AnonymousClass1041 implements InterfaceC191854103w {
    public final Integer LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final CharSequence LJFF;
    public final Function1<View, Unit> LJI;
    public final Function1<View, Unit> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public C10FB() {
        throw null;
    }

    @Override // X.InterfaceC191854103w
    public final boolean x0() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZJ(boolean z) {
        this.LJIILIIL = z;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZLLL(boolean z) {
        this.LJIIL = z;
    }

    public C10FB(Integer num, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1, Function1 function12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, int i) {
        CharSequence charSequence4 = charSequence2;
        CharSequence charSequence5 = charSequence3;
        Function1 function13 = function1;
        Function1 function14 = function12;
        boolean z6 = z;
        boolean z7 = z3;
        boolean z8 = z5;
        boolean z9 = z4;
        Function0 function02 = function0;
        num = (i & 1) != 0 ? null : num;
        charSequence4 = (i & 4) != 0 ? null : charSequence4;
        charSequence5 = (i & 8) != 0 ? null : charSequence5;
        function13 = (i & 16) != 0 ? null : function13;
        function14 = (i & 32) != 0 ? null : function14;
        z6 = (i & 64) != 0 ? true : z6;
        boolean z10 = (i & 128) == 0 ? z2 : true;
        z7 = (i & 256) != 0 ? false : z7;
        z9 = (i & 512) != 0 ? false : z9;
        z8 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z8;
        function02 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function02;
        this.LIZJ = num;
        this.LIZLLL = charSequence;
        this.LJ = charSequence4;
        this.LJFF = charSequence5;
        this.LJI = function13;
        this.LJII = function14;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = z10;
        this.LJIIJ = z7;
        this.LJIIJJI = z9;
        this.LJIIL = false;
        this.LJIILIIL = z8;
        this.LIZ = function02;
        this.LIZIZ = null;
    }
}
