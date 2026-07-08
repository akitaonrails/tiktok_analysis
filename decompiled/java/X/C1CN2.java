package X;

/* JADX INFO: renamed from: X.1CN2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CN2 {
    He,
    Lc;

    public static final C1CN4 Companion = new Object() { // from class: X.1CN4
    };

    public static C1CN2 valueOf(String str) {
        return (C1CN2) C08FF.LIZ(C1CN2.class, str);
    }

    public final EnumC2229231CMv into() {
        int i = C1CN3.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2229231CMv.VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_HE;
        }
        if (i == 2) {
            return EnumC2229231CMv.VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_LC;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CN3.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
