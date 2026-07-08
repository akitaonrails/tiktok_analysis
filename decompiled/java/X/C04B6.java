package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04B6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04B6 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04B6(C1054004Ag c1054004Ag, String str, String str2, String str3, String str4, boolean z, String str5, Boolean bool, String str6, String str7, String str8, Integer num, String str9) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = z;
        this.LLIZ = str5;
        this.LLIZLLLIL = bool;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = num;
        this.LLJILJILJ = str9;
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
        ProductPackStruct productPackStruct = this.LL.LJIIZILJ;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams2, str);
        C1010603xI.LIZJ(laneParams2, this.LLILLJJLI);
        laneParams2.plusAssign("photo_id", this.LLILLL);
        laneParams2.plusAssign("photo_type", this.LLILZ);
        laneParams2.plusAssign("module_name", this.LLILZIL);
        laneParams2.plusAssign("is_video", C893803eS.LIZ(this.LLILZLL));
        laneParams2.plusAssign("total_rank", this.LLIZ);
        Boolean bool = this.LLIZLLLIL;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_first_show", str3);
        }
        String str4 = this.LLJ;
        if (str4 != null) {
            laneParams2.plusAssign("photo_show_type", str4);
        }
        String str5 = this.LLJI;
        if (str5 != null) {
            laneParams2.plusAssign("photo_click_type", str5);
        }
        String str6 = this.LLJIJIL;
        if (str6 != null) {
            laneParams2.plusAssign("video_id", str6);
        }
        Integer num = this.LLJILJIL;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams2.plusAssign("position_rank", String.valueOf(iIntValue));
        ProductPackStruct productPackStruct2 = this.LL.LJIIZILJ;
        if (productPackStruct2 != null && productPackStruct2.LJII()) {
            str2 = "skc";
        } else {
            str2 = "sku";
        }
        laneParams2.plusAssign("sub_module_name", str2);
        try {
            laneParams2.putAll(C1010603xI.LIZ(this.LLJILJILJ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
