package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992940bwi {
    public static final EnumC992940bwi IM_SHARE_UNDO_STYLE_AVATAR;
    public static final EnumC992940bwi IM_SHARE_UNDO_STYLE_NONE;
    public static final EnumC992940bwi IM_SHARE_UNDO_STYLE_TOAST;
    public static final /* synthetic */ EnumC992940bwi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992940bwi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992940bwi enumC992940bwi = new EnumC992940bwi("IM_SHARE_UNDO_STYLE_NONE", 0);
        IM_SHARE_UNDO_STYLE_NONE = enumC992940bwi;
        EnumC992940bwi enumC992940bwi2 = new EnumC992940bwi("IM_SHARE_UNDO_STYLE_AVATAR", 1);
        IM_SHARE_UNDO_STYLE_AVATAR = enumC992940bwi2;
        EnumC992940bwi enumC992940bwi3 = new EnumC992940bwi("IM_SHARE_UNDO_STYLE_TOAST", 2);
        IM_SHARE_UNDO_STYLE_TOAST = enumC992940bwi3;
        EnumC992940bwi[] enumC992940bwiArr = {enumC992940bwi, enumC992940bwi2, enumC992940bwi3};
        LL = enumC992940bwiArr;
        LLILLJJLI = new C2254308sP(enumC992940bwiArr);
    }

    public static EnumC992940bwi[] values() {
        return (EnumC992940bwi[]) LL.clone();
    }

    public static EnumC992940bwi valueOf(String str) {
        return (EnumC992940bwi) C08FF.LIZ(EnumC992940bwi.class, str);
    }

    public EnumC992940bwi(String str, int i) {
    }
}
