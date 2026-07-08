package X;

/* JADX INFO: renamed from: X.0j9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1270070j9h {
    None(0),
    Net(1),
    Siti(2),
    Performance(3);

    public static final C1270080j9i Companion = new Object() { // from class: X.0j9i
    };
    public final int LL;

    public static EnumC1270070j9h valueOf(String str) {
        return (EnumC1270070j9h) C08FF.LIZ(EnumC1270070j9h.class, str);
    }

    public final boolean isValid() {
        return this != None;
    }

    public final int getCode() {
        return this.LL;
    }

    public static final EnumC1270070j9h fromCode(int i) {
        Companion.getClass();
        for (EnumC1270070j9h enumC1270070j9h : values()) {
            if (enumC1270070j9h.getCode() == i) {
                return enumC1270070j9h;
            }
        }
        return None;
    }

    EnumC1270070j9h(int i) {
        this.LL = i;
    }
}
