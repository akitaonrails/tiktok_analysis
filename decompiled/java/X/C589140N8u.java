package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0N8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589140N8u extends AbstractC1604130rqV {
    public static final C589140N8u LJ = new C589140N8u();

    public C589140N8u() {
        super("playlist", "mix_feed");
    }

    public final void LJIJI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete playlist: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str2);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load detail for: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str2);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIL(String str, String str2, String str3) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playlistId: ");
        sbLIZ.append(str);
        sbLIZ.append(", watch history read result: ");
        sbLIZ.append(str2);
        if (str3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", reason: ");
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJ(String str, String str2, String str3) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playlistId: ");
        sbLIZ.append(str);
        sbLIZ.append(", watch history write result: ");
        sbLIZ.append(str2);
        if (str3 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", reason: ");
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJLI(int i, String str, String str2, String str3, List list) {
        StringBuilder sb = new StringBuilder("load videos for: ");
        sb.append(str);
        sb.append(", item id is: ");
        sb.append(str2);
        sb.append(", pullType: ");
        sb.append(i);
        sb.append(", reason: ");
        sb.append(str3);
        sb.append(", video count: ");
        sb.append(list.size());
        sb.append(", video ids: ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        LJIIIZ(sb.toString());
    }
}
