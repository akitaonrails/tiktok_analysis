package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260410iu7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(656));

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static int LIZ(String str) {
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_invalid_detected_count");
        return kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
