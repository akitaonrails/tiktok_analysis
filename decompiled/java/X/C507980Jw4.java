package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SpaceActivityListResponse;

/* JADX INFO: renamed from: X.0Jw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507980Jw4 extends C09AY implements Function1<C507970Jw3, C507970Jw3> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507980Jw4(Throwable th) {
        super(1);
        this.LL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C507970Jw3 invoke(C507970Jw3 c507970Jw3) {
        C507970Jw3 c507970Jw32 = c507970Jw3;
        C291001Au c291001Au = new C291001Au(this.LL);
        C291001Au<SpaceActivityListResponse.ResponseData> c291001Au2 = c507970Jw32.LL;
        c507970Jw32.getClass();
        return new C507970Jw3(c291001Au2, c291001Au);
    }
}
