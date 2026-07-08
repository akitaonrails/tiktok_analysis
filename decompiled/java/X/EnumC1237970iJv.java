package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237970iJv {
    public static final EnumC1237970iJv CHANGE;
    public static final EnumC1237970iJv CONTINUE;
    public static final /* synthetic */ EnumC1237970iJv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237970iJv LOGOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1237970iJv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237970iJv enumC1237970iJv = new EnumC1237970iJv("CONTINUE", 0, 1);
        CONTINUE = enumC1237970iJv;
        EnumC1237970iJv enumC1237970iJv2 = new EnumC1237970iJv("CHANGE", 1, 2);
        CHANGE = enumC1237970iJv2;
        EnumC1237970iJv enumC1237970iJv3 = new EnumC1237970iJv("LOGOUT", 2, 3);
        LOGOUT = enumC1237970iJv3;
        EnumC1237970iJv[] enumC1237970iJvArr = {enumC1237970iJv, enumC1237970iJv2, enumC1237970iJv3};
        LLILLJJLI = enumC1237970iJvArr;
        LLILLL = new C2254308sP(enumC1237970iJvArr);
    }

    public static EnumC1237970iJv[] values() {
        return (EnumC1237970iJv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1237970iJv valueOf(String str) {
        return (EnumC1237970iJv) C08FF.LIZ(EnumC1237970iJv.class, str);
    }

    public EnumC1237970iJv(String str, int i, int i2) {
        this.LL = i2;
    }
}
