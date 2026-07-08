package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedUtils$cacheAweme$1$1", f = "ECMixFeedUtils.kt", l = {}, m = "invokeSuspend")
public final class C312501Jb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312501Jb(Aweme aweme, InterfaceC1364105Vn<? super C312501Jb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C312501Jb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMixFeedUtils@c15.cacheAweme$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMixFeedUtils@c15.cacheAweme$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
