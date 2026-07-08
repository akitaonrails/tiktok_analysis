package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19921612x4 {
    public static final InterfaceC19921912x7 LIZ;
    public static final C19921812x6 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12x6] */
    static {
        InterfaceC19921912x7 interfaceC19921912x7;
        Class<?> cls = C19915512w5.LIZ;
        try {
            interfaceC19921912x7 = (InterfaceC19921912x7) Class.forName("com.google.protobuf.z1").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC19921912x7 = null;
        }
        LIZ = interfaceC19921912x7;
        LIZIZ = new InterfaceC19921912x7() { // from class: X.12x6
            @Override // X.InterfaceC19921912x7
            public final Object LIZ(InterfaceC19925612xi interfaceC19925612xi) {
                return ((AbstractC19924712xZ) interfaceC19925612xi).newMutableInstance();
            }
        };
    }
}
