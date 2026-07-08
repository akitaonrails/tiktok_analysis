package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$state$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
public final class C612520O0s extends C09AX implements Function2<C612550O0v, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C612520O0s(InterfaceC1364105Vn<? super C612520O0s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C612520O0s c612520O0s = new C612520O0s(interfaceC1364105Vn);
        c612520O0s.LL = obj;
        return c612520O0s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SharedVideoDeepLinkHelper@a50d.collectSharerState$1$state$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1623806Xk<User> abstractC1623806Xk = ((C612550O0v) this.LL).LIZIZ;
        if (!(abstractC1623806Xk instanceof C1623606Xi) && !(abstractC1623806Xk instanceof C491001vg)) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SharedVideoDeepLinkHelper@a50d.collectSharerState$1$state$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C612550O0v c612550O0v, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c612550O0v, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
