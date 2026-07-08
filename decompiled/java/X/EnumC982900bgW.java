package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982900bgW {
    public static final EnumC982900bgW COUNTDOWN_END;
    public static final C983430bhN Companion;
    public static final /* synthetic */ EnumC982900bgW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982900bgW UNKNOWN;
    public static final EnumC982900bgW USER_CLICK;
    public static final EnumC982900bgW USER_LEFT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982900bgW> getEntries() {
        return LLILLL;
    }

    public static final EnumC982900bgW getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983430bhN.LIZ(num);
    }

    static {
        EnumC982900bgW enumC982900bgW = new EnumC982900bgW("UNKNOWN", 0, 0);
        UNKNOWN = enumC982900bgW;
        EnumC982900bgW enumC982900bgW2 = new EnumC982900bgW("USER_CLICK", 1, 1);
        USER_CLICK = enumC982900bgW2;
        EnumC982900bgW enumC982900bgW3 = new EnumC982900bgW("USER_LEFT", 2, 2);
        USER_LEFT = enumC982900bgW3;
        EnumC982900bgW enumC982900bgW4 = new EnumC982900bgW("COUNTDOWN_END", 3, 3);
        COUNTDOWN_END = enumC982900bgW4;
        EnumC982900bgW[] enumC982900bgWArr = {enumC982900bgW, enumC982900bgW2, enumC982900bgW3, enumC982900bgW4};
        LLILLJJLI = enumC982900bgWArr;
        LLILLL = new C2254308sP(enumC982900bgWArr);
        Companion = new C983430bhN();
    }

    public static EnumC982900bgW[] values() {
        return (EnumC982900bgW[]) LLILLJJLI.clone();
    }

    public final String getString() {
        int i = C983060bgm.LIZ[ordinal()];
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "user_click";
        }
        if (i == 3) {
            return "user_left";
        }
        if (i == 4) {
            return "countdown_end";
        }
        throw new C1954807lC();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982900bgW valueOf(String str) {
        return (EnumC982900bgW) C08FF.LIZ(EnumC982900bgW.class, str);
    }

    public EnumC982900bgW(String str, int i, int i2) {
        this.LL = i2;
    }
}
