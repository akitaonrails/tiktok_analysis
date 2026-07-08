package X;

import Y.ARunnableS129S0100000_29;
import Y.AsS55S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12XH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12XH extends AbstractC19763912Uj implements View.OnTouchListener {
    public final DecelerateInterpolator LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ImageView LLIZ;
    public C435250H4x LLIZLLLIL;
    public C435250H4x LLJ;
    public C19763012Ua LLJI;
    public C12XK LLJIJIL;
    public C12XK LLJILJIL;
    public C12XM LLJILJILJ;
    public int LLJILLL;
    public final float LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public Context LLJJIJI;
    public LifecycleOwner LLJJIJIIJIL;
    public VideoEditViewModel LLJJIJIL;
    public CutMultiVideoViewModel LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C12XJ LLJJJJJIL;
    public C536320L1q LLJJJJLIIL;
    public C536320L1q LLJJL;
    public SpeedyLinearLayoutManager LLJJLIIIJLLLLLLLZ;
    public SpeedyLinearLayoutManager LLJL;
    public float LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public C19763212Uc LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public final int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public long LLLIILIL;
    public long LLLIL;
    public long LLLILZ;
    public long LLLILZJ;
    public long LLLILZLLLI;
    public long LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public long LLLL;
    public Boolean LLLLII;
    public float LLLLIIIILLL;
    public long LLLLIIL;
    public VEMediaParserProviderV2 LLLLIILL;
    public C12XN LLLLIILLL;
    public final AsS55S0100000_29 LLLLIL;
    public float LLLLILI;
    public float LLLLJ;
    public float LLLLJI;

    public void LJIIL() {
        VideoEditViewModel videoEditViewModel;
        this.LLJLL = 0;
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LLJJIJI, R.layout.i8u, this);
        this.LLIZ = (ImageView) viewLJLLJ.findViewById(R.id.fb9);
        this.LLJI = (C19763012Ua) viewLJLLJ.findViewById(R.id.fb_);
        this.LLJIJIL = (C12XK) viewLJLLJ.findViewById(R.id.ikc);
        this.LLJILJIL = (C12XK) viewLJLLJ.findViewById(R.id.vc2);
        this.LLJILJILJ = (C12XM) viewLJLLJ.findViewById(R.id.t0j);
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), this.LLJLL);
        if (this.LLJLILLLLZIIL != 1) {
            C201955140j.LIZ("init EditState");
            VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), 0);
            this.LLJLLIL = new C19763212Uc(videoSegment2);
            this.LLLIILIL = (long) (videoSegment2.duration / videoSegment2.LJI());
        } else {
            this.LLLIILIL = C12XJ.LIZ(this.LLJJIJIL.zQ2(), this.LLJJIJIL.CQ2());
        }
        this.LLLILZJ = LJIIJJI(this.LLLIILIL, true);
        float f = this.LLJLIL;
        C12XJ c12xj = new C12XJ(f);
        this.LLJJJJJIL = c12xj;
        c12xj.LIZLLL = this.LLJJIII;
        long j = this.LLLILZJ;
        c12xj.LIZIZ = j;
        this.LLLIL = 0L;
        this.LLLILZ = j + 0;
        this.LLJJIJIL.EQ2(f);
        if (this.LLJLILLLLZIIL == 1) {
            C12XJ c12xj2 = this.LLJJJJJIL;
            long j2 = this.LLLIILIL;
            this.LLJJIJIL.CQ2();
            c12xj2.LIZJ(j2);
        } else {
            this.LLJJJJJIL.LIZLLL(videoSegment.LJI(), videoSegment.duration);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLJILJIL.getLayoutParams();
        layoutParams.topMargin = this.LLLII;
        C12XK c12xk = this.LLJILJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12xk);
        c12xk.setLayoutParams(layoutParams);
        C12XK c12xk2 = this.LLJILJIL;
        int i = this.LLLIIL;
        int i2 = C12VL.LIZLLL;
        int i3 = i + i2;
        c12xk2.setPadding(i3, 0, i3, 0);
        C536320L1q c536320L1q = new C536320L1q(this.LLJJIJI, new int[]{this.LLLFF, this.LLLFFI}, this.LLJJJJJIL.LIZ, this.LLLLIILL, 0);
        this.LLJJL = c536320L1q;
        c536320L1q.LLILLJJLI.LL = this.LLLJ;
        this.LLJILJIL.setAdapter(c536320L1q);
        SpeedyLinearLayoutManager speedyLinearLayoutManager = new SpeedyLinearLayoutManager(this.LLJJIJI);
        this.LLJL = speedyLinearLayoutManager;
        this.LLJILJIL.setLayoutManager(speedyLinearLayoutManager);
        this.LLJILJIL.addOnScrollListener(this.LLLLIL);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLJIJIL.getLayoutParams();
        layoutParams2.topMargin = this.LLLII;
        C12XK c12xk3 = this.LLJIJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12xk3);
        c12xk3.setLayoutParams(layoutParams2);
        C12XK c12xk4 = this.LLJIJIL;
        int i4 = this.LLLIIL + i2;
        c12xk4.setPadding(i4, 0, i4, 0);
        C536320L1q c536320L1q2 = new C536320L1q(this.LLJJIJI, new int[]{this.LLLFF, this.LLLFFI}, this.LLJJJJJIL.LIZ, this.LLLLIILL, 1);
        this.LLJJJJLIIL = c536320L1q2;
        c536320L1q2.LLILLJJLI.LL = this.LLLJ;
        this.LLJIJIL.setAdapter(c536320L1q2);
        SpeedyLinearLayoutManager speedyLinearLayoutManager2 = new SpeedyLinearLayoutManager(this.LLJJIJI);
        this.LLJJLIIIJLLLLLLLZ = speedyLinearLayoutManager2;
        this.LLJIJIL.setLayoutManager(speedyLinearLayoutManager2);
        this.LLJIJIL.addOnScrollListener(this.LLLLIL);
        if (this.LLJLILLLLZIIL == 0) {
            C786410Ut5.D0(this.LLJILJIL, 0);
            C786410Ut5.D0(this.LLJIJIL, 8);
        } else {
            C786410Ut5.D0(this.LLJILJIL, 8);
            C786410Ut5.D0(this.LLJIJIL, 0);
        }
        if (this.LLJLLL && (videoEditViewModel = this.LLJJIJIL) != null) {
            if (this.LLJLILLLLZIIL == 0) {
                C536320L1q c536320L1q3 = this.LLJJL;
                if (c536320L1q3 != null) {
                    c536320L1q3.LLILZLL = new ArrayList(videoEditViewModel.zQ2());
                    c536320L1q3.LLJ = c536320L1q3.LLLI(0.0f);
                    c536320L1q3.LLILLJJLI.LIZ();
                    c536320L1q3.notifyDataSetChanged();
                }
            } else {
                C536320L1q c536320L1q4 = this.LLJJJJLIIL;
                if (c536320L1q4 != null) {
                    c536320L1q4.LLILZLL = new ArrayList(videoEditViewModel.zQ2());
                    c536320L1q4.LLJ = c536320L1q4.LLLI(0.0f);
                    c536320L1q4.LLILLJJLI.LIZ();
                    c536320L1q4.notifyDataSetChanged();
                }
            }
        }
        LJIILJJIL();
        this.LLJ.bringToFront();
        this.LLIZLLLIL.bringToFront();
        this.LLJI.bringToFront();
    }

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ int getCurrentRotate();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ float getCurrentSpeed();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ int getEditState();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ long getLeftSeekingValue();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ long getMaxCutDuration();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ long getMultiPlayingPosition();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ long getMultiSeekTime();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ C0WIY<Long, Long> getPlayBoundary();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ long getPlayingPosition();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ long getRightSeekingValue();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ float getSelectedTime();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ long getSinglePlayingPosition();

    @Override // X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public abstract /* synthetic */ long getSingleSeekTime();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ C0WIY<Float, Float> getSlideX();

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setCanEdit(boolean z);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setCurrentRotate(int i);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setDefaultMode(boolean z);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setExtractFramesInRoughMode(boolean z);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setLoadThumbnailDirectly(boolean z);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setMaxVideoLength(long j);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setMinVideoLength(long j);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setMultiEditEnableForStickPointMode(boolean z);

    @Override // X.AbstractC19763912Uj
    public abstract /* synthetic */ void setUseCustomMaxVideoLengthDirectly(boolean z);

    private long getSelectedTimeV2() {
        return Math.round(((this.LLIZLLLIL.getStartX() - this.LLJ.getStartX()) - C12VL.LIZLLL) * this.LLJJJJJIL.LIZ);
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJ() {
        int i;
        C19763212Uc c19763212Uc = this.LLJLLIL;
        if (c19763212Uc == null || (i = this.LLJLILLLLZIIL) == 1) {
            return;
        }
        float f = this.LLLIL;
        float f2 = c19763212Uc.LIZLLL;
        c19763212Uc.LIZ = (long) (f * f2);
        c19763212Uc.LIZIZ = (long) (this.LLLILZ * f2);
        if (i == 0) {
            this.LLJJIJIL.GQ2(c19763212Uc, this.LLJLL);
        }
    }

    public final void LJIIJ() {
        this.LLJI.setOnTouchListener(this);
        getRecyclerView().LIZLLL();
        if (this.LLJLILLLLZIIL == 1) {
            long j = this.LLLILZJ;
            C12XJ c12xj = this.LLJJJJJIL;
            if (j != c12xj.LIZIZ) {
                c12xj.LIZIZ = j;
                long j2 = this.LLLIILIL;
                this.LLJJIJIL.CQ2();
                c12xj.LIZJ(j2);
                this.LLJJJJLIIL.LLLFZ(this.LLJJJJJIL.LIZ, 0.0f);
            }
        } else {
            long j3 = this.LLLILZJ;
            C12XJ c12xj2 = this.LLJJJJJIL;
            if (j3 != c12xj2.LIZIZ) {
                c12xj2.LIZIZ = j3;
                long jMin = Math.min(Math.min(j3, this.LLLIILIL), c12xj2.LIZLLL);
                c12xj2.LIZIZ = jMin;
                c12xj2.LIZ = jMin / c12xj2.LIZJ;
                this.LLJJL.LLLFZ(this.LLJJJJJIL.LIZ, this.LLJLLIL.LIZLLL);
            }
        }
        LJJII();
        LJJIFFI(this.LLIZLLLIL, (this.LLJILLL - this.LLLIIL) - C12VL.LIZLLL, false);
        LJJIFFI(this.LLJ, this.LLLIIL, true);
    }

    public final void LJIILJJIL() {
        C435250H4x c435250H4x = new C435250H4x(this.LLJJIJI);
        this.LLJ = c435250H4x;
        c435250H4x.setScaleType(ImageView.ScaleType.FIT_XY);
        C435250H4x c435250H4x2 = this.LLJ;
        int i = C12VL.LIZLLL;
        int i2 = i / 2;
        c435250H4x2.setPadding(i2, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, this.LLLI);
        layoutParams.topMargin = this.LLLIIII;
        C435250H4x c435250H4x3 = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435250H4x3);
        c435250H4x3.setLayoutParams(layoutParams);
        this.LLJ.setOnTouchListener(this);
        this.LLJ.setTag("startSlide");
        this.LLJ.setStartX(this.LLLIIL);
        C435250H4x c435250H4x4 = new C435250H4x(this.LLJJIJI);
        this.LLIZLLLIL = c435250H4x4;
        c435250H4x4.setScaleType(ImageView.ScaleType.FIT_XY);
        this.LLIZLLLIL.setPadding(0, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, this.LLLI);
        layoutParams2.topMargin = this.LLLIIII;
        C435250H4x c435250H4x5 = this.LLIZLLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435250H4x5);
        c435250H4x5.setLayoutParams(layoutParams2);
        this.LLIZLLLIL.setOnTouchListener(this);
        this.LLIZLLLIL.setTag("endSlide");
        this.LLIZLLLIL.setStartX((this.LLJILLL - this.LLLIIL) - i);
        this.LLJ.setImageResource(R.drawable.fip);
        this.LLIZLLLIL.setImageResource(R.drawable.fin);
        this.LLILLL = new View(this.LLJJIJI);
        this.LLILZ = new View(this.LLJJIJI);
        setBorderColor(C960203pA.LIZ(R.attr.ee, getContext()));
        addView(this.LLILLL);
        addView(this.LLILZ);
        LJJI((int) this.LLJ.getStartX(), (int) this.LLIZLLLIL.getStartX());
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.LLJI.getLayoutParams();
        layoutParams3.leftMargin = this.LLLIIL + i;
        layoutParams3.height = this.LLJZIJLIL;
        layoutParams3.topMargin = this.LLLF;
        C19763012Ua c19763012Ua = this.LLJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19763012Ua);
        c19763012Ua.setLayoutParams(layoutParams3);
        this.LLJI.setTag("curPoint");
        this.LLJI.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.LLIZ.getLayoutParams();
        layoutParams4.width = this.LLJZ;
        C786410Ut5.c6(this.LLIZ, layoutParams4);
        this.LLIZ.setImageDrawable(null);
        int iLIZ = C366700EZg.LIZ(0.5d);
        C2275681E5m.LIZ(-1, C366700EZg.LIZ(this.LLJZ / 2.0f), C960203pA.LIZ(R.attr.oz, getContext()), iLIZ, iLIZ, 0, this.LLIZ);
        this.LLILZIL = new View(this.LLJJIJI);
        this.LLILZLL = new View(this.LLJJIJI);
        int iLIZIZ = C19733712It.LIZIZ(false, false, true, false);
        this.LLILZIL.setBackgroundColor(iLIZIZ);
        this.LLILZLL.setBackgroundColor(iLIZIZ);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, this.LLLFFI);
        layoutParams5.topMargin = this.LLLII;
        C786410Ut5.W5(this.LLILZIL, layoutParams5);
        int startX = (int) (this.LLIZLLLIL.getStartX() + i2);
        int i3 = ((int) ((this.LLLIILIL - this.LLLILZ) / this.LLJJJJJIL.LIZ)) - i2;
        int i4 = this.LLJILLL - startX;
        if (i3 > i4) {
            i3 = i4;
        }
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(i3 + 2, this.LLLFFI);
        layoutParams6.topMargin = this.LLLII;
        C786410Ut5.Fd(this.LLILZLL, startX);
        C786410Ut5.W5(this.LLILZLL, layoutParams6);
        addView(this.LLILZIL);
        addView(this.LLILZLL);
        addView(this.LLJ);
        addView(this.LLIZLLLIL);
    }

    public final void LJIILL() {
        this.LLJI.setOnTouchListener(this);
        if (this.LLLLII.booleanValue()) {
            long j = this.LLLLIIL;
            if (j < 0) {
                long j2 = this.LLLIL + j;
                this.LLLIL = j2;
                if (j2 <= 0) {
                    this.LLLIL = 0L;
                }
                this.LLLILZ = this.LLLIL + this.LLLL;
            } else {
                long j3 = this.LLLILZ + j;
                this.LLLILZ = j3;
                long j4 = this.LLLIILIL;
                if (j3 >= j4) {
                    this.LLLILZ = j4;
                }
                this.LLLIL = this.LLLILZ - this.LLLL;
            }
            this.LLJJIJIL.LLJILLL.setValue(null);
            return;
        }
        getRecyclerView().LIZLLL();
        if (this.LLJLILLLLZIIL == 1) {
            long j5 = this.LLLILZJ;
            C12XJ c12xj = this.LLJJJJJIL;
            if (j5 != c12xj.LIZIZ) {
                c12xj.LIZIZ = j5;
                long j6 = this.LLLIILIL;
                this.LLJJIJIL.CQ2();
                c12xj.LIZJ(j6);
                this.LLJJJJLIIL.LLLFZ(this.LLJJJJJIL.LIZ, 0.0f);
            }
        } else {
            long j7 = this.LLLILZJ;
            C12XJ c12xj2 = this.LLJJJJJIL;
            if (j7 != c12xj2.LIZIZ) {
                c12xj2.LIZIZ = j7;
                long jMin = Math.min(Math.min(j7, this.LLLIILIL), c12xj2.LIZLLL);
                c12xj2.LIZIZ = jMin;
                c12xj2.LIZ = jMin / c12xj2.LIZJ;
                this.LLJJL.LLLFZ(this.LLJJJJJIL.LIZ, this.LLJLLIL.LIZLLL);
            }
        }
        LJJII();
        LJJIFFI(this.LLIZLLLIL, (this.LLJILLL - this.LLLIIL) - C12VL.LIZLLL, false);
        LJJIFFI(this.LLJ, this.LLLIIL, true);
    }

    public final void LJIJJ() {
        HandlerHook.viewPostDelay(this, new ARunnableS129S0100000_29(this, 4), 100L);
    }

    public final void LJIJJLI() {
        View view = this.LLILZLL;
        if (view == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        float startX = this.LLIZLLLIL.getStartX() + (C12VL.LIZLLL / 2.0f);
        if (!this.LLJJJJ) {
            startX -= this.LLJJ;
        }
        View viewFindViewByPosition = getLayoutManager().findViewByPosition(getLayoutManager().getItemCount() - 1);
        int x = viewFindViewByPosition != null ? (int) ((viewFindViewByPosition.getX() + viewFindViewByPosition.getWidth()) - startX) : (int) (this.LLJILLL - startX);
        int i = x <= 0 ? 0 : x + 1;
        C786410Ut5.Fd(this.LLILZLL, startX);
        layoutParams.width = i;
        layoutParams.height = this.LLLFFI;
        layoutParams.topMargin = this.LLLII;
        C786410Ut5.W5(this.LLILZLL, layoutParams);
    }

    public final void LJIL() {
        View view = this.LLILZIL;
        if (view == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        float startX = this.LLJ.getStartX() + (C12VL.LIZLLL / 2.0f);
        if (!this.LLJJJJ) {
            startX += this.LLJJ;
        }
        View viewFindViewByPosition = getLayoutManager().findViewByPosition(0);
        int x = viewFindViewByPosition != null ? (int) (startX - viewFindViewByPosition.getX()) : (int) startX;
        int i = x > 0 ? x + 1 : 0;
        C786410Ut5.Fd(this.LLILZIL, startX - i);
        layoutParams.width = i;
        layoutParams.height = this.LLLFFI;
        layoutParams.topMargin = this.LLLII;
        C786410Ut5.W5(this.LLILZIL, layoutParams);
    }

    public void LJJII() {
        if (this.LLLILZJ == 0 || (this.LLIZLLLIL.getStartX() - this.LLJ.getStartX()) - C12VL.LIZLLL == this.LLJLIL) {
            return;
        }
        long j = this.LLLILZJ / 6;
        if (this.LLJLILLLLZIIL == 1) {
            Pair pairLIZIZ = C12XJ.LIZIZ(j, this.LLLFF, this.LLLIL, this.LLJJIJIL.zQ2());
            this.LLJIJIL.LIZJ(((Integer) pairLIZIZ.getFirst()).intValue(), -Math.round(((Float) pairLIZIZ.getSecond()).floatValue()));
        } else {
            this.LLJILJIL.LIZJ((int) (this.LLLIL / j), -Math.round(((r6 - (((long) r3) * j)) / j) * this.LLLFF));
        }
        LJIJJ();
    }

    public final void LJJIIJ() {
        long j = this.LLLILZJ;
        if (j == 0) {
            return;
        }
        long j2 = j / 6;
        if (this.LLJLILLLLZIIL == 1) {
            Pair pairLIZIZ = C12XJ.LIZIZ(j2, this.LLLFF, this.LLLIL, this.LLJJIJIL.zQ2());
            this.LLJIJIL.LIZJ(((Integer) pairLIZIZ.getFirst()).intValue(), -Math.round(((Float) pairLIZIZ.getSecond()).floatValue()));
        } else {
            this.LLJILJIL.LIZJ((int) (this.LLLIL / j2), -Math.round(((r6 - (((long) r3) * j2)) / j2) * this.LLLFF));
        }
        if (this.LLLLII.booleanValue() && this.LLJLILLLLZIIL == 0 && this.LLLL < 1000) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), this.LLJLL);
            if (this.LLLIL > videoSegment.duration - this.LLLILZJ) {
                float f = (r4 - r2) / this.LLJJJJJIL.LIZ;
                C435250H4x c435250H4x = this.LLJ;
                c435250H4x.setStartX(c435250H4x.getStartX() + f);
                C435250H4x c435250H4x2 = this.LLIZLLLIL;
                c435250H4x2.setStartX(c435250H4x2.getStartX() + f);
                LJJI((int) this.LLJ.getStartX(), (int) this.LLIZLLLIL.getStartX());
            }
        }
        LJIJJ();
    }

    public C536320L1q getFrameAdapter() {
        return this.LLJLILLLLZIIL == 1 ? this.LLJJJJLIIL : this.LLJJL;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        return this.LLJLILLLLZIIL == 1 ? this.LLJJLIIIJLLLLLLLZ : this.LLJL;
    }

    public C12XK getRecyclerView() {
        return this.LLJLILLLLZIIL == 1 ? this.LLJIJIL : this.LLJILJIL;
    }

    @Override // X.AbstractC19763912Uj
    public View getEndSlide() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC19763912Uj
    public C435250H4x getStartSlide() {
        return this.LLJ;
    }

    public final void LJIILLIIL(int i) {
        if (this.LLLIIIL != 0) {
            if (i < 0) {
                C435250H4x c435250H4x = this.LLIZLLLIL;
                c435250H4x.setStartX(c435250H4x.getStartX() - i);
            } else {
                C435250H4x c435250H4x2 = this.LLJ;
                c435250H4x2.setStartX(c435250H4x2.getStartX() - i);
            }
            LJIL();
            LJIJJLI();
            LJJI((int) this.LLJ.getStartX(), (int) this.LLIZLLLIL.getStartX());
            long selectedTimeV2 = getSelectedTimeV2();
            this.LLLILZJ = selectedTimeV2;
            int i2 = this.LLLIIIL;
            if (i2 != 1) {
                if (i2 == 2) {
                    long j = this.LLLIL + selectedTimeV2;
                    this.LLLILZ = j;
                    long j2 = this.LLLIILIL;
                    if (j >= j2) {
                        this.LLLILZ = j2;
                    }
                }
            } else {
                long j3 = this.LLLILZ - selectedTimeV2;
                this.LLLIL = j3;
                if (j3 <= 0) {
                    this.LLLIL = 0L;
                }
            }
            long j4 = this.LLLILZ - this.LLLIL;
            this.LLLILZJ = j4;
            long j5 = this.LLJJIII;
            if (j4 > j5) {
                this.LLLILZJ = j5;
                LJJIIZ(true);
                getRecyclerView().LIZLLL();
            }
        } else {
            if (i > 0) {
                long jAbs = (long) (this.LLLILZ + (Math.abs(i) * this.LLJJJJJIL.LIZ));
                this.LLLILZ = jAbs;
                long j6 = this.LLLIILIL;
                if (jAbs >= j6) {
                    this.LLLILZ = j6;
                }
                this.LLLIL = this.LLLILZ - this.LLLILZJ;
            } else {
                long jAbs2 = (long) (this.LLLIL - (Math.abs(i) * this.LLJJJJJIL.LIZ));
                this.LLLIL = jAbs2;
                if (jAbs2 <= 0) {
                    this.LLLIL = 0L;
                }
                this.LLLILZ = this.LLLIL + this.LLLILZJ;
            }
            LJIL();
            LJIJJLI();
        }
        LJ();
    }

    public final void LJIJ(float f) {
        if (this.LLLILZJ < this.LLJJI) {
            LJJIIZ(false);
            long j = this.LLJJI;
            this.LLLILZJ = j;
            this.LLLILZ = this.LLLIL + j;
        } else {
            LJJIIJZLJL(f, false);
        }
        LJ();
        if (this.LLLIIIL == 2) {
            this.LLJJIJIL.LLILZLL.setValue(null);
        }
    }

    public final void LJIJI(float f) {
        if (this.LLLILZJ < this.LLJJI) {
            LJJIIZ(false);
            long j = this.LLJJI;
            this.LLLILZJ = j;
            this.LLLIL = this.LLLILZ - j;
        } else {
            LJJIIJZLJL(f, true);
        }
        LJ();
        if (this.LLLIIIL == 1) {
            this.LLJJIJIL.LLIZ.setValue(null);
        }
    }

    public final void LJJIII(float f) {
        float f2 = this.LLLLJ;
        if (f2 == 0.0f) {
            this.LLLLJ = f;
        } else {
            if (Math.abs(f2 - f) <= 3.0f) {
                return;
            }
            this.LLLLJ = f;
            this.LLJJIJIL.LLJILJILJ.setValue(null);
        }
    }

    public final void LJJIIZ(boolean z) {
        String string;
        if (this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = true;
        Context context = this.LLJJIJI;
        int i = C12VL.LIZIZ;
        ((Vibrator) C786410Ut5.H2(context, "vibrator")).vibrate(10L);
        if (z) {
            if (this.LL && C523660KgG.LIZ()) {
                string = C786410Ut5.N3(getContext()).getResources().getString(2131836894, Long.valueOf(C530010KqV.LIZ() / 60000));
            } else {
                string = getResources().getString(2131836462, Float.valueOf(this.LLJJIII / 1000.0f));
            }
        } else {
            string = getResources().getString(2131857946, Float.valueOf(this.LLJJI / 1000.0f));
        }
        Context context2 = this.LLJJIJI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZJ(context2, 3081, creativeToastBuilder);
    }

    public void setBorderColor(int i) {
        this.LLILLL.setBackgroundColor(i);
        this.LLILZ.setBackgroundColor(i);
    }

    @Override // X.AbstractC19763912Uj
    public void setEditViewHeight(boolean z) {
        if (z) {
            this.LLJZIJLIL = this.LLL;
            this.LLLFFI = C12VL.LIZIZ;
            this.LLLF = 0;
        } else {
            this.LLJZIJLIL = (int) C12ES.LIZJ(44.0f, getContext());
            this.LLLFFI = this.LLLFZ;
            this.LLLF = (int) C12ES.LIZJ(2.0f, getContext());
        }
        int i = this.LLLFFI;
        this.LLLI = (this.LLLIIIIL * 2) + i;
        C536320L1q c536320L1q = this.LLJJJJLIIL;
        c536320L1q.LLIZLLLIL = i;
        c536320L1q.LLILLJJLI.LLJ = i;
        C536320L1q c536320L1q2 = this.LLJJL;
        c536320L1q2.LLIZLLLIL = i;
        c536320L1q2.LLILLJJLI.LLJ = i;
        C786410Ut5.LJJLIIIJJIZ(this, this.LLJ);
        C786410Ut5.LJJLIIIJJIZ(this, this.LLIZLLLIL);
        C786410Ut5.LJJLIIIJJIZ(this, this.LLILLL);
        C786410Ut5.LJJLIIIJJIZ(this, this.LLILZ);
        C786410Ut5.LJJLIIIJJIZ(this, this.LLILZIL);
        C786410Ut5.LJJLIIIJJIZ(this, this.LLILZLL);
        LJIILJJIL();
        this.LLJ.bringToFront();
        this.LLIZLLLIL.bringToFront();
        this.LLJI.bringToFront();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.LLJILJILJ.setIntercept(!z);
        if (z) {
            this.LLJ.setEnabled(true);
            this.LLIZLLLIL.setEnabled(true);
            this.LLJI.setEnabled(true);
        } else {
            if (this.LLLIIIL != 0) {
                return;
            }
            this.LLJ.setEnabled(false);
            this.LLIZLLLIL.setEnabled(false);
            this.LLJI.setEnabled(false);
        }
    }

    public void setFocusOnMode(boolean z) {
        this.LLJJIJIL.LLJJIJIL.setValue(Boolean.valueOf(z));
    }

    public void setSelfAdaptiontoastAnimListener(C12XN c12xn) {
        this.LLLLIILLL = c12xn;
    }

    public final long LJIIJJI(long j, boolean z) {
        long jMin = Math.min(j, this.LLJJIII);
        if (z) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJJ;
            if (cutMultiVideoViewModel != null) {
                cutMultiVideoViewModel.getClass();
            }
            if (C523660KgG.LIZ()) {
                return Math.min(jMin, C536240L1i.LIZ());
            }
            return jMin;
        }
        return jMin;
    }

    public final void LJIIZILJ(float f, boolean z) {
        float startX = this.LLJ.getStartX();
        float f2 = C12VL.LIZLLL;
        if (f < startX + f2) {
            f = this.LLJ.getStartX() + f2;
        }
        if (f > this.LLIZLLLIL.getStartX() - this.LLIZ.getWidth()) {
            f = this.LLIZLLLIL.getStartX() - this.LLIZ.getWidth();
        }
        this.LLJI.setStartX(f);
        if (z) {
            if (this.LLJLILLLLZIIL == 2) {
                this.LLJJIJIL.LLILZIL.setValue(Long.valueOf(getSinglePlayingPosition()));
            } else {
                this.LLJJIJIL.LLILZIL.setValue(Long.valueOf(getMultiPlayingPosition()));
            }
        }
    }

    public final void LJJI(int i, int i2) {
        View view = this.LLILLL;
        if (view == null || this.LLILZ == null || i > i2) {
            return;
        }
        int i3 = C12VL.LIZLLL;
        int i4 = i + i3;
        int i5 = ((i2 - i) - i3) + 1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = i5;
        layoutParams.height = this.LLLIIIIL;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = this.LLLIIII;
        C786410Ut5.W5(this.LLILLL, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLILZ.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = i5;
        int i6 = this.LLLIIIIL;
        layoutParams2.height = i6;
        layoutParams2.leftMargin = i4;
        layoutParams2.topMargin = (this.LLLIIII + this.LLLI) - i6;
        C786410Ut5.W5(this.LLILZ, layoutParams2);
    }

    public final void LJJIIJZLJL(float f, boolean z) {
        if (z) {
            this.LLJ.setStartX(f);
        } else {
            this.LLIZLLLIL.setStartX(f);
        }
        LJJI((int) this.LLJ.getStartX(), (int) this.LLIZLLLIL.getStartX());
        if (z) {
            LJIL();
        } else {
            LJIJJLI();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0294  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12XH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C12XH(Context context, AttributeSet attributeSet, int i) {
        long jLIZJ;
        super(context, attributeSet, i);
        this.LLILLJJLI = new DecelerateInterpolator();
        this.LLJILLL = 0;
        this.LLJJ = C0JAI.LIZ(12.0f, getContext());
        int i2 = C12VL.LIZIZ;
        this.LLJJI = C566050MHz.LIZIZ();
        if (C0CHQ.LIZ().getBridgeService().LJII()) {
            jLIZJ = 300000;
        } else {
            jLIZJ = C12VL.LIZJ();
        }
        this.LLJJIII = jLIZJ;
        this.LLJJJJ = true;
        this.LLJLLL = true;
        this.LLLFFI = C12VL.LIZIZ;
        this.LLLFZ = C366700EZg.LIZ(32.0d);
        this.LLLIIIL = 0;
        this.LLLIIL = C12VL.LJ;
        this.LLLIILIL = 0L;
        this.LLLIL = 0L;
        this.LLLILZ = 0L;
        this.LLLILZJ = 0L;
        this.LLLILZLLLI = 0L;
        this.LLLIZZ = 0L;
        this.LLLJIL = false;
        this.LLLJL = false;
        this.LLLL = 0L;
        this.LLLLII = Boolean.FALSE;
        this.LLLLIIIILLL = 0.0f;
        this.LLLLIL = new AsS55S0100000_29((C12XI) this, 0);
        this.LLLLJ = 0.0f;
        this.LLJILLL = C14KQ.LJIIIIZZ(context);
        this.LLLIIIIL = (int) C12ES.LIZJ(2.0f, context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.LLJZ = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_cursorWidth, 0.0f));
            int iRound = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_cursorHeight, 0.0f));
            this.LLL = iRound;
            this.LLJZIJLIL = iRound;
            this.LLLI = this.LLLFFI + (this.LLLIIIIL * 2);
            int iRound2 = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_leftRightMargin, this.LLLIIL));
            this.LLLIIL = iRound2;
            float f = (this.LLJILLL - (C12VL.LIZLLL * 2)) - (iRound2 * 2);
            this.LLJLIL = f;
            int iRound3 = Math.round(f / 6.0f);
            this.LLLFF = iRound3;
            this.LLLFF = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameWidth, iRound3));
            int i3 = this.LLJZIJLIL;
            this.LLLIIII = (i3 - C12VL.LIZJ) / 2;
            this.LLLII = (i3 - this.LLLFFI) / 2;
            typedArrayObtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(true);
    }

    public final void LJJIFFI(C435250H4x c435250H4x, float f, final boolean z) {
        if (c435250H4x != null && Math.abs(c435250H4x.getStartX() - f) > 1.0f) {
            if (z) {
                float startX = c435250H4x.getStartX();
                int i = C12VL.LIZLLL;
                if (startX < (-i)) {
                    c435250H4x.setStartX(-i);
                }
            } else {
                float startX2 = c435250H4x.getStartX();
                int i2 = this.LLJILLL;
                if (startX2 > i2 + 1) {
                    c435250H4x.setStartX(i2 + 1);
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c435250H4x.getStartX(), f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(this.LLILLJJLI);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12XL
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C12XH c12xh = this.LL;
                    boolean z2 = z;
                    c12xh.getClass();
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (z2) {
                        c12xh.LJIJI(fFloatValue);
                    } else {
                        c12xh.LJIJ(fFloatValue);
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    @Override // X.InterfaceC19767412Vs
    public final boolean LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.LLJJJ = cutMultiVideoViewModel;
        MediaModel mediaModelLIZ = C12VL.LIZ(str, cutMultiVideoViewModel);
        if (mediaModelLIZ == null) {
            return false;
        }
        LJII(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, Collections.singletonList(mediaModelLIZ));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19767412Vs
    public final void LJI(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i) {
        this.LLJJIJIIJIL = lifecycleOwner;
        if (lifecycleOwner instanceof C19EG) {
            this.LLJJIJI = (Context) lifecycleOwner;
        } else if (lifecycleOwner instanceof Scene) {
            this.LLJJIJI = C545820Lau.LIZIZ((Scene) lifecycleOwner);
        }
        this.LLJJJ = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.LLJJIJIL = (VideoEditViewModel) viewModelProvider.get(VideoEditViewModel.class);
        } else {
            this.LLJJIJIL = videoEditViewModel;
        }
        this.LLJLILLLLZIIL = i;
        this.LLLLIILL = new VEMediaParserProviderV2(this.LLJJIJI, lifecycleOwner.getLifecycle());
        if (cutMultiVideoViewModel.LLJILJIL) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it2.next();
                videoSegment.duration = cutMultiVideoViewModel.LLJILJILJ;
                videoSegment.width = 720;
                videoSegment.height = 1280;
            }
        }
        VideoEditViewModel videoEditViewModel2 = this.LLJJIJIL;
        if (videoEditViewModel2 != null) {
            videoEditViewModel2.IQ2(list);
        }
        LJIIL();
    }
}
