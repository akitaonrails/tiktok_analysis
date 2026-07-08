package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1008703wz {
    public static final boolean LIZ(String str, String str2, String str3) {
        if (Intrinsics.LJFF(str2, str)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[^");
        sbLIZ.append(str3);
        sbLIZ.append(']');
        if (PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(str).find() || PatternProtector.compile("%[0-9a-fA-F]{2}").matcher(str2).find()) {
            return false;
        }
        return PatternProtector.compile("^[a-zA-Z]+://.*").matcher(str2).find();
    }
}
