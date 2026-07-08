package X;

/* JADX INFO: renamed from: X.0j97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269710j97 {
    DEFAULT(0),
    LIVESTREAM_CREATED(10),
    UI_FIRST_FRAME(10),
    HOST_PREVIEW_FIRST_FRAME(30),
    START(40),
    CONNECTED(50);

    public static final C1269720j98 Companion = new Object() { // from class: X.0j98
    };
    public int LL;

    public static EnumC1269710j97 valueOf(String str) {
        return (EnumC1269710j97) C08FF.LIZ(EnumC1269710j97.class, str);
    }

    public final int getEventCode() {
        return this.LL;
    }

    public static final EnumC1269710j97 fromInt(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 10) {
                if (i != 30) {
                    if (i != 40) {
                        return DEFAULT;
                    }
                    return START;
                }
                return HOST_PREVIEW_FIRST_FRAME;
            }
            return LIVESTREAM_CREATED;
        }
        return DEFAULT;
    }

    public final void setEventCode(int i) {
        this.LL = i;
    }

    EnumC1269710j97(int i) {
        this.LL = i;
    }
}
