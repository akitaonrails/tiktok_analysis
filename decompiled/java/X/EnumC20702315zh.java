package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20702315zh {
    public static final EnumC20702315zh CLA_CAPTIONS_TYPE_ORIGINAL;
    public static final EnumC20702315zh CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION;
    public static final EnumC20702315zh CLA_CAPTIONS_TYPE_UNSPECIFIED;
    public static final C20702415zi Companion;
    public static final /* synthetic */ EnumC20702315zh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20702315zh> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.15zi] */
    static {
        EnumC20702315zh enumC20702315zh = new EnumC20702315zh("CLA_CAPTIONS_TYPE_UNSPECIFIED", 0, 0);
        CLA_CAPTIONS_TYPE_UNSPECIFIED = enumC20702315zh;
        EnumC20702315zh enumC20702315zh2 = new EnumC20702315zh("CLA_CAPTIONS_TYPE_ORIGINAL", 1, 1);
        CLA_CAPTIONS_TYPE_ORIGINAL = enumC20702315zh2;
        EnumC20702315zh enumC20702315zh3 = new EnumC20702315zh("CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION", 2, 2);
        CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION = enumC20702315zh3;
        EnumC20702315zh[] enumC20702315zhArr = {enumC20702315zh, enumC20702315zh2, enumC20702315zh3};
        LLILLJJLI = enumC20702315zhArr;
        LLILLL = new C2254308sP(enumC20702315zhArr);
        Companion = new Object() { // from class: X.15zi
        };
    }

    public static EnumC20702315zh[] values() {
        return (EnumC20702315zh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20702315zh valueOf(String str) {
        return (EnumC20702315zh) C08FF.LIZ(EnumC20702315zh.class, str);
    }

    public EnumC20702315zh(String str, int i, int i2) {
        this.LL = i2;
    }
}
