package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.085q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20612085q implements AttachUserData {
    public static String LIZ = "";
    public static String LIZIZ = "";

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ);
        sbLIZ.append(":");
        sbLIZ.append(LIZIZ);
        map.put("RecylerViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        return map;
    }
}
