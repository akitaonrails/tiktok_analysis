package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer$lowTagComponentProtocol$2$1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWC extends C09AY implements Function0<VideoTagContainer$lowTagComponentProtocol$2$1> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWC(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VideoTagContainer$lowTagComponentProtocol$2$1 invoke() {
        return new VideoTagContainer$lowTagComponentProtocol$2$1(this.LL);
    }
}
