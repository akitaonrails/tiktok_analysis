package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RS3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS3 extends C09AY implements Function0<FeedComponentPriorityData> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS3(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPriorityData invoke() {
        return this.LL.up();
    }
}
