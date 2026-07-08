package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566090qr9 implements AttachUserData {
    public static final C1566110qrB<Object> LIZ;
    public static final C1566110qrB<C1566060qr6> LIZIZ;

    static {
        new C1566080qr8();
        LIZ = new C1566110qrB<>(200);
        LIZIZ = new C1566110qrB<>(10);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (C2550809z8.LIZ) {
                C1566110qrB<Object> c1566110qrB = LIZ;
                if (c1566110qrB.LIZIZ.size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (C1566100qrA<Object> c1566100qrA : c1566110qrB.LIZIZ(c1566110qrB.LIZIZ.size())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1566100qrA.LIZ);
                        sbLIZ.append(':');
                        sbLIZ.append(c1566100qrA.LIZIZ);
                        sbLIZ.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1566110qrB<C1566060qr6> c1566110qrB2 = LIZIZ;
                    for (C1566100qrA<C1566060qr6> c1566100qrA2 : c1566110qrB2.LIZIZ(c1566110qrB2.LIZIZ.size())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1566100qrA2.LIZ);
                        sbLIZ2.append(':');
                        sbLIZ2.append(c1566100qrA2.LIZIZ);
                        sbLIZ2.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    linkedHashMap.put("Feed_Component_Core_Data", sb.toString());
                    return linkedHashMap;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return linkedHashMap;
    }
}
