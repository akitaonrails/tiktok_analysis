package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669420QNo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(23));

    public static String LIZ(String str) {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guide_");
        sbLIZ.append(str);
        if (keva.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            return "page_button";
        }
        return "manual";
    }
}
