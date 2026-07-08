package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184790gw9 extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PoiDetailFoodHeaderAssem LLILLJJLI;
    public final /* synthetic */ PoiListApi.PoiDetailResponse LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Pair<CharSequence, EnumC1184780gw8> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1184790gw9(String str, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, Pair<? extends CharSequence, ? extends EnumC1184780gw8> pair) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = poiDetailFoodHeaderAssem;
        this.LLILLL = poiDetailResponse;
        this.LLILZ = str2;
        this.LLILZIL = pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        CharSequence first;
        EnumC1184780gw8 second;
        String strMobPicMode;
        String strMobPicMode2;
        String type = null;
        if (C123100dR.LIZ(this.LL)) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LLILLJJLI);
            String strValueOf = String.valueOf(EnumC1179480gna.POI_DETAIL_TAG_OPENING_STATUS.getValue());
            PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILLL;
            if (poiDetailResponse != null) {
                strMobPicMode2 = poiDetailResponse.mobPicMode();
            } else {
                strMobPicMode2 = null;
            }
            PageFinder pageFinderZo = this.LLILLJJLI.Zo();
            C1184710gw1 c1184710gw1 = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            c1185430gxB.getClass();
            C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, strValueOf, strMobPicMode2, "ordinary", pageFinderZo, c1184710gw1);
        }
        if (C123100dR.LIZ(this.LLILZ)) {
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this.LLILLJJLI);
            String strValueOf2 = String.valueOf(EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME.getValue());
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLILLL;
            if (poiDetailResponse2 != null) {
                strMobPicMode = poiDetailResponse2.mobPicMode();
            } else {
                strMobPicMode = null;
            }
            PageFinder pageFinderZo2 = this.LLILLJJLI.Zo();
            C1184710gw1 c1184710gw12 = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            c1185430gxB2.getClass();
            C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL2, false, null, strValueOf2, strMobPicMode, "ordinary", pageFinderZo2, c1184710gw12);
        }
        Pair<CharSequence, EnumC1184780gw8> pair = this.LLILZIL;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (C041J.LIZ(first)) {
            C1185430gxB c1185430gxB3 = C1185430gxB.LIZ;
            Pair<CharSequence, EnumC1184780gw8> pair2 = this.LLILZIL;
            if (pair2 != null && (second = pair2.getSecond()) != null) {
                type = second.getType();
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL(this.LLILLJJLI);
            PageFinder pageFinderZo3 = this.LLILLJJLI.Zo();
            C1184710gw1 c1184710gw13 = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            c1185430gxB3.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJIIL3);
            C1189060h32.LJJ("per_price_type", type, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderZo3);
            c1185040gwY.getClass();
            C1185040gwY.LJII("ttls_poi_price_show", linkedHashMap, c1185050gwZ, c1184710gw13);
        }
        return Unit.LIZ;
    }
}
