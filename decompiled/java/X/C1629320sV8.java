package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0sV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629320sV8 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final C1629640sVe LJ;
    public final boolean LJFF;
    public final PropInfoData LJI;
    public final boolean LJII;
    public final Function1<Effect, Unit> LJIIIIZZ;
    public final Function2<Boolean, Effect, Unit> LJIIIZ;
    public final Function2<String, Effect, Unit> LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final Integer LJIIZILJ;
    public final Function0<String> LJIJ;
    public final Function0<InterfaceC1630900sXg> LJIJI;

    public C1629320sV8() {
        throw null;
    }

    public C1629320sV8(String str, boolean z, int i, String str2, C1629640sVe c1629640sVe, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, Function0 function0, Function0 function02, int i2) {
        AFwS266S0000000_25 aFwS266S0000000_25;
        AFwS286S0000000_3 aFwS286S0000000_3;
        AFwS311S0000000_25 aFwS311S0000000_25;
        boolean z7 = z2;
        String str3 = str2;
        boolean z8 = z3;
        Function0 function03 = function02;
        Integer num2 = num;
        boolean z9 = z5;
        boolean z10 = z4;
        Function0 function04 = function0;
        boolean z11 = z6;
        C1629640sVe c1629640sVe2 = c1629640sVe;
        boolean z12 = (i2 & 8) != 0 ? true : z;
        int i3 = (i2 & 16) == 0 ? i : 1;
        str3 = (i2 & 32) != 0 ? null : str3;
        c1629640sVe2 = (i2 & 64) != 0 ? new C1629640sVe(false, 0, 0, 0, 0) : c1629640sVe2;
        z7 = (i2 & 1024) != 0 ? false : z7;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(353);
        } else {
            aFwS266S0000000_25 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            aFwS286S0000000_3 = AFwS286S0000000_3.get$arr$(11);
        } else {
            aFwS286S0000000_3 = null;
        }
        if ((i2 & 8192) != 0) {
            aFwS311S0000000_25 = AFwS311S0000000_25.get$arr$(33);
        } else {
            aFwS311S0000000_25 = null;
        }
        z8 = (131072 & i2) != 0 ? false : z8;
        z10 = (262144 & i2) != 0 ? false : z10;
        z9 = (524288 & i2) != 0 ? false : z9;
        z11 = (1048576 & i2) != 0 ? false : z11;
        num2 = (2097152 & i2) != 0 ? null : num2;
        function04 = (4194304 & i2) != 0 ? AFwS214S0000000_25.get$arr$(402) : function04;
        function03 = (i2 & 8388608) != 0 ? AFwS214S0000000_25.get$arr$(403) : function03;
        this.LIZ = str;
        this.LIZIZ = z12;
        this.LIZJ = i3;
        this.LIZLLL = str3;
        this.LJ = c1629640sVe2;
        this.LJFF = false;
        this.LJI = null;
        this.LJII = z7;
        this.LJIIIIZZ = aFwS266S0000000_25;
        this.LJIIIZ = aFwS286S0000000_3;
        this.LJIIJ = aFwS311S0000000_25;
        this.LJIIJJI = null;
        this.LJIIL = false;
        this.LJIILIIL = z8;
        this.LJIILJJIL = z10;
        this.LJIILL = z9;
        this.LJIILLIIL = z11;
        this.LJIIZILJ = num2;
        this.LJIJ = function04;
        this.LJIJI = function03;
    }
}
