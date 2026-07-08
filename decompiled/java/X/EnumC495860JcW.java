package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC495860JcW {
    public static final EnumC495860JcW BUSINESS;
    public static final EnumC495860JcW ENIGMA;
    public static final EnumC495860JcW EXPAND;
    public static final EnumC495860JcW FRAME_EXPLANATION;
    public static final EnumC495860JcW HEADER;
    public static final EnumC495860JcW HONOR;
    public static final /* synthetic */ EnumC495860JcW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC495860JcW OPERATION;
    public static final EnumC495860JcW OVERLAY;

    public static InterfaceC2044707zh<EnumC495860JcW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC495860JcW enumC495860JcW = new EnumC495860JcW("HEADER", 0);
        HEADER = enumC495860JcW;
        EnumC495860JcW enumC495860JcW2 = new EnumC495860JcW("HONOR", 1);
        HONOR = enumC495860JcW2;
        EnumC495860JcW enumC495860JcW3 = new EnumC495860JcW("BUSINESS", 2);
        BUSINESS = enumC495860JcW3;
        EnumC495860JcW enumC495860JcW4 = new EnumC495860JcW("OPERATION", 3);
        OPERATION = enumC495860JcW4;
        EnumC495860JcW enumC495860JcW5 = new EnumC495860JcW("OVERLAY", 4);
        OVERLAY = enumC495860JcW5;
        EnumC495860JcW enumC495860JcW6 = new EnumC495860JcW("EXPAND", 5);
        EXPAND = enumC495860JcW6;
        EnumC495860JcW enumC495860JcW7 = new EnumC495860JcW("FRAME_EXPLANATION", 6);
        FRAME_EXPLANATION = enumC495860JcW7;
        EnumC495860JcW enumC495860JcW8 = new EnumC495860JcW("ENIGMA", 7);
        ENIGMA = enumC495860JcW8;
        EnumC495860JcW[] enumC495860JcWArr = {enumC495860JcW, enumC495860JcW2, enumC495860JcW3, enumC495860JcW4, enumC495860JcW5, enumC495860JcW6, enumC495860JcW7, enumC495860JcW8};
        LL = enumC495860JcWArr;
        LLILLJJLI = new C2254308sP(enumC495860JcWArr);
    }

    public static EnumC495860JcW[] values() {
        return (EnumC495860JcW[]) LL.clone();
    }

    public static EnumC495860JcW valueOf(String str) {
        return (EnumC495860JcW) C08FF.LIZ(EnumC495860JcW.class, str);
    }

    public EnumC495860JcW(String str, int i) {
    }
}
