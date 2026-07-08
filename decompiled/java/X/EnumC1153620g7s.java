package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153620g7s {
    public static final EnumC1153620g7s DISABLE_SCROLL;
    public static final /* synthetic */ EnumC1153620g7s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153620g7s UNINITIALIZED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153620g7s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153620g7s enumC1153620g7s = new EnumC1153620g7s("UNINITIALIZED", 0, -2);
        UNINITIALIZED = enumC1153620g7s;
        EnumC1153620g7s enumC1153620g7s2 = new EnumC1153620g7s("DISABLE_SCROLL", 1, -1);
        DISABLE_SCROLL = enumC1153620g7s2;
        EnumC1153620g7s[] enumC1153620g7sArr = {enumC1153620g7s, enumC1153620g7s2};
        LLILLJJLI = enumC1153620g7sArr;
        LLILLL = new C2254308sP(enumC1153620g7sArr);
    }

    public static EnumC1153620g7s[] values() {
        return (EnumC1153620g7s[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153620g7s valueOf(String str) {
        return (EnumC1153620g7s) C08FF.LIZ(EnumC1153620g7s.class, str);
    }

    public EnumC1153620g7s(String str, int i, int i2) {
        this.LL = i2;
    }
}
