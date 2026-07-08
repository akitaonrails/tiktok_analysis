package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20009313Qt {
    public static final EnumC20009313Qt Ascii;
    public static final EnumC20009313Qt Base64;
    public static final /* synthetic */ EnumC20009313Qt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20009313Qt Utf8;

    public static InterfaceC2044707zh<EnumC20009313Qt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20009313Qt enumC20009313Qt = new EnumC20009313Qt("Utf8", 0);
        Utf8 = enumC20009313Qt;
        EnumC20009313Qt enumC20009313Qt2 = new EnumC20009313Qt("Ascii", 1);
        Ascii = enumC20009313Qt2;
        EnumC20009313Qt enumC20009313Qt3 = new EnumC20009313Qt("Base64", 2);
        Base64 = enumC20009313Qt3;
        EnumC20009313Qt[] enumC20009313QtArr = {enumC20009313Qt, enumC20009313Qt2, enumC20009313Qt3};
        LL = enumC20009313QtArr;
        LLILLJJLI = new C2254308sP(enumC20009313QtArr);
    }

    public static EnumC20009313Qt[] values() {
        return (EnumC20009313Qt[]) LL.clone();
    }

    public static EnumC20009313Qt valueOf(String str) {
        return (EnumC20009313Qt) C08FF.LIZ(EnumC20009313Qt.class, str);
    }

    public EnumC20009313Qt(String str, int i) {
    }
}
