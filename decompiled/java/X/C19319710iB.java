package X;

import Y.ACListenerS144S0100000_9;
import Y.ACListenerS162S0100000_28;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.10iB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19319710iB extends C20693515yH {
    public final String LLJJIJIL;
    public final boolean LLJJJ;
    public final String LLJJJIL;
    public final C419910GdJ LLJJJJ;
    public final String LLJJJJJIL;
    public final EnumC1216700hlc LLJJJJLIIL;
    public final C419910GdJ LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final String LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final View.OnClickListener LLJLLIL;
    public final View.OnClickListener LLJLLL;
    public final Object LLJZ;
    public final boolean LLJZIJLIL;
    public final boolean LLL;

    public final int hashCode() {
        int iHashCode = ((this.LLJJIJIL.hashCode() * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31;
        String str = this.LLJJJIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C419910GdJ c419910GdJ = this.LLJJJJ;
        int iHashCode3 = (((((iHashCode2 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31) + this.LLJJJJJIL.hashCode()) * 31) + this.LLJJJJLIIL.hashCode()) * 31;
        C419910GdJ c419910GdJ2 = this.LLJJL;
        int iHashCode4 = (((((iHashCode3 + (c419910GdJ2 == null ? 0 : c419910GdJ2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31;
        String str2 = this.LLJLIL;
        int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLILLLLZIIL)) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31;
        View.OnClickListener onClickListener = this.LLJLLIL;
        int iHashCode6 = (iHashCode5 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.LLJLLL;
        int iHashCode7 = (iHashCode6 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        Object obj = this.LLJZ;
        return ((((iHashCode7 + (obj != null ? obj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJZIJLIL)) * 31) + C786410Ut5.Z2(this.LLL);
    }

    public final String toString() {
        return "LabelItem(text=" + this.LLJJIJIL + ", yellowDot=" + this.LLJJJ + ", imageUrl=" + this.LLJJJIL + ", colorIcon=" + this.LLJJJJ + ", title=" + this.LLJJJJJIL + ", cellVariant=" + this.LLJJJJLIIL + ", icon=" + this.LLJJL + ", divider=" + this.LLJJLIIIJLLLLLLLZ + ", visibility=" + this.LLJL + ", subTitle=" + this.LLJLIL + ", enable=" + this.LLJLILLLLZIIL + ", loading=" + this.LLJLL + ", onClickListener=" + this.LLJLLIL + ", disableClickListener=" + this.LLJLLL + ", tag=" + this.LLJZ + ", blockBegin=" + this.LLJZIJLIL + ", blockEnd=" + this.LLL + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJL;
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
        return this.LLJJJJLIIL;
    }

    @Override // X.C20693515yH
    public final View.OnClickListener LJI() {
        return this.LLJLLL;
    }

    @Override // X.C20693515yH
    public final boolean LJIIIIZZ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C20693515yH
    public final boolean LJIILIIL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C20693515yH
    public final C419910GdJ LJIIZILJ() {
        return this.LLJJL;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJLL;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJJJJIL;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJLIL;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static C19319710iB LJJIJL(C19319710iB c19319710iB, ACListenerS162S0100000_28 aCListenerS162S0100000_28, boolean z, boolean z2, int i) {
        String str;
        boolean z3;
        String str2;
        C419910GdJ c419910GdJ;
        String str3;
        EnumC1216700hlc enumC1216700hlc;
        C419910GdJ c419910GdJ2;
        boolean z4;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        View.OnClickListener onClickListener;
        boolean z8 = z2;
        boolean z9 = z;
        View.OnClickListener onClickListener2 = aCListenerS162S0100000_28;
        Object obj = null;
        if ((i & 1) != 0) {
            str = c19319710iB.LLJJIJIL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z3 = c19319710iB.LLJJJ;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            str2 = c19319710iB.LLJJJIL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c419910GdJ = c19319710iB.LLJJJJ;
        } else {
            c419910GdJ = null;
        }
        if ((i & 16) != 0) {
            str3 = c19319710iB.LLJJJJJIL;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            enumC1216700hlc = c19319710iB.LLJJJJLIIL;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & 64) != 0) {
            c419910GdJ2 = c19319710iB.LLJJL;
        } else {
            c419910GdJ2 = null;
        }
        if ((i & 128) != 0) {
            z4 = c19319710iB.LLJJLIIIJLLLLLLLZ;
        } else {
            z4 = false;
        }
        if ((i & 256) != 0) {
            z5 = c19319710iB.LLJL;
        } else {
            z5 = false;
        }
        if ((i & 512) != 0) {
            str4 = c19319710iB.LLJLIL;
        } else {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            z6 = c19319710iB.LLJLILLLLZIIL;
        } else {
            z6 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z7 = c19319710iB.LLJLL;
        } else {
            z7 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            onClickListener2 = c19319710iB.LLJLLIL;
        }
        if ((i & 8192) != 0) {
            onClickListener = c19319710iB.LLJLLL;
        } else {
            onClickListener = null;
        }
        if ((i & 16384) != 0) {
            obj = c19319710iB.LLJZ;
        }
        if ((32768 & i) != 0) {
            z9 = c19319710iB.LLJZIJLIL;
        }
        if ((i & 65536) != 0) {
            z8 = c19319710iB.LLL;
        }
        c19319710iB.getClass();
        return new C19319710iB(str, z3, str2, c419910GdJ, str3, enumC1216700hlc, c419910GdJ2, z4, z5, str4, z6, z7, onClickListener2, onClickListener, obj, z9, z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19319710iB(String str, String str2, C419910GdJ c419910GdJ, String str3, ACListenerS144S0100000_9 aCListenerS144S0100000_9, int i) {
        EnumC1216700hlc enumC1216700hlc;
        boolean z;
        boolean z2;
        ACListenerS144S0100000_9 aCListenerS144S0100000_92 = aCListenerS144S0100000_9;
        String str4 = str3;
        C419910GdJ c419910GdJ2 = c419910GdJ;
        String str5 = (i & 1) != 0 ? "" : str;
        if ((i & 32) != 0) {
            enumC1216700hlc = EnumC1216700hlc.NORMAL;
        } else {
            enumC1216700hlc = null;
        }
        c419910GdJ2 = (i & 64) != 0 ? null : c419910GdJ2;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        str4 = (i & 512) != 0 ? null : str4;
        if ((i & 1024) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(str5, false, null, null, str2, enumC1216700hlc, c419910GdJ2, false, z, str4, z2, false, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : aCListenerS144S0100000_92, null, null, false, false);
    }

    public C19319710iB(String str, boolean z, String str2, C419910GdJ c419910GdJ, String str3, EnumC1216700hlc enumC1216700hlc, C419910GdJ c419910GdJ2, boolean z2, boolean z3, String str4, boolean z4, boolean z5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Object obj, boolean z6, boolean z7) {
        super(str3, enumC1216700hlc, c419910GdJ2, z3, z2, str4, z4, z5, onClickListener, onClickListener2, obj, z6, z7, 24576);
        this.LLJJIJIL = str;
        this.LLJJJ = z;
        this.LLJJJIL = str2;
        this.LLJJJJ = c419910GdJ;
        this.LLJJJJJIL = str3;
        this.LLJJJJLIIL = enumC1216700hlc;
        this.LLJJL = c419910GdJ2;
        this.LLJJLIIIJLLLLLLLZ = z2;
        this.LLJL = z3;
        this.LLJLIL = str4;
        this.LLJLILLLLZIIL = z4;
        this.LLJLL = z5;
        this.LLJLLIL = onClickListener;
        this.LLJLLL = onClickListener2;
        this.LLJZ = obj;
        this.LLJZIJLIL = z6;
        this.LLL = z7;
    }
}
