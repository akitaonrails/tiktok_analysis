package X;

import com.facebook.yoga.YogaNative;

/* JADX INFO: renamed from: X.18fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21344318fx extends AbstractC21344418fy {
    public final long LIZ;

    public AbstractC21344318fx() {
        long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jJni_YGConfigNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.LIZ = jJni_YGConfigNewJNI;
    }
}
