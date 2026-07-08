package X;

import android.text.Layout;
import android.text.TextDirectionHeuristics;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem$asyncInitView$1$builtText$1", f = "TakoKeyboardCustomButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C436310H8z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Layout>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ TakoKeyboardCustomButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436310H8z(String str, TakoKeyboardCustomButtonAssem takoKeyboardCustomButtonAssem, InterfaceC1364105Vn<? super C436310H8z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = takoKeyboardCustomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436310H8z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoKeyboardCustomButtonAssem@7e7.asyncInitView$1$builtText$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(this.LL);
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJII(42);
        c444830HcP.LJIIIZ(1);
        c444830HcP.LJIILJJIL(C475630Ikz.LIZIZ(R.attr.a1j, this.LLILLJJLI.getContext()));
        Layout layoutLIZIZ = c444830HcP.LIZIZ();
        C1C7U.LIZIZ("TakoKeyboardCustomButtonAssem@7e7.asyncInitView$1$builtText$1");
        return layoutLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Layout> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
