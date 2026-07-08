package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$panelFetch$1$4", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C1704870uSz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1705380uTo<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704870uSz(String str, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, InterfaceC1364105Vn<? super C1704870uSz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = interfaceC1705380uTo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704870uSz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultResourceProvider@b5b8.panelFetch$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panelFetch panel ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onFail");
        C1706630uVp.LJFF("DefaultResourceProvider", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LIZ(-1, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.panelFetch$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
