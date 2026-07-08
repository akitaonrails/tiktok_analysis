package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985307q7 {
    public static final EnumC1985307q7 AVAILABLE;
    public static final /* synthetic */ EnumC1985307q7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1985307q7 UNAVAILABLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1985307q7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1985307q7 enumC1985307q7 = new EnumC1985307q7("AVAILABLE", 0, "Available");
        AVAILABLE = enumC1985307q7;
        EnumC1985307q7 enumC1985307q72 = new EnumC1985307q7("UNAVAILABLE", 1, "UnAvailable");
        UNAVAILABLE = enumC1985307q72;
        EnumC1985307q7[] enumC1985307q7Arr = {enumC1985307q7, enumC1985307q72};
        LLILLJJLI = enumC1985307q7Arr;
        LLILLL = new C2254308sP(enumC1985307q7Arr);
    }

    public static EnumC1985307q7[] values() {
        return (EnumC1985307q7[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1985307q7 valueOf(String str) {
        return (EnumC1985307q7) C08FF.LIZ(EnumC1985307q7.class, str);
    }

    public EnumC1985307q7(String str, int i, String str2) {
        this.LL = str2;
    }
}
