package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19319010i4 extends AbstractC19293010ds {
    public final CharSequence LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final Object LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final CharSequence LLJIJIL;
    public final CharSequence LLJILJIL;
    public final Integer LLJILJILJ;
    public final Integer LLJILLL;
    public final Integer LLJJ;
    public final Integer LLJJI;
    public final View.OnClickListener LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final int LLJJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19319010i4)) {
            return false;
        }
        C19319010i4 c19319010i4 = (C19319010i4) obj;
        return Intrinsics.LJFF(this.LLILZIL, c19319010i4.LLILZIL) && this.LLILZLL == c19319010i4.LLILZLL && this.LLIZ == c19319010i4.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c19319010i4.LLIZLLLIL) && this.LLJ == c19319010i4.LLJ && this.LLJI == c19319010i4.LLJI && Intrinsics.LJFF(this.LLJIJIL, c19319010i4.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c19319010i4.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c19319010i4.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c19319010i4.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c19319010i4.LLJJ) && Intrinsics.LJFF(this.LLJJI, c19319010i4.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c19319010i4.LLJJIII) && this.LLJJIJI == c19319010i4.LLJJIJI && this.LLJJIJIIJIL == c19319010i4.LLJJIJIIJIL && this.LLJJIJIL == c19319010i4.LLJJIJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LLILZIL.hashCode() * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        Object obj = this.LLIZLLLIL;
        int iHashCode2 = (((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        CharSequence charSequence = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.LLJILJIL;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.LLJILJILJ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJILLL;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLJJ;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLJJI;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        View.OnClickListener onClickListener = this.LLJJIII;
        return ((((((iHashCode8 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + this.LLJJIJIL;
    }

    public final String toString() {
        return "DividerItem(text=" + ((Object) this.LLILZIL) + ", divider=" + this.LLILZLL + ", visibility=" + this.LLIZ + ", tag=" + this.LLIZLLLIL + ", blockEnd=" + this.LLJ + ", blockBegin=" + this.LLJI + ", title=" + ((Object) this.LLJIJIL) + ", sub_text=" + ((Object) this.LLJILJIL) + ", text_font=" + this.LLJILJILJ + ", sub_text_font=" + this.LLJILLL + ", paddingBottom=" + this.LLJJ + ", backgroundColor=" + this.LLJJI + ", infoCircleIconClickListener=" + this.LLJJIII + ", textContainerVisibility=" + this.LLJJIJI + ", isFirst=" + this.LLJJIJIIJIL + ", cornerRadius=" + this.LLJJIJIL + ')';
    }

    @Override // X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLIZ;
    }

    public static C19319010i4 LIZIZ(C19319010i4 c19319010i4, CharSequence charSequence, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        Object obj;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        CharSequence charSequence4 = charSequence;
        if ((i & 1) != 0) {
            charSequence4 = c19319010i4.LLILZIL;
        }
        if ((i & 2) != 0) {
            z4 = c19319010i4.LLILZLL;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z9 = c19319010i4.LLIZ;
        }
        View.OnClickListener onClickListener = null;
        if ((i & 8) != 0) {
            obj = c19319010i4.LLIZLLLIL;
        } else {
            obj = null;
        }
        if ((i & 16) != 0) {
            z8 = c19319010i4.LLJ;
        }
        if ((i & 32) != 0) {
            z7 = c19319010i4.LLJI;
        }
        if ((i & 64) != 0) {
            charSequence2 = c19319010i4.LLJIJIL;
        } else {
            charSequence2 = null;
        }
        if ((i & 128) != 0) {
            charSequence3 = c19319010i4.LLJILJIL;
        } else {
            charSequence3 = null;
        }
        if ((i & 256) != 0) {
            num = c19319010i4.LLJILJILJ;
        } else {
            num = null;
        }
        if ((i & 512) != 0) {
            num2 = c19319010i4.LLJILLL;
        } else {
            num2 = null;
        }
        if ((i & 1024) != 0) {
            num3 = c19319010i4.LLJJ;
        } else {
            num3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num4 = c19319010i4.LLJJI;
        } else {
            num4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            onClickListener = c19319010i4.LLJJIII;
        }
        if ((i & 8192) != 0) {
            z5 = c19319010i4.LLJJIJI;
        } else {
            z5 = false;
        }
        if ((i & 16384) != 0) {
            z6 = c19319010i4.LLJJIJIIJIL;
        } else {
            z6 = false;
        }
        if ((i & 32768) != 0) {
            i2 = c19319010i4.LLJJIJIL;
        } else {
            i2 = 0;
        }
        c19319010i4.getClass();
        return new C19319010i4(charSequence4, z4, z9, obj, z8, z7, charSequence2, charSequence3, num, num2, num3, num4, onClickListener, z5, z6, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19319010i4(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, CharSequence charSequence2, Integer num, Integer num2, Integer num3, Integer num4, boolean z5, int i, int i2) {
        boolean z6;
        int i3 = i;
        boolean z7 = z5;
        Integer num5 = num4;
        Integer num6 = num3;
        Integer num7 = num2;
        Integer num8 = num;
        CharSequence charSequence3 = charSequence2;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z2;
        boolean z11 = (i2 & 2) != 0 ? false : z;
        z10 = (i2 & 4) != 0 ? true : z10;
        z9 = (i2 & 16) != 0 ? false : z9;
        z8 = (i2 & 32) != 0 ? false : z8;
        charSequence3 = (i2 & 128) != 0 ? null : charSequence3;
        num8 = (i2 & 256) != 0 ? null : num8;
        num7 = (i2 & 512) != 0 ? null : num7;
        num6 = (i2 & 1024) != 0 ? null : num6;
        num5 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num5;
        if ((i2 & 8192) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this(charSequence, z11, z10, null, z9, z8, null, charSequence3, num8, num7, num6, num5, null, z6, (i2 & 16384) != 0 ? false : z7, (i2 & 32768) != 0 ? 4 : i3);
    }

    public C19319010i4(CharSequence charSequence, boolean z, boolean z2, Object obj, boolean z3, boolean z4, CharSequence charSequence2, CharSequence charSequence3, Integer num, Integer num2, Integer num3, Integer num4, View.OnClickListener onClickListener, boolean z5, boolean z6, int i) {
        super(z2, obj, 8);
        this.LLILZIL = charSequence;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = obj;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = charSequence2;
        this.LLJILJIL = charSequence3;
        this.LLJILJILJ = num;
        this.LLJILLL = num2;
        this.LLJJ = num3;
        this.LLJJI = num4;
        this.LLJJIII = onClickListener;
        this.LLJJIJI = z5;
        this.LLJJIJIIJIL = z6;
        this.LLJJIJIL = i;
    }
}
