package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.085f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20601085f implements AttachUserData {
    public static String LIZ = "";
    public static int LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ);
        sbLIZ.append(" bytes| thread name =");
        sbLIZ.append(LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap map = new HashMap();
        map.put("fresco-bitmap-alloc", toString());
        return map;
    }
}
