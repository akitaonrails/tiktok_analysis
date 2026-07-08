package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312100CLg {
    public static final C312100CLg LIZ = new C312100CLg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5921));

    public static boolean LIZ() {
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_left_align_exp_group_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        boolean z = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) != C268330AfP.LIZ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isExpDiff ");
        sbLIZ2.append(z);
        sbLIZ2.append(", current abGroup:");
        sbLIZ2.append(C268330AfP.LIZ());
        C1720106oR.LJI("ProfileLeftAlignDiffExp", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }
}
