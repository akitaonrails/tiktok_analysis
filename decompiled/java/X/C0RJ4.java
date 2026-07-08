package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJ4 extends C09AY implements Function0<String> {
    public final /* synthetic */ InteractRightAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RJ4(InteractRightAreaComponent interactRightAreaComponent) {
        super(0);
        this.LL = interactRightAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ((VideoItemParams) C631370Opb.LIZ(this.LL), this.LL.jm());
    }
}
