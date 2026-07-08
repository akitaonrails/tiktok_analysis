package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227200i2Y {
    public static final EnumC1227200i2Y FOLLOWING;
    public static final /* synthetic */ EnumC1227200i2Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1227200i2Y MAF;
    public static final EnumC1227200i2Y MUF;
    public static final EnumC1227200i2Y OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1227200i2Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1227200i2Y enumC1227200i2Y = new EnumC1227200i2Y("MUF", 0, "muf");
        MUF = enumC1227200i2Y;
        EnumC1227200i2Y enumC1227200i2Y2 = new EnumC1227200i2Y("MAF", 1, "maf");
        MAF = enumC1227200i2Y2;
        EnumC1227200i2Y enumC1227200i2Y3 = new EnumC1227200i2Y("FOLLOWING", 2, "following");
        FOLLOWING = enumC1227200i2Y3;
        EnumC1227200i2Y enumC1227200i2Y4 = new EnumC1227200i2Y("OTHER", 3, "other");
        OTHER = enumC1227200i2Y4;
        EnumC1227200i2Y[] enumC1227200i2YArr = {enumC1227200i2Y, enumC1227200i2Y2, enumC1227200i2Y3, enumC1227200i2Y4};
        LLILLJJLI = enumC1227200i2YArr;
        LLILLL = new C2254308sP(enumC1227200i2YArr);
    }

    public static EnumC1227200i2Y[] values() {
        return (EnumC1227200i2Y[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1227200i2Y valueOf(String str) {
        return (EnumC1227200i2Y) C08FF.LIZ(EnumC1227200i2Y.class, str);
    }

    public EnumC1227200i2Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
