package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.101d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC191783101d {
    public static final EnumC191783101d CONST_SECONDARY;
    public static final /* synthetic */ EnumC191783101d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC191783101d PRIMARY;
    public static final EnumC191783101d SECONDARY;

    public static InterfaceC2044707zh<EnumC191783101d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC191783101d enumC191783101d = new EnumC191783101d("PRIMARY", 0);
        PRIMARY = enumC191783101d;
        EnumC191783101d enumC191783101d2 = new EnumC191783101d("SECONDARY", 1);
        SECONDARY = enumC191783101d2;
        EnumC191783101d enumC191783101d3 = new EnumC191783101d("CONST_SECONDARY", 2);
        CONST_SECONDARY = enumC191783101d3;
        EnumC191783101d[] enumC191783101dArr = {enumC191783101d, enumC191783101d2, enumC191783101d3};
        LL = enumC191783101dArr;
        LLILLJJLI = new C2254308sP(enumC191783101dArr);
    }

    public static EnumC191783101d[] values() {
        return (EnumC191783101d[]) LL.clone();
    }

    public static EnumC191783101d valueOf(String str) {
        return (EnumC191783101d) C08FF.LIZ(EnumC191783101d.class, str);
    }

    public EnumC191783101d(String str, int i) {
    }
}
