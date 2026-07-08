package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0etl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106430etl extends C1295960jpS {
    public final C1106410etj<Object> LL;
    public final InterfaceC1106460eto LLILLJJLI;
    public InterfaceC469401sC LLILLL;

    @Override // X.C1295960jpS
    public final void playAnimation() {
        List urls;
        String str;
        ImageModel imageModel = (ImageModel) this.LL.LIZLLL;
        if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls)) == null) {
            LJFF(null);
        } else {
            this.LLILLL = C1331660kl2.LJIIIZ(str).LJJIIJZLJL(new AbstractC468201s0() { // from class: X.0etn
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    this.LL.LJFF(bitmap);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    this.LL.LJFF(null);
                }
            });
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final InterfaceC1106460eto getLoadListener() {
        return this.LLILLJJLI;
    }

    public final void LJFF(final Bitmap bitmap) {
        if (bitmap != null) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("loadLottie new bitmap");
            addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0etk
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    this.LL.updateBitmap("preview_image", bitmap);
                    this.LL.removeLottieOnCompositionLoadedListener(this);
                }
            });
        }
        InterfaceC1106460eto interfaceC1106460eto = this.LLILLJJLI;
        if (interfaceC1106460eto != null) {
            interfaceC1106460eto.LIZ();
        }
        ILiveGeckoLoaderService iLiveGeckoLoaderServiceV5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).V5();
        if (iLiveGeckoLoaderServiceV5 != null) {
            String strLIZ = C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_outside_demand_1");
            Intrinsics.LJFF(this.LL.LIZ, "shortTouchEcommerceLuckyBag");
            iLiveGeckoLoaderServiceV5.loadGeckoLottie(this, strLIZ, "ttlive_lucky_bag.zip", false, new InterfaceC1106470etp() { // from class: X.0etm
                @Override // X.InterfaceC1106470etp
                public final void onFinish(boolean z) {
                    InterfaceC1106460eto loadListener = this.LIZ.getLoadListener();
                    if (loadListener != null) {
                        loadListener.LIZIZ(z);
                    }
                    super/*X.0jpS*/.playAnimation();
                }
            });
        }
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C1106430etl(Context context, C1106410etj c1106410etj, C1106380etg c1106380etg) {
        super(context, null, 0);
        this.LL = c1106410etj;
        this.LLILLJJLI = c1106380etg;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(C341940Daq.LIZ(c1106410etj.LIZIZ), C341940Daq.LIZ(c1106410etj.LIZJ));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
