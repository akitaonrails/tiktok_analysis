package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454270Hrd {
    public static final /* synthetic */ EnumC454270Hrd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454270Hrd SAVE_STICKER;
    public static final EnumC454270Hrd UNSAVE_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454270Hrd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454270Hrd enumC454270Hrd = new EnumC454270Hrd("SAVE_STICKER", 0, "save_sticker");
        SAVE_STICKER = enumC454270Hrd;
        EnumC454270Hrd enumC454270Hrd2 = new EnumC454270Hrd("UNSAVE_STICKER", 1, "unsave_sticker");
        UNSAVE_STICKER = enumC454270Hrd2;
        EnumC454270Hrd[] enumC454270HrdArr = {enumC454270Hrd, enumC454270Hrd2};
        LLILLJJLI = enumC454270HrdArr;
        LLILLL = new C2254308sP(enumC454270HrdArr);
    }

    public static EnumC454270Hrd[] values() {
        return (EnumC454270Hrd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC454270Hrd valueOf(String str) {
        return (EnumC454270Hrd) C08FF.LIZ(EnumC454270Hrd.class, str);
    }

    public EnumC454270Hrd(String str, int i, String str2) {
        this.LL = str2;
    }
}
