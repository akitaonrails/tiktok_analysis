package X;

import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsSchemaModifierModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277104zB {
    public static final PnsSchemaModifierModel LIZ = new PnsSchemaModifierModel(false, null, 3, null);

    public static boolean LIZ(String str, String str2) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (str2 == null || !a0.LJJIIZI(str2, str, false)) {
            return false;
        }
        return true;
    }
}
