package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.playablecomponent.AnolePlayableComponentExtKt$parseGeckoAndLoadUrl$1$1", f = "AnolePlayableComponentExt.kt", l = {}, m = "invokeSuspend")
public final class C1007330cJv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1013880cUU LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007330cJv(C1013880cUU c1013880cUU, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LL = c1013880cUU;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007330cJv(this.LL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1013910cUX.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
