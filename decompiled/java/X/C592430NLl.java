package X;

import com.ss.android.ugc.aweme.cache.FollowingRedDotJankFixExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$listener$2$1$onStateChange$4$1", f = "FollowingFeedAssem.kt", l = {}, m = "invokeSuspend")
public final class C592430NLl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C592430NLl(InterfaceC1364105Vn<? super C592430NLl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592430NLl(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((FollowingRedDotJankFixExp.Config) FollowingRedDotJankFixExp.LIZIZ.getValue()).enable) {
            C607830Nsj.LIZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C592430NLl(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
