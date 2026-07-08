package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$onPrepared$1$loadCurrentUserSaAsync$1", f = "IdAndElementViewModel.kt", l = {228}, m = "invokeSuspend")
public final class C05Z1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0HOM<? extends List<? extends C440440HOw>>>, Object> {
    public int LL;
    public final /* synthetic */ IdAndElementViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Z1(IdAndElementViewModel idAndElementViewModel, InterfaceC1364105Vn<? super C05Z1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = idAndElementViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Z1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IdAndElementViewModel@a6fe.onPrepared$1$loadCurrentUserSaAsync$1");
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
            C05YD<C0HOM<? extends List<? extends C440440HOw>>> state = this.LLILLJJLI.yQ2().getState();
            C05Z0 c05z0 = new C05Z0(null);
            this.LL = 1;
            obj = C09IC.LJIJ(state, this, c05z0);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IdAndElementViewModel@a6fe.onPrepared$1$loadCurrentUserSaAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IdAndElementViewModel@a6fe.onPrepared$1$loadCurrentUserSaAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0HOM<? extends List<? extends C440440HOw>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
