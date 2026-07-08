package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19356910oB {
    public static final EnumC19356910oB ALWAYS;
    public static final /* synthetic */ EnumC19356910oB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19356910oB NONE;
    public static final EnumC19356910oB ONLY_BOTTOM;
    public static final EnumC19356910oB ONLY_LEFT;
    public static final EnumC19356910oB ONLY_RIGHT;
    public static final EnumC19356910oB ONLY_TOP;

    public static InterfaceC2044707zh<EnumC19356910oB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19356910oB enumC19356910oB = new EnumC19356910oB("ONLY_LEFT", 0);
        ONLY_LEFT = enumC19356910oB;
        EnumC19356910oB enumC19356910oB2 = new EnumC19356910oB("ONLY_RIGHT", 1);
        ONLY_RIGHT = enumC19356910oB2;
        EnumC19356910oB enumC19356910oB3 = new EnumC19356910oB("ALWAYS", 2);
        ALWAYS = enumC19356910oB3;
        EnumC19356910oB enumC19356910oB4 = new EnumC19356910oB("NONE", 3);
        NONE = enumC19356910oB4;
        EnumC19356910oB enumC19356910oB5 = new EnumC19356910oB("ONLY_TOP", 4);
        ONLY_TOP = enumC19356910oB5;
        EnumC19356910oB enumC19356910oB6 = new EnumC19356910oB("ONLY_BOTTOM", 5);
        ONLY_BOTTOM = enumC19356910oB6;
        EnumC19356910oB[] enumC19356910oBArr = {enumC19356910oB, enumC19356910oB2, enumC19356910oB3, enumC19356910oB4, enumC19356910oB5, enumC19356910oB6};
        LL = enumC19356910oBArr;
        LLILLJJLI = new C2254308sP(enumC19356910oBArr);
    }

    public static EnumC19356910oB[] values() {
        return (EnumC19356910oB[]) LL.clone();
    }

    public static EnumC19356910oB valueOf(String str) {
        return (EnumC19356910oB) C08FF.LIZ(EnumC19356910oB.class, str);
    }

    public EnumC19356910oB(String str, int i) {
    }
}
