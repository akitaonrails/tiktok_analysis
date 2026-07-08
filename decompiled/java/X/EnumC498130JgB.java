package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC498130JgB {
    public static final EnumC498130JgB LL;
    public static final EnumC498130JgB LLILLJJLI;
    public static final EnumC498130JgB LLILLL;
    public static final /* synthetic */ EnumC498130JgB[] LLILZ;

    static {
        EnumC498130JgB enumC498130JgB = new EnumC498130JgB("PRIVILEGE", 0);
        LL = enumC498130JgB;
        EnumC498130JgB enumC498130JgB2 = new EnumC498130JgB("MANAGE", 1);
        LLILLJJLI = enumC498130JgB2;
        EnumC498130JgB enumC498130JgB3 = new EnumC498130JgB("REPORT", 2);
        LLILLL = enumC498130JgB3;
        EnumC498130JgB[] enumC498130JgBArr = {enumC498130JgB, enumC498130JgB2, enumC498130JgB3};
        LLILZ = enumC498130JgBArr;
        new C2254308sP(enumC498130JgBArr);
    }

    public static EnumC498130JgB[] values() {
        return (EnumC498130JgB[]) LLILZ.clone();
    }

    public static EnumC498130JgB valueOf(String str) {
        return (EnumC498130JgB) C08FF.LIZ(EnumC498130JgB.class, str);
    }

    public EnumC498130JgB(String str, int i) {
    }
}
