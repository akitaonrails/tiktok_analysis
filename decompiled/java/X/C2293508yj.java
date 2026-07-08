package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.util.ExtractCoverNewConfigExtensionsKt$useSmartCoverWithMockAB$isInitAlgo$1", f = "ExtractCoverNewConfigExtensions.kt", l = {}, m = "invokeSuspend")
public final class C2293508yj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C2292908yd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293508yj(C2292908yd c2292908yd, InterfaceC1364105Vn<? super C2293508yj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2292908yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2293508yj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExtractCoverNewConfigExtensionsKt@f3a.useSmartCoverWithMockAB$isInitAlgo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.LJFF());
        C1C7U.LIZIZ("ExtractCoverNewConfigExtensionsKt@f3a.useSmartCoverWithMockAB$isInitAlgo$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
