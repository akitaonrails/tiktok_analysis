package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.017r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2829017r {
    public static final C2831017t Companion;
    public static final /* synthetic */ EnumC2829017r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2829017r OFF;
    public static final EnumC2829017r PERSISTENT_24_HOURS;
    public static final EnumC2829017r SESSION_ONLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2829017r> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.017t] */
    static {
        EnumC2829017r enumC2829017r = new EnumC2829017r("OFF", 0, 0);
        OFF = enumC2829017r;
        EnumC2829017r enumC2829017r2 = new EnumC2829017r("SESSION_ONLY", 1, 1);
        SESSION_ONLY = enumC2829017r2;
        EnumC2829017r enumC2829017r3 = new EnumC2829017r("PERSISTENT_24_HOURS", 2, 2);
        PERSISTENT_24_HOURS = enumC2829017r3;
        EnumC2829017r[] enumC2829017rArr = {enumC2829017r, enumC2829017r2, enumC2829017r3};
        LLILLJJLI = enumC2829017rArr;
        LLILLL = new C2254308sP(enumC2829017rArr);
        Companion = new Object() { // from class: X.017t
        };
    }

    public static EnumC2829017r[] values() {
        return (EnumC2829017r[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2829017r valueOf(String str) {
        return (EnumC2829017r) C08FF.LIZ(EnumC2829017r.class, str);
    }

    public EnumC2829017r(String str, int i, int i2) {
        this.LL = i2;
    }
}
