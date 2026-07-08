package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982640bg6 {
    public static final EnumC982640bg6 ACCEPT;
    public static final C983950biD Companion;
    public static final /* synthetic */ EnumC982640bg6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982640bg6 REJECT;
    public static final EnumC982640bg6 UNKNOWN;
    public static final EnumC982640bg6 WITHDRAW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982640bg6> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0biD] */
    static {
        EnumC982640bg6 enumC982640bg6 = new EnumC982640bg6("UNKNOWN", 0, 0);
        UNKNOWN = enumC982640bg6;
        EnumC982640bg6 enumC982640bg62 = new EnumC982640bg6("ACCEPT", 1, 1);
        ACCEPT = enumC982640bg62;
        EnumC982640bg6 enumC982640bg63 = new EnumC982640bg6("REJECT", 2, 2);
        REJECT = enumC982640bg63;
        EnumC982640bg6 enumC982640bg64 = new EnumC982640bg6("WITHDRAW", 3, 3);
        WITHDRAW = enumC982640bg64;
        EnumC982640bg6[] enumC982640bg6Arr = {enumC982640bg6, enumC982640bg62, enumC982640bg63, enumC982640bg64};
        LLILLJJLI = enumC982640bg6Arr;
        LLILLL = new C2254308sP(enumC982640bg6Arr);
        Companion = new Object() { // from class: X.0biD
        };
    }

    public static EnumC982640bg6[] values() {
        return (EnumC982640bg6[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static final EnumC982640bg6 getTypeFromInt(Integer num) {
        Companion.getClass();
        EnumC982640bg6 enumC982640bg6 = UNKNOWN;
        int type = enumC982640bg6.getType();
        if (num == null || num.intValue() != type) {
            EnumC982640bg6 enumC982640bg62 = ACCEPT;
            int type2 = enumC982640bg62.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982640bg62;
            }
            EnumC982640bg6 enumC982640bg63 = REJECT;
            int type3 = enumC982640bg63.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982640bg63;
            }
            EnumC982640bg6 enumC982640bg64 = WITHDRAW;
            int type4 = enumC982640bg64.getType();
            if (num != null && num.intValue() == type4) {
                return enumC982640bg64;
            }
        }
        return enumC982640bg6;
    }

    public static EnumC982640bg6 valueOf(String str) {
        return (EnumC982640bg6) C08FF.LIZ(EnumC982640bg6.class, str);
    }

    public EnumC982640bg6(String str, int i, int i2) {
        this.LL = i2;
    }
}
