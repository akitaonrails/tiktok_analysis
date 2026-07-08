package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ISa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC466740ISa {
    public static final EnumC466740ISa LL;
    public static final EnumC466740ISa LLILLJJLI;
    public static final /* synthetic */ EnumC466740ISa[] LLILLL;

    static {
        EnumC466740ISa enumC466740ISa = new EnumC466740ISa("SKYLIGHT", 0);
        LL = enumC466740ISa;
        EnumC466740ISa enumC466740ISa2 = new EnumC466740ISa("FEED", 1);
        LLILLJJLI = enumC466740ISa2;
        EnumC466740ISa[] enumC466740ISaArr = {enumC466740ISa, enumC466740ISa2};
        LLILLL = enumC466740ISaArr;
        new C2254308sP(enumC466740ISaArr);
    }

    public static EnumC466740ISa[] values() {
        return (EnumC466740ISa[]) LLILLL.clone();
    }

    public static EnumC466740ISa valueOf(String str) {
        return (EnumC466740ISa) C08FF.LIZ(EnumC466740ISa.class, str);
    }

    public EnumC466740ISa(String str, int i) {
    }
}
