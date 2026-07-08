package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EG8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG8 {
    public static final C0EG8 CAPTION;
    public static final C0EG8 EDIT;
    public static final C0EG8 EFFECT;
    public static final C0EG8 GENERAL;
    public static final /* synthetic */ C0EG8[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0EG8 PIP;
    public static final C0EG8 SOUND;
    public static final C0EG8 SOUND_EFFECT;
    public static final C0EG8 TEXT;
    public static final C0EG8 TRANSITION;
    public static final C0EG8 VOICE_OVER;
    public String LL;
    public int LLILLJJLI;

    public static InterfaceC2044707zh<C0EG8> getEntries() {
        return LLILZ;
    }

    static {
        C0EG8 c0eg8 = new C0EG8("GENERAL", 0, "general", 0);
        GENERAL = c0eg8;
        C0EG8 c0eg82 = new C0EG8("EDIT", 1, "edit", 10);
        EDIT = c0eg82;
        C0EG8 c0eg83 = new C0EG8("SOUND", 2, "sound", 20);
        SOUND = c0eg83;
        C0EG8 c0eg84 = new C0EG8("SOUND_EFFECT", 3, "soundeffect", 30);
        SOUND_EFFECT = c0eg84;
        C0EG8 c0eg85 = new C0EG8("TEXT", 4, "text", 40);
        TEXT = c0eg85;
        C0EG8 c0eg86 = new C0EG8("EFFECT", 5, "effect", 50);
        EFFECT = c0eg86;
        C0EG8 c0eg87 = new C0EG8("VOICE_OVER", 6, "voiceover", 60);
        VOICE_OVER = c0eg87;
        C0EG8 c0eg88 = new C0EG8("TRANSITION", 7, "transition", 70);
        TRANSITION = c0eg88;
        C0EG8 c0eg89 = new C0EG8("PIP", 8, "pip", 80);
        PIP = c0eg89;
        C0EG8 c0eg810 = new C0EG8("CAPTION", 9, "caption", 90);
        CAPTION = c0eg810;
        C0EG8[] c0eg8Arr = {c0eg8, c0eg82, c0eg83, c0eg84, c0eg85, c0eg86, c0eg87, c0eg88, c0eg89, c0eg810};
        LLILLL = c0eg8Arr;
        LLILZ = new C2254308sP(c0eg8Arr);
    }

    public static C0EG8[] values() {
        return (C0EG8[]) LLILLL.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static C0EG8 valueOf(String str) {
        return (C0EG8) C08FF.LIZ(C0EG8.class, str);
    }

    public final void setType(String str) {
        this.LL = str;
    }

    public final void setValue(int i) {
        this.LLILLJJLI = i;
    }

    public C0EG8(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
