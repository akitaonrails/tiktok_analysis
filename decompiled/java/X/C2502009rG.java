package X;

import Y.ACallableS411S0100000_3;
import Y.AfS172S0100000_3;
import Y.AkS468S0100000_3;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.series.voucher.viewmodel.SeriesVoucherClaimViewModel;

/* JADX INFO: renamed from: X.09rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502009rG implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C2502009rG c2502009rG) {
    }

    public static final void onCanceled$3(C2502009rG c2502009rG) {
    }

    public static final void onFailed$0(C2502009rG c2502009rG, Throwable th) {
    }

    public static final void onFailed$3(C2502009rG c2502009rG, Throwable th) {
    }

    public static final void onProgress$0(C2502009rG c2502009rG, float f) {
    }

    public static final void onProgress$1(C2502009rG c2502009rG, float f) {
    }

    public static final void onProgress$2(C2502009rG c2502009rG, float f) {
    }

    public static final void onProgress$3(C2502009rG c2502009rG, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
            case 3:
                onCanceled$3(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
            case 2:
                onProgress$2(this, f);
                break;
            case 3:
                onProgress$3(this, f);
                break;
        }
    }

    public static final void onCanceled$1(C2502009rG c2502009rG) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$2(C2502009rG c2502009rG) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public C2502009rG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C2502009rG c2502009rG, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        MusicHighlightBackgroundViewModel musicHighlightBackgroundViewModel = (MusicHighlightBackgroundViewModel) c2502009rG.l0;
        musicHighlightBackgroundViewModel.getClass();
        musicHighlightBackgroundViewModel.disposeOnClear(C11NZ.LJJJJZ(0).LJJJLZIJ(C11S5.LIZIZ).LJJJJZI(new AkS468S0100000_3(bitmap, 15)).LJJIL(new InterfaceC19483011Ki() { // from class: X.09h1
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C204674156y) obj).LIZLLL >= 0) {
                    return true;
                }
                return false;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.09gt
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int iIntValue;
                Integer numLIZIZ = ((C204674156y) obj).LIZIZ();
                if (numLIZIZ != null) {
                    iIntValue = numLIZIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                return Integer.valueOf(iIntValue);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(musicHighlightBackgroundViewModel, 57), new C09JN() { // from class: X.00Ob
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MusicHighlightBackgroundViewModel@6241.getMainColor$5");
                C1C7U.LIZIZ("MusicHighlightBackgroundViewModel@6241.getMainColor$5");
            }
        }));
    }

    public static final void LIZ$1(C2502009rG c2502009rG, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() < 1 || bitmap.getHeight() < 1) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c2502009rG.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf2.resumeWith(bitmap);
    }

    public static final void LIZ$2(C2502009rG c2502009rG, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void LIZ$3(C2502009rG c2502009rG, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        SeriesVoucherClaimViewModel seriesVoucherClaimViewModel = (SeriesVoucherClaimViewModel) c2502009rG.l0;
        seriesVoucherClaimViewModel.getClass();
        seriesVoucherClaimViewModel.disposeOnClear(C11NZ.LJJJJI(new ACallableS411S0100000_3(bitmap, 28)).LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(seriesVoucherClaimViewModel, 41), new C09JN() { // from class: X.00Oq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SeriesVoucherClaimViewModel@27e2.getMainColorAndSetBackground$3");
                C1C7U.LIZIZ("SeriesVoucherClaimViewModel@27e2.getMainColorAndSetBackground$3");
            }
        }));
    }

    public static final void onFailed$1(C2502009rG c2502009rG, Throwable th) {
        if (th != null) {
            C201955140j.LJIIJ(C20012313Rx.LIZIZ, "preloadBackgroundDetails onFailed", th);
        } else {
            C201955140j.LJII(C20012313Rx.LIZIZ, "preloadBackgroundDetails onFailed throwable is null");
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$2(C2502009rG c2502009rG, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2502009rG.l0;
        if (th == null) {
            th = new RuntimeException();
        }
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C2269208uo c2269208uo = C2269208uo.LIZ;
        int iLIZIZ = C2294208yq.LIZIZ();
        c2269208uo.getClass();
        C2269208uo.LIZ(iLIZIZ, "MixEditingFeatureExtractionTask#getImageBitmap", "load image frame bitmap failed");
    }
}
