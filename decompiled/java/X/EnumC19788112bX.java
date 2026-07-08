package X;

/* JADX INFO: renamed from: X.12bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19788112bX implements InterfaceC19793112cL {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19788112bX.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12bc
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19788112bX.zza(i) != null) {
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

    public static EnumC19788112bX zza(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    EnumC19788112bX(int i) {
        this.LL = i;
    }
}
