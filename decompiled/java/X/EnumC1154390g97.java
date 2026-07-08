package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154390g97 {
    public static final EnumC1154390g97 BOARD_APPLY;
    public static final EnumC1154390g97 BOARD_EDIT;
    public static final /* synthetic */ EnumC1154390g97[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154390g97> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154390g97 enumC1154390g97 = new EnumC1154390g97("BOARD_EDIT", 0);
        BOARD_EDIT = enumC1154390g97;
        EnumC1154390g97 enumC1154390g972 = new EnumC1154390g97("BOARD_APPLY", 1);
        BOARD_APPLY = enumC1154390g972;
        EnumC1154390g97[] enumC1154390g97Arr = {enumC1154390g97, enumC1154390g972};
        LL = enumC1154390g97Arr;
        LLILLJJLI = new C2254308sP(enumC1154390g97Arr);
    }

    public static EnumC1154390g97[] values() {
        return (EnumC1154390g97[]) LL.clone();
    }

    public static EnumC1154390g97 valueOf(String str) {
        return (EnumC1154390g97) C08FF.LIZ(EnumC1154390g97.class, str);
    }

    public EnumC1154390g97(String str, int i) {
    }
}
