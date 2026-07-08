package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138350fjF {
    public static final Map<Integer, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "anchor"), new Pair(1, "guest"), new Pair(2, "sender"), new Pair(3, "user"));

    public static boolean LJ() {
        AbstractC1273900jFs liveCore;
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        Integer numValueOf;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe == null || (liveCore = interfaceC769940UIe.getLiveCore()) == null || (interfaceC1268690j7TLJIJJLI = liveCore.LJIJJLI()) == null || (numValueOf = Integer.valueOf(interfaceC1268690j7TLJIJJLI.M3())) == null) {
            return false;
        }
        return numValueOf.intValue() == 2 || numValueOf.intValue() == 3;
    }

    public static void LIZ(Runnable runnable) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C01LW(runnable, null), 2);
    }

    public static Integer LIZIZ(Throwable th) {
        if (th instanceof C1140250fmJ) {
            return Integer.valueOf(((C1140250fmJ) th).getError().LIZ);
        }
        return null;
    }

    public static String LIZJ(Throwable th) {
        String simpleName;
        if (th instanceof C1140250fmJ) {
            C1140250fmJ c1140250fmJ = (C1140250fmJ) th;
            if (C500260Jjc.LJJIIZ(c1140250fmJ.getError().LIZIZ)) {
                return c1140250fmJ.getError().LIZIZ;
            }
        }
        if (th != null) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                if (th != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        if (th != null && (simpleName = th.getClass().getSimpleName()) != null) {
                            return simpleName;
                        }
                    } else {
                        return message;
                    }
                }
            } else {
                return localizedMessage;
            }
        }
        return "";
    }

    public static JSONArray LIZLLL(GiftMessage giftMessage) {
        JSONArray jSONArray = new JSONArray();
        if (giftMessage.LLILLL) {
            jSONArray.put(2);
        }
        if (C2640010k.LIZIZ()) {
            jSONArray.put(0);
            return jSONArray;
        }
        if (C1128450fTH.LJJIJ()) {
            jSONArray.put(1);
            return jSONArray;
        }
        jSONArray.put(3);
        return jSONArray;
    }

    public static void LJI(Runnable runnable) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C01MB(runnable, null), 2);
    }

    public static void LJII(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str != null && str.length() != 0) {
                C0VSJ c0vsj = new C0VSJ(str);
                if (c0vsj.exists()) {
                    c0vsj.setLastModified(System.currentTimeMillis());
                }
            }
        }
    }

    public static void LJFF(C1138600fje c1138600fje, String str) {
        if (c1138600fje != null) {
            if (c1138600fje.LIZLLL) {
                c1138600fje.LJIILJJIL.put(str, Long.valueOf(System.currentTimeMillis()));
            } else {
                c1138600fje.LJIILJJIL.put(str, Long.valueOf(C158B.LIZ()));
            }
        }
    }
}
