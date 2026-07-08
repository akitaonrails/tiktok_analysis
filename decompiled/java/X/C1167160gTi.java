package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMGroupShotPlaygroundTemplateComponent$fetchTemplates$1$1", f = "DMGroupShotPlaygroundTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C1167160gTi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1646100swC LL;
    public final /* synthetic */ List<C1167280gTu> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167160gTi(C1646100swC c1646100swC, List<C1167280gTu> list, InterfaceC1364105Vn<? super C1167160gTi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1646100swC;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1167160gTi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGroupShotPlaygroundTemplateComponent@2cc1.fetchTemplates$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1167080gTa c1167080gTaW2 = this.LL.W2();
        List<C1167280gTu> list = this.LLILLJJLI;
        InterfaceC1167150gTh interfaceC1167150gTh = (InterfaceC1167150gTh) c1167080gTaW2.LLJILLL.getValue();
        if (interfaceC1167150gTh != null) {
            interfaceC1167150gTh.LIZ(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGroupShotPlaygroundTemplateComponent@2cc1.fetchTemplates$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
