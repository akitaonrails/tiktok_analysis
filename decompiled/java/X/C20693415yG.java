package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.15yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693415yG extends C20693515yH {
    public final boolean LLJJIJIL;
    public final CompoundButton.OnCheckedChangeListener LLJJJ;
    public final String LLJJJIL;
    public final EnumC1216700hlc LLJJJJ;
    public final C419910GdJ LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final boolean LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;
    public final View.OnClickListener LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final boolean LLJLLIL;

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LLJJIJIL) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLJJJ;
        int iHashCode = (((((iZ2 + (onCheckedChangeListener == null ? 0 : onCheckedChangeListener.hashCode())) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJJJJJIL;
        int iHashCode2 = (((((iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJLIIL)) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31;
        String str = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLJL)) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31;
        View.OnClickListener onClickListener = this.LLJLILLLLZIIL;
        return ((((iHashCode3 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31) + C786410Ut5.Z2(this.LLJLLIL);
    }

    public final String toString() {
        return "RadioItem(isChecked=" + this.LLJJIJIL + ", onCheckedChangedListener=" + this.LLJJJ + ", title=" + this.LLJJJIL + ", cellVariant=" + this.LLJJJJ + ", icon=" + this.LLJJJJJIL + ", divider=" + this.LLJJJJLIIL + ", visibility=" + this.LLJJL + ", subTitle=" + this.LLJJLIIIJLLLLLLLZ + ", enable=" + this.LLJL + ", loading=" + this.LLJLIL + ", onClickListener=" + this.LLJLILLLLZIIL + ", blockBegin=" + this.LLJLL + ", blockEnd=" + this.LLJLLIL + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJL;
    }

    @Override // X.C20693515yH
    public final boolean LIZIZ() {
        return this.LLJLL;
    }

    @Override // X.C20693515yH
    public final boolean LIZLLL() {
        return this.LLJLLIL;
    }

    @Override // X.C20693515yH
    public final EnumC1216700hlc LJ() {
        return this.LLJJJJ;
    }

    @Override // X.C20693515yH
    public final boolean LJIIIIZZ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C20693515yH
    public final boolean LJIILIIL() {
        return this.LLJL;
    }

    @Override // X.C20693515yH
    public final C419910GdJ LJIIZILJ() {
        return this.LLJJJJJIL;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJLIL;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJJIL;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20693415yG(boolean z, String str, C419910GdJ c419910GdJ, String str2, View.OnClickListener onClickListener, int i) {
        EnumC1216700hlc enumC1216700hlc;
        boolean z2;
        boolean z3;
        View.OnClickListener onClickListener2 = onClickListener;
        String str3 = str2;
        C419910GdJ c419910GdJ2 = c419910GdJ;
        if ((i & 8) != 0) {
            enumC1216700hlc = EnumC1216700hlc.NORMAL;
        } else {
            enumC1216700hlc = null;
        }
        c419910GdJ2 = (i & 16) != 0 ? null : c419910GdJ2;
        if ((i & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        str3 = (i & 128) != 0 ? null : str3;
        if ((i & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(z, null, str, enumC1216700hlc, c419910GdJ2, false, z2, str3, z3, false, (i & 1024) != 0 ? null : onClickListener2, false, false);
    }

    public static C20693415yG LJJIJL(C20693415yG c20693415yG, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        String str;
        EnumC1216700hlc enumC1216700hlc;
        C419910GdJ c419910GdJ;
        boolean z5;
        boolean z6;
        String str2;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = c20693415yG.LLJJIJIL;
        }
        View.OnClickListener onClickListener = null;
        if ((i & 2) != 0) {
            onCheckedChangeListener = c20693415yG.LLJJJ;
        } else {
            onCheckedChangeListener = null;
        }
        if ((i & 4) != 0) {
            str = c20693415yG.LLJJJIL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            enumC1216700hlc = c20693415yG.LLJJJJ;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & 16) != 0) {
            c419910GdJ = c20693415yG.LLJJJJJIL;
        } else {
            c419910GdJ = null;
        }
        boolean z11 = false;
        if ((i & 32) != 0) {
            z5 = c20693415yG.LLJJJJLIIL;
        } else {
            z5 = false;
        }
        if ((i & 64) != 0) {
            z6 = c20693415yG.LLJJL;
        } else {
            z6 = false;
        }
        if ((i & 128) != 0) {
            str2 = c20693415yG.LLJJLIIIJLLLLLLLZ;
        } else {
            str2 = null;
        }
        if ((i & 256) != 0) {
            z11 = c20693415yG.LLJL;
        }
        if ((i & 512) != 0) {
            z9 = c20693415yG.LLJLIL;
        }
        if ((i & 1024) != 0) {
            onClickListener = c20693415yG.LLJLILLLLZIIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = c20693415yG.LLJLL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z7 = c20693415yG.LLJLLIL;
        }
        c20693415yG.getClass();
        return new C20693415yG(z10, onCheckedChangeListener, str, enumC1216700hlc, c419910GdJ, z5, z6, str2, z11, z9, onClickListener, z8, z7);
    }

    public C20693415yG(boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, String str, EnumC1216700hlc enumC1216700hlc, C419910GdJ c419910GdJ, boolean z2, boolean z3, String str2, boolean z4, boolean z5, View.OnClickListener onClickListener, boolean z6, boolean z7) {
        super(str, enumC1216700hlc, c419910GdJ, z3, z2, str2, z4, z5, onClickListener, null, null, z6, z7, 26112);
        this.LLJJIJIL = z;
        this.LLJJJ = onCheckedChangeListener;
        this.LLJJJIL = str;
        this.LLJJJJ = enumC1216700hlc;
        this.LLJJJJJIL = c419910GdJ;
        this.LLJJJJLIIL = z2;
        this.LLJJL = z3;
        this.LLJJLIIIJLLLLLLLZ = str2;
        this.LLJL = z4;
        this.LLJLIL = z5;
        this.LLJLILLLLZIIL = onClickListener;
        this.LLJLL = z6;
        this.LLJLLIL = z7;
    }
}
