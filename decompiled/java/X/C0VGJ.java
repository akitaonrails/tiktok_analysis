package X;

import com.ss.android.ugc.aweme.trace.PageTraceApiImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGJ extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C0V3K LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VGJ(PageTraceApiImpl pageTraceApiImpl) {
        super(1);
        this.LL = pageTraceApiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        l.longValue();
        C0VGA.LIZLLL = this.LL;
        return Unit.LIZ;
    }
}
