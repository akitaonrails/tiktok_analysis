package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem$lazyLoadShadow$1$1", f = "TakoKeyboardCustomButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C436290H8x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoKeyboardCustomButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436290H8x(TakoKeyboardCustomButtonAssem takoKeyboardCustomButtonAssem, InterfaceC1364105Vn<? super C436290H8x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoKeyboardCustomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436290H8x(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoKeyboardCustomButtonAssem@7e7.lazyLoadShadow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoKeyboardCustomButtonAssem takoKeyboardCustomButtonAssem = this.LL;
        View view = takoKeyboardCustomButtonAssem.LLJIJIL;
        if (view != null) {
            Boolean.valueOf(HandlerHook.viewPost(view, new ARunnableS106S0100000_6(takoKeyboardCustomButtonAssem, 337)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoKeyboardCustomButtonAssem@7e7.lazyLoadShadow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
