package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918880a1G {
    public static final EnumC918880a1G LL;
    public static final EnumC918880a1G LLILLJJLI;
    public static final EnumC918880a1G LLILLL;
    public static final /* synthetic */ EnumC918880a1G[] LLILZ;

    static {
        EnumC918880a1G enumC918880a1G = new EnumC918880a1G("NORMAL", 0);
        LL = enumC918880a1G;
        EnumC918880a1G enumC918880a1G2 = new EnumC918880a1G("AUX_STREAM", 1);
        LLILLJJLI = enumC918880a1G2;
        EnumC918880a1G enumC918880a1G3 = new EnumC918880a1G("ENLARGE_MODE", 2);
        LLILLL = enumC918880a1G3;
        EnumC918880a1G[] enumC918880a1GArr = {enumC918880a1G, enumC918880a1G2, enumC918880a1G3};
        LLILZ = enumC918880a1GArr;
        new C2254308sP(enumC918880a1GArr);
    }

    public static EnumC918880a1G[] values() {
        return (EnumC918880a1G[]) LLILZ.clone();
    }

    public static EnumC918880a1G valueOf(String str) {
        return (EnumC918880a1G) C08FF.LIZ(EnumC918880a1G.class, str);
    }

    public EnumC918880a1G(String str, int i) {
    }
}
