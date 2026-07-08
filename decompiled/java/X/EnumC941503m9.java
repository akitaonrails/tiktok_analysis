package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03m9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC941503m9 {
    public static final /* synthetic */ EnumC941503m9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC941503m9 NUMBER;
    public static final EnumC941503m9 PHONE;
    public static final EnumC941503m9 TEXT;

    public static InterfaceC2044707zh<EnumC941503m9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC941503m9 enumC941503m9 = new EnumC941503m9("TEXT", 0);
        TEXT = enumC941503m9;
        EnumC941503m9 enumC941503m92 = new EnumC941503m9("NUMBER", 1);
        NUMBER = enumC941503m92;
        EnumC941503m9 enumC941503m93 = new EnumC941503m9("PHONE", 2);
        PHONE = enumC941503m93;
        EnumC941503m9[] enumC941503m9Arr = {enumC941503m9, enumC941503m92, enumC941503m93};
        LL = enumC941503m9Arr;
        LLILLJJLI = new C2254308sP(enumC941503m9Arr);
    }

    public static EnumC941503m9[] values() {
        return (EnumC941503m9[]) LL.clone();
    }

    public static EnumC941503m9 valueOf(String str) {
        return (EnumC941503m9) C08FF.LIZ(EnumC941503m9.class, str);
    }

    public EnumC941503m9(String str, int i) {
    }
}
