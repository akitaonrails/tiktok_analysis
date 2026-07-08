package X;

import com.ss.android.ugc.aweme.im.strategy.StrategyInitializer;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.StrategyInitializer$run$1", f = "StrategyInitializer.kt", l = {}, m = "invokeSuspend")
public final class C909420Zm0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C909420Zm0(InterfaceC1364105Vn<? super C909420Zm0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909420Zm0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyInitializer@9e42.run$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser != null && currentUser.getUid() != null) {
            if (StrategyInitializer.LLILLJJLI != null) {
                if (Intrinsics.LJFF(StrategyInitializer.LLILLL, currentUser.getUid())) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StrategyInitializer@9e42.run$1");
                    return unit;
                }
                AnonymousClass0956 anonymousClass0956 = StrategyInitializer.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                StrategyInitializer strategyInitializer = StrategyInitializer.LL;
                String uid = currentUser.getUid();
                strategyInitializer.getClass();
                AnonymousClass0956 anonymousClass0956LJFF = StrategyInitializer.LJFF(uid);
                anonymousClass0956LJFF.LJII(AFwS248S0000000_14.get$arr$(291));
                StrategyInitializer.LLILLJJLI = anonymousClass0956LJFF;
                StrategyInitializer.LLILLL = currentUser.getUid();
            } else {
                StrategyInitializer strategyInitializer2 = StrategyInitializer.LL;
                String uid2 = currentUser.getUid();
                strategyInitializer2.getClass();
                AnonymousClass0956 anonymousClass0956LJFF2 = StrategyInitializer.LJFF(uid2);
                anonymousClass0956LJFF2.LJII(AFwS248S0000000_14.get$arr$(292));
                StrategyInitializer.LLILLJJLI = anonymousClass0956LJFF2;
                StrategyInitializer.LLILLL = currentUser.getUid();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StrategyInitializer@9e42.run$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StrategyInitializer@9e42.run$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C909420Zm0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
