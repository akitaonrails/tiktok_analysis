package X;

/* JADX INFO: renamed from: X.0en9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1102330en9 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final EnumC1102380enE LIZLLL;

    public final String LIZ() {
        String str = this.LIZJ;
        if (str != null) {
            return str;
        }
        int i = this.LIZIZ;
        if (i == 1) {
            return "component";
        }
        if (i == 2) {
            return "early_duration";
        }
        if (i == 3) {
            return "continuous_room";
        }
        if (i != 4) {
            return null;
        }
        return "time_gap";
    }

    public /* synthetic */ C1102330en9(int i, String str, int i2) {
        this(false, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, null);
    }

    public C1102330en9(boolean z, int i, String str, EnumC1102380enE enumC1102380enE) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = enumC1102380enE;
    }
}
