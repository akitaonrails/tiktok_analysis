package X;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0jcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287750jcD implements InterfaceC1542530qF9 {
    public final String LIZIZ;
    public final Set<InterfaceC1287060jb6> LIZJ = new HashSet();
    public boolean LIZLLL = false;
    public final Map<String, Object> LJ = new HashMap();
    public WeakReference<WebView> LJFF = null;

    @Override // X.InterfaceC1542530qF9
    public final void release() {
        C1287700jc8.LIZJ(new RunnableC1287740jcC(this));
    }

    public C1287750jcD(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(String str, int i) {
        LIZIZ(str, i, "");
    }

    public final void LIZJ(final EnumC1287770jcF enumC1287770jcF, final Object obj) {
        C1287700jc8.LIZJ(new Runnable() { // from class: X.0jcE
            @Override // java.lang.Runnable
            public final void run() {
                C1287750jcD c1287750jcD = this.LL;
                EnumC1287770jcF enumC1287770jcF2 = enumC1287770jcF;
                Object obj2 = obj;
                c1287750jcD.getClass();
                C1C7U.LIZ("PiaMetrics@8663.onPvEvent$1L");
                ((HashMap) c1287750jcD.LJ).put(enumC1287770jcF2.getValue(), obj2);
                C1C7U.LIZIZ("PiaMetrics@8663.onPvEvent$1L");
            }
        });
    }

    public final void LIZIZ(final String str, final int i, final String str2) {
        C1287700jc8.LIZJ(new Runnable() { // from class: X.0jcB
            @Override // java.lang.Runnable
            public final void run() {
                C1287750jcD c1287750jcD = this.LL;
                String str3 = str;
                int i2 = i;
                String str4 = str2;
                c1287750jcD.getClass();
                C1C7U.LIZ("PiaMetrics@8663.onError$1L");
                HashMap map = new HashMap();
                map.put("error_from", "client");
                map.put("error_type", str3);
                map.put("error_code", Integer.valueOf(i2));
                map.put("error_detail", str4);
                map.put("url", c1287750jcD.LIZIZ);
                map.put("pia_sdk_version", "2.5.3");
                C1287700jc8.LIZJ(new RunnableC1287660jc4(c1287750jcD, EnumC1287080jb8.EXCEPTION, map));
                C1C7U.LIZIZ("PiaMetrics@8663.onError$1L");
            }
        });
    }
}
