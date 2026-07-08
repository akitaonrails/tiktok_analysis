package X;

/* JADX INFO: renamed from: X.0YHP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHP {
    public static final /* synthetic */ int LIZ = 0;

    public static final C0YIY LIZ(C871040YFa c871040YFa, int i) {
        C0YHO c0yho;
        if (!c871040YFa.LJ || (c0yho = c871040YFa.LIZLLL) == null) {
            return null;
        }
        String str = c0yho.LIZIZ.get(Integer.valueOf(i));
        if (str == null) {
            return c0yho.LIZ;
        }
        C0YIY c0yiy = c0yho.LIZJ.get(str);
        if (c0yiy == null) {
            return c0yho.LIZ;
        }
        return c0yiy;
    }
}
