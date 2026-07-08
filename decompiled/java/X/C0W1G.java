package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0W1G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1G {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static InterfaceC794310VDx LJ;

    public static InterfaceC794310VDx LIZ() {
        if (LJ == null) {
            LJ = (InterfaceC794310VDx) C792590V7h.LIZ(InterfaceC794310VDx.class);
        }
        return LJ;
    }

    public static String LJ() throws Throwable {
        InterfaceC794310VDx interfaceC794310VDxLIZ = LIZ();
        String strD0 = "none";
        if (interfaceC794310VDxLIZ != null) {
            try {
                Enumeration<NetworkInterface> enumerationLIZ = interfaceC794310VDxLIZ.LIZ();
                while (enumerationLIZ.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = enumerationLIZ.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (name != null && (TextUtils.equals(name.toLowerCase(), "eth0") || TextUtils.equals(name.toLowerCase(), "wlan0"))) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if ((inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                                strD0 = C2204961BRm.d0(inetAddressNextElement, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null));
                            }
                        }
                    }
                }
            } catch (SocketException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strD0;
    }

    public static String LIZIZ(Context context) {
        context.getApplicationInfo();
        long jA4 = C786410Ut5.a4() / 1024;
        if (jA4 == -1) {
            return "UNSUPPORTED";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ((jA4 - LIZ) * 1000) / (jCurrentTimeMillis - LIZJ);
        LIZJ = jCurrentTimeMillis;
        LIZ = jA4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(j));
        sbLIZ.append(" KB/s");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<String> LIZJ(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (C2204961BRm.LJLLILLLL(C786410Ut5.z4(connectivityManager, network), new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)) == C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null))) {
                        Iterator<RouteInfo> it2 = C2204961BRm.LJLJJLL(connectivityManager, network, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)).getRoutes().iterator();
                        while (it2.hasNext()) {
                            InetAddress gateway = it2.next().getGateway();
                            if (gateway != null) {
                                arrayList.add(C2204961BRm.d0(gateway, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    public static List<String> LIZLLL(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (C2204961BRm.LJLLILLLL(C786410Ut5.z4(connectivityManager, network), new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)) == C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null))) {
                        Iterator it2 = C2204961BRm.LJLJLJ(C2204961BRm.LJLJJLL(connectivityManager, network, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)), new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C2204961BRm.d0((InetAddress) it2.next(), new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)));
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:81:0x008f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static java.lang.String LJFF(android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W1G.LJFF(android.content.Context):java.lang.String");
    }

    public static String LJI(Context context) {
        context.getApplicationInfo();
        long totalTxBytes = TrafficStats.getTotalTxBytes() / 1024;
        if (totalTxBytes == -1) {
            return "UNSUPPORTED";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ((totalTxBytes - LIZIZ) * 1000) / (jCurrentTimeMillis - LIZLLL);
        LIZLLL = jCurrentTimeMillis;
        LIZIZ = totalTxBytes;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(j));
        sbLIZ.append(" KB/s");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJII(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
                return false;
            }
            if (1 != C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static List<String> LJIIIIZZ(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            InetAddress[] inetAddressArrC0 = C2204961BRm.c0(str, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null));
            if (inetAddressArrC0 != null && inetAddressArrC0.length > 0) {
                for (InetAddress inetAddress : inetAddressArrC0) {
                    arrayList.add(C2204961BRm.d0(inetAddress, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw==", null)));
                }
            }
        } catch (UnknownHostException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(java.lang.String r7, org.json.JSONObject r8) throws java.lang.Throwable {
        /*
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r3 = 0
            r6 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            r2.<init>(r7)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            java.lang.String r0 = "dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+cg+2kaOArJL1QkSjRw=="
            r1.<init>(r0, r6)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            java.net.URLConnection r4 = X.C2204961BRm.e0(r2, r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L7d
            java.lang.String r0 = "GET"
            r4.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0 = 30000(0x7530, float:4.2039E-41)
            r4.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r4.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0 = 1
            r4.setDoInput(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r4.setDoOutput(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r4.setUseCaches(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r1 = "Charset"
            java.lang.String r0 = X.C2403709bP.LIZ     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r0 = "UTF-8"
            r4.setRequestProperty(r1, r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r2 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r0 = "statusCode"
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r1 = "header"
            java.util.Map r0 = r4.getHeaderFields()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            org.json.JSONObject r0 = X.C118000cc.LIZ(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r8.put(r7, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L58
            r3 = 1
        L58:
            r4.disconnect()
            return r3
        L5c:
            r0 = move-exception
            r6 = r4
            goto L7e
        L5f:
            r0 = move-exception
            r6 = r4
            goto L63
        L62:
            r0 = move-exception
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getMessage()     // Catch: org.json.JSONException -> L73 java.lang.Throwable -> L7d
            r8.put(r7, r0)     // Catch: org.json.JSONException -> L73 java.lang.Throwable -> L7d
            if (r6 == 0) goto L72
            r6.disconnect()
        L72:
            return r3
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L7c
            r6.disconnect()
        L7c:
            return r3
        L7d:
            r0 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L86
            r6.disconnect()
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W1G.LJIIIZ(java.lang.String, org.json.JSONObject):boolean");
    }
}
