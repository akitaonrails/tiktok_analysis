package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1420440n4E {
    public static final EnumC1420440n4E LL;
    public static final EnumC1420440n4E LLILLJJLI;
    public static final EnumC1420440n4E LLILLL;
    public static final /* synthetic */ EnumC1420440n4E[] LLILZ;

    static {
        EnumC1420440n4E enumC1420440n4E = new EnumC1420440n4E("RUNNING", 0);
        LL = enumC1420440n4E;
        EnumC1420440n4E enumC1420440n4E2 = new EnumC1420440n4E("SUCCESS", 1);
        LLILLJJLI = enumC1420440n4E2;
        EnumC1420440n4E enumC1420440n4E3 = new EnumC1420440n4E("FAIL", 2);
        LLILLL = enumC1420440n4E3;
        EnumC1420440n4E[] enumC1420440n4EArr = {enumC1420440n4E, enumC1420440n4E2, enumC1420440n4E3, new EnumC1420440n4E("CANCELLED", 3)};
        LLILZ = enumC1420440n4EArr;
        new C2254308sP(enumC1420440n4EArr);
    }

    public static EnumC1420440n4E[] values() {
        return (EnumC1420440n4E[]) LLILZ.clone();
    }

    public static EnumC1420440n4E valueOf(String str) {
        return (EnumC1420440n4E) C08FF.LIZ(EnumC1420440n4E.class, str);
    }

    public EnumC1420440n4E(String str, int i) {
    }
}
