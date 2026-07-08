package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC567790MOr {
    public static final /* synthetic */ EnumC567790MOr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC567790MOr PHOTO;
    public static final EnumC567790MOr STORY;

    public static InterfaceC2044707zh<EnumC567790MOr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC567790MOr enumC567790MOr = new EnumC567790MOr("STORY", 0);
        STORY = enumC567790MOr;
        EnumC567790MOr enumC567790MOr2 = new EnumC567790MOr("PHOTO", 1);
        PHOTO = enumC567790MOr2;
        EnumC567790MOr[] enumC567790MOrArr = {enumC567790MOr, enumC567790MOr2};
        LL = enumC567790MOrArr;
        LLILLJJLI = new C2254308sP(enumC567790MOrArr);
    }

    public static EnumC567790MOr[] values() {
        return (EnumC567790MOr[]) LL.clone();
    }

    public static EnumC567790MOr valueOf(String str) {
        return (EnumC567790MOr) C08FF.LIZ(EnumC567790MOr.class, str);
    }

    public EnumC567790MOr(String str, int i) {
    }
}
