package X;

/* JADX INFO: renamed from: X.1Cax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2233251Cax {
    Unknown,
    RoomModel,
    Sei;

    public static final C2233271Caz Companion = new Object() { // from class: X.1Caz
    };

    public static EnumC2233251Cax valueOf(String str) {
        return (EnumC2233251Cax) C08FF.LIZ(EnumC2233251Cax.class, str);
    }

    public final EnumC2232001CXm into() {
        int i = C2233261Cay.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232001CXm.VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2232001CXm.VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_ROOM_MODEL;
        }
        if (i == 3) {
            return EnumC2232001CXm.VAR_LINK_MIC_OUTSIDE_UPDATE_SOURCE_SEI;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2233261Cay.LIZ[ordinal()];
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
