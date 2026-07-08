package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManagePageKt$ManagePage$2$1", f = "ManagePage.kt", l = {}, m = "invokeSuspend")
public final class C754100Ti4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ C05P1<AbstractC1243570iSx> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C754100Ti4(String str, DialogC1389620mGW dialogC1389620mGW, C05P1<? extends AbstractC1243570iSx> c05p1, InterfaceC1364105Vn<? super C754100Ti4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754100Ti4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManagePageKt@44d7.ManagePage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLL.getValue() instanceof C1243680iT8) {
            C786410Ut5.J4(this.LLILLJJLI);
        } else {
            C0FNV.LIZ(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManagePageKt@44d7.ManagePage$2$1");
        return unit;
    }
}
