package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1775410wIl {
    public static final EnumC1775410wIl INIT;
    public static final /* synthetic */ EnumC1775410wIl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1775410wIl PLAYING;
    public static final EnumC1775410wIl STOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1775410wIl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1775410wIl enumC1775410wIl = new EnumC1775410wIl("STOP", 0, "image");
        STOP = enumC1775410wIl;
        EnumC1775410wIl enumC1775410wIl2 = new EnumC1775410wIl("INIT", 1, "player_init");
        INIT = enumC1775410wIl2;
        EnumC1775410wIl enumC1775410wIl3 = new EnumC1775410wIl("PLAYING", 2, "player_playing");
        PLAYING = enumC1775410wIl3;
        EnumC1775410wIl[] enumC1775410wIlArr = {enumC1775410wIl, enumC1775410wIl2, enumC1775410wIl3};
        LLILLJJLI = enumC1775410wIlArr;
        LLILLL = new C2254308sP(enumC1775410wIlArr);
    }

    public static EnumC1775410wIl[] values() {
        return (EnumC1775410wIl[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC1775410wIl valueOf(String str) {
        return (EnumC1775410wIl) C08FF.LIZ(EnumC1775410wIl.class, str);
    }

    public EnumC1775410wIl(String str, int i, String str2) {
        this.LL = str2;
    }
}
