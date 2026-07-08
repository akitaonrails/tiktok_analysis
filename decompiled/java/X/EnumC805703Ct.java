package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC805703Ct {
    public static final /* synthetic */ EnumC805703Ct[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC805703Ct ORDER_HAVE_CREATED;
    public static final EnumC805703Ct ORDER_NO_CREATED;

    public static InterfaceC2044707zh<EnumC805703Ct> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC805703Ct enumC805703Ct = new EnumC805703Ct("ORDER_NO_CREATED", 0);
        ORDER_NO_CREATED = enumC805703Ct;
        EnumC805703Ct enumC805703Ct2 = new EnumC805703Ct("ORDER_HAVE_CREATED", 1);
        ORDER_HAVE_CREATED = enumC805703Ct2;
        EnumC805703Ct[] enumC805703CtArr = {enumC805703Ct, enumC805703Ct2};
        LL = enumC805703CtArr;
        LLILLJJLI = new C2254308sP(enumC805703CtArr);
    }

    public static EnumC805703Ct[] values() {
        return (EnumC805703Ct[]) LL.clone();
    }

    public static EnumC805703Ct valueOf(String str) {
        return (EnumC805703Ct) C08FF.LIZ(EnumC805703Ct.class, str);
    }

    public EnumC805703Ct(String str, int i) {
    }
}
