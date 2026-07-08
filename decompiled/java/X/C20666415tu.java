package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20666415tu implements InterfaceC0148002o {
    public final int LL;
    public final List<String> LLILLJJLI;
    public final List<String> LLILLL;
    public final Function1<C427870Gq9, Unit> LLILZ;
    public final Function2<C427870Gq9, C427870Gq9, Unit> LLILZIL;
    public final List<Integer> LLILZLL;
    public final List<Drawable> LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final String LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final Drawable LLJJI;
    public final boolean LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final Boolean LLJJIJIL;
    public final int LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public View LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final C291001Au<Boolean> LLJL;

    public C20666415tu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20666415tu)) {
            return false;
        }
        C20666415tu c20666415tu = (C20666415tu) obj;
        return this.LL == c20666415tu.LL && Intrinsics.LJFF(this.LLILLJJLI, c20666415tu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20666415tu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20666415tu.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c20666415tu.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c20666415tu.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c20666415tu.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c20666415tu.LLIZLLLIL) && this.LLJ == c20666415tu.LLJ && this.LLJI == c20666415tu.LLJI && Float.compare(this.LLJIJIL, c20666415tu.LLJIJIL) == 0 && Float.compare(this.LLJILJIL, c20666415tu.LLJILJIL) == 0 && Intrinsics.LJFF(this.LLJILJILJ, c20666415tu.LLJILJILJ) && this.LLJILLL == c20666415tu.LLJILLL && this.LLJJ == c20666415tu.LLJJ && Intrinsics.LJFF(this.LLJJI, c20666415tu.LLJJI) && this.LLJJIII == c20666415tu.LLJJIII && this.LLJJIJI == c20666415tu.LLJJIJI && this.LLJJIJIIJIL == c20666415tu.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c20666415tu.LLJJIJIL) && this.LLJJJ == c20666415tu.LLJJJ && this.LLJJJIL == c20666415tu.LLJJJIL && this.LLJJJJ == c20666415tu.LLJJJJ && this.LLJJJJJIL == c20666415tu.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c20666415tu.LLJJJJLIIL) && this.LLJJL == c20666415tu.LLJJL && this.LLJJLIIIJLLLLLLLZ == c20666415tu.LLJJLIIIJLLLLLLLZ && Intrinsics.LJFF(this.LLJL, c20666415tu.LLJL);
    }

    public final String toString() {
        return "InnerPushLeftState(leftType=" + this.LL + ", avatarUrls=" + this.LLILLJJLI + ", secondAvatarUrls=" + this.LLILLL + ", singleAvatarLoadFunction=" + this.LLILZ + ", multiAvatarsLoadFunction=" + this.LLILZIL + ", avatarResIds=" + this.LLILZLL + ", avatarDrawables=" + this.LLIZ + ", avatarSchema=" + this.LLIZLLLIL + ", avatarImageWidth=" + this.LLJ + ", avatarImageHeight=" + this.LLJI + ", avatarImageRadius=" + this.LLJIJIL + ", avatarImageBorderWidth=" + this.LLJILJIL + ", avatarRightLabelUrl=" + this.LLJILJILJ + ", avatarRightLabelWidth=" + this.LLJILLL + ", avatarRightLabelHeight=" + this.LLJJ + ", avatarRightLabelDrawable=" + this.LLJJI + ", avatarRightLabelAutoPlay=" + this.LLJJIII + ", avatarRightLabelMargin=" + this.LLJJIJI + ", avatarRightLabelPadding=" + this.LLJJIJIIJIL + ", avatarBreath=" + this.LLJJIJIL + ", avatarRing=" + this.LLJJJ + ", avatarRingWidth=" + this.LLJJJIL + ", avatarRingHeight=" + this.LLJJJJ + ", avatarRingPadding=" + this.LLJJJJJIL + ", topIconView=" + this.LLJJJJLIIL + ", topIconViewWidth=" + this.LLJJL + ", topIconViewHeight=" + this.LLJJLIIIJLLLLLLLZ + ", onUpdateUIWhenShow=" + this.LLJL + ')';
    }

    public final int hashCode() {
        int i = this.LL * 31;
        List<String> list = this.LLILLJJLI;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Function1<C427870Gq9, Unit> function1 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2<C427870Gq9, C427870Gq9, Unit> function2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (function2 == null ? 0 : function2.hashCode())) * 31;
        List<Integer> list3 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Drawable> list4 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode7 = (((((((((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + Float.floatToIntBits(this.LLJIJIL)) * 31) + Float.floatToIntBits(this.LLJILJIL)) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode8 = (((((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJILLL) * 31) + this.LLJJ) * 31;
        Drawable drawable = this.LLJJI;
        int iHashCode9 = (((((((iHashCode8 + (drawable == null ? 0 : drawable.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI) * 31) + this.LLJJIJIIJIL) * 31;
        Boolean bool = this.LLJJIJIL;
        int iHashCode10 = (((((((((iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLJJJ) * 31) + this.LLJJJIL) * 31) + this.LLJJJJ) * 31) + this.LLJJJJJIL) * 31;
        View view = this.LLJJJJLIIL;
        return ((((((iHashCode10 + (view != null ? view.hashCode() : 0)) * 31) + this.LLJJL) * 31) + this.LLJJLIIIJLLLLLLLZ) * 31) + this.LLJL.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20666415tu(int i) {
        Boolean bool = Boolean.FALSE;
        this(0, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, bool, 0, 0, 0, 0, null, 0, 0, new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20666415tu(int i, List<String> list, List<String> list2, Function1<? super C427870Gq9, Unit> function1, Function2<? super C427870Gq9, ? super C427870Gq9, Unit> function2, List<Integer> list3, List<? extends Drawable> list4, String str, int i2, int i3, float f, float f2, String str2, int i4, int i5, Drawable drawable, boolean z, int i6, int i7, Boolean bool, int i8, int i9, int i10, int i11, View view, int i12, int i13, C291001Au<Boolean> c291001Au) {
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = function1;
        this.LLILZIL = function2;
        this.LLILZLL = list3;
        this.LLIZ = list4;
        this.LLIZLLLIL = str;
        this.LLJ = i2;
        this.LLJI = i3;
        this.LLJIJIL = f;
        this.LLJILJIL = f2;
        this.LLJILJILJ = str2;
        this.LLJILLL = i4;
        this.LLJJ = i5;
        this.LLJJI = drawable;
        this.LLJJIII = z;
        this.LLJJIJI = i6;
        this.LLJJIJIIJIL = i7;
        this.LLJJIJIL = bool;
        this.LLJJJ = i8;
        this.LLJJJIL = i9;
        this.LLJJJJ = i10;
        this.LLJJJJJIL = i11;
        this.LLJJJJLIIL = view;
        this.LLJJL = i12;
        this.LLJJLIIIJLLLLLLLZ = i13;
        this.LLJL = c291001Au;
    }
}
