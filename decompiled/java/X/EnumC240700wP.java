package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC240700wP {
    public static final EnumC240700wP CLICK;
    public static final /* synthetic */ EnumC240700wP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC240700wP SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC240700wP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC240700wP enumC240700wP = new EnumC240700wP("CLICK", 0, "click");
        CLICK = enumC240700wP;
        EnumC240700wP enumC240700wP2 = new EnumC240700wP("SHOW", 1, "show");
        SHOW = enumC240700wP2;
        EnumC240700wP[] enumC240700wPArr = {enumC240700wP, enumC240700wP2};
        LLILLJJLI = enumC240700wPArr;
        LLILLL = new C2254308sP(enumC240700wPArr);
    }

    public static EnumC240700wP[] values() {
        return (EnumC240700wP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC240700wP valueOf(String str) {
        return (EnumC240700wP) C08FF.LIZ(EnumC240700wP.class, str);
    }

    public EnumC240700wP(String str, int i, String str2) {
        this.LL = str2;
    }
}
