package X;

import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2MapAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176680gj4 extends C09AY implements InterfaceC1631620sYq<PoiDetailNearbyV2MapAssem, Map<Integer, ? extends PoiGeneralCard>, C1176090gi7, Unit> {
    public C1176680gj4() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(PoiDetailNearbyV2MapAssem poiDetailNearbyV2MapAssem, Map<Integer, ? extends PoiGeneralCard> map, C1176090gi7 c1176090gi7) {
        PoiDetailNearbyV2MapAssem poiDetailNearbyV2MapAssem2 = poiDetailNearbyV2MapAssem;
        Map<Integer, ? extends PoiGeneralCard> map2 = map;
        C1176090gi7 c1176090gi72 = c1176090gi7;
        if (map2 != null && c1176090gi72 != null && c1176090gi72.centerPoi != null) {
            poiDetailNearbyV2MapAssem2.LLJJLIIIJLLLLLLLZ.LIZLLL(Collections.singletonList("map_init"), new C1176670gj3(poiDetailNearbyV2MapAssem2, c1176090gi72, map2));
        }
        return Unit.LIZ;
    }
}
