package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC924320aA2 {
    public static final EnumC924320aA2 CAMERA;
    public static final EnumC924320aA2 LIVE_EFFECT;
    public static final /* synthetic */ EnumC924320aA2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC924320aA2 NONE;

    public static InterfaceC2044707zh<EnumC924320aA2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC924320aA2 enumC924320aA2 = new EnumC924320aA2("NONE", 0);
        NONE = enumC924320aA2;
        EnumC924320aA2 enumC924320aA22 = new EnumC924320aA2("LIVE_EFFECT", 1);
        LIVE_EFFECT = enumC924320aA22;
        EnumC924320aA2 enumC924320aA23 = new EnumC924320aA2("CAMERA", 2);
        CAMERA = enumC924320aA23;
        EnumC924320aA2[] enumC924320aA2Arr = {enumC924320aA2, enumC924320aA22, enumC924320aA23};
        LL = enumC924320aA2Arr;
        LLILLJJLI = new C2254308sP(enumC924320aA2Arr);
    }

    public static EnumC924320aA2[] values() {
        return (EnumC924320aA2[]) LL.clone();
    }

    public static EnumC924320aA2 valueOf(String str) {
        return (EnumC924320aA2) C08FF.LIZ(EnumC924320aA2.class, str);
    }

    public EnumC924320aA2(String str, int i) {
    }
}
