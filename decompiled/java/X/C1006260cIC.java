package X;

import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel$markCardShowed$1", f = "MiniGameInstantPlayViewModel.kt", l = {102}, m = "invokeSuspend")
public final class C1006260cIC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ MiniGameInstantPlayViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006260cIC(MiniGameInstantPlayViewModel miniGameInstantPlayViewModel, InterfaceC1364105Vn<? super C1006260cIC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = miniGameInstantPlayViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006260cIC(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:31:0x007b, B:32:0x007e, B:33:0x0080, B:35:0x0099, B:36:0x009f), top: B:47:0x007b }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1006260cIC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
