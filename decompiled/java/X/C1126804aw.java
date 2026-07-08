package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126804aw {
    public static final Class<?> LIZ;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.y");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            cls = null;
        }
        LIZ = cls;
    }
}
