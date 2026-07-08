package X;

import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702320Rgk extends C09AY implements Function0<FeedComponentPriorityData> {
    public final /* synthetic */ FcpContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702320Rgk(FcpContainerAssem fcpContainerAssem) {
        super(0);
        this.LL = fcpContainerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPriorityData invoke() {
        return this.LL.hp();
    }
}
