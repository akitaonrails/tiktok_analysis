package X;

import com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Vi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$listener$2$1$onStateChange$2", f = "FollowingFeedAssem.kt", l = {66}, m = "invokeSuspend")
public final class C805080Vi6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C805080Vi6(InterfaceC1364105Vn<? super C805080Vi6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805080Vi6(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$2");
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
            C805090Vi7.LIZ.getClass();
            long j = ((FollowingFeedConsumeMonitorConfigModel) C805090Vi7.LIZJ.getValue()).delay;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$2");
                return objLJFF;
            }
        }
        C805030Vi1.LIZ.getClass();
        AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(341);
        AFwS200S0000000_13 aFwS200S0000000_132 = AFwS200S0000000_13.get$arr$(342);
        if (!((FollowingFeedConsumeMonitorConfigModel) C805030Vi1.LIZJ.getValue()).enable) {
            C2252408s6.LIZ(new AwS557S0100000_13(aFwS200S0000000_132, 185));
        } else {
            C2252408s6.LIZ(new AwS557S0100000_13(aFwS200S0000000_13, 186));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C805080Vi6(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
