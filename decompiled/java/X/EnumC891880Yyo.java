package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC891880Yyo {
    public static final /* synthetic */ EnumC891880Yyo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC891880Yyo TIKTOK_LIVE_STUDIO;
    public static final EnumC891880Yyo USER_ANALYTICS;
    public static final EnumC891880Yyo VIDEO_ANALYTICS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC891880Yyo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC891880Yyo enumC891880Yyo = new EnumC891880Yyo("VIDEO_ANALYTICS", 0, 1);
        VIDEO_ANALYTICS = enumC891880Yyo;
        EnumC891880Yyo enumC891880Yyo2 = new EnumC891880Yyo("USER_ANALYTICS", 1, 2);
        USER_ANALYTICS = enumC891880Yyo2;
        EnumC891880Yyo enumC891880Yyo3 = new EnumC891880Yyo("TIKTOK_LIVE_STUDIO", 2, 3);
        TIKTOK_LIVE_STUDIO = enumC891880Yyo3;
        EnumC891880Yyo[] enumC891880YyoArr = {enumC891880Yyo, enumC891880Yyo2, enumC891880Yyo3};
        LLILLJJLI = enumC891880YyoArr;
        LLILLL = new C2254308sP(enumC891880YyoArr);
    }

    public static EnumC891880Yyo[] values() {
        return (EnumC891880Yyo[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC891880Yyo valueOf(String str) {
        return (EnumC891880Yyo) C08FF.LIZ(EnumC891880Yyo.class, str);
    }

    public EnumC891880Yyo(String str, int i, int i2) {
        this.LL = i2;
    }
}
