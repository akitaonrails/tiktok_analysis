package X;

import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskActionsHandler", f = "TaskActionsHandler.kt", l = {328}, m = "rechargeDirectly")
public final class C1143990fsL extends AbstractC23140094w {
    public Object LL;
    public Function0 LLILLJJLI;
    public Function0 LLILLL;
    public Function1 LLILZ;
    public RechargePanelInputParams LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1143980fsK LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143990fsL(C1143980fsK c1143980fsK, InterfaceC1364105Vn<? super C1143990fsL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1143980fsK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskActionsHandler@5274.rechargeDirectly$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLIZLLLIL.LJIIL(null, 0, null, false, 0, null, null, null, null, null, this);
        C1C7U.LIZIZ("TaskActionsHandler@5274.rechargeDirectly$1");
        return objLJIIL;
    }
}
