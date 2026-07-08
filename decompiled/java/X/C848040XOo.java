package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0XOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848040XOo {
    public static C0XGN LIZIZ;
    public static C0XHB LIZJ;
    public static final C848040XOo LIZ = new C848040XOo();
    public static final ExecutorService LIZLLL = C807400Vlq.LIZJ();
    public static final List<InterfaceC427710Gpt> LJ = new LinkedList();

    public static void LIZ(InterfaceC427710Gpt interfaceC427710Gpt) {
        synchronized (C848040XOo.class) {
            try {
                List<InterfaceC427710Gpt> list = LJ;
                if (!((LinkedList) list).contains(interfaceC427710Gpt)) {
                    ((LinkedList) list).add(interfaceC427710Gpt);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i, User user, User user2) {
        LinkedList linkedList = new LinkedList();
        synchronized (C848040XOo.class) {
            try {
                linkedList.addAll(LJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC427710Gpt) it2.next()).LLLLLLZZ(i, user, user2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:8|(1:10)|11|(4:84|15|18|(1:(1:29))(2:24|(1:27)))|30|(21:32|(0)|35|(1:41)|42|82|43|80|44|50|(1:52)(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(2:68|(2:70|71)(1:72)))|34|35|(3:37|39|41)|42|82|43|80|44|50|(0)(0)|54|(0)|57|(0)|60|(0)|63|(0)|66|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        r5 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        r5 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5);
        r18 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe A[Catch: all -> 0x0231, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x0011, B:10:0x0017, B:11:0x001e, B:13:0x003e, B:30:0x0084, B:32:0x008a, B:35:0x00ad, B:37:0x00b5, B:39:0x00bd, B:41:0x00cd, B:42:0x00e0, B:43:0x00f3, B:44:0x0109, B:50:0x011f, B:54:0x0146, B:57:0x0192, B:60:0x0198, B:63:0x019e, B:65:0x01fe, B:66:0x0213, B:68:0x021f, B:72:0x0227, B:49:0x011a, B:34:0x0095, B:15:0x0046, B:18:0x0056, B:22:0x006d, B:24:0x0073, B:27:0x007b, B:29:0x0081, B:17:0x0051), top: B:78:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f A[Catch: all -> 0x0231, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x0011, B:10:0x0017, B:11:0x001e, B:13:0x003e, B:30:0x0084, B:32:0x008a, B:35:0x00ad, B:37:0x00b5, B:39:0x00bd, B:41:0x00cd, B:42:0x00e0, B:43:0x00f3, B:44:0x0109, B:50:0x011f, B:54:0x0146, B:57:0x0192, B:60:0x0198, B:63:0x019e, B:65:0x01fe, B:66:0x0213, B:68:0x021f, B:72:0x0227, B:49:0x011a, B:34:0x0095, B:15:0x0046, B:18:0x0056, B:22:0x006d, B:24:0x0073, B:27:0x007b, B:29:0x0081, B:17:0x0051), top: B:78:0x0009, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.C0XO2 r16, java.lang.String r17, final java.lang.String r18, final boolean r19) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C848040XOo.LIZJ(X.0XO2, java.lang.String, java.lang.String, boolean):void");
    }
}
