package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JFA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.repo.SocPubStatusCache$clearObserver$1", f = "SocialPubStatusRepo.kt", l = {}, m = "invokeSuspend")
public final class C0JFA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1605720rt4 LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JFA(C1605720rt4 c1605720rt4, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C0JFA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1605720rt4;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JFA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocPubStatusCache@d9ef.clearObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<Map.Entry<String, MutableLiveData<C727780Sgi>>> it2 = this.LL.LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            MutableLiveData<C727780Sgi> value = it2.next().getValue();
            value.removeObservers(this.LLILLJJLI);
            if (!value.hasObservers()) {
                it2.remove();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocPubStatusCache@d9ef.clearObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
