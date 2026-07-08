package X;

import com.bytedance.effectcreatormobile.infrastructure.network.model.NetworkObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.network.model.NetworkObserver$checkValidNetworks$1", f = "NetworkObserver.kt", l = {130}, m = "invokeSuspend")
public final class C805570Vit extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NetworkObserver LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805570Vit(NetworkObserver networkObserver, InterfaceC1364105Vn<? super C805570Vit> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = networkObserver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805570Vit(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC805590Viv abstractC805590Viv;
        C1C7U.LIZ("NetworkObserver@105.checkValidNetworks$1");
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
            NetworkObserver networkObserver = this.LLILLJJLI;
            C2252321DDq c2252321DDq = networkObserver.LLIZLLLIL;
            if (networkObserver.LLILZIL.size() > 0) {
                this.LLILLJJLI.LLJ.set(true);
                abstractC805590Viv = new AbstractC805590Viv() { // from class: X.0Viu
                };
            } else {
                this.LLILLJJLI.LLJ.set(false);
                abstractC805590Viv = C805600Viw.LIZ;
            }
            this.LL = 1;
            c2252321DDq.setValue(abstractC805590Viv);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("NetworkObserver@105.checkValidNetworks$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkObserver@105.checkValidNetworks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
