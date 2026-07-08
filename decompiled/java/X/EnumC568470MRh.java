package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC568470MRh {
    public static final EnumC568470MRh DISABLE_4K;
    public static final /* synthetic */ EnumC568470MRh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC568470MRh NONE;
    public static final EnumC568470MRh NORMAL_VIDEO_PLAY;

    public static InterfaceC2044707zh<EnumC568470MRh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC568470MRh enumC568470MRh = new EnumC568470MRh("NONE", 0);
        NONE = enumC568470MRh;
        EnumC568470MRh enumC568470MRh2 = new EnumC568470MRh("DISABLE_4K", 1);
        DISABLE_4K = enumC568470MRh2;
        EnumC568470MRh enumC568470MRh3 = new EnumC568470MRh("NORMAL_VIDEO_PLAY", 2);
        NORMAL_VIDEO_PLAY = enumC568470MRh3;
        EnumC568470MRh[] enumC568470MRhArr = {enumC568470MRh, enumC568470MRh2, enumC568470MRh3};
        LL = enumC568470MRhArr;
        LLILLJJLI = new C2254308sP(enumC568470MRhArr);
    }

    public static EnumC568470MRh[] values() {
        return (EnumC568470MRh[]) LL.clone();
    }

    public static EnumC568470MRh valueOf(String str) {
        return (EnumC568470MRh) C08FF.LIZ(EnumC568470MRh.class, str);
    }

    public EnumC568470MRh(String str, int i) {
    }
}
