package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0QCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666580QCq {
    public static final Map<String, Set<C666650QCx>> LIZ = new HashMap();
    public static int LIZIZ;

    public static final Map<String, String> LIZ(Aweme aweme, String str, String str2) {
        return LIZIZ(aweme, str, str2, null);
    }

    public static final Map<String, String> LIZIZ(Aweme aweme, String str, String str2, InterfaceC631150OpF interfaceC631150OpF) {
        String str3;
        HashMap map = new HashMap();
        Set set = (Set) ((HashMap) LIZ).get(str);
        if (set != null) {
            ArrayList<C666650QCx> arrayList = new ArrayList();
            for (Object obj : set) {
                if (((C666650QCx) obj).LIZJ == LIZIZ) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 0) {
                for (C666650QCx c666650QCx : arrayList) {
                    C0QD4 c0qd4 = c666650QCx.LIZIZ;
                    String str4 = "";
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (c0qd4.LIZ(str3)) {
                        C0QD4 c0qd42 = c666650QCx.LIZIZ;
                        if (str2 != null) {
                            str4 = str2;
                        }
                        String strLIZIZ = c0qd42.LIZIZ(aweme, str4, LIZIZ, interfaceC631150OpF);
                        if (!TextUtils.isEmpty(c666650QCx.LIZ) && !TextUtils.isEmpty(strLIZIZ)) {
                            map.put(c666650QCx.LIZ, strLIZIZ);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static final void LIZJ(String str, String str2, AbstractC666570QCp abstractC666570QCp, int i) {
        HashMap map = (HashMap) LIZ;
        Set linkedHashSet = (Set) map.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(str, linkedHashSet);
        }
        linkedHashSet.add(new C666650QCx(str2, abstractC666570QCp, i));
    }
}
