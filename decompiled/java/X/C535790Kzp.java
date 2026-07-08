package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0Kzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535790Kzp implements InterfaceC534840KyI {
    public static final void LIZIZ(C259800zU<CountDownLatch> c259800zU) {
        CountDownLatch countDownLatch = c259800zU.element;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        c259800zU.element = null;
    }

    @Override // X.InterfaceC534840KyI
    public final AbstractC19484711Kz<C535020Kya> LIZ(final C535020Kya c535020Kya) {
        final String str = c535020Kya.LJIIIIZZ;
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to find remote uri from ");
            sbLIZ.append(c535020Kya);
            return AbstractC19484711Kz.LJIILLIIL(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        final C259800zU c259800zU = new C259800zU();
        return C538760LBa.LIZJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kzt
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C535020Kya> interfaceC2329309At) {
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C786410Ut5.u3());
                sbLIZ2.append(": resolve ");
                sbLIZ2.append(c535020Kya);
                sbLIZ2.append(" begin");
                C201955140j.LIZLLL(c552700Lm0, "AiTheaterCRR", C2188811AlT.LIZIZ(sbLIZ2));
                c259800zU.element = (T) new CountDownLatch(1);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                final C535020Kya c535020Kya2 = c535020Kya;
                final C259800zU<CountDownLatch> c259800zU2 = c259800zU;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                c1331670kl3LJIIIZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0Kzv
                    @Override // X.InterfaceC605070NoH
                    public final void onCanceled() {
                        C535790Kzp.LIZIZ(c259800zU2);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        c11kt.onError(new RuntimeException("AiTheaterCRR resolve canceled"));
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                        C535790Kzp.LIZIZ(c259800zU2);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        if (file == null) {
                            c11kt.onError(new RuntimeException("AiTheaterCRR resolve null file"));
                        } else {
                            c11kt.onSuccess(C535020Kya.LIZ(c535020Kya2, 0, 0, 0, file.getAbsolutePath(), false, 0, 65407));
                        }
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                        C535790Kzp.LIZIZ(c259800zU2);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        InterfaceC2329309At<C535020Kya> interfaceC2329309At2 = c11kt;
                        if (th == null) {
                            th = new RuntimeException("AiTheaterCRR resolve failed");
                        }
                        interfaceC2329309At2.onError(th);
                    }
                });
                try {
                    CountDownLatch countDownLatch = c259800zU.element;
                    if (countDownLatch != null) {
                        countDownLatch.await();
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("countDownLatch await error ");
                    sbLIZ3.append(e);
                    C201955140j.LJIJJ(c552700Lm02, "AiTheaterCRR", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }).LJIIJJI(new C581090Mqh(c259800zU, 7)), "AiTheaterCRR", "resolve");
    }
}
