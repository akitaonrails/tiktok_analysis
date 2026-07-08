package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710860RuW extends C09AY implements Function1<C0RUS, Unit> {
    public C710860RuW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIIJJI();
        return Unit.LIZ;
    }
}
