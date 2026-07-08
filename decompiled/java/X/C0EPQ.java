package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPQ {
    public final Function1<Boolean, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public final Function2<Float, Boolean, Unit> LIZLLL;
    public final Function1<NLETrackSlot, Unit> LJ;
    public final Function1<NLETrackSlot, Unit> LJFF;
    public final Function1<Effect, Unit> LJI;
    public final InterfaceC1631630sYr<NLETrackSlot, Float, Boolean, Boolean, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function1<Function0<Boolean>, Unit> LJIIIZ;
    public final Function0<List<String>> LJIIJ;
    public final Function1<Boolean, Unit> LJIIJJI;

    public C0EPQ() {
        this(null, null, null, null, null, null, null, null, null, null, 4095);
    }

    public C0EPQ(AwS584S0100000_5 awS584S0100000_5, AwS549S0100000_5 awS549S0100000_5, AwS584S0100000_5 awS584S0100000_52, AwS584S0100000_5 awS584S0100000_53, AwS584S0100000_5 awS584S0100000_54, AwS584S0100000_5 awS584S0100000_55, AwS549S0100000_5 awS549S0100000_52, AwS584S0100000_5 awS584S0100000_56, AwS549S0100000_5 awS549S0100000_53, AwS584S0100000_5 awS584S0100000_57, int i) {
        AnonymousClass0208 anonymousClass0208;
        C2378809Tu c2378809Tu;
        Function1<Boolean, Unit> function1 = (i & 1) != 0 ? AFwS231S0000000_3.get$arr$(72) : awS584S0100000_5;
        Function0<Unit> function0 = (i & 2) != 0 ? AFwS191S0000000_5.get$arr$(51) : awS549S0100000_5;
        Function1<Boolean, Unit> function12 = (i & 4) != 0 ? AFwS231S0000000_3.get$arr$(73) : awS584S0100000_52;
        if ((i & 8) != 0) {
            anonymousClass0208 = AnonymousClass0208.get$arr$(7);
        } else {
            anonymousClass0208 = null;
        }
        Function1<NLETrackSlot, Unit> function13 = (i & 16) != 0 ? AFwS234S0000000_5.get$arr$(35) : awS584S0100000_53;
        Function1<NLETrackSlot, Unit> function14 = (i & 32) != 0 ? AFwS234S0000000_5.get$arr$(36) : awS584S0100000_54;
        Function1<Effect, Unit> function15 = (i & 64) != 0 ? AFwS234S0000000_5.get$arr$(38) : awS584S0100000_55;
        if ((i & 128) != 0) {
            c2378809Tu = new C2378809Tu();
        } else {
            c2378809Tu = null;
        }
        Function0<Unit> function02 = (i & 256) != 0 ? AFwS191S0000000_5.get$arr$(52) : awS549S0100000_52;
        awS584S0100000_56 = (i & 512) != 0 ? null : awS584S0100000_56;
        Function0<List<String>> function03 = (i & 1024) != 0 ? AFwS187S0000000_2.get$arr$(658) : awS549S0100000_53;
        Function1<Boolean, Unit> function16 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? AFwS231S0000000_3.get$arr$(71) : awS584S0100000_57;
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = function12;
        this.LIZLLL = anonymousClass0208;
        this.LJ = function13;
        this.LJFF = function14;
        this.LJI = function15;
        this.LJII = c2378809Tu;
        this.LJIIIIZZ = function02;
        this.LJIIIZ = awS584S0100000_56;
        this.LJIIJ = function03;
        this.LJIIJJI = function16;
    }
}
