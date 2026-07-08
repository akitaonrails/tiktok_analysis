package X;

/* JADX INFO: renamed from: X.1239, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class AnonymousClass1239 implements Runnable {
    public final /* synthetic */ AnonymousClass1234 LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TextStickerMoveHandler$AutoDismissRunable@78cf.run");
        try {
            AnonymousClass1234 anonymousClass1234 = this.LL;
            anonymousClass1234.LJIIIIZZ = false;
            C196925122x c196925122x = anonymousClass1234.LJIILLIIL;
            if (c196925122x != null) {
                c196925122x.invalidate();
            }
            AnonymousClass1234 anonymousClass12342 = this.LL;
            C196923122v c196923122v = anonymousClass12342.LJIJI;
            if (c196923122v != null) {
                c196923122v.LIZ(this.LL.LIZ(), false, true, anonymousClass12342.LJIILLIIL.getData() != null ? anonymousClass12342.LJIILLIIL.getData().getHasReadTextAudio() : false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextStickerMoveHandler$AutoDismissRunable@78cf.run");
    }

    public AnonymousClass1239(AnonymousClass1234 anonymousClass1234) {
        this.LL = anonymousClass1234;
    }
}
