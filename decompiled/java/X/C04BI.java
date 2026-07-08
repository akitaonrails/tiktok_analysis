package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04BI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BI extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04BI(C1054104Ah c1054104Ah, String str, String str2, boolean z, Integer num, String str3, Boolean bool, String str4, String str5, Integer num2, String str6) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = num;
        this.LLILZLL = str3;
        this.LLIZ = bool;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = num2;
        this.LLJIJIL = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        int iIntValue;
        String str2;
        ProductBase productBase;
        LaneParams laneParams2 = laneParams;
        ProductPackStruct productPackStruct = this.LL.LJIIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams2, str);
        laneParams2.plusAssign("photo_id", this.LLILLJJLI);
        laneParams2.plusAssign("photo_type", this.LLILLL);
        laneParams2.plusAssign("is_video", C893803eS.LIZ(this.LLILZ));
        Integer num = this.LLILZIL;
        int i = 0;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams2.plusAssign("position_rank", String.valueOf(iIntValue));
        laneParams2.plusAssign("module_name", this.LLILZLL);
        Boolean bool = this.LLIZ;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_first_show", str2);
        }
        String str3 = this.LLIZLLLIL;
        if (str3 != null) {
            laneParams2.plusAssign("video_id", str3);
        }
        String str4 = this.LLJ;
        if (str4 != null) {
            laneParams2.plusAssign("photo_show_type", str4);
        }
        Integer num2 = this.LLJI;
        if (num2 != null && num2.intValue() == 1) {
            i = 1;
        }
        laneParams2.plusAssign("is_algo_cut", Integer.valueOf(i));
        String str5 = this.LLJIJIL;
        if (str5 != null) {
            laneParams2.plusAssign("first_category_id", str5);
        }
        return Unit.LIZ;
    }
}
