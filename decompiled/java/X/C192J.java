package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.192J, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C192J {
    public final Integer LIZ;
    public final CharSequence LIZIZ;
    public final CharSequence LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C192009109v LJII;
    public final Function2<View, Boolean, Unit> LJIIIIZZ;
    public final Function1<View, Unit> LJIIIZ;
    public final Function2<View, Boolean, Boolean> LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final boolean LJIIL;

    public C192J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192J)) {
            return false;
        }
        C192J c192j = (C192J) obj;
        return Intrinsics.LJFF(this.LIZ, c192j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c192j.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c192j.LIZJ) && this.LIZLLL == c192j.LIZLLL && this.LJ == c192j.LJ && this.LJFF == c192j.LJFF && this.LJI == c192j.LJI && Intrinsics.LJFF(this.LJII, c192j.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c192j.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c192j.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c192j.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c192j.LJIIJJI) && this.LJIIL == c192j.LJIIL;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        CharSequence charSequence = this.LIZJ;
        int iHashCode2 = (((((((((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        C192009109v c192009109v = this.LJII;
        int iHashCode3 = (iHashCode2 + (c192009109v == null ? 0 : c192009109v.hashCode())) * 31;
        Function2<View, Boolean, Unit> function2 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2<View, Boolean, Boolean> function22 = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function0<Unit> function0 = this.LJIIJJI;
        return ((iHashCode6 + (function0 != null ? function0.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIL);
    }

    public final String toString() {
        return "PublishPrivacySwitchViewState(icon=" + this.LIZ + ", titleStr=" + ((Object) this.LIZIZ) + ", subtitleStr=" + ((Object) this.LIZJ) + ", isChecked=" + this.LIZLLL + ", isEnabled=" + this.LJ + ", isLoading=" + this.LJFF + ", isHighlight=" + this.LJI + ", uiConfig=" + this.LJII + ", onSelectListener=" + this.LJIIIIZZ + ", onDisabledClickListener=" + this.LJIIIZ + ", onInterceptClickListener=" + this.LJIIJ + ", onShow=" + this.LJIIJJI + ", inPublishPage=" + this.LJIIL + ')';
    }

    public /* synthetic */ C192J(int i) {
        this(null, "", null, false, true, false, false, null, null, null, null, null, false);
    }

    public static C192J LIZ(C192J c192j, boolean z, int i) {
        Integer num;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2;
        boolean z3;
        boolean z4;
        C192009109v c192009109v;
        Function2<View, Boolean, Unit> function2;
        Function1<View, Unit> function1;
        Function2<View, Boolean, Boolean> function22;
        boolean z5;
        boolean z6 = z;
        Function0<Unit> function0 = null;
        if ((i & 1) != 0) {
            num = c192j.LIZ;
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = c192j.LIZIZ;
        } else {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            charSequence2 = c192j.LIZJ;
        } else {
            charSequence2 = null;
        }
        if ((i & 8) != 0) {
            z2 = c192j.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z6 = c192j.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c192j.LJFF;
        } else {
            z3 = false;
        }
        if ((i & 64) != 0) {
            z4 = c192j.LJI;
        } else {
            z4 = false;
        }
        if ((i & 128) != 0) {
            c192009109v = c192j.LJII;
        } else {
            c192009109v = null;
        }
        if ((i & 256) != 0) {
            function2 = c192j.LJIIIIZZ;
        } else {
            function2 = null;
        }
        if ((i & 512) != 0) {
            function1 = c192j.LJIIIZ;
        } else {
            function1 = null;
        }
        if ((i & 1024) != 0) {
            function22 = c192j.LJIIJ;
        } else {
            function22 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function0 = c192j.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = c192j.LJIIL;
        } else {
            z5 = false;
        }
        return new C192J(num, charSequence, charSequence2, z2, z6, z3, z4, c192009109v, function2, function1, function22, function0, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C192J(Integer num, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, boolean z4, C192009109v c192009109v, Function2<? super View, ? super Boolean, Unit> function2, Function1<? super View, Unit> function1, Function2<? super View, ? super Boolean, Boolean> function22, Function0<Unit> function0, boolean z5) {
        this.LIZ = num;
        this.LIZIZ = charSequence;
        this.LIZJ = charSequence2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = c192009109v;
        this.LJIIIIZZ = function2;
        this.LJIIIZ = function1;
        this.LJIIJ = function22;
        this.LJIIJJI = function0;
        this.LJIIL = z5;
    }
}
