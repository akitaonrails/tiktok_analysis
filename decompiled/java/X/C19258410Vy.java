package X;

import com.ss.android.ugc.aweme.pns.agegate.PNSAgeFromStoreServiceGoogleImpl;

/* JADX INFO: renamed from: X.10Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.agegate.PNSAgeFromStoreServiceGoogleImpl", f = "PNSAgeFromStoreServiceGoogleImpl.kt", l = {118, 146, 153}, m = "fetchAgeRangeFromStoreWithoutVerification")
public final class C19258410Vy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PNSAgeFromStoreServiceGoogleImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19258410Vy(PNSAgeFromStoreServiceGoogleImpl pNSAgeFromStoreServiceGoogleImpl, InterfaceC1364105Vn<? super C19258410Vy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = pNSAgeFromStoreServiceGoogleImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSAgeFromStoreServiceGoogleImpl@411d.fetchAgeRangeFromStoreWithoutVerification$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, this);
        C1C7U.LIZIZ("PNSAgeFromStoreServiceGoogleImpl@411d.fetchAgeRangeFromStoreWithoutVerification$1");
        return objLJ;
    }
}
