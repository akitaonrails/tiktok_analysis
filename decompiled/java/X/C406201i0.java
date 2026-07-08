package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.utils.MinisGuidanceSheetUtil$loadLottieComposition$1$2", f = "MinisGuidanceSheetUtil.kt", l = {}, m = "invokeSuspend")
public final class C406201i0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Exception LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C406201i0(Exception exc, InterfaceC1364105Vn<? super C406201i0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C406201i0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to load animation: \"");
        sbLIZ.append(this.LL.getLocalizedMessage());
        sbLIZ.append('\"');
        C1720106oR.LIZ("MinisGuidanceSheetUtil", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisGuidanceSheetUtil@389c.loadLottieComposition$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
