package X;

import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900707cT {
    public final Map<String, MvNetFileBean> LIZ = new LinkedHashMap();
    public final Map<String, String> LIZIZ = new LinkedHashMap();

    public final String LIZIZ(String str) {
        if (this.LIZIZ.containsKey(str)) {
            for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                Object key = entry.getKey();
                String str2 = (String) entry.getValue();
                if (Intrinsics.LJFF(str, key)) {
                    return str2;
                }
            }
            return "";
        }
        return "";
    }

    public final MvNetFileBean LIZ(String str, String str2) {
        Map<String, MvNetFileBean> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return (MvNetFileBean) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
    }
}
