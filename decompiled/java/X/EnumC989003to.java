package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03to, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC989003to {
    public static final EnumC989003to FULL_PAGE;
    public static final EnumC989003to HALF_PAGE;
    public static final /* synthetic */ EnumC989003to[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC989003to> getEntries() {
        return LLILLL;
    }

    static {
        EnumC989003to enumC989003to = new EnumC989003to("FULL_PAGE", 0, "FULL_PAGE");
        FULL_PAGE = enumC989003to;
        EnumC989003to enumC989003to2 = new EnumC989003to("HALF_PAGE", 1, "HALF_PAGE");
        HALF_PAGE = enumC989003to2;
        EnumC989003to[] enumC989003toArr = {enumC989003to, enumC989003to2};
        LLILLJJLI = enumC989003toArr;
        LLILLL = new C2254308sP(enumC989003toArr);
    }

    public static EnumC989003to[] values() {
        return (EnumC989003to[]) LLILLJJLI.clone();
    }

    public final String getStyle() {
        return this.LL;
    }

    public static EnumC989003to valueOf(String str) {
        return (EnumC989003to) C08FF.LIZ(EnumC989003to.class, str);
    }

    public EnumC989003to(String str, int i, String str2) {
        this.LL = str2;
    }
}
