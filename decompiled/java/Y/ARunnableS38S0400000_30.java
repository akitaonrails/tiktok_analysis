package Y;

import X.AbstractC202199149t;
import X.C09BH;
import X.C0VSJ;
import X.C143P;
import X.C143V;
import X.C14JI;
import X.C14JL;
import X.C14JM;
import X.C14JR;
import X.C14JT;
import X.C14JU;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.lynx.pref.TakoLynxExposeHelper;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.verify.LoginVerifyService;
import java.io.File;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS38S0400000_30 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static final void run$3(ARunnableS38S0400000_30 aRunnableS38S0400000_30) {
        LoginVerifyService.m357lambda$semisugar$execute$lambda0$0((AbstractC202199149t) aRunnableS38S0400000_30.l0, (LoginVerifyService) aRunnableS38S0400000_30.l1, (Activity) aRunnableS38S0400000_30.l2, (BdTuringCallback) aRunnableS38S0400000_30.l3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.143T] */
    public final void LIZ$0() throws Throwable {
        try {
            File fileW2 = C786410Ut5.w2(((C143P) this.l0).LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guardian_autograph_");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(".png");
            final C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
            byte[] bArr = (byte[]) this.l2;
            c0vsj.deleteOnExit();
            C09BH.LJIIIIZZ(c0vsj, bArr);
            final C143P c143p = (C143P) this.l0;
            BDImageXUploader bDImageXUploader = (BDImageXUploader) this.l1;
            String absolutePath = c0vsj.getAbsolutePath();
            final C143P c143p2 = (C143P) this.l0;
            final C143V c143v = (C143V) this.l3;
            final ?? r3 = new C143V() { // from class: X.143T
                @Override // X.C143V
                public final void onError(String str) {
                    c0vsj.delete();
                    c143p2.LIZIZ(new AwS179S1100000_30(c143v, str, 4));
                }

                @Override // X.C143V
                public final void onProgress(int i) {
                    c143p2.LIZIZ(new C143U(c143v, i));
                }

                @Override // X.C143V
                public final void onSuccess(String str) {
                    c0vsj.delete();
                    c143p2.LIZIZ(new AwS179S1100000_30(c143v, str, 5));
                }
            };
            c143p.getClass();
            bDImageXUploader.setFilePath(1, new String[]{absolutePath});
            bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.143S
                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i, int i2, String str) {
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i, int i2) {
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                    String str;
                    if (i != 1) {
                        if (i != 6) {
                            if (i == 7) {
                                C143V c143v2 = r3;
                                if (bDImageXInfo == null || (str = bDImageXInfo.mErrorMsg) == null) {
                                    str = "Upload failed";
                                }
                                c143v2.onError(str);
                                return;
                            }
                            return;
                        }
                        if (bDImageXInfo != null) {
                            r3.onSuccess(bDImageXInfo.mImageTosKey);
                            return;
                        } else {
                            r3.onError("Upload info is null");
                            return;
                        }
                    }
                    r3.onProgress((int) j);
                }
            });
            bDImageXUploader.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C143P) this.l0).LIZIZ(new AwS431S0200000_30((C143V) this.l3, e, 44));
        }
    }

    public static final void run$0(ARunnableS38S0400000_30 aRunnableS38S0400000_30) {
        boolean zLIZ;
        C1C7U.LIZ("TakoLynxExposeHelper$ExposeView@b31d.1$2$onViewAttachedToWindow$1");
        try {
            ((TakoLynxExposeHelper.ExposeView) aRunnableS38S0400000_30.l0).LIZ((ViewTreeObserver.OnGlobalLayoutListener) aRunnableS38S0400000_30.l1, (ViewTreeObserver.OnWindowFocusChangeListener) aRunnableS38S0400000_30.l2, (ViewTreeObserver.OnScrollChangedListener) aRunnableS38S0400000_30.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLynxExposeHelper$ExposeView@b31d.1$2$onViewAttachedToWindow$1");
    }

    public static final void run$1(ARunnableS38S0400000_30 aRunnableS38S0400000_30) {
        boolean zLIZ;
        C1C7U.LIZ("WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener@463f.onApplyWindowInsets$onApplyWindowInsets$3");
        try {
            C14JU.LJII((View) aRunnableS38S0400000_30.l0, (C14JT) aRunnableS38S0400000_30.l1, (C14JR) aRunnableS38S0400000_30.l2);
            ((ValueAnimator) aRunnableS38S0400000_30.l3).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener@463f.onApplyWindowInsets$onApplyWindowInsets$3");
    }

    public static final void run$2(ARunnableS38S0400000_30 aRunnableS38S0400000_30) {
        boolean zLIZ;
        C1C7U.LIZ("GuardianAutographUploader@40fc.upload$2");
        try {
            aRunnableS38S0400000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GuardianAutographUploader@40fc.upload$2");
    }

    public static final void run$4(ARunnableS38S0400000_30 aRunnableS38S0400000_30) {
        try {
            C14JI.LJIIIIZZ((View) aRunnableS38S0400000_30.l0, (C14JM) aRunnableS38S0400000_30.l1, (C14JL) aRunnableS38S0400000_30.l2);
            ((ValueAnimator) aRunnableS38S0400000_30.l3).start();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS38S0400000_30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
