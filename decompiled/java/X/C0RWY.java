package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWY extends C09AY implements Function0<VideoItemParams> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWY(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoItemParams invoke() {
        return this.LL.bo();
    }
}
