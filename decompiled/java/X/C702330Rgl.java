package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702330Rgl extends C09AY implements Function0<VideoItemParams> {
    public final /* synthetic */ FcpContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702330Rgl(FcpContainerAssem fcpContainerAssem) {
        super(0);
        this.LL = fcpContainerAssem;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoItemParams invoke() {
        return this.LL.bo();
    }
}
