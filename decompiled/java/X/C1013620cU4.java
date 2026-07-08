package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.alphavideocomponent.AnolePlayerComponent$mount$1$1", f = "AnolePlayerComponent.kt", l = {}, m = "invokeSuspend")
public final class C1013620cU4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013620cU4(String str, List<String> list, InterfaceC1364105Vn<? super C1013620cU4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1013620cU4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnolePlayerComponent@d1a9.mount$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1482560ogQ c1482560ogQLIZ = C1018490cbv.LIZ(this.LL, this.LLILLJJLI);
        C582130MsN.LIZ().LJ().getClass();
        C1014030cUj.LIZ.LJIILLIIL(((Number) C0BBU.LIZ.getValue()).intValue(), Collections.singletonList(c1482560ogQLIZ));
        C1022620cia.LIZ("AnolePlayerComponent", "preload animation video ");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnolePlayerComponent@d1a9.mount$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
