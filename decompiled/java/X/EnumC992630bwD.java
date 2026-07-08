package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992630bwD {
    public static final /* synthetic */ EnumC992630bwD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992630bwD TYPE_CONTENT_PAGE;
    public static final EnumC992630bwD TYPE_SEARCH_PAGE;

    public static InterfaceC2044707zh<EnumC992630bwD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992630bwD enumC992630bwD = new EnumC992630bwD("TYPE_SEARCH_PAGE", 0);
        TYPE_SEARCH_PAGE = enumC992630bwD;
        EnumC992630bwD enumC992630bwD2 = new EnumC992630bwD("TYPE_CONTENT_PAGE", 1);
        TYPE_CONTENT_PAGE = enumC992630bwD2;
        EnumC992630bwD[] enumC992630bwDArr = {enumC992630bwD, enumC992630bwD2};
        LL = enumC992630bwDArr;
        LLILLJJLI = new C2254308sP(enumC992630bwDArr);
    }

    public static EnumC992630bwD[] values() {
        return (EnumC992630bwD[]) LL.clone();
    }

    public static EnumC992630bwD valueOf(String str) {
        return (EnumC992630bwD) C08FF.LIZ(EnumC992630bwD.class, str);
    }

    public EnumC992630bwD(String str, int i) {
    }
}
