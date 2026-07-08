package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992650bwF {
    public static final EnumC992650bwF CART_BUBBLE;
    public static final EnumC992650bwF CART_BUTTON;
    public static final /* synthetic */ EnumC992650bwF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992650bwF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992650bwF enumC992650bwF = new EnumC992650bwF("CART_BUTTON", 0);
        CART_BUTTON = enumC992650bwF;
        EnumC992650bwF enumC992650bwF2 = new EnumC992650bwF("CART_BUBBLE", 1);
        CART_BUBBLE = enumC992650bwF2;
        EnumC992650bwF[] enumC992650bwFArr = {enumC992650bwF, enumC992650bwF2};
        LL = enumC992650bwFArr;
        LLILLJJLI = new C2254308sP(enumC992650bwFArr);
    }

    public static EnumC992650bwF[] values() {
        return (EnumC992650bwF[]) LL.clone();
    }

    public static EnumC992650bwF valueOf(String str) {
        return (EnumC992650bwF) C08FF.LIZ(EnumC992650bwF.class, str);
    }

    public EnumC992650bwF(String str, int i) {
    }
}
