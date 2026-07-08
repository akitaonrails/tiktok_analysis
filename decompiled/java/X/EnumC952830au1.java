package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0au1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952830au1 {
    public static final EnumC952830au1 DIALOG_SAVE;
    public static final EnumC952830au1 EDIT_SAVE;
    public static final /* synthetic */ EnumC952830au1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC952830au1 MASK;

    public static InterfaceC2044707zh<EnumC952830au1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC952830au1 enumC952830au1 = new EnumC952830au1("MASK", 0);
        MASK = enumC952830au1;
        EnumC952830au1 enumC952830au12 = new EnumC952830au1("DIALOG_SAVE", 1);
        DIALOG_SAVE = enumC952830au12;
        EnumC952830au1 enumC952830au13 = new EnumC952830au1("EDIT_SAVE", 2);
        EDIT_SAVE = enumC952830au13;
        EnumC952830au1[] enumC952830au1Arr = {enumC952830au1, enumC952830au12, enumC952830au13};
        LL = enumC952830au1Arr;
        LLILLJJLI = new C2254308sP(enumC952830au1Arr);
    }

    public static EnumC952830au1[] values() {
        return (EnumC952830au1[]) LL.clone();
    }

    public static EnumC952830au1 valueOf(String str) {
        return (EnumC952830au1) C08FF.LIZ(EnumC952830au1.class, str);
    }

    public EnumC952830au1(String str, int i) {
    }
}
