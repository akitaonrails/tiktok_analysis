package X;

/* JADX INFO: renamed from: X.19j1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21618119j1 {
    public final AnonymousClass1204 LIZ;
    public final /* synthetic */ C21617919iz LIZIZ;

    public C21618119j1(C21617919iz c21617919iz) {
        this.LIZIZ = c21617919iz;
        AnonymousClass1204 anonymousClass1204 = new AnonymousClass1204(c21617919iz.getContext(), c21617919iz.LLJJJJ);
        float scaleRuler = anonymousClass1204.getScaleRuler();
        long j = c21617919iz.getRulerLevel().LIZIZ;
        anonymousClass1204.LLILZ = scaleRuler;
        anonymousClass1204.LLILZIL = j;
        anonymousClass1204.LIZJ();
        anonymousClass1204.invalidate();
        this.LIZ = anonymousClass1204;
        c21617919iz.addView(anonymousClass1204);
    }
}
