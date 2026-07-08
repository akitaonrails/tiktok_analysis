package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC638250P1r {
    public static final /* synthetic */ EnumC638250P1r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC638250P1r PRIMARY;
    public static final EnumC638250P1r SECONDARY;

    public static InterfaceC2044707zh<EnumC638250P1r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC638250P1r enumC638250P1r = new EnumC638250P1r("PRIMARY", 0);
        PRIMARY = enumC638250P1r;
        EnumC638250P1r enumC638250P1r2 = new EnumC638250P1r("SECONDARY", 1);
        SECONDARY = enumC638250P1r2;
        EnumC638250P1r[] enumC638250P1rArr = {enumC638250P1r, enumC638250P1r2};
        LL = enumC638250P1rArr;
        LLILLJJLI = new C2254308sP(enumC638250P1rArr);
    }

    public static EnumC638250P1r[] values() {
        return (EnumC638250P1r[]) LL.clone();
    }

    public static EnumC638250P1r valueOf(String str) {
        return (EnumC638250P1r) C08FF.LIZ(EnumC638250P1r.class, str);
    }

    public EnumC638250P1r(String str, int i) {
    }
}
