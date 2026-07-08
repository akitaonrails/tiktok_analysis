package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773520UVy {
    public static final EnumC773520UVy FULL_LIFE_CYCLE;
    public static final /* synthetic */ EnumC773520UVy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC773520UVy LONG_TERM;
    public static final EnumC773520UVy PREVIEW_AND_VIDEO_BROADCAST_PAGE;
    public static final EnumC773520UVy PREVIEW_PAGE;
    public static final EnumC773520UVy VIDEO_BROADCAST_PAGE;

    public static InterfaceC2044707zh<EnumC773520UVy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC773520UVy enumC773520UVy = new EnumC773520UVy("PREVIEW_PAGE", 0);
        PREVIEW_PAGE = enumC773520UVy;
        EnumC773520UVy enumC773520UVy2 = new EnumC773520UVy("VIDEO_BROADCAST_PAGE", 1);
        VIDEO_BROADCAST_PAGE = enumC773520UVy2;
        EnumC773520UVy enumC773520UVy3 = new EnumC773520UVy("PREVIEW_AND_VIDEO_BROADCAST_PAGE", 2);
        PREVIEW_AND_VIDEO_BROADCAST_PAGE = enumC773520UVy3;
        EnumC773520UVy enumC773520UVy4 = new EnumC773520UVy("FULL_LIFE_CYCLE", 3);
        FULL_LIFE_CYCLE = enumC773520UVy4;
        EnumC773520UVy enumC773520UVy5 = new EnumC773520UVy("LONG_TERM", 4);
        LONG_TERM = enumC773520UVy5;
        EnumC773520UVy[] enumC773520UVyArr = {enumC773520UVy, enumC773520UVy2, enumC773520UVy3, enumC773520UVy4, enumC773520UVy5};
        LL = enumC773520UVyArr;
        LLILLJJLI = new C2254308sP(enumC773520UVyArr);
    }

    public static EnumC773520UVy[] values() {
        return (EnumC773520UVy[]) LL.clone();
    }

    public static EnumC773520UVy valueOf(String str) {
        return (EnumC773520UVy) C08FF.LIZ(EnumC773520UVy.class, str);
    }

    public EnumC773520UVy(String str, int i) {
    }
}
