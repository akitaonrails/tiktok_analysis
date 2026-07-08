package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.15T3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.data.hotcache.ExploreHotCacheDataManager$fetchData$2", f = "ExploreHotCacheDataManager.kt", l = {205}, m = "invokeSuspend")
public final class C15T3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15T3(long j, InterfaceC1364105Vn<? super C15T3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15T3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreHotCacheDataManager@1354.fetchData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C20524115St.LL.getClass();
                if (C20524115St.LJ()) {
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    C20524015Ss.LIZ.getClass();
                    C20524015Ss.LIZ("hot_cache_still_valid");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ExploreHotCacheDataManager@1354.fetchData$2");
                    return unit;
                }
                C2153908cD c2153908cD2 = C2153908cD.LIZ;
                C11NZ<ExploreAwemeList> c11nzLIZJ = C15UV.LIZ.LIZJ(true, false, C276670Asr.LIZ(true), C2286608xc.LJ(0), EnumC1568370qup.HOT_CACHE_PREFETCH.getValue(), AFwS221S0000000_31.get$arr$(538), (C1841870y1x) C20524115St.LLJ.getValue(), null);
                if (c11nzLIZJ != null) {
                    b bVarLIZ = C098C.LIZ(c11nzLIZJ);
                    final long j = this.LLILLJJLI;
                    InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.15Sr
                        @Override // X.InterfaceC346701Wf
                        public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                            Integer numValueOf;
                            ExploreAwemeList exploreAwemeList = (ExploreAwemeList) obj2;
                            List<ExplorePostItem> list = exploreAwemeList.items;
                            if (list != null && !list.isEmpty()) {
                                C20524015Ss c20524015Ss = C20524015Ss.LIZ;
                                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                c20524015Ss.getClass();
                                Pair[] pairArr = new Pair[4];
                                INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                                if (iNetworkStateService != null) {
                                    numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
                                } else {
                                    numValueOf = null;
                                }
                                pairArr[0] = new Pair("network_status", numValueOf);
                                pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
                                pairArr[2] = new Pair("is_success", "1");
                                pairArr[3] = new Pair("duration", Long.valueOf(jCurrentTimeMillis));
                                C0NJJ.LIZ("explore_hot_cache_request", C0NJJ.LIZIZ(pairArr));
                                C20524115St.LL.getClass();
                                if (C20524515Sx.LIZ().enableHotCache) {
                                    C20524215Su.LIZ().LJIIIIZZ(C305140Bxg.LIZ().expireTime, exploreAwemeList);
                                }
                                C823050WQl.LIZLLL().execute(new ARunnableS131S0100000_31(exploreAwemeList, 198));
                            } else {
                                C2153908cD.LIZ.getClass();
                                C2153908cD.LIZJ(6, "download explore hot cache data is empty", "explore_hot_cache_data_manager");
                                C20524015Ss.LIZ.getClass();
                                C20524015Ss.LIZIZ("item_empty");
                            }
                            return Unit.LIZ;
                        }
                    };
                    this.LL = 1;
                    if (bVarLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                        C1C7U.LIZIZ("ExploreHotCacheDataManager@1354.fetchData$2");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20524015Ss.LIZ.getClass();
            C20524015Ss.LIZIZ("fetch_err");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreHotCacheDataManager@1354.fetchData$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
