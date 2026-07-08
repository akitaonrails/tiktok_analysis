package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412750mrp {
    public static final EnumC1412750mrp AUTO_SHOW;
    public static final EnumC1412750mrp CLICK;
    public static final /* synthetic */ EnumC1412750mrp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1412750mrp PAGE_SWIPE;
    public static final EnumC1412750mrp UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1412750mrp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1412750mrp enumC1412750mrp = new EnumC1412750mrp("AUTO_SHOW", 0, "auto");
        AUTO_SHOW = enumC1412750mrp;
        EnumC1412750mrp enumC1412750mrp2 = new EnumC1412750mrp("PAGE_SWIPE", 1, "swipe");
        PAGE_SWIPE = enumC1412750mrp2;
        EnumC1412750mrp enumC1412750mrp3 = new EnumC1412750mrp("CLICK", 2, "click");
        CLICK = enumC1412750mrp3;
        EnumC1412750mrp enumC1412750mrp4 = new EnumC1412750mrp("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC1412750mrp4;
        EnumC1412750mrp[] enumC1412750mrpArr = {enumC1412750mrp, enumC1412750mrp2, enumC1412750mrp3, enumC1412750mrp4};
        LLILLJJLI = enumC1412750mrpArr;
        LLILLL = new C2254308sP(enumC1412750mrpArr);
    }

    public static EnumC1412750mrp[] values() {
        return (EnumC1412750mrp[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1412750mrp valueOf(String str) {
        return (EnumC1412750mrp) C08FF.LIZ(EnumC1412750mrp.class, str);
    }

    public EnumC1412750mrp(String str, int i, String str2) {
        this.LL = str2;
    }
}
