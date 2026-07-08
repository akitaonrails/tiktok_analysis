package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378370lyN {
    public static final C1378370lyN LIZ = new C1378370lyN();
    public static final Map<Integer, InterfaceC1365770le3> LIZIZ = new LinkedHashMap();
    public static final Set<WeakReference<AbstractC1389950mH3>> LIZJ = new LinkedHashSet();

    public static void LIZ() {
        Iterator<WeakReference<AbstractC1389950mH3>> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            AbstractC1389950mH3 abstractC1389950mH3 = it2.next().get();
            if (abstractC1389950mH3 != null) {
                abstractC1389950mH3.LLILLJJLI.LIZ().LJI = false;
                abstractC1389950mH3.dismiss();
            }
        }
        LIZJ.clear();
    }

    public static void LIZIZ(Object obj) {
        Iterator it2 = ((LinkedHashMap) LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1365770le3 interfaceC1365770le3 = (InterfaceC1365770le3) ((Map.Entry) it2.next()).getValue();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1389920mH0 c1389920mH0LIZ = interfaceC1365770le3.LIZ();
            Long l = c1389920mH0LIZ.LIZ;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0 && jElapsedRealtime < jLongValue) {
                    c1389920mH0LIZ.LJFF = false;
                    c1389920mH0LIZ.LJ = jLongValue - jElapsedRealtime;
                    if (obj instanceof Activity) {
                        if (interfaceC1365770le3 instanceof C1383230m6D) {
                            C1389890mGx c1389890mGx = new C1389890mGx((Activity) obj);
                            c1389890mGx.LIZ = (C1383230m6D) interfaceC1365770le3;
                            c1389890mGx.LJIIJJI();
                        } else if (interfaceC1365770le3 instanceof C1360890lWB) {
                            C1389910mGz c1389910mGz = new C1389910mGz((Activity) obj);
                            c1389910mGz.LIZ = (C1360890lWB) interfaceC1365770le3;
                            c1389910mGz.LJIIJJI();
                        } else if (interfaceC1365770le3 instanceof C1361790lXd) {
                            C1389880mGw c1389880mGw = new C1389880mGw((Activity) obj);
                            c1389880mGw.LIZ = (C1361790lXd) interfaceC1365770le3;
                            c1389880mGw.LJIIJ();
                        }
                    } else if (obj instanceof Dialog) {
                        if (interfaceC1365770le3 instanceof C1383230m6D) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx((Dialog) obj);
                            c1389890mGx2.LIZ = (C1383230m6D) interfaceC1365770le3;
                            c1389890mGx2.LJIIJJI();
                        } else if (interfaceC1365770le3 instanceof C1360890lWB) {
                            C1389910mGz c1389910mGz2 = new C1389910mGz((Dialog) obj);
                            c1389910mGz2.LIZ = (C1360890lWB) interfaceC1365770le3;
                            c1389910mGz2.LJIIJJI();
                        } else if (interfaceC1365770le3 instanceof C1361790lXd) {
                            C1389880mGw c1389880mGw2 = new C1389880mGw((Dialog) obj);
                            c1389880mGw2.LIZ = (C1361790lXd) interfaceC1365770le3;
                            c1389880mGw2.LJIIJ();
                        }
                    }
                }
            }
            it2.remove();
        }
    }

    public static void LIZJ(AbstractC1389950mH3 abstractC1389950mH3) {
        LIZJ.add(new WeakReference<>(abstractC1389950mH3));
        InterfaceC1365770le3 interfaceC1365770le3 = abstractC1389950mH3.LLILLJJLI;
        LIZIZ.put(Integer.valueOf(interfaceC1365770le3.LIZ().LJIIIIZZ), interfaceC1365770le3);
    }
}
