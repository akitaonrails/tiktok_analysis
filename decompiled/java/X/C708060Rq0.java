package X;

import com.ss.android.ugc.feed.platform.componentmanager.maker.next.service.FcpServiceAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708060Rq0 extends C09AY implements Function0<C721850STf> {
    public final /* synthetic */ FcpServiceAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708060Rq0(FcpServiceAssem fcpServiceAssem) {
        super(0);
        this.LL = fcpServiceAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C721850STf invoke() {
        return new C721850STf(this.LL.getLifecycle());
    }
}
