package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotHelper$innerEnterBotMode$1$2", f = "TakoBotHelper.kt", l = {134}, m = "invokeSuspend")
public final class C1863350yab extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMessageAbility LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ TakoActiveBotItem LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ w2 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863350yab(IMessageAbility iMessageAbility, boolean z, TakoActiveBotItem takoActiveBotItem, boolean z2, w2 w2Var, InterfaceC1364105Vn<? super C1863350yab> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMessageAbility;
        this.LLILLL = z;
        this.LLILZ = takoActiveBotItem;
        this.LLILZIL = z2;
        this.LLILZLL = w2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863350yab(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotHelper@93ed.innerEnterBotMode$1$2");
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
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoBotHelper@93ed.innerEnterBotMode$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Uj0(C1861630yXp.LIZ(new C20242514Il(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotHelper@93ed.innerEnterBotMode$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
