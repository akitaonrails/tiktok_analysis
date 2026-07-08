package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMGroupShotTemplateComponent$fetchTemplates$1$1", f = "DMGroupShotTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C1167190gTl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1646110swD LL;
    public final /* synthetic */ List<C1167280gTu> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167190gTl(C1646110swD c1646110swD, List<C1167280gTu> list, InterfaceC1364105Vn<? super C1167190gTl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1646110swD;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1167190gTl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGroupShotTemplateComponent@7f9.fetchTemplates$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1167170gTj c1167170gTjG2 = this.LL.G2();
        List<C1167280gTu> list = this.LLILLJJLI;
        InterfaceC1167150gTh interfaceC1167150gTh = (InterfaceC1167150gTh) c1167170gTjG2.LLJILJILJ.getValue();
        if (interfaceC1167150gTh != null) {
            interfaceC1167150gTh.LIZ(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGroupShotTemplateComponent@7f9.fetchTemplates$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
