package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946060aj6<T> {
    public T LIZ;
    public String LIZIZ;
    public Function2<? super T, ? super T, Unit> LIZJ;
    public final Function1<? super Long, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public Function0<Unit> LJFF;
    public Function1<? super Integer, Unit> LJI;
    public Function1<? super String, Unit> LJII;
    public Function1<? super Integer, Unit> LJIIIIZZ;
    public final boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public final String LJIIJJI;
    public Function0<Unit> LJIIL;
    public C334801Rq LJIILIIL;
    public volatile boolean LJIILJJIL;
    public final C01GW LJIILL;

    public C946060aj6() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, 16383);
    }

    public final T LIZ() {
        if (!this.LJIIJ || !this.LJIILJJIL) {
            return null;
        }
        T t = this.LIZ;
        this.LJIILJJIL = false;
        return t;
    }

    public final C946050aj5 LIZIZ() {
        return (C946050aj5) this.LJIILL.getValue();
    }

    public C946060aj6(Object obj, String str, Function2 function2, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function1 function14, boolean z, String str2, Function0 function02, C334801Rq c334801Rq, int i) {
        boolean z2;
        Function2 function22 = function2;
        String str3 = str;
        Function0 function03 = function0;
        Function1 function15 = function1;
        Function1 function16 = function13;
        Function1 function17 = function12;
        boolean z3 = z;
        Function1 function18 = function14;
        Function0 function04 = function02;
        String str4 = str2;
        C334801Rq c334801Rq2 = c334801Rq;
        Object obj2 = (i & 1) != 0 ? null : obj;
        str3 = (i & 2) != 0 ? "playbook_entity" : str3;
        function22 = (i & 4) != 0 ? null : function22;
        function15 = (i & 8) != 0 ? null : function15;
        function03 = (i & 32) != 0 ? null : function03;
        function17 = (i & 64) != 0 ? null : function17;
        function16 = (i & 128) != 0 ? null : function16;
        function18 = (i & 256) != 0 ? null : function18;
        if ((i & 512) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z3 = (i & 1024) != 0 ? true : z3;
        str4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "Normal" : str4;
        function04 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function04;
        c334801Rq2 = (i & 8192) != 0 ? null : c334801Rq2;
        this.LIZ = (T) obj2;
        this.LIZIZ = str3;
        this.LIZJ = function22;
        this.LIZLLL = function15;
        this.LJ = null;
        this.LJFF = function03;
        this.LJI = function17;
        this.LJII = function16;
        this.LJIIIIZZ = function18;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = str4;
        this.LJIIL = function04;
        this.LJIILIIL = c334801Rq2;
        this.LJIILJJIL = true;
        this.LJIILL = C452501pT.LIZIZ(new AwS559S0100000_15(this, (C946060aj6<Object>) 552));
    }
}
