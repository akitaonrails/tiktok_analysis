package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009407u0 {
    public static final /* synthetic */ EnumC2009407u0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009407u0 MUTE_STATUS_LIVES;
    public static final EnumC2009407u0 MUTE_STATUS_NON_STORY;
    public static final EnumC2009407u0 MUTE_STATUS_STORY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009407u0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009407u0 enumC2009407u0 = new EnumC2009407u0("MUTE_STATUS_STORY", 0, 1);
        MUTE_STATUS_STORY = enumC2009407u0;
        EnumC2009407u0 enumC2009407u02 = new EnumC2009407u0("MUTE_STATUS_NON_STORY", 1, 2);
        MUTE_STATUS_NON_STORY = enumC2009407u02;
        EnumC2009407u0 enumC2009407u03 = new EnumC2009407u0("MUTE_STATUS_LIVES", 2, 3);
        MUTE_STATUS_LIVES = enumC2009407u03;
        EnumC2009407u0[] enumC2009407u0Arr = {enumC2009407u0, enumC2009407u02, enumC2009407u03};
        LLILLJJLI = enumC2009407u0Arr;
        LLILLL = new C2254308sP(enumC2009407u0Arr);
    }

    public static EnumC2009407u0[] values() {
        return (EnumC2009407u0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009407u0 valueOf(String str) {
        return (EnumC2009407u0) C08FF.LIZ(EnumC2009407u0.class, str);
    }

    public EnumC2009407u0(String str, int i, int i2) {
        this.LL = i2;
    }
}
