package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356350Dy5 {
    public static final EnumC356350Dy5 ADD;
    public static final /* synthetic */ EnumC356350Dy5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356350Dy5 REPLACE;

    public static InterfaceC2044707zh<EnumC356350Dy5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356350Dy5 enumC356350Dy5 = new EnumC356350Dy5("ADD", 0);
        ADD = enumC356350Dy5;
        EnumC356350Dy5 enumC356350Dy52 = new EnumC356350Dy5("REPLACE", 1);
        REPLACE = enumC356350Dy52;
        EnumC356350Dy5[] enumC356350Dy5Arr = {enumC356350Dy5, enumC356350Dy52};
        LL = enumC356350Dy5Arr;
        LLILLJJLI = new C2254308sP(enumC356350Dy5Arr);
    }

    public static EnumC356350Dy5[] values() {
        return (EnumC356350Dy5[]) LL.clone();
    }

    public static EnumC356350Dy5 valueOf(String str) {
        return (EnumC356350Dy5) C08FF.LIZ(EnumC356350Dy5.class, str);
    }

    public EnumC356350Dy5(String str, int i) {
    }
}
