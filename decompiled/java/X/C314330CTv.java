package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$logOpenIsOverTime$1$1", f = "GoodyBagPresenter.kt", l = {1185}, m = "invokeSuspend")
public final class C314330CTv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C1104590eqn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314330CTv(C238400w2 c238400w2, C1104590eqn c1104590eqn, String str, int i, String str2, InterfaceC1364105Vn<? super C314330CTv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c1104590eqn;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314330CTv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("GoodyBagPresenter@6f83.logOpenIsOverTime$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.element + 2500;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("GoodyBagPresenter@6f83.logOpenIsOverTime$1$1");
                return objLJFF;
            }
        }
        C1104590eqn c1104590eqn = this.LLILLL;
        if (c1104590eqn.LJ && !(z = c1104590eqn.LIZJ)) {
            C1104600eqo.LIZLLL(this.LLILZ, this.LLILZIL, this.LLILZLL, z, true);
        } else {
            boolean z2 = c1104590eqn.LIZJ;
            if (z2) {
                C1104600eqo.LIZLLL(this.LLILZ, this.LLILZIL, this.LLILZLL, z2, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.logOpenIsOverTime$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
