package X;

import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage$selectContentAsync$1$1", f = "TakoLongImageSharePackage.kt", l = {}, m = "invokeSuspend")
public final class C15449063b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function2<AbstractC1375550ltp, Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ TakoLongImageSharePackage LLILLL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15449063b(boolean z, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2, TakoLongImageSharePackage takoLongImageSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn<? super C15449063b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = function2;
        this.LLILLL = takoLongImageSharePackage;
        this.LLILZ = interfaceC1369790lkX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15449063b(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoLongImageSharePackage@f869.selectContentAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL) {
            this.LLILLJJLI.invoke(this.LLILLL.LJIILLIIL(this.LLILZ), false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1$1");
            return unit;
        }
        this.LLILLJJLI.invoke(this.LLILLL.LJIILLIIL(this.LLILZ), true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
