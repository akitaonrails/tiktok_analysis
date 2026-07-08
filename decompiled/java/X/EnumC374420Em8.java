package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Em8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC374420Em8 {
    public static final EnumC374420Em8 GONE;
    public static final /* synthetic */ EnumC374420Em8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC374420Em8 NORMAL;
    public static final EnumC374420Em8 SELECTED;

    public static InterfaceC2044707zh<EnumC374420Em8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC374420Em8 enumC374420Em8 = new EnumC374420Em8("NORMAL", 0);
        NORMAL = enumC374420Em8;
        EnumC374420Em8 enumC374420Em82 = new EnumC374420Em8("SELECTED", 1);
        SELECTED = enumC374420Em82;
        EnumC374420Em8 enumC374420Em83 = new EnumC374420Em8("GONE", 2);
        GONE = enumC374420Em83;
        EnumC374420Em8[] enumC374420Em8Arr = {enumC374420Em8, enumC374420Em82, enumC374420Em83};
        LL = enumC374420Em8Arr;
        LLILLJJLI = new C2254308sP(enumC374420Em8Arr);
    }

    public static EnumC374420Em8[] values() {
        return (EnumC374420Em8[]) LL.clone();
    }

    public static EnumC374420Em8 valueOf(String str) {
        return (EnumC374420Em8) C08FF.LIZ(EnumC374420Em8.class, str);
    }

    public EnumC374420Em8(String str, int i) {
    }
}
