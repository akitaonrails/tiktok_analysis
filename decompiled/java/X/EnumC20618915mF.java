package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20618915mF {
    public static final /* synthetic */ EnumC20618915mF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20618915mF SEARCH;
    public static final EnumC20618915mF VERTICAL_LOW;
    public static final EnumC20618915mF VERTICAL_NONE;
    public static final EnumC20618915mF VERTICAL_NORMAL;

    public static InterfaceC2044707zh<EnumC20618915mF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20618915mF enumC20618915mF = new EnumC20618915mF("VERTICAL_NONE", 0);
        VERTICAL_NONE = enumC20618915mF;
        EnumC20618915mF enumC20618915mF2 = new EnumC20618915mF("VERTICAL_LOW", 1);
        VERTICAL_LOW = enumC20618915mF2;
        EnumC20618915mF enumC20618915mF3 = new EnumC20618915mF("VERTICAL_NORMAL", 2);
        VERTICAL_NORMAL = enumC20618915mF3;
        EnumC20618915mF enumC20618915mF4 = new EnumC20618915mF("SEARCH", 3);
        SEARCH = enumC20618915mF4;
        EnumC20618915mF[] enumC20618915mFArr = {enumC20618915mF, enumC20618915mF2, enumC20618915mF3, enumC20618915mF4};
        LL = enumC20618915mFArr;
        LLILLJJLI = new C2254308sP(enumC20618915mFArr);
    }

    public static EnumC20618915mF[] values() {
        return (EnumC20618915mF[]) LL.clone();
    }

    public static EnumC20618915mF valueOf(String str) {
        return (EnumC20618915mF) C08FF.LIZ(EnumC20618915mF.class, str);
    }

    public EnumC20618915mF(String str, int i) {
    }
}
