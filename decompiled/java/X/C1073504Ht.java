package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073504Ht extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLILZ = "head_pic";
    public final /* synthetic */ String LLIZ = "main";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073504Ht(C1054104Ah c1054104Ah, String str, String str2, boolean z, Boolean bool, String str3, String str4, Integer num, Integer num2, String str5) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZIL = z;
        this.LLILZLL = bool;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = num;
        this.LLJIJIL = num2;
        this.LLJILJIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        int iIntValue;
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
        laneParams2.plusAssign("photo_id", this.LLILLJJLI);
        laneParams2.plusAssign("photo_type", this.LLILLL);
        laneParams2.plusAssign("module_name", this.LLILZ);
        laneParams2.plusAssign("is_video", C893803eS.LIZ(this.LLILZIL));
        Boolean bool = this.LLILZLL;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_first_show", str3);
        }
        String str4 = this.LLIZ;
        if (str4 != null) {
            laneParams2.plusAssign("photo_show_type", str4);
        }
        String str5 = this.LLIZLLLIL;
        if (str5 != null) {
            laneParams2.plusAssign("photo_click_type", str5);
        }
        String str6 = this.LLJ;
        if (str6 != null) {
            laneParams2.plusAssign("video_id", str6);
        }
        Integer num = this.LLJI;
        int i = 0;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams2.plusAssign("position_rank", String.valueOf(iIntValue));
        ProductPackStruct productPackStruct2 = this.LL.LJIIL;
        if (productPackStruct2 != null && productPackStruct2.LJII()) {
            str2 = "skc";
        } else {
            str2 = "sku";
        }
        laneParams2.plusAssign("sub_module_name", str2);
        Integer num2 = this.LLJIJIL;
        if (num2 != null && num2.intValue() == 1) {
            i = 1;
        }
        laneParams2.plusAssign("is_algo_cut", Integer.valueOf(i));
        String str7 = this.LLJILJIL;
        if (str7 != null) {
            laneParams2.plusAssign("first_category_id", str7);
        }
        return Unit.LIZ;
    }
}
