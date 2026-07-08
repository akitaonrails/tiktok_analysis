package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783080wV8 {
    public static final EnumC1783080wV8 CLOSE;
    public static final EnumC1783080wV8 KEYBOARD;
    public static final /* synthetic */ EnumC1783080wV8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783080wV8 PANEL;

    public static InterfaceC2044707zh<EnumC1783080wV8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783080wV8 enumC1783080wV8 = new EnumC1783080wV8("KEYBOARD", 0);
        KEYBOARD = enumC1783080wV8;
        EnumC1783080wV8 enumC1783080wV82 = new EnumC1783080wV8("PANEL", 1);
        PANEL = enumC1783080wV82;
        EnumC1783080wV8 enumC1783080wV83 = new EnumC1783080wV8("CLOSE", 2);
        CLOSE = enumC1783080wV83;
        EnumC1783080wV8[] enumC1783080wV8Arr = {enumC1783080wV8, enumC1783080wV82, enumC1783080wV83};
        LL = enumC1783080wV8Arr;
        LLILLJJLI = new C2254308sP(enumC1783080wV8Arr);
    }

    public static EnumC1783080wV8[] values() {
        return (EnumC1783080wV8[]) LL.clone();
    }

    public static EnumC1783080wV8 valueOf(String str) {
        return (EnumC1783080wV8) C08FF.LIZ(EnumC1783080wV8.class, str);
    }

    public EnumC1783080wV8(String str, int i) {
    }
}
