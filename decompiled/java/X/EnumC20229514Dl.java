package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20229514Dl {
    public static final EnumC20229514Dl HEADER;
    public static final /* synthetic */ EnumC20229514Dl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20229514Dl LYNX;
    public static final EnumC20229514Dl PRODUCT_INFO;

    public static InterfaceC2044707zh<EnumC20229514Dl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20229514Dl enumC20229514Dl = new EnumC20229514Dl("HEADER", 0);
        HEADER = enumC20229514Dl;
        EnumC20229514Dl enumC20229514Dl2 = new EnumC20229514Dl("PRODUCT_INFO", 1);
        PRODUCT_INFO = enumC20229514Dl2;
        EnumC20229514Dl enumC20229514Dl3 = new EnumC20229514Dl("LYNX", 2);
        LYNX = enumC20229514Dl3;
        EnumC20229514Dl[] enumC20229514DlArr = {enumC20229514Dl, enumC20229514Dl2, enumC20229514Dl3};
        LL = enumC20229514DlArr;
        LLILLJJLI = new C2254308sP(enumC20229514DlArr);
    }

    public static EnumC20229514Dl[] values() {
        return (EnumC20229514Dl[]) LL.clone();
    }

    public static EnumC20229514Dl valueOf(String str) {
        return (EnumC20229514Dl) C08FF.LIZ(EnumC20229514Dl.class, str);
    }

    public EnumC20229514Dl(String str, int i) {
    }
}
