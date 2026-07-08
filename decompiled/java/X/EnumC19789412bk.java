package X;

/* JADX INFO: renamed from: X.12bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19789412bk implements InterfaceC19793112cL {
    CONSENT_STATUS_UNSPECIFIED(0),
    GRANTED(1),
    DENIED(2);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19789412bk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12bp
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19789412bk.zza(i) != null) {
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

    public static EnumC19789412bk zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DENIED;
            }
            return GRANTED;
        }
        return CONSENT_STATUS_UNSPECIFIED;
    }

    EnumC19789412bk(int i) {
        this.LL = i;
    }
}
