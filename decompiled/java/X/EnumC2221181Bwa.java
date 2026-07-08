package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Bwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2221181Bwa {
    public static final EnumC2221181Bwa LL;
    public static final EnumC2221181Bwa LLILLJJLI;
    public static final EnumC2221181Bwa LLILLL;
    public static final /* synthetic */ EnumC2221181Bwa[] LLILZ;

    static {
        EnumC2221181Bwa enumC2221181Bwa = new EnumC2221181Bwa("READ", 0);
        LL = enumC2221181Bwa;
        EnumC2221181Bwa enumC2221181Bwa2 = new EnumC2221181Bwa("WRITE", 1);
        LLILLJJLI = enumC2221181Bwa2;
        EnumC2221181Bwa enumC2221181Bwa3 = new EnumC2221181Bwa("SAVE_SRC", 2);
        LLILLL = enumC2221181Bwa3;
        EnumC2221181Bwa[] enumC2221181BwaArr = {enumC2221181Bwa, enumC2221181Bwa2, enumC2221181Bwa3};
        LLILZ = enumC2221181BwaArr;
        new C2254308sP(enumC2221181BwaArr);
    }

    public static EnumC2221181Bwa[] values() {
        return (EnumC2221181Bwa[]) LLILZ.clone();
    }

    public static EnumC2221181Bwa valueOf(String str) {
        return (EnumC2221181Bwa) C08FF.LIZ(EnumC2221181Bwa.class, str);
    }

    public EnumC2221181Bwa(String str, int i) {
    }
}
