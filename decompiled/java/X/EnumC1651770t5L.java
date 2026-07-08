package X;

import iyl.i3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1651770t5L implements InterfaceC1651320t4c<i3> {
    public static final EnumC1651770t5L AI_ALIVE;
    public static final EnumC1651770t5L AI_CAPTION;
    public static final EnumC1651770t5L AI_THEATER;
    public static final EnumC1651770t5L BEAUTY;
    public static final EnumC1651770t5L CHANGE_RATIO;
    public static final EnumC1651770t5L COUNT_DOWN;
    public static final EnumC1651770t5L DUET_LAYOUT;
    public static final EnumC1651770t5L EMPTY;
    public static final EnumC1651770t5L FILTER;
    public static final EnumC1651770t5L FLASH;
    public static final EnumC1651770t5L GREEN_SCREEN;
    public static final EnumC1651770t5L HDR;
    public static final EnumC1651770t5L LAYOUT;
    public static final /* synthetic */ EnumC1651770t5L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1651770t5L MICROPHONE;
    public static final EnumC1651770t5L PORTRAIT;
    public static final EnumC1651770t5L REVERSE_CAMERA;
    public static final EnumC1651770t5L SPEED;
    public static final EnumC1651770t5L VOICE_CHANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1651770t5L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1651770t5L enumC1651770t5L = new EnumC1651770t5L("EMPTY", 0, "");
        EMPTY = enumC1651770t5L;
        EnumC1651770t5L enumC1651770t5L2 = new EnumC1651770t5L("SPEED", 1, "speed");
        SPEED = enumC1651770t5L2;
        EnumC1651770t5L enumC1651770t5L3 = new EnumC1651770t5L("FLASH", 2, "flash");
        FLASH = enumC1651770t5L3;
        EnumC1651770t5L enumC1651770t5L4 = new EnumC1651770t5L("AI_ALIVE", 3, "ai_alive");
        AI_ALIVE = enumC1651770t5L4;
        EnumC1651770t5L enumC1651770t5L5 = new EnumC1651770t5L("AI_THEATER", 4, "ai_theater");
        AI_THEATER = enumC1651770t5L5;
        EnumC1651770t5L enumC1651770t5L6 = new EnumC1651770t5L("COUNT_DOWN", 5, "timer");
        COUNT_DOWN = enumC1651770t5L6;
        EnumC1651770t5L enumC1651770t5L7 = new EnumC1651770t5L("REVERSE_CAMERA", 6, "reverse_camera");
        REVERSE_CAMERA = enumC1651770t5L7;
        EnumC1651770t5L enumC1651770t5L8 = new EnumC1651770t5L("BEAUTY", 7, "beauty");
        BEAUTY = enumC1651770t5L8;
        EnumC1651770t5L enumC1651770t5L9 = new EnumC1651770t5L("FILTER", 8, "filter");
        FILTER = enumC1651770t5L9;
        EnumC1651770t5L enumC1651770t5L10 = new EnumC1651770t5L("VOICE_CHANGE", 9, "voice_filter");
        VOICE_CHANGE = enumC1651770t5L10;
        EnumC1651770t5L enumC1651770t5L11 = new EnumC1651770t5L("MICROPHONE", 10, "microphone");
        MICROPHONE = enumC1651770t5L11;
        EnumC1651770t5L enumC1651770t5L12 = new EnumC1651770t5L("AI_CAPTION", 11, "ai_caption");
        AI_CAPTION = enumC1651770t5L12;
        EnumC1651770t5L enumC1651770t5L13 = new EnumC1651770t5L("DUET_LAYOUT", 12, "duet_layout");
        DUET_LAYOUT = enumC1651770t5L13;
        EnumC1651770t5L enumC1651770t5L14 = new EnumC1651770t5L("HDR", 13, "hdr");
        HDR = enumC1651770t5L14;
        EnumC1651770t5L enumC1651770t5L15 = new EnumC1651770t5L("CHANGE_RATIO", 14, "ratio");
        CHANGE_RATIO = enumC1651770t5L15;
        EnumC1651770t5L enumC1651770t5L16 = new EnumC1651770t5L("LAYOUT", 15, "layout");
        LAYOUT = enumC1651770t5L16;
        EnumC1651770t5L enumC1651770t5L17 = new EnumC1651770t5L("GREEN_SCREEN", 16, "green_screen");
        GREEN_SCREEN = enumC1651770t5L17;
        EnumC1651770t5L enumC1651770t5L18 = new EnumC1651770t5L("PORTRAIT", 17, "portrait");
        PORTRAIT = enumC1651770t5L18;
        EnumC1651770t5L[] enumC1651770t5LArr = {enumC1651770t5L, enumC1651770t5L2, enumC1651770t5L3, enumC1651770t5L4, enumC1651770t5L5, enumC1651770t5L6, enumC1651770t5L7, enumC1651770t5L8, enumC1651770t5L9, enumC1651770t5L10, enumC1651770t5L11, enumC1651770t5L12, enumC1651770t5L13, enumC1651770t5L14, enumC1651770t5L15, enumC1651770t5L16, enumC1651770t5L17, enumC1651770t5L18};
        LLILLJJLI = enumC1651770t5LArr;
        LLILLL = new C2254308sP(enumC1651770t5LArr);
    }

    public static EnumC1651770t5L[] values() {
        return (EnumC1651770t5L[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC1651320t4c
    public String getKey() {
        return this.LL;
    }

    public static EnumC1651770t5L valueOf(String str) {
        return (EnumC1651770t5L) C08FF.LIZ(EnumC1651770t5L.class, str);
    }

    public EnumC1651770t5L(String str, int i, String str2) {
        this.LL = str2;
    }
}
