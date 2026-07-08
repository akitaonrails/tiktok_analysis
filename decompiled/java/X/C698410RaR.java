package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698410RaR extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ InteractAreaComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698410RaR(VideoItemParams videoItemParams, InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = videoItemParams;
        this.LLILLJJLI = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ(this.LL, this.LLILLJJLI.jm());
    }
}
