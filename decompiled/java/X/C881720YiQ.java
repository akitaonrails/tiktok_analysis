package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0YiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881720YiQ {
    public EnumC881770YiV LIZ;
    public CharSequence LIZIZ;
    public boolean LIZJ;
    public Set<Long> LIZLLL;

    public C881720YiQ() {
        this(null, null, 15);
    }

    public final int hashCode() {
        EnumC881770YiV enumC881770YiV = this.LIZ;
        int iHashCode = (enumC881770YiV == null ? 0 : enumC881770YiV.hashCode()) * 31;
        CharSequence charSequence = this.LIZIZ;
        return ((((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public C881720YiQ(EnumC881770YiV enumC881770YiV, Set set, int i) {
        enumC881770YiV = (i & 1) != 0 ? null : enumC881770YiV;
        set = (i & 8) != 0 ? C08CX.INSTANCE : set;
        this.LIZ = enumC881770YiV;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = set;
    }
}
