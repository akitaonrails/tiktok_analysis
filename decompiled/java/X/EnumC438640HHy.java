package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC438640HHy {
    public static final EnumC438640HHy IDLE;
    public static final /* synthetic */ EnumC438640HHy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC438640HHy LOADING;
    public static final EnumC438640HHy PAUSED;
    public static final EnumC438640HHy PLAYING;

    public static InterfaceC2044707zh<EnumC438640HHy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC438640HHy enumC438640HHy = new EnumC438640HHy("IDLE", 0);
        IDLE = enumC438640HHy;
        EnumC438640HHy enumC438640HHy2 = new EnumC438640HHy("LOADING", 1);
        LOADING = enumC438640HHy2;
        EnumC438640HHy enumC438640HHy3 = new EnumC438640HHy("PLAYING", 2);
        PLAYING = enumC438640HHy3;
        EnumC438640HHy enumC438640HHy4 = new EnumC438640HHy("PAUSED", 3);
        PAUSED = enumC438640HHy4;
        EnumC438640HHy[] enumC438640HHyArr = {enumC438640HHy, enumC438640HHy2, enumC438640HHy3, enumC438640HHy4};
        LL = enumC438640HHyArr;
        LLILLJJLI = new C2254308sP(enumC438640HHyArr);
    }

    public static EnumC438640HHy[] values() {
        return (EnumC438640HHy[]) LL.clone();
    }

    public static EnumC438640HHy valueOf(String str) {
        return (EnumC438640HHy) C08FF.LIZ(EnumC438640HHy.class, str);
    }

    public EnumC438640HHy(String str, int i) {
    }
}
