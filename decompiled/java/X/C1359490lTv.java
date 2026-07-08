package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.interact.info.UpvoteVideoTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359490lTv extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ UpvoteVideoTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359490lTv(UpvoteVideoTrigger upvoteVideoTrigger) {
        super(1);
        this.LL = upvoteVideoTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        UpvoteVideoTrigger upvoteVideoTrigger = this.LL;
        assembler.EQ2(upvoteVideoTrigger, new C1359380lTk(upvoteVideoTrigger));
        return Unit.LIZ;
    }
}
