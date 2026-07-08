package X;

import android.content.Context;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.Control;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898590zVR extends C1619110sEf implements InterfaceC19330810jy {
    public static boolean LLILLJJLI;
    public static final C1898590zVR LL = new C1898590zVR();
    public static final int[] LLILLL = {23};

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return LLILLL;
    }

    public static InAppPush LJIILIIL(InnerPushMessage innerPushMessage) {
        Object obj;
        Map<String, Object> extrasMap;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("UGPushHandler");
        } else {
            obj = null;
        }
        if (!(obj instanceof InAppPush)) {
            return null;
        }
        return (InAppPush) obj;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJJI(InnerPushMessage innerPushMessage) {
        LJIILIIL(innerPushMessage);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        Integer numValueOf;
        String str;
        InAppPush inAppPushLJIILIIL = LJIILIIL(innerPushMessage);
        if (inAppPushLJIILIIL != null) {
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            if (C1723230uwb.LIZJ(inAppPushLJIILIIL.LIZIZ)) {
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                int i2 = inAppPushLJIILIIL.LIZ;
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("click_position", "ok");
                Control control = inAppPushLJIILIIL.control;
                if (control != null) {
                    numValueOf = Integer.valueOf(control.type);
                } else {
                    numValueOf = null;
                }
                pairArr[1] = new Pair("sub_type", String.valueOf(numValueOf));
                Control control2 = inAppPushLJIILIIL.control;
                if (control2 == null || (str = control2.taskName) == null) {
                    str = "";
                }
                pairArr[2] = new Pair("task_key", str);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                Integer num = inAppPushLJIILIIL.LIZJ;
                c1894320zOY.getClass();
                C1894320zOY.LJIILJJIL(i2, mapLJIIJ, num, null, null);
            }
            String str2 = inAppPushLJIILIIL.jumpLink;
            if (str2 != null) {
                C1893580zNM c1893580zNM = C1893580zNM.LIZ;
                Integer numValueOf2 = Integer.valueOf(inAppPushLJIILIIL.LIZ);
                String str3 = inAppPushLJIILIIL.LIZIZ;
                if (str3 == null) {
                    str3 = "InAppPush";
                }
                C1893580zNM.LJ(c1893580zNM, contextLJFF, numValueOf2, str2, str3, false, inAppPushLJIILIIL.LJ, null, null, 192);
            }
        }
        LLILLJJLI = true;
        if (innerPushMessage != null) {
            C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", i);
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        Integer numValueOf;
        String str;
        InAppPush inAppPushLJIILIIL = LJIILIIL(innerPushMessage);
        if (inAppPushLJIILIIL != null && C1723230uwb.LIZJ(inAppPushLJIILIIL.LIZIZ)) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i = inAppPushLJIILIIL.LIZ;
            Pair[] pairArr = new Pair[2];
            Control control = inAppPushLJIILIIL.control;
            if (control != null) {
                numValueOf = Integer.valueOf(control.type);
            } else {
                numValueOf = null;
            }
            pairArr[0] = new Pair("sub_type", String.valueOf(numValueOf));
            Control control2 = inAppPushLJIILIIL.control;
            if (control2 != null) {
                str = control2.taskName;
            } else {
                str = null;
            }
            pairArr[1] = new Pair("task_key", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Integer num = inAppPushLJIILIIL.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i, mapLJIIJ, num, null, null, "");
        }
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        final InAppPush inAppPushLJIILIIL = LJIILIIL(innerPushMessage);
        if (inAppPushLJIILIIL != null) {
            final boolean z2 = LLILLJJLI;
            C15O7.LIZJ(new Callable() { // from class: X.0zSO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C15O7<String> c15o7RequestOnPopupClick;
                    INetworkApi iNetworkApiLIZJ;
                    C1C7U.LIZ("InAppPushUtils@47f6.notifyDismiss4Server$1");
                    InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                    if (interfaceC1897260zTILIZIZ == null || (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) == null) {
                        c15o7RequestOnPopupClick = null;
                    } else {
                        Integer num = inAppPushLJIILIIL.inAppPushId;
                        c15o7RequestOnPopupClick = iNetworkApiLIZJ.requestOnPopupClick(num != null ? num.intValue() : 0, !z2 ? 1 : 0);
                    }
                    C1C7U.LIZIZ("InAppPushUtils@47f6.notifyDismiss4Server$1");
                    return c15o7RequestOnPopupClick;
                }
            });
        }
        LLILLJJLI = false;
    }
}
