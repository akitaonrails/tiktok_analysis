package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS48S0110000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.12UW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12UW extends AbstractC19763912Uj implements View.OnTouchListener {
    public static final /* synthetic */ int LLLLZIL = 0;
    public int LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public final Context LLILZLL;
    public LifecycleOwner LLIZ;
    public VideoEditViewModel LLIZLLLIL;
    public CutMultiVideoViewModel LLJ;
    public C435250H4x LLJI;
    public C435250H4x LLJIJIL;
    public C19518211Xw LLJILJIL;
    public C19518211Xw LLJILJILJ;
    public FrameLayout.LayoutParams LLJILLL;
    public FrameLayout.LayoutParams LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public C19763012Ua LLJJJ;
    public ImageView LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public C19560311ft LLJLILLLLZIIL;
    public C12UV LLJLL;
    public FrameLayout LLJLLIL;
    public C787020Uu4 LLJLLL;
    public C787020Uu4 LLJZ;
    public C423240Gig LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public C12UP LLLFF;
    public C12UP LLLFFI;
    public C19560811fy LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public float LLLIIII;
    public float LLLIIIIL;
    public int LLLIIIL;
    public long LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public boolean LLLILZJ;
    public C19763712Uh LLLILZLLLI;
    public C19763212Uc LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public int LLLJL;
    public int LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public InterfaceC1452170ntP LLLLIILL;
    public MutableLiveData<Bitmap> LLLLIILLL;
    public MutableLiveData<Boolean> LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public int LLLLLL;
    public final int LLLLLLIL;
    public int LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public int LLLLLLLLLL;
    public int LLLLLLLZIL;
    public boolean LLLLLLZ;
    public int LLLLLLZZ;
    public boolean LLLLLZ;
    public long LLLLLZIL;
    public float LLLLLZL;
    public final C12UZ LLLLZ;
    public boolean LLLLZI;

    @Override // X.InterfaceC19767412Vs
    public void LIZ(List<VideoSegment> list) {
    }

    @Override // X.InterfaceC19767412Vs
    public void LIZIZ() {
    }

    @Override // X.InterfaceC19767412Vs
    public void LJIIIZ(boolean z) {
    }

    public void LJJIJIL() {
        this.LLLIILIL = 1;
        this.LLIZLLLIL.JQ2(1);
        C19763212Uc c19763212Uc = this.LLLIZZ;
        if (c19763212Uc != null) {
            c19763212Uc.LIZIZ();
        }
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        C19763712Uh c19763712Uh = this.LLLILZLLLI;
        LJIJJLI(c19763712Uh.LIZJ, c19763712Uh.LIZ, c19763712Uh.LIZIZ, true);
        LJJIJIIJIL(1, null);
    }

    public void LJJIJL() {
        this.LLLIILIL = 1;
        this.LLIZLLLIL.JQ2(1);
        LJJIIJ();
        C19763712Uh c19763712Uh = this.LLLILZLLLI;
        if (c19763712Uh != null) {
            c19763712Uh.LIZ = 0.0f;
            c19763712Uh.LIZIZ = 0.0f;
            c19763712Uh.LIZJ = 0;
        }
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        LJIJJLI(0, this.LLLLLLZZ, (this.LLILLJJLI - r0) - C12UY.LIZJ, true);
        LJJIJIIJIL(2, null);
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getLeftSeekingValue() {
        return 0L;
    }

    @Override // X.AbstractC19763912Uj
    public long getPlayingPosition() {
        return 0L;
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getRightSeekingValue() {
        return 0L;
    }

    @Override // X.AbstractC19763912Uj
    public void setDefaultMode(boolean z) {
    }

    @Override // X.AbstractC19763912Uj
    public void setMultiEditEnableForStickPointMode(boolean z) {
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJ() {
        this.LLLIIIIL = (this.LLJI.getStartX() - this.LLJIJIL.getStartX()) - C12UY.LIZJ;
        this.LLLIIII = ((this.LLLIIIL - r1) + this.LLJIJIL.getStartX()) - this.LLLLLLZZ;
        if (1 != this.LLLIILIL && this.LLLIZZ != null) {
            C0WIY<Long, Long> singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.LLLIZZ.LIZ = singleVideoPlayBoundary.LIZ.longValue();
            this.LLLIZZ.LIZIZ = singleVideoPlayBoundary.LIZIZ.longValue();
            if (this.LLLJIL != 2 && this.LLLIILIL == 0) {
                this.LLIZLLLIL.GQ2(this.LLLIZZ, 0);
            }
        }
        LJIILLIIL();
        if (this.LLLLILI) {
            C0WIY<Long, Long> playBoundary = getPlayBoundary();
            Long l = playBoundary.LIZ;
            Long l2 = playBoundary.LIZIZ;
            if (l != null && l2 != null) {
                String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(Math.max(0L, l.longValue()) / 1000.0f)});
                String strK42 = C786410Ut5.k4(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(l2.longValue() / 1000.0f)});
                C1741940vQm.LIZIZ(this.LLJILJILJ, strK4);
                C1741940vQm.LIZIZ(this.LLJILJIL, strK42);
            }
            LJJI();
        }
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJIIIIZZ() {
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        LJIJJLI(0, this.LLLLLLZZ, (this.LLILLJJLI - r0) - C12UY.LIZJ, true);
        this.LLJLLL.scrollToPosition(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.LLIZLLLIL.zQ2()) {
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        C12UP c12up = this.LLLFF;
        c12up.getClass();
        c12up.LLILZLL = new ArrayList(arrayList);
        c12up.LLLIL();
        c12up.LLLFZ();
    }

    public void LJIIJ() {
        this.LLJ.LLILLL.observe(this.LLIZ, new AObserverS231S0100000_29(this, 259));
        if (this.LLLLLZ) {
            this.LLJ.LLILZIL.observe(this.LLIZ, new AObserverS231S0100000_29(this, 260));
            this.LLJ.LLILZLL.observe(this.LLIZ, new AObserverS231S0100000_29(this, 261));
            this.LLJ.LLIZ.observe(this.LLIZ, new AObserverS231S0100000_29(this, 262));
            this.LLJ.LLIZLLLIL.observe(this.LLIZ, new AObserverS231S0100000_29(this, 263));
            this.LLJ.LLJ.observe(this.LLIZ, new AObserverS231S0100000_29(this, 264));
            this.LLJ.LLJI.observe(this.LLIZ, new AObserverS231S0100000_29(this, 265));
        }
    }

    public final void LJIIL() {
        View view = this.LLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        C423240Gig c423240Gig = this.LLJZIJLIL;
        if (c423240Gig != null) {
            int visibility = c423240Gig.getVisibility();
            c423240Gig.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c423240Gig);
        }
    }

    public final void LJIILJJIL() {
        C435250H4x c435250H4x = new C435250H4x(this.LLILZLL);
        this.LLJIJIL = c435250H4x;
        c435250H4x.setScaleType(ImageView.ScaleType.FIT_XY);
        int i = C12UY.LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, this.LLLLLLJ);
        this.LLJILLL = layoutParams;
        layoutParams.topMargin = this.LLLLLLLLLL;
        int i2 = this.LLLLLLZZ;
        layoutParams.leftMargin = i2;
        layoutParams.setMarginStart(i2);
        C435250H4x c435250H4x2 = this.LLJIJIL;
        FrameLayout.LayoutParams layoutParams2 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435250H4x2);
        c435250H4x2.setLayoutParams(layoutParams2);
        if (C1336470ksn.LIZJ(this.LLILZLL)) {
            this.LLJIJIL.setLeft(this.LLILLJJLI - this.LLLLLLZZ);
            this.LLJIJIL.setLayoutDirection(1);
        } else {
            this.LLJIJIL.setLeft(this.LLJILLL.leftMargin);
        }
        if (this.LLJJJJ) {
            this.LLJIJIL.setOnTouchListener(this);
        } else {
            this.LLJIJIL.setOnTouchListener(null);
        }
        this.LLJIJIL.setTag("startSlide");
        this.LLJILJILJ = LJIIJJI(this.LLILZLL);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams4 = this.LLJILLL;
        layoutParams3.topMargin = (int) (layoutParams4.topMargin + layoutParams4.height + C11VU.LIZIZ(4.0f, this.LLILZLL));
        int i3 = this.LLLLLLZZ;
        layoutParams3.leftMargin = i3;
        layoutParams3.setMarginStart(i3);
        C786410Ut5.g6(this.LLJILJILJ, layoutParams3);
        this.LLJILJILJ.setTag("startSlideTime");
        this.LLJLLIL.addView(this.LLJILJILJ);
        this.LLJILJILJ.addTextChangedListener(new C19763312Ud(this));
        C435250H4x c435250H4x3 = new C435250H4x(this.LLILZLL);
        this.LLJI = c435250H4x3;
        c435250H4x3.setScaleType(ImageView.ScaleType.FIT_XY);
        int i4 = C12UY.LJFF;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i + i4, this.LLLLLLJ);
        this.LLJJ = layoutParams5;
        layoutParams5.topMargin = this.LLLLLLLLLL;
        int i5 = (this.LLILLJJLI - this.LLLLLLZZ) - i;
        layoutParams5.leftMargin = i5;
        layoutParams5.setMarginStart(i5);
        C435250H4x c435250H4x4 = this.LLJI;
        FrameLayout.LayoutParams layoutParams6 = this.LLJJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435250H4x4);
        c435250H4x4.setLayoutParams(layoutParams6);
        if (C1336470ksn.LIZJ(this.LLILZLL)) {
            this.LLJI.setLeft(this.LLLLLLZZ);
            this.LLJI.setLayoutDirection(1);
        } else {
            this.LLJI.setLeft(this.LLJJ.leftMargin);
        }
        if (this.LLJJJJ) {
            this.LLJI.setOnTouchListener(this);
        } else {
            this.LLJI.setOnTouchListener(null);
        }
        this.LLJI.setPadding(0, 0, i4, 0);
        this.LLJI.setPaddingRelative(0, 0, i4, 0);
        this.LLJI.setTag("endSlide");
        this.LLJILJIL = LJIIJJI(this.LLILZLL);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams8 = this.LLJJ;
        layoutParams7.topMargin = (int) (layoutParams8.topMargin + layoutParams8.height + C11VU.LIZIZ(4.0f, this.LLILZLL));
        int i6 = this.LLILLJJLI;
        int i7 = this.LLLLLLZZ;
        layoutParams7.leftMargin = (i6 - i7) - i;
        layoutParams7.setMarginStart(i7);
        C786410Ut5.g6(this.LLJILJIL, layoutParams7);
        this.LLJILJIL.setTag("endSlideTime");
        this.LLJLLIL.addView(this.LLJILJIL);
        this.LLJILJIL.addTextChangedListener(new C19763412Ue(this));
        LJJIIJZLJL();
        this.LLJJI = new View(this.LLILZLL);
        this.LLJJIII = new View(this.LLILZLL);
        setBorderColor(C12VA.LIZ().LJIIJ.invoke().booleanValue() ? R.color.zb : R.color.zy);
        this.LLJLLIL.addView(this.LLJJI);
        this.LLJLLIL.addView(this.LLJJIII);
        int i8 = this.LLLLLLZZ;
        LJJIFFI(i8, (this.LLILLJJLI - i8) - i);
        FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) this.LLJJJ.getLayoutParams();
        int i9 = this.LLLLLLZZ + i;
        layoutParams9.leftMargin = i9;
        layoutParams9.height = this.LLLLL;
        layoutParams9.topMargin = this.LLLLLILLIL;
        layoutParams9.setMarginStart(i9);
        C19763012Ua c19763012Ua = this.LLJJJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19763012Ua);
        c19763012Ua.setLayoutParams(layoutParams9);
        this.LLJJJ.setTag("curPoint");
        this.LLJJJ.setOnTouchListener(this);
        C19763012Ua c19763012Ua2 = this.LLJJJ;
        if (c19763012Ua2 != null) {
            C786410Ut5.LJJJZ(c19763012Ua2, this.LLJLLIL);
            this.LLJLLIL.addView(this.LLJJJ);
        }
        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) this.LLJJJIL.getLayoutParams();
        layoutParams10.width = this.LLLLJI;
        C786410Ut5.c6(this.LLJJJIL, layoutParams10);
        int i10 = this.LLLLILI ? 0 : 8;
        C19518211Xw c19518211Xw = this.LLJILJILJ;
        if (c19518211Xw != null) {
            C786410Ut5.LLIL(c19518211Xw, i10);
        }
        C19518211Xw c19518211Xw2 = this.LLJILJIL;
        if (c19518211Xw2 != null) {
            C786410Ut5.LLIL(c19518211Xw2, i10);
        }
        this.LLJJIJI = new View(this.LLILZLL);
        this.LLJJIJIIJIL = new View(this.LLILZLL);
        this.LLJJIJI.setBackgroundColor(this.LLLL);
        this.LLJJIJIIJIL.setBackgroundColor(this.LLLL);
        int iMax = Math.max(this.LLLIIIL - i, 0);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(((float) iMax) == 0.0f ? iMax : iMax + 20, this.LLLLLJLJLL);
        layoutParams11.topMargin = (int) C11VU.LIZIZ(7.0f, this.LLILZLL);
        layoutParams11.gravity = 8388611;
        int i11 = this.LLLLLLZZ - iMax;
        layoutParams11.leftMargin = i11;
        layoutParams11.setMarginStart(i11);
        C786410Ut5.W5(this.LLJJIJI, layoutParams11);
        int iMax2 = Math.max((int) ((((r0.LJFF / this.LLJLL.LJ) - this.LLLIIIL) - this.LLLIIIIL) - i), 0);
        int i12 = this.LLLLLLZZ;
        int iMin = Math.min(iMax2, i12);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(iMin == 0 ? 0 : iMin + 20, this.LLLLLJLJLL);
        layoutParams12.topMargin = (int) C11VU.LIZIZ(7.0f, this.LLILZLL);
        int i13 = i12 - iMin;
        layoutParams12.rightMargin = i13;
        layoutParams12.setMarginEnd(i13);
        layoutParams12.gravity = 8388613;
        C786410Ut5.W5(this.LLJJIJIIJIL, layoutParams12);
        View view = new View(this.LLILZLL);
        this.LLJJIJIL = view;
        view.setTag("block");
        this.LLJJIJIL.setOnTouchListener(this);
        this.LLJJIJIL.setBackgroundColor(this.LLLJL);
        C786410Ut5.LJLLLLLL(4, this.LLJJIJIL);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) this.LLLIIIIL, this.LLLLLJLJLL);
        layoutParams13.topMargin = (int) C11VU.LIZIZ(7.0f, this.LLILZLL);
        int i14 = this.LLLLLLZZ + i;
        layoutParams13.leftMargin = i14;
        layoutParams13.setMarginStart(i14);
        C786410Ut5.W5(this.LLJJIJIL, layoutParams13);
        this.LLJLLIL.addView(this.LLJJIJIL);
        this.LLJJJ.bringToFront();
        this.LLJLLIL.addView(this.LLJJIJI);
        this.LLJLLIL.addView(this.LLJJIJIIJIL);
        this.LLJLLIL.addView(this.LLJIJIL);
        this.LLJLLIL.addView(this.LLJI);
        LJIJI();
    }

    public void LJIJI() {
        if (this.LLJJIJIIJIL == null) {
            return;
        }
        float startX = this.LLJI.getStartX();
        float f = (r0.LJFF / this.LLJLL.LJ) - this.LLLIIII;
        int i = C12UY.LIZJ;
        int i2 = (int) ((this.LLILLJJLI - startX) - i);
        int iMax = Math.max(Math.min((int) ((f - (i * 2)) - this.LLLIIIIL), i2), 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMax == 0 ? 0 : iMax + 20, this.LLLLLJLJLL);
        int i3 = i2 - iMax;
        layoutParams.rightMargin = i3;
        layoutParams.setMarginEnd(i3);
        layoutParams.topMargin = this.LLLLLLLLL;
        layoutParams.gravity = 8388613;
        C786410Ut5.W5(this.LLJJIJIIJIL, layoutParams);
    }

    public final void LJIJJ() {
        if (this.LLJJIJIL == null) {
            return;
        }
        int startX = (int) (this.LLJIJIL.getStartX() + C12UY.LIZJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Double.valueOf(Math.ceil(this.LLLIIIIL)).intValue(), this.LLLLLJLJLL);
        layoutParams.topMargin = this.LLLLLLLLL;
        layoutParams.leftMargin = startX;
        layoutParams.setMarginStart(startX);
        C786410Ut5.W5(this.LLJJIJIL, layoutParams);
    }

    public void LJIL() {
        if (this.LLJJIJI == null) {
            return;
        }
        float startX = this.LLJIJIL.getStartX();
        int iMax = Math.max((this.LLLLLLZZ + C12UY.LIZJ) - this.LLLIIIL, 0);
        int iMax2 = Math.max((int) (startX - iMax), 0);
        if (iMax2 != 0.0f) {
            iMax2 += 20;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMax2, this.LLLLLJLJLL);
        layoutParams.topMargin = this.LLLLLLLLL;
        layoutParams.leftMargin = iMax;
        layoutParams.setMarginStart(iMax);
        layoutParams.gravity = 8388611;
        C786410Ut5.W5(this.LLJJIJI, layoutParams);
    }

    public final void LJJI() {
        if (this.LLLLILI) {
            C19518211Xw c19518211Xw = this.LLJILJILJ;
            float x = (this.LLJIJIL.getX() + ((r0.getMeasuredWidth() - r0.getPaddingRight()) / 2.0f)) - (c19518211Xw.getMeasuredWidth() / 2.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw);
            c19518211Xw.setX(x);
            C19518211Xw c19518211Xw2 = this.LLJILJIL;
            float x2 = (this.LLJI.getX() + ((r0.getMeasuredWidth() - r0.getPaddingRight()) / 2.0f)) - (c19518211Xw2.getMeasuredWidth() / 2.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw2);
            c19518211Xw2.setX(x2);
            float f = Math.abs(this.LLJILJILJ.getX() - this.LLJILJIL.getX()) - (((float) (this.LLJILJILJ.getWidth() + this.LLJILJIL.getWidth())) / 2.0f) > 0.0f ? 1.0f : 0.0f;
            if (this.LLJILJILJ.getAlpha() != f) {
                this.LLJILJILJ.animate().alpha(f).setDuration(150L).start();
                this.LLJILJIL.animate().alpha(f).setDuration(150L).start();
            }
        }
    }

    public void LJJIIJ() {
        this.LLIZLLLIL.GQ2(this.LLLIZZ, this.LLLIL);
        this.LLIZLLLIL.HQ2(this.LLLIL, getOverXScroll());
        C12UV c12uv = this.LLJLL;
        c12uv.LIZ.put(((VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), this.LLLIL)).LJFF(true), Float.valueOf(this.LLLIZZ.LIZLLL));
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), this.LLLIL);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJ;
        cutMultiVideoViewModel.LLILLJJLI.put(videoSegment.LJFF(true), 1);
    }

    public void LJJIIJZLJL() {
        if (this.LLJIJIL == null || this.LLJI == null) {
            return;
        }
        if (C12VA.LIZ().LJIIJ.invoke().booleanValue()) {
            this.LLJIJIL.setImageResource(R.drawable.fip);
            this.LLJI.setImageResource(R.drawable.fin);
        } else {
            this.LLJIJIL.setImageResource(R.drawable.fio);
            this.LLJI.setImageResource(R.drawable.fim);
        }
    }

    public final void LJJIZ() {
        VideoEditViewModel videoEditViewModel;
        if (this.LLJLL == null || (videoEditViewModel = this.LLIZLLLIL) == null || C580130Mp9.LIZ(videoEditViewModel.zQ2())) {
            return;
        }
        if (this.LLLIILIL == 1) {
            this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
            return;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), 0);
        this.LLJLL.LIZJ(this.LLLIILIL, videoSegment.duration, videoSegment.LJI(), videoSegment.LJFF(true));
    }

    public final void LJJJI() {
        if (this.LLJL) {
            return;
        }
        this.LLJL = true;
        C12UY.LJ(this.LLILZLL);
    }

    public float getAudioStartTranslationX() {
        C435250H4x c435250H4x = this.LLJIJIL;
        if (c435250H4x != null) {
            return c435250H4x.getTranslationX();
        }
        return 0.0f;
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        return this.LLLIILIL == 0 ? this.LLJZ : this.LLJLLL;
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public int getCurrentRotate() {
        int i = this.LLLIILIL;
        if (i == 2 || i == 0) {
            return this.LLLIZZ.LIZJ;
        }
        return 0;
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public float getCurrentSpeed() {
        int i = this.LLLIILIL;
        return (i == 2 || i == 0) ? this.LLLIZZ.LIZLLL : this.LLIZLLLIL.CQ2();
    }

    public float getEndSlideX() {
        return this.LLJI.getStartX();
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getMaxCutDuration() {
        return this.LLJLL.LJFF;
    }

    @Override // X.AbstractC19763912Uj
    public long getMultiPlayingPosition() {
        C12UV c12uv = this.LLJLL;
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        float startX = ((this.LLLIIII + this.LLJJJ.getStartX()) - this.LLJIJIL.getStartX()) * this.LLJLL.LJ;
        float fCQ2 = this.LLIZLLLIL.CQ2();
        c12uv.getClass();
        return C12UV.LIZ(listZQ2, startX, fCQ2);
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getMultiSeekTime() {
        C12UV c12uv = this.LLJLL;
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        float f = (this.LLLIIII + C12UY.LIZJ) * this.LLJLL.LJ;
        float fCQ2 = this.LLIZLLLIL.CQ2();
        c12uv.getClass();
        return C12UV.LIZ(listZQ2, f, fCQ2);
    }

    public C0WIY<Long, Long> getMultiVideoPlayBoundary() {
        C12UV c12uv = this.LLJLL;
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        float f = this.LLLIIII;
        float f2 = C12UY.LIZJ;
        float f3 = (f + f2) * this.LLJLL.LJ;
        float fCQ2 = this.LLIZLLLIL.CQ2();
        c12uv.getClass();
        long jLIZ = C12UV.LIZ(listZQ2, f3, fCQ2);
        C12UV c12uv2 = this.LLJLL;
        List<VideoSegment> listZQ22 = this.LLIZLLLIL.zQ2();
        float f4 = (this.LLLIIII + f2 + this.LLLIIIIL) * this.LLJLL.LJ;
        float fCQ22 = this.LLIZLLLIL.CQ2();
        c12uv2.getClass();
        return new C0WIY<>(Long.valueOf(jLIZ), Long.valueOf(C12UV.LIZ(listZQ22, f4, fCQ22)));
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public C0WIY<Long, Long> getPlayBoundary() {
        return this.LLLIILIL == 1 ? getMultiVideoPlayBoundary() : getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        return this.LLLIILIL == 1 ? getMultiSeekTime() : getSingleSeekTime();
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public float getSelectedTime() {
        C12UV c12uv = this.LLJLL;
        if (c12uv == null) {
            return 0.0f;
        }
        return (this.LLLIIIIL * c12uv.LJ) / 1000.0f;
    }

    public float getSelectedTimeInMillis() {
        return this.LLLIIIIL * this.LLJLL.LJ;
    }

    @Override // X.AbstractC19763912Uj
    public long getSinglePlayingPosition() {
        return (long) (((this.LLLIIII + this.LLJJJ.getStartX()) - this.LLJIJIL.getStartX()) * this.LLJLL.LJ);
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getSingleSeekTime() {
        return (long) ((this.LLLIIII + C12UY.LIZJ) * this.LLJLL.LJ);
    }

    public C0WIY<Long, Long> getSingleVideoPlayBoundary() {
        float f = this.LLLIIII;
        int i = C12UY.LIZJ;
        float f2 = this.LLJLL.LJ;
        return new C0WIY<>(Long.valueOf((long) ((i + f) * f2)), Long.valueOf((long) ((f + i + this.LLLIIIIL) * f2)));
    }

    @Override // X.AbstractC19763912Uj
    public C0WIY<Float, Float> getSlideX() {
        return new C0WIY<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    public float getStartSlideX() {
        return this.LLJIJIL.getStartX();
    }

    public final void LJIILLIIL() {
        String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.LLLIIIIL * this.LLJLL.LJ) / 1000.0f)});
        String strK42 = (this.LLJJJ == null || this.LLJIJIL == null || this.LLJ.LLILLL.getValue() == null) ? "" : C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.LLJ.LLILLL.getValue().longValue() / 1000.0f)});
        String string = this.LLJ.LL.getValue() != null ? this.LLJ.LL.getValue().toString() : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getResources().getString(2131837618, strK4));
        sbLIZ.append(";curPointer:");
        sbLIZ.append(strK42);
        sbLIZ.append("s;Totalspeed:");
        sbLIZ.append(this.LLIZLLLIL.CQ2());
        sbLIZ.append(";mOneWidthDur:");
        sbLIZ.append(this.LLJLL.LJ);
        sbLIZ.append("\npair:");
        sbLIZ.append(string);
        sbLIZ.append(";curOriginIndex:");
        sbLIZ.append(this.LLLIL);
        sbLIZ.append(";curEditIndex:");
        sbLIZ.append(this.LLLILZ);
        sbLIZ.append("\n");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LJJIIZI() {
        if (System.currentTimeMillis() - this.LLLLLZIL < 2000) {
            return;
        }
        if (this.LLLIILIL == 2) {
            String string = getResources().getString(2131857946, Float.valueOf(0.5f));
            Context context = this.LLILZLL;
            C21366318jV.LIZLLL.getClass();
            new C21366318jV(context, string, 0, 2).LIZ();
            this.LLLLLZIL = System.currentTimeMillis();
            return;
        }
        String string2 = getResources().getString(2131857946, Float.valueOf(getMinVideoLength() / 1000.0f));
        Context context2 = this.LLILZLL;
        C21366318jV.LIZLLL.getClass();
        new C21366318jV(context2, string2, 0, 2).LIZ();
        this.LLLLLZIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC19767412Vs
    public boolean LJFF() {
        return this.LLJLIL;
    }

    @Override // X.AbstractC19763912Uj
    public int getEditState() {
        return this.LLLIILIL;
    }

    @Override // X.AbstractC19763912Uj
    public View getEndSlide() {
        return this.LLJI;
    }

    public int getFrameHeight() {
        return this.LLLLLJLJLL;
    }

    public int getFrameWidth() {
        return this.LLLLLJIL;
    }

    public int getLeftRightMargin() {
        return this.LLLLLLL;
    }

    public long getMaxVideoLength() {
        return this.LLILZ;
    }

    public long getMinVideoLength() {
        return this.LLILLL;
    }

    public int getOverXScroll() {
        return this.LLLIIIL;
    }

    @Override // X.AbstractC19763912Uj
    public View getStartSlide() {
        return this.LLJIJIL;
    }

    public InterfaceC1452170ntP getVeEditor() {
        return this.LLLLIILL;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.LLIZLLLIL;
    }

    public C19560311ft getViewConfig() {
        return this.LLJLILLLLZIIL;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    private void setVideoSegmentData(List<VideoSegment> list) {
        this.LLIZLLLIL.IQ2(list);
    }

    public final C19518211Xw LJIIJJI(Context context) {
        C19518211Xw c19518211Xw = new C19518211Xw(context, null);
        c19518211Xw.setTextColor(context.getResources().getColor(R.color.xu));
        c19518211Xw.setTextSize(12.0f);
        c19518211Xw.setClickable(true);
        c19518211Xw.setTypeface(C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME()), 0);
        c19518211Xw.setOnTouchListener(this);
        return c19518211Xw;
    }

    public boolean LJIILL(String str) {
        if (!str.equals("curPoint") && ((int) ((this.LLJI.getStartX() - this.LLJIJIL.getStartX()) - C12UY.LIZJ)) < ((int) this.LLJLL.LJI) - 2) {
            LJJIIZI();
            C12UY.LJ(this.LLILZLL);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = r6.LLILLJJLI - r6.LLLLLLZZ;
        r3 = X.C12UY.LIZJ;
        r2 = r1 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r7 <= r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r6.LLJIJIL.getStartX() != r6.LLLLLLZZ) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        LJJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (((r7 - r6.LLJIJIL.getStartX()) - r1) >= r6.LLJLL.LJI) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        LJJIIZI();
        LJJJI();
        r7 = (r6.LLJIJIL.getStartX() + r6.LLJLL.LJI) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r6.LLJI.setStartX(r7);
        setCurPointerContainerStartX(r6.LLJI.getStartX() - r6.LLJJJIL.getWidth());
        LJJIFFI((int) r6.LLJIJIL.getStartX(), (int) r6.LLJI.getStartX());
        LJ();
        r6.LLIZLLLIL.LLILZLL.setValue(null);
        LJIJI();
        LJIJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(float r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12UW.LJIJ(float):void");
    }

    public final void LJJII(int i) {
        if (!this.LLLLIIIILLL) {
            return;
        }
        long j = i;
        setMaxVideoLength(j);
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        C12UV c12uv = this.LLJLL;
        boolean z = this.LLILZIL;
        c12uv.LJII = j;
        c12uv.LJIIJ = z;
        if (this.LLLIILIL == 1) {
            c12uv.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
            return;
        }
        if (C2401009ay.LIZ(listZQ2)) {
            return;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(listZQ2, 0);
        videoSegment.duration = j;
        videoSegment.LJIIJ(j);
        this.LLJLL.LIZJ(this.LLLIILIL, videoSegment.duration, videoSegment.LJI(), videoSegment.LJFF(true));
    }

    public final void LJJIII(int i) {
        if (!this.LLLLIIIILLL) {
            return;
        }
        long j = i;
        setMaxVideoLength(j);
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        C12UV c12uv = this.LLJLL;
        boolean z = this.LLILZIL;
        c12uv.LJII = j;
        c12uv.LJIIJ = z;
        if (this.LLLIILIL == 1) {
            c12uv.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
            return;
        }
        if (C2401009ay.LIZ(listZQ2)) {
            return;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(listZQ2, 0);
        this.LLJLL.LIZJ(this.LLLIILIL, videoSegment.duration, videoSegment.LJI(), videoSegment.LJFF(true));
    }

    public final void LJJIJ(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C435250H4x c435250H4x = this.LLJIJIL;
        int i9 = 0;
        if (c435250H4x != null) {
            if (z) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            int visibility = c435250H4x.getVisibility();
            c435250H4x.setVisibility(i8);
            C1602160rnK.LIZIZ(visibility, i8, c435250H4x);
        }
        C19518211Xw c19518211Xw = this.LLJILJILJ;
        if (c19518211Xw != null && this.LLLLILI) {
            if (z) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            C786410Ut5.LLIL(c19518211Xw, i7);
        }
        C435250H4x c435250H4x2 = this.LLJI;
        if (c435250H4x2 != null) {
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            int visibility2 = c435250H4x2.getVisibility();
            c435250H4x2.setVisibility(i6);
            C1602160rnK.LIZIZ(visibility2, i6, c435250H4x2);
        }
        C19518211Xw c19518211Xw2 = this.LLJILJIL;
        if (c19518211Xw2 != null && this.LLLLILI) {
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            C786410Ut5.LLIL(c19518211Xw2, i5);
        }
        View view = this.LLJJI;
        if (view != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            C786410Ut5.LJLLLLLL(i4, view);
        }
        View view2 = this.LLJJIII;
        if (view2 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            C786410Ut5.LJLLLLLL(i3, view2);
        }
        View view3 = this.LLJJIJI;
        if (view3 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            C786410Ut5.LJLLLLLL(i2, view3);
        }
        View view4 = this.LLJJIJIIJIL;
        if (view4 != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view4);
        }
        View view5 = this.LLJJIJIL;
        if (view5 != null) {
            if (!z) {
                i9 = 4;
            }
            C786410Ut5.LJLLLLLL(i9, view5);
        }
    }

    public void LJJIJLIJ(VideoSegment videoSegment) {
        this.LLLIILIL = 1;
        this.LLIZLLLIL.JQ2(1);
        C19763212Uc c19763212Uc = this.LLLIZZ;
        if (c19763212Uc != null) {
            c19763212Uc.LIZIZ();
        }
        C19763712Uh c19763712Uh = this.LLLILZLLLI;
        if (c19763712Uh != null) {
            c19763712Uh.LIZ = 0.0f;
            c19763712Uh.LIZIZ = 0.0f;
            c19763712Uh.LIZJ = 0;
        }
        this.LLIZLLLIL.xQ2(videoSegment.LJFF(true));
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        LJIJJLI(0, this.LLLLLLZZ, (this.LLILLJJLI - r0) - C12UY.LIZJ, true);
        LJJIJIIJIL(3, videoSegment);
    }

    public void LJJIL(C0WIY<Integer, Integer> c0wiy) {
        this.LLLIILIL = 2;
        this.LLIZLLLIL.JQ2(2);
        this.LLLILZ = c0wiy.LIZ.intValue();
        this.LLLIL = c0wiy.LIZIZ.intValue();
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), this.LLLIL);
        C19763212Uc c19763212Uc = this.LLLIZZ;
        if (c19763212Uc == null) {
            this.LLLIZZ = new C19763212Uc(videoSegment);
        } else {
            c19763212Uc.LIZ(videoSegment);
        }
        this.LLJLL.LIZJ(this.LLLIILIL, videoSegment.duration, this.LLIZLLLIL.BQ2(this.LLLIL).LJI(), videoSegment.LJFF(true));
        C786410Ut5.C0(this.LLJLLL, 8);
        this.LLLFF.LLLIIIIL();
        C786410Ut5.C0(this.LLJZ, 0);
        this.LLJZ.scrollToPosition(0);
        this.LLLFFI.LLLII(this.LLJLL.LIZIZ, videoSegment);
        this.LLJZ.smoothScrollBy(this.LLIZLLLIL.AQ2(this.LLLIL), 0);
        C19763712Uh c19763712Uh = this.LLLILZLLLI;
        float startSlideX = getStartSlideX();
        float endSlideX = getEndSlideX();
        int overXScroll = getOverXScroll();
        c19763712Uh.LIZ = startSlideX;
        c19763712Uh.LIZIZ = endSlideX;
        c19763712Uh.LIZJ = overXScroll;
        C12UV c12uv = this.LLJLL;
        VideoSegment videoSegmentBQ2 = this.LLIZLLLIL.BQ2(this.LLLIL);
        float fLJII = (((videoSegmentBQ2.LJII() * 1.0f) / (videoSegmentBQ2.LJI() * c12uv.LJ)) + this.LLLLLLZZ) - this.LLIZLLLIL.AQ2(this.LLLIL);
        LJIJJLI(0, fLJII, C12UY.LIZ(this.LLILZLL, this.LLJLL, fLJII, this.LLIZLLLIL.BQ2(this.LLLIL), this.LLLLLLZZ), true);
        this.LLIZLLLIL.LLJJI.setValue(c0wiy);
    }

    public void setBorderColor(int i) {
        this.LLJJI.setBackgroundColor(this.LLILZLL.getResources().getColor(i));
        this.LLJJIII.setBackgroundColor(this.LLILZLL.getResources().getColor(i));
    }

    @Override // X.AbstractC19763912Uj
    public void setCanEdit(boolean z) {
        this.LLLLLZ = z;
    }

    public void setCurPointerContainerStartX(float f) {
        float f2;
        C19763012Ua c19763012Ua = this.LLJJJ;
        if (c19763012Ua != null) {
            int i = this.LLLLLLZZ;
            int i2 = C12UY.LIZJ;
            int i3 = i + i2;
            if (f <= i3) {
                f2 = i3 - C12UY.LJ;
            } else {
                int i4 = ((this.LLILLJJLI - i) - i2) - C12UY.LIZLLL;
                if (f >= i4) {
                    f2 = i4 + C12UY.LJ;
                } else {
                    f2 = f + (C12UY.LJ * (((2.0f * f) / r3) - 1.0f));
                }
            }
            c19763012Ua.setStartX(f2);
        }
    }

    @Override // X.AbstractC19763912Uj
    public void setCurrentRotate(int i) {
        int i2 = this.LLLIILIL;
        if (i2 == 2 || i2 == 0) {
            this.LLLIZZ.LIZJ = i;
        }
    }

    public void setEditState(int i) {
        this.LLLIILIL = i;
    }

    @Override // X.AbstractC19763912Uj
    public void setEditViewHeight(boolean z) {
        if (z) {
            this.LLLLL = this.LLLLLIL;
            this.LLLLLJLJLL = this.LLLLLL;
            this.LLLLLILLIL = 0;
        } else {
            this.LLLLL = (int) C11VU.LIZIZ(44.0f, getContext());
            this.LLLLLJLJLL = this.LLLLLLIL;
            this.LLLLLILLIL = (int) C11VU.LIZIZ(2.0f, getContext());
        }
        int i = this.LLLLLJLJLL;
        this.LLLLLLJ = (this.LLLLLLLZIL * 2) + i;
        C12UP c12up = this.LLLFF;
        c12up.LLJIJIL = i;
        c12up.LLILZIL.LIZ(i);
        C12UP c12up2 = this.LLLFFI;
        int i2 = this.LLLLLJLJLL;
        c12up2.LLJIJIL = i2;
        c12up2.LLILZIL.LIZ(i2);
        C786410Ut5.LJJJZ(this.LLJIJIL, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJILJILJ, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJI, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJILJIL, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJI, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJIII, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJJ, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJIJI, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJIJIIJIL, this.LLJLLIL);
        C786410Ut5.LJJJZ(this.LLJJIJIL, this.LLJLLIL);
        LJIILJJIL();
    }

    public void setEnableBoundaryText(boolean z) {
        int i;
        if (z != this.LLLLILI) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C19518211Xw c19518211Xw = this.LLJILJILJ;
            if (c19518211Xw != null) {
                C786410Ut5.LLIL(c19518211Xw, i);
            }
            C19518211Xw c19518211Xw2 = this.LLJILJIL;
            if (c19518211Xw2 != null) {
                C786410Ut5.LLIL(c19518211Xw2, i);
            }
        }
        this.LLLLILI = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.LLLLII = z;
        if (this.LLJLLL.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.LLJLLL.getLayoutManager()).LL = z;
        }
    }

    public void setEndCoverColor(int i) {
        View view = this.LLJJIJIIJIL;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    @Override // X.AbstractC19763912Uj
    public void setExtractFramesInRoughMode(boolean z) {
        this.LLLLJ = z;
    }

    public void setFirstFrameBitmapLiveData(MutableLiveData<Bitmap> mutableLiveData) {
        this.LLLLIILLL = mutableLiveData;
    }

    public void setFirstFrameVisibleLiveData(MutableLiveData<Boolean> mutableLiveData) {
        this.LLLLIL = mutableLiveData;
    }

    @Override // X.AbstractC19763912Uj
    public void setLoadThumbnailDirectly(boolean z) {
        this.LLLLIIL = z;
    }

    @Override // X.AbstractC19763912Uj
    public void setMaxVideoLength(long j) {
        this.LLILZ = j;
    }

    @Override // X.AbstractC19763912Uj
    public void setMinVideoLength(long j) {
        this.LLILLL = j;
    }

    public void setMvThemeVideoType(boolean z) {
        this.LLLJ = z;
    }

    public void setOptimizeEffect(boolean z) {
        this.LLLII = z;
    }

    public void setPointerType(int i) {
        this.LLLJIL = i;
    }

    @Override // X.AbstractC19763912Uj
    public void setUseCustomMaxVideoLengthDirectly(boolean z) {
        this.LLILZIL = z;
    }

    public void setVeEditor(InterfaceC1452170ntP interfaceC1452170ntP) {
        this.LLLLIILL = interfaceC1452170ntP;
    }

    public void setViewConfig(C19560311ft c19560311ft) {
        this.LLJLILLLLZIIL = c19560311ft;
    }

    public C12UW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[LOOP:0: B:25:0x004e->B:27:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    @Override // X.InterfaceC19767412Vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0WIY<java.lang.Float, java.lang.Float> r9, java.util.List<com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12UW.LIZLLL(X.0WIY, java.util.List):void");
    }

    public final void LJIIZILJ(float f, boolean z) {
        if (this.LLJJJ.getVisibility() != 0) {
            C19763012Ua c19763012Ua = this.LLJJJ;
            int visibility = c19763012Ua.getVisibility();
            c19763012Ua.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c19763012Ua);
        }
        C2219091BtD.LIZLLL().d(C786410Ut5.k4(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide0: targetX: %f, isTouch: %b", new Object[]{Float.valueOf(f), Boolean.valueOf(z)}));
        if (this.LLLJIL == 2) {
            int i = this.LLLLLLZZ;
            int i2 = C12UY.LIZJ;
            f = Math.min(Math.max(i + i2, f), ((this.LLILLJJLI - this.LLLLLLZZ) - i2) - C12UY.LIZLLL);
        } else {
            float startX = this.LLJIJIL.getStartX();
            float f2 = C12UY.LIZJ;
            if (f < startX + f2) {
                f = this.LLJIJIL.getStartX() + f2;
            }
            if (f > this.LLJI.getStartX() - this.LLJJJIL.getWidth()) {
                f = this.LLJI.getStartX() - this.LLJJJIL.getWidth();
            }
        }
        C2219091BtD.LIZLLL().d(C786410Ut5.k4(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide1: targetX: %f", new Object[]{Float.valueOf(f)}));
        setCurPointerContainerStartX(f);
        this.LLIZLLLIL.EQ2(this.LLLIIIIL);
        if (z) {
            if (this.LLLIILIL == 2) {
                this.LLIZLLLIL.LLILZIL.setValue(Long.valueOf(getSinglePlayingPosition()));
            } else {
                this.LLIZLLLIL.LLILZIL.setValue(Long.valueOf(getMultiPlayingPosition()));
            }
        }
    }

    public final void LJJIFFI(int i, int i2) {
        if (this.LLJJI != null && this.LLJJIII != null) {
            int i3 = C12UY.LIZJ;
            int i4 = i + i3;
            int iLIZIZ = ((i2 - i) - i3) + ((int) C11VU.LIZIZ(1.0f, this.LLILZLL));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, this.LLLLLLLZIL);
            layoutParams.leftMargin = i4;
            layoutParams.setMarginStart(i4);
            layoutParams.topMargin = this.LLLLLLLLLL;
            C786410Ut5.W5(this.LLJJI, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, this.LLLLLLLZIL);
            layoutParams2.leftMargin = i4;
            layoutParams2.setMarginStart(i4);
            layoutParams2.topMargin = (this.LLLLLLLLLL + this.LLLLLLJ) - this.LLLLLLLZIL;
            C786410Ut5.W5(this.LLJJIII, layoutParams2);
        }
    }

    public final void LJJIIZ(int i, int i2) {
        float f;
        C786410Ut5.LJLLLLLL(0, this.LLL);
        C423240Gig c423240Gig = this.LLJZIJLIL;
        int visibility = c423240Gig.getVisibility();
        c423240Gig.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c423240Gig);
        C423240Gig c423240Gig2 = this.LLJZIJLIL;
        float audioStartTranslationX = getAudioStartTranslationX();
        float f2 = i;
        float f3 = i2;
        if (f2 >= f3) {
            f = f3 / this.LLJLL.LJ;
        } else {
            f = f2 / this.LLJLL.LJ;
        }
        C786410Ut5.x3(c423240Gig2.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC425670Gmb(c423240Gig2, i, f, audioStartTranslationX));
    }

    public void LJJIJIIJIL(int i, VideoSegment videoSegment) {
        C786410Ut5.C0(this.LLJLLL, 0);
        C786410Ut5.C0(this.LLJZ, 8);
        this.LLLFFI.LLLIIIIL();
        if (i == 2) {
            this.LLJLLL.scrollToPosition(0);
            this.LLLFF.LLLIILIL(this.LLJLL.LIZIZ);
            this.LLIZLLLIL.LLJJIJI.setValue(null);
        } else {
            if (i == 3) {
                this.LLJLLL.scrollToPosition(0);
                C12UP c12up = this.LLLFF;
                HashMap<String, Float> map = this.LLJLL.LIZIZ;
                if (!C2401009ay.LIZ(c12up.LLILZLL)) {
                    ((ArrayList) c12up.LLILZLL).remove(videoSegment);
                    c12up.LLLIILIL(map);
                }
                this.LLIZLLLIL.LLJJIJIIJIL.setValue(videoSegment);
                return;
            }
            if (i != 1) {
                return;
            }
            this.LLIZLLLIL.LLJJIII.setValue(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        if (r4 >= r15.LLLLLLZZ) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        LJJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        if (r5 <= ((r15.LLILLJJLI - r15.LLLLLLZZ) - X.C12UY.LIZJ)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        LJJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0182, code lost:
    
        r15.LLJIJIL.setStartX(r4);
        r15.LLJI.setStartX(r5);
        setCurPointerContainerStartX(r4 + X.C12UY.LIZJ);
        LJJIFFI((int) r15.LLJIJIL.getStartX(), (int) r15.LLJI.getStartX());
        LJ();
        r15.LLIZLLLIL.LLJ.setValue(null);
        LJIJI();
        LJIL();
        LJIJJ();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12UW.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C12UW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJJJ = true;
        this.LLJLILLLLZIIL = new C19560311ft();
        this.LLLI = false;
        this.LLLII = false;
        this.LLLILZJ = true;
        this.LLLJIL = 1;
        this.LLLLII = true;
        this.LLLLIIIILLL = false;
        this.LLLLIIL = true;
        this.LLLLILI = false;
        int i2 = C12UY.LIZIZ;
        this.LLLLLJIL = i2;
        int i3 = C12UY.LIZ;
        this.LLLLLJLJLL = i3;
        this.LLLLLLIL = (int) C11VU.LIZIZ(32.0f, getContext());
        this.LLLLLLZZ = (int) C11VU.LIZIZ(36.0f, getContext());
        this.LLLLLZ = true;
        this.LLLLLZL = -1.0f;
        this.LLLLZ = new C12UZ(this);
        this.LLLLZI = true;
        this.LLILZLL = context;
        this.LLLLLLLZIL = (int) C11VU.LIZIZ(2.0f, context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            if (C12VA.LIZ().LJIIJ.invoke().booleanValue()) {
                this.LLLJL = C2441009hQ.LJIIL(0, 0);
            } else {
                this.LLLJL = typedArrayObtainStyledAttributes.getColor(R$styleable.VideoEditView_middleCoverColor, 0);
                this.LLLJL = C2441009hQ.LJIIL(this.LLLJL, (int) (typedArrayObtainStyledAttributes.getFloat(R$styleable.VideoEditView_middleCoverColorOpacity, 1.0f) * 255.0f));
            }
            this.LLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.VideoEditView_startEndCoverColor, getResources().getColor(R.color.a0m));
            this.LLLJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.VideoEditView_pointerType, 1);
            this.LLLLLJIL = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameWidth, i2));
            int iRound = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameHeight, i3));
            this.LLLLLL = iRound;
            this.LLLLLJLJLL = iRound;
            this.LLLLJI = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_cursorWidth, 0.0f));
            int iRound2 = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_cursorHeight, 0.0f));
            this.LLLLLIL = iRound2;
            this.LLLLL = iRound2;
            this.LLLLLLL = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_leftRightMargin, 0.0f));
            this.LLLLLLZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.VideoEditView_showBorder, false);
            this.LLLLLLJ = this.LLLLLJLJLL + (this.LLLLLLLZIL * 2);
            this.LLLLLLZZ = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_slideHorizontalMargin, this.LLLLLLL - C12UY.LIZJ));
            int i4 = this.LLLLL;
            this.LLLLLLLLLL = (i4 - this.LLLLLLJ) / 2;
            this.LLLLLLLLL = (i4 - this.LLLLLJLJLL) / 2;
            this.LLLILZJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.VideoEditView_newSlideType, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void LJJIJIIJI(final boolean z, boolean z2, final C092O<Void> c092o) {
        AlphaAnimation alphaAnimation;
        if (z2) {
            if (z) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.11g4
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    if (!z) {
                        this.LIZJ.LJJIJ(false);
                    }
                    C092O c092o2 = c092o;
                    if (c092o2 != null) {
                        c092o2.accept(null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    if (z) {
                        this.LIZJ.LJJIJ(true);
                    }
                }
            });
            C435250H4x c435250H4x = this.LLJIJIL;
            if (c435250H4x != null) {
                c435250H4x.startAnimation(alphaAnimation);
            }
            C435250H4x c435250H4x2 = this.LLJI;
            if (c435250H4x2 != null) {
                c435250H4x2.startAnimation(alphaAnimation);
            }
            View view = this.LLJJI;
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            View view2 = this.LLJJIII;
            if (view2 != null) {
                view2.startAnimation(alphaAnimation);
            }
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                view3.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        LJJIJ(z);
    }

    public final boolean LJJJ(int i, int i2, boolean z) {
        float f;
        C435250H4x c435250H4x = this.LLJIJIL;
        if (c435250H4x == null || !c435250H4x.isLaidOut() || this.LLJIJIL.getLeft() == 0) {
            return false;
        }
        if (this.LLLIILIL == 1) {
            this.LLJLLL.scrollToPosition(0);
            this.LLJLLL.smoothScrollBy(0, 0);
        } else {
            this.LLIZLLLIL.HQ2(this.LLLIL, 0);
            this.LLJZ.scrollToPosition(0);
            this.LLJZ.smoothScrollBy(0, 0);
        }
        C12UV c12uv = this.LLJLL;
        float f2 = c12uv.LJ;
        float fMax = (((i * 1.0f) / f2) + this.LLLLLLZZ) - 0;
        if (i2 >= c12uv.LJFF) {
            int screenWidth = ScreenUtils.getScreenWidth(this.LLILZLL);
            int i3 = this.LLLLLLZZ;
            int i4 = C12UY.LIZJ;
            f = (screenWidth - i3) - i4;
            fMax = Math.max((f - i4) - ((i2 - i) / this.LLJLL.LJ), i3);
        } else {
            f = ((i2 - i) / f2) + C12UY.LIZJ + fMax;
        }
        LJIJJLI(0, fMax, f, z);
        if (z) {
            setCurPointerContainerStartX(this.LLLLLLZZ + C12UY.LIZJ);
        }
        return true;
    }

    @Override // X.InterfaceC19767412Vs
    public final boolean LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        MediaModel mediaModel;
        this.LLJ = cutMultiVideoViewModel;
        if (cutMultiVideoViewModel.LLJILJIL) {
            mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL(str);
            mediaModel.width = 720;
            mediaModel.height = 1280;
            mediaModel.duration = cutMultiVideoViewModel.LLJILJILJ;
        } else {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
            if (videoFileInfo == null) {
                return false;
            }
            if (videoFileInfo.rotation % 180 != 0) {
                int i = videoFileInfo.height;
                videoFileInfo.height = videoFileInfo.width;
                videoFileInfo.width = i;
                if (C2281551ESb.LIZIZ.LJJIJIIJIL()) {
                    videoFileInfo.rotation = 0;
                }
            }
            mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL(str);
            mediaModel.width = videoFileInfo.width;
            mediaModel.height = videoFileInfo.height;
            mediaModel.duration = videoFileInfo.duration;
        }
        LJII(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, Collections.singletonList(mediaModel));
        return true;
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJII(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, List list) {
        int i;
        if (list.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        LJI(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, null, C571930Mbv.LIZ(list, false, null, false, 14), i);
    }

    public final void LJIJJLI(int i, float f, float f2, boolean z) {
        this.LLJIJIL.setStartX(f);
        C423240Gig c423240Gig = this.LLJZIJLIL;
        c423240Gig.LLIZ = (int) getAudioStartTranslationX();
        c423240Gig.invalidate();
        this.LLJI.setStartX(f2);
        LJJIFFI((int) this.LLJIJIL.getStartX(), (int) this.LLJI.getStartX());
        this.LLLIIIL = i;
        LJ();
        HandlerHook.viewPost(this, new ARunnableS48S0110000_29(this, z, 4));
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJI(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i) {
        int i2;
        VideoEditViewModel videoEditViewModel2;
        this.LLLIILIL = i;
        this.LLIZ = lifecycleOwner;
        this.LLJ = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.LLIZLLLIL = (VideoEditViewModel) viewModelProvider.get(VideoEditViewModel.class);
        } else {
            this.LLIZLLLIL = videoEditViewModel;
        }
        if (cutMultiVideoViewModel.LLJILJIL) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it2.next();
                videoSegment.duration = cutMultiVideoViewModel.LLJILJILJ;
                videoSegment.width = 720;
                videoSegment.height = 1280;
            }
        }
        this.LLIZLLLIL.IQ2(list);
        this.LLILLJJLI = ScreenUtils.getScreenWidth(this.LLILZLL);
        this.LLLILZ = 0;
        this.LLLIL = 0;
        List<VideoSegment> listZQ2 = this.LLIZLLLIL.zQ2();
        Context context = this.LLILZLL;
        int i3 = this.LLLLLLZZ;
        int i4 = C12UY.LIZ;
        int screenWidth = ScreenUtils.getScreenWidth(context) - (i3 * 2);
        int i5 = C12UY.LIZJ;
        int i6 = i5 * 2;
        C12UV c12uv = new C12UV(listZQ2, screenWidth - i6);
        this.LLJLL = c12uv;
        long j = this.LLILZ;
        boolean z = this.LLILZIL;
        c12uv.LJII = j;
        c12uv.LJIIJ = z;
        c12uv.LJIIIIZZ = this.LLILLL;
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LLILZLL, R.layout.i8t, this);
        this.LLJJJ = (C19763012Ua) viewLJLLJ.findViewById(R.id.fb_);
        this.LLJJJIL = (ImageView) viewLJLLJ.findViewById(R.id.fb9);
        this.LLJLLIL = (FrameLayout) viewLJLLJ.findViewById(R.id.ik0);
        this.LLJLLL = (C787020Uu4) viewLJLLJ.findViewById(R.id.ikc);
        this.LLJZ = (C787020Uu4) viewLJLLJ.findViewById(R.id.vc2);
        this.LLJZIJLIL = (C423240Gig) viewLJLLJ.findViewById(R.id.bay);
        this.LLL = viewLJLLJ.findViewById(R.id.uy1);
        this.LLLF = viewLJLLJ.findViewById(R.id.evm);
        if (this.LLLIILIL == 1) {
            this.LLLILZLLLI = new C19763712Uh();
            this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        } else {
            VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), 0);
            this.LLLIZZ = new C19763212Uc(videoSegment2);
            this.LLJLL.LIZJ(this.LLLIILIL, videoSegment2.duration, videoSegment2.LJI(), videoSegment2.LJFF(true));
        }
        this.LLLIIIIL = (this.LLILLJJLI - (this.LLLLLLZZ * 2)) - i6;
        this.LLLIIII = -i5;
        View view = this.LLLF;
        if (this.LLLLLLZ) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        int i7 = this.LLLLLLZZ + i5;
        this.LLLF.setBackground(C426580Go4.LIZJ(getResources().getColor(R.color.a0v), 0, (int) C11VU.LIZIZ(1.0f, getContext()), 0));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLLF.getLayoutParams();
        layoutParams.topMargin = this.LLLLLLLLL;
        layoutParams.setMarginStart(i7);
        layoutParams.setMarginEnd(i7);
        C786410Ut5.W5(this.LLLF, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLJZ.getLayoutParams();
        layoutParams2.topMargin = this.LLLLLLLLL;
        C787020Uu4 c787020Uu4 = this.LLJZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c787020Uu4);
        c787020Uu4.setLayoutParams(layoutParams2);
        C787020Uu4 c787020Uu42 = this.LLJZ;
        int i8 = this.LLLLLLZZ + i5;
        c787020Uu42.setPadding(i8, 0, i8, 0);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.LLJLLL.getLayoutParams();
        layoutParams3.topMargin = this.LLLLLLLLL;
        C787020Uu4 c787020Uu43 = this.LLJLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c787020Uu43);
        c787020Uu43.setLayoutParams(layoutParams3);
        C787020Uu4 c787020Uu44 = this.LLJLLL;
        int i9 = this.LLLLLLZZ + i5;
        c787020Uu44.setPadding(i9, 0, i9, 0);
        int iLJ = C11VU.LJ(getContext()) - ((this.LLLLLLZZ + i5) * 2);
        C19763512Uf c19763512Uf = new C19763512Uf();
        c19763512Uf.LIZ = new int[]{this.LLLLLJIL, this.LLLLLJLJLL, iLJ};
        List<VideoSegment> listZQ22 = this.LLIZLLLIL.zQ2();
        c19763512Uf.LIZIZ = listZQ22;
        HashMap<String, Float> map = this.LLJLL.LIZIZ;
        C19560811fy c19560811fy = this.LLLFZ;
        boolean z2 = this.LLLI;
        c19763512Uf.LIZJ = z2;
        this.LLLFFI = new C12UP(this.LLILZLL, new C12US(c19763512Uf.LIZ, listZQ22, map, 2, c19560811fy, z2));
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.LLJZIJLIL.getLayoutParams();
        layoutParams4.height = this.LLLLLJLJLL;
        layoutParams4.topMargin = this.LLLLLLLLL;
        C423240Gig c423240Gig = this.LLJZIJLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c423240Gig);
        c423240Gig.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.LLL.getLayoutParams();
        layoutParams5.height = this.LLLLLJLJLL;
        layoutParams5.topMargin = this.LLLLLLLLL;
        C786410Ut5.W5(this.LLL, layoutParams5);
        View view2 = this.LLL;
        int i10 = this.LLLLLLZZ + i5;
        view2.setPadding(i10, 0, i10, 0);
        if (this.LLLFZ != null) {
            C12UP c12up = this.LLLFFI;
            boolean z3 = this.LLJLILLLLZIIL.LIZIZ;
            C12UU c12uu = c12up.LLILZIL;
            if (c12uu instanceof C576700Mjc) {
                ((C576700Mjc) c12uu).LLILLJJLI = z3;
            }
        }
        C12UP c12up2 = this.LLLFFI;
        boolean z4 = this.LLLLJ;
        C12UU c12uu2 = c12up2.LLILZIL;
        if (c12uu2 instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) c12uu2).LLILLJJLI = z4;
        }
        this.LLJZ.setAdapter(c12up2);
        this.LLJZ.setLayoutManager(new MVLinearLayoutManager(this.LLILZLL));
        this.LLJZ.addOnScrollListener(this.LLLLZ);
        this.LLJZ.setflingScale(0.12d);
        C19763512Uf c19763512Uf2 = new C19763512Uf();
        c19763512Uf2.LIZ = new int[]{this.LLLLLJIL, this.LLLLLJLJLL, iLJ};
        List<VideoSegment> listZQ23 = this.LLIZLLLIL.zQ2();
        c19763512Uf2.LIZIZ = listZQ23;
        C12UP c12up3 = new C12UP(this.LLILZLL, new C12US(c19763512Uf2.LIZ, listZQ23, this.LLJLL.LIZIZ, 1, this.LLLFZ, c19763512Uf2.LIZJ));
        this.LLLFF = c12up3;
        if (this.LLLFZ != null) {
            boolean z5 = this.LLJLILLLLZIIL.LIZIZ;
            C12UU c12uu3 = c12up3.LLILZIL;
            if (c12uu3 instanceof C576700Mjc) {
                ((C576700Mjc) c12uu3).LLILLJJLI = z5;
            }
        }
        boolean z6 = this.LLLLJ;
        C12UU c12uu4 = c12up3.LLILZIL;
        if (c12uu4 instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) c12uu4).LLILLJJLI = z6;
        }
        this.LLJLLL.setAdapter(c12up3);
        this.LLJLLL.setLayoutManager(new ScrollInterceptedLayoutManager(this.LLILZLL));
        this.LLJLLL.setflingScale(0.12d);
        this.LLJLLL.addOnScrollListener(this.LLLLZ);
        if (this.LLLIILIL != 0 && !this.LLLJ) {
            C786410Ut5.C0(this.LLJZ, 8);
            C786410Ut5.C0(this.LLJLLL, 0);
        } else {
            C786410Ut5.C0(this.LLJZ, 0);
            C786410Ut5.C0(this.LLJLLL, 8);
            if (this.LLJ.LLJILJIL) {
                C12UP c12up4 = this.LLLFFI;
                c12up4.LLJJIII = true;
                c12up4.LLJJIJI = this.LLLLIILL;
            }
            C12UP c12up5 = this.LLLFFI;
            c12up5.LLJ = this.LLLLIL;
            c12up5.LLIZLLLIL = this.LLLLIILLL;
        }
        if (this.LLLLIIL && (videoEditViewModel2 = this.LLIZLLLIL) != null) {
            if (this.LLLIILIL == 0) {
                if (this.LLLFFI != null) {
                    MutableLiveData<Boolean> mutableLiveData = this.LLLLIL;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(Boolean.TRUE);
                    }
                    C12UP c12up6 = this.LLLFFI;
                    c12up6.LLILZLL = new ArrayList(c12up6.LLIZ);
                    c12up6.LLLIL();
                    c12up6.LLLFZ();
                }
            } else {
                C12UP c12up7 = this.LLLFF;
                if (c12up7 != null) {
                    c12up7.LLILZLL = new ArrayList(videoEditViewModel2.zQ2());
                    c12up7.LLLIL();
                    c12up7.LLLFZ();
                }
            }
        }
        this.LLJJJIL.setImageDrawable(C426580Go4.LIZJ(0, -1, 1, this.LLLLJI / 2));
        LJIILJJIL();
        if (this.LLLII) {
            C786410Ut5.LJZI(4, this.LLJJJIL);
            C786410Ut5.C0(this.LLJZ, 0);
            C786410Ut5.C0(this.LLJLLL, 8);
            LJJIJ(false);
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        }
        LJIIJ();
        this.LLLLIIIILLL = true;
    }
}
