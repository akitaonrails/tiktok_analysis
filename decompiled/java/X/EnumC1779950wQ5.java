package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779950wQ5 {
    public static final EnumC1779950wQ5 FIXEDWIDTH;
    public static final EnumC1779950wQ5 HUGCONTENT;
    public static final /* synthetic */ EnumC1779950wQ5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1779950wQ5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779950wQ5 enumC1779950wQ5 = new EnumC1779950wQ5("HUGCONTENT", 0);
        HUGCONTENT = enumC1779950wQ5;
        EnumC1779950wQ5 enumC1779950wQ52 = new EnumC1779950wQ5("FIXEDWIDTH", 1);
        FIXEDWIDTH = enumC1779950wQ52;
        EnumC1779950wQ5[] enumC1779950wQ5Arr = {enumC1779950wQ5, enumC1779950wQ52};
        LL = enumC1779950wQ5Arr;
        LLILLJJLI = new C2254308sP(enumC1779950wQ5Arr);
    }

    public static EnumC1779950wQ5[] values() {
        return (EnumC1779950wQ5[]) LL.clone();
    }

    public static EnumC1779950wQ5 valueOf(String str) {
        return (EnumC1779950wQ5) C08FF.LIZ(EnumC1779950wQ5.class, str);
    }

    public EnumC1779950wQ5(String str, int i) {
    }
}
