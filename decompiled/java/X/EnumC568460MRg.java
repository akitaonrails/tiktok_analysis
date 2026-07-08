package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC568460MRg {
    public static final EnumC568460MRg DISABLE_4K;
    public static final EnumC568460MRg FILE_DELETED;
    public static final /* synthetic */ EnumC568460MRg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC568460MRg NONE;
    public static final EnumC568460MRg NORMAL_VIDEO_PLAY;

    public static InterfaceC2044707zh<EnumC568460MRg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC568460MRg enumC568460MRg = new EnumC568460MRg("NONE", 0);
        NONE = enumC568460MRg;
        EnumC568460MRg enumC568460MRg2 = new EnumC568460MRg("FILE_DELETED", 1);
        FILE_DELETED = enumC568460MRg2;
        EnumC568460MRg enumC568460MRg3 = new EnumC568460MRg("DISABLE_4K", 2);
        DISABLE_4K = enumC568460MRg3;
        EnumC568460MRg enumC568460MRg4 = new EnumC568460MRg("NORMAL_VIDEO_PLAY", 3);
        NORMAL_VIDEO_PLAY = enumC568460MRg4;
        EnumC568460MRg[] enumC568460MRgArr = {enumC568460MRg, enumC568460MRg2, enumC568460MRg3, enumC568460MRg4};
        LL = enumC568460MRgArr;
        LLILLJJLI = new C2254308sP(enumC568460MRgArr);
    }

    public static EnumC568460MRg[] values() {
        return (EnumC568460MRg[]) LL.clone();
    }

    public static EnumC568460MRg valueOf(String str) {
        return (EnumC568460MRg) C08FF.LIZ(EnumC568460MRg.class, str);
    }

    public EnumC568460MRg(String str, int i) {
    }
}
