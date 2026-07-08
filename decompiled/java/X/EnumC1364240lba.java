package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364240lba {
    public static final EnumC1364240lba LL;
    public static final EnumC1364240lba LLILLJJLI;
    public static final /* synthetic */ EnumC1364240lba[] LLILLL;

    static {
        EnumC1364240lba enumC1364240lba = new EnumC1364240lba("NONE", 0);
        LL = enumC1364240lba;
        EnumC1364240lba enumC1364240lba2 = new EnumC1364240lba("SELECTED", 1);
        LLILLJJLI = enumC1364240lba2;
        EnumC1364240lba[] enumC1364240lbaArr = {enumC1364240lba, enumC1364240lba2};
        LLILLL = enumC1364240lbaArr;
        new C2254308sP(enumC1364240lbaArr);
    }

    public static EnumC1364240lba[] values() {
        return (EnumC1364240lba[]) LLILLL.clone();
    }

    public static EnumC1364240lba valueOf(String str) {
        return (EnumC1364240lba) C08FF.LIZ(EnumC1364240lba.class, str);
    }

    public EnumC1364240lba(String str, int i) {
    }
}
