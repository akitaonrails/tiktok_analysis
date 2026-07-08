package X;

/* JADX INFO: renamed from: X.1Cgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2236851Cgl {
    Json,
    Protobuf;

    public static final C2236871Cgn Companion = new Object() { // from class: X.1Cgn
    };

    public static EnumC2236851Cgl valueOf(String str) {
        return (EnumC2236851Cgl) C08FF.LIZ(EnumC2236851Cgl.class, str);
    }

    public final EnumC2232091CXv into() {
        int i = C2236861Cgm.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232091CXv.VAR_LINK_MIC_ENCODE_TYPE_JSON;
        }
        if (i == 2) {
            return EnumC2232091CXv.VAR_LINK_MIC_ENCODE_TYPE_PROTOBUF;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2236861Cgm.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
