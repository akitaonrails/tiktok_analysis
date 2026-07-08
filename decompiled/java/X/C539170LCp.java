package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$startAutoCut$4$1", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C539170LCp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09AE LL;
    public final /* synthetic */ C1418150n0X LLILLJJLI;
    public final /* synthetic */ C1418230n0f LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539170LCp(C09AE c09ae, C1418150n0X c1418150n0X, C1418230n0f c1418230n0f, InterfaceC1364105Vn<? super C539170LCp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09ae;
        this.LLILLJJLI = c1418150n0X;
        this.LLILLL = c1418230n0f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539170LCp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutComponent@2715.startAutoCut$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJII(new AwS374S0200000_8(this.LLILLJJLI, this.LLILLL, 28));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.startAutoCut$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
