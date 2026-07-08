package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Azx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2197791Azx {
    public static final C1B0A Companion;
    public static final EnumC2197791Azx IAP;
    public static final /* synthetic */ EnumC2197791Azx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2197791Azx WEB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2197791Azx> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1B0A] */
    static {
        EnumC2197791Azx enumC2197791Azx = new EnumC2197791Azx("IAP", 0, "iap");
        IAP = enumC2197791Azx;
        EnumC2197791Azx enumC2197791Azx2 = new EnumC2197791Azx("WEB", 1, "web");
        WEB = enumC2197791Azx2;
        EnumC2197791Azx[] enumC2197791AzxArr = {enumC2197791Azx, enumC2197791Azx2};
        LLILLJJLI = enumC2197791AzxArr;
        LLILLL = new C2254308sP(enumC2197791AzxArr);
        Companion = new Object() { // from class: X.1B0A
        };
    }

    public static EnumC2197791Azx[] values() {
        return (EnumC2197791Azx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2197791Azx valueOf(String str) {
        return (EnumC2197791Azx) C08FF.LIZ(EnumC2197791Azx.class, str);
    }

    public EnumC2197791Azx(String str, int i, String str2) {
        this.LL = str2;
    }
}
