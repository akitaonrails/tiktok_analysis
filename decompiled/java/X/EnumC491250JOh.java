package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC491250JOh {
    public static final EnumC491250JOh CLICK;
    public static final /* synthetic */ EnumC491250JOh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC491250JOh SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC491250JOh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC491250JOh enumC491250JOh = new EnumC491250JOh("CLICK", 0, "click");
        CLICK = enumC491250JOh;
        EnumC491250JOh enumC491250JOh2 = new EnumC491250JOh("SHOW", 1, "show");
        SHOW = enumC491250JOh2;
        EnumC491250JOh[] enumC491250JOhArr = {enumC491250JOh, enumC491250JOh2};
        LLILLJJLI = enumC491250JOhArr;
        LLILLL = new C2254308sP(enumC491250JOhArr);
    }

    public static EnumC491250JOh[] values() {
        return (EnumC491250JOh[]) LLILLJJLI.clone();
    }

    public final String getLogValue() {
        return this.LL;
    }

    public static EnumC491250JOh valueOf(String str) {
        return (EnumC491250JOh) C08FF.LIZ(EnumC491250JOh.class, str);
    }

    public EnumC491250JOh(String str, int i, String str2) {
        this.LL = str2;
    }
}
