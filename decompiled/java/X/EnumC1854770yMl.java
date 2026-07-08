package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1854770yMl {
    public static final EnumC1854770yMl ACTIVE_SEND;
    public static final EnumC1854770yMl ACTIVE_SEND_WITH_VOICE_ICON;
    public static final EnumC1854770yMl EMPTY;
    public static final /* synthetic */ EnumC1854770yMl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1854770yMl NOT_ACTIVE_SEND;
    public static final EnumC1854770yMl STOP;
    public static final EnumC1854770yMl VOICE_TALK_V1;
    public static final EnumC1854770yMl VOICE_TALK_V2;

    public static InterfaceC2044707zh<EnumC1854770yMl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1854770yMl enumC1854770yMl = new EnumC1854770yMl("EMPTY", 0);
        EMPTY = enumC1854770yMl;
        EnumC1854770yMl enumC1854770yMl2 = new EnumC1854770yMl("NOT_ACTIVE_SEND", 1);
        NOT_ACTIVE_SEND = enumC1854770yMl2;
        EnumC1854770yMl enumC1854770yMl3 = new EnumC1854770yMl("STOP", 2);
        STOP = enumC1854770yMl3;
        EnumC1854770yMl enumC1854770yMl4 = new EnumC1854770yMl("ACTIVE_SEND", 3);
        ACTIVE_SEND = enumC1854770yMl4;
        EnumC1854770yMl enumC1854770yMl5 = new EnumC1854770yMl("ACTIVE_SEND_WITH_VOICE_ICON", 4);
        ACTIVE_SEND_WITH_VOICE_ICON = enumC1854770yMl5;
        EnumC1854770yMl enumC1854770yMl6 = new EnumC1854770yMl("VOICE_TALK_V1", 5);
        VOICE_TALK_V1 = enumC1854770yMl6;
        EnumC1854770yMl enumC1854770yMl7 = new EnumC1854770yMl("VOICE_TALK_V2", 6);
        VOICE_TALK_V2 = enumC1854770yMl7;
        EnumC1854770yMl[] enumC1854770yMlArr = {enumC1854770yMl, enumC1854770yMl2, enumC1854770yMl3, enumC1854770yMl4, enumC1854770yMl5, enumC1854770yMl6, enumC1854770yMl7};
        LL = enumC1854770yMlArr;
        LLILLJJLI = new C2254308sP(enumC1854770yMlArr);
    }

    public static EnumC1854770yMl[] values() {
        return (EnumC1854770yMl[]) LL.clone();
    }

    public static EnumC1854770yMl valueOf(String str) {
        return (EnumC1854770yMl) C08FF.LIZ(EnumC1854770yMl.class, str);
    }

    public EnumC1854770yMl(String str, int i) {
    }
}
