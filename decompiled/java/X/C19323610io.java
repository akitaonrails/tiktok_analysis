package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.status.loading.TuxSpinner;

/* JADX INFO: renamed from: X.10io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19323610io extends C20693515yH {
    public final String LLJJIJIL;
    public final C419910GdJ LLJJJ;
    public final View.OnClickListener LLJJJIL;
    public final Object LLJJJJ;
    public final boolean LLJJJJJIL;
    public final View LLJJJJLIIL;
    public final View LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;
    public final EnumC1216700hlc LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final String LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final View.OnClickListener LLJZIJLIL;
    public final Integer LLL;
    public final Integer LLLF;
    public final Integer LLLFF;
    public final boolean LLLFFI;
    public final boolean LLLFZ;
    public final C419910GdJ LLLI;
    public final String LLLII;
    public final Integer LLLIIII;

    public final int hashCode() {
        int iHashCode = this.LLJJIJIL.hashCode() * 31;
        C419910GdJ c419910GdJ = this.LLJJJ;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        View.OnClickListener onClickListener = this.LLJJJIL;
        int iHashCode3 = (iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        Object obj = this.LLJJJJ;
        int iHashCode4 = (((iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31;
        View view = this.LLJJJJLIIL;
        int iHashCode5 = (iHashCode4 + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.LLJJL;
        int iHashCode6 = (iHashCode5 + (view2 == null ? 0 : view2.hashCode())) * 31;
        String str = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode7 = (((((((((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLJL)) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + this.LLJLILLLLZIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31;
        String str2 = this.LLJLLIL;
        int iHashCode8 = (((((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLLL)) * 31) + C786410Ut5.Z2(this.LLJZ)) * 31;
        View.OnClickListener onClickListener2 = this.LLJZIJLIL;
        int iHashCode9 = (iHashCode8 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        Integer num = this.LLL;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLLF;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLLFF;
        int iHashCode12 = (((((iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31) + C786410Ut5.Z2(this.LLLFFI)) * 31) + C786410Ut5.Z2(this.LLLFZ)) * 31;
        C419910GdJ c419910GdJ2 = this.LLLI;
        int iHashCode13 = (iHashCode12 + (c419910GdJ2 == null ? 0 : c419910GdJ2.hashCode())) * 31;
        String str3 = this.LLLII;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.LLLIIII;
        return iHashCode14 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "DisclosureItem(title=" + this.LLJJIJIL + ", icon=" + this.LLJJJ + ", onClickListener=" + this.LLJJJIL + ", tag=" + this.LLJJJJ + ", visibility=" + this.LLJJJJJIL + ", customView=" + this.LLJJJJLIIL + ", loadingView=" + this.LLJJL + ", label=" + this.LLJJLIIIJLLLLLLLZ + ", showArrow=" + this.LLJL + ", showAlertBadge=" + this.LLJLIL + ", cellVariant=" + this.LLJLILLLLZIIL + ", divider=" + this.LLJLL + ", subTitle=" + this.LLJLLIL + ", enable=" + this.LLJLLL + ", loading=" + this.LLJZ + ", disableClickListener=" + this.LLJZIJLIL + ", backgroundColor=" + this.LLL + ", marginStart=" + this.LLLF + ", marginEnd=" + this.LLLFF + ", blockBegin=" + this.LLLFFI + ", blockEnd=" + this.LLLFZ + ", colorIcon=" + this.LLLI + ", iconUrl=" + this.LLLII + ", subTitleMaxLines=" + this.LLLIIII + ')';
    }

    @Override // X.C20693515yH, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJJJJIL;
    }

    @Override // X.C20693515yH
    public final boolean LIZIZ() {
        return this.LLLFFI;
    }

    @Override // X.C20693515yH
    public final boolean LIZLLL() {
        return this.LLLFZ;
    }

    @Override // X.C20693515yH
    public final EnumC1216700hlc LJ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C20693515yH
    public final View.OnClickListener LJI() {
        return this.LLJZIJLIL;
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
        return this.LLJJJ;
    }

    @Override // X.C20693515yH
    public final boolean LJIJJLI() {
        return this.LLJZ;
    }

    @Override // X.C20693515yH
    public final Integer LJJ() {
        return this.LLLIIII;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJIJIL;
    }

    @Override // X.C20693515yH
    public final String getSubTitle() {
        return this.LLJLLIL;
    }

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static C19323610io LJJIJL(C19323610io c19323610io, String str, View.OnClickListener onClickListener, boolean z, View view, String str2, boolean z2, boolean z3, String str3, boolean z4, boolean z5, View.OnClickListener onClickListener2, boolean z6, boolean z7, int i) {
        C419910GdJ c419910GdJ;
        Object obj;
        View view2;
        EnumC1216700hlc enumC1216700hlc;
        boolean z8;
        Integer num;
        Integer num2;
        Integer num3;
        C419910GdJ c419910GdJ2;
        String str4;
        boolean z9 = z7;
        boolean z10 = z5;
        String str5 = str3;
        boolean z11 = z3;
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z12 = z2;
        View view3 = view;
        boolean z13 = z;
        String str6 = str;
        String str7 = str2;
        boolean z14 = z6;
        boolean z15 = z4;
        View.OnClickListener onClickListener4 = onClickListener;
        if ((i & 1) != 0) {
            str6 = c19323610io.LLJJIJIL;
        }
        Integer num4 = null;
        if ((i & 2) != 0) {
            c419910GdJ = c19323610io.LLJJJ;
        } else {
            c419910GdJ = null;
        }
        if ((i & 4) != 0) {
            onClickListener4 = c19323610io.LLJJJIL;
        }
        if ((i & 8) != 0) {
            obj = c19323610io.LLJJJJ;
        } else {
            obj = null;
        }
        if ((i & 16) != 0) {
            z13 = c19323610io.LLJJJJJIL;
        }
        if ((i & 32) != 0) {
            view3 = c19323610io.LLJJJJLIIL;
        }
        if ((i & 64) != 0) {
            view2 = c19323610io.LLJJL;
        } else {
            view2 = null;
        }
        if ((i & 128) != 0) {
            str7 = c19323610io.LLJJLIIIJLLLLLLLZ;
        }
        if ((i & 256) != 0) {
            z12 = c19323610io.LLJL;
        }
        if ((i & 512) != 0) {
            z11 = c19323610io.LLJLIL;
        }
        if ((i & 1024) != 0) {
            enumC1216700hlc = c19323610io.LLJLILLLLZIIL;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = c19323610io.LLJLL;
        } else {
            z8 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = c19323610io.LLJLLIL;
        }
        if ((i & 8192) != 0) {
            z15 = c19323610io.LLJLLL;
        }
        if ((i & 16384) != 0) {
            z10 = c19323610io.LLJZ;
        }
        if ((32768 & i) != 0) {
            onClickListener3 = c19323610io.LLJZIJLIL;
        }
        if ((65536 & i) != 0) {
            num = c19323610io.LLL;
        } else {
            num = null;
        }
        if ((131072 & i) != 0) {
            num2 = c19323610io.LLLF;
        } else {
            num2 = null;
        }
        if ((262144 & i) != 0) {
            num3 = c19323610io.LLLFF;
        } else {
            num3 = null;
        }
        if ((524288 & i) != 0) {
            z14 = c19323610io.LLLFFI;
        }
        if ((1048576 & i) != 0) {
            z9 = c19323610io.LLLFZ;
        }
        if ((2097152 & i) != 0) {
            c419910GdJ2 = c19323610io.LLLI;
        } else {
            c419910GdJ2 = null;
        }
        if ((4194304 & i) != 0) {
            str4 = c19323610io.LLLII;
        } else {
            str4 = null;
        }
        if ((i & 8388608) != 0) {
            num4 = c19323610io.LLLIIII;
        }
        c19323610io.getClass();
        return new C19323610io(str6, c419910GdJ, onClickListener4, obj, z13, view3, view2, str7, z12, z11, enumC1216700hlc, z8, str5, z15, z10, onClickListener3, num, num2, num3, z14, z9, c419910GdJ2, str4, num4);
    }

    public /* synthetic */ C19323610io(String str, C419910GdJ c419910GdJ, View.OnClickListener onClickListener, Object obj, boolean z, View view, TuxSpinner tuxSpinner, String str2, boolean z2, boolean z3, EnumC1216700hlc enumC1216700hlc, String str3, boolean z4, boolean z5, View.OnClickListener onClickListener2, String str4, Integer num, int i) {
        this(str, (i & 2) != 0 ? null : c419910GdJ, (i & 4) != 0 ? null : onClickListener, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : view, (i & 64) != 0 ? null : tuxSpinner, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? EnumC1216700hlc.NORMAL : enumC1216700hlc, false, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str3, (i & 8192) != 0 ? true : z4, (i & 16384) != 0 ? false : z5, (32768 & i) != 0 ? null : onClickListener2, null, null, null, false, false, null, (4194304 & i) != 0 ? null : str4, (i & 8388608) != 0 ? null : num);
    }

    public C19323610io(String str, C419910GdJ c419910GdJ, View.OnClickListener onClickListener, Object obj, boolean z, View view, View view2, String str2, boolean z2, boolean z3, EnumC1216700hlc enumC1216700hlc, boolean z4, String str3, boolean z5, boolean z6, View.OnClickListener onClickListener2, Integer num, Integer num2, Integer num3, boolean z7, boolean z8, C419910GdJ c419910GdJ2, String str4, Integer num4) {
        super(str, enumC1216700hlc, c419910GdJ, z, z4, str3, z5, z6, onClickListener, onClickListener2, num4, false, false, 30720);
        this.LLJJIJIL = str;
        this.LLJJJ = c419910GdJ;
        this.LLJJJIL = onClickListener;
        this.LLJJJJ = obj;
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = view;
        this.LLJJL = view2;
        this.LLJJLIIIJLLLLLLLZ = str2;
        this.LLJL = z2;
        this.LLJLIL = z3;
        this.LLJLILLLLZIIL = enumC1216700hlc;
        this.LLJLL = z4;
        this.LLJLLIL = str3;
        this.LLJLLL = z5;
        this.LLJZ = z6;
        this.LLJZIJLIL = onClickListener2;
        this.LLL = num;
        this.LLLF = num2;
        this.LLLFF = num3;
        this.LLLFFI = z7;
        this.LLLFZ = z8;
        this.LLLI = c419910GdJ2;
        this.LLLII = str4;
        this.LLLIIII = num4;
    }
}
