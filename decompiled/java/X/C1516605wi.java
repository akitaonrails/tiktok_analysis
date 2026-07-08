package X;

/* JADX INFO: renamed from: X.05wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1516605wi {
    public final CharSequence LIZ;
    public final boolean LIZIZ;
    public InterfaceC894890Z8t LIZJ;

    public C1516605wi() {
        this(null, 7);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        return ((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C1516605wi(InterfaceC894890Z8t interfaceC894890Z8t, int i) {
        interfaceC894890Z8t = (i & 4) != 0 ? C1517105wn.LIZ : interfaceC894890Z8t;
        this.LIZ = null;
        this.LIZIZ = false;
        this.LIZJ = interfaceC894890Z8t;
    }
}
