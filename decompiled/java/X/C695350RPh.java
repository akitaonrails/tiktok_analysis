package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695350RPh extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ InteractRightAreaComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695350RPh(VideoItemParams videoItemParams, InteractRightAreaComponent interactRightAreaComponent) {
        super(0);
        this.LL = videoItemParams;
        this.LLILLJJLI = interactRightAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ(this.LL, this.LLILLJJLI.jm());
    }
}
