package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC766540U5c {
    public static final EnumC766540U5c BACKGROUND_PANEL;
    public static final EnumC766540U5c BEAUTY_PANEL;
    public static final EnumC766540U5c DIALOG_BIZ_OTHERS;
    public static final /* synthetic */ EnumC766540U5c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC766540U5c SOUND_EFFECT_PANEL;
    public static final EnumC766540U5c STICKER_EFFECT_PANEL;
    public static final EnumC766540U5c VOICE_EFFECT_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC766540U5c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC766540U5c enumC766540U5c = new EnumC766540U5c("SOUND_EFFECT_PANEL", 0, "sound_effect");
        SOUND_EFFECT_PANEL = enumC766540U5c;
        EnumC766540U5c enumC766540U5c2 = new EnumC766540U5c("STICKER_EFFECT_PANEL", 1, "sticker_effect");
        STICKER_EFFECT_PANEL = enumC766540U5c2;
        EnumC766540U5c enumC766540U5c3 = new EnumC766540U5c("VOICE_EFFECT_PANEL", 2, "voice_effect");
        VOICE_EFFECT_PANEL = enumC766540U5c3;
        EnumC766540U5c enumC766540U5c4 = new EnumC766540U5c("BEAUTY_PANEL", 3, "beauty_effect");
        BEAUTY_PANEL = enumC766540U5c4;
        EnumC766540U5c enumC766540U5c5 = new EnumC766540U5c("BACKGROUND_PANEL", 4, "background_effect");
        BACKGROUND_PANEL = enumC766540U5c5;
        EnumC766540U5c enumC766540U5c6 = new EnumC766540U5c("DIALOG_BIZ_OTHERS", 5, "others");
        DIALOG_BIZ_OTHERS = enumC766540U5c6;
        EnumC766540U5c[] enumC766540U5cArr = {enumC766540U5c, enumC766540U5c2, enumC766540U5c3, enumC766540U5c4, enumC766540U5c5, enumC766540U5c6};
        LLILLJJLI = enumC766540U5cArr;
        LLILLL = new C2254308sP(enumC766540U5cArr);
    }

    public static EnumC766540U5c[] values() {
        return (EnumC766540U5c[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC766540U5c valueOf(String str) {
        return (EnumC766540U5c) C08FF.LIZ(EnumC766540U5c.class, str);
    }

    public EnumC766540U5c(String str, int i, String str2) {
        this.LL = str2;
    }
}
