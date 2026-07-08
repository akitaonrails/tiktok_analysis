package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC339930DUh {
    public static final EnumC339930DUh DRAFT;
    public static final EnumC339930DUh FOOTER;
    public static final EnumC339930DUh HEADER;
    public static final /* synthetic */ EnumC339930DUh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC339930DUh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC339930DUh enumC339930DUh = new EnumC339930DUh("HEADER", 0);
        HEADER = enumC339930DUh;
        EnumC339930DUh enumC339930DUh2 = new EnumC339930DUh("DRAFT", 1);
        DRAFT = enumC339930DUh2;
        EnumC339930DUh enumC339930DUh3 = new EnumC339930DUh("FOOTER", 2);
        FOOTER = enumC339930DUh3;
        EnumC339930DUh[] enumC339930DUhArr = {enumC339930DUh, enumC339930DUh2, enumC339930DUh3};
        LL = enumC339930DUhArr;
        LLILLJJLI = new C2254308sP(enumC339930DUhArr);
    }

    public static EnumC339930DUh[] values() {
        return (EnumC339930DUh[]) LL.clone();
    }

    public static EnumC339930DUh valueOf(String str) {
        return (EnumC339930DUh) C08FF.LIZ(EnumC339930DUh.class, str);
    }

    public EnumC339930DUh(String str, int i) {
    }
}
