package X;

import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0517, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0517 {
    public static final String LIZ(String str, String str2) {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI(str, str2);
        ArrayList arrayList = new ArrayList();
        for (String str3 : listLJIIJJI) {
            if (str3 != null && (!a0.LJJJIL(str3))) {
                arrayList.add(str3);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62);
        if (!(true ^ a0.LJJJIL(strLJJLIIIJ))) {
            return null;
        }
        return strLJJLIIIJ;
    }

    public static final String LIZIZ(n nVar, String str) {
        String strLJIL;
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null || !(!(kVarLJJIIZ instanceof m)) || (strLJIL = kVarLJJIIZ.LJIL()) == null || !(!a0.LJJJIL(strLJIL))) {
            return null;
        }
        return strLJIL;
    }
}
