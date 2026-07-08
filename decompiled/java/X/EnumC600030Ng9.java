package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ng9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC600030Ng9 {
    public static final /* synthetic */ EnumC600030Ng9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC600030Ng9 PLAY_VIDEO;
    public static final EnumC600030Ng9 VIDEO_SHOW;

    public static InterfaceC2044707zh<EnumC600030Ng9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC600030Ng9 enumC600030Ng9 = new EnumC600030Ng9("PLAY_VIDEO", 0);
        PLAY_VIDEO = enumC600030Ng9;
        EnumC600030Ng9 enumC600030Ng92 = new EnumC600030Ng9("VIDEO_SHOW", 1);
        VIDEO_SHOW = enumC600030Ng92;
        EnumC600030Ng9[] enumC600030Ng9Arr = {enumC600030Ng9, enumC600030Ng92};
        LL = enumC600030Ng9Arr;
        LLILLJJLI = new C2254308sP(enumC600030Ng9Arr);
    }

    public static EnumC600030Ng9[] values() {
        return (EnumC600030Ng9[]) LL.clone();
    }

    public static EnumC600030Ng9 valueOf(String str) {
        return (EnumC600030Ng9) C08FF.LIZ(EnumC600030Ng9.class, str);
    }

    public EnumC600030Ng9(String str, int i) {
    }
}
