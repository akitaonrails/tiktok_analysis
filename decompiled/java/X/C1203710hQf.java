package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import com.ss.android.ugc.nearby.quality.preload.NearbyInnerFeedPreloader;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.quality.preload.NearbyInnerFeedPreloader$preload$1", f = "NearbyInnerFeedPreloader.kt", l = {61}, m = "invokeSuspend")
public final class C1203710hQf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super NearbyRevampResponse>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Class<INearbyApi>, INearbyApi> LLILLJJLI;
    public final /* synthetic */ RoamingLocationInfo LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ NearbyInnerFeedPreloader LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1203710hQf(Function1<? super Class<INearbyApi>, ? extends INearbyApi> function1, RoamingLocationInfo roamingLocationInfo, int i, NearbyInnerFeedPreloader nearbyInnerFeedPreloader, InterfaceC1364105Vn<? super C1203710hQf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = roamingLocationInfo;
        this.LLILZ = i;
        this.LLILZIL = nearbyInnerFeedPreloader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1203710hQf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Boolean bool;
        LocationRegion locationRegionIfManual;
        Object objFetchNearbyInnerFeedData = obj;
        C1C7U.LIZ("NearbyInnerFeedPreloader@738d.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objFetchNearbyInnerFeedData);
            } else {
                C155000ia.LIZIZ(objFetchNearbyInnerFeedData);
                Function1<Class<INearbyApi>, INearbyApi> function1 = this.LLILLJJLI;
                RoamingLocationInfo roamingLocationInfo = this.LLILLL;
                int i2 = this.LLILZ;
                NearbyInnerFeedPreloader nearbyInnerFeedPreloader = this.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NearbyInnerFeedPreload invoke preload timeStamp=");
                sbLIZ.append(System.currentTimeMillis());
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
                INearbyApi.NearbyRequestBodyForInnerFeed nearbyRequestBodyForInnerFeed = new INearbyApi.NearbyRequestBodyForInnerFeed(locationRegionIfManual, C2286608xc.LJ(1), C2286608xc.LJ(i2), true, nearbyInnerFeedPreloader.entranceId, bool);
                PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "", "", "/tiktok/feed/nearby/revamp", C1697810uHb.LJIILJJIL(String.valueOf(nearbyInnerFeedPreloader.entranceId)));
                this.LL = 1;
                objFetchNearbyInnerFeedData = iNearbyApiInvoke.fetchNearbyInnerFeedData(nearbyRequestBodyForInnerFeed, preloadExtraInfo, this);
                if (objFetchNearbyInnerFeedData == objLJFF) {
                    C1C7U.LIZIZ("NearbyInnerFeedPreloader@738d.preload$1");
                    return objLJFF;
                }
            }
            c098200Yq = (NearbyRevampResponse) objFetchNearbyInnerFeedData;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("NearbyInnerFeedPreloader@738d.preload$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
