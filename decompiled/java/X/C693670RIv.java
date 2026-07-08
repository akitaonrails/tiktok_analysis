package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizTopAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693670RIv extends C09AY implements Function0<String> {
    public final /* synthetic */ BizTopAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693670RIv(BizTopAreaComponent bizTopAreaComponent) {
        super(0);
        this.LL = bizTopAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ((VideoItemParams) C631370Opb.LIZ(this.LL), this.LL.jm());
    }
}
