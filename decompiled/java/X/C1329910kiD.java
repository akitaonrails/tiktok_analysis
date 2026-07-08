package X;

/* JADX INFO: renamed from: X.0kiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329910kiD {
    public static final int LIZ;
    public static final int LIZIZ;
    public static volatile C1329450khT LIZJ;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        LIZ = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        LIZIZ = 384;
    }
}
