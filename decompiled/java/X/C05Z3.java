package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Z3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$navigateByStatus$2$friendsStateAsync$1", f = "MixStudioBaseViewModel.kt", l = {245}, m = "invokeSuspend")
public final class C05Z3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0HOM<? extends List<? extends C440440HOw>>>, Object> {
    public int LL;
    public final /* synthetic */ C1372205Yq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Z3(C1372205Yq c1372205Yq, InterfaceC1364105Vn<? super C05Z3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1372205Yq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Z3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2$friendsStateAsync$1");
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
            C05YD<C0HOM<? extends List<? extends C440440HOw>>> state = this.LLILLJJLI.getState();
            C05Z2 c05z2 = new C05Z2(null);
            this.LL = 1;
            obj = C09IC.LJIJ(state, this, c05z2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2$friendsStateAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2$friendsStateAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0HOM<? extends List<? extends C440440HOw>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
