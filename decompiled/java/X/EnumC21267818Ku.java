package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21267818Ku {
    public static final EnumC21267818Ku ALLOW;
    public static final EnumC21267818Ku DISMISS;
    public static final /* synthetic */ EnumC21267818Ku[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21267818Ku PREVENT;
    public static final EnumC21267818Ku UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21267818Ku> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21267818Ku enumC21267818Ku = new EnumC21267818Ku("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC21267818Ku;
        EnumC21267818Ku enumC21267818Ku2 = new EnumC21267818Ku("ALLOW", 1, "allow");
        ALLOW = enumC21267818Ku2;
        EnumC21267818Ku enumC21267818Ku3 = new EnumC21267818Ku("PREVENT", 2, "prevent");
        PREVENT = enumC21267818Ku3;
        EnumC21267818Ku enumC21267818Ku4 = new EnumC21267818Ku("DISMISS", 3, "dismiss");
        DISMISS = enumC21267818Ku4;
        EnumC21267818Ku[] enumC21267818KuArr = {enumC21267818Ku, enumC21267818Ku2, enumC21267818Ku3, enumC21267818Ku4};
        LLILLJJLI = enumC21267818KuArr;
        LLILLL = new C2254308sP(enumC21267818KuArr);
    }

    public static EnumC21267818Ku[] values() {
        return (EnumC21267818Ku[]) LLILLJJLI.clone();
    }

    public final int toServerRequestValue() {
        int i = C21267918Kv.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21267818Ku valueOf(String str) {
        return (EnumC21267818Ku) C08FF.LIZ(EnumC21267818Ku.class, str);
    }

    public EnumC21267818Ku(String str, int i, String str2) {
        this.LL = str2;
    }
}
