package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590180NCu {
    public static final EnumC590180NCu HAS_TRACKED_IN_DETAIL_PAGE;
    public static final EnumC590180NCu HAS_TRACKED_IN_RESULT_PAGE;
    public static final /* synthetic */ EnumC590180NCu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC590180NCu NOT_TRACK;

    public static InterfaceC2044707zh<EnumC590180NCu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC590180NCu enumC590180NCu = new EnumC590180NCu("NOT_TRACK", 0);
        NOT_TRACK = enumC590180NCu;
        EnumC590180NCu enumC590180NCu2 = new EnumC590180NCu("HAS_TRACKED_IN_RESULT_PAGE", 1);
        HAS_TRACKED_IN_RESULT_PAGE = enumC590180NCu2;
        EnumC590180NCu enumC590180NCu3 = new EnumC590180NCu("HAS_TRACKED_IN_DETAIL_PAGE", 2);
        HAS_TRACKED_IN_DETAIL_PAGE = enumC590180NCu3;
        EnumC590180NCu[] enumC590180NCuArr = {enumC590180NCu, enumC590180NCu2, enumC590180NCu3};
        LL = enumC590180NCuArr;
        LLILLJJLI = new C2254308sP(enumC590180NCuArr);
    }

    public static EnumC590180NCu[] values() {
        return (EnumC590180NCu[]) LL.clone();
    }

    public static EnumC590180NCu valueOf(String str) {
        return (EnumC590180NCu) C08FF.LIZ(EnumC590180NCu.class, str);
    }

    public EnumC590180NCu(String str, int i) {
    }
}
