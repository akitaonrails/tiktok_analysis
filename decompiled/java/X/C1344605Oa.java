package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightFriendsStoryDataCenter$saveFriendsV3CacheData$1", f = "SkylightFriendsStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1344605Oa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1600210rkB LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ C1600380rkS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1344605Oa(C1600210rkB c1600210rkB, List<? extends InterfaceC1891350zJl> list, C1600380rkS c1600380rkS, InterfaceC1364105Vn<? super C1344605Oa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1600210rkB;
        this.LLILLJJLI = list;
        this.LLILLL = c1600380rkS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344605Oa(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SkylightFriendsStoryDataCenter@6193.saveFriendsV3CacheData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        if (!Intrinsics.LJFF(C1600210rkB.LIZIZ(), r0.LIZJ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.saveFriendsV3CacheData$1");
            return unit;
        }
        C1600210rkB c1600210rkB = this.LL;
        List<InterfaceC1891350zJl> list = this.LLILLJJLI;
        C1600380rkS c1600380rkS = this.LLILLL;
        try {
            c1600210rkB.getClass();
            Keva repo = Keva.getRepo("friendsV3_skylight_story_cache");
            repo.storeString("cache_key_friendsV3_story_list_data", C293501Bt.LIZ().LJIILL(C13LP.LL(list, ((Number) C036Q.LIZ.getValue()).intValue())));
            repo.storeString("cache_key_friendsV3_story_list_extra_data", C293501Bt.LIZ().LJIILL(c1600380rkS));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.saveFriendsV3CacheData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
