package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10IU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IU implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final CharSequence LLILZ;
    public final String LLILZIL;
    public final Function1<String, Unit> LLILZLL;
    public final InterfaceC1631630sYr<C19EG, View, String, Boolean, Unit> LLIZ;
    public final Animation LLIZLLLIL;
    public final Function2<C2189821An6, Context, Unit> LLJ;
    public final Function1<C19EG, Unit> LLJI;
    public final Function2<C19EG, View, Unit> LLJIJIL;

    public C10IU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10IU)) {
            return false;
        }
        C10IU c10iu = (C10IU) obj;
        return this.LL == c10iu.LL && this.LLILLJJLI == c10iu.LLILLJJLI && this.LLILLL == c10iu.LLILLL && Intrinsics.LJFF(this.LLILZ, c10iu.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c10iu.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c10iu.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c10iu.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c10iu.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c10iu.LLJ) && Intrinsics.LJFF(this.LLJI, c10iu.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c10iu.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        Function1<String, Unit> function1 = this.LLILZLL;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        InterfaceC1631630sYr<C19EG, View, String, Boolean, Unit> interfaceC1631630sYr = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (interfaceC1631630sYr == null ? 0 : interfaceC1631630sYr.hashCode())) * 31;
        Animation animation = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (animation == null ? 0 : animation.hashCode())) * 31;
        Function2<C2189821An6, Context, Unit> function2 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<C19EG, Unit> function12 = this.LLJI;
        int iHashCode6 = (iHashCode5 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<C19EG, View, Unit> function22 = this.LLJIJIL;
        return iHashCode6 + (function22 != null ? function22.hashCode() : 0);
    }

    public final String toString() {
        return "VideoReviewState(type=" + this.LL + ", bgColorRes=" + this.LLILLJJLI + ", iconRes=" + this.LLILLL + ", title=" + ((Object) this.LLILZ) + ", url=" + this.LLILZIL + ", showAction=" + this.LLILZLL + ", clickAction=" + this.LLIZ + ", iconAnimation=" + this.LLIZLLLIL + ", muteStripInfoButtonClick=" + this.LLJ + ", muteStripBannerOnClick=" + this.LLJI + ", muteStripOnShowAction=" + this.LLJIJIL + ')';
    }

    public /* synthetic */ C10IU(int i) {
        this(0, -1, -1, "", "", null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10IU(int i, int i2, int i3, CharSequence charSequence, String str, Function1<? super String, Unit> function1, InterfaceC1631630sYr<? super C19EG, ? super View, ? super String, ? super Boolean, Unit> interfaceC1631630sYr, Animation animation, Function2<? super C2189821An6, ? super Context, Unit> function2, Function1<? super C19EG, Unit> function12, Function2<? super C19EG, ? super View, Unit> function22) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = charSequence;
        this.LLILZIL = str;
        this.LLILZLL = function1;
        this.LLIZ = interfaceC1631630sYr;
        this.LLIZLLLIL = animation;
        this.LLJ = function2;
        this.LLJI = function12;
        this.LLJIJIL = function22;
    }

    public static C10IU LIZ(C10IU c10iu, int i, int i2, int i3, CharSequence charSequence, String str, Function1 function1, InterfaceC1631630sYr interfaceC1631630sYr, Animation animation, AwS463S0200000_28 awS463S0200000_28, AwS394S0200000_28 awS394S0200000_28, AwS463S0200000_28 awS463S0200000_282, int i4) {
        Function2<C19EG, View, Unit> function2 = awS463S0200000_282;
        Function1<C19EG, Unit> function12 = awS394S0200000_28;
        Function2<C2189821An6, Context, Unit> function22 = awS463S0200000_28;
        Animation animation2 = animation;
        InterfaceC1631630sYr interfaceC1631630sYr2 = interfaceC1631630sYr;
        Function1 function13 = function1;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c10iu.LL;
        }
        if ((i4 & 2) != 0) {
            i6 = c10iu.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i5 = c10iu.LLILLL;
        }
        if ((i4 & 8) != 0) {
            charSequence2 = c10iu.LLILZ;
        }
        if ((i4 & 16) != 0) {
            str2 = c10iu.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            function13 = c10iu.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            interfaceC1631630sYr2 = c10iu.LLIZ;
        }
        if ((i4 & 128) != 0) {
            animation2 = c10iu.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            function22 = c10iu.LLJ;
        }
        if ((i4 & 512) != 0) {
            function12 = c10iu.LLJI;
        }
        if ((i4 & 1024) != 0) {
            function2 = c10iu.LLJIJIL;
        }
        c10iu.getClass();
        return new C10IU(i7, i6, i5, charSequence2, str2, function13, interfaceC1631630sYr2, animation2, function22, function12, function2);
    }
}
