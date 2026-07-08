package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$getTranslateJsonObject$3", f = "DefaultResourceProvider.kt", l = {992}, m = "invokeSuspend")
public final class C1704990uTB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1704730uSl<Effect>>, Object> {
    public int LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704990uTB(Effect effect, InterfaceC1364105Vn<? super C1704990uTB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704990uTB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultResourceProvider@b5b8.getTranslateJsonObject$3");
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
            InterfaceC1705430uTt interfaceC1705430uTtLIZ = C1706380uVQ.LIZ();
            Effect effect = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC1705430uTtLIZ.LJIILIIL(effect, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultResourceProvider@b5b8.getTranslateJsonObject$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.getTranslateJsonObject$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1704730uSl<Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
