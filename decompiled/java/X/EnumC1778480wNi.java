package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778480wNi {
    public static final EnumC1778480wNi AS_ENCODE_PROFILE_BASELINE;
    public static final EnumC1778480wNi AS_ENCODE_PROFILE_HIGH;
    public static final EnumC1778480wNi AS_ENCODE_PROFILE_MAIN;
    public static final EnumC1778480wNi AS_ENCODE_PROFILE_UNKNOWN;
    public static final C1778490wNj Companion;
    public static final /* synthetic */ EnumC1778480wNi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778480wNi> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0wNj] */
    static {
        EnumC1778480wNi enumC1778480wNi = new EnumC1778480wNi("AS_ENCODE_PROFILE_UNKNOWN", 0);
        AS_ENCODE_PROFILE_UNKNOWN = enumC1778480wNi;
        EnumC1778480wNi enumC1778480wNi2 = new EnumC1778480wNi("AS_ENCODE_PROFILE_BASELINE", 1);
        AS_ENCODE_PROFILE_BASELINE = enumC1778480wNi2;
        EnumC1778480wNi enumC1778480wNi3 = new EnumC1778480wNi("AS_ENCODE_PROFILE_MAIN", 2);
        AS_ENCODE_PROFILE_MAIN = enumC1778480wNi3;
        EnumC1778480wNi enumC1778480wNi4 = new EnumC1778480wNi("AS_ENCODE_PROFILE_HIGH", 3);
        AS_ENCODE_PROFILE_HIGH = enumC1778480wNi4;
        EnumC1778480wNi[] enumC1778480wNiArr = {enumC1778480wNi, enumC1778480wNi2, enumC1778480wNi3, enumC1778480wNi4};
        LL = enumC1778480wNiArr;
        LLILLJJLI = new C2254308sP(enumC1778480wNiArr);
        Companion = new Object() { // from class: X.0wNj
        };
    }

    public static EnumC1778480wNi[] values() {
        return (EnumC1778480wNi[]) LL.clone();
    }

    public static final EnumC1778480wNi fromOrdinal(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return AS_ENCODE_PROFILE_UNKNOWN;
                    }
                    return AS_ENCODE_PROFILE_HIGH;
                }
                return AS_ENCODE_PROFILE_MAIN;
            }
            return AS_ENCODE_PROFILE_BASELINE;
        }
        return AS_ENCODE_PROFILE_UNKNOWN;
    }

    public static final int toIntValue(EnumC1778480wNi enumC1778480wNi) {
        Companion.getClass();
        int i = C1778470wNh.LIZ[enumC1778480wNi.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                if (i == 4) {
                    return 3;
                }
                throw new C1954807lC();
            }
            return 2;
        }
        return 0;
    }

    public static EnumC1778480wNi valueOf(String str) {
        return (EnumC1778480wNi) C08FF.LIZ(EnumC1778480wNi.class, str);
    }

    public EnumC1778480wNi(String str, int i) {
    }
}
