package X;

import com.bytedance.ies.nle.editor_jni.NLEError;

/* JADX INFO: renamed from: X.0nbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440940nbI {
    public static final C1440940nbI LIZ = new C1440940nbI();

    public static NLEError LIZ(int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    return NLEError.FAILED;
                }
                return NLEError.SUCCESS;
            }
            return NLEError.FAILED;
        }
        return NLEError.PARAM_INVALID;
    }
}
