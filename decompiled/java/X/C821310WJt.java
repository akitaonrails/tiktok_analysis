package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821310WJt {
    public static final C0WJW LIZ = new C0WJW();
    public static final Map<Integer, C821300WJs> LIZIZ = new ConcurrentHashMap();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static boolean LIZLLL = true;

    public static SsWsApp LIZ(C821320WJu c821320WJu) {
        Map<String, String> map = c821320WJu.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            if (entry != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) entry.getKey());
                sbLIZ.append("=");
                sbLIZ.append(Uri.encode((String) entry.getValue()));
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int i = c821320WJu.LJII;
        if (i > 0) {
            String str = c821320WJu.LIZIZ;
            if (!C2093608Ic.LJ(str)) {
                String str2 = c821320WJu.LIZJ;
                if (!C2093608Ic.LJ(str2)) {
                    int i2 = c821320WJu.LJI;
                    if (i2 > 0) {
                        String str3 = c821320WJu.LJIIIIZZ;
                        if (!C2093608Ic.LJ(str3)) {
                            int i3 = c821320WJu.LJIIIZ;
                            if (i3 > 0) {
                                int i4 = c821320WJu.LIZ;
                                if (i4 > 0) {
                                    int typeValue = c821320WJu.LJIILIIL.getTypeValue();
                                    C821330WJv c821330WJv = new C821330WJv();
                                    c821330WJv.LIZ = i;
                                    c821330WJv.LIZIZ = str;
                                    c821330WJv.LIZJ = str2;
                                    c821330WJv.LJFF = i2;
                                    c821330WJv.LJI = str3;
                                    c821330WJv.LJIIIZ = c821320WJu.LJFF;
                                    c821330WJv.LIZLLL = i3;
                                    c821330WJv.LJ = 0;
                                    c821330WJv.LJIIIIZZ = i4;
                                    c821330WJv.LJIIJ = c821320WJu.LJ;
                                    c821330WJv.LJII = TextUtils.join("&", arrayList.toArray());
                                    c821330WJv.LJIIJJI = c821320WJu.LJIIJ;
                                    c821330WJv.LJIIL = c821320WJu.LJIIJJI;
                                    c821330WJv.LJIILIIL = c821320WJu.LJIIL;
                                    c821330WJv.LJIILJJIL = typeValue;
                                    c821330WJv.LJIILL = c821320WJu.LJIILJJIL;
                                    return new SsWsApp(c821330WJv.LJIIIIZZ, c821330WJv.LIZ, c821330WJv.LIZIZ, c821330WJv.LIZJ, c821330WJv.LJIIIZ, c821330WJv.LIZLLL, c821330WJv.LJ, c821330WJv.LJFF, c821330WJv.LJI, c821330WJv.LJII, c821330WJv.LJIIJJI, c821330WJv.LJIIL, c821330WJv.LJIILIIL, c821330WJv.LJIILJJIL, c821330WJv.LJIILL, c821330WJv);
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    public static C821300WJs LIZIZ(int i) {
        return (C821300WJs) ((ConcurrentHashMap) LIZIZ).get(Integer.valueOf(i));
    }

    public static C821300WJs LIZJ(Context context, C821320WJu c821320WJu, InterfaceC810750VrF interfaceC810750VrF) {
        Context contextN3 = C786410Ut5.N3(context);
        Context contextN32 = C786410Ut5.N3(contextN3);
        if (LIZJ.compareAndSet(false, true)) {
            if (LIZLLL) {
                C0WJW.LJ(2, contextN32);
            } else {
                C0WJW.LJ(1, contextN32);
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                C786410Ut5.LJIJJ(contextN32, new C807690VmJ(contextN32, C0WK4.LIZIZ(contextN32)), intentFilter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C821300WJs c821300WJs = new C821300WJs(C786410Ut5.N3(contextN3), c821320WJu, interfaceC810750VrF);
        ((ConcurrentHashMap) LIZIZ).put(Integer.valueOf(c821320WJu.LIZ), c821300WJs);
        c821300WJs.LIZJ.LIZ(c821300WJs.LIZLLL, c821300WJs.LJ);
        return c821300WJs;
    }
}
