package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;

/* JADX INFO: renamed from: X.0E1A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1A {
    public static final int LIZ(NLEResType nLEResType) {
        if (nLEResType instanceof Enum) {
            return nLEResType.ordinal();
        }
        return Integer.MAX_VALUE;
    }
}
