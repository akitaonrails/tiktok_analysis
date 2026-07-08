package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197840hHC {
    public static final C1197840hHC LIZ = new C1197840hHC();
    public static final Keva LIZIZ = Keva.getRepo("poi_creator_banner_frequency");
    public static String LIZJ = "";

    public static List LIZ() {
        String string = LIZIZ.getString(LIZIZ(), "");
        return C1200890hM7.LIZ(string) ? new ArrayList(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) : new ArrayList();
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!Intrinsics.LJFF(LIZJ, curUserId)) {
            LIZJ = curUserId;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select_poi_search_filter_data_list");
        sbLIZ.append('_');
        sbLIZ.append(LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
