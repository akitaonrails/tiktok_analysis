package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.15yF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693315yF extends C20693515yH {
    public final String LLJJIJIL;
    public final int LLJJJ;
    public final String LLJJJIL;
    public final EnumC1216700hlc LLJJJJ;
    public final boolean LLJJJJJIL;
    public final View.OnClickListener LLJJJJLIIL;
    public final C419910GdJ LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public final boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final boolean LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;

    public final int hashCode() {
        int iHashCode = ((((((((this.LLJJIJIL.hashCode() * 31) + this.LLJJJ) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31;
        View.OnClickListener onClickListener = this.LLJJJJLIIL;
        int iHashCode2 = (iHashCode + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        C419910GdJ c419910GdJ = this.LLJJL;
        int iHashCode3 = (((iHashCode2 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31;
        String str = this.LLJL;
        return ((((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + C786410Ut5.Z2(this.LLJLILLLLZIIL)) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31) + C786410Ut5.Z2(this.LLJLLIL)) * 31) + C786410Ut5.Z2(this.LLJLLL)) * 31) + C786410Ut5.Z2(this.LLJZ);
    }

    public final String toString() {
        return "ButtonItem(text=" + this.LLJJIJIL + ", buttonVariant=" + this.LLJJJ + ", title=" + this.LLJJJIL + ", cellVariant=" + this.LLJJJJ + ", visibility=" + this.LLJJJJJIL + ", onClickListener=" + this.LLJJJJLIIL + ", icon=" + this.LLJJL + ", divider=" + this.LLJJLIIIJLLLLLLLZ + ", subTitle=" + this.LLJL + ", enable=" + this.LLJLIL + ", loading=" + this.LLJLILLLLZIIL + ", blockBegin=" + this.LLJLL + ", blockEnd=" + this.LLJLLIL + ", fullLineClickable=" + this.LLJLLL + ", buttonEnable=" + this.LLJZ + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJJJJIL;
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
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C20693515yH
    public final boolean LJIILIIL() {
        return this.LLJLIL;
    }

    @Override // X.C20693515yH
    public final C419910GdJ LJIIZILJ() {
        return this.LLJJL;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJJIL;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJL;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static C20693315yF LJJIJL(C20693315yF c20693315yF, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        String str2;
        EnumC1216700hlc enumC1216700hlc;
        View.OnClickListener onClickListener;
        C419910GdJ c419910GdJ;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = z4;
        boolean z10 = z2;
        boolean z11 = z3;
        boolean z12 = z;
        int i3 = i;
        String str3 = str;
        if ((i2 & 1) != 0) {
            str3 = c20693315yF.LLJJIJIL;
        }
        if ((i2 & 2) != 0) {
            i3 = c20693315yF.LLJJJ;
        }
        String str4 = null;
        if ((i2 & 4) != 0) {
            str2 = c20693315yF.LLJJJIL;
        } else {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            enumC1216700hlc = c20693315yF.LLJJJJ;
        } else {
            enumC1216700hlc = null;
        }
        if ((i2 & 16) != 0) {
            z12 = c20693315yF.LLJJJJJIL;
        }
        if ((i2 & 32) != 0) {
            onClickListener = c20693315yF.LLJJJJLIIL;
        } else {
            onClickListener = null;
        }
        if ((i2 & 64) != 0) {
            c419910GdJ = c20693315yF.LLJJL;
        } else {
            c419910GdJ = null;
        }
        if ((i2 & 128) != 0) {
            z5 = c20693315yF.LLJJLIIIJLLLLLLLZ;
        } else {
            z5 = false;
        }
        if ((i2 & 256) != 0) {
            str4 = c20693315yF.LLJL;
        }
        if ((i2 & 512) != 0) {
            z6 = c20693315yF.LLJLIL;
        } else {
            z6 = false;
        }
        if ((i2 & 1024) != 0) {
            z7 = c20693315yF.LLJLILLLLZIIL;
        } else {
            z7 = false;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z10 = c20693315yF.LLJLL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z11 = c20693315yF.LLJLLIL;
        }
        if ((i2 & 8192) != 0) {
            z8 = c20693315yF.LLJLLL;
        } else {
            z8 = false;
        }
        if ((i2 & 16384) != 0) {
            z9 = c20693315yF.LLJZ;
        }
        c20693315yF.getClass();
        return new C20693315yF(str3, i3, str2, enumC1216700hlc, z12, onClickListener, c419910GdJ, z5, str4, z6, z7, z10, z11, z8, z9);
    }

    public C20693315yF(String str, int i, String str2, EnumC1216700hlc enumC1216700hlc, boolean z, View.OnClickListener onClickListener, C419910GdJ c419910GdJ, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(str2, enumC1216700hlc, c419910GdJ, z, z2, str3, z3, z4, onClickListener, null, null, false, false, 32256);
        this.LLJJIJIL = str;
        this.LLJJJ = i;
        this.LLJJJIL = str2;
        this.LLJJJJ = enumC1216700hlc;
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = onClickListener;
        this.LLJJL = c419910GdJ;
        this.LLJJLIIIJLLLLLLLZ = z2;
        this.LLJL = str3;
        this.LLJLIL = z3;
        this.LLJLILLLLZIIL = z4;
        this.LLJLL = z5;
        this.LLJLLIL = z6;
        this.LLJLLL = z7;
        this.LLJZ = z8;
    }
}
