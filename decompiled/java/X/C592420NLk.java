package X;

import com.ss.android.ugc.aweme.cache.FollowingRedDotJankFixExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$listener$2$1$onStateChange$4", f = "FollowingFeedAssem.kt", l = {78, 79}, m = "invokeSuspend")
public final class C592420NLk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C592420NLk(InterfaceC1364105Vn<? super C592420NLk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592420NLk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((FollowingRedDotJankFixExp.Config) FollowingRedDotJankFixExp.LIZIZ.getValue()).delay;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C592430NLl c592430NLl = new C592430NLl(null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c592430NLl) == objLJFF) {
            C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C592420NLk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
