package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12w2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19915212w2 {
    public static final C19915112w1 LIZIZ = new InterfaceC19915412w4() { // from class: X.12w1
        @Override // X.InterfaceC19915412w4
        public final boolean LIZ(Class<?> cls) {
            return false;
        }

        @Override // X.InterfaceC19915412w4
        public final InterfaceC19921712x5 LIZIZ(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    public final InterfaceC19915412w4 LIZ;

    public C19915212w2() {
        InterfaceC19915412w4 interfaceC19915412w4;
        final InterfaceC19915412w4[] interfaceC19915412w4Arr = new InterfaceC19915412w4[2];
        interfaceC19915412w4Arr[0] = new InterfaceC19915412w4() { // from class: X.12w0
            @Override // X.InterfaceC19915412w4
            public final boolean LIZ(Class<?> cls) {
                return AbstractC19924712xZ.class.isAssignableFrom(cls);
            }

            @Override // X.InterfaceC19915412w4
            public final InterfaceC19921712x5 LIZIZ(Class<?> cls) {
                if (AbstractC19924712xZ.class.isAssignableFrom(cls)) {
                    try {
                        return (InterfaceC19921712x5) AbstractC19924712xZ.getDefaultInstance(cls.asSubclass(AbstractC19924712xZ.class)).buildMessageInfo();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unable to get message info for ");
                        sbLIZ.append(cls.getName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unsupported message type: ");
                sbLIZ2.append(cls.getName());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        Class<?> cls = C19915512w5.LIZ;
        try {
            interfaceC19915412w4 = (InterfaceC19915412w4) Class.forName("com.google.protobuf.p").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC19915412w4 = LIZIZ;
        }
        interfaceC19915412w4Arr[1] = interfaceC19915412w4;
        InterfaceC19915412w4 interfaceC19915412w42 = new InterfaceC19915412w4(interfaceC19915412w4Arr) { // from class: X.12w3
            public final InterfaceC19915412w4[] LIZ;

            {
                this.LIZ = interfaceC19915412w4Arr;
            }

            @Override // X.InterfaceC19915412w4
            public final boolean LIZ(Class<?> cls2) {
                for (InterfaceC19915412w4 interfaceC19915412w43 : this.LIZ) {
                    if (interfaceC19915412w43.LIZ(cls2)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC19915412w4
            public final InterfaceC19921712x5 LIZIZ(Class<?> cls2) {
                for (InterfaceC19915412w4 interfaceC19915412w43 : this.LIZ) {
                    if (interfaceC19915412w43.LIZ(cls2)) {
                        return interfaceC19915412w43.LIZIZ(cls2);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No factory is available for message type: ");
                sbLIZ.append(cls2.getName());
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        Charset charset = C19922012x8.LIZ;
        this.LIZ = interfaceC19915412w42;
    }
}
