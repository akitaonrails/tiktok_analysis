package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06lW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1702006lW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1215));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZIZ(int i) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_played");
        sbLIZ.append(i);
        return kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }
}
