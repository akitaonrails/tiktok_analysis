package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;

/* JADX INFO: renamed from: X.0Ia4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver", f = "FBVNoticeObserver.kt", l = {78, 85, 88}, m = "checkNotice")
public final class C468860Ia4 extends AbstractC23140094w {
    public FBVNoticeObserver LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FBVNoticeObserver LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468860Ia4(FBVNoticeObserver fBVNoticeObserver, InterfaceC1364105Vn<? super C468860Ia4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = fBVNoticeObserver;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FBVNoticeObserver@2545.checkNotice$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("FBVNoticeObserver@2545.checkNotice$1");
        return objLIZ;
    }
}
