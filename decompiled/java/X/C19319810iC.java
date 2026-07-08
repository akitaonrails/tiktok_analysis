package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.10iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19319810iC extends C20693515yH {
    public final boolean LLJJIJIL;
    public final String LLJJJ;
    public final View.OnClickListener LLJJJIL;
    public final boolean LLJJJJ;
    public final CompoundButton.OnCheckedChangeListener LLJJJJJIL;
    public final Object LLJJJJLIIL;
    public final View.OnClickListener LLJJL;
    public final EnumC1216700hlc LLJJLIIIJLLLLLLLZ;
    public final C419910GdJ LLJL;
    public final boolean LLJLIL;
    public final String LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final boolean LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final CharSequence LLJZIJLIL;
    public boolean LLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C19319810iC(String str, View.OnClickListener onClickListener, boolean z) {
        boolean z2 = false;
        this(z, str, onClickListener, z2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, z2, z2, 0 == true ? 1 : 0, 131064);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LLJJIJIL) * 31) + this.LLJJJ.hashCode()) * 31;
        View.OnClickListener onClickListener = this.LLJJJIL;
        int iHashCode = (((iZ2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLJJJJJIL;
        int iHashCode2 = (iHashCode + (onCheckedChangeListener == null ? 0 : onCheckedChangeListener.hashCode())) * 31;
        Object obj = this.LLJJJJLIIL;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.LLJJL;
        int iHashCode4 = (((iHashCode3 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31) + this.LLJJLIIIJLLLLLLLZ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJL;
        int iHashCode5 = (((iHashCode4 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31;
        String str = this.LLJLILLLLZIIL;
        int iHashCode6 = (((((((((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31) + C786410Ut5.Z2(this.LLJLLIL)) * 31) + C786410Ut5.Z2(this.LLJLLL)) * 31) + C786410Ut5.Z2(this.LLJZ)) * 31;
        CharSequence charSequence = this.LLJZIJLIL;
        return ((iHashCode6 + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLL);
    }

    public final String toString() {
        return "SwitchItem(isChecked=" + this.LLJJIJIL + ", title=" + this.LLJJJ + ", onClickListener=" + this.LLJJJIL + ", visibility=" + this.LLJJJJ + ", onCheckedChangedListener=" + this.LLJJJJJIL + ", tag=" + this.LLJJJJLIIL + ", disableClickListener=" + this.LLJJL + ", cellVariant=" + this.LLJJLIIIJLLLLLLLZ + ", icon=" + this.LLJL + ", divider=" + this.LLJLIL + ", subTitle=" + this.LLJLILLLLZIIL + ", enable=" + this.LLJLL + ", loading=" + this.LLJLLIL + ", blockBegin=" + this.LLJLLL + ", blockEnd=" + this.LLJZ + ", subTitleCharSequence=" + ((Object) this.LLJZIJLIL) + ", showHighLight=" + this.LLL + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJJJ;
    }

    @Override // X.C20693515yH
    public final boolean LIZIZ() {
        return this.LLJLLL;
    }

    @Override // X.C20693515yH
    public final boolean LIZLLL() {
        return this.LLJZ;
    }

    @Override // X.C20693515yH
    public final EnumC1216700hlc LJ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C20693515yH
    public final View.OnClickListener LJI() {
        return this.LLJJL;
    }

    @Override // X.C20693515yH
    public final boolean LJIIIIZZ() {
        return this.LLJLIL;
    }

    @Override // X.C20693515yH
    public final boolean LJIILIIL() {
        return this.LLJLL;
    }

    @Override // X.C20693515yH
    public final C419910GdJ LJIIZILJ() {
        return this.LLJL;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJLLIL;
    }

    @Override // X.C20693515yH
    public final CharSequence LJIL() {
        return this.LLJZIJLIL;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJJ;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19319810iC(boolean z, String str, View.OnClickListener onClickListener, boolean z2, C20695015yW c20695015yW, View.OnClickListener onClickListener2, C419910GdJ c419910GdJ, String str2, boolean z3, boolean z4, boolean z5, CharSequence charSequence, int i) {
        EnumC1216700hlc enumC1216700hlc;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        String str3 = str2;
        C419910GdJ c419910GdJ2 = c419910GdJ;
        C20695015yW c20695015yW2 = c20695015yW;
        boolean z9 = z2;
        View.OnClickListener onClickListener3 = onClickListener;
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z10 = (i & 1) != 0 ? false : z;
        onClickListener3 = (i & 4) != 0 ? null : onClickListener3;
        z9 = (i & 8) != 0 ? true : z9;
        c20695015yW2 = (i & 32) != 0 ? null : c20695015yW2;
        onClickListener4 = (i & 64) != 0 ? null : onClickListener4;
        if ((i & 128) != 0) {
            enumC1216700hlc = EnumC1216700hlc.NORMAL;
        } else {
            enumC1216700hlc = null;
        }
        this(z10, str, onClickListener3, z9, null, c20695015yW2, onClickListener4, enumC1216700hlc, (i & 256) != 0 ? null : c419910GdJ2, false, (i & 1024) != 0 ? null : str3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z8, false, (i & 8192) != 0 ? false : z7, (i & 16384) != 0 ? false : z6, (i & 32768) == 0 ? charSequence : null, false);
    }

    public static C19319810iC LJJIJL(C19319810iC c19319810iC, boolean z, String str, View.OnClickListener onClickListener, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6, CharSequence charSequence, boolean z7, int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        Object obj;
        View.OnClickListener onClickListener2;
        EnumC1216700hlc enumC1216700hlc;
        boolean z8;
        boolean z9 = z7;
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z4;
        boolean z13 = z3;
        boolean z14 = z2;
        String str3 = str2;
        View.OnClickListener onClickListener3 = onClickListener;
        CharSequence charSequence2 = charSequence;
        String str4 = str;
        boolean z15 = z;
        if ((i & 1) != 0) {
            z15 = c19319810iC.LLJJIJIL;
        }
        if ((i & 2) != 0) {
            str4 = c19319810iC.LLJJJ;
        }
        if ((i & 4) != 0) {
            onClickListener3 = c19319810iC.LLJJJIL;
        }
        if ((i & 8) != 0) {
            z14 = c19319810iC.LLJJJJ;
        }
        C419910GdJ c419910GdJ = null;
        if ((i & 16) != 0) {
            onCheckedChangeListener = c19319810iC.LLJJJJJIL;
        } else {
            onCheckedChangeListener = null;
        }
        if ((i & 32) != 0) {
            obj = c19319810iC.LLJJJJLIIL;
        } else {
            obj = null;
        }
        if ((i & 64) != 0) {
            onClickListener2 = c19319810iC.LLJJL;
        } else {
            onClickListener2 = null;
        }
        if ((i & 128) != 0) {
            enumC1216700hlc = c19319810iC.LLJJLIIIJLLLLLLLZ;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & 256) != 0) {
            c419910GdJ = c19319810iC.LLJL;
        }
        if ((i & 512) != 0) {
            z8 = c19319810iC.LLJLIL;
        } else {
            z8 = false;
        }
        if ((i & 1024) != 0) {
            str3 = c19319810iC.LLJLILLLLZIIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z13 = c19319810iC.LLJLL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z12 = c19319810iC.LLJLLIL;
        }
        if ((i & 8192) != 0) {
            z11 = c19319810iC.LLJLLL;
        }
        if ((i & 16384) != 0) {
            z10 = c19319810iC.LLJZ;
        }
        if ((32768 & i) != 0) {
            charSequence2 = c19319810iC.LLJZIJLIL;
        }
        if ((i & 65536) != 0) {
            z9 = c19319810iC.LLL;
        }
        c19319810iC.getClass();
        return new C19319810iC(z15, str4, onClickListener3, z14, onCheckedChangeListener, obj, onClickListener2, enumC1216700hlc, c419910GdJ, z8, str3, z13, z12, z11, z10, charSequence2, z9);
    }

    public C19319810iC(boolean z, String str, View.OnClickListener onClickListener, boolean z2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Object obj, View.OnClickListener onClickListener2, EnumC1216700hlc enumC1216700hlc, C419910GdJ c419910GdJ, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, CharSequence charSequence, boolean z8) {
        super(str, enumC1216700hlc, c419910GdJ, z2, z3, str2, z4, z5, onClickListener, onClickListener2, obj, z6, z7, 24576);
        this.LLJJIJIL = z;
        this.LLJJJ = str;
        this.LLJJJIL = onClickListener;
        this.LLJJJJ = z2;
        this.LLJJJJJIL = onCheckedChangeListener;
        this.LLJJJJLIIL = obj;
        this.LLJJL = onClickListener2;
        this.LLJJLIIIJLLLLLLLZ = enumC1216700hlc;
        this.LLJL = c419910GdJ;
        this.LLJLIL = z3;
        this.LLJLILLLLZIIL = str2;
        this.LLJLL = z4;
        this.LLJLLIL = z5;
        this.LLJLLL = z6;
        this.LLJZ = z7;
        this.LLJZIJLIL = charSequence;
        this.LLL = z8;
    }
}
