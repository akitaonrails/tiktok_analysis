package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NM6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.cache.FriendsFeedRespCacheManager$insertFriendsFeed$1$1", f = "FriendsFeedRespCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C0NM6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0NM6(InterfaceC1364105Vn<? super C0NM6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NM6(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C0NMA.LIZ.getClass();
            ((C0NM9) C0NMA.LIZIZ.getValue()).LIZJ(curUserId);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0NM6(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
