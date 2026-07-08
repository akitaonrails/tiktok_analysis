package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC666410QBz {
    public static final EnumC666410QBz ERROR;
    public static final /* synthetic */ EnumC666410QBz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC666410QBz LOADING;

    public static InterfaceC2044707zh<EnumC666410QBz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC666410QBz enumC666410QBz = new EnumC666410QBz("LOADING", 0);
        LOADING = enumC666410QBz;
        EnumC666410QBz enumC666410QBz2 = new EnumC666410QBz("ERROR", 1);
        ERROR = enumC666410QBz2;
        EnumC666410QBz[] enumC666410QBzArr = {enumC666410QBz, enumC666410QBz2};
        LL = enumC666410QBzArr;
        LLILLJJLI = new C2254308sP(enumC666410QBzArr);
    }

    public static EnumC666410QBz[] values() {
        return (EnumC666410QBz[]) LL.clone();
    }

    public static EnumC666410QBz valueOf(String str) {
        return (EnumC666410QBz) C08FF.LIZ(EnumC666410QBz.class, str);
    }

    public EnumC666410QBz(String str, int i) {
    }
}
