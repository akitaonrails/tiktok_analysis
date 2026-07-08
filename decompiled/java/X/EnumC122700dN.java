package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC122700dN {
    public static final EnumC122700dN CAMERA_BUTTON;
    public static final EnumC122700dN FAVORITE;
    public static final /* synthetic */ EnumC122700dN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC122700dN RECENTLY;
    public static final EnumC122700dN TRENDING;

    public static InterfaceC2044707zh<EnumC122700dN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC122700dN enumC122700dN = new EnumC122700dN("FAVORITE", 0);
        FAVORITE = enumC122700dN;
        EnumC122700dN enumC122700dN2 = new EnumC122700dN("RECENTLY", 1);
        RECENTLY = enumC122700dN2;
        EnumC122700dN enumC122700dN3 = new EnumC122700dN("CAMERA_BUTTON", 2);
        CAMERA_BUTTON = enumC122700dN3;
        EnumC122700dN enumC122700dN4 = new EnumC122700dN("TRENDING", 3);
        TRENDING = enumC122700dN4;
        EnumC122700dN[] enumC122700dNArr = {enumC122700dN, enumC122700dN2, enumC122700dN3, enumC122700dN4};
        LL = enumC122700dNArr;
        LLILLJJLI = new C2254308sP(enumC122700dNArr);
    }

    public static EnumC122700dN[] values() {
        return (EnumC122700dN[]) LL.clone();
    }

    public static EnumC122700dN valueOf(String str) {
        return (EnumC122700dN) C08FF.LIZ(EnumC122700dN.class, str);
    }

    public EnumC122700dN(String str, int i) {
    }
}
