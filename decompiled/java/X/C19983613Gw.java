package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19983613Gw {
    public static final <T> C13HG<T> LIZ(final C13HG<T> c13hg) {
        if (!c13hg.getDescriptor().LIZ()) {
            return new C13HG<T>(c13hg) { // from class: X.13Gv
                public final C13HG<T> LIZ;
                public final C19983213Gs LIZIZ;

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                public final InterfaceC19983313Gt getDescriptor() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = c13hg;
                    this.LIZIZ = new C19983213Gs(c13hg.getDescriptor());
                }

                @Override // X.InterfaceC19984213Hc
                public final T deserialize(C13HB c13hb) {
                    if (c13hb.LJIIZILJ()) {
                        return (T) c13hb.LIZLLL(this.LIZ);
                    }
                    c13hb.LJIJI();
                    return null;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && C19983513Gv.class == obj.getClass() && Intrinsics.LJFF(this.LIZ, ((C19983513Gv) obj).LIZ)) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC19984413He
                public final void serialize(C13HD c13hd, T t) {
                    if (t != null) {
                        c13hd.LJJIIZ();
                        c13hd.LJJI(this.LIZ, t);
                    } else {
                        c13hd.LJJIIJZLJL();
                    }
                }
            };
        }
        return c13hg;
    }
}
