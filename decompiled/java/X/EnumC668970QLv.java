package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC668970QLv {
    public static final /* synthetic */ EnumC668970QLv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC668970QLv PAGE_CHANGE;
    public static final EnumC668970QLv TAG_CHANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC668970QLv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC668970QLv enumC668970QLv = new EnumC668970QLv("PAGE_CHANGE", 0, "page_change");
        PAGE_CHANGE = enumC668970QLv;
        EnumC668970QLv enumC668970QLv2 = new EnumC668970QLv("TAG_CHANGE", 1, "tag_change");
        TAG_CHANGE = enumC668970QLv2;
        EnumC668970QLv[] enumC668970QLvArr = {enumC668970QLv, enumC668970QLv2};
        LLILLJJLI = enumC668970QLvArr;
        LLILLL = new C2254308sP(enumC668970QLvArr);
    }

    public static EnumC668970QLv[] values() {
        return (EnumC668970QLv[]) LLILLJJLI.clone();
    }

    public final String getChangeSource() {
        return this.LL;
    }

    public static EnumC668970QLv valueOf(String str) {
        return (EnumC668970QLv) C08FF.LIZ(EnumC668970QLv.class, str);
    }

    public EnumC668970QLv(String str, int i, String str2) {
        this.LL = str2;
    }
}
