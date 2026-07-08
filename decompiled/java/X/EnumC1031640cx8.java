package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1031640cx8 {
    public static final EnumC1031640cx8 CLOSE;
    public static final /* synthetic */ EnumC1031640cx8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1031640cx8 SHOWING;
    public static final EnumC1031640cx8 SHOWN;

    public static InterfaceC2044707zh<EnumC1031640cx8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1031640cx8 enumC1031640cx8 = new EnumC1031640cx8("SHOWING", 0);
        SHOWING = enumC1031640cx8;
        EnumC1031640cx8 enumC1031640cx82 = new EnumC1031640cx8("SHOWN", 1);
        SHOWN = enumC1031640cx82;
        EnumC1031640cx8 enumC1031640cx83 = new EnumC1031640cx8("CLOSE", 2);
        CLOSE = enumC1031640cx83;
        EnumC1031640cx8[] enumC1031640cx8Arr = {enumC1031640cx8, enumC1031640cx82, enumC1031640cx83};
        LL = enumC1031640cx8Arr;
        LLILLJJLI = new C2254308sP(enumC1031640cx8Arr);
    }

    public static EnumC1031640cx8[] values() {
        return (EnumC1031640cx8[]) LL.clone();
    }

    public static EnumC1031640cx8 valueOf(String str) {
        return (EnumC1031640cx8) C08FF.LIZ(EnumC1031640cx8.class, str);
    }

    public EnumC1031640cx8(String str, int i) {
    }
}
