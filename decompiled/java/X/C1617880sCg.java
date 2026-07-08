package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0sCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617880sCg {
    public static final Gson LIZ = new Gson();

    public static List LIZ(InterfaceC1609890rzn interfaceC1609890rzn) {
        C0SR4 c0sr4;
        List<Aweme> listFg;
        if (interfaceC1609890rzn == null || (c0sr4 = ((C1609880rzm) interfaceC1609890rzn).LIZ.LLJL) == null || (listFg = c0sr4.Fg()) == null) {
            return C13BV.INSTANCE;
        }
        return listFg;
    }

    public static String LIZIZ(List list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
