package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.054H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054H {
    public static final C054H LIZ = new C054H();

    public final synchronized Keva LIZ() {
        StringBuilder sbLIZ;
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("im_thought_bubble_");
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZIZ(String str, String str2) {
        if (str == null || a0.LJJJIL(str) || str2 == null || a0.LJJJIL(str2)) {
            return false;
        }
        return !Intrinsics.LJFF(LIZ().getString(str, ""), str2);
    }
}
