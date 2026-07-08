package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ijX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253850ijX {
    public static final EnumC1253850ijX BUSINESS;
    public static final EnumC1253850ijX CRASH;
    public static final C1253860ijY Companion;
    public static final EnumC1253850ijX ERROR;
    public static final EnumC1253850ijX ET;
    public static final EnumC1253850ijX LIFECYCLE;
    public static final /* synthetic */ EnumC1253850ijX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1253850ijX OTHERS;
    public static final EnumC1253850ijX PAGE;
    public static final EnumC1253850ijX REQUEST;
    public static final EnumC1253850ijX VISIBILITY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1253850ijX> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0ijY] */
    static {
        EnumC1253850ijX enumC1253850ijX = new EnumC1253850ijX("LIFECYCLE", 0, "LC");
        LIFECYCLE = enumC1253850ijX;
        EnumC1253850ijX enumC1253850ijX2 = new EnumC1253850ijX("PAGE", 1, "PG");
        PAGE = enumC1253850ijX2;
        EnumC1253850ijX enumC1253850ijX3 = new EnumC1253850ijX("ET", 2, "ET");
        ET = enumC1253850ijX3;
        EnumC1253850ijX enumC1253850ijX4 = new EnumC1253850ijX("REQUEST", 3, "RQ");
        REQUEST = enumC1253850ijX4;
        EnumC1253850ijX enumC1253850ijX5 = new EnumC1253850ijX("ERROR", 4, "ER");
        ERROR = enumC1253850ijX5;
        EnumC1253850ijX enumC1253850ijX6 = new EnumC1253850ijX("CRASH", 5, "CR");
        CRASH = enumC1253850ijX6;
        EnumC1253850ijX enumC1253850ijX7 = new EnumC1253850ijX("VISIBILITY", 6, "VB");
        VISIBILITY = enumC1253850ijX7;
        EnumC1253850ijX enumC1253850ijX8 = new EnumC1253850ijX("BUSINESS", 7, "BS");
        BUSINESS = enumC1253850ijX8;
        EnumC1253850ijX enumC1253850ijX9 = new EnumC1253850ijX("OTHERS", 8, "OT");
        OTHERS = enumC1253850ijX9;
        EnumC1253850ijX[] enumC1253850ijXArr = {enumC1253850ijX, enumC1253850ijX2, enumC1253850ijX3, enumC1253850ijX4, enumC1253850ijX5, enumC1253850ijX6, enumC1253850ijX7, enumC1253850ijX8, enumC1253850ijX9};
        LLILLJJLI = enumC1253850ijXArr;
        LLILLL = new C2254308sP(enumC1253850ijXArr);
        Companion = new Object() { // from class: X.0ijY
        };
    }

    public static EnumC1253850ijX[] values() {
        return (EnumC1253850ijX[]) LLILLJJLI.clone();
    }

    public final String getCode() {
        return this.LL;
    }

    public static EnumC1253850ijX valueOf(String str) {
        return (EnumC1253850ijX) C08FF.LIZ(EnumC1253850ijX.class, str);
    }

    public EnumC1253850ijX(String str, int i, String str2) {
        this.LL = str2;
    }
}
