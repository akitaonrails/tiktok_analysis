package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1616060s9k {
    public static final EnumC1616060s9k LL;
    public static final EnumC1616060s9k LLILLJJLI;
    public static final /* synthetic */ EnumC1616060s9k[] LLILLL;

    static {
        EnumC1616060s9k enumC1616060s9k = new EnumC1616060s9k("SELECTED", 0);
        LL = enumC1616060s9k;
        EnumC1616060s9k enumC1616060s9k2 = new EnumC1616060s9k("UNSELECTED", 1);
        LLILLJJLI = enumC1616060s9k2;
        EnumC1616060s9k[] enumC1616060s9kArr = {enumC1616060s9k, enumC1616060s9k2};
        LLILLL = enumC1616060s9kArr;
        new C2254308sP(enumC1616060s9kArr);
    }

    public static EnumC1616060s9k[] values() {
        return (EnumC1616060s9k[]) LLILLL.clone();
    }

    public static EnumC1616060s9k valueOf(String str) {
        return (EnumC1616060s9k) C08FF.LIZ(EnumC1616060s9k.class, str);
    }

    public EnumC1616060s9k(String str, int i) {
    }
}
