package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1226770i1r {
    public static final EnumC1226770i1r AVAILABILITY;
    public static final /* synthetic */ EnumC1226770i1r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1226770i1r VISIBILITY;

    public static InterfaceC2044707zh<EnumC1226770i1r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1226770i1r enumC1226770i1r = new EnumC1226770i1r("VISIBILITY", 0);
        VISIBILITY = enumC1226770i1r;
        EnumC1226770i1r enumC1226770i1r2 = new EnumC1226770i1r("AVAILABILITY", 1);
        AVAILABILITY = enumC1226770i1r2;
        EnumC1226770i1r[] enumC1226770i1rArr = {enumC1226770i1r, enumC1226770i1r2};
        LL = enumC1226770i1rArr;
        LLILLJJLI = new C2254308sP(enumC1226770i1rArr);
    }

    public static EnumC1226770i1r[] values() {
        return (EnumC1226770i1r[]) LL.clone();
    }

    public static EnumC1226770i1r valueOf(String str) {
        return (EnumC1226770i1r) C08FF.LIZ(EnumC1226770i1r.class, str);
    }

    public EnumC1226770i1r(String str, int i) {
    }
}
