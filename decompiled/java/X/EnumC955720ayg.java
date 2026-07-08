package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955720ayg {
    public static final EnumC955720ayg INVITING;
    public static final /* synthetic */ EnumC955720ayg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC955720ayg MATURETHEME;
    public static final EnumC955720ayg NORMAL;
    public static final EnumC955720ayg OFFLINE;
    public static final EnumC955720ayg UNAVAILABLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC955720ayg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955720ayg enumC955720ayg = new EnumC955720ayg("NORMAL", 0, 0);
        NORMAL = enumC955720ayg;
        EnumC955720ayg enumC955720ayg2 = new EnumC955720ayg("INVITING", 1, 1);
        INVITING = enumC955720ayg2;
        EnumC955720ayg enumC955720ayg3 = new EnumC955720ayg("UNAVAILABLE", 2, 2);
        UNAVAILABLE = enumC955720ayg3;
        EnumC955720ayg enumC955720ayg4 = new EnumC955720ayg("MATURETHEME", 3, 3);
        MATURETHEME = enumC955720ayg4;
        EnumC955720ayg enumC955720ayg5 = new EnumC955720ayg("OFFLINE", 4, 4);
        OFFLINE = enumC955720ayg5;
        EnumC955720ayg[] enumC955720aygArr = {enumC955720ayg, enumC955720ayg2, enumC955720ayg3, enumC955720ayg4, enumC955720ayg5};
        LLILLJJLI = enumC955720aygArr;
        LLILLL = new C2254308sP(enumC955720aygArr);
    }

    public static EnumC955720ayg[] values() {
        return (EnumC955720ayg[]) LLILLJJLI.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public static EnumC955720ayg valueOf(String str) {
        return (EnumC955720ayg) C08FF.LIZ(EnumC955720ayg.class, str);
    }

    public EnumC955720ayg(String str, int i, int i2) {
        this.LL = i2;
    }
}
