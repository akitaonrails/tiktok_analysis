package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC448480HiI {
    public static final EnumC448480HiI DELETE_FOR_EVERYONE;
    public static final /* synthetic */ EnumC448480HiI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC448480HiI REMOVE_MY_PHOTOS;

    public static InterfaceC2044707zh<EnumC448480HiI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC448480HiI enumC448480HiI = new EnumC448480HiI("REMOVE_MY_PHOTOS", 0);
        REMOVE_MY_PHOTOS = enumC448480HiI;
        EnumC448480HiI enumC448480HiI2 = new EnumC448480HiI("DELETE_FOR_EVERYONE", 1);
        DELETE_FOR_EVERYONE = enumC448480HiI2;
        EnumC448480HiI[] enumC448480HiIArr = {enumC448480HiI, enumC448480HiI2};
        LL = enumC448480HiIArr;
        LLILLJJLI = new C2254308sP(enumC448480HiIArr);
    }

    public static EnumC448480HiI[] values() {
        return (EnumC448480HiI[]) LL.clone();
    }

    public static EnumC448480HiI valueOf(String str) {
        return (EnumC448480HiI) C08FF.LIZ(EnumC448480HiI.class, str);
    }

    public EnumC448480HiI(String str, int i) {
    }
}
