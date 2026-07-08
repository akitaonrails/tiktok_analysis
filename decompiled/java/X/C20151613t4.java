package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20151613t4 {
    public AbstractRunnableC20150813sw<?> LIZ;
    public final Class<? extends InterfaceC20153313tL> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20151613t4)) {
            return false;
        }
        C20151613t4 c20151613t4 = (C20151613t4) obj;
        return Intrinsics.LJFF(this.LIZIZ, c20151613t4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20151613t4.LIZJ);
    }

    public final int hashCode() {
        Class<? extends InterfaceC20153313tL> cls = this.LIZIZ;
        int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.LIZJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public C20151613t4(Class<? extends InterfaceC20153313tL> cls, String str) {
        this.LIZIZ = cls;
        this.LIZJ = str;
    }

    public final boolean LIZ(Class<? extends InterfaceC20153313tL> cls, String str) {
        if (cls == null) {
            if (str != null && str.length() > 0 && Intrinsics.LJFF(str, this.LIZJ)) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(this.LIZIZ, cls) && Intrinsics.LJFF(this.LIZJ, str)) {
            return true;
        }
        return false;
    }
}
