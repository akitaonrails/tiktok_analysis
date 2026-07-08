package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.regenerate.TakoRegenerateHelper$showLocalCachedSug$1", f = "TakoRegenerateHelper.kt", l = {274}, m = "invokeSuspend")
public final class C0CWG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ TakoSug LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWG(InterfaceC665370Q7z interfaceC665370Q7z, TakoSug takoSug, InterfaceC1364105Vn<? super C0CWG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = takoSug;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoRegenerateHelper@b81d.showLocalCachedSug$1");
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
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoRegenerateHelper@b81d.showLocalCachedSug$1");
                return objLJFF;
            }
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(this.LLILLJJLI, IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.nv1(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRegenerateHelper@b81d.showLocalCachedSug$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
