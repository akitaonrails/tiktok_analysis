package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2358909Md {
    public static final EnumC2358909Md CACHE;
    public static final /* synthetic */ EnumC2358909Md[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "y+2T0brqfIqkZDbYHfFiN/8XI5fyqrwX5cSWeGVK0ys=";

    public static InterfaceC2044707zh<EnumC2358909Md> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2358909Md enumC2358909Md = new EnumC2358909Md();
        CACHE = enumC2358909Md;
        EnumC2358909Md[] enumC2358909MdArr = {enumC2358909Md};
        LLILLJJLI = enumC2358909MdArr;
        LLILLL = new C2254308sP(enumC2358909MdArr);
    }

    public static EnumC2358909Md[] values() {
        return (EnumC2358909Md[]) LLILLJJLI.clone();
    }

    public final String getToken() {
        return this.LL;
    }

    public static EnumC2358909Md valueOf(String str) {
        return (EnumC2358909Md) C08FF.LIZ(EnumC2358909Md.class, str);
    }
}
