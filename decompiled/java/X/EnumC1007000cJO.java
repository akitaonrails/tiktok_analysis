package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007000cJO {
    public static final EnumC1007000cJO LL;
    public static final EnumC1007000cJO LLILLJJLI;
    public static final EnumC1007000cJO LLILLL;
    public static final /* synthetic */ EnumC1007000cJO[] LLILZ;

    static {
        EnumC1007000cJO enumC1007000cJO = new EnumC1007000cJO("INITIAL", 0);
        LL = enumC1007000cJO;
        EnumC1007000cJO enumC1007000cJO2 = new EnumC1007000cJO("SHOWN", 1);
        LLILLJJLI = enumC1007000cJO2;
        EnumC1007000cJO enumC1007000cJO3 = new EnumC1007000cJO("CONSUMED", 2);
        LLILLL = enumC1007000cJO3;
        EnumC1007000cJO[] enumC1007000cJOArr = {enumC1007000cJO, enumC1007000cJO2, enumC1007000cJO3};
        LLILZ = enumC1007000cJOArr;
        new C2254308sP(enumC1007000cJOArr);
    }

    public static EnumC1007000cJO[] values() {
        return (EnumC1007000cJO[]) LLILZ.clone();
    }

    public static EnumC1007000cJO valueOf(String str) {
        return (EnumC1007000cJO) C08FF.LIZ(EnumC1007000cJO.class, str);
    }

    public EnumC1007000cJO(String str, int i) {
    }
}
