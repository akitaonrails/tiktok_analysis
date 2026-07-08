package X;

/* JADX INFO: renamed from: X.0DuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354150DuX {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final Float LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C354150DuX() {
        this((String) null, 0, (Float) (0 == true ? 1 : 0), 15);
    }

    public /* synthetic */ C354150DuX(String str, int i, Float f, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, false, (i2 & 8) != 0 ? Float.valueOf(-1.0f) : f);
    }

    public C354150DuX(String str, int i, boolean z, Float f) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = f;
    }
}
