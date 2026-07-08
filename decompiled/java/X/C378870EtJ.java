package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378870EtJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(298));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(299));

    public static int LIZ() {
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("max_image_quota_");
        sbLIZ.append((String) LIZ.getValue());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 10);
    }
}
