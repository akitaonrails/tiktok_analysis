package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982770bgJ {
    public static final /* synthetic */ EnumC982770bgJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982770bgJ NORMAL;
    public static final EnumC982770bgJ SCORE_UPDATE;
    public static final EnumC982770bgJ UPDATE_FOLLOW_STATUS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC982770bgJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC982770bgJ enumC982770bgJ = new EnumC982770bgJ("NORMAL", 0, "normal");
        NORMAL = enumC982770bgJ;
        EnumC982770bgJ enumC982770bgJ2 = new EnumC982770bgJ("SCORE_UPDATE", 1, "score_update");
        SCORE_UPDATE = enumC982770bgJ2;
        EnumC982770bgJ enumC982770bgJ3 = new EnumC982770bgJ("UPDATE_FOLLOW_STATUS", 2, "update_follow_status");
        UPDATE_FOLLOW_STATUS = enumC982770bgJ3;
        EnumC982770bgJ[] enumC982770bgJArr = {enumC982770bgJ, enumC982770bgJ2, enumC982770bgJ3};
        LLILLJJLI = enumC982770bgJArr;
        LLILLL = new C2254308sP(enumC982770bgJArr);
    }

    public static EnumC982770bgJ[] values() {
        return (EnumC982770bgJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC982770bgJ valueOf(String str) {
        return (EnumC982770bgJ) C08FF.LIZ(EnumC982770bgJ.class, str);
    }

    public EnumC982770bgJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
