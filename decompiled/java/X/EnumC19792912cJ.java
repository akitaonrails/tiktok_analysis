package X;

/* JADX INFO: renamed from: X.12cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19792912cJ implements InterfaceC19793112cL {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19792912cJ.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12cI
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19792912cJ.zza(i) != null) {
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

    public static EnumC19792912cJ zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return STATEMENT;
                    }
                    return BOOLEAN;
                }
                return NUMBER;
            }
            return STRING;
        }
        return UNKNOWN;
    }

    EnumC19792912cJ(int i) {
        this.LL = i;
    }
}
