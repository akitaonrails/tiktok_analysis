package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358790E4v {
    public final C19A3 LIZ;
    public final C1DRG LIZIZ;
    public final C0E5S LIZJ;
    public final Function0<C0E48> LIZLLL;
    public final Function0<VideoPublishEditModel> LJ;
    public final Function0<C0EB6> LJFF;
    public final Function0<InterfaceC361710EGb> LJI;
    public final Function0<C0EJ3> LJII;
    public final Function0<InterfaceC363820EOe> LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;
    public final Function0<Boolean> LJIIJ;
    public final Function0<Boolean> LJIIJJI;
    public final Function1<Boolean, Unit> LJIIL;
    public final Function1<String, Boolean> LJIILIIL;
    public final Function1<Long, Unit> LJIILJJIL;
    public final ArrayDeque<C0E6E> LJIILL = new ArrayDeque<>();
    public NLETrackSlot LJIILLIIL;

    public static C0E6E LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return C0E6E.CLIP;
            }
            if (num.intValue() == 1) {
                return C0E6E.LINE;
            }
            return null;
        }
        return null;
    }

    public C358790E4v(C19EG c19eg, C19A3 c19a3, C1DRG c1drg, C0E5S c0e5s, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55, AwS549S0100000_5 awS549S0100000_56, AwS549S0100000_5 awS549S0100000_57, AwS549S0100000_5 awS549S0100000_58, AwS549S0100000_5 awS549S0100000_59, AwS584S0100000_5 awS584S0100000_5, AwS584S0100000_5 awS584S0100000_52, AwS584S0100000_5 awS584S0100000_53) {
        this.LIZ = c19a3;
        this.LIZIZ = c1drg;
        this.LIZJ = c0e5s;
        this.LIZLLL = awS549S0100000_5;
        this.LJ = awS549S0100000_52;
        this.LJFF = awS549S0100000_53;
        this.LJI = awS549S0100000_54;
        this.LJII = awS549S0100000_55;
        this.LJIIIIZZ = awS549S0100000_56;
        this.LJIIIZ = awS549S0100000_57;
        this.LJIIJ = awS549S0100000_58;
        this.LJIIJJI = awS549S0100000_59;
        this.LJIIL = awS584S0100000_5;
        this.LJIILIIL = awS584S0100000_52;
        this.LJIILJJIL = awS584S0100000_53;
    }
}
