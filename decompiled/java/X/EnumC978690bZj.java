package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC978690bZj {
    public static final EnumC978690bZj AI_COMMENTARY;
    public static final EnumC978690bZj BONUS_MISSION;
    public static final EnumC978690bZj CATCH_BEAN;
    public static final EnumC978690bZj ENIGMA;
    public static final EnumC978690bZj ICY_CLASH;
    public static final EnumC978690bZj LIVE_MATCH;
    public static final /* synthetic */ EnumC978690bZj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC978690bZj MATCH_CONTRIBUTORS;
    public static final EnumC978690bZj MATCH_POWER_UPS;
    public static final EnumC978690bZj PLAY_BOOK;
    public static final EnumC978690bZj TAKE_STAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC978690bZj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC978690bZj enumC978690bZj = new EnumC978690bZj("LIVE_MATCH", 0, 0);
        LIVE_MATCH = enumC978690bZj;
        EnumC978690bZj enumC978690bZj2 = new EnumC978690bZj("TAKE_STAGE", 1, 1);
        TAKE_STAGE = enumC978690bZj2;
        EnumC978690bZj enumC978690bZj3 = new EnumC978690bZj("MATCH_CONTRIBUTORS", 2, 2);
        MATCH_CONTRIBUTORS = enumC978690bZj3;
        EnumC978690bZj enumC978690bZj4 = new EnumC978690bZj("MATCH_POWER_UPS", 3, 3);
        MATCH_POWER_UPS = enumC978690bZj4;
        EnumC978690bZj enumC978690bZj5 = new EnumC978690bZj("BONUS_MISSION", 4, 4);
        BONUS_MISSION = enumC978690bZj5;
        EnumC978690bZj enumC978690bZj6 = new EnumC978690bZj("PLAY_BOOK", 5, 5);
        PLAY_BOOK = enumC978690bZj6;
        EnumC978690bZj enumC978690bZj7 = new EnumC978690bZj("ICY_CLASH", 6, 6);
        ICY_CLASH = enumC978690bZj7;
        EnumC978690bZj enumC978690bZj8 = new EnumC978690bZj("ENIGMA", 7, 7);
        ENIGMA = enumC978690bZj8;
        EnumC978690bZj enumC978690bZj9 = new EnumC978690bZj("AI_COMMENTARY", 8, 8);
        AI_COMMENTARY = enumC978690bZj9;
        EnumC978690bZj enumC978690bZj10 = new EnumC978690bZj("CATCH_BEAN", 9, 9);
        CATCH_BEAN = enumC978690bZj10;
        EnumC978690bZj[] enumC978690bZjArr = {enumC978690bZj, enumC978690bZj2, enumC978690bZj3, enumC978690bZj4, enumC978690bZj5, enumC978690bZj6, enumC978690bZj7, enumC978690bZj8, enumC978690bZj9, enumC978690bZj10};
        LLILLJJLI = enumC978690bZjArr;
        LLILLL = new C2254308sP(enumC978690bZjArr);
    }

    public static EnumC978690bZj[] values() {
        return (EnumC978690bZj[]) LLILLJJLI.clone();
    }

    public final int getIdx() {
        return this.LL;
    }

    public static EnumC978690bZj valueOf(String str) {
        return (EnumC978690bZj) C08FF.LIZ(EnumC978690bZj.class, str);
    }

    public EnumC978690bZj(String str, int i, int i2) {
        this.LL = i2;
    }
}
