package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl;

/* JADX INFO: renamed from: X.0Kuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl", f = "LiveRecordingsRepositoryImpl.kt", l = {116, 124}, m = "cleanConfigDatabase")
public final class C532790Kuz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsRepositoryImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532790Kuz(LiveRecordingsRepositoryImpl liveRecordingsRepositoryImpl, InterfaceC1364105Vn<? super C532790Kuz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsRepositoryImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsRepositoryImpl@495a.cleanConfigDatabase$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(false, this);
        C1C7U.LIZIZ("LiveRecordingsRepositoryImpl@495a.cleanConfigDatabase$1");
        return objLJII;
    }
}
