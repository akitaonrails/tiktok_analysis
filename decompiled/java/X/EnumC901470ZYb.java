package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901470ZYb {
    public static final EnumC901470ZYb LLILZIL;
    public static final EnumC901470ZYb LLILZLL;
    public static final EnumC901470ZYb LLIZ;
    public static final EnumC901470ZYb LLIZLLLIL;
    public static final /* synthetic */ EnumC901470ZYb[] LLJ;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    static {
        EnumC901470ZYb enumC901470ZYb = new EnumC901470ZYb("DARK_SEND", 0, 255, 255, 255, 87);
        LLILZIL = enumC901470ZYb;
        EnumC901470ZYb enumC901470ZYb2 = new EnumC901470ZYb("DARK_RECEIVE", 1, 255, 255, 255, 87);
        LLILZLL = enumC901470ZYb2;
        EnumC901470ZYb enumC901470ZYb3 = new EnumC901470ZYb("LIGHT_SEND", 2, 255, 255, 255, 87);
        LLIZ = enumC901470ZYb3;
        EnumC901470ZYb enumC901470ZYb4 = new EnumC901470ZYb("LIGHT_RECEIVE", 3, 16, 162, 197, 77);
        LLIZLLLIL = enumC901470ZYb4;
        EnumC901470ZYb[] enumC901470ZYbArr = {enumC901470ZYb, enumC901470ZYb2, enumC901470ZYb3, enumC901470ZYb4};
        LLJ = enumC901470ZYbArr;
        new C2254308sP(enumC901470ZYbArr);
    }

    public static EnumC901470ZYb[] values() {
        return (EnumC901470ZYb[]) LLJ.clone();
    }

    public static EnumC901470ZYb valueOf(String str) {
        return (EnumC901470ZYb) C08FF.LIZ(EnumC901470ZYb.class, str);
    }

    public EnumC901470ZYb(String str, int i, int i2, int i3, int i4, int i5) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = i5;
    }
}
