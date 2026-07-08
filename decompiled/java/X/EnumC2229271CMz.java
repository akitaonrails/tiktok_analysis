package X;

/* JADX INFO: renamed from: X.1CMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2229271CMz {
    Get,
    Post;

    public static final C1CN1 Companion = new Object() { // from class: X.1CN1
    };

    public static EnumC2229271CMz valueOf(String str) {
        return (EnumC2229271CMz) C08FF.LIZ(EnumC2229271CMz.class, str);
    }

    public final EnumC2229031CMb into() {
        int i = C1CN0.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2229031CMb.VAR_LINK_MIC_REQUEST_METHOD_GET;
        }
        if (i == 2) {
            return EnumC2229031CMb.VAR_LINK_MIC_REQUEST_METHOD_POST;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CN0.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
