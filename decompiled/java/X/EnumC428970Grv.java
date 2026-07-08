package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428970Grv {
    public static final C424390GkX LL;
    public static final EnumC428970Grv LLILLJJLI;
    public static final EnumC428970Grv LLILLL;
    public static final EnumC428970Grv LLILZ;
    public static final EnumC428970Grv LLILZIL;
    public static final /* synthetic */ EnumC428970Grv[] LLILZLL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0GkX] */
    static {
        EnumC428970Grv enumC428970Grv = new EnumC428970Grv("START", 0);
        LLILLJJLI = enumC428970Grv;
        EnumC428970Grv enumC428970Grv2 = new EnumC428970Grv("END", 1);
        LLILLL = enumC428970Grv2;
        EnumC428970Grv enumC428970Grv3 = new EnumC428970Grv("NONE", 2);
        LLILZ = enumC428970Grv3;
        EnumC428970Grv enumC428970Grv4 = new EnumC428970Grv("START_END", 3);
        LLILZIL = enumC428970Grv4;
        EnumC428970Grv[] enumC428970GrvArr = {enumC428970Grv, enumC428970Grv2, enumC428970Grv3, enumC428970Grv4};
        LLILZLL = enumC428970GrvArr;
        new C2254308sP(enumC428970GrvArr);
        LL = new Object() { // from class: X.0GkX
        };
    }

    public static EnumC428970Grv[] values() {
        return (EnumC428970Grv[]) LLILZLL.clone();
    }

    public static EnumC428970Grv valueOf(String str) {
        return (EnumC428970Grv) C08FF.LIZ(EnumC428970Grv.class, str);
    }

    public EnumC428970Grv(String str, int i) {
    }
}
