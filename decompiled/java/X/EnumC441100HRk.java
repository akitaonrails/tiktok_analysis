package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441100HRk {
    public static final EnumC441100HRk LL;
    public static final EnumC441100HRk LLILLJJLI;
    public static final EnumC441100HRk LLILLL;
    public static final EnumC441100HRk LLILZ;
    public static final /* synthetic */ EnumC441100HRk[] LLILZIL;

    static {
        EnumC441100HRk enumC441100HRk = new EnumC441100HRk("CREATED", 0);
        LL = enumC441100HRk;
        EnumC441100HRk enumC441100HRk2 = new EnumC441100HRk("NOT_CREATED", 1);
        LLILLJJLI = enumC441100HRk2;
        EnumC441100HRk enumC441100HRk3 = new EnumC441100HRk("IN_PROGRESS", 2);
        LLILLL = enumC441100HRk3;
        EnumC441100HRk enumC441100HRk4 = new EnumC441100HRk("CO_CREATED", 3);
        LLILZ = enumC441100HRk4;
        EnumC441100HRk[] enumC441100HRkArr = {enumC441100HRk, enumC441100HRk2, enumC441100HRk3, enumC441100HRk4};
        LLILZIL = enumC441100HRkArr;
        new C2254308sP(enumC441100HRkArr);
    }

    public static EnumC441100HRk[] values() {
        return (EnumC441100HRk[]) LLILZIL.clone();
    }

    public static EnumC441100HRk valueOf(String str) {
        return (EnumC441100HRk) C08FF.LIZ(EnumC441100HRk.class, str);
    }

    public EnumC441100HRk(String str, int i) {
    }
}
