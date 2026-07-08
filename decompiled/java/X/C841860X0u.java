package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.model.UnexpectedNetworkMonitorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0X0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841860X0u implements InterfaceC841900X0y, InterfaceC841910X0z, C0X0V, C0X10, C0X11 {
    public static final C01GW<Boolean> LIZ = C452501pT.LIZIZ(new C794570VEx());
    public static final Object LIZIZ = new Object();
    public static final C841860X0u LIZJ = new C841860X0u();
    public static final CopyOnWriteArrayList<C0X0V> LIZLLL = new CopyOnWriteArrayList<>();

    static {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0X0t
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0X0s
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NetWorkMonitorManager$Companion@30b1.addUnexpectedNetworkMonitor$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NetWorkMonitorManager$Companion@30b1.addUnexpectedNetworkMonitor$1$1");
                    }

                    public static void LIZ() {
                        System.currentTimeMillis();
                        try {
                            SettingsManager.LIZLLL().getClass();
                            String strLJI = SettingsManager.LJI("unexpected_network_monitor_config", "");
                            if (!a0.LJJJIL(strLJI)) {
                                UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig = (UnexpectedNetworkMonitorConfig) C08JS.LIZ(strLJI, UnexpectedNetworkMonitorConfig.class);
                                C01GW<Boolean> c01gw = C841860X0u.LIZ;
                                List listLIZIZ = C841830X0r.LIZIZ(unexpectedNetworkMonitorConfig != null ? unexpectedNetworkMonitorConfig.urls : null);
                                List listLIZIZ2 = C841830X0r.LIZIZ(unexpectedNetworkMonitorConfig != null ? unexpectedNetworkMonitorConfig.responses : null);
                                synchronized (C841860X0u.LIZIZ) {
                                    try {
                                        CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = C841860X0u.LIZLLL;
                                        ArrayList arrayList = new ArrayList();
                                        for (C0X0V c0x0v : copyOnWriteArrayList) {
                                            if (c0x0v instanceof C841790X0n) {
                                                arrayList.add(c0x0v);
                                            }
                                        }
                                        C841860X0u.LIZLLL.removeAll(arrayList);
                                        if ((!listLIZIZ.isEmpty()) || (!listLIZIZ2.isEmpty())) {
                                            C841830X0r.LIZ(new C841790X0n(listLIZIZ, listLIZIZ2));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                            C01GW<Boolean> c01gw2 = C841860X0u.LIZ;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C01GW<Boolean> c01gw3 = C841860X0u.LIZ;
                            C841830X0r.LIZLLL(null, "addUnexpectedNetworkMonitor", e);
                        }
                        System.currentTimeMillis();
                    }
                });
            }
        });
    }

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LIZ(C841880X0w<Request, C0XLY> c841880X0w) {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C841830X0r.LIZLLL(c841880X0w.LIZIZ.LL.url().LJIIIIZZ, "onAfterOkHttp", e);
        }
        if (C841830X0r.LIZJ() && C303780BvU.LIZ().enableOkHttpMonitor) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof InterfaceC841910X0z) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((InterfaceC841910X0z) it2.next()).LIZ(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LIZIZ(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        String url;
        String url2 = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBeforeTTNet\n");
            com.bytedance.retrofit2.client.Request request = c841880X0w.LIZ;
            if (request != null) {
                url = request.getUrl();
            } else {
                url = null;
            }
            sbLIZ.append(url);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            com.bytedance.retrofit2.client.Request request2 = c841880X0w.LIZ;
            if (request2 != null) {
                url2 = request2.getUrl();
            }
            C841830X0r.LIZLLL(url2, "onBeforeTTNet", e);
        }
        if (C841830X0r.LIZJ() && C303780BvU.LIZ().enableTTNetMonitor) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof InterfaceC841900X0y) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((InterfaceC841900X0y) it2.next()).LIZIZ(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }

    @Override // X.C0X11
    public final C841880X0w<C0V61, Boolean> LIZJ(C841880X0w<C0V61, Boolean> c841880X0w) {
        String str;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C0V61 c0v61 = c841880X0w.LIZ;
            String str2 = null;
            if (c0v61 != null) {
                str = c0v61.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append('/');
            C0V61 c0v612 = c841880X0w.LIZ;
            if (c0v612 != null) {
                str2 = c0v612.LIZIZ;
            }
            sbLIZ.append(str2);
            C841830X0r.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "onCommonLog", e);
        }
        if (C841830X0r.LIZJ() && C0X15.LIZ().enable) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof C0X11) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((C0X11) it2.next()).LIZJ(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }

    @Override // X.C0X10
    public final C841880X0w<C0X14, Boolean> LIZLLL(C841880X0w<C0X14, Boolean> c841880X0w) {
        String str;
        String str2;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C0X14 c0x14 = c841880X0w.LIZ;
            String str3 = null;
            if (c0x14 != null) {
                str = c0x14.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append('/');
            C0X14 c0x142 = c841880X0w.LIZ;
            if (c0x142 != null) {
                str2 = c0x142.LIZIZ;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append('/');
            C0X14 c0x143 = c841880X0w.LIZ;
            if (c0x143 != null) {
                str3 = c0x143.LIZIZ;
            }
            sbLIZ.append(str3);
            C841830X0r.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "onAppLog", e);
        }
        if (C841830X0r.LIZJ() && C0X15.LIZ().enable) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof C0X10) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((C0X10) it2.next()).LIZLLL(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LJFF(C841880X0w<Request, C0XLY> c841880X0w) {
        C0XLQ c0xlqUrl;
        String str;
        C0XLQ c0xlqUrl2;
        String str2 = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBeforeOkHttp\n");
            Request request = c841880X0w.LIZ;
            if (request != null && (c0xlqUrl2 = request.url()) != null) {
                str = c0xlqUrl2.LJIIIIZZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Request request2 = c841880X0w.LIZ;
            if (request2 != null && (c0xlqUrl = request2.url()) != null) {
                str2 = c0xlqUrl.LJIIIIZZ;
            }
            C841830X0r.LIZLLL(str2, "onBeforeOkHttp", e);
        }
        if (C841830X0r.LIZJ() && C303780BvU.LIZ().enableOkHttpMonitor) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof InterfaceC841910X0z) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((InterfaceC841910X0z) it2.next()).LJFF(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LJI(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        String url;
        String url2 = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAfterTTNet\n");
            com.bytedance.retrofit2.client.Request request = c841880X0w.LIZ;
            if (request != null) {
                url = request.getUrl();
            } else {
                url = null;
            }
            sbLIZ.append(url);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            com.bytedance.retrofit2.client.Request request2 = c841880X0w.LIZ;
            if (request2 != null) {
                url2 = request2.getUrl();
            }
            C841830X0r.LIZLLL(url2, "onAfterTTNet", e);
        }
        if (C841830X0r.LIZJ() && C303780BvU.LIZ().enableTTNetMonitor) {
            CopyOnWriteArrayList<C0X0V> copyOnWriteArrayList = LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C0X0V c0x0v : copyOnWriteArrayList) {
                if (c0x0v instanceof InterfaceC841900X0y) {
                    arrayList.add(c0x0v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c841880X0w = ((InterfaceC841900X0y) it2.next()).LJI(c841880X0w);
                EnumC841890X0x enumC841890X0x = c841880X0w.LIZLLL;
                if (enumC841890X0x == EnumC841890X0x.INTERCEPT || enumC841890X0x == EnumC841890X0x.EXCEPTION) {
                }
            }
            return c841880X0w;
        }
        return c841880X0w;
    }
}
