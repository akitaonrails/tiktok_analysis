package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC733580Sq4 {
    public static final EnumC733580Sq4 CONTACT;
    public static final EnumC733580Sq4 EXTERNAL;
    public static final /* synthetic */ EnumC733580Sq4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC733580Sq4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC733580Sq4 enumC733580Sq4 = new EnumC733580Sq4("EXTERNAL", 0);
        EXTERNAL = enumC733580Sq4;
        EnumC733580Sq4 enumC733580Sq42 = new EnumC733580Sq4("CONTACT", 1);
        CONTACT = enumC733580Sq42;
        EnumC733580Sq4[] enumC733580Sq4Arr = {enumC733580Sq4, enumC733580Sq42};
        LL = enumC733580Sq4Arr;
        LLILLJJLI = new C2254308sP(enumC733580Sq4Arr);
    }

    public static EnumC733580Sq4[] values() {
        return (EnumC733580Sq4[]) LL.clone();
    }

    public static EnumC733580Sq4 valueOf(String str) {
        return (EnumC733580Sq4) C08FF.LIZ(EnumC733580Sq4.class, str);
    }

    public EnumC733580Sq4(String str, int i) {
    }
}
