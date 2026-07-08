package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.preview.B2CAwemeIdProvider$refresh$1$1", f = "B2CAwemeIdProvider.kt", l = {}, m = "invokeSuspend")
public final class C597230Nbd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C597210Nbb LL;
    public final /* synthetic */ List<C912500Zqy> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597230Nbd(C597210Nbb c597210Nbb, List<C912500Zqy> list, InterfaceC1364105Vn<? super C597230Nbd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c597210Nbb;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597230Nbd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("B2CAwemeIdProvider@522f.refresh$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC594490NTj interfaceC594490NTj = this.LL.LLILZLL;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZ(new C597250Nbf(this.LLILLJJLI, false, "chat_view_ad"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("B2CAwemeIdProvider@522f.refresh$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
