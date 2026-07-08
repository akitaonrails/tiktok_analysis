package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Znb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910410Znb {
    public static final C910500Znk Companion;
    public static final /* synthetic */ EnumC910410Znb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC910410Znb NORMAL;
    public static final EnumC910410Znb SMALL;
    public static final EnumC910410Znb VERY_SMALL;

    public static InterfaceC2044707zh<EnumC910410Znb> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Znk] */
    static {
        EnumC910410Znb enumC910410Znb = new EnumC910410Znb("NORMAL", 0);
        NORMAL = enumC910410Znb;
        EnumC910410Znb enumC910410Znb2 = new EnumC910410Znb("SMALL", 1);
        SMALL = enumC910410Znb2;
        EnumC910410Znb enumC910410Znb3 = new EnumC910410Znb("VERY_SMALL", 2);
        VERY_SMALL = enumC910410Znb3;
        EnumC910410Znb[] enumC910410ZnbArr = {enumC910410Znb, enumC910410Znb2, enumC910410Znb3};
        LL = enumC910410ZnbArr;
        LLILLJJLI = new C2254308sP(enumC910410ZnbArr);
        Companion = new Object() { // from class: X.0Znk
        };
    }

    public static EnumC910410Znb[] values() {
        return (EnumC910410Znb[]) LL.clone();
    }

    public static EnumC910410Znb valueOf(String str) {
        return (EnumC910410Znb) C08FF.LIZ(EnumC910410Znb.class, str);
    }

    public EnumC910410Znb(String str, int i) {
    }
}
