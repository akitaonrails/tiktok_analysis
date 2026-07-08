package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC845640XFi {
    public static final EnumC845640XFi BLOB;
    public static final /* synthetic */ EnumC845640XFi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC845640XFi PROVIDER;

    public static InterfaceC2044707zh<EnumC845640XFi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC845640XFi enumC845640XFi = new EnumC845640XFi("PROVIDER", 0);
        PROVIDER = enumC845640XFi;
        EnumC845640XFi enumC845640XFi2 = new EnumC845640XFi("BLOB", 1);
        BLOB = enumC845640XFi2;
        EnumC845640XFi[] enumC845640XFiArr = {enumC845640XFi, enumC845640XFi2};
        LL = enumC845640XFiArr;
        LLILLJJLI = new C2254308sP(enumC845640XFiArr);
    }

    public static EnumC845640XFi[] values() {
        return (EnumC845640XFi[]) LL.clone();
    }

    public static EnumC845640XFi valueOf(String str) {
        return (EnumC845640XFi) C08FF.LIZ(EnumC845640XFi.class, str);
    }

    public EnumC845640XFi(String str, int i) {
    }
}
