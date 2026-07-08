package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270318Lt extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ CartBenefitInfo LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ AwemePruningModel LLILZIL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270318Lt(int i, CartBenefitInfo cartBenefitInfo, Map<String, ? extends Object> map, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, List<AnchorProductInfoModel> list) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = cartBenefitInfo;
        this.LLILLL = map;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = awemePruningModel;
        this.LLILZLL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("notice_number", Integer.valueOf(this.LL));
        CartBenefitInfo cartBenefitInfo = this.LLILLJJLI;
        if (cartBenefitInfo != null && (str = cartBenefitInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        Map<String, Object> map = this.LLILLL;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
            c957403oi2.LJ(linkedHashMap);
        }
        AnchorProductInfoModel anchorProductInfoModel = this.LLILZ;
        if (anchorProductInfoModel != null) {
            C21272218Mm.LIZ(null, null, null, anchorProductInfoModel, this.LLILZIL, this.LLILZLL, c957403oi2);
        }
        return Unit.LIZ;
    }
}
