package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H4U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4U implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final DynamicIcon LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Drawable LLILZLL;
    public final Drawable LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final C0H4Z LLJI;
    public final Function2<Integer, C0H4U, Unit> LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H4U)) {
            return false;
        }
        C0H4U c0h4u = (C0H4U) obj;
        return Intrinsics.LJFF(this.LL, c0h4u.LL) && this.LLILLJJLI == c0h4u.LLILLJJLI && this.LLILLL == c0h4u.LLILLL && Intrinsics.LJFF(this.LLILZ, c0h4u.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0h4u.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0h4u.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0h4u.LLIZ) && this.LLIZLLLIL == c0h4u.LLIZLLLIL && this.LLJ == c0h4u.LLJ && Intrinsics.LJFF(this.LLJI, c0h4u.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0h4u.LLJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        DynamicIcon dynamicIcon = this.LLILZ;
        int iHashCode2 = (iHashCode + (dynamicIcon == null ? 0 : dynamicIcon.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Drawable drawable = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.LLIZ;
        int iHashCode5 = (((((iHashCode4 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        C0H4Z c0h4z = this.LLJI;
        int iHashCode6 = (iHashCode5 + (c0h4z == null ? 0 : c0h4z.hashCode())) * 31;
        Function2<Integer, C0H4U, Unit> function2 = this.LLJIJIL;
        return iHashCode6 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "PoiChipItem(text=" + this.LL + ", enableSelect=" + this.LLILLJJLI + ", isSelected=" + this.LLILLL + ", startIcon=" + this.LLILZ + ", clickCallback=" + this.LLILZIL + ", selectedBackground=" + this.LLILZLL + ", unSelectedBackground=" + this.LLIZ + ", showEndIcon=" + this.LLIZLLLIL + ", enableSelectSame=" + this.LLJ + ", poiChip=" + this.LLJI + ", chipsClickCallback=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H4U)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C0H4U) interfaceC1891350zJl).LL);
    }

    public static C0H4U LIZ(C0H4U c0h4u, boolean z) {
        return new C0H4U(c0h4u.LL, c0h4u.LLILLJJLI, z, c0h4u.LLILZ, c0h4u.LLILZIL, c0h4u.LLILZLL, c0h4u.LLIZ, c0h4u.LLIZLLLIL, c0h4u.LLJ, c0h4u.LLJI, c0h4u.LLJIJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0H4U(String str, boolean z, boolean z2, DynamicIcon dynamicIcon, Function0<Unit> function0, Drawable drawable, Drawable drawable2, boolean z3, boolean z4, C0H4Z c0h4z, Function2<? super Integer, ? super C0H4U, Unit> function2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = dynamicIcon;
        this.LLILZIL = function0;
        this.LLILZLL = drawable;
        this.LLIZ = drawable2;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = c0h4z;
        this.LLJIJIL = function2;
    }
}
