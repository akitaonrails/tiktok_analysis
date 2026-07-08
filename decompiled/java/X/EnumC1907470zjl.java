package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1907470zjl {
    public static final EnumC1907470zjl BOTTOM_ACTION;
    public static final /* synthetic */ EnumC1907470zjl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1907470zjl MIDDLE_BANNER;
    public static final EnumC1907470zjl RIGHT_COVER;
    public static final EnumC1907470zjl ROOT;
    public static final EnumC1907470zjl TOP_CHANNEL;

    public static InterfaceC2044707zh<EnumC1907470zjl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1907470zjl enumC1907470zjl = new EnumC1907470zjl("TOP_CHANNEL", 0);
        TOP_CHANNEL = enumC1907470zjl;
        EnumC1907470zjl enumC1907470zjl2 = new EnumC1907470zjl("MIDDLE_BANNER", 1);
        MIDDLE_BANNER = enumC1907470zjl2;
        EnumC1907470zjl enumC1907470zjl3 = new EnumC1907470zjl("RIGHT_COVER", 2);
        RIGHT_COVER = enumC1907470zjl3;
        EnumC1907470zjl enumC1907470zjl4 = new EnumC1907470zjl("BOTTOM_ACTION", 3);
        BOTTOM_ACTION = enumC1907470zjl4;
        EnumC1907470zjl enumC1907470zjl5 = new EnumC1907470zjl("ROOT", 4);
        ROOT = enumC1907470zjl5;
        EnumC1907470zjl[] enumC1907470zjlArr = {enumC1907470zjl, enumC1907470zjl2, enumC1907470zjl3, enumC1907470zjl4, enumC1907470zjl5};
        LL = enumC1907470zjlArr;
        LLILLJJLI = new C2254308sP(enumC1907470zjlArr);
    }

    public static EnumC1907470zjl[] values() {
        return (EnumC1907470zjl[]) LL.clone();
    }

    public static EnumC1907470zjl valueOf(String str) {
        return (EnumC1907470zjl) C08FF.LIZ(EnumC1907470zjl.class, str);
    }

    public EnumC1907470zjl(String str, int i) {
    }
}
