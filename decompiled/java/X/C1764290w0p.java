package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.VideoItemVO;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0w0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764290w0p extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1764200w0g LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1764360w0w LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764290w0p(C1764200w0g c1764200w0g, int i, boolean z, C1764360w0w c1764360w0w, boolean z2) {
        super(1);
        this.LL = c1764200w0g;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = c1764360w0w;
        this.LLILZIL = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        Object obj;
        String str2;
        LaneParams laneParams2 = laneParams;
        VideoItemVO videoItemVO = (VideoItemVO) this.LL.LLILZ;
        if (videoItemVO != null) {
            str = videoItemVO.type;
        } else {
            str = null;
        }
        laneParams2.plusAssign("video_type", str);
        String str3 = "1";
        if (this.LLILLJJLI == 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("is_first_show", obj);
        laneParams2.plusAssign("position_rank", Integer.valueOf(this.LLILLJJLI));
        laneParams2.plusAssign("page_name", "product_detail");
        laneParams2.plusAssign("module_name", "head_pic");
        laneParams2.plusAssign("position_rank", Integer.valueOf(this.LLILLJJLI));
        if (this.LLILLL) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        laneParams2.plusAssign("page_show_type", str2);
        laneParams2.plusAssign("video_id", this.LLILZ.getVideoId());
        laneParams2.plusAssign("video_show_type", "main");
        laneParams2.plusAssign("duration", Integer.valueOf(this.LLILZ.getPlayProgress()));
        if (!this.LLILZIL) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("is_play_finish", str3);
        return Unit.LIZ;
    }
}
