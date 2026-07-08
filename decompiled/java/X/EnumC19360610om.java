package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19360610om {
    public static final EnumC19360610om ASCENDING;
    public static final EnumC19360610om DESCENDING;
    public static final /* synthetic */ EnumC19360610om[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19360610om UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19360610om> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19360610om enumC19360610om = new EnumC19360610om("UNKNOWN", 0, 0);
        UNKNOWN = enumC19360610om;
        EnumC19360610om enumC19360610om2 = new EnumC19360610om("DESCENDING", 1, 1);
        DESCENDING = enumC19360610om2;
        EnumC19360610om enumC19360610om3 = new EnumC19360610om("ASCENDING", 2, 2);
        ASCENDING = enumC19360610om3;
        EnumC19360610om[] enumC19360610omArr = {enumC19360610om, enumC19360610om2, enumC19360610om3};
        LLILLJJLI = enumC19360610omArr;
        LLILLL = new C2254308sP(enumC19360610omArr);
    }

    public static EnumC19360610om[] values() {
        return (EnumC19360610om[]) LLILLJJLI.clone();
    }

    public final int getOrder() {
        return this.LL;
    }

    public static EnumC19360610om valueOf(String str) {
        return (EnumC19360610om) C08FF.LIZ(EnumC19360610om.class, str);
    }

    public EnumC19360610om(String str, int i, int i2) {
        this.LL = i2;
    }
}
