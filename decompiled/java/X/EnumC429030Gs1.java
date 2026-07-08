package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429030Gs1 {
    public static final EnumC429030Gs1 ENTER;
    public static final EnumC429030Gs1 EXIT;
    public static final /* synthetic */ EnumC429030Gs1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429030Gs1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429030Gs1 enumC429030Gs1 = new EnumC429030Gs1("ENTER", 0);
        ENTER = enumC429030Gs1;
        EnumC429030Gs1 enumC429030Gs12 = new EnumC429030Gs1("EXIT", 1);
        EXIT = enumC429030Gs12;
        EnumC429030Gs1[] enumC429030Gs1Arr = {enumC429030Gs1, enumC429030Gs12};
        LL = enumC429030Gs1Arr;
        LLILLJJLI = new C2254308sP(enumC429030Gs1Arr);
    }

    public static EnumC429030Gs1[] values() {
        return (EnumC429030Gs1[]) LL.clone();
    }

    public static EnumC429030Gs1 valueOf(String str) {
        return (EnumC429030Gs1) C08FF.LIZ(EnumC429030Gs1.class, str);
    }

    public EnumC429030Gs1(String str, int i) {
    }
}
