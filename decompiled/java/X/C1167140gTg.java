package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMGameEffectTemplateComponent$fetchTemplates$1$1", f = "DMGameEffectTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C1167140gTg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1170110gYT LL;
    public final /* synthetic */ List<C1167270gTt> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167140gTg(C1170110gYT c1170110gYT, List<C1167270gTt> list, InterfaceC1364105Vn<? super C1167140gTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1170110gYT;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1167140gTg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1167100gTc c1167100gTcT2 = this.LL.T2();
        List<C1167270gTt> list = this.LLILLJJLI;
        InterfaceC1167110gTd interfaceC1167110gTd = (InterfaceC1167110gTd) c1167100gTcT2.LLJILJILJ.getValue();
        if (interfaceC1167110gTd != null) {
            interfaceC1167110gTd.LIZ(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
