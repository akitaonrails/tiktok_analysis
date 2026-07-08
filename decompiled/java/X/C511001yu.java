package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectRestoreManager$observeComposerFilterData$1", f = "LiveEffectRestoreManager.kt", l = {95}, m = "invokeSuspend")
public final class C511001yu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ComposerFilterViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511001yu(ComposerFilterViewModel composerFilterViewModel, InterfaceC1364105Vn<? super C511001yu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = composerFilterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C511001yu c511001yu = new C511001yu(this.LLILLL, interfaceC1364105Vn);
        c511001yu.LLILLJJLI = obj;
        return c511001yu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectRestoreManager@d998.observeComposerFilterData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(interfaceC497601wk, 32);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectRestoreManager@d998.observeComposerFilterData$1");
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
