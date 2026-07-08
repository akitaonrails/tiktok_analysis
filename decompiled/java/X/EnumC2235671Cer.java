package X;

/* JADX INFO: renamed from: X.1Cer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2235671Cer {
    Unknown,
    Agree,
    Reject;

    public static final C2235691Cet Companion = new Object() { // from class: X.1Cet
    };

    public static EnumC2235671Cer valueOf(String str) {
        return (EnumC2235671Cer) C08FF.LIZ(EnumC2235671Cer.class, str);
    }

    public final EnumC2231981CXk into() {
        int i = C2235681Ces.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_AGREE;
        }
        if (i == 3) {
            return EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_REJECT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2235681Ces.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
