package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingCacheHelper$checkCacheSafety$1", f = "FollowingCacheHelper.kt", l = {60}, m = "invokeSuspend")
public final class C607660NsS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<FollowFeedApiV2.FollowingFeedCheckModel> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<List<FollowFeedApiV2.FollowingFeedCheckModel>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C607660NsS(List<FollowFeedApiV2.FollowingFeedCheckModel> list, boolean z, Function1<? super List<FollowFeedApiV2.FollowingFeedCheckModel>, Unit> function1, InterfaceC1364105Vn<? super C607660NsS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607660NsS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<FollowFeedApiV2.FollowingFeedCheckModel> items;
        boolean z;
        List<String> listLIZLLL;
        C1C7U.LIZ("FollowingCacheHelper@7e7c.checkCacheSafety$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
                String strLJI = null;
                if (iFollowReadService != null && (listLIZLLL = iFollowReadService.LIZLLL()) != null) {
                    if (!(!listLIZLLL.isEmpty())) {
                        listLIZLLL = null;
                    }
                    if (listLIZLLL != null) {
                        C1227904rF.LIZ.getClass();
                        strLJI = C1227904rF.LJI(listLIZLLL);
                    }
                }
                List<FollowFeedApiV2.FollowingFeedCheckModel> list = this.LLILLJJLI;
                if (this.LLILLL) {
                    z = true;
                } else {
                    z = false;
                }
                FollowFeedApiV2.FollowingFeedCheckItems followingFeedCheckItems = new FollowFeedApiV2.FollowingFeedCheckItems(list, z, strLJI);
                C607610NsN c607610NsN = C607610NsN.LIZ;
                EnumC607620NsO enumC607620NsO = EnumC607620NsO.CHECK_ITEMS;
                EnumC607600NsM enumC607600NsM = EnumC607600NsM.HOMEPAGE_FOLLOW;
                c607610NsN.getClass();
                C607610NsN.LIZIZ(enumC607620NsO, enumC607600NsM);
                C607670NsT.LIZ.getClass();
                FollowFeedApiV2 followFeedApiV2 = C607670NsT.LIZIZ;
                this.LL = 1;
                obj = followFeedApiV2.LIZIZ(followingFeedCheckItems, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FollowingCacheHelper@7e7c.checkCacheSafety$1");
                    return objLJFF;
                }
            }
            c098200Yq = (FollowFeedApiV2.FollowingFeedCheckStatusResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<List<FollowFeedApiV2.FollowingFeedCheckModel>, Unit> function1 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            FollowFeedApiV2.FollowingFeedCheckStatusResponse followingFeedCheckStatusResponse = (FollowFeedApiV2.FollowingFeedCheckStatusResponse) c098200Yq;
            if (followingFeedCheckStatusResponse == null || (items = followingFeedCheckStatusResponse.getItems()) == null) {
                items = C13BV.INSTANCE;
            }
            function1.invoke(items);
        }
        Function1<List<FollowFeedApiV2.FollowingFeedCheckModel>, Unit> function12 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingCacheHelper", "check status error", thM5exceptionOrNullimpl);
            function12.invoke(C13BV.INSTANCE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingCacheHelper@7e7c.checkCacheSafety$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
