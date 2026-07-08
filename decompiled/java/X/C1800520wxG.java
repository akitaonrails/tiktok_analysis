package X;

import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800520wxG extends C09AY implements Function1<TuxNavBar, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800520wxG(String str, Boolean bool, String str2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TuxNavBar tuxNavBar) {
        AbstractC1250290idn abstractC1250290idn;
        AbstractC1250290idn abstractC1250290idn2;
        TuxNavBar tuxNavBar2 = tuxNavBar;
        String str = this.LL;
        Boolean bool = this.LLILLJJLI;
        String str2 = this.LLILLL;
        boolean z = this.LLILZ;
        boolean z2 = this.LLILZIL;
        Function0<Unit> function0 = this.LLILZLL;
        Function0<Unit> function02 = this.LLIZ;
        ViewGroup.LayoutParams layoutParams = tuxNavBar2.getLayoutParams();
        layoutParams.width = -1;
        C786410Ut5.S6(tuxNavBar2, layoutParams);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(str2, "FEED_DNT_TOAST")) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LJI = false;
            abstractC1250290idn = c1251150ifB;
        } else if (Intrinsics.LJFF(bool, bool2)) {
            if (z) {
                new C1251150ifB();
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
                c1251150ifB2.LIZJ(new AwS571S0100000_27(function0, (Function0<Unit>) 1126));
                abstractC1250290idn = c1251150ifB2;
            } else {
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = tuxNavBar2.getContext().getString(R.string.f1_);
                c1250300ido.LIZ(new AwS571S0100000_27(function0, (Function0<Unit>) 1127));
                abstractC1250290idn = c1250300ido;
            }
        } else {
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = tuxNavBar2.getContext().getString(R.string.f1_);
            c1250300ido2.LIZ(new AwS571S0100000_27(function0, (Function0<Unit>) 1128));
            abstractC1250290idn = c1250300ido2;
        }
        abstractC1250290idnArr[0] = abstractC1250290idn;
        c0om1.LJ(abstractC1250290idnArr);
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(str2, "FEED_DNT_TOAST")) {
            C1251150ifB c1251150ifB3 = new C1251150ifB();
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB3.LIZJ(new AwS571S0100000_27(function0, (Function0<Unit>) 1129));
            abstractC1250290idn2 = c1251150ifB3;
        } else {
            C1250300ido c1250300ido3 = new C1250300ido();
            c1250300ido3.LIZJ = tuxNavBar2.getContext().getString(R.string.hz2);
            c1250300ido3.LJ = z2;
            c1250300ido3.LIZ(new AwS571S0100000_27(function02, (Function0<Unit>) 1130));
            abstractC1250290idn2 = c1250300ido3;
        }
        abstractC1250290idnArr2[0] = abstractC1250290idn2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        tuxNavBar2.setNavActions(c0om1);
        tuxNavBar2.setNavBackground(0);
        return Unit.LIZ;
    }
}
