package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308710C8f {
    public static final /* synthetic */ EnumC308710C8f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC308710C8f QPS_RATIO;
    public static final EnumC308710C8f REFRESH_INTERVAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC308710C8f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308710C8f enumC308710C8f = new EnumC308710C8f("QPS_RATIO", 0, "qps_ratio");
        QPS_RATIO = enumC308710C8f;
        EnumC308710C8f enumC308710C8f2 = new EnumC308710C8f("REFRESH_INTERVAL", 1, "refresh_interval");
        REFRESH_INTERVAL = enumC308710C8f2;
        EnumC308710C8f[] enumC308710C8fArr = {enumC308710C8f, enumC308710C8f2};
        LLILLJJLI = enumC308710C8fArr;
        LLILLL = new C2254308sP(enumC308710C8fArr);
    }

    public static EnumC308710C8f[] values() {
        return (EnumC308710C8f[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC308710C8f valueOf(String str) {
        return (EnumC308710C8f) C08FF.LIZ(EnumC308710C8f.class, str);
    }

    public EnumC308710C8f(String str, int i, String str2) {
        this.LL = str2;
    }
}
