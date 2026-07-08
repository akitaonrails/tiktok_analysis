package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWW extends C09AY implements Function0<FeedComponentPriorityData> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWW(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPriorityData invoke() {
        return this.LL.up();
    }
}
