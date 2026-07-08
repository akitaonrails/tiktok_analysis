package X;

/* JADX INFO: renamed from: X.0WZL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WZL implements C0WZU {
    public abstract void LIZIZ(C0WZJ c0wzj);

    @Override // X.C0WZU
    public final C0WSU LIZ(C0WZJ c0wzj) {
        C0WS7 c0ws7LJFF;
        C0WSC c0wsc = c0wzj.LJIIIIZZ;
        if (c0wsc != null) {
            c0ws7LJFF = c0wsc.LJFF(name());
        } else {
            c0ws7LJFF = null;
        }
        if (C0WSD.LIZIZ(c0wzj.LJIIIIZZ, c0ws7LJFF)) {
            return null;
        }
        LIZIZ(c0wzj);
        if (c0ws7LJFF != null) {
            c0ws7LJFF.stop();
        }
        return null;
    }
}
