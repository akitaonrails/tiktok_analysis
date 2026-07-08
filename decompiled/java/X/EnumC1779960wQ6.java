package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779960wQ6 {
    public static final /* synthetic */ EnumC1779960wQ6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779960wQ6 REGULAR;
    public static final EnumC1779960wQ6 THICK;

    public static InterfaceC2044707zh<EnumC1779960wQ6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779960wQ6 enumC1779960wQ6 = new EnumC1779960wQ6("REGULAR", 0);
        REGULAR = enumC1779960wQ6;
        EnumC1779960wQ6 enumC1779960wQ62 = new EnumC1779960wQ6("THICK", 1);
        THICK = enumC1779960wQ62;
        EnumC1779960wQ6[] enumC1779960wQ6Arr = {enumC1779960wQ6, enumC1779960wQ62};
        LL = enumC1779960wQ6Arr;
        LLILLJJLI = new C2254308sP(enumC1779960wQ6Arr);
    }

    public static EnumC1779960wQ6[] values() {
        return (EnumC1779960wQ6[]) LL.clone();
    }

    public static EnumC1779960wQ6 valueOf(String str) {
        return (EnumC1779960wQ6) C08FF.LIZ(EnumC1779960wQ6.class, str);
    }

    public EnumC1779960wQ6(String str, int i) {
    }
}
