package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.quality.preload.NearbyFeedPreloader$preload$1", f = "NearbyFeedPreloader.kt", l = {65}, m = "invokeSuspend")
public final class C1203750hQj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super NearbyRevampResponse>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Class<INearbyApi>, INearbyApi> LLILLJJLI;
    public final /* synthetic */ RoamingLocationInfo LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1203750hQj(Function1<? super Class<INearbyApi>, ? extends INearbyApi> function1, RoamingLocationInfo roamingLocationInfo, Integer num, InterfaceC1364105Vn<? super C1203750hQj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = roamingLocationInfo;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1203750hQj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Boolean bool;
        LocationRegion locationRegionIfManual;
        Object objFetchNearbyData = obj;
        C1C7U.LIZ("NearbyFeedPreloader@106c.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int size = 0;
        Object obj3 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objFetchNearbyData);
            } else {
                C155000ia.LIZIZ(objFetchNearbyData);
                Function1<Class<INearbyApi>, INearbyApi> function1 = this.LLILLJJLI;
                RoamingLocationInfo roamingLocationInfo = this.LLILLL;
                Integer num = this.LLILZ;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke preload startTs=");
                sbLIZ.append(jElapsedRealtime);
                C2188811AlT.LIZIZ(sbLIZ);
                if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
                    bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
                } else {
                    bool = null;
                }
                INearbyApi iNearbyApiInvoke = function1.invoke(INearbyApi.class);
                if (roamingLocationInfo != null) {
                    locationRegionIfManual = roamingLocationInfo.toLocationRegionIfManual();
                } else {
                    locationRegionIfManual = null;
                }
                Integer numLJ = C2286608xc.LJ(0);
                C20019113Un.LIZ.getClass();
                INearbyApi.NearbyRequestBody nearbyRequestBody = new INearbyApi.NearbyRequestBody(locationRegionIfManual, numLJ, num, bool, C20019113Un.LIZ());
                PreloadExtraData preloadExtraData = new PreloadExtraData(false, new PreloadExtraInfo(-1, "nearby", "nearby", "/tiktok/feed/nearby/revamp", Collections.singletonList("manual_selection_region")), false, "preload", 4);
                this.LL = 1;
                objFetchNearbyData = iNearbyApiInvoke.fetchNearbyData(nearbyRequestBody, preloadExtraData, this);
                if (objFetchNearbyData == objLJFF) {
                    C1C7U.LIZIZ("NearbyFeedPreloader@106c.preload$1");
                    return objLJFF;
                }
            }
            NearbyRevampResponse nearbyRevampResponse = (NearbyRevampResponse) objFetchNearbyData;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preload network done, awemeSize=");
            List<Aweme> list = nearbyRevampResponse.awemeList;
            if (list != null) {
                size = list.size();
            }
            sbLIZ2.append(size);
            C2188811AlT.LIZIZ(sbLIZ2);
            C189200o6.m2constructorimpl(nearbyRevampResponse);
            obj2 = nearbyRevampResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj2)) {
            obj3 = obj2;
        }
        C1C7U.LIZIZ("NearbyFeedPreloader@106c.preload$1");
        return obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
