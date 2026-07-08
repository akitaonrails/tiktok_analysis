package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757150vpJ {
    public static final EnumC1757150vpJ AUTO;
    public static final EnumC1757150vpJ HIDE;
    public static final /* synthetic */ EnumC1757150vpJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757150vpJ MANUAL;
    public static final EnumC1757150vpJ MEDIA_CONFLICT;
    public static final EnumC1757150vpJ NEXT;
    public static final EnumC1757150vpJ QUIT_APP;
    public static final EnumC1757150vpJ RETURN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757150vpJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1757150vpJ enumC1757150vpJ = new EnumC1757150vpJ("MANUAL", 0, "manual");
        MANUAL = enumC1757150vpJ;
        EnumC1757150vpJ enumC1757150vpJ2 = new EnumC1757150vpJ("AUTO", 1, "auto");
        AUTO = enumC1757150vpJ2;
        EnumC1757150vpJ enumC1757150vpJ3 = new EnumC1757150vpJ("RETURN", 2, "return");
        RETURN = enumC1757150vpJ3;
        EnumC1757150vpJ enumC1757150vpJ4 = new EnumC1757150vpJ("NEXT", 3, "next");
        NEXT = enumC1757150vpJ4;
        EnumC1757150vpJ enumC1757150vpJ5 = new EnumC1757150vpJ("QUIT_APP", 4, "quit_app");
        QUIT_APP = enumC1757150vpJ5;
        EnumC1757150vpJ enumC1757150vpJ6 = new EnumC1757150vpJ("MEDIA_CONFLICT", 5, "media_conflict");
        MEDIA_CONFLICT = enumC1757150vpJ6;
        EnumC1757150vpJ enumC1757150vpJ7 = new EnumC1757150vpJ("HIDE", 6, "hide");
        HIDE = enumC1757150vpJ7;
        EnumC1757150vpJ[] enumC1757150vpJArr = {enumC1757150vpJ, enumC1757150vpJ2, enumC1757150vpJ3, enumC1757150vpJ4, enumC1757150vpJ5, enumC1757150vpJ6, enumC1757150vpJ7};
        LLILLJJLI = enumC1757150vpJArr;
        LLILLL = new C2254308sP(enumC1757150vpJArr);
    }

    public static EnumC1757150vpJ[] values() {
        return (EnumC1757150vpJ[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1757150vpJ valueOf(String str) {
        return (EnumC1757150vpJ) C08FF.LIZ(EnumC1757150vpJ.class, str);
    }

    public EnumC1757150vpJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
