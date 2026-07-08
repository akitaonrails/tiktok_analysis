package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19908712uz {
    public static final C19908612uy LIZIZ = new InterfaceC19909112v3() { // from class: X.12uy
        @Override // X.InterfaceC19909112v3
        public final boolean LIZIZ(Class cls) {
            return false;
        }

        @Override // X.InterfaceC19909112v3
        public final InterfaceC19909012v2 LIZ(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    public final C19908812v0 LIZ;

    public C19908712uz() {
        C19908812v0 c19908812v0 = new C19908812v0(new InterfaceC19909112v3() { // from class: X.12uw
            @Override // X.InterfaceC19909112v3
            public final InterfaceC19909012v2 LIZ(Class cls) {
                if (AbstractC19907912ur.class.isAssignableFrom(cls)) {
                    try {
                        return (InterfaceC19909012v2) AbstractC19907912ur.LJIIZILJ(cls.asSubclass(AbstractC19907912ur.class)).LJIIJ(3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            }

            @Override // X.InterfaceC19909112v3
            public final boolean LIZIZ(Class cls) {
                return AbstractC19907912ur.class.isAssignableFrom(cls);
            }
        }, LIZIZ);
        Charset charset = C19856312mX.LIZ;
        this.LIZ = c19908812v0;
    }
}
