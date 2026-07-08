package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC719760SLe {
    public static final EnumC719760SLe CLEAR_MODE;
    public static final /* synthetic */ EnumC719760SLe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC719760SLe NORMAL;
    public static final EnumC719760SLe ZOOM_FIX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC719760SLe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC719760SLe enumC719760SLe = new EnumC719760SLe("NORMAL", 0, "original");
        NORMAL = enumC719760SLe;
        EnumC719760SLe enumC719760SLe2 = new EnumC719760SLe("CLEAR_MODE", 1, "clear_screen");
        CLEAR_MODE = enumC719760SLe2;
        EnumC719760SLe enumC719760SLe3 = new EnumC719760SLe("ZOOM_FIX", 2, "zoom");
        ZOOM_FIX = enumC719760SLe3;
        EnumC719760SLe[] enumC719760SLeArr = {enumC719760SLe, enumC719760SLe2, enumC719760SLe3};
        LLILLJJLI = enumC719760SLeArr;
        LLILLL = new C2254308sP(enumC719760SLeArr);
    }

    public static EnumC719760SLe[] values() {
        return (EnumC719760SLe[]) LLILLJJLI.clone();
    }

    public final String getPhotoViewStatus() {
        return this.LL;
    }

    public static EnumC719760SLe valueOf(String str) {
        return (EnumC719760SLe) C08FF.LIZ(EnumC719760SLe.class, str);
    }

    public EnumC719760SLe(String str, int i, String str2) {
        this.LL = str2;
    }
}
