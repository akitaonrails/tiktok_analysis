package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641440sog {
    public static final EnumC1641440sog LLILLJJLI;
    public static final EnumC1641440sog LLILLL;
    public static final EnumC1641440sog LLILZ;
    public static final /* synthetic */ EnumC1641440sog[] LLILZIL;
    public final String LL;

    static {
        EnumC1641440sog enumC1641440sog = new EnumC1641440sog("SCROLL", 0, "scroll");
        LLILLJJLI = enumC1641440sog;
        EnumC1641440sog enumC1641440sog2 = new EnumC1641440sog("CLICK", 1, "click");
        LLILLL = enumC1641440sog2;
        EnumC1641440sog enumC1641440sog3 = new EnumC1641440sog("AUTO", 2, "auto");
        LLILZ = enumC1641440sog3;
        EnumC1641440sog[] enumC1641440sogArr = {enumC1641440sog, enumC1641440sog2, enumC1641440sog3};
        LLILZIL = enumC1641440sogArr;
        new C2254308sP(enumC1641440sogArr);
    }

    public static EnumC1641440sog[] values() {
        return (EnumC1641440sog[]) LLILZIL.clone();
    }

    public static EnumC1641440sog valueOf(String str) {
        return (EnumC1641440sog) C08FF.LIZ(EnumC1641440sog.class, str);
    }

    public EnumC1641440sog(String str, int i, String str2) {
        this.LL = str2;
    }
}
