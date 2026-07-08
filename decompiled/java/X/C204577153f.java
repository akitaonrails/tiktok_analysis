package X;

import Y.ARunnableS19S1000000_31;
import android.app.Activity;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.153f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204577153f extends AbstractRunnableC20737316Ct {
    public static Activity LJJJJI() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                return null;
            }
            for (Object obj2 : map.values()) {
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    Object obj3 = declaredField2.get(obj2);
                    Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                    if (!(bool != null ? bool.booleanValue() : true)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        Object obj4 = declaredField3.get(obj2);
                        if (obj4 instanceof Activity) {
                            return (Activity) obj4;
                        }
                        return null;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJ(Exception exc) {
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIIJI(String str, InterfaceC204578153g interfaceC204578153g) {
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIL() {
    }

    public C204577153f() {
        super(new InetSocketAddress(42690));
        this.LLILLL = true;
    }

    public static String LJJJJ(SocketAddress socketAddress) {
        String strD0;
        InetAddress address = ((InetSocketAddress) socketAddress).getAddress();
        if (address == null || (strD0 = C2204961BRm.d0(address, new C0WZX("cDp8SQUuUMXQG1AoQwaVc1JNczzcFo2vfJucB4ek44+p49k=", null))) == null) {
            String hostString = ((InetSocketAddress) socketAddress).getHostString();
            if (hostString == null) {
                return socketAddress.toString();
            }
            return hostString;
        }
        return strD0;
    }

    public final void LJJJJIZL(String str) {
        Collection<InterfaceC204578153g> collectionLJIJJ = LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionLJIJJ) {
            if (((InterfaceC204578153g) obj).isOpen()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC204578153g) it2.next()).LIZ(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIIZI(InterfaceC204578153g interfaceC204578153g, String str) {
        String strLJJJJ;
        if (interfaceC204578153g != null) {
            InetSocketAddress inetSocketAddressLIZLLL = interfaceC204578153g.LIZLLL();
            if (inetSocketAddressLIZLLL == null || (strLJJJJ = LJJJJ(inetSocketAddressLIZLLL)) == null) {
                strLJJJJ = "unknown";
            }
            C473410IhP.LIZIZ(new RunnableC514701zV(strLJJJJ, 3));
        }
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIIJIL(InterfaceC204578153g interfaceC204578153g, C16DX c16dx) throws JSONException {
        Map<String, String> mapLJ;
        String strLJJJJ;
        Object objValueOf;
        int port;
        ServerSocketChannel serverSocketChannel;
        String strLJJJJ2;
        String strLJJJJ3;
        InterfaceC1100860ekm interfaceC1100860ekmSg;
        if (interfaceC204578153g == null) {
            return;
        }
        String strLJ = c16dx.LJ("Upgrade");
        if (strLJ != null && strLJ.length() != 0 && u.LJIJI(strLJ, "websocket", true)) {
            IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
            if (iDebugService != null && (interfaceC1100860ekmSg = iDebugService.Sg()) != null) {
                C1133970fcB c1133970fcB = (C1133970fcB) interfaceC1100860ekmSg;
                InterfaceC1125480fOU interfaceC1125480fOU = c1133970fcB.LIZIZ;
                if (interfaceC1125480fOU == null || (mapLJ = interfaceC1125480fOU.LIZ(c1133970fcB.LIZ)) == null) {
                    mapLJ = new LinkedHashMap<>();
                }
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "room_info");
            String str = mapLJ.get("RoomId");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            String str3 = mapLJ.get("AnchorId");
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("anchor_id", str3);
            String str4 = mapLJ.get("UserId");
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("user_id", str4);
            InetSocketAddress inetSocketAddressLIZLLL = interfaceC204578153g.LIZLLL();
            if (inetSocketAddressLIZLLL == null || (strLJJJJ = LJJJJ(inetSocketAddressLIZLLL)) == null) {
                strLJJJJ = "";
            }
            jSONObject.put("client_ip", strLJJJJ);
            InetSocketAddress inetSocketAddressLIZLLL2 = interfaceC204578153g.LIZLLL();
            if (inetSocketAddressLIZLLL2 != null) {
                objValueOf = Integer.valueOf(inetSocketAddressLIZLLL2.getPort());
            } else {
                objValueOf = JSONObject.NULL;
            }
            jSONObject.put("client_port", objValueOf);
            InetSocketAddress inetSocketAddressLJIILJJIL = interfaceC204578153g.LJIILJJIL();
            if (inetSocketAddressLJIILJJIL != null && (strLJJJJ3 = LJJJJ(inetSocketAddressLJIILJJIL)) != null) {
                str2 = strLJJJJ3;
            }
            jSONObject.put("server_ip", str2);
            InetSocketAddress inetSocketAddressLJIILJJIL2 = interfaceC204578153g.LJIILJJIL();
            if (inetSocketAddressLJIILJJIL2 != null) {
                port = inetSocketAddressLJIILJJIL2.getPort();
            } else {
                port = this.LLJIJIL.getPort();
                if (port == 0 && (serverSocketChannel = this.LLJILJIL) != null) {
                    port = serverSocketChannel.socket().getLocalPort();
                }
            }
            jSONObject.put("server_port", port);
            jSONObject.put("type", "room_info");
            jSONObject.put("protocol_version", BuildConfig.VERSION_NAME);
            try {
                interfaceC204578153g.LIZ(C786410Ut5.J3(jSONObject));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            InetSocketAddress inetSocketAddressLIZLLL3 = interfaceC204578153g.LIZLLL();
            if (inetSocketAddressLIZLLL3 == null || (strLJJJJ2 = LJJJJ(inetSocketAddressLIZLLL3)) == null) {
                strLJJJJ2 = "unknown";
            }
            C473410IhP.LIZIZ(new ARunnableS19S1000000_31(strLJJJJ2, 1));
            return;
        }
        interfaceC204578153g.close();
    }
}
