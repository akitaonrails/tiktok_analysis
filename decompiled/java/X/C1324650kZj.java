package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324650kZj extends C314750CVl {
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZJ(InterfaceC1324680kZm interfaceC1324680kZm) {
        String strLIZ;
        if (C314750CVl.LIZ && interfaceC1324680kZm != null && (interfaceC1324680kZm instanceof C1324660kZk) && !TextUtils.isEmpty(interfaceC1324680kZm.toString()) && interfaceC1324680kZm.toString().contains("resizeOption:")) {
            try {
                ConcurrentHashMap<String, String> concurrentHashMap = C314750CVl.LIZIZ;
                if (concurrentHashMap.size() > 1000) {
                    concurrentHashMap.clear();
                }
                C1324630kZh c1324630kZh = ((C1324660kZk) interfaceC1324680kZm).LIZIZ;
                if (c1324630kZh == null) {
                    return;
                }
                try {
                    strLIZ = interfaceC1324680kZm.toString().substring(0, interfaceC1324680kZm.toString().indexOf("resizeOption:"));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZ = interfaceC1324680kZm.LIZ();
                }
                C314750CVl.LIZIZ.put(strLIZ, c1324630kZh.toString());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("newDiskCacheVisitCount: Throwable = ");
                sbLIZ.append(th);
                C1328570kg3.LIZIZ("BitmapCacheUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
