package X;

import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800510wxF extends C09AY implements Function1<TuxNavBar, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800510wxF(String str, Function0 function0, Function0 function02, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
        this.LLILZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TuxNavBar tuxNavBar) {
        TuxNavBar tuxNavBar2 = tuxNavBar;
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        Function0<Unit> function02 = this.LLILZ;
        ViewGroup.LayoutParams layoutParams = tuxNavBar2.getLayoutParams();
        layoutParams.width = -1;
        C786410Ut5.S6(tuxNavBar2, layoutParams);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = tuxNavBar2.getContext().getString(R.string.f1_);
        c1250300ido.LIZ(new AwS571S0100000_27(function0, (Function0<Unit>) 1124));
        c0om1.LJ(c1250300ido);
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZJ = tuxNavBar2.getContext().getString(R.string.hz2);
        c1250300ido2.LJ = z;
        c1250300ido2.LIZ(new AwS571S0100000_27(function02, (Function0<Unit>) 1125));
        c0om1.LIZIZ(c1250300ido2);
        tuxNavBar2.setNavActions(c0om1);
        tuxNavBar2.setNavBackground(0);
        return Unit.LIZ;
    }
}
