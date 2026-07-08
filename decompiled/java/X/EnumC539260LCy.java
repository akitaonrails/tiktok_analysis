package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539260LCy {
    public static final EnumC539260LCy COUNTDOWN_PAGE;
    public static final EnumC539260LCy GENERATION_PAGE;
    public static final /* synthetic */ EnumC539260LCy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC539260LCy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC539260LCy enumC539260LCy = new EnumC539260LCy("COUNTDOWN_PAGE", 0, "countdown_page");
        COUNTDOWN_PAGE = enumC539260LCy;
        EnumC539260LCy enumC539260LCy2 = new EnumC539260LCy("GENERATION_PAGE", 1, "generation_page");
        GENERATION_PAGE = enumC539260LCy2;
        EnumC539260LCy[] enumC539260LCyArr = {enumC539260LCy, enumC539260LCy2};
        LLILLJJLI = enumC539260LCyArr;
        LLILLL = new C2254308sP(enumC539260LCyArr);
    }

    public static EnumC539260LCy[] values() {
        return (EnumC539260LCy[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC539260LCy valueOf(String str) {
        return (EnumC539260LCy) C08FF.LIZ(EnumC539260LCy.class, str);
    }

    public EnumC539260LCy(String str, int i, String str2) {
        this.LL = str2;
    }
}
