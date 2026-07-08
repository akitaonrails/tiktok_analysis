package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS78S0210000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotHelper$innerExitBotMode$1$1", f = "TakoBotHelper.kt", l = {216}, m = "invokeSuspend")
public final class C1863360yac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMessageAbility LLILLJJLI;
    public final /* synthetic */ TakoActiveBotItem LLILLL;
    public final /* synthetic */ TakoActiveBotItem LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863360yac(IMessageAbility iMessageAbility, TakoActiveBotItem takoActiveBotItem, TakoActiveBotItem takoActiveBotItem2, boolean z, InterfaceC1364105Vn<? super C1863360yac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMessageAbility;
        this.LLILLL = takoActiveBotItem;
        this.LLILZ = takoActiveBotItem2;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863360yac(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotHelper@93ed.innerExitBotMode$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(150L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoBotHelper@93ed.innerExitBotMode$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Uj0(C1861630yXp.LIZ(new AwS78S0210000_27(this.LLILLL, this.LLILZ, this.LLILZIL, 5)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotHelper@93ed.innerExitBotMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
