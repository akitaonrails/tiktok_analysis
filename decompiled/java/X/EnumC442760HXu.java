package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442760HXu {
    public static final EnumC442760HXu GENERATING;
    public static final /* synthetic */ EnumC442760HXu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC442760HXu MAKE_ALIVE;
    public static final EnumC442760HXu MAKE_STILL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC442760HXu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC442760HXu enumC442760HXu = new EnumC442760HXu("MAKE_ALIVE", 0, "make_alive");
        MAKE_ALIVE = enumC442760HXu;
        EnumC442760HXu enumC442760HXu2 = new EnumC442760HXu("MAKE_STILL", 1, "make_still");
        MAKE_STILL = enumC442760HXu2;
        EnumC442760HXu enumC442760HXu3 = new EnumC442760HXu("GENERATING", 2, "generating");
        GENERATING = enumC442760HXu3;
        EnumC442760HXu[] enumC442760HXuArr = {enumC442760HXu, enumC442760HXu2, enumC442760HXu3};
        LLILLJJLI = enumC442760HXuArr;
        LLILLL = new C2254308sP(enumC442760HXuArr);
    }

    public static EnumC442760HXu[] values() {
        return (EnumC442760HXu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC442760HXu valueOf(String str) {
        return (EnumC442760HXu) C08FF.LIZ(EnumC442760HXu.class, str);
    }

    public EnumC442760HXu(String str, int i, String str2) {
        this.LL = str2;
    }
}
