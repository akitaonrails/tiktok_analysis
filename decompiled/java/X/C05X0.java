package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05X0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05X0 {
    public static final C05X0 LIZ = new C05X0();
    public static final ConcurrentHashMap<Pair<String, String>, String> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZIZ() {
        Iterator<T> it2 = LIZIZ.keySet().iterator();
        Pair pair = null;
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            if (Intrinsics.LJFF(pair2.getFirst(), "") && Intrinsics.LJFF(pair2.getSecond(), "audio_metrics")) {
                pair = pair2;
            }
        }
        if (pair != null) {
            ConcurrentHashMap<Pair<String, String>, String> concurrentHashMap = LIZIZ;
            String str = concurrentHashMap.get(pair);
            if (str != null && str.length() != 0) {
                C2112908Pn c2112908Pn = C2112908Pn.LIZ;
                if (C2112908Pn.LIZ(str)) {
                    return str;
                }
            }
            concurrentHashMap.remove(pair);
        }
        return "";
    }

    public static void LIZJ(Function0 function0) {
        if (LIZIZ().length() > 0) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05FL("", "audio_metrics", function0, null), 2);
    }

    public static Object LIZ(String str, final String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{str}, C2097608Jq.LJIIJ(new Pair(str, C1697810uHb.LJIILJJIL(str2))), new IFetchResourceListener() { // from class: X.0nkC
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl("");
                interfaceC1364105Vn2.resumeWith("");
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                String strFindResourceUri;
                try {
                    if (C13Q5.LIZJ()) {
                        strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str2);
                    } else {
                        strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, str2);
                    }
                    if (C123100dR.LIZ(strFindResourceUri)) {
                        String path = URI.create(strFindResourceUri).getPath();
                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(path);
                        interfaceC1364105Vn2.resumeWith(path);
                        return;
                    }
                    InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                    C189200o6.m2constructorimpl("");
                    interfaceC1364105Vn3.resumeWith("");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    System.out.print(e.getStackTrace());
                    InterfaceC1364105Vn<String> interfaceC1364105Vn4 = c23260099m;
                    C189200o6.m2constructorimpl("");
                    interfaceC1364105Vn4.resumeWith("");
                }
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
