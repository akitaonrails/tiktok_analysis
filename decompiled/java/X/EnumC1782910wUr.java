package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782910wUr {
    public static final EnumC1782910wUr BUFFERING;
    public static final EnumC1782910wUr FIRST_FRAME;
    public static final EnumC1782910wUr IDLE;
    public static final /* synthetic */ EnumC1782910wUr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782910wUr PAUSED;
    public static final EnumC1782910wUr PLAYING;

    public static InterfaceC2044707zh<EnumC1782910wUr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782910wUr enumC1782910wUr = new EnumC1782910wUr("IDLE", 0);
        IDLE = enumC1782910wUr;
        EnumC1782910wUr enumC1782910wUr2 = new EnumC1782910wUr("BUFFERING", 1);
        BUFFERING = enumC1782910wUr2;
        EnumC1782910wUr enumC1782910wUr3 = new EnumC1782910wUr("FIRST_FRAME", 2);
        FIRST_FRAME = enumC1782910wUr3;
        EnumC1782910wUr enumC1782910wUr4 = new EnumC1782910wUr("PLAYING", 3);
        PLAYING = enumC1782910wUr4;
        EnumC1782910wUr enumC1782910wUr5 = new EnumC1782910wUr("PAUSED", 4);
        PAUSED = enumC1782910wUr5;
        EnumC1782910wUr[] enumC1782910wUrArr = {enumC1782910wUr, enumC1782910wUr2, enumC1782910wUr3, enumC1782910wUr4, enumC1782910wUr5};
        LL = enumC1782910wUrArr;
        LLILLJJLI = new C2254308sP(enumC1782910wUrArr);
    }

    public static EnumC1782910wUr[] values() {
        return (EnumC1782910wUr[]) LL.clone();
    }

    public static EnumC1782910wUr valueOf(String str) {
        return (EnumC1782910wUr) C08FF.LIZ(EnumC1782910wUr.class, str);
    }

    public EnumC1782910wUr(String str, int i) {
    }
}
