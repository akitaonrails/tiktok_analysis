package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186160gyM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ PoiInnerPageMobData LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ View LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186160gyM(Context context, String str, String str2, String str3, String str4, List<String> list, String str5, PoiInnerPageMobData poiInnerPageMobData, String str6, String str7, String str8, View view) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = list;
        this.LLIZ = str5;
        this.LLIZLLLIL = poiInnerPageMobData;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        String str3;
        C1192310h8H c1192310h8H = C1192310h8H.LIZ;
        Context context = this.LL;
        String str4 = this.LLILLJJLI;
        String str5 = this.LLILLL;
        String str6 = this.LLILZ;
        String str7 = this.LLILZIL;
        List<String> list = this.LLILZLL;
        String str8 = this.LLIZ;
        PoiInnerPageMobData poiInnerPageMobData = this.LLIZLLLIL;
        if (poiInnerPageMobData != null) {
            str = poiInnerPageMobData.regionCode;
            str2 = poiInnerPageMobData.poiId;
            str3 = poiInnerPageMobData.enterFrom;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        String str9 = this.LLJ;
        c1192310h8H.getClass();
        C1192310h8H.LIZLLL(context, str4, str5, str6, str7, list, str8, str, str2, str3, str9);
        C2344009Gk c2344009Gk = new C2344009Gk();
        PoiInnerPageMobData poiInnerPageMobData2 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "enter_from", poiInnerPageMobData2 != null ? poiInnerPageMobData2.enterFrom : null);
        PoiInnerPageMobData poiInnerPageMobData3 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", poiInnerPageMobData3 != null ? poiInnerPageMobData3.poiId : null);
        PoiInnerPageMobData poiInnerPageMobData4 = this.LLIZLLLIL;
        C1189060h32.LIZJ(c2344009Gk, poiInnerPageMobData4 != null ? poiInnerPageMobData4.collectInfo : null);
        PoiInnerPageMobData poiInnerPageMobData5 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "from_group_id", poiInnerPageMobData5 != null ? poiInnerPageMobData5.fromGroupId : null);
        PoiInnerPageMobData poiInnerPageMobData6 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", poiInnerPageMobData6 != null ? poiInnerPageMobData6.initialPoiEnterFrom : null);
        PoiInnerPageMobData poiInnerPageMobData7 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_method", poiInnerPageMobData7 != null ? poiInnerPageMobData7.initialPoiEnterMethod : null);
        PoiInnerPageMobData poiInnerPageMobData8 = this.LLIZLLLIL;
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_from_group_id", poiInnerPageMobData8 != null ? poiInnerPageMobData8.initialPoiFromGroupId : null);
        C1189060h32.LJJIFFI(c2344009Gk, "ttls_gallery_pic_source", this.LLILLL);
        C1189060h32.LJJIFFI(c2344009Gk, "current_page", this.LLJI);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        String str10 = this.LLJIJIL;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(this.LLJILJIL));
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str10, map, c1185050gwZ);
        return Unit.LIZ;
    }
}
