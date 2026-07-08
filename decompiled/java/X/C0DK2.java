package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DK2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$enterNewAIBot$1$loadBackgroundTask$1", f = "TakoEnterUtil.kt", l = {908, 922}, m = "invokeSuspend")
public final class C0DK2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DK2(TakoEnterParams takoEnterParams, Context context, InterfaceC1364105Vn<? super C0DK2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DK2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DK2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
