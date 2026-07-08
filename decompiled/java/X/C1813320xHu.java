package X;

import Y.AgS307S0100000_27;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.mvi.core.LiveMviFrameworkCoreKt$connectViewModel$1$1", f = "LiveMviFrameworkCore.kt", l = {323}, m = "invokeSuspend")
public final class C1813320xHu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    /* JADX INFO: Incorrect field signature: TM; */
    public final /* synthetic */ MviViewModel LLILLJJLI;
    public final /* synthetic */ InterfaceC1813270xHp<S, I, E, M> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TM;LX/0xHp<TS;TI;TE;TM;>;LX/05Vn<-LX/0xHu;>;)V */
    public C1813320xHu(MviViewModel mviViewModel, InterfaceC1813270xHp interfaceC1813270xHp, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mviViewModel;
        this.LLILLL = interfaceC1813270xHp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1813320xHu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMviFrameworkCoreKt@53cd.connectViewModel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LLILLJJLI;
            AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLL, 2);
            this.LL = 1;
            if (anonymousClass0951.collect(agS307S0100000_27, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMviFrameworkCoreKt@53cd.connectViewModel$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
