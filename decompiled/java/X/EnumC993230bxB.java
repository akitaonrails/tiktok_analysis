package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993230bxB {
    public static final EnumC993230bxB AUTHORIZED;
    public static final /* synthetic */ EnumC993230bxB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993230bxB UNAUTHORIZED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993230bxB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993230bxB enumC993230bxB = new EnumC993230bxB("UNAUTHORIZED", 0, 0);
        UNAUTHORIZED = enumC993230bxB;
        EnumC993230bxB enumC993230bxB2 = new EnumC993230bxB("AUTHORIZED", 1, 1);
        AUTHORIZED = enumC993230bxB2;
        EnumC993230bxB[] enumC993230bxBArr = {enumC993230bxB, enumC993230bxB2};
        LLILLJJLI = enumC993230bxBArr;
        LLILLL = new C2254308sP(enumC993230bxBArr);
    }

    public static EnumC993230bxB[] values() {
        return (EnumC993230bxB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993230bxB valueOf(String str) {
        return (EnumC993230bxB) C08FF.LIZ(EnumC993230bxB.class, str);
    }

    public EnumC993230bxB(String str, int i, int i2) {
        this.LL = i2;
    }
}
