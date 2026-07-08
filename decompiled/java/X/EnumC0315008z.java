package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0315008z {
    public static final EnumC0315008z CARD_JUMP_TYPE_CAMERA;
    public static final EnumC0315008z CARD_JUMP_TYPE_DETAIL;
    public static final EnumC0315008z CARD_JUMP_TYPE_FEED;
    public static final /* synthetic */ EnumC0315008z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0315008z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0315008z enumC0315008z = new EnumC0315008z("CARD_JUMP_TYPE_CAMERA", 0);
        CARD_JUMP_TYPE_CAMERA = enumC0315008z;
        EnumC0315008z enumC0315008z2 = new EnumC0315008z("CARD_JUMP_TYPE_FEED", 1);
        CARD_JUMP_TYPE_FEED = enumC0315008z2;
        EnumC0315008z enumC0315008z3 = new EnumC0315008z("CARD_JUMP_TYPE_DETAIL", 2);
        CARD_JUMP_TYPE_DETAIL = enumC0315008z3;
        EnumC0315008z[] enumC0315008zArr = {enumC0315008z, enumC0315008z2, enumC0315008z3};
        LL = enumC0315008zArr;
        LLILLJJLI = new C2254308sP(enumC0315008zArr);
    }

    public static EnumC0315008z[] values() {
        return (EnumC0315008z[]) LL.clone();
    }

    public static EnumC0315008z valueOf(String str) {
        return (EnumC0315008z) C08FF.LIZ(EnumC0315008z.class, str);
    }

    public EnumC0315008z(String str, int i) {
    }
}
