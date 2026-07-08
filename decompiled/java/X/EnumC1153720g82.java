package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153720g82 {
    public static final EnumC1153720g82 CONTAINER_ADAPTION;
    public static final EnumC1153720g82 INVALID_VIDEO_TOP;
    public static final /* synthetic */ EnumC1153720g82[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153720g82 PLAYER_INIT;
    public static final EnumC1153720g82 VIDEO_BIND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153720g82> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153720g82 enumC1153720g82 = new EnumC1153720g82("PLAYER_INIT", 0, "player_init");
        PLAYER_INIT = enumC1153720g82;
        EnumC1153720g82 enumC1153720g822 = new EnumC1153720g82("VIDEO_BIND", 1, "video_bind");
        VIDEO_BIND = enumC1153720g822;
        EnumC1153720g82 enumC1153720g823 = new EnumC1153720g82("CONTAINER_ADAPTION", 2, "container_adaption");
        CONTAINER_ADAPTION = enumC1153720g823;
        EnumC1153720g82 enumC1153720g824 = new EnumC1153720g82("INVALID_VIDEO_TOP", 3, "invalid_video_top");
        INVALID_VIDEO_TOP = enumC1153720g824;
        EnumC1153720g82[] enumC1153720g82Arr = {enumC1153720g82, enumC1153720g822, enumC1153720g823, enumC1153720g824};
        LLILLJJLI = enumC1153720g82Arr;
        LLILLL = new C2254308sP(enumC1153720g82Arr);
    }

    public static EnumC1153720g82[] values() {
        return (EnumC1153720g82[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC1153720g82 valueOf(String str) {
        return (EnumC1153720g82) C08FF.LIZ(EnumC1153720g82.class, str);
    }

    public EnumC1153720g82(String str, int i, String str2) {
        this.LL = str2;
    }
}
