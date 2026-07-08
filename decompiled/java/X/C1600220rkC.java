package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.util.InboxCacheItem;
import com.ss.android.ugc.aweme.item.StoryCacheExtra;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0rkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$saveInboxCacheData$1", f = "SkylightStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1600220rkC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryCacheExtra LL;
    public final /* synthetic */ List<InboxCacheItem> LLILLJJLI;
    public final /* synthetic */ C1600200rkA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600220rkC(StoryCacheExtra storyCacheExtra, List<InboxCacheItem> list, C1600200rkA c1600200rkA, InterfaceC1364105Vn<? super C1600220rkC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyCacheExtra;
        this.LLILLJJLI = list;
        this.LLILLL = c1600200rkA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1600220rkC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c098200Yq;
        boolean z2;
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.saveInboxCacheData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z3 = true;
        if (this.LL.uid.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightStoryDataCenter", "Owner invalid when save data");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.saveInboxCacheData$1");
            return unit;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<InboxCacheItem> list = this.LLILLJJLI;
        C1600200rkA c1600200rkA = this.LLILLL;
        StoryCacheExtra storyCacheExtra = this.LL;
        try {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveStoryData, size: ");
            sbLIZ.append(list.size());
            C1720106oR.LJI("SkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ));
            c1600200rkA.getClass();
            Keva repo = Keva.getRepo("inbox_skylight_story_cache");
            String strLJIIJJI = c1600200rkA.LJIIJJI(list);
            String strLJIILL = C293501Bt.LIZ().LJIILL(storyCacheExtra);
            repo.storeString("cache_key_inbox_list_data", strLJIIJJI);
            repo.storeString("cache_key_inbox_list_extra_data", strLJIILL);
            if (Intrinsics.LJFF(repo.getStringJustDisk("cache_key_inbox_list_data", null), strLJIIJJI) && Intrinsics.LJFF(repo.getStringJustDisk("cache_key_inbox_list_extra_data", null), strLJIILL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
            if (z2 && !(!Intrinsics.LJFF(storyCacheExtra.uid, C1600200rkA.LJ()))) {
                c1600200rkA.LJIIJ = jCurrentTimeMillis2;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveStoryData, cost: ");
            sbLIZ2.append(j);
            C1720106oR.LJI("SkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z2) {
                z3 = false;
            }
            C1600200rkA.LJIIJ(list.size(), j, z3);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1600200rkA c1600200rkA2 = this.LLILLL;
        List<InboxCacheItem> list2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightStoryDataCenter", "Save story data failed", thM5exceptionOrNullimpl);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            int size = list2.size();
            c1600200rkA2.getClass();
            C1600200rkA.LJIIJ(size, jCurrentTimeMillis3, false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.saveInboxCacheData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
