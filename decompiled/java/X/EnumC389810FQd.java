package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC389810FQd {
    public static final EnumC389810FQd BOTTOM;
    public static final EnumC389810FQd LEFT;
    public static final EnumC389810FQd LEFT_BOTTOM;
    public static final EnumC389810FQd LEFT_TOP;
    public static final /* synthetic */ EnumC389810FQd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC389810FQd OUT_OF_BOUNDS;
    public static final EnumC389810FQd RIGHT;
    public static final EnumC389810FQd RIGHT_BOTTOM;
    public static final EnumC389810FQd RIGHT_TOP;
    public static final EnumC389810FQd TOP;

    public static InterfaceC2044707zh<EnumC389810FQd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC389810FQd enumC389810FQd = new EnumC389810FQd("LEFT_TOP", 0);
        LEFT_TOP = enumC389810FQd;
        EnumC389810FQd enumC389810FQd2 = new EnumC389810FQd("RIGHT_TOP", 1);
        RIGHT_TOP = enumC389810FQd2;
        EnumC389810FQd enumC389810FQd3 = new EnumC389810FQd("LEFT_BOTTOM", 2);
        LEFT_BOTTOM = enumC389810FQd3;
        EnumC389810FQd enumC389810FQd4 = new EnumC389810FQd("RIGHT_BOTTOM", 3);
        RIGHT_BOTTOM = enumC389810FQd4;
        EnumC389810FQd enumC389810FQd5 = new EnumC389810FQd("OUT_OF_BOUNDS", 4);
        OUT_OF_BOUNDS = enumC389810FQd5;
        EnumC389810FQd enumC389810FQd6 = new EnumC389810FQd("LEFT", 5);
        LEFT = enumC389810FQd6;
        EnumC389810FQd enumC389810FQd7 = new EnumC389810FQd("TOP", 6);
        TOP = enumC389810FQd7;
        EnumC389810FQd enumC389810FQd8 = new EnumC389810FQd("RIGHT", 7);
        RIGHT = enumC389810FQd8;
        EnumC389810FQd enumC389810FQd9 = new EnumC389810FQd("BOTTOM", 8);
        BOTTOM = enumC389810FQd9;
        EnumC389810FQd[] enumC389810FQdArr = {enumC389810FQd, enumC389810FQd2, enumC389810FQd3, enumC389810FQd4, enumC389810FQd5, enumC389810FQd6, enumC389810FQd7, enumC389810FQd8, enumC389810FQd9};
        LL = enumC389810FQdArr;
        LLILLJJLI = new C2254308sP(enumC389810FQdArr);
    }

    public static EnumC389810FQd[] values() {
        return (EnumC389810FQd[]) LL.clone();
    }

    public static EnumC389810FQd valueOf(String str) {
        return (EnumC389810FQd) C08FF.LIZ(EnumC389810FQd.class, str);
    }

    public EnumC389810FQd(String str, int i) {
    }
}
