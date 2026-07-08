package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13H4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13H4 {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.13H2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13H0] */
    public static final C13H0 LIZ(final String str, final C13HG c13hg) {
        final ?? r0 = new C13H1<Object>() { // from class: X.13H2
            @Override // X.C13H1
            public final C13HG<?>[] childSerializers() {
                return new C13HG[]{c13hg};
            }

            @Override // X.C13H1
            public final /* synthetic */ C13HG[] typeParametersSerializers() {
                return C13H3.LIZ;
            }

            @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
            public final InterfaceC19983313Gt getDescriptor() {
                "unsupported".toString();
                throw new IllegalStateException("unsupported");
            }

            @Override // X.InterfaceC19984213Hc
            public final Object deserialize(C13HB c13hb) {
                "unsupported".toString();
                throw new IllegalStateException("unsupported");
            }

            @Override // X.InterfaceC19984413He
            public final void serialize(C13HD c13hd, Object obj) {
                "unsupported".toString();
                throw new IllegalStateException("unsupported");
            }
        };
        return new C19983913Gz(str, r0) { // from class: X.13H0
            public final boolean LJIIJJI = true;

            @Override // X.C19983913Gz
            public final int hashCode() {
                return super.hashCode() * 31;
            }

            @Override // X.C19983913Gz, X.InterfaceC19983313Gt
            public final boolean isInline() {
                return this.LJIIJJI;
            }

            @Override // X.C19983913Gz
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C13H0) {
                    InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) obj;
                    if (Intrinsics.LJFF(this.LIZ, interfaceC19983313Gt.LJI())) {
                        C13H0 c13h0 = (C13H0) obj;
                        if (c13h0.LJIIJJI && Arrays.equals((Object[]) this.LJIIIZ.getValue(), (Object[]) c13h0.LJIIIZ.getValue()) && this.LIZJ == interfaceC19983313Gt.LJ()) {
                            int i = this.LIZJ;
                            for (int i2 = 0; i2 < i; i2++) {
                                if (Intrinsics.LJFF(LJIIIIZZ(i2).LJI(), interfaceC19983313Gt.LJIIIIZZ(i2).LJI()) && Intrinsics.LJFF(LJIIIIZZ(i2).LIZIZ(), interfaceC19983313Gt.LJIIIIZZ(i2).LIZIZ())) {
                                }
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        };
    }
}
