package X;

/* JADX INFO: renamed from: X.12bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19789312bj implements InterfaceC19793112cL {
    CONSENT_TYPE_UNSPECIFIED(0),
    AD_STORAGE(1),
    ANALYTICS_STORAGE(2),
    AD_USER_DATA(3),
    AD_PERSONALIZATION(4);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC19789312bj.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.LL + " name=" + name() + '>';
    }

    public static InterfaceC19793212cM zzb() {
        return new InterfaceC19793212cM() { // from class: X.12bq
            @Override // X.InterfaceC19793212cM
            public final boolean LJII(int i) {
                if (EnumC19789312bj.zza(i) != null) {
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

    public static EnumC19789312bj zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return AD_PERSONALIZATION;
                    }
                    return AD_USER_DATA;
                }
                return ANALYTICS_STORAGE;
            }
            return AD_STORAGE;
        }
        return CONSENT_TYPE_UNSPECIFIED;
    }

    EnumC19789312bj(int i) {
        this.LL = i;
    }
}
