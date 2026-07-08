package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import com.ss.android.ugc.aweme.service.IPostModeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1142, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1142 implements InterfaceC661560PxC {
    public static final PathInterpolator LLJLILLLLZIIL = new PathInterpolator(0.33f, 0.86f, 0.2f, 1.0f);
    public final EnumC1781440wSU LL;
    public final Context LLILLJJLI;
    public final ViewGroup LLILLL;
    public final FrameLayout LLILZ;
    public final SmartImageView LLILZIL;
    public final SmartImageView LLILZLL;
    public SmartImageView LLIZ;
    public SmartImageView LLIZLLLIL;
    public final BPEAHandler LLJ;
    public final List<InterfaceC661730PxT> LLJI;
    public SmartImageView LLJIJIL;
    public Aweme LLJILJIL;
    public List<PhotoModeImageUrlModel> LLJILJILJ;
    public int LLJILLL;
    public final C1910460zoa LLJJ;
    public boolean LLJJI;
    public final AnonymousClass1143 LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public Map<String, String> LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C01GW LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public ValueAnimator LLJL;
    public final ARunnableS129S0100000_29 LLJLIL;

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
        ((ArrayList) this.LLJI).clear();
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC661560PxC
    public final int LIZJ() {
        int i = this.LLJJIJI;
        LJIL(true);
        return i;
    }

    @Override // X.InterfaceC661560PxC
    public final int LJIILJJIL() {
        return this.LLJILJILJ.size();
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILL() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        C036E.LIZ.LIZ(this.LLJJIII);
    }

    public final void LJIJ() {
        int size = this.LLJILJILJ.size();
        if (size <= 0 || this.LLJJIJI != this.LLJJIJIIJIL) {
            Iterator it2 = ((ArrayList) this.LLJI).iterator();
            while (it2.hasNext()) {
                ((InterfaceC661730PxT) it2.next()).LIZLLL(this.LLJJIJI, size, ((Number) C18127078b.LIZJ.getValue()).longValue() + ((long) ((Number) C18127078b.LIZIZ.getValue()).intValue()));
            }
            return;
        }
        this.LLJJIJIL++;
        long jIntValue = ((Number) C18127078b.LIZIZ.getValue()).intValue();
        BPEAHandler bPEAHandler = this.LLJ;
        ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(this, size, 17);
        if (jIntValue < 0) {
            jIntValue = 0;
        }
        C786410Ut5.LJLIIL(jIntValue, bPEAHandler, aRunnableS40S0101000_29);
    }

    public final void LJIJI() {
        if (this.LLJILJILJ.isEmpty() || this.LLJILJILJ.size() <= 1) {
            return;
        }
        int size = (this.LLJJIJI + 1) % this.LLJILJILJ.size();
        LIZ(this.LLIZLLLIL, (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJILJ, size), size, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[PHI: r1
      0x0077: PHI (r1v6 java.lang.Integer) = (r1v5 java.lang.Integer), (r1v5 java.lang.Integer), (r1v9 java.lang.Integer) binds: [B:10:0x0037, B:12:0x003a, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            r4 = this;
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LLIZ
            r0 = 0
            X.C786410Ut5.Tc(r1, r0)
            X.01GW r1 = X.C18127078b.LJIILJJIL
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L29
            android.widget.FrameLayout r1 = r4.LLILZ
            int r1 = r1.getWidth()
            float r3 = (float) r1
            com.bytedance.lighten.loader.SmartImageView r2 = r4.LLIZLLLIL
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L25
            int r0 = r4.LLJJLIIIJLLLLLLLZ
            float r0 = (float) r0
            float r0 = r0 * r3
        L25:
            X.C786410Ut5.Tc(r2, r0)
            return
        L29:
            android.widget.FrameLayout r0 = r4.LLILZ
            int r0 = r0.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L77
            r0 = 0
            if (r0 != 0) goto L77
            android.view.ViewGroup r0 = r4.LLILLL
            int r0 = r0.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L77
            android.view.ViewGroup r0 = r4.LLILLL
            int r0 = r0.getMeasuredWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L6b
            int r3 = r1.intValue()
        L60:
            com.bytedance.lighten.loader.SmartImageView r2 = r4.LLIZLLLIL
            int r0 = r4.LLJJLIIIJLLLLLLLZ
            float r1 = (float) r0
            float r0 = (float) r3
            float r1 = r1 * r0
            X.C786410Ut5.Tc(r2, r1)
            return
        L6b:
            X.0Pew r1 = X.C650240Pew.LIZ
            android.content.Context r0 = r4.LLILLJJLI
            r1.getClass()
            int r3 = X.C650240Pew.LIZJ(r0)
            goto L60
        L77:
            int r3 = r1.intValue()
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1142.LJIJJ():void");
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
        return this.LLILZ;
    }

    public final void LIZIZ(int i) {
        int i2;
        if (this.LLJILJILJ.isEmpty()) {
            return;
        }
        int iLJ = C13LZ.LJ(i, 0, this.LLJILJILJ.size() - 1);
        this.LLJJIJI = iLJ;
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJL = null;
        if (this.LLIZ == this.LLILZIL) {
            i2 = this.LLJJJJJIL;
        } else {
            i2 = this.LLJJJJLIIL;
        }
        if (i2 == iLJ) {
            LJIJJ();
            return;
        }
        SmartImageView smartImageView = this.LLIZLLLIL;
        LIZ(smartImageView, (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJILJ, iLJ), iLJ, true);
        this.LLIZLLLIL = this.LLIZ;
        this.LLIZ = smartImageView;
        LJIJJ();
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
        this.LLJILLL = i;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJFF(InterfaceC661730PxT interfaceC661730PxT) {
        ((ArrayList) this.LLJI).remove(interfaceC661730PxT);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJI(int i) {
        LIZIZ(i);
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
        if (this.LLJILJILJ.isEmpty()) {
            return;
        }
        this.LLJJJIL = false;
        this.LLJJJ = true;
        this.LLJ.removeCallbacks(this.LLJLIL);
        if (num != null) {
            LIZIZ(num.intValue());
            LJIJI();
        }
        C786410Ut5.LJLIIL(((Number) C18127078b.LIZJ.getValue()).longValue(), this.LLJ, this.LLJLIL);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIL(InterfaceC661730PxT interfaceC661730PxT) {
        if (!((ArrayList) this.LLJI).contains(interfaceC661730PxT)) {
            ((ArrayList) this.LLJI).add(interfaceC661730PxT);
            SmartImageView smartImageView = this.LLJIJIL;
            if (smartImageView != null) {
                interfaceC661730PxT.LIZJ(smartImageView);
            }
        }
    }

    public final void LJIIZILJ(int i) {
        IPostModeService iPostModeService;
        IPhotoModeLogUtil iPhotoModeLogUtilLJJJLZIJ;
        Aweme aweme = this.LLJILJIL;
        if (aweme != null && !this.LLJILJILJ.isEmpty() && (iPostModeService = (IPostModeService) ServiceManager.get().getService(IPostModeService.class)) != null && (iPhotoModeLogUtilLJJJLZIJ = iPostModeService.LJJJLZIJ()) != null) {
            iPhotoModeLogUtilLJJJLZIJ.logMultiPhotoSlide("general_search", "auto", aweme, i, "right", this.LLJILJILJ.size(), this.LLJJJJ);
        }
    }

    public final void LJIJJLI(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        boolean z = !Intrinsics.LJFF(aweme, this.LLJILJIL);
        if (z) {
            this.LLJJIJIL = 0;
            this.LLJJIJI = 0;
            this.LLJJIJIIJIL = 0;
            this.LLJJJJJIL = -1;
            this.LLJJJJLIIL = -1;
            this.LLJIJIL = null;
            LJIL(false);
            this.LLJJ.LJ();
        }
        this.LLJILJIL = aweme;
        C1910460zoa c1910460zoa = this.LLJJ;
        c1910460zoa.LIZIZ = aweme;
        c1910460zoa.LJI.LIZIZ = aweme;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null) {
            imageList = C13BV.INSTANCE;
        }
        this.LLJILJILJ = imageList;
        if (this.LLILZ.getLayoutDirection() == 1) {
            i = -1;
        } else {
            i = 1;
        }
        this.LLJJLIIIJLLLLLLLZ = i;
        if (!this.LLJILJILJ.isEmpty()) {
            this.LLJJIJI = C13LZ.LJ(this.LLJJIJI, 0, this.LLJILJILJ.size() - 1);
            if (z) {
                this.LLIZ = this.LLILZIL;
                this.LLIZLLLIL = this.LLILZLL;
            }
            LJIJJ();
            LIZ(this.LLIZ, (PhotoModeImageUrlModel) ListProtector.get(this.LLJILJILJ, this.LLJJIJI), this.LLJJIJI, true);
            this.LLJJ.LIZLLL(this.LLJJIJI);
            LJIJI();
            if (z && !C1111704Wl.LIZ()) {
                LJIIZILJ(this.LLJJIJI);
                return;
            }
            return;
        }
        this.LLILZIL.setImageDrawable(null);
        this.LLILZLL.setImageDrawable(null);
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = -1;
    }

    public final void LJIL(boolean z) {
        int i = 0;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLJ.removeCallbacks(this.LLJLIL);
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJL = null;
        LJIJJ();
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
        this.LLJJJJ = map;
        C1910460zoa c1910460zoa = this.LLJJ;
        if (map != null) {
            str = map.get("search_id");
        } else {
            str = null;
        }
        c1910460zoa.LIZJ = str;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1143] */
    public AnonymousClass1142(C661460Px2 c661460Px2, EnumC1781440wSU enumC1781440wSU) {
        this.LL = enumC1781440wSU;
        Context context = c661460Px2.getContext();
        this.LLILLJJLI = context;
        this.LLILLL = c661460Px2;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setClipChildren(true);
        this.LLILZ = frameLayout;
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
        smartImageView.setBackgroundColor(-16777216);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.LLILZIL = smartImageView;
        SmartImageView smartImageView2 = new SmartImageView(context);
        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(-1, -1));
        smartImageView2.setBackgroundColor(-16777216);
        smartImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.LLILZLL = smartImageView2;
        this.LLIZ = smartImageView;
        this.LLIZLLLIL = smartImageView2;
        this.LLJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJI = new ArrayList();
        this.LLJILJILJ = C13BV.INSTANCE;
        this.LLJILLL = -1;
        this.LLJJ = new C1910460zoa();
        this.LLJJIII = new C0H62() { // from class: X.1143
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                C0O0L c0o0l3 = C0O0L.AVAILABLE;
                if (c0o0l2 == c0o0l3 && c0o0l != c0o0l3) {
                    AnonymousClass1142 anonymousClass1142 = this.LL;
                    if (!anonymousClass1142.LLJILJILJ.isEmpty()) {
                        int iLJ = C13LZ.LJ(anonymousClass1142.LLJJIJI, 0, anonymousClass1142.LLJILJILJ.size() - 1);
                        SmartImageView smartImageView3 = anonymousClass1142.LLIZ;
                        if (smartImageView3 == anonymousClass1142.LLILZIL) {
                            anonymousClass1142.LLJJJJJIL = -1;
                        } else {
                            anonymousClass1142.LLJJJJLIIL = -1;
                        }
                        anonymousClass1142.LIZ(smartImageView3, (PhotoModeImageUrlModel) ListProtector.get(anonymousClass1142.LLJILJILJ, iLJ), iLJ, false);
                    }
                }
            }
        };
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = -1;
        this.LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 813));
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.LLJLIL = new ARunnableS129S0100000_29(this, 131);
        frameLayout.addView(smartImageView);
        frameLayout.addView(smartImageView2);
        frameLayout.addOnAttachStateChangeListener(new C12YF(this, 2));
        HandlerHook.viewPost(this.LLILZ, new ARunnableS129S0100000_29(this, 130));
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJJI(Aweme aweme, Long l, Integer num) {
        LJIJJLI(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.lighten.loader.SmartImageView r20, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1142.LIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, int, boolean):void");
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJ(Aweme aweme, boolean z, Long l, Integer num) {
        LJIJJLI(aweme);
    }
}
