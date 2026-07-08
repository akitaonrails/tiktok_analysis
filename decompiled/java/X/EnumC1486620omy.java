package X;

/* JADX INFO: renamed from: X.0omy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1486620omy {
    Unknown(0),
    InStartup(1),
    InPlaying(2),
    InStartupAndPlaying(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1486620omy from(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Unknown;
                }
                return InStartupAndPlaying;
            }
            return InPlaying;
        }
        return InStartup;
    }

    public static EnumC1486620omy valueOf(String str) {
        return (EnumC1486620omy) C08FF.LIZ(EnumC1486620omy.class, str);
    }

    EnumC1486620omy(int i) {
        this.LL = i;
    }
}
