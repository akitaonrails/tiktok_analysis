package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154900g9w {
    public static final EnumC1154900g9w CLA_AUTO_DUBBING;
    public static final EnumC1154900g9w CLA_ECOM_DUBBING;
    public static final C1154910g9x Companion;
    public static final /* synthetic */ EnumC1154900g9w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154900g9w UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154900g9w> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0g9x] */
    static {
        EnumC1154900g9w enumC1154900g9w = new EnumC1154900g9w("UNKNOWN", 0, 0);
        UNKNOWN = enumC1154900g9w;
        EnumC1154900g9w enumC1154900g9w2 = new EnumC1154900g9w("CLA_AUTO_DUBBING", 1, 1);
        CLA_AUTO_DUBBING = enumC1154900g9w2;
        EnumC1154900g9w enumC1154900g9w3 = new EnumC1154900g9w("CLA_ECOM_DUBBING", 2, 2);
        CLA_ECOM_DUBBING = enumC1154900g9w3;
        EnumC1154900g9w[] enumC1154900g9wArr = {enumC1154900g9w, enumC1154900g9w2, enumC1154900g9w3};
        LLILLJJLI = enumC1154900g9wArr;
        LLILLL = new C2254308sP(enumC1154900g9wArr);
        Companion = new Object() { // from class: X.0g9x
        };
    }

    public static EnumC1154900g9w[] values() {
        return (EnumC1154900g9w[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1154900g9w valueOf(String str) {
        return (EnumC1154900g9w) C08FF.LIZ(EnumC1154900g9w.class, str);
    }

    public EnumC1154900g9w(String str, int i, int i2) {
        this.LL = i2;
    }
}
