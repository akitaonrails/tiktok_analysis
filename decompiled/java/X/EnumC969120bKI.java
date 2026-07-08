package X;

/* JADX INFO: renamed from: X.0bKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC969120bKI {
    PermitTypeUnknown,
    PermitTypeOneClickMicro,
    PermitTypeOneClickCapsule;

    public static final C969150bKL Companion = new Object() { // from class: X.0bKL
    };

    public static EnumC969120bKI valueOf(String str) {
        return (EnumC969120bKI) C08FF.LIZ(EnumC969120bKI.class, str);
    }

    public final EnumC2231991CXl into() {
        int i = C969110bKH.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231991CXl.VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2231991CXl.VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_MICRO;
        }
        if (i == 3) {
            return EnumC2231991CXl.VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_ONE_CLICK_CAPSULE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C969110bKH.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
