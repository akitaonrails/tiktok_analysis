package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901300ZXk {
    public static final /* synthetic */ EnumC901300ZXk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC901300ZXk ORIGINAL;
    public static final EnumC901300ZXk TRANSLATED;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC901300ZXk> getEntries() {
        return LLILZ;
    }

    static {
        EnumC901300ZXk enumC901300ZXk = new EnumC901300ZXk("ORIGINAL", 0, "original", "message");
        ORIGINAL = enumC901300ZXk;
        EnumC901300ZXk enumC901300ZXk2 = new EnumC901300ZXk("TRANSLATED", 1, "translated", "translated");
        TRANSLATED = enumC901300ZXk2;
        EnumC901300ZXk[] enumC901300ZXkArr = {enumC901300ZXk, enumC901300ZXk2};
        LLILLL = enumC901300ZXkArr;
        LLILZ = new C2254308sP(enumC901300ZXkArr);
    }

    public static EnumC901300ZXk[] values() {
        return (EnumC901300ZXk[]) LLILLL.clone();
    }

    public final String getEtValue() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC901300ZXk valueOf(String str) {
        return (EnumC901300ZXk) C08FF.LIZ(EnumC901300ZXk.class, str);
    }

    public EnumC901300ZXk(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
