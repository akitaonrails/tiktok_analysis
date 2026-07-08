package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC659760PuI {
    public static final /* synthetic */ EnumC659760PuI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC659760PuI PHOTO;
    public static final EnumC659760PuI VIDEO;

    public static InterfaceC2044707zh<EnumC659760PuI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC659760PuI enumC659760PuI = new EnumC659760PuI("VIDEO", 0);
        VIDEO = enumC659760PuI;
        EnumC659760PuI enumC659760PuI2 = new EnumC659760PuI("PHOTO", 1);
        PHOTO = enumC659760PuI2;
        EnumC659760PuI[] enumC659760PuIArr = {enumC659760PuI, enumC659760PuI2};
        LL = enumC659760PuIArr;
        LLILLJJLI = new C2254308sP(enumC659760PuIArr);
    }

    public static EnumC659760PuI[] values() {
        return (EnumC659760PuI[]) LL.clone();
    }

    public static EnumC659760PuI valueOf(String str) {
        return (EnumC659760PuI) C08FF.LIZ(EnumC659760PuI.class, str);
    }

    public EnumC659760PuI(String str, int i) {
    }
}
