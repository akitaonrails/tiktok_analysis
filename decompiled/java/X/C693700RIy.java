package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693700RIy extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693700RIy(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ((VideoItemParams) C631370Opb.LIZ(this.LL), this.LL.jm());
    }
}
