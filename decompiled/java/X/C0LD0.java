package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LD0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointServiceImpl$cancelRestore$1", f = "CheckPointServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LD0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MV0 LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LD0(C0MV0 c0mv0, Activity activity, InterfaceC1364105Vn<? super C0LD0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mv0;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LD0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.cancelRestore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MV0 c0mv0 = this.LL;
        Activity activity = this.LLILLJJLI;
        C0MV0.LJJIIJZLJL(c0mv0, activity, 31, false, 0, new AwS374S0200000_8(c0mv0, activity, 222), 28);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.cancelRestore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
