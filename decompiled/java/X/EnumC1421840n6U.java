package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1421840n6U {
    public static final C1421830n6T Companion;
    public static final EnumC1421840n6U HORIZONTAL;
    public static final /* synthetic */ EnumC1421840n6U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1421840n6U VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1421840n6U> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1421840n6U enumC1421840n6U = new EnumC1421840n6U("VERTICAL", 0, 0);
        VERTICAL = enumC1421840n6U;
        EnumC1421840n6U enumC1421840n6U2 = new EnumC1421840n6U("HORIZONTAL", 1, 1);
        HORIZONTAL = enumC1421840n6U2;
        EnumC1421840n6U[] enumC1421840n6UArr = {enumC1421840n6U, enumC1421840n6U2};
        LLILLJJLI = enumC1421840n6UArr;
        LLILLL = new C2254308sP(enumC1421840n6UArr);
        Companion = new C1421830n6T();
    }

    public static EnumC1421840n6U[] values() {
        return (EnumC1421840n6U[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1421840n6U valueOf(String str) {
        return (EnumC1421840n6U) C08FF.LIZ(EnumC1421840n6U.class, str);
    }

    public EnumC1421840n6U(String str, int i, int i2) {
        this.LL = i2;
    }
}
