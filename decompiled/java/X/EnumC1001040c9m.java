package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1001040c9m {
    public static final EnumC1001040c9m CLICK_ENTRANCE;
    public static final EnumC1001040c9m FINISH_PLAY;
    public static final /* synthetic */ EnumC1001040c9m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1001040c9m PLAY_TIME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1001040c9m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1001040c9m enumC1001040c9m = new EnumC1001040c9m("CLICK_ENTRANCE", 0, "click_entrance");
        CLICK_ENTRANCE = enumC1001040c9m;
        EnumC1001040c9m enumC1001040c9m2 = new EnumC1001040c9m("PLAY_TIME", 1, "play_time");
        PLAY_TIME = enumC1001040c9m2;
        EnumC1001040c9m enumC1001040c9m3 = new EnumC1001040c9m("FINISH_PLAY", 2, "finish_play");
        FINISH_PLAY = enumC1001040c9m3;
        EnumC1001040c9m[] enumC1001040c9mArr = {enumC1001040c9m, enumC1001040c9m2, enumC1001040c9m3};
        LLILLJJLI = enumC1001040c9mArr;
        LLILLL = new C2254308sP(enumC1001040c9mArr);
    }

    public static EnumC1001040c9m[] values() {
        return (EnumC1001040c9m[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1001040c9m valueOf(String str) {
        return (EnumC1001040c9m) C08FF.LIZ(EnumC1001040c9m.class, str);
    }

    public EnumC1001040c9m(String str, int i, String str2) {
        this.LL = str2;
    }
}
