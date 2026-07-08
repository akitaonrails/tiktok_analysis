package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Vhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingFrequentUserService$doSyncWithServer$1", f = "FollowingFrequentUserService.kt", l = {73}, m = "invokeSuspend")
public final class C804910Vhp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C804910Vhp(InterfaceC1364105Vn<? super C804910Vhp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804910Vhp(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFrequentUserService@51da.doSyncWithServer$1");
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
            C804900Vho c804900Vho = C804900Vho.LIZ;
            c804900Vho.getClass();
            C0VLY c0vlyLIZIZ = C804900Vho.LIZIZ();
            if (c0vlyLIZIZ != null) {
                c0vlyLIZIZ.LIZIZ(C804900Vho.LIZ());
            }
            InterfaceC804960Vhu interfaceC804960Vhu = (InterfaceC804960Vhu) C804900Vho.LIZJ.getValue();
            if (interfaceC804960Vhu != null) {
                interfaceC804960Vhu.LIZIZ(C804900Vho.LIZ());
            }
            this.LL = 1;
            if (c804900Vho.LJFF(this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFrequentUserService@51da.doSyncWithServer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFrequentUserService@51da.doSyncWithServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C804910Vhp(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
