package X;

import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;

/* JADX INFO: renamed from: X.09Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Y5<T> implements C09JN {
    public static final C09Y5<T> LL = new C09Y5<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        String pageName;
        C1C7U.LIZ("PageMonitor@3af1.ecErrorHandler$1");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uncaught EC error in ");
        PageMonitor.LIZ.getClass();
        InterfaceC1748820vbs interfaceC1748820vbs = (InterfaceC1748820vbs) C13LP.LJJJLL(PageMonitor.LJFF);
        String message = null;
        if (interfaceC1748820vbs != null) {
            pageName = interfaceC1748820vbs.getPageName();
        } else {
            pageName = null;
        }
        sbLIZ.append(pageName);
        sbLIZ.append(", msg =  ");
        Throwable cause = th.getCause();
        if (cause != null) {
            message = cause.getMessage();
        }
        sbLIZ.append(message);
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PageMonitor@3af1.ecErrorHandler$1");
    }
}
