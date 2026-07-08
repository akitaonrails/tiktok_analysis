package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452640Hp0 {
    public static final EnumC452640Hp0 COMMENT_STICKER_PANEL;
    public static final EnumC452640Hp0 DM_STICKER_PANEL;
    public static final /* synthetic */ EnumC452640Hp0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC452640Hp0 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC452640Hp0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC452640Hp0 enumC452640Hp0 = new EnumC452640Hp0("UNKNOWN", 0, 0);
        UNKNOWN = enumC452640Hp0;
        EnumC452640Hp0 enumC452640Hp02 = new EnumC452640Hp0("DM_STICKER_PANEL", 1, 1);
        DM_STICKER_PANEL = enumC452640Hp02;
        EnumC452640Hp0 enumC452640Hp03 = new EnumC452640Hp0("COMMENT_STICKER_PANEL", 2, 2);
        COMMENT_STICKER_PANEL = enumC452640Hp03;
        EnumC452640Hp0[] enumC452640Hp0Arr = {enumC452640Hp0, enumC452640Hp02, enumC452640Hp03};
        LLILLJJLI = enumC452640Hp0Arr;
        LLILLL = new C2254308sP(enumC452640Hp0Arr);
    }

    public static EnumC452640Hp0[] values() {
        return (EnumC452640Hp0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC452640Hp0 valueOf(String str) {
        return (EnumC452640Hp0) C08FF.LIZ(EnumC452640Hp0.class, str);
    }

    public EnumC452640Hp0(String str, int i, int i2) {
        this.LL = i2;
    }
}
