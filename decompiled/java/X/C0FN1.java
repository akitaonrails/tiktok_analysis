package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FN1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FN1 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final CharSequence LJFF;
    public final Function0<Unit> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final Pair<Float, Float> LJIIIZ;
    public final int LJIIJ;
    public final Integer LJIIJJI;
    public final float LJIIL;
    public final boolean LJIILIIL;

    public C0FN1() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FN1)) {
            return false;
        }
        C0FN1 c0fn1 = (C0FN1) obj;
        return this.LIZ == c0fn1.LIZ && this.LIZIZ == c0fn1.LIZIZ && this.LIZJ == c0fn1.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0fn1.LIZLLL) && this.LJ == c0fn1.LJ && Intrinsics.LJFF(this.LJFF, c0fn1.LJFF) && Intrinsics.LJFF(this.LJI, c0fn1.LJI) && this.LJII == c0fn1.LJII && this.LJIIIIZZ == c0fn1.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c0fn1.LJIIIZ) && this.LJIIJ == c0fn1.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0fn1.LJIIJJI) && Float.compare(this.LJIIL, c0fn1.LJIIL) == 0 && this.LJIILIIL == c0fn1.LJIILIIL;
    }

    public final String toString() {
        return "DialogItem(iconId=" + this.LIZ + ", textId=" + this.LIZIZ + ", textColor=" + this.LIZJ + ", tintColorRes=" + this.LIZLLL + ", textRes=" + this.LJ + ", text=" + ((Object) this.LJFF) + ", clickListener=" + this.LJI + ", enable=" + this.LJII + ", isCCEntrance=" + this.LJIIIIZZ + ", textMarginStartEnd=" + this.LJIIIZ + ", rightIconId=" + this.LJIIJ + ", rightColorRes=" + this.LJIIJJI + ", rightIconWidthInDp=" + this.LJIIL + ", enableClickWhenDisable=" + this.LJIILIIL + ')';
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode = (((((((((((((((i + (num == null ? 0 : num.hashCode())) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31;
        Integer num2 = this.LJIIJJI;
        return ((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public C0FN1(int i, int i2, int i3, Integer num, Function0 function0, boolean z, int i4, Integer num2, float f, int i5) {
        String str;
        boolean zBooleanValue;
        boolean z2 = z;
        Integer numValueOf = num2;
        float f2 = f;
        i = (i5 & 1) != 0 ? -1 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? R.attr.a1h : i3;
        num = (i5 & 8) != 0 ? Integer.valueOf(R.attr.a1h) : num;
        if ((i5 & 32) != 0) {
            str = "";
        } else {
            str = null;
        }
        z2 = (i5 & 128) != 0 ? true : z2;
        Pair<Float, Float> pair = (i5 & 512) != 0 ? new Pair<>(Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(8.0f))), Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(12.0f)))) : null;
        int i6 = (i5 & 1024) == 0 ? i4 : -1;
        numValueOf = (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Integer.valueOf(R.attr.a1h) : numValueOf;
        f2 = (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0.0f : f2;
        if ((i5 & 8192) != 0) {
            zBooleanValue = ((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CLICK_WHEN_DISABLE_FUNCTION_ITEM, Boolean.FALSE)).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = num;
        this.LJ = 0;
        this.LJFF = str;
        this.LJI = function0;
        this.LJII = z2;
        this.LJIIIIZZ = false;
        this.LJIIIZ = pair;
        this.LJIIJ = i6;
        this.LJIIJJI = numValueOf;
        this.LJIIL = f2;
        this.LJIILIIL = zBooleanValue;
    }
}
