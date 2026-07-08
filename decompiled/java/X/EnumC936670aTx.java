package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC936670aTx {
    public static final EnumC936670aTx COUNT_DOWN_FOR_ALL;
    public static final EnumC936670aTx LIVE_SHOW;
    public static final /* synthetic */ EnumC936670aTx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC936670aTx NONE;
    public static final EnumC936670aTx NOTICE_BOARD;
    public static final EnumC936670aTx WALLPAPER;

    public static InterfaceC2044707zh<EnumC936670aTx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC936670aTx enumC936670aTx = new EnumC936670aTx("NONE", 0);
        NONE = enumC936670aTx;
        EnumC936670aTx enumC936670aTx2 = new EnumC936670aTx("COUNT_DOWN_FOR_ALL", 1);
        COUNT_DOWN_FOR_ALL = enumC936670aTx2;
        EnumC936670aTx enumC936670aTx3 = new EnumC936670aTx("NOTICE_BOARD", 2);
        NOTICE_BOARD = enumC936670aTx3;
        EnumC936670aTx enumC936670aTx4 = new EnumC936670aTx("LIVE_SHOW", 3);
        LIVE_SHOW = enumC936670aTx4;
        EnumC936670aTx enumC936670aTx5 = new EnumC936670aTx("WALLPAPER", 4);
        WALLPAPER = enumC936670aTx5;
        EnumC936670aTx[] enumC936670aTxArr = {enumC936670aTx, enumC936670aTx2, enumC936670aTx3, enumC936670aTx4, enumC936670aTx5};
        LL = enumC936670aTxArr;
        LLILLJJLI = new C2254308sP(enumC936670aTxArr);
    }

    public static EnumC936670aTx[] values() {
        return (EnumC936670aTx[]) LL.clone();
    }

    public static EnumC936670aTx valueOf(String str) {
        return (EnumC936670aTx) C08FF.LIZ(EnumC936670aTx.class, str);
    }

    public EnumC936670aTx(String str, int i) {
    }
}
