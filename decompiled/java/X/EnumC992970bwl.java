package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992970bwl {
    public static final EnumC992970bwl ENHANCE_SHARE_ICON;
    public static final /* synthetic */ EnumC992970bwl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992970bwl LONE_PRESS;
    public static final EnumC992970bwl NORMAL_FILL_ICON;
    public static final EnumC992970bwl NORMAL_ICON;

    public static InterfaceC2044707zh<EnumC992970bwl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992970bwl enumC992970bwl = new EnumC992970bwl("NORMAL_ICON", 0);
        NORMAL_ICON = enumC992970bwl;
        EnumC992970bwl enumC992970bwl2 = new EnumC992970bwl("NORMAL_FILL_ICON", 1);
        NORMAL_FILL_ICON = enumC992970bwl2;
        EnumC992970bwl enumC992970bwl3 = new EnumC992970bwl("LONE_PRESS", 2);
        LONE_PRESS = enumC992970bwl3;
        EnumC992970bwl enumC992970bwl4 = new EnumC992970bwl("ENHANCE_SHARE_ICON", 3);
        ENHANCE_SHARE_ICON = enumC992970bwl4;
        EnumC992970bwl[] enumC992970bwlArr = {enumC992970bwl, enumC992970bwl2, enumC992970bwl3, enumC992970bwl4};
        LL = enumC992970bwlArr;
        LLILLJJLI = new C2254308sP(enumC992970bwlArr);
    }

    public static EnumC992970bwl[] values() {
        return (EnumC992970bwl[]) LL.clone();
    }

    public static EnumC992970bwl valueOf(String str) {
        return (EnumC992970bwl) C08FF.LIZ(EnumC992970bwl.class, str);
    }

    public EnumC992970bwl(String str, int i) {
    }
}
