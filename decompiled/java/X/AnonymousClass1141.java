package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import com.ss.android.ugc.aweme.service.IPostModeService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1141, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1141 implements InterfaceC661560PxC {
    public final EnumC1781440wSU LL;
    public final Context LLILLJJLI;
    public final FrameLayout LLILLL;
    public final SmartImageView LLILZ;
    public final SmartImageView LLILZIL;
    public SmartImageView LLILZLL;
    public SmartImageView LLIZ;
    public final BPEAHandler LLIZLLLIL;
    public final List<InterfaceC661730PxT> LLJ;
    public SmartImageView LLJI;
    public Aweme LLJIJIL;
    public List<PhotoModeImageUrlModel> LLJILJIL;
    public int LLJILJILJ;
    public Map<String, String> LLJILLL;
    public final C1910460zoa LLJJ;
    public boolean LLJJI;
    public final AnonymousClass1140 LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final C421770GgJ LLJJJJLIIL;
    public final C01GW LLJJL;
    public final ARunnableS129S0100000_29 LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC661560PxC
    public final void LJIIIZ(boolean z) {
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILIIL(InterfaceC19471211Fu interfaceC19471211Fu) {
    }

    @Override // X.InterfaceC661560PxC
    public final void onCleared() {
        LJIL(false);
        if (this.LLJJI) {
            this.LLJJI = false;
            C036E.LIZ.LIZLLL(this.LLJJIII);
        }
        this.LLJJ.LJ();
        ((ArrayList) this.LLJ).clear();
        this.LLJI = null;
    }

    @Override // X.InterfaceC661560PxC
    public final int LIZJ() {
        int i = this.LLJJIJI;
        LJIL(true);
        return i;
    }

    @Override // X.InterfaceC661560PxC
    public final int LJIILJJIL() {
        return this.LLJILJIL.size();
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILL() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        C036E.LIZ.LIZ(this.LLJJIII);
    }

    public final void LJIJI() {
        if (this.LLJILJIL.isEmpty() || this.LLJILJIL.size() <= 1) {
            return;
        }
        int size = (this.LLJJIJI + 1) % this.LLJILJIL.size();
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJIL, size);
        Aweme aweme = this.LLJIJIL;
        UrlModel urlModelLIZIZ = LIZIZ(photoModeImageUrlModel, aweme != null ? AwemeExtKt.isAdTraffic(aweme) : false, size, "general_search");
        if (urlModelLIZIZ == null) {
            return;
        }
        boolean zLJFF = Intrinsics.LJFF("general_search", "general_search");
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModelLIZIZ.getUrlList()));
        c1331670kl3LJIIJ.LJIL = zLJFF ? C1868030yi9.LIZ(size, this.LLJILJILJ) : Bitmap.Config.RGB_565;
        c1331670kl3LJIIJ.LJJIII();
    }

    @Override // X.InterfaceC661560PxC
    public final int getCurrentPosition() {
        int i = this.LLJJIJI;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC661560PxC
    public final View LJIILLIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC661560PxC
    public final void LIZLLL(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLJJIJIIJIL = i;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJ(int i) {
        this.LLJILJILJ = i;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJFF(InterfaceC661730PxT interfaceC661730PxT) {
        ((ArrayList) this.LLJ).remove(interfaceC661730PxT);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJI(int i) {
        LJIIZILJ(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJII(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLJJIJIIJIL = i;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIIIZZ(Integer num) {
        if (this.LLJILJIL.isEmpty()) {
            return;
        }
        this.LLJJJIL = false;
        this.LLJJJ = true;
        this.LLIZLLLIL.removeCallbacks(this.LLJJLIIIJLLLLLLLZ);
        if (num != null) {
            LJIIZILJ(num.intValue());
            LJIJI();
        }
        LJIJJLI(this.LLILZLL);
        C786410Ut5.LJLIIL(((Number) C078S.LIZJ.getValue()).longValue(), this.LLIZLLLIL, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIL(InterfaceC661730PxT interfaceC661730PxT) {
        if (!((ArrayList) this.LLJ).contains(interfaceC661730PxT)) {
            ((ArrayList) this.LLJ).add(interfaceC661730PxT);
            SmartImageView smartImageView = this.LLJI;
            if (smartImageView != null) {
                interfaceC661730PxT.LIZJ(smartImageView);
            }
        }
    }

    public final void LJIIZILJ(int i) {
        int i2;
        int i3;
        if (this.LLJILJIL.isEmpty()) {
            return;
        }
        int iLJ = C13LZ.LJ(i, 0, this.LLJILJIL.size() - 1);
        this.LLJJIJI = iLJ;
        if (this.LLILZLL == this.LLILZ) {
            i2 = this.LLJJJJ;
        } else {
            i2 = this.LLJJJJJIL;
        }
        if (i2 == iLJ) {
            C786410Ut5.u5(this.LLILZLL, 1.0f);
            C786410Ut5.u5(this.LLIZ, 0.0f);
            return;
        }
        SmartImageView smartImageView = this.LLIZ;
        smartImageView.animate().cancel();
        C786410Ut5.fc(smartImageView, 1.0f);
        C786410Ut5.Bc(smartImageView, 1.0f);
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJIL, iLJ);
        if (smartImageView == this.LLILZ) {
            i3 = this.LLJJJJ;
        } else {
            i3 = this.LLJJJJJIL;
        }
        if (i3 != iLJ) {
            LIZ(smartImageView, photoModeImageUrlModel, iLJ, true);
        }
        smartImageView.bringToFront();
        C786410Ut5.u5(smartImageView, 1.0f);
        this.LLIZ = this.LLILZLL;
        this.LLILZLL = smartImageView;
        C786410Ut5.u5(this.LLIZ, 0.0f);
    }

    public final void LJIJ(int i) {
        IPostModeService iPostModeService;
        IPhotoModeLogUtil iPhotoModeLogUtilLJJJLZIJ;
        Aweme aweme = this.LLJIJIL;
        if (aweme != null && !this.LLJILJIL.isEmpty() && (iPostModeService = (IPostModeService) ServiceManager.get().getService(IPostModeService.class)) != null && (iPhotoModeLogUtilLJJJLZIJ = iPostModeService.LJJJLZIJ()) != null) {
            iPhotoModeLogUtilLJJJLZIJ.logMultiPhotoSlide("general_search", "auto", aweme, i, "right", this.LLJILJIL.size(), this.LLJILLL);
        }
    }

    public final void LJIJJ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        boolean z = !Intrinsics.LJFF(aweme, this.LLJIJIL);
        if (z) {
            this.LLJJIJIL = 0;
            this.LLJJIJI = 0;
            this.LLJJIJIIJIL = 0;
            this.LLJJJJ = -1;
            this.LLJJJJJIL = -1;
            this.LLJI = null;
            LJIL(false);
            this.LLJJ.LJ();
        }
        this.LLJIJIL = aweme;
        C1910460zoa c1910460zoa = this.LLJJ;
        c1910460zoa.LIZIZ = aweme;
        c1910460zoa.LJI.LIZIZ = aweme;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null) {
            imageList = C13BV.INSTANCE;
        }
        this.LLJILJIL = imageList;
        if (!imageList.isEmpty()) {
            this.LLJJIJI = C13LZ.LJ(this.LLJJIJI, 0, this.LLJILJIL.size() - 1);
            if (z) {
                SmartImageView smartImageView = this.LLILZ;
                this.LLILZLL = smartImageView;
                this.LLIZ = this.LLILZIL;
                smartImageView.bringToFront();
            }
            SmartImageView smartImageView2 = this.LLILZLL;
            PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJIL, this.LLJJIJI);
            int i2 = this.LLJJIJI;
            if (smartImageView2 == this.LLILZ) {
                i = this.LLJJJJ;
            } else {
                i = this.LLJJJJJIL;
            }
            if (i != i2) {
                LIZ(smartImageView2, photoModeImageUrlModel, i2, true);
            }
            this.LLJJ.LIZLLL(this.LLJJIJI);
            C786410Ut5.u5(this.LLILZLL, 1.0f);
            C786410Ut5.u5(this.LLIZ, 0.0f);
            LJIJI();
            if (z && !C1111704Wl.LIZ()) {
                LJIJ(this.LLJJIJI);
                return;
            }
            return;
        }
        this.LLILZ.setImageDrawable(null);
        this.LLILZIL.setImageDrawable(null);
        this.LLJJJJ = -1;
        this.LLJJJJJIL = -1;
        C786410Ut5.u5(this.LLILZ, 0.0f);
        C786410Ut5.u5(this.LLILZIL, 0.0f);
    }

    public final void LJIJJLI(SmartImageView smartImageView) {
        if (!((Boolean) C18127078b.LJFF.getValue()).booleanValue()) {
            C786410Ut5.Ob(smartImageView, 1.0f);
            C786410Ut5.pc(smartImageView, 1.0f);
            return;
        }
        Pair pair = (Pair) C078S.LJFF.getValue();
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        long jLongValue = ((Number) C078S.LJ.getValue()).longValue();
        C421770GgJ c421770GgJ = this.LLJJJJLIIL;
        Pair pair2 = new Pair(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
        c421770GgJ.getClass();
        C421770GgJ.LIZ(smartImageView, jLongValue, pair2);
    }

    public final void LJIL(boolean z) {
        int i = 0;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLIZLLLIL.removeCallbacks(this.LLJJLIIIJLLLLLLLZ);
        C421770GgJ c421770GgJ = this.LLJJJJLIIL;
        SmartImageView smartImageView = this.LLILZ;
        c421770GgJ.getClass();
        C421770GgJ.LIZIZ(smartImageView);
        C421770GgJ c421770GgJ2 = this.LLJJJJLIIL;
        SmartImageView smartImageView2 = this.LLILZIL;
        c421770GgJ2.getClass();
        C421770GgJ.LIZIZ(smartImageView2);
        C786410Ut5.u5(this.LLILZLL, 1.0f);
        C786410Ut5.u5(this.LLIZ, 0.0f);
        if (z) {
            int i2 = this.LLJJIJI;
            if (i2 >= 0) {
                i = i2;
            }
            this.LLJJIJI = i;
        }
    }

    @Override // X.InterfaceC661560PxC
    public final void setExtraParams(Map<String, String> map) {
        String str;
        this.LLJILLL = map;
        C1910460zoa c1910460zoa = this.LLJJ;
        if (map != null) {
            str = map.get("search_id");
        } else {
            str = null;
        }
        c1910460zoa.LIZJ = str;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.1140] */
    public AnonymousClass1141(C661460Px2 c661460Px2, EnumC1781440wSU enumC1781440wSU) {
        this.LL = enumC1781440wSU;
        Context context = c661460Px2.getContext();
        this.LLILLJJLI = context;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        this.LLILLL = frameLayout;
        SmartImageView smartImageView = new SmartImageView(frameLayout.getContext());
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
        smartImageView.setBackgroundColor(-16777216);
        C786410Ut5.u5(smartImageView, 0.0f);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.LLILZ = smartImageView;
        SmartImageView smartImageView2 = new SmartImageView(frameLayout.getContext());
        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(-1, -1));
        smartImageView2.setBackgroundColor(-16777216);
        C786410Ut5.u5(smartImageView2, 0.0f);
        smartImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.LLILZIL = smartImageView2;
        this.LLILZLL = smartImageView;
        this.LLIZ = smartImageView2;
        this.LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJ = new ArrayList();
        this.LLJILJIL = C13BV.INSTANCE;
        this.LLJILJILJ = -1;
        this.LLJJ = new C1910460zoa();
        this.LLJJIII = new C0H62() { // from class: X.1140
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                int i;
                C0O0L c0o0l3 = C0O0L.AVAILABLE;
                if (c0o0l2 == c0o0l3 && c0o0l != c0o0l3) {
                    AnonymousClass1141 anonymousClass1141 = this.LL;
                    if (!anonymousClass1141.LLJILJIL.isEmpty()) {
                        int iLJ = C13LZ.LJ(anonymousClass1141.LLJJIJI, 0, anonymousClass1141.LLJILJIL.size() - 1);
                        SmartImageView smartImageView3 = anonymousClass1141.LLILZLL;
                        if (smartImageView3 == anonymousClass1141.LLILZ) {
                            anonymousClass1141.LLJJJJ = -1;
                        } else {
                            anonymousClass1141.LLJJJJJIL = -1;
                        }
                        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(anonymousClass1141.LLJILJIL, iLJ);
                        if (smartImageView3 == anonymousClass1141.LLILZ) {
                            i = anonymousClass1141.LLJJJJ;
                        } else {
                            i = anonymousClass1141.LLJJJJJIL;
                        }
                        if (i != iLJ) {
                            anonymousClass1141.LIZ(smartImageView3, photoModeImageUrlModel, iLJ, false);
                        }
                    }
                }
            }
        };
        frameLayout.addOnAttachStateChangeListener(new C12YF(this, 3));
        this.LLJJJJ = -1;
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = new C421770GgJ();
        this.LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 843));
        this.LLJJLIIIJLLLLLLLZ = new ARunnableS129S0100000_29(this, 143);
        frameLayout.addView(smartImageView);
        frameLayout.addView(smartImageView2);
        HandlerHook.viewPost(this.LLILLL, new ARunnableS129S0100000_29(this, 142));
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJJI(Aweme aweme, Long l, Integer num) {
        LJIJJ(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.lighten.loader.SmartImageView r18, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r19, int r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1141.LIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, int, boolean):void");
    }

    public final UrlModel LIZIZ(PhotoModeImageUrlModel photoModeImageUrlModel, boolean z, int i, String str) {
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageUrlModel imagePostCover;
        List<MultiImageUrlInfo> list;
        MultiImageUrlInfo multiImageUrlInfo;
        UrlModel urlModel;
        List<String> urlList;
        Aweme aweme = this.LLJIJIL;
        if (!z) {
            if (C0SNF.LIZIZ && (list = photoModeImageUrlModel.bitrateImages) != null && (multiImageUrlInfo = (MultiImageUrlInfo) C13LP.LJJJLZIJ(0, list)) != null && (urlModel = multiImageUrlInfo.image) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                return urlModel;
            }
            if (C662290PyN.LJ(aweme) && Intrinsics.LJFF(str, "general_search") && i == 0 && aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imagePostCover = photoModeImageInfo.getImagePostCover()) != null) {
                return imagePostCover.displayImageNoWatermark;
            }
        }
        return photoModeImageUrlModel.displayImageNoWatermark;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJ(Aweme aweme, boolean z, Long l, Integer num) {
        LJIJJ(aweme);
    }
}
