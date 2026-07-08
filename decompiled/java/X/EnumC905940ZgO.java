package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC905940ZgO {
    public static final /* synthetic */ EnumC905940ZgO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC905940ZgO RESUME;
    public static final EnumC905940ZgO RETRY;
    public static final EnumC905940ZgO START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC905940ZgO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC905940ZgO enumC905940ZgO = new EnumC905940ZgO("START", 0, "start");
        START = enumC905940ZgO;
        EnumC905940ZgO enumC905940ZgO2 = new EnumC905940ZgO("RESUME", 1, "resume");
        RESUME = enumC905940ZgO2;
        EnumC905940ZgO enumC905940ZgO3 = new EnumC905940ZgO("RETRY", 2, "retry");
        RETRY = enumC905940ZgO3;
        EnumC905940ZgO[] enumC905940ZgOArr = {enumC905940ZgO, enumC905940ZgO2, enumC905940ZgO3};
        LLILLJJLI = enumC905940ZgOArr;
        LLILLL = new C2254308sP(enumC905940ZgOArr);
    }

    public static EnumC905940ZgO[] values() {
        return (EnumC905940ZgO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC905940ZgO valueOf(String str) {
        return (EnumC905940ZgO) C08FF.LIZ(EnumC905940ZgO.class, str);
    }

    public EnumC905940ZgO(String str, int i, String str2) {
        this.LL = str2;
    }
}
