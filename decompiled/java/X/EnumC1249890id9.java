package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0id9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249890id9 {
    public static final EnumC1249890id9 ICON;
    public static final EnumC1249890id9 ICON_TEXT;
    public static final /* synthetic */ EnumC1249890id9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1249890id9 SHEET;
    public static final EnumC1249890id9 TEXT;

    public static InterfaceC2044707zh<EnumC1249890id9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1249890id9 enumC1249890id9 = new EnumC1249890id9("ICON_TEXT", 0);
        ICON_TEXT = enumC1249890id9;
        EnumC1249890id9 enumC1249890id92 = new EnumC1249890id9("TEXT", 1);
        TEXT = enumC1249890id92;
        EnumC1249890id9 enumC1249890id93 = new EnumC1249890id9("ICON", 2);
        ICON = enumC1249890id93;
        EnumC1249890id9 enumC1249890id94 = new EnumC1249890id9("SHEET", 3);
        SHEET = enumC1249890id94;
        EnumC1249890id9[] enumC1249890id9Arr = {enumC1249890id9, enumC1249890id92, enumC1249890id93, enumC1249890id94};
        LL = enumC1249890id9Arr;
        LLILLJJLI = new C2254308sP(enumC1249890id9Arr);
    }

    public static EnumC1249890id9[] values() {
        return (EnumC1249890id9[]) LL.clone();
    }

    public static EnumC1249890id9 valueOf(String str) {
        return (EnumC1249890id9) C08FF.LIZ(EnumC1249890id9.class, str);
    }

    public EnumC1249890id9(String str, int i) {
    }
}
