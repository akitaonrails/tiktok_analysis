package X;

/* JADX INFO: renamed from: X.12bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19790312bt implements InterfaceC19793112cL {
    RADS(1),
    PROVISIONING(2);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19790312bt.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12bu
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19790312bt.zza(i) != null) {
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

    public static EnumC19790312bt zza(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }
        return RADS;
    }

    EnumC19790312bt(int i) {
        this.LL = i;
    }
}
