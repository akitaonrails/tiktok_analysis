package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC438650HHz {
    public static final /* synthetic */ EnumC438650HHz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC438650HHz LOADING;
    public static final EnumC438650HHz SEE_MORE;
    public static final EnumC438650HHz STATUS;
    public static final EnumC438650HHz TEXT;

    public static InterfaceC2044707zh<EnumC438650HHz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC438650HHz enumC438650HHz = new EnumC438650HHz("TEXT", 0);
        TEXT = enumC438650HHz;
        EnumC438650HHz enumC438650HHz2 = new EnumC438650HHz("SEE_MORE", 1);
        SEE_MORE = enumC438650HHz2;
        EnumC438650HHz enumC438650HHz3 = new EnumC438650HHz("LOADING", 2);
        LOADING = enumC438650HHz3;
        EnumC438650HHz enumC438650HHz4 = new EnumC438650HHz("STATUS", 3);
        STATUS = enumC438650HHz4;
        EnumC438650HHz[] enumC438650HHzArr = {enumC438650HHz, enumC438650HHz2, enumC438650HHz3, enumC438650HHz4};
        LL = enumC438650HHzArr;
        LLILLJJLI = new C2254308sP(enumC438650HHzArr);
    }

    public static EnumC438650HHz[] values() {
        return (EnumC438650HHz[]) LL.clone();
    }

    public static EnumC438650HHz valueOf(String str) {
        return (EnumC438650HHz) C08FF.LIZ(EnumC438650HHz.class, str);
    }

    public EnumC438650HHz(String str, int i) {
    }
}
