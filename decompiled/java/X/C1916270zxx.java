package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver$checkNotice$3$1", f = "FBVNoticeObserver.kt", l = {}, m = "invokeSuspend")
public final class C1916270zxx extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super FBVCheckResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FBVNoticeObserver LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916270zxx(FBVNoticeObserver fBVNoticeObserver, InterfaceC1364105Vn<? super C1916270zxx> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = fBVNoticeObserver;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FBVNoticeObserver@2545.checkNotice$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LIZIZ("FBVNoticeObserver", "checkFBVStatus Error cause");
        InterfaceC1916320zy2 interfaceC1916320zy2 = this.LL.LLIZLLLIL;
        if (interfaceC1916320zy2 != null) {
            interfaceC1916320zy2.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FBVNoticeObserver@2545.checkNotice$3$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super FBVCheckResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1916270zxx(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
