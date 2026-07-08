package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04B3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04B3 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Boolean LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04B3(C1054004Ag c1054004Ag, String str, List<String> list, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = bool;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = str9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        int iIntValue;
        String str2;
        ProductBase productBase;
        LaneParams laneParams2 = laneParams;
        ProductPackStruct productPackStruct = this.LL.LJIIZILJ;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams2, str);
        C1010603xI.LIZJ(laneParams2, this.LLILLJJLI);
        List<String> list = this.LLILLL;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C1010603xI.LIZJ(laneParams2, it2.next());
            }
        }
        laneParams2.plusAssign("photo_id", this.LLILZ);
        laneParams2.plusAssign("photo_type", this.LLILZIL);
        laneParams2.plusAssign("is_video", C893803eS.LIZ(this.LLILZLL));
        Integer num = this.LLIZ;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams2.plusAssign("position_rank", String.valueOf(iIntValue));
        laneParams2.plusAssign("module_name", this.LLIZLLLIL);
        laneParams2.plusAssign("total_rank", this.LLJ);
        laneParams2.plusAssign("page_name", this.LLJI);
        Boolean bool = this.LLJIJIL;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams2.plusAssign("is_first_show", str2);
        }
        String str3 = this.LLJILJIL;
        if (str3 != null) {
            laneParams2.plusAssign("video_id", str3);
        }
        String str4 = this.LLJILJILJ;
        if (str4 != null) {
            laneParams2.plusAssign("photo_show_type", str4);
        }
        try {
            laneParams2.putAll(C1010603xI.LIZ(this.LLJILLL));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
