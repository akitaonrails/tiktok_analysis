package X;

import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692200RDe extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FeedAvatarAssemWrap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C692200RDe(FeedAvatarAssemWrap feedAvatarAssemWrap) {
        super(1);
        this.LL = feedAvatarAssemWrap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        FeedAvatarAssemWrap feedAvatarAssemWrap = this.LL;
        assembler2.LQ2(feedAvatarAssemWrap, new C692190RDd(feedAvatarAssemWrap));
        Context context = this.LL.getContext();
        if (context != null && !C0SXF.LJIL(context)) {
            FeedAvatarAssemWrap feedAvatarAssemWrap2 = this.LL;
            assembler2.LQ2(feedAvatarAssemWrap2, new C692210RDf(feedAvatarAssemWrap2));
            FeedAvatarAssemWrap feedAvatarAssemWrap3 = this.LL;
            assembler2.LQ2(feedAvatarAssemWrap3, new C692180RDc(feedAvatarAssemWrap3));
        }
        return Unit.LIZ;
    }
}
