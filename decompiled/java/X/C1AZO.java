package X;

/* JADX INFO: renamed from: X.1AZO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1AZO {
    AllViewers,
    OnlyFollowers,
    None;

    public static final C1AZP Companion = new Object() { // from class: X.1AZP
    };

    public static C1AZO valueOf(String str) {
        return (C1AZO) C08FF.LIZ(C1AZO.class, str);
    }

    public final EnumC2182911Abx into() {
        int i = C1AZN.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2182911Abx.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ALL_VIEWERS;
        }
        if (i == 2) {
            return EnumC2182911Abx.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ONLY_FOLLOWERS;
        }
        if (i == 3) {
            return EnumC2182911Abx.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_NONE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1AZN.LIZ[ordinal()];
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
