package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.common.utils.EcVideoApiHelper$fetchAutoAddAnchor$1$2$1", f = "EcVideoApiHelper.kt", l = {}, m = "invokeSuspend")
public final class C1320705Ev extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<CreatorAddCheckResponse, Unit> LL;
    public final /* synthetic */ CreatorAddCheckResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1320705Ev(Function1<? super CreatorAddCheckResponse, Unit> function1, CreatorAddCheckResponse creatorAddCheckResponse, InterfaceC1364105Vn<? super C1320705Ev> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = creatorAddCheckResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1320705Ev(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EcVideoApiHelper@7793.fetchAutoAddAnchor$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<CreatorAddCheckResponse, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("EcVideoApiHelper@7793.fetchAutoAddAnchor$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
