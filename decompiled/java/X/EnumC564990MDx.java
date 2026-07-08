package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC564990MDx {
    public static final EnumC564990MDx CHANGE_MEDIA;
    public static final EnumC564990MDx IMAGE_EDIT_PAGE_CLICK_AUTO_SHOW;
    public static final /* synthetic */ EnumC564990MDx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC564990MDx NORMAL_AUTO_SHOW;

    public static InterfaceC2044707zh<EnumC564990MDx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC564990MDx enumC564990MDx = new EnumC564990MDx("IMAGE_EDIT_PAGE_CLICK_AUTO_SHOW", 0);
        IMAGE_EDIT_PAGE_CLICK_AUTO_SHOW = enumC564990MDx;
        EnumC564990MDx enumC564990MDx2 = new EnumC564990MDx("NORMAL_AUTO_SHOW", 1);
        NORMAL_AUTO_SHOW = enumC564990MDx2;
        EnumC564990MDx enumC564990MDx3 = new EnumC564990MDx("CHANGE_MEDIA", 2);
        CHANGE_MEDIA = enumC564990MDx3;
        EnumC564990MDx[] enumC564990MDxArr = {enumC564990MDx, enumC564990MDx2, enumC564990MDx3};
        LL = enumC564990MDxArr;
        LLILLJJLI = new C2254308sP(enumC564990MDxArr);
    }

    public static EnumC564990MDx[] values() {
        return (EnumC564990MDx[]) LL.clone();
    }

    public static EnumC564990MDx valueOf(String str) {
        return (EnumC564990MDx) C08FF.LIZ(EnumC564990MDx.class, str);
    }

    public EnumC564990MDx(String str, int i) {
    }
}
