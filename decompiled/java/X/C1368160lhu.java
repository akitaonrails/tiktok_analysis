package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.SupportSearchRelationModel$doRealSearchWithSDK$1$3", f = "SupportSearchRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C1368160lhu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1368180lhw LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368160lhu(AbstractC1368180lhw abstractC1368180lhw, Exception exc, InterfaceC1364105Vn<? super C1368160lhu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1368180lhw;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1368160lhu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SupportSearchRelationModel@b348.doRealSearchWithSDK$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1368140lhs interfaceC1368140lhs = this.LL.LLJIJIL;
        if (interfaceC1368140lhs != null) {
            interfaceC1368140lhs.tm2(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SupportSearchRelationModel@b348.doRealSearchWithSDK$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
