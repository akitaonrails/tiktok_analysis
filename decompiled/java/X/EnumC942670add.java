package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0add, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC942670add {
    public static final /* synthetic */ EnumC942670add[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC942670add NOTICEBOARD;
    public static final EnumC942670add WALLPAPER;

    public static InterfaceC2044707zh<EnumC942670add> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC942670add enumC942670add = new EnumC942670add("NOTICEBOARD", 0);
        NOTICEBOARD = enumC942670add;
        EnumC942670add enumC942670add2 = new EnumC942670add("WALLPAPER", 1);
        WALLPAPER = enumC942670add2;
        EnumC942670add[] enumC942670addArr = {enumC942670add, enumC942670add2};
        LL = enumC942670addArr;
        LLILLJJLI = new C2254308sP(enumC942670addArr);
    }

    public static EnumC942670add[] values() {
        return (EnumC942670add[]) LL.clone();
    }

    public static EnumC942670add valueOf(String str) {
        return (EnumC942670add) C08FF.LIZ(EnumC942670add.class, str);
    }

    public EnumC942670add(String str, int i) {
    }
}
