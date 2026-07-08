package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039520d9q {
    public final InterfaceC1039600d9y LIZ;
    public volatile String LIZIZ = C08HX.LJIIIIZZ();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final Map<EnumC1039530d9r, String> LIZLLL;

    public C1039520d9q(C1039510d9p c1039510d9p) {
        this.LIZ = c1039510d9p;
        InterfaceC2044707zh<EnumC1039530d9r> entries = EnumC1039530d9r.getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        Iterator<EnumC1039530d9r> it2 = entries.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), "");
        }
        this.LIZLLL = new ConcurrentHashMap(linkedHashMap);
    }

    public final void LIZ(String str, EnumC1039530d9r enumC1039530d9r, WebView webView) {
        if (str == null || webView == null) {
            return;
        }
        try {
            ((ConcurrentHashMap) this.LIZLLL).put(enumC1039530d9r, str);
            for (EnumC1039530d9r enumC1039530d9r2 : ((ConcurrentHashMap) this.LIZLLL).keySet()) {
                if (enumC1039530d9r2 != enumC1039530d9r) {
                    String str2 = (String) ((ConcurrentHashMap) this.LIZLLL).get(enumC1039530d9r2);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str2.length() != 0 && Intrinsics.LJFF(str2, str)) {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "iab_url_loading_filter");
        }
        if (this.LIZJ.get()) {
            this.LIZIZ = C08HX.LJIIIIZZ();
        } else {
            this.LIZJ.set(true);
        }
        this.LIZ.LIZ(str, enumC1039530d9r, this.LIZIZ, webView);
    }
}
