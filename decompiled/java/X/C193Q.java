package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C193Q {
    public final Class<?> LIZ;
    public final Class<?> LIZIZ;
    public final InterfaceC19223310Il LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193Q)) {
            return false;
        }
        C193Q c193q = (C193Q) obj;
        return Intrinsics.LJFF(this.LIZ, c193q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c193q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c193q.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C193Q(Class<?> cls, Class<?> cls2, InterfaceC19223310Il interfaceC19223310Il) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
        this.LIZJ = interfaceC19223310Il;
    }
}
