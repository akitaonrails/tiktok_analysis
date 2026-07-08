package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.util.SimplePollTaskManager$addTask$1", f = "SimplePollTaskManager.kt", l = {25}, m = "invokeSuspend")
public final class C330220Cx2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC330240Cx4 LLILLJJLI;
    public final /* synthetic */ C330230Cx3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330220Cx2(InterfaceC330240Cx4 interfaceC330240Cx4, C330230Cx3 c330230Cx3, InterfaceC1364105Vn<? super C330220Cx2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC330240Cx4;
        this.LLILLL = c330230Cx3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330220Cx2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SimplePollTaskManager@d204.addTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        while (!this.LLILLJJLI.getCancelable()) {
            this.LLILLJJLI.run();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(350L, this) == objLJFF) {
                C1C7U.LIZIZ("SimplePollTaskManager@d204.addTask$1");
                return objLJFF;
            }
        }
        ((ArrayList) this.LLILLL.LIZ).remove(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SimplePollTaskManager@d204.addTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
