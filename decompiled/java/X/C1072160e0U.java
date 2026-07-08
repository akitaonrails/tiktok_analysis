package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0e0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072160e0U implements InterfaceC1004520cFO {
    public final IAuthApi LIZ;
    public final InterfaceC1071740dzo LIZIZ;
    public final String LIZJ;
    public final C01GW LIZLLL;

    public C1072160e0U() {
        AuthApiService authApiService = AuthApiService.LIZIZ;
        InterfaceC1071740dzo interfaceC1071740dzoLJII = C1076010e6h.LIZJ.LJII();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        this.LIZ = authApiService;
        this.LIZIZ = interfaceC1071740dzoLJII;
        this.LIZJ = curUserId;
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(339));
    }

    public final void LIZJ(Throwable th) {
        C23112093u c23112093u;
        if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 3002047) {
            C1076010e6h.LIZJ.LJII().LIZ(this.LIZJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC1004520cFO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC1074240e3q r16, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r17) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1072160e0U.LIZ(X.0e3q, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1004520cFO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC1074240e3q r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1072160e0U.LIZIZ(X.0e3q, X.05Vn):java.lang.Object");
    }
}
