package X;

import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181230gqP {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(C1181200gqM c1181200gqM) {
        ArrayList arrayList = new ArrayList();
        C1180920gpu c1180920gpu = c1181200gqM.LIZ;
        if (c1180920gpu.LIZJ == EnumC1181250gqR.COMPONENT) {
            arrayList.add(c1180920gpu);
        }
        Iterator<C1181200gqM> it2 = c1181200gqM.LIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(LIZIZ(it2.next()));
        }
        return arrayList;
    }

    public static void LIZ(SlashPage slashPage, C1181190gqL c1181190gqL) {
        Map<String, Node> nodes = slashPage.getNodes();
        if (nodes != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Node> entry : nodes.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue().type, EnumC1181250gqR.ATTACHED_DATA.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                c1181190gqL.LIZJ.put((String) entry2.getKey(), LIZJ(slashPage, (String) entry2.getKey(), null));
            }
        }
    }

    public static C1181190gqL LJ(SlashPage slashPage, Map map) {
        List<C1181200gqM> list;
        Map<String, List<String>> layout;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (map.get("page") != null || ((layout = slashPage.getLayout()) != null && layout.get("page") != null))) {
            C1181200gqM c1181200gqMLIZLLL = LIZLLL(slashPage, "page", null, map);
            linkedHashMap.put("page", c1181200gqMLIZLLL);
            LJFF(slashPage, map, c1181200gqMLIZLLL, linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1181200gqM c1181200gqM = (C1181200gqM) linkedHashMap.get("page");
        if (c1181200gqM != null && (list = c1181200gqM.LIZLLL) != null) {
            for (C1181200gqM c1181200gqM2 : list) {
                linkedHashMap2.put(c1181200gqM2.LIZIZ, LIZIZ(c1181200gqM2));
            }
        }
        return new C1181190gqL(linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1180920gpu LIZJ(com.ss.android.ugc.aweme.slash.data.SlashPage r12, java.lang.String r13, X.EnumC1181250gqR r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1181230gqP.LIZJ(com.ss.android.ugc.aweme.slash.data.SlashPage, java.lang.String, X.0gqR):X.0gpu");
    }

    public static C1181200gqM LIZLLL(SlashPage slashPage, String str, C1181200gqM c1181200gqM, Map map) {
        EnumC1181250gqR enumC1181250gqR;
        if (c1181200gqM == null) {
            enumC1181250gqR = EnumC1181250gqR.ROOT;
        } else if (c1181200gqM.LIZ.LIZJ == EnumC1181250gqR.ROOT) {
            enumC1181250gqR = EnumC1181250gqR.CONTAINER;
        } else if (map.get(str) != null) {
            enumC1181250gqR = EnumC1181250gqR.GROUP;
        } else if (map.get(str) == null) {
            enumC1181250gqR = EnumC1181250gqR.COMPONENT;
        } else {
            enumC1181250gqR = EnumC1181250gqR.UNKNOWN;
        }
        return new C1181200gqM(LIZJ(slashPage, str, enumC1181250gqR), str, c1181200gqM);
    }

    public static void LJFF(SlashPage slashPage, Map map, C1181200gqM c1181200gqM, Map map2) {
        List<String> list = (List) map.get(c1181200gqM.LIZIZ);
        if (list != null) {
            for (String str : list) {
                C1181200gqM c1181200gqMLIZLLL = LIZLLL(slashPage, str, c1181200gqM, map);
                map2.put(str, c1181200gqMLIZLLL);
                LJFF(slashPage, map, c1181200gqMLIZLLL, map2);
                c1181200gqM.LIZLLL.add(c1181200gqMLIZLLL);
            }
        }
    }
}
