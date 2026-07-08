package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436760nUY {
    public static final Keva LIZ = Keva.getRepo("TOOL_MODERATION_SAVE_LOCAL");
    public static final List<C1436800nUc> LIZIZ = new ArrayList();
    public static final Gson LIZJ = new Gson();

    public static void LIZIZ() {
        try {
            LIZ.storeString("item_list", LIZJ.LJIILL(LIZIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(String str, String str2) {
        Object next;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1436800nUc) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1436800nUc c1436800nUc = (C1436800nUc) next;
        if (c1436800nUc != null) {
            c1436800nUc.LIZIZ = str2;
        } else {
            ((ArrayList) LIZIZ).add(new C1436800nUc(str, str2));
        }
        LIZIZ();
    }
}
