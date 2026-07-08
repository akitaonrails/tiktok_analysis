package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.SeaGodaV1TrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764220w0i extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ SeaGodaV1TrackHelper LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C04G1 LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764220w0i(SeaGodaV1TrackHelper seaGodaV1TrackHelper, boolean z, String str, String str2, C04G1 c04g1, Map<String, ? extends Object> map, int i) {
        super(1);
        this.LL = seaGodaV1TrackHelper;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c04g1;
        this.LLILZLL = map;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        String str2;
        Boolean boolLJ0;
        ProductBase productBase;
        Map<String, ? extends Object> mapLIZ;
        LaneParams laneParams2 = laneParams;
        CommonParamsContext commonParamsContext = (CommonParamsContext) this.LL.LLILZLL.getValue();
        if (commonParamsContext != null && (mapLIZ = C1765430w2f.LIZ(commonParamsContext.LL)) != null) {
            laneParams2.withParamsGroup(mapLIZ);
        }
        ProductPackStruct productPackStruct = this.LL.LLILLL.LLJIJIL;
        String str3 = null;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str3 = productBase.headerImageDaInfo;
        }
        C1010603xI.LIZJ(laneParams2, str3);
        laneParams2.plusAssign("page_name", "product_detail");
        laneParams2.plusAssign("module_name", "head_pic");
        if (this.LLILLJJLI) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams2.plusAssign("page_show_type", str);
        laneParams2.plusAssign("glide_direction", this.LLILLL);
        laneParams2.plusAssign("photo_show_type", this.LLILZ);
        if (Intrinsics.LJFF(this.LLILZIL.LJIJJLI.LIZ, "video_style")) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.put("is_video", str2);
        ISeaListHelper iSeaListHelperLIZ = this.LL.LIZ();
        if (iSeaListHelperLIZ != null && (boolLJ0 = iSeaListHelperLIZ.lJ0()) != null) {
            laneParams2.put("is_first_glide", Integer.valueOf(boolLJ0.booleanValue() ? 1 : 0));
        }
        Map<String, Object> map = this.LLILZLL;
        if (map != null) {
            laneParams2.putAll(map);
        }
        laneParams2.putAll(this.LL.LIZIZ(this.LLIZ));
        return Unit.LIZ;
    }
}
