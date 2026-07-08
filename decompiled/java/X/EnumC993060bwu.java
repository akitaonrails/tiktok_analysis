package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993060bwu {
    public static final /* synthetic */ EnumC993060bwu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993060bwu TYPE_CLICK;
    public static final EnumC993060bwu TYPE_CLICK_LANDING_PAGE;
    public static final EnumC993060bwu TYPE_IMPRESSION;

    public static InterfaceC2044707zh<EnumC993060bwu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993060bwu enumC993060bwu = new EnumC993060bwu("TYPE_CLICK", 0);
        TYPE_CLICK = enumC993060bwu;
        EnumC993060bwu enumC993060bwu2 = new EnumC993060bwu("TYPE_CLICK_LANDING_PAGE", 1);
        TYPE_CLICK_LANDING_PAGE = enumC993060bwu2;
        EnumC993060bwu enumC993060bwu3 = new EnumC993060bwu("TYPE_IMPRESSION", 2);
        TYPE_IMPRESSION = enumC993060bwu3;
        EnumC993060bwu[] enumC993060bwuArr = {enumC993060bwu, enumC993060bwu2, enumC993060bwu3};
        LL = enumC993060bwuArr;
        LLILLJJLI = new C2254308sP(enumC993060bwuArr);
    }

    public static EnumC993060bwu[] values() {
        return (EnumC993060bwu[]) LL.clone();
    }

    public static EnumC993060bwu valueOf(String str) {
        return (EnumC993060bwu) C08FF.LIZ(EnumC993060bwu.class, str);
    }

    public EnumC993060bwu(String str, int i) {
    }
}
