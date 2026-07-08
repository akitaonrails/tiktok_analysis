package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1909250zmd {
    public static final EnumC1909250zmd ACTIVATION;
    public static final EnumC1909250zmd INCENTIVE;
    public static final EnumC1909250zmd LIKE;
    public static final /* synthetic */ EnumC1909250zmd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1909250zmd WALLPAPER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1909250zmd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1909250zmd enumC1909250zmd = new EnumC1909250zmd("ACTIVATION", 0, "activation");
        ACTIVATION = enumC1909250zmd;
        EnumC1909250zmd enumC1909250zmd2 = new EnumC1909250zmd("LIKE", 1, "like");
        LIKE = enumC1909250zmd2;
        EnumC1909250zmd enumC1909250zmd3 = new EnumC1909250zmd("WALLPAPER", 2, "wallpaper");
        WALLPAPER = enumC1909250zmd3;
        EnumC1909250zmd enumC1909250zmd4 = new EnumC1909250zmd("INCENTIVE", 3, "withdraw");
        INCENTIVE = enumC1909250zmd4;
        EnumC1909250zmd[] enumC1909250zmdArr = {enumC1909250zmd, enumC1909250zmd2, enumC1909250zmd3, enumC1909250zmd4};
        LLILLJJLI = enumC1909250zmdArr;
        LLILLL = new C2254308sP(enumC1909250zmdArr);
    }

    public static EnumC1909250zmd[] values() {
        return (EnumC1909250zmd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1909250zmd valueOf(String str) {
        return (EnumC1909250zmd) C08FF.LIZ(EnumC1909250zmd.class, str);
    }

    public EnumC1909250zmd(String str, int i, String str2) {
        this.LL = str2;
    }
}
