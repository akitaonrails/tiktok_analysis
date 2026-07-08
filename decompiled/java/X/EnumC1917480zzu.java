package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1917480zzu {
    public static final EnumC1917480zzu EXTERNAL_APPEAL_WEB;
    public static final EnumC1917480zzu EXTERNAL_WEB;
    public static final EnumC1917480zzu INTERNAL_APPEAL_WEB;
    public static final EnumC1917480zzu INTERNAL_WEB;
    public static final /* synthetic */ EnumC1917480zzu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1917480zzu LOGOUT;
    public static final EnumC1917480zzu NATIVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1917480zzu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1917480zzu enumC1917480zzu = new EnumC1917480zzu("LOGOUT", 0, 0);
        LOGOUT = enumC1917480zzu;
        EnumC1917480zzu enumC1917480zzu2 = new EnumC1917480zzu("INTERNAL_WEB", 1, 1);
        INTERNAL_WEB = enumC1917480zzu2;
        EnumC1917480zzu enumC1917480zzu3 = new EnumC1917480zzu("EXTERNAL_WEB", 2, 2);
        EXTERNAL_WEB = enumC1917480zzu3;
        EnumC1917480zzu enumC1917480zzu4 = new EnumC1917480zzu("NATIVE", 3, 3);
        NATIVE = enumC1917480zzu4;
        EnumC1917480zzu enumC1917480zzu5 = new EnumC1917480zzu("INTERNAL_APPEAL_WEB", 4, 4);
        INTERNAL_APPEAL_WEB = enumC1917480zzu5;
        EnumC1917480zzu enumC1917480zzu6 = new EnumC1917480zzu("EXTERNAL_APPEAL_WEB", 5, 5);
        EXTERNAL_APPEAL_WEB = enumC1917480zzu6;
        EnumC1917480zzu[] enumC1917480zzuArr = {enumC1917480zzu, enumC1917480zzu2, enumC1917480zzu3, enumC1917480zzu4, enumC1917480zzu5, enumC1917480zzu6};
        LLILLJJLI = enumC1917480zzuArr;
        LLILLL = new C2254308sP(enumC1917480zzuArr);
    }

    public static EnumC1917480zzu[] values() {
        return (EnumC1917480zzu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1917480zzu valueOf(String str) {
        return (EnumC1917480zzu) C08FF.LIZ(EnumC1917480zzu.class, str);
    }

    public EnumC1917480zzu(String str, int i, int i2) {
        this.LL = i2;
    }
}
