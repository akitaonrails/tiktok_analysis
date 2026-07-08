package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1646906cd {
    public static final EnumC1646906cd FAVORITE;
    public static final EnumC1646906cd LIKED;
    public static final /* synthetic */ EnumC1646906cd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1646906cd REPOSTED;
    public static final EnumC1646906cd YOURS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1646906cd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1646906cd enumC1646906cd = new EnumC1646906cd("YOURS", 0, 0);
        YOURS = enumC1646906cd;
        EnumC1646906cd enumC1646906cd2 = new EnumC1646906cd("LIKED", 1, 1);
        LIKED = enumC1646906cd2;
        EnumC1646906cd enumC1646906cd3 = new EnumC1646906cd("FAVORITE", 2, 2);
        FAVORITE = enumC1646906cd3;
        EnumC1646906cd enumC1646906cd4 = new EnumC1646906cd("REPOSTED", 3, 3);
        REPOSTED = enumC1646906cd4;
        EnumC1646906cd[] enumC1646906cdArr = {enumC1646906cd, enumC1646906cd2, enumC1646906cd3, enumC1646906cd4};
        LLILLJJLI = enumC1646906cdArr;
        LLILLL = new C2254308sP(enumC1646906cdArr);
    }

    public static EnumC1646906cd[] values() {
        return (EnumC1646906cd[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1646906cd valueOf(String str) {
        return (EnumC1646906cd) C08FF.LIZ(EnumC1646906cd.class, str);
    }

    public EnumC1646906cd(String str, int i, int i2) {
        this.LL = i2;
    }
}
