package X;

import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BF5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BF5 {
    public static final /* synthetic */ int LIZ = 0;

    public static C2209901BeO LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C2209901BeO c2209901BeO : (CopyOnWriteArrayList) C2209901BeO.LJLILLLLZI) {
            if (str.equals(c2209901BeO.LJIIIZ)) {
                return c2209901BeO;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BF6] */
    public static boolean LIZJ(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ?? r2 = new Object() { // from class: X.1BF6
            public final boolean LIZ(C2209901BeO c2209901BeO) {
                return str.equals(c2209901BeO.LJIIIZ);
            }
        };
        Iterator it2 = ((CopyOnWriteArrayList) C2209901BeO.LJLILLLLZI).iterator();
        while (it2.hasNext()) {
            if (r2.LIZ((C2209901BeO) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(InterfaceC2210301Bf2 interfaceC2210301Bf2, String str) {
        if (AppLog.getInstance() != interfaceC2210301Bf2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_");
            sbLIZ.append(interfaceC2210301Bf2.getAppId());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
