package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.15yK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693815yK extends C20693515yH {
    public final boolean LLJJIJIL;
    public final String LLJJJ;
    public final View.OnClickListener LLJJJIL;
    public final boolean LLJJJJ;
    public final boolean LLJJJJJIL;
    public final View.OnClickListener LLJJJJLIIL;
    public final CompoundButton.OnCheckedChangeListener LLJJL;
    public final Object LLJJLIIIJLLLLLLLZ;
    public final View.OnClickListener LLJL;
    public final EnumC1216700hlc LLJLIL;
    public final C419910GdJ LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final String LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final boolean LLL;

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LLJJIJIL) * 31) + this.LLJJJ.hashCode()) * 31;
        View.OnClickListener onClickListener = this.LLJJJIL;
        int iHashCode = (((((iZ2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31;
        View.OnClickListener onClickListener2 = this.LLJJJJLIIL;
        int iHashCode2 = (iHashCode + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLJJL;
        int iHashCode3 = (iHashCode2 + (onCheckedChangeListener == null ? 0 : onCheckedChangeListener.hashCode())) * 31;
        Object obj = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        View.OnClickListener onClickListener3 = this.LLJL;
        int iHashCode5 = (((iHashCode4 + (onClickListener3 == null ? 0 : onClickListener3.hashCode())) * 31) + this.LLJLIL.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJLILLLLZIIL;
        int iHashCode6 = (((iHashCode5 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31;
        String str = this.LLJLLIL;
        return ((((((((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJLLL)) * 31) + C786410Ut5.Z2(this.LLJZ)) * 31) + C786410Ut5.Z2(this.LLJZIJLIL)) * 31) + C786410Ut5.Z2(this.LLL);
    }

    public final String toString() {
        return "SubtitleIconItem(isChecked=" + this.LLJJIJIL + ", title=" + this.LLJJJ + ", onClickListener=" + this.LLJJJIL + ", visibility=" + this.LLJJJJ + ", showSubtitleIcon=" + this.LLJJJJJIL + ", subtitleOnClickListener=" + this.LLJJJJLIIL + ", onCheckedChangedListener=" + this.LLJJL + ", tag=" + this.LLJJLIIIJLLLLLLLZ + ", disableClickListener=" + this.LLJL + ", cellVariant=" + this.LLJLIL + ", icon=" + this.LLJLILLLLZIIL + ", divider=" + this.LLJLL + ", subTitle=" + this.LLJLLIL + ", enable=" + this.LLJLLL + ", loading=" + this.LLJZ + ", blockBegin=" + this.LLJZIJLIL + ", blockEnd=" + this.LLL + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJJJ;
    }

    @Override // X.C20693515yH
    public final boolean LIZIZ() {
        return this.LLJZIJLIL;
    }

    @Override // X.C20693515yH
    public final boolean LIZLLL() {
        return this.LLL;
    }

    @Override // X.C20693515yH
    public final EnumC1216700hlc LJ() {
        return this.LLJLIL;
    }

    @Override // X.C20693515yH
    public final View.OnClickListener LJI() {
        return this.LLJL;
    }

    @Override // X.C20693515yH
    public final boolean LJIIIIZZ() {
        return this.LLJLL;
    }

    @Override // X.C20693515yH
    public final boolean LJIILIIL() {
        return this.LLJLLL;
    }

    @Override // X.C20693515yH
    public final C419910GdJ LJIIZILJ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJZ;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJJ;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJLLIL;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20693815yK(boolean z, String str, String str2, int i) {
        boolean z2;
        EnumC1216700hlc enumC1216700hlc;
        boolean z3;
        String str3 = str2;
        boolean z4 = (i & 1) != 0 ? false : z;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            enumC1216700hlc = EnumC1216700hlc.NORMAL;
        } else {
            enumC1216700hlc = null;
        }
        str3 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str3;
        if ((i & 8192) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(z4, str, null, z2, false, null, null, null, null, enumC1216700hlc, null, false, str3, z3, false, false, false);
    }

    public static C20693815yK LJJIJL(C20693815yK c20693815yK, boolean z, View.OnClickListener onClickListener, String str, boolean z2, boolean z3, int i) {
        String str2;
        boolean z4;
        boolean z5;
        View.OnClickListener onClickListener2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        Object obj;
        View.OnClickListener onClickListener3;
        EnumC1216700hlc enumC1216700hlc;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = z3;
        boolean z10 = z2;
        String str3 = str;
        View.OnClickListener onClickListener4 = onClickListener;
        boolean z11 = z;
        if ((i & 1) != 0) {
            z11 = c20693815yK.LLJJIJIL;
        }
        C419910GdJ c419910GdJ = null;
        if ((i & 2) != 0) {
            str2 = c20693815yK.LLJJJ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            onClickListener4 = c20693815yK.LLJJJIL;
        }
        if ((i & 8) != 0) {
            z4 = c20693815yK.LLJJJJ;
        } else {
            z4 = false;
        }
        if ((i & 16) != 0) {
            z5 = c20693815yK.LLJJJJJIL;
        } else {
            z5 = false;
        }
        if ((i & 32) != 0) {
            onClickListener2 = c20693815yK.LLJJJJLIIL;
        } else {
            onClickListener2 = null;
        }
        if ((i & 64) != 0) {
            onCheckedChangeListener = c20693815yK.LLJJL;
        } else {
            onCheckedChangeListener = null;
        }
        if ((i & 128) != 0) {
            obj = c20693815yK.LLJJLIIIJLLLLLLLZ;
        } else {
            obj = null;
        }
        if ((i & 256) != 0) {
            onClickListener3 = c20693815yK.LLJL;
        } else {
            onClickListener3 = null;
        }
        if ((i & 512) != 0) {
            enumC1216700hlc = c20693815yK.LLJLIL;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & 1024) != 0) {
            c419910GdJ = c20693815yK.LLJLILLLLZIIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c20693815yK.LLJLL;
        } else {
            z6 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str3 = c20693815yK.LLJLLIL;
        }
        if ((i & 8192) != 0) {
            z7 = c20693815yK.LLJLLL;
        } else {
            z7 = false;
        }
        if ((i & 16384) != 0) {
            z8 = c20693815yK.LLJZ;
        } else {
            z8 = false;
        }
        if ((32768 & i) != 0) {
            z10 = c20693815yK.LLJZIJLIL;
        }
        if ((i & 65536) != 0) {
            z9 = c20693815yK.LLL;
        }
        c20693815yK.getClass();
        return new C20693815yK(z11, str2, onClickListener4, z4, z5, onClickListener2, onCheckedChangeListener, obj, onClickListener3, enumC1216700hlc, c419910GdJ, z6, str3, z7, z8, z10, z9);
    }

    public C20693815yK(boolean z, String str, View.OnClickListener onClickListener, boolean z2, boolean z3, View.OnClickListener onClickListener2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Object obj, View.OnClickListener onClickListener3, EnumC1216700hlc enumC1216700hlc, C419910GdJ c419910GdJ, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(str, enumC1216700hlc, c419910GdJ, z2, z4, str2, z5, z6, onClickListener, onClickListener3, obj, z7, z8, 24576);
        this.LLJJIJIL = z;
        this.LLJJJ = str;
        this.LLJJJIL = onClickListener;
        this.LLJJJJ = z2;
        this.LLJJJJJIL = z3;
        this.LLJJJJLIIL = onClickListener2;
        this.LLJJL = onCheckedChangeListener;
        this.LLJJLIIIJLLLLLLLZ = obj;
        this.LLJL = onClickListener3;
        this.LLJLIL = enumC1216700hlc;
        this.LLJLILLLLZIIL = c419910GdJ;
        this.LLJLL = z4;
        this.LLJLLIL = str2;
        this.LLJLLL = z5;
        this.LLJZ = z6;
        this.LLJZIJLIL = z7;
        this.LLL = z8;
    }
}
