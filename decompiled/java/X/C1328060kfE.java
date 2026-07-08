package X;

/* JADX INFO: renamed from: X.0kfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328060kfE implements InterfaceC529960KqQ {
    public static final C1328060kfE LIZLLL = new C1328060kfE(Integer.MAX_VALUE, true, true);
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final int hashCode() {
        return (this.LIZ ^ (this.LIZIZ ? 4194304 : 0)) ^ (this.LIZJ ? 8388608 : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1328060kfE)) {
            return false;
        }
        C1328060kfE c1328060kfE = (C1328060kfE) obj;
        if (this.LIZ == c1328060kfE.LIZ && this.LIZIZ == c1328060kfE.LIZIZ && this.LIZJ == c1328060kfE.LIZJ) {
            return true;
        }
        return false;
    }

    public C1328060kfE(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
