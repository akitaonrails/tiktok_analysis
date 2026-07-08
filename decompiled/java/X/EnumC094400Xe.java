package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094400Xe {
    public static final EnumC094400Xe COMMON_DIALOG;
    public static final EnumC094400Xe DESTRUCTIVE;
    public static final /* synthetic */ EnumC094400Xe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC094400Xe THREE_BUTTON_DIALOG;

    public static InterfaceC2044707zh<EnumC094400Xe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC094400Xe enumC094400Xe = new EnumC094400Xe("COMMON_DIALOG", 0);
        COMMON_DIALOG = enumC094400Xe;
        EnumC094400Xe enumC094400Xe2 = new EnumC094400Xe("THREE_BUTTON_DIALOG", 1);
        THREE_BUTTON_DIALOG = enumC094400Xe2;
        EnumC094400Xe enumC094400Xe3 = new EnumC094400Xe("DESTRUCTIVE", 2);
        DESTRUCTIVE = enumC094400Xe3;
        EnumC094400Xe[] enumC094400XeArr = {enumC094400Xe, enumC094400Xe2, enumC094400Xe3};
        LL = enumC094400XeArr;
        LLILLJJLI = new C2254308sP(enumC094400XeArr);
    }

    public static EnumC094400Xe[] values() {
        return (EnumC094400Xe[]) LL.clone();
    }

    public static EnumC094400Xe valueOf(String str) {
        return (EnumC094400Xe) C08FF.LIZ(EnumC094400Xe.class, str);
    }

    public EnumC094400Xe(String str, int i) {
    }
}
