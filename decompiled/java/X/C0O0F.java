package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizTopAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O0F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0F extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ BizTopAreaComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O0F(VideoItemParams videoItemParams, BizTopAreaComponent bizTopAreaComponent) {
        super(0);
        this.LL = videoItemParams;
        this.LLILLJJLI = bizTopAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ(this.LL, this.LLILLJJLI.jm());
    }
}
