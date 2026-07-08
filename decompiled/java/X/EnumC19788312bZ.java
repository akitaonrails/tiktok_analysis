package X;

/* JADX INFO: renamed from: X.12bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19788312bZ implements InterfaceC19793112cL {
    SDK(0),
    SGTM(1);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19788312bZ.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12be
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19788312bZ.zza(i) != null) {
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

    public static EnumC19788312bZ zza(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return SGTM;
        }
        return SDK;
    }

    EnumC19788312bZ(int i) {
        this.LL = i;
    }
}
