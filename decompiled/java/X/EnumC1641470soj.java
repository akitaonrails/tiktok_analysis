package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641470soj {
    public static final EnumC1641470soj EMPTY;
    public static final EnumC1641470soj ERROR;
    public static final /* synthetic */ EnumC1641470soj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641470soj LOADING;
    public static final EnumC1641470soj NONE;

    public static InterfaceC2044707zh<EnumC1641470soj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641470soj enumC1641470soj = new EnumC1641470soj("NONE", 0);
        NONE = enumC1641470soj;
        EnumC1641470soj enumC1641470soj2 = new EnumC1641470soj("LOADING", 1);
        LOADING = enumC1641470soj2;
        EnumC1641470soj enumC1641470soj3 = new EnumC1641470soj("EMPTY", 2);
        EMPTY = enumC1641470soj3;
        EnumC1641470soj enumC1641470soj4 = new EnumC1641470soj("ERROR", 3);
        ERROR = enumC1641470soj4;
        EnumC1641470soj[] enumC1641470sojArr = {enumC1641470soj, enumC1641470soj2, enumC1641470soj3, enumC1641470soj4};
        LL = enumC1641470sojArr;
        LLILLJJLI = new C2254308sP(enumC1641470sojArr);
    }

    public static EnumC1641470soj[] values() {
        return (EnumC1641470soj[]) LL.clone();
    }

    public static EnumC1641470soj valueOf(String str) {
        return (EnumC1641470soj) C08FF.LIZ(EnumC1641470soj.class, str);
    }

    public EnumC1641470soj(String str, int i) {
    }
}
