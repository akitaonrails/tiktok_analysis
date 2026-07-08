package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782850wUl {
    public static final EnumC1782850wUl ERROR;
    public static final EnumC1782850wUl FIRST_FRAME;
    public static final EnumC1782850wUl INITIALIZED;
    public static final /* synthetic */ EnumC1782850wUl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782850wUl PLAYING;
    public static final EnumC1782850wUl PREPARED;
    public static final EnumC1782850wUl TRIGGERED;
    public static final EnumC1782850wUl UNKNOWN;
    public int LL;

    public static InterfaceC2044707zh<EnumC1782850wUl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782850wUl enumC1782850wUl = new EnumC1782850wUl("UNKNOWN", 0, -1);
        UNKNOWN = enumC1782850wUl;
        EnumC1782850wUl enumC1782850wUl2 = new EnumC1782850wUl("TRIGGERED", 1, 1);
        TRIGGERED = enumC1782850wUl2;
        EnumC1782850wUl enumC1782850wUl3 = new EnumC1782850wUl("INITIALIZED", 2, 2);
        INITIALIZED = enumC1782850wUl3;
        EnumC1782850wUl enumC1782850wUl4 = new EnumC1782850wUl("PREPARED", 3, 3);
        PREPARED = enumC1782850wUl4;
        EnumC1782850wUl enumC1782850wUl5 = new EnumC1782850wUl("PLAYING", 4, 4);
        PLAYING = enumC1782850wUl5;
        EnumC1782850wUl enumC1782850wUl6 = new EnumC1782850wUl("ERROR", 5, 5);
        ERROR = enumC1782850wUl6;
        EnumC1782850wUl enumC1782850wUl7 = new EnumC1782850wUl("FIRST_FRAME", 6, 6);
        FIRST_FRAME = enumC1782850wUl7;
        EnumC1782850wUl[] enumC1782850wUlArr = {enumC1782850wUl, enumC1782850wUl2, enumC1782850wUl3, enumC1782850wUl4, enumC1782850wUl5, enumC1782850wUl6, enumC1782850wUl7};
        LLILLJJLI = enumC1782850wUlArr;
        LLILLL = new C2254308sP(enumC1782850wUlArr);
    }

    public static EnumC1782850wUl[] values() {
        return (EnumC1782850wUl[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC1782850wUl valueOf(String str) {
        return (EnumC1782850wUl) C08FF.LIZ(EnumC1782850wUl.class, str);
    }

    public final void setState(int i) {
        this.LL = i;
    }

    public EnumC1782850wUl(String str, int i, int i2) {
        this.LL = i2;
    }
}
