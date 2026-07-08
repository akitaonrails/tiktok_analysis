package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.017w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2834017w {
    public static final Keva LIZ = Keva.getRepo("drawer_live_search_history");
    public static final List<String> LIZIZ = new ArrayList();
    public static volatile boolean LIZJ;

    public static final List<String> LIZ() {
        Object c098200Yq;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf = interfaceC500940JkiUser != null ? Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()) : null;
        if (lValueOf == null) {
            return null;
        }
        lValueOf.longValue();
        String string = lValueOf.toString();
        if (string != null && !LIZJ) {
            boolean z = true;
            LIZJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_live_history_");
            sbLIZ.append(string);
            String string2 = LIZ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            if (string2 != null && !a0.LJJJIL(string2)) {
                z = false;
            }
            if (!z) {
                try {
                    c098200Yq = (List) C19748512Ol.LIZIZ.LJIIIIZZ(string2, new TypeToken<List<? extends String>>() { // from class: X.017x
                    }.getType());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                List list = (List) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) LIZIZ).add(it2.next());
                    }
                }
            }
        }
        return LIZIZ;
    }

    public static final void LIZIZ(String str) {
        Long lValueOf;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId())) != null) {
            lValueOf.longValue();
            if (str != null && !a0.LJJJIL(str)) {
                ArrayList arrayList = (ArrayList) LIZIZ;
                if (!arrayList.contains(str)) {
                    return;
                }
                arrayList.remove(str);
                LIZJ(lValueOf.toString());
            }
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_live_history_");
        sbLIZ.append(str);
        LIZ.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, LIZIZ));
    }
}
