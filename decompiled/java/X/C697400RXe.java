package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697400RXe extends C09AY implements Function0<VideoItemParams> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697400RXe(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoItemParams invoke() {
        return this.LL.bo();
    }
}
