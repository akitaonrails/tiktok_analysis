package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Kzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535770Kzn implements InterfaceC534840KyI {
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
        if (c535020Kya.LIZLLL == 2) {
            final C259800zU c259800zU = new C259800zU();
            return C538760LBa.LIZJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kzw
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<C535020Kya> interfaceC2329309At) {
                    String absolutePath;
                    String strSubstring;
                    C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C786410Ut5.u3());
                    sbLIZ2.append(": resolve video ");
                    sbLIZ2.append(c535020Kya);
                    sbLIZ2.append(" begin");
                    C201955140j.LIZLLL(c552700Lm0, "AiPortraitCRR", C2188811AlT.LIZIZ(sbLIZ2));
                    C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.ALBUM_AI, "ai_portrait_video", true);
                    if (c0vsjLJIIJ != null && (absolutePath = c0vsjLJIIJ.getAbsolutePath()) != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(c535020Kya.LIZ);
                        C535770Kzn c535770Kzn = this;
                        String str2 = str;
                        c535770Kzn.getClass();
                        String strLJJLJ = a0.LJJLJ('/', str2, str2);
                        String strLJJLL = a0.LJJLL('?', strLJJLJ, strLJJLJ);
                        int iLJJJJ = a0.LJJJJ(strLJJLL, '.', 0, 6);
                        if (iLJJJJ != -1) {
                            strSubstring = strLJJLL.substring(iLJJJJ);
                        } else {
                            strSubstring = ".mp4";
                        }
                        sbLIZ3.append(strSubstring);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c259800zU.element = (T) new CountDownLatch(1);
                        InterfaceC1385405bY interfaceC1385405bYLIZLLL = C0CHQ.LIZ().LIZLLL();
                        String str3 = str;
                        final C535020Kya c535020Kya2 = c535020Kya;
                        final C259800zU<CountDownLatch> c259800zU2 = c259800zU;
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        interfaceC1385405bYLIZLLL.downloadFile(str3, absolutePath, strLIZIZ, 1, new C13UW() { // from class: X.0Kzx
                            @Override // X.C13UW
                            public final void LIZLLL(String str4, String str5) {
                                C259800zU<CountDownLatch> c259800zU3 = c259800zU2;
                                CountDownLatch countDownLatch = c259800zU3.element;
                                if (countDownLatch != null) {
                                    countDownLatch.countDown();
                                }
                                c259800zU3.element = null;
                                if (c11kt.isDisposed()) {
                                    return;
                                }
                                c11kt.onSuccess(C535020Kya.LIZ(c535020Kya2, 0, 0, 0, str5, false, 0, 65407));
                            }

                            @Override // X.C13UW
                            public final void LIZ(Exception exc, Integer num, String str4) {
                                C259800zU<CountDownLatch> c259800zU3 = c259800zU2;
                                CountDownLatch countDownLatch = c259800zU3.element;
                                if (countDownLatch != null) {
                                    countDownLatch.countDown();
                                }
                                c259800zU3.element = null;
                                if (c11kt.isDisposed()) {
                                    return;
                                }
                                InterfaceC2329309At<C535020Kya> interfaceC2329309At2 = c11kt;
                                if (exc == null) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("AiPortraitCRR resolve video failed: ");
                                    sbLIZ4.append(str4);
                                    exc = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                interfaceC2329309At2.onError(exc);
                            }
                        });
                        try {
                            CountDownLatch countDownLatch = c259800zU.element;
                            if (countDownLatch != null) {
                                countDownLatch.await();
                                return;
                            }
                            return;
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("video countDownLatch await error ");
                            sbLIZ4.append(e);
                            C201955140j.LJIJJ(c552700Lm02, "AiPortraitCRR", C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                    }
                    if (!interfaceC2329309At.isDisposed()) {
                        interfaceC2329309At.onError(new RuntimeException("AiPortraitCRR resolve video: cache dir is null"));
                    }
                }
            }).LJIIJJI(new C346430Di5(c259800zU, 4)), "AiPortraitCRR", "resolveVideo");
        }
        final C259800zU c259800zU2 = new C259800zU();
        return C538760LBa.LIZJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kzr
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C535020Kya> interfaceC2329309At) {
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C786410Ut5.u3());
                sbLIZ2.append(": resolve image ");
                sbLIZ2.append(c535020Kya);
                sbLIZ2.append(" begin");
                C201955140j.LIZLLL(c552700Lm0, "AiPortraitCRR", C2188811AlT.LIZIZ(sbLIZ2));
                c259800zU2.element = (T) new CountDownLatch(1);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                final C535020Kya c535020Kya2 = c535020Kya;
                final C259800zU<CountDownLatch> c259800zU3 = c259800zU2;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                c1331670kl3LJIIIZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0Kzq
                    @Override // X.InterfaceC605070NoH
                    public final void onCanceled() {
                        C535770Kzn.LIZIZ(c259800zU3);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        c11kt.onError(new RuntimeException("AiPortraitCRR resolve canceled"));
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                        C535770Kzn.LIZIZ(c259800zU3);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        if (file == null) {
                            c11kt.onError(new RuntimeException("AiPortraitCRR resolve null file"));
                        } else {
                            c11kt.onSuccess(C535020Kya.LIZ(c535020Kya2, 0, 0, 0, file.getAbsolutePath(), false, 0, 65407));
                        }
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                        C535770Kzn.LIZIZ(c259800zU3);
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        InterfaceC2329309At<C535020Kya> interfaceC2329309At2 = c11kt;
                        if (th == null) {
                            th = new RuntimeException("AiPortraitCRR resolve failed");
                        }
                        interfaceC2329309At2.onError(th);
                    }
                });
                try {
                    CountDownLatch countDownLatch = c259800zU2.element;
                    if (countDownLatch != null) {
                        countDownLatch.await();
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("countDownLatch await error ");
                    sbLIZ3.append(e);
                    C201955140j.LJIJJ(c552700Lm02, "AiPortraitCRR", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }).LJIIJJI(new C581090Mqh(c259800zU2, 5)), "AiPortraitCRR", "resolveImage");
    }
}
