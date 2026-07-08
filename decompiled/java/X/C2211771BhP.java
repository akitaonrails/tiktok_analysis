package X;

import Y.ARunnableS9S1100000_3;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211771BhP {
    public static void LIZ(C2211761BhO c2211761BhO, C2211821BhU c2211821BhU) {
        String eventName = c2211761BhO.getEventName();
        if (eventName != null) {
            C13E8<String> c13e8 = C1391850mK7.LIZ;
            String str = c2211821BhU.LIZ;
            HashMap map = new HashMap(c2211761BhO.getParams());
            map.put("btm", str);
            C823050WQl.LIZLLL().submit(new ARunnableS9S1100000_3(map, eventName, 19));
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commit event:");
        sbLIZ.append(c2211761BhO.getEventName());
        sbLIZ.append(",btm: ");
        sbLIZ.append(c2211821BhU.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = c2211761BhO.getViewRef().get();
        String str2 = c2211821BhU.LIZ;
        Iterator it2 = ((HashSet) C2211861BhY.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211931Bhf) it2.next()).LIZ(view, str2);
        }
        InterfaceC2211931Bhf onExposeCallback = c2211761BhO.getOnExposeCallback();
        if (onExposeCallback != null) {
            onExposeCallback.LIZ(c2211761BhO.getViewRef().get(), c2211821BhU.LIZ);
        }
        InterfaceC2211901Bhc onExposeWithPivCallback = c2211761BhO.getOnExposeWithPivCallback();
        if (onExposeWithPivCallback != null) {
            onExposeWithPivCallback.LIZ(c2211761BhO.getViewRef().get(), c2211821BhU.LIZ, c2211761BhO.getCurrentPiv());
        }
    }

    public static void LIZIZ(EnumC2211831BhV enumC2211831BhV, C2211821BhU c2211821BhU, C2211761BhO c2211761BhO) {
        int i = C2211801BhS.LIZIZ[enumC2211831BhV.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = C2211801BhS.LIZ[c2211821BhU.LIZIZ.ordinal()];
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (c2211821BhU.LJ || c2211821BhU.LJIIJ) {
                            c2211821BhU.LIZIZ = EnumC2211851BhX.DEF;
                            c2211821BhU.LJIIJ = false;
                            c2211821BhU.LJIIIZ = true;
                        }
                        if (c2211821BhU.LJIIIZ) {
                            c2211821BhU.LJIIIZ = false;
                            InterfaceC2211921Bhe onDismissCallback = c2211761BhO.getOnDismissCallback();
                            if (onDismissCallback != null) {
                                onDismissCallback.LIZ(System.currentTimeMillis() - c2211821BhU.LIZJ);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (System.currentTimeMillis() - c2211821BhU.LIZJ >= c2211821BhU.LJI) {
                    c2211821BhU.LIZIZ = EnumC2211851BhX.DONE;
                    LIZ(c2211761BhO, c2211821BhU);
                    return;
                } else {
                    c2211821BhU.LIZIZ = EnumC2211851BhX.DEF;
                    return;
                }
            }
            return;
        }
        int i3 = C2211801BhS.LIZ[c2211821BhU.LIZIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 || System.currentTimeMillis() - c2211821BhU.LIZJ < c2211821BhU.LJI) {
                return;
            }
            c2211821BhU.LIZIZ = EnumC2211851BhX.DONE;
            LIZ(c2211761BhO, c2211821BhU);
            return;
        }
        if (c2211821BhU.LJI == 0) {
            c2211821BhU.LIZIZ = EnumC2211851BhX.DONE;
            LIZ(c2211761BhO, c2211821BhU);
        } else {
            c2211821BhU.LIZIZ = EnumC2211851BhX.SHOWING;
        }
        c2211821BhU.LIZJ = System.currentTimeMillis();
    }
}
