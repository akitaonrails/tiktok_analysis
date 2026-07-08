package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351360lGo extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ VideoQuickCommentTrigger LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351360lGo(VideoQuickCommentTrigger videoQuickCommentTrigger, VideoItemParams videoItemParams) {
        super(1);
        this.LL = videoQuickCommentTrigger;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.getClass();
        ((C11RK) this.LL.LLJL.LLILLJJLI.getValue()).onNext(new Pair(this.LLILLJJLI.getAweme().getAid(), EnumC1351150lGT.DOUBLE_FOLLOW));
        return Unit.LIZ;
    }
}
