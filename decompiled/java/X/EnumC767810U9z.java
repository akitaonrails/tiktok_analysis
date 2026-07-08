package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC767810U9z {
    public static final EnumC767810U9z ALBUM;
    public static final EnumC767810U9z AVATAR;
    public static final EnumC767810U9z GREEN_SCREEN;
    public static final /* synthetic */ EnumC767810U9z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC767810U9z NORMAL;

    public static InterfaceC2044707zh<EnumC767810U9z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC767810U9z enumC767810U9z = new EnumC767810U9z("NORMAL", 0);
        NORMAL = enumC767810U9z;
        EnumC767810U9z enumC767810U9z2 = new EnumC767810U9z("ALBUM", 1);
        ALBUM = enumC767810U9z2;
        EnumC767810U9z enumC767810U9z3 = new EnumC767810U9z("GREEN_SCREEN", 2);
        GREEN_SCREEN = enumC767810U9z3;
        EnumC767810U9z enumC767810U9z4 = new EnumC767810U9z("AVATAR", 3);
        AVATAR = enumC767810U9z4;
        EnumC767810U9z[] enumC767810U9zArr = {enumC767810U9z, enumC767810U9z2, enumC767810U9z3, enumC767810U9z4};
        LL = enumC767810U9zArr;
        LLILLJJLI = new C2254308sP(enumC767810U9zArr);
    }

    public static EnumC767810U9z[] values() {
        return (EnumC767810U9z[]) LL.clone();
    }

    public static EnumC767810U9z valueOf(String str) {
        return (EnumC767810U9z) C08FF.LIZ(EnumC767810U9z.class, str);
    }

    public EnumC767810U9z(String str, int i) {
    }
}
