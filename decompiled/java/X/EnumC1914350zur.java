package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1914350zur {
    public static final EnumC1914350zur LL;
    public static final EnumC1914350zur LLILLJJLI;
    public static final EnumC1914350zur LLILLL;
    public static final /* synthetic */ EnumC1914350zur[] LLILZ;

    static {
        EnumC1914350zur enumC1914350zur = new EnumC1914350zur("AUTO_SIZE", 0);
        LL = enumC1914350zur;
        EnumC1914350zur enumC1914350zur2 = new EnumC1914350zur("FIXED", 1);
        LLILLJJLI = enumC1914350zur2;
        EnumC1914350zur enumC1914350zur3 = new EnumC1914350zur("DYNAMIC", 2);
        LLILLL = enumC1914350zur3;
        EnumC1914350zur[] enumC1914350zurArr = {enumC1914350zur, enumC1914350zur2, enumC1914350zur3};
        LLILZ = enumC1914350zurArr;
        new C2254308sP(enumC1914350zurArr);
    }

    public static EnumC1914350zur[] values() {
        return (EnumC1914350zur[]) LLILZ.clone();
    }

    public static EnumC1914350zur valueOf(String str) {
        return (EnumC1914350zur) C08FF.LIZ(EnumC1914350zur.class, str);
    }

    public EnumC1914350zur(String str, int i) {
    }
}
