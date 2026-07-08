package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006720cIw {
    public static final EnumC1006720cIw CRITICAL;
    public static final EnumC1006720cIw HIGH;
    public static final /* synthetic */ EnumC1006720cIw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1006720cIw LOW;
    public static final EnumC1006720cIw MEDIUM;
    public static final EnumC1006720cIw UNKNOWN;

    public static InterfaceC2044707zh<EnumC1006720cIw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1006720cIw enumC1006720cIw = new EnumC1006720cIw("CRITICAL", 0);
        CRITICAL = enumC1006720cIw;
        EnumC1006720cIw enumC1006720cIw2 = new EnumC1006720cIw("HIGH", 1);
        HIGH = enumC1006720cIw2;
        EnumC1006720cIw enumC1006720cIw3 = new EnumC1006720cIw("MEDIUM", 2);
        MEDIUM = enumC1006720cIw3;
        EnumC1006720cIw enumC1006720cIw4 = new EnumC1006720cIw("LOW", 3);
        LOW = enumC1006720cIw4;
        EnumC1006720cIw enumC1006720cIw5 = new EnumC1006720cIw("UNKNOWN", 4);
        UNKNOWN = enumC1006720cIw5;
        EnumC1006720cIw[] enumC1006720cIwArr = {enumC1006720cIw, enumC1006720cIw2, enumC1006720cIw3, enumC1006720cIw4, enumC1006720cIw5};
        LL = enumC1006720cIwArr;
        LLILLJJLI = new C2254308sP(enumC1006720cIwArr);
    }

    public static EnumC1006720cIw[] values() {
        return (EnumC1006720cIw[]) LL.clone();
    }

    public static EnumC1006720cIw valueOf(String str) {
        return (EnumC1006720cIw) C08FF.LIZ(EnumC1006720cIw.class, str);
    }

    public EnumC1006720cIw(String str, int i) {
    }
}
