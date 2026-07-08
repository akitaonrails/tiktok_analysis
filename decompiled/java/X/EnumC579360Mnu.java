package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC579360Mnu implements InterfaceC579410Mnz {
    public static final EnumC579360Mnu LL;
    public static final EnumC579360Mnu LLILLJJLI;
    public static final EnumC579360Mnu LLILLL;
    public static final EnumC579360Mnu LLILZ;
    public static final EnumC579360Mnu LLILZIL;
    public static final EnumC579360Mnu LLILZLL;
    public static final /* synthetic */ EnumC579360Mnu[] LLIZ;

    static {
        EnumC579360Mnu enumC579360Mnu = new EnumC579360Mnu("DISABLED", 0);
        LL = enumC579360Mnu;
        EnumC579360Mnu enumC579360Mnu2 = new EnumC579360Mnu("PREPARING", 1);
        LLILLJJLI = enumC579360Mnu2;
        EnumC579360Mnu enumC579360Mnu3 = new EnumC579360Mnu("ENABLED_READY", 2);
        LLILLL = enumC579360Mnu3;
        EnumC579360Mnu enumC579360Mnu4 = new EnumC579360Mnu("ENABLED_UPDATING", 3);
        LLILZ = enumC579360Mnu4;
        EnumC579360Mnu enumC579360Mnu5 = new EnumC579360Mnu("COMPILING", 4);
        LLILZIL = enumC579360Mnu5;
        EnumC579360Mnu enumC579360Mnu6 = new EnumC579360Mnu("ON_EDIT", 5);
        LLILZLL = enumC579360Mnu6;
        EnumC579360Mnu[] enumC579360MnuArr = {enumC579360Mnu, enumC579360Mnu2, enumC579360Mnu3, enumC579360Mnu4, enumC579360Mnu5, enumC579360Mnu6};
        LLIZ = enumC579360MnuArr;
        new C2254308sP(enumC579360MnuArr);
    }

    public static EnumC579360Mnu[] values() {
        return (EnumC579360Mnu[]) LLIZ.clone();
    }

    public static EnumC579360Mnu valueOf(String str) {
        return (EnumC579360Mnu) C08FF.LIZ(EnumC579360Mnu.class, str);
    }

    public EnumC579360Mnu(String str, int i) {
    }
}
