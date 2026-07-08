package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.00pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C197300pP {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, List list) {
        List listLJJLIIIJ;
        String string = "[]";
        try {
            if (C123100dR.LIZ(str)) {
                listLJJLIIIJ = C13BV.INSTANCE;
                try {
                    listLJJLIIIJ = a0.LJJLIIIJ(a0.LJLIIIL(str).toString().substring(1, str.length() - 1), new char[]{','}, false, 0, 6);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else {
                listLJJLIIIJ = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (listLJJLIIIJ.contains(String.valueOf(iIntValue))) {
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                }
            }
            if (!(!arrayList.isEmpty())) {
                return "[]";
            }
            string = new JSONArray((Collection) arrayList).toString();
            return string;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
            if (str == null) {
                return string;
            }
            return str;
        }
    }
}
