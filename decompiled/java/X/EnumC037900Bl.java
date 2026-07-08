package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037900Bl {
    public static final EnumC037900Bl ADDED;
    public static final EnumC037900Bl IN_STORE;
    public static final /* synthetic */ EnumC037900Bl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC037900Bl LOADING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC037900Bl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC037900Bl enumC037900Bl = new EnumC037900Bl("LOADING", 0, 6);
        LOADING = enumC037900Bl;
        EnumC037900Bl enumC037900Bl2 = new EnumC037900Bl("ADDED", 1, 5);
        ADDED = enumC037900Bl2;
        EnumC037900Bl enumC037900Bl3 = new EnumC037900Bl("IN_STORE", 2, 4);
        IN_STORE = enumC037900Bl3;
        EnumC037900Bl[] enumC037900BlArr = {enumC037900Bl, enumC037900Bl2, enumC037900Bl3};
        LLILLJJLI = enumC037900BlArr;
        LLILLL = new C2254308sP(enumC037900BlArr);
    }

    public static EnumC037900Bl[] values() {
        return (EnumC037900Bl[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC037900Bl valueOf(String str) {
        return (EnumC037900Bl) C08FF.LIZ(EnumC037900Bl.class, str);
    }

    public EnumC037900Bl(String str, int i, int i2) {
        this.LL = i2;
    }
}
