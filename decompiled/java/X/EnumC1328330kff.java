package X;

/* JADX INFO: renamed from: X.0kff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1328330kff {
    YES,
    NO,
    UNSET;

    public boolean asBoolean() {
        int i = C1328360kfi.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unrecognized TriState value: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Boolean asBooleanObject() {
        int i = C1328360kfi.LIZ[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unrecognized TriState value: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public int getDbValue() {
        int i = C1328360kfi.LIZ[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static EnumC1328330kff fromDbValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return UNSET;
            }
            return NO;
        }
        return YES;
    }

    public static EnumC1328330kff valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public boolean asBoolean(boolean z) {
        int i = C1328360kfi.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return z;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unrecognized TriState value: ");
            sbLIZ.append(this);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public static EnumC1328330kff valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }
}
