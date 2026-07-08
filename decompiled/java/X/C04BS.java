package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04BS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BS extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04BS(C1054104Ah c1054104Ah, String str, boolean z, String str2, String str3, String str4, Boolean bool, String str5) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = bool;
        this.LLIZLLLIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        String str2;
        String str3;
        ProductBase productBase;
        LaneParams laneParams2 = laneParams;
        laneParams2.withParamsGroup(this.LL.LIZIZ);
        ProductPackStruct productPackStruct = this.LL.LJIIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams2, str);
        laneParams2.plusAssign("photo_show_type", this.LLILLJJLI);
        if (this.LLILLL) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        laneParams2.plusAssign("page_show_type", str2);
        laneParams2.plusAssign("photo_id", this.LLILZ);
        String str4 = this.LLILZIL;
        if (str4 == null) {
            str4 = "";
        }
        laneParams2.plusAssign("glide_info", str4);
        String str5 = this.LLILZLL;
        if (str5 != null) {
            laneParams2.plusAssign("glide_direction", str5);
        }
        Boolean bool = this.LLIZ;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_video", str3);
        }
        String str6 = this.LLIZLLLIL;
        if (str6 != null) {
            laneParams2.plusAssign("video_id", str6);
        }
        return Unit.LIZ;
    }
}
