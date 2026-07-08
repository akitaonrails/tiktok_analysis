package X;

/* JADX INFO: renamed from: X.12bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19788212bY implements InterfaceC19793112cL {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19788212bY.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12bb
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19788212bY.zza(i) != null) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.InterfaceC19793112cL
    public final int zza() {
        return this.LL;
    }

    public static EnumC19788212bY zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BETWEEN;
                    }
                    return EQUAL;
                }
                return GREATER_THAN;
            }
            return LESS_THAN;
        }
        return UNKNOWN_COMPARISON_TYPE;
    }

    EnumC19788212bY(int i) {
        this.LL = i;
    }
}
