package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381770m3r {
    public static final EnumC1381770m3r GROUP;
    public static final /* synthetic */ EnumC1381770m3r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1381770m3r PRIVATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1381770m3r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1381770m3r enumC1381770m3r = new EnumC1381770m3r("PRIVATE", 0, "private");
        PRIVATE = enumC1381770m3r;
        EnumC1381770m3r enumC1381770m3r2 = new EnumC1381770m3r("GROUP", 1, "group");
        GROUP = enumC1381770m3r2;
        EnumC1381770m3r[] enumC1381770m3rArr = {enumC1381770m3r, enumC1381770m3r2};
        LLILLJJLI = enumC1381770m3rArr;
        LLILLL = new C2254308sP(enumC1381770m3rArr);
    }

    public static EnumC1381770m3r[] values() {
        return (EnumC1381770m3r[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC1381770m3r valueOf(String str) {
        return (EnumC1381770m3r) C08FF.LIZ(EnumC1381770m3r.class, str);
    }

    public EnumC1381770m3r(String str, int i, String str2) {
        this.LL = str2;
    }
}
