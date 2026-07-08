package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C689920R4k extends C09AY implements Function0<Long> {
    public final /* synthetic */ VideoViewCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C689920R4k(VideoViewCell videoViewCell) {
        super(0);
        this.LL = videoViewCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis() - this.LL.LLLLLLL);
    }
}
