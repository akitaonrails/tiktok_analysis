package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialRelationTagTriggerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RWB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWB extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ FeedSocialRelationTagTriggerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWB(FeedSocialRelationTagTriggerV2 feedSocialRelationTagTriggerV2) {
        super(1);
        this.LL = feedSocialRelationTagTriggerV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.LLJILJILJ = str;
        return Unit.LIZ;
    }
}
