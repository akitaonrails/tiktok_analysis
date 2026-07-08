package Y;

import X.AbstractC1623806Xk;
import X.C09JN;
import X.C1183600guE;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C1201620hNI;
import X.C1504890pGR;
import X.C1623606Xi;
import X.C1C7U;
import X.C292380Bd6;
import X.C491001vg;
import X.EnumC1179610gnn;
import X.EnumC1179630gnp;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.AwS33S0000100_18;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AfS7S0100100_18 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS7S0100100_18 afS7S0100100_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$2");
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS7S0100100_18.l0).setState(new AwS33S0000100_18(afS7S0100100_18.j1, 0));
        }
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onPinClick$2");
    }

    public static final void accept$1(AfS7S0100100_18 afS7S0100100_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$2");
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS7S0100100_18.l0).setState(new AwS33S0000100_18(afS7S0100100_18.j1, 1));
        }
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onTopClick$2");
    }

    public static final void accept$2(AfS7S0100100_18 afS7S0100100_18, Object obj) {
        C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$2");
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS7S0100100_18.l0).setState(new AwS33S0000100_18(afS7S0100100_18.j1, 2));
        }
        C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onUnpinClick$2");
    }

    public static final void accept$3(AfS7S0100100_18 afS7S0100100_18, Object obj) {
        boolean z;
        int size;
        C1C7U.LIZ("RegionSearchViewModel@e768.fetchNearbyRegionList$2");
        NearbyRegionListV1Response nearbyRegionListV1Response = (NearbyRegionListV1Response) obj;
        C1201620hNI c1201620hNI = C1201620hNI.LIZ;
        long j = afS7S0100100_18.j1;
        c1201620hNI.getClass();
        LocationNetTracker.LIZIZ(null, new AwS52S0100100_18(j, nearbyRegionListV1Response, 11));
        int i = nearbyRegionListV1Response.status_code;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<LocationRegion> list = nearbyRegionListV1Response.allRegions;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c1201620hNI.LIZJ("nearby_revamp_change_region", new C1183600guE(true, 0, size));
            ((RegionSearchViewModel) afS7S0100100_18.l0).setState(new AwS597S0100000_18(nearbyRegionListV1Response, 613));
            if (C292380Bd6.LIZ) {
                C1504890pGR c1504890pGR = C1504890pGR.LIZ;
                String str = nearbyRegionListV1Response.currentRegionL0Code;
                c1504890pGR.getClass();
                C1504890pGR.LIZ(nearbyRegionListV1Response, str);
            }
        } else {
            c1201620hNI.LIZJ("nearby_revamp_change_region", new C1183600guE(false, i, 0));
            ((RegionSearchViewModel) afS7S0100100_18.l0).setState(new AwS597S0100000_18(nearbyRegionListV1Response, 614));
        }
        C1C7U.LIZIZ("RegionSearchViewModel@e768.fetchNearbyRegionList$2");
    }

    public static final void accept$4(AfS7S0100100_18 afS7S0100100_18, Object obj) {
        PoiLocation poiLocation;
        boolean z;
        Double d;
        Integer num;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        C1C7U.LIZ("PoiMapViewModel@c49e.fetchPoiDetails$1$1");
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        if (poiDetailResponse != null && poiDetailResponse.status_code == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - afS7S0100100_18.j1;
            C1199460hJo c1199460hJo = C1199460hJo.LIZ;
            C1199450hJn c1199450hJn = new C1199450hJn("poi_map");
            c1199450hJn.LIZLLL = "network_and_data_parse";
            c1199450hJn.LIZ(jCurrentTimeMillis);
            c1199460hJo.getClass();
            C1199460hJo.LIZ(c1199450hJn);
            ((PoiMapViewModel) afS7S0100100_18.l0).LLILLL = Long.valueOf(System.currentTimeMillis());
            PoiMapViewModel poiMapViewModel = (PoiMapViewModel) afS7S0100100_18.l0;
            C1623606Xi c1623606Xi = new C1623606Xi(poiDetailResponse);
            poiMapViewModel.getClass();
            poiMapViewModel.setState(new AwS597S0100000_18(c1623606Xi, (AbstractC1623806Xk<PoiListApi.PoiDetailResponse>) 1005));
            PoiLocation poiLocation2 = poiDetailResponse.getPoiLocation();
            if ((poiLocation2 == null || (d5 = poiLocation2.lat) == null || d5.doubleValue() == 0.0d) && ((poiLocation = poiDetailResponse.getPoiLocation()) == null || (d = poiLocation.lng) == null || d.doubleValue() == 0.0d)) {
                z = false;
            } else {
                z = true;
            }
            if (!((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
                z = false;
            }
            if (!PoiEnableExperiment.LIZLLL()) {
                z = false;
            }
            DynamicMapParams dynamicMapParams = poiDetailResponse.getDynamicMapParams();
            if (dynamicMapParams == null || !Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.TRUE)) {
                z = false;
            }
            DynamicMapParams dynamicMapParams2 = poiDetailResponse.getDynamicMapParams();
            Double d6 = null;
            if (dynamicMapParams2 != null) {
                num = dynamicMapParams2.defaultZoomLevel;
            } else {
                num = null;
            }
            DynamicMapParams dynamicMapParams3 = poiDetailResponse.getDynamicMapParams();
            if (dynamicMapParams3 != null) {
                d2 = dynamicMapParams3.latMax;
            } else {
                d2 = null;
            }
            DynamicMapParams dynamicMapParams4 = poiDetailResponse.getDynamicMapParams();
            if (dynamicMapParams4 != null) {
                d3 = dynamicMapParams4.latMin;
            } else {
                d3 = null;
            }
            DynamicMapParams dynamicMapParams5 = poiDetailResponse.getDynamicMapParams();
            if (dynamicMapParams5 != null) {
                d4 = dynamicMapParams5.lngMax;
            } else {
                d4 = null;
            }
            DynamicMapParams dynamicMapParams6 = poiDetailResponse.getDynamicMapParams();
            if (dynamicMapParams6 != null) {
                d6 = dynamicMapParams6.lngMin;
            }
            if ((num == null && d2 != null && d3 != null && d4 != null && d6 != null) || !z) {
                if (poiDetailResponse.getAddress() != null) {
                    PoiMapViewModel poiMapViewModel2 = (PoiMapViewModel) afS7S0100100_18.l0;
                    EnumC1179610gnn enumC1179610gnn = EnumC1179610gnn.TYPE_STATIC_MAP;
                    poiMapViewModel2.getClass();
                    poiMapViewModel2.setState(new AwS597S0100000_18(enumC1179610gnn, 1004));
                } else {
                    ((PoiMapViewModel) afS7S0100100_18.l0).vQ2(EnumC1179630gnp.STATUS_POI_DETAIL_FAIL);
                }
            } else {
                PoiMapViewModel poiMapViewModel3 = (PoiMapViewModel) afS7S0100100_18.l0;
                EnumC1179610gnn enumC1179610gnn2 = EnumC1179610gnn.TYPE_DYNAMIC_MAP;
                poiMapViewModel3.getClass();
                poiMapViewModel3.setState(new AwS597S0100000_18(enumC1179610gnn2, 1004));
            }
            ((PoiMapViewModel) afS7S0100100_18.l0).vQ2(EnumC1179630gnp.STATUS_POI_DETAIL_READY);
        } else {
            PoiMapViewModel poiMapViewModel4 = (PoiMapViewModel) afS7S0100100_18.l0;
            C491001vg c491001vg = new C491001vg(new Exception("network error"));
            poiMapViewModel4.getClass();
            poiMapViewModel4.setState(new AwS597S0100000_18(c491001vg, (AbstractC1623806Xk<PoiListApi.PoiDetailResponse>) 1005));
            ((PoiMapViewModel) afS7S0100100_18.l0).vQ2(EnumC1179630gnp.STATUS_POI_DETAIL_FAIL);
        }
        C1C7U.LIZIZ("PoiMapViewModel@c49e.fetchPoiDetails$1$1");
    }

    public AfS7S0100100_18(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
