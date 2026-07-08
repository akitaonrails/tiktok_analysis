package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787090UuB {
    public static InterfaceC1148660fzs LIZ;

    public static InterfaceC1148660fzs LIZ() {
        if (LIZ == null) {
            synchronized (C787090UuB.class) {
                try {
                    if (LIZ == null) {
                        try {
                            Object objNewInstance = Class.forName("com.bytedance.android.live.ai.LiveAiAnnotationRegister").getConstructor(new Class[0]).newInstance(new Object[0]);
                            if (objNewInstance instanceof InterfaceC1148660fzs) {
                                LIZ = (InterfaceC1148660fzs) objNewInstance;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
