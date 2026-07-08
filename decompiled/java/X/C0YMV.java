package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: renamed from: X.0YMV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMV implements InterfaceC868790Y6j {
    public static final C0YMV LIZ = new C0YMV();
    public static final C0YMU LIZIZ = C0YMU.LIZ;

    @Override // X.InterfaceC868790Y6j
    public final InterfaceC870760YDy LIZ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC868790Y6j
    public final void LIZJ(String str, String str2, Throwable th) {
        LIZIZ(5, str, str2, th);
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJ(String str, String str2, Throwable th) {
        LIZIZ(4, str, str2, th);
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJFF(String str, String str2, Throwable th) {
        C882400YjW.LIZ.getClass();
        if (!((C883390Yl7) C882400YjW.LJI()).isDebug()) {
            ((C883390Yl7) C882400YjW.LJI()).isLocalTest();
        }
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJI(String str, String str2, Throwable th) {
        LIZIZ(6, str, str2, th);
    }

    public static void LIZIZ(int i, String str, String str2, Throwable th) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ == null) {
            return;
        }
        iMALogApiLIZ.LIZ(i, str, str2);
        if (th != null) {
            iMALogApiLIZ.logException(th);
        }
    }
}
