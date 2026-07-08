package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605560rso {
    public static final EnumC1605560rso ADD_STORY;
    public static final EnumC1605560rso GO_LIVE;
    public static final /* synthetic */ EnumC1605560rso[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1605560rso MUTE_LIVES;
    public static final EnumC1605560rso MUTE_LIVE_EVENT;
    public static final EnumC1605560rso MUTE_STORIES;

    public static InterfaceC2044707zh<EnumC1605560rso> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1605560rso enumC1605560rso = new EnumC1605560rso("ADD_STORY", 0);
        ADD_STORY = enumC1605560rso;
        EnumC1605560rso enumC1605560rso2 = new EnumC1605560rso("MUTE_STORIES", 1);
        MUTE_STORIES = enumC1605560rso2;
        EnumC1605560rso enumC1605560rso3 = new EnumC1605560rso("MUTE_LIVES", 2);
        MUTE_LIVES = enumC1605560rso3;
        EnumC1605560rso enumC1605560rso4 = new EnumC1605560rso("GO_LIVE", 3);
        GO_LIVE = enumC1605560rso4;
        EnumC1605560rso enumC1605560rso5 = new EnumC1605560rso("MUTE_LIVE_EVENT", 4);
        MUTE_LIVE_EVENT = enumC1605560rso5;
        EnumC1605560rso[] enumC1605560rsoArr = {enumC1605560rso, enumC1605560rso2, enumC1605560rso3, enumC1605560rso4, enumC1605560rso5};
        LL = enumC1605560rsoArr;
        LLILLJJLI = new C2254308sP(enumC1605560rsoArr);
    }

    public static EnumC1605560rso[] values() {
        return (EnumC1605560rso[]) LL.clone();
    }

    public static EnumC1605560rso valueOf(String str) {
        return (EnumC1605560rso) C08FF.LIZ(EnumC1605560rso.class, str);
    }

    public EnumC1605560rso(String str, int i) {
    }
}
