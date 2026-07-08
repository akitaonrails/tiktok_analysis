package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1390600mI6 {
    public static final EnumC1390600mI6 LL;
    public static final EnumC1390600mI6 LLILLJJLI;
    public static final EnumC1390600mI6 LLILLL;
    public static final /* synthetic */ EnumC1390600mI6[] LLILZ;

    static {
        EnumC1390600mI6 enumC1390600mI6 = new EnumC1390600mI6("NOT_INIT", 0);
        LL = enumC1390600mI6;
        EnumC1390600mI6 enumC1390600mI62 = new EnumC1390600mI6("RUNNING", 1);
        LLILLJJLI = enumC1390600mI62;
        EnumC1390600mI6 enumC1390600mI63 = new EnumC1390600mI6("STOPPED", 2);
        LLILLL = enumC1390600mI63;
        EnumC1390600mI6[] enumC1390600mI6Arr = {enumC1390600mI6, enumC1390600mI62, enumC1390600mI63};
        LLILZ = enumC1390600mI6Arr;
        new C2254308sP(enumC1390600mI6Arr);
    }

    public static EnumC1390600mI6[] values() {
        return (EnumC1390600mI6[]) LLILZ.clone();
    }

    public static EnumC1390600mI6 valueOf(String str) {
        return (EnumC1390600mI6) C08FF.LIZ(EnumC1390600mI6.class, str);
    }

    public EnumC1390600mI6(String str, int i) {
    }
}
