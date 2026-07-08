package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem$lazyLoadShadow$1", f = "TakoKeyboardCustomButtonAssem.kt", l = {132}, m = "invokeSuspend")
public final class C436300H8y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoKeyboardCustomButtonAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436300H8y(TakoKeyboardCustomButtonAssem takoKeyboardCustomButtonAssem, InterfaceC1364105Vn<? super C436300H8y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoKeyboardCustomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C436300H8y c436300H8y = new C436300H8y(this.LLILLL, interfaceC1364105Vn);
        c436300H8y.LLILLJJLI = obj;
        return c436300H8y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("TakoKeyboardCustomButtonAssem@7e7.lazyLoadShadow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (C301350BrZ.LIZ()) {
                C099F c099f = this.LLILLL.LLJLILLLLZIIL;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (c099f.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("TakoKeyboardCustomButtonAssem@7e7.lazyLoadShadow$1");
                    return objLJFF;
                }
            }
        }
        if (C301340BrY.LIZ()) {
            C23250099c.LIZLLL(interfaceC497601wk, this.LLILLL.So().LIZJ, null, new C436290H8x(this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoKeyboardCustomButtonAssem@7e7.lazyLoadShadow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
