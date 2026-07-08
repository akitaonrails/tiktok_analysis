package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1004970cG7 {
    public static final EnumC1004970cG7 LL;
    public static final EnumC1004970cG7 LLILLJJLI;
    public static final EnumC1004970cG7 LLILLL;
    public static final /* synthetic */ EnumC1004970cG7[] LLILZ;

    static {
        EnumC1004970cG7 enumC1004970cG7 = new EnumC1004970cG7("INITIAL", 0);
        LL = enumC1004970cG7;
        EnumC1004970cG7 enumC1004970cG72 = new EnumC1004970cG7("SHOWN", 1);
        LLILLJJLI = enumC1004970cG72;
        EnumC1004970cG7 enumC1004970cG73 = new EnumC1004970cG7("HIGHLIGHTED", 2);
        LLILLL = enumC1004970cG73;
        EnumC1004970cG7[] enumC1004970cG7Arr = {enumC1004970cG7, enumC1004970cG72, enumC1004970cG73, new EnumC1004970cG7("PROMPTED", 3)};
        LLILZ = enumC1004970cG7Arr;
        new C2254308sP(enumC1004970cG7Arr);
    }

    public static EnumC1004970cG7[] values() {
        return (EnumC1004970cG7[]) LLILZ.clone();
    }

    public static EnumC1004970cG7 valueOf(String str) {
        return (EnumC1004970cG7) C08FF.LIZ(EnumC1004970cG7.class, str);
    }

    public EnumC1004970cG7(String str, int i) {
    }
}
