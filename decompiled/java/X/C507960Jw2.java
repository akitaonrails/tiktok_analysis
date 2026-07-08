package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SpaceActivityListResponse;

/* JADX INFO: renamed from: X.0Jw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507960Jw2 extends C09AY implements Function1<C507970Jw3, C507970Jw3> {
    public final /* synthetic */ C470590Icr<SpaceActivityListResponse.ResponseData> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507960Jw2(C470590Icr<SpaceActivityListResponse.ResponseData> c470590Icr) {
        super(1);
        this.LL = c470590Icr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C507970Jw3 invoke(C507970Jw3 c507970Jw3) {
        C507970Jw3 c507970Jw32 = c507970Jw3;
        C291001Au c291001Au = new C291001Au(this.LL.data);
        C291001Au<Throwable> c291001Au2 = c507970Jw32.LLILLJJLI;
        c507970Jw32.getClass();
        return new C507970Jw3(c291001Au, c291001Au2);
    }
}
