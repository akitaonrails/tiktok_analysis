package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04B2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04B2 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Boolean LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04B2(C1054004Ag c1054004Ag, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = str8;
        this.LLJIJIL = bool;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
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
        laneParams2.plusAssign("photo_show_type", this.LLILLL);
        if (this.LLILZ) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        laneParams2.plusAssign("page_show_type", str2);
        laneParams2.plusAssign("photo_id", this.LLILZIL);
        String str4 = this.LLILZLL;
        if (str4 == null) {
            str4 = "";
        }
        laneParams2.plusAssign("glide_info", str4);
        laneParams2.plusAssign("module_name", this.LLIZ);
        laneParams2.plusAssign("total_rank", this.LLIZLLLIL);
        laneParams2.plusAssign("page_name", this.LLJ);
        String str5 = this.LLJI;
        if (str5 != null) {
            laneParams2.plusAssign("glide_direction", str5);
        }
        Boolean bool = this.LLJIJIL;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_video", str3);
        }
        String str6 = this.LLJILJIL;
        if (str6 != null) {
            laneParams2.plusAssign("video_id", str6);
        }
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
