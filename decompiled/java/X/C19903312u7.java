package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19903312u7 {
    public static final C19903612uA LIZIZ = new InterfaceC19903712uB() { // from class: X.12uA
        @Override // X.InterfaceC19903712uB
        public final boolean LIZ(Class<?> cls) {
            return false;
        }

        @Override // X.InterfaceC19903712uB
        public final InterfaceC19903912uD LIZIZ(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    public final InterfaceC19903712uB LIZ;

    public C19903312u7() {
        final InterfaceC19903712uB[] interfaceC19903712uBArr = {new InterfaceC19903712uB() { // from class: X.12u8
            @Override // X.InterfaceC19903712uB
            public final boolean LIZ(Class<?> cls) {
                return AbstractC19899612tW.class.isAssignableFrom(cls);
            }

            @Override // X.InterfaceC19903712uB
            public final InterfaceC19903912uD LIZIZ(Class<?> cls) {
                if (AbstractC19899612tW.class.isAssignableFrom(cls)) {
                    try {
                        return (InterfaceC19903912uD) AbstractC19899612tW.LJIIL(cls.asSubclass(AbstractC19899612tW.class)).LJIILL(3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            }
        }, LIZIZ};
        InterfaceC19903712uB interfaceC19903712uB = new InterfaceC19903712uB(interfaceC19903712uBArr) { // from class: X.12u9
            public final InterfaceC19903712uB[] LIZ;

            {
                this.LIZ = interfaceC19903712uBArr;
            }

            @Override // X.InterfaceC19903712uB
            public final boolean LIZ(Class<?> cls) {
                for (InterfaceC19903712uB interfaceC19903712uB2 : this.LIZ) {
                    if (interfaceC19903712uB2.LIZ(cls)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC19903712uB
            public final InterfaceC19903912uD LIZIZ(Class<?> cls) {
                for (InterfaceC19903712uB interfaceC19903712uB2 : this.LIZ) {
                    if (interfaceC19903712uB2.LIZ(cls)) {
                        return interfaceC19903712uB2.LIZIZ(cls);
                    }
                }
                throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
            }
        };
        Charset charset = C19856912md.LIZ;
        this.LIZ = interfaceC19903712uB;
    }
}
