package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159920gI2 {
    public static final EnumC1159920gI2 LL;
    public static final EnumC1159920gI2 LLILLJJLI;
    public static final EnumC1159920gI2 LLILLL;
    public static final /* synthetic */ EnumC1159920gI2[] LLILZ;

    static {
        EnumC1159920gI2 enumC1159920gI2 = new EnumC1159920gI2("NONE", 0);
        LL = enumC1159920gI2;
        EnumC1159920gI2 enumC1159920gI22 = new EnumC1159920gI2("HIDDEN", 1);
        LLILLJJLI = enumC1159920gI22;
        EnumC1159920gI2 enumC1159920gI23 = new EnumC1159920gI2("DISABLED", 2);
        LLILLL = enumC1159920gI23;
        EnumC1159920gI2[] enumC1159920gI2Arr = {enumC1159920gI2, enumC1159920gI22, enumC1159920gI23};
        LLILZ = enumC1159920gI2Arr;
        new C2254308sP(enumC1159920gI2Arr);
    }

    public static EnumC1159920gI2[] values() {
        return (EnumC1159920gI2[]) LLILZ.clone();
    }

    public static EnumC1159920gI2 valueOf(String str) {
        return (EnumC1159920gI2) C08FF.LIZ(EnumC1159920gI2.class, str);
    }

    public EnumC1159920gI2(String str, int i) {
    }
}
