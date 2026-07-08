package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623730OdH {
    public static final EnumC623730OdH BIND;
    public static final EnumC623730OdH CACHE_CHECK;
    public static final EnumC623730OdH COMPLETE;
    public static final EnumC623730OdH DISPLAY_END;
    public static final EnumC623730OdH DISPLAY_START;
    public static final EnumC623730OdH DOWNLOAD_END;
    public static final EnumC623730OdH DOWNLOAD_START;
    public static final EnumC623730OdH ERROR;
    public static final /* synthetic */ EnumC623730OdH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC623730OdH QUEUE_ENTER;

    public static InterfaceC2044707zh<EnumC623730OdH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC623730OdH enumC623730OdH = new EnumC623730OdH("BIND", 0);
        BIND = enumC623730OdH;
        EnumC623730OdH enumC623730OdH2 = new EnumC623730OdH("QUEUE_ENTER", 1);
        QUEUE_ENTER = enumC623730OdH2;
        EnumC623730OdH enumC623730OdH3 = new EnumC623730OdH("CACHE_CHECK", 2);
        CACHE_CHECK = enumC623730OdH3;
        EnumC623730OdH enumC623730OdH4 = new EnumC623730OdH("DOWNLOAD_START", 3);
        DOWNLOAD_START = enumC623730OdH4;
        EnumC623730OdH enumC623730OdH5 = new EnumC623730OdH("DOWNLOAD_END", 4);
        DOWNLOAD_END = enumC623730OdH5;
        EnumC623730OdH enumC623730OdH6 = new EnumC623730OdH("DISPLAY_START", 5);
        DISPLAY_START = enumC623730OdH6;
        EnumC623730OdH enumC623730OdH7 = new EnumC623730OdH("DISPLAY_END", 6);
        DISPLAY_END = enumC623730OdH7;
        EnumC623730OdH enumC623730OdH8 = new EnumC623730OdH("COMPLETE", 7);
        COMPLETE = enumC623730OdH8;
        EnumC623730OdH enumC623730OdH9 = new EnumC623730OdH("ERROR", 8);
        ERROR = enumC623730OdH9;
        EnumC623730OdH[] enumC623730OdHArr = {enumC623730OdH, enumC623730OdH2, enumC623730OdH3, enumC623730OdH4, enumC623730OdH5, enumC623730OdH6, enumC623730OdH7, enumC623730OdH8, enumC623730OdH9};
        LL = enumC623730OdHArr;
        LLILLJJLI = new C2254308sP(enumC623730OdHArr);
    }

    public static EnumC623730OdH[] values() {
        return (EnumC623730OdH[]) LL.clone();
    }

    public static EnumC623730OdH valueOf(String str) {
        return (EnumC623730OdH) C08FF.LIZ(EnumC623730OdH.class, str);
    }

    public EnumC623730OdH(String str, int i) {
    }
}
