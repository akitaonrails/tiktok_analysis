package X;

import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$doPreload$3", f = "FollowingFeedAssem.kt", l = {}, m = "invokeSuspend")
public final class C607640NsQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowFeedList LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607640NsQ(FollowFeedList followFeedList, InterfaceC1364105Vn<? super C607640NsQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followFeedList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607640NsQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedAssem@e42c.doPreload$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C805300ViS.LIZ.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.doPreload$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
