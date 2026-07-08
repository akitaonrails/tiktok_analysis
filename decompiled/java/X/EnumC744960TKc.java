package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC744960TKc {
    public static final /* synthetic */ EnumC744960TKc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC744960TKc ON_BIND;
    public static final EnumC744960TKc ON_PLAYER_CALLBACK;
    public static final EnumC744960TKc ON_RESUME_PLAY;
    public static final EnumC744960TKc ON_SELECT;

    public static InterfaceC2044707zh<EnumC744960TKc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC744960TKc enumC744960TKc = new EnumC744960TKc("ON_BIND", 0);
        ON_BIND = enumC744960TKc;
        EnumC744960TKc enumC744960TKc2 = new EnumC744960TKc("ON_SELECT", 1);
        ON_SELECT = enumC744960TKc2;
        EnumC744960TKc enumC744960TKc3 = new EnumC744960TKc("ON_RESUME_PLAY", 2);
        ON_RESUME_PLAY = enumC744960TKc3;
        EnumC744960TKc enumC744960TKc4 = new EnumC744960TKc("ON_PLAYER_CALLBACK", 3);
        ON_PLAYER_CALLBACK = enumC744960TKc4;
        EnumC744960TKc[] enumC744960TKcArr = {enumC744960TKc, enumC744960TKc2, enumC744960TKc3, enumC744960TKc4};
        LL = enumC744960TKcArr;
        LLILLJJLI = new C2254308sP(enumC744960TKcArr);
    }

    public static EnumC744960TKc[] values() {
        return (EnumC744960TKc[]) LL.clone();
    }

    public static EnumC744960TKc valueOf(String str) {
        return (EnumC744960TKc) C08FF.LIZ(EnumC744960TKc.class, str);
    }

    public EnumC744960TKc(String str, int i) {
    }
}
