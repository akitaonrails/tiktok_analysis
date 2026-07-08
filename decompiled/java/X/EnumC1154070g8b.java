package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154070g8b {
    public static final EnumC1154070g8b LLILLJJLI;
    public static final EnumC1154070g8b LLILLL;
    public static final /* synthetic */ EnumC1154070g8b[] LLILZ;
    public final int LL;

    static {
        EnumC1154070g8b enumC1154070g8b = new EnumC1154070g8b("NOT_LINKED", 0, 0);
        LLILLJJLI = enumC1154070g8b;
        EnumC1154070g8b enumC1154070g8b2 = new EnumC1154070g8b("LINKED", 1, 1);
        LLILLL = enumC1154070g8b2;
        EnumC1154070g8b[] enumC1154070g8bArr = {enumC1154070g8b, enumC1154070g8b2};
        LLILZ = enumC1154070g8bArr;
        new C2254308sP(enumC1154070g8bArr);
    }

    public static EnumC1154070g8b[] values() {
        return (EnumC1154070g8b[]) LLILZ.clone();
    }

    public static EnumC1154070g8b valueOf(String str) {
        return (EnumC1154070g8b) C08FF.LIZ(EnumC1154070g8b.class, str);
    }

    public EnumC1154070g8b(String str, int i, int i2) {
        this.LL = i2;
    }
}
