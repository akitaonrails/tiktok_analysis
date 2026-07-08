package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC605370Nol {
    public static final EnumC605370Nol ACCOUNT_INFO_LOAD_BAR_ENTRANCE;
    public static final EnumC605370Nol ACCOUNT_INFO_LOAD_TYPE_DEFAULT;
    public static final /* synthetic */ EnumC605370Nol[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC605370Nol> getEntries() {
        return LLILLL;
    }

    static {
        EnumC605370Nol enumC605370Nol = new EnumC605370Nol("ACCOUNT_INFO_LOAD_TYPE_DEFAULT", 0, 0);
        ACCOUNT_INFO_LOAD_TYPE_DEFAULT = enumC605370Nol;
        EnumC605370Nol enumC605370Nol2 = new EnumC605370Nol("ACCOUNT_INFO_LOAD_BAR_ENTRANCE", 1, 1);
        ACCOUNT_INFO_LOAD_BAR_ENTRANCE = enumC605370Nol2;
        EnumC605370Nol[] enumC605370NolArr = {enumC605370Nol, enumC605370Nol2};
        LLILLJJLI = enumC605370NolArr;
        LLILLL = new C2254308sP(enumC605370NolArr);
    }

    public static EnumC605370Nol[] values() {
        return (EnumC605370Nol[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC605370Nol valueOf(String str) {
        return (EnumC605370Nol) C08FF.LIZ(EnumC605370Nol.class, str);
    }

    public EnumC605370Nol(String str, int i, int i2) {
        this.LL = i2;
    }
}
