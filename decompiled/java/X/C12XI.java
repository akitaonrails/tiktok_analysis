package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12XI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12XI extends C12XH {
    public static final /* synthetic */ int LLLLLJLJLL = 0;
    public long LLLLL;
    public long LLLLLIL;
    public boolean LLLLLILLIL;
    public Map<String, Boolean> LLLLLJIL;

    public final void LJJIL() {
        setEditViewHeight(false);
        C786410Ut5.D0(this.LLJILJIL, 8);
        if (this.LLLLII.booleanValue()) {
            C786410Ut5.D0(this.LLJIJIL, this.LLLLLILLIL ? 0 : 8);
        } else {
            C786410Ut5.D0(this.LLJIJIL, 0);
        }
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setCanEdit(boolean z) {
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setUseCustomMaxVideoLengthDirectly(boolean z) {
    }

    private Map<String, Boolean> getSingleEditFirstMap() {
        if (this.LLLLLJIL == null) {
            this.LLLLLJIL = new HashMap(8);
        }
        return this.LLLLLJIL;
    }

    @Override // X.InterfaceC19767412Vs
    public final void LIZIZ() {
        if (this.LLJJIJIL == null) {
            return;
        }
        if (this.LLLLII.booleanValue()) {
            C786410Ut5.D0(this.LLJIJIL, this.LLLLLILLIL ? 0 : 8);
            long jLIZ = C12XJ.LIZ(this.LLJJIJIL.zQ2(), this.LLJJIJIL.CQ2());
            this.LLLIILIL = jLIZ;
            long jLJIIJJI = LJIIJJI(Math.min(jLIZ, C536240L1i.LIZ()), false);
            this.LLLILZJ = jLJIIJJI;
            this.LLLIL = 0L;
            this.LLLILZ = jLJIIJJI;
            C786410Ut5.D0(this.LLJILJIL, 8);
            C12XJ c12xj = this.LLJJJJJIL;
            c12xj.LIZIZ = this.LLLILZJ;
            long j = this.LLLIILIL;
            this.LLJJIJIL.CQ2();
            c12xj.LIZJ(j);
        } else {
            if (this.LLJLILLLLZIIL != 1) {
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), 0);
                this.LLJLLIL = new C19763212Uc(videoSegment);
                this.LLLIILIL = (long) (videoSegment.duration / videoSegment.LJI());
            } else {
                this.LLLIILIL = C12XJ.LIZ(this.LLJJIJIL.zQ2(), this.LLJJIJIL.CQ2());
            }
            this.LLLIL = this.LLLLLIL;
            long jLJIIJJI2 = LJIIJJI(Math.min(this.LLLIILIL, C536240L1i.LIZ()), false);
            long j2 = this.LLLLL;
            if (j2 == 0) {
                this.LLLILZJ = jLJIIJJI2;
            } else {
                this.LLLILZJ = Math.min(j2, jLJIIJJI2);
            }
            long j3 = this.LLLIL;
            long j4 = this.LLLILZJ;
            this.LLLILZ = j3 + j4;
            this.LLJJJJJIL.LIZIZ = j4;
            if (this.LLJLILLLLZIIL == 1) {
                C786410Ut5.D0(this.LLJILJIL, 8);
                C786410Ut5.D0(this.LLJIJIL, 0);
                C12XJ c12xj2 = this.LLJJJJJIL;
                long j5 = this.LLLIILIL;
                this.LLJJIJIL.CQ2();
                c12xj2.LIZJ(j5);
            } else {
                C786410Ut5.D0(this.LLJILJIL, 0);
                C786410Ut5.D0(this.LLJIJIL, 8);
                this.LLJJJJJIL.LIZLLL(this.LLJLLIL.LIZLLL, ((VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), 0)).duration);
            }
        }
        this.LLJ.setStartX(this.LLLIIL);
        C435250H4x c435250H4x = this.LLIZLLLIL;
        int i = this.LLJILLL - this.LLLIIL;
        int i2 = C12VL.LIZLLL;
        c435250H4x.setStartX(i - i2);
        LJIIZILJ(this.LLJ.getStartX() + i2, false);
        LJJI((int) this.LLJ.getStartX(), (int) this.LLIZLLLIL.getStartX());
        if (this.LLJLILLLLZIIL == 1) {
            ArrayList arrayList = new ArrayList();
            for (VideoSegment videoSegment2 : this.LLJJIJIL.zQ2()) {
                if (!videoSegment2.isDeleted) {
                    arrayList.add(videoSegment2);
                }
            }
            C536320L1q c536320L1q = this.LLJJJJLIIL;
            float f = this.LLJJJJJIL.LIZ;
            c536320L1q.getClass();
            c536320L1q.LLILZLL = new ArrayList(arrayList);
            c536320L1q.LLLFZ(f, 0.0f);
        } else {
            this.LLJJL.LLLFZ(this.LLJJJJJIL.LIZ, this.LLJLLIL.LIZLLL);
        }
        LJJIIJ();
    }

    @Override // X.InterfaceC19767412Vs
    public final boolean LJFF() {
        return this.LLLLII.booleanValue();
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJIIIIZZ() {
        if (this.LLJJJJJIL == null) {
            return;
        }
        long jLJIIJJI = LJIIJJI(Math.min(this.LLLIILIL, C536240L1i.LIZ()), false);
        this.LLLILZJ = jLJIIJJI;
        this.LLJJJJJIL.LIZIZ = jLJIIJJI;
        this.LLLIL = 0L;
        this.LLLILZ = jLJIIJJI + 0;
        if (this.LLLLII.booleanValue()) {
            this.LLLLLIL = 0L;
            this.LLLLL = 0L;
        }
        C12XJ c12xj = this.LLJJJJJIL;
        long j = this.LLLIILIL;
        this.LLJJIJIL.CQ2();
        c12xj.LIZJ(j);
        this.LLJIJIL.scrollToPosition(0);
        this.LLJJIJIL.EQ2(this.LLJLIL);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.LLJJIJIL.zQ2()) {
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        C536320L1q c536320L1q = this.LLJJJJLIIL;
        float f = this.LLJJJJJIL.LIZ;
        c536320L1q.getClass();
        c536320L1q.LLILZLL = new ArrayList(arrayList);
        c536320L1q.LLLFZ(f, 0.0f);
        LJIIJ();
        LJIJJ();
    }

    public final void LJJIJIL() {
        this.LLJ.setImageResource(R.drawable.fip);
        this.LLIZLLLIL.setImageResource(R.drawable.fin);
        this.LLJ.setOnTouchListener(this);
        this.LLJ.setTag("startSlide");
        this.LLIZLLLIL.setOnTouchListener(this);
        this.LLIZLLLIL.setTag("endSlide");
        this.LLJI.setOnTouchListener(this);
        this.LLJI.setTag("curPoint");
        this.LLJJJJ = true;
    }

    public final void LJJIJLIJ() {
        this.LLJ.setOnTouchListener(null);
        this.LLIZLLLIL.setOnTouchListener(null);
        this.LLJI.setOnTouchListener(this);
        this.LLJJJJ = false;
        this.LLJ.setImageDrawable(LJJIIZI(Boolean.TRUE));
        this.LLIZLLLIL.setImageDrawable(LJJIIZI(Boolean.FALSE));
        LJIJJ();
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public int getCurrentRotate() {
        C19763212Uc c19763212Uc;
        int i = this.LLJLILLLLZIIL;
        if ((i == 2 || i == 0) && (c19763212Uc = this.LLJLLIL) != null) {
            return c19763212Uc.LIZJ;
        }
        return 0;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public float getCurrentSpeed() {
        int i = this.LLJLILLLLZIIL;
        if (i == 2 || i == 0) {
            C19763212Uc c19763212Uc = this.LLJLLIL;
            if (c19763212Uc != null) {
                return c19763212Uc.LIZLLL;
            }
            return 1.0f;
        }
        VideoEditViewModel videoEditViewModel = this.LLJJIJIL;
        if (videoEditViewModel != null) {
            return videoEditViewModel.CQ2();
        }
        return 1.0f;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getMaxCutDuration() {
        if (this.LLJLILLLLZIIL == 1) {
            return LJJIJ(this.LLJJIII);
        }
        C19763212Uc c19763212Uc = this.LLJLLIL;
        return (long) (this.LLJJIII * (c19763212Uc == null ? 1.0f : c19763212Uc.LIZLLL));
    }

    public C0WIY<Long, Long> getMultiVideoPlayDur() {
        return new C0WIY<>(Long.valueOf(LJJIJ(this.LLLIL)), Long.valueOf(LJJIJ(this.LLLILZ)));
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public C0WIY<Long, Long> getPlayBoundary() {
        return this.LLJLILLLLZIIL == 1 ? getMultiVideoPlayDur() : getSingleVideoPlayDur();
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public long getPlayingPosition() {
        return (long) ((((this.LLJI.getStartX() - this.LLJ.getStartX()) - C12VL.LIZLLL) * this.LLJJJJJIL.LIZ) + this.LLLIL);
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public float getSelectedTime() {
        long j = this.LLLILZJ;
        long j2 = this.LLJJIII;
        if (j > j2) {
            j = j2;
        }
        return j / 1000.0f;
    }

    public C0WIY<Long, Long> getSingleVideoPlayDur() {
        C19763212Uc c19763212Uc = this.LLJLLIL;
        float f = c19763212Uc != null ? c19763212Uc.LIZLLL : 1.0f;
        return new C0WIY<>(Long.valueOf((long) (this.LLLIL * f)), Long.valueOf((long) (this.LLLILZ * f)));
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public C0WIY<Float, Float> getSlideX() {
        return new C0WIY<>(Float.valueOf(this.LLJ.getStartX()), Float.valueOf(this.LLIZLLLIL.getStartX()));
    }

    @Override // X.C12XH
    public final void LJIIL() {
        super.LJIIL();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJJ;
        if (cutMultiVideoViewModel != null) {
            cutMultiVideoViewModel.LLILZ.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 4));
            this.LLJJJ.LLILZIL.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 5));
            this.LLJJJ.LLILZLL.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 6));
            this.LLJJJ.LLIZ.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 7));
            this.LLJJJ.LLIZLLLIL.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 8));
            this.LLJJJ.LLJ.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 9));
            this.LLJJJ.LLJI.observe(this.LLJJIJIIJIL, new AObserverS231S0100000_29(this, 10));
        }
        this.LLLLLIL = this.LLLIL;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public int getEditState() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getLeftSeekingValue() {
        return this.LLLIL;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getMultiSeekTime() {
        return this.LLLIL;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getRightSeekingValue() {
        return this.LLLILZ;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getSingleSeekTime() {
        return this.LLLIL;
    }

    @Override // X.InterfaceC19767412Vs
    public final void LIZ(List<VideoSegment> list) {
        VideoEditViewModel videoEditViewModel = this.LLJJIJIL;
        if (videoEditViewModel == null) {
            return;
        }
        this.LLJLILLLLZIIL = 1;
        videoEditViewModel.vQ2(list);
        int i = C12VL.LIZIZ;
        this.LLJJI = C566050MHz.LIZIZ();
        this.LLLIILIL = C12XJ.LIZ(this.LLJJIJIL.zQ2(), this.LLJJIJIL.CQ2());
        long jLJIIJJI = LJIIJJI(Math.min(this.LLLIILIL, C536240L1i.LIZ()), false);
        this.LLLILZJ = jLJIIJJI;
        C12XJ c12xj = this.LLJJJJJIL;
        c12xj.LIZIZ = jLJIIJJI;
        long j = this.LLLIILIL;
        this.LLJJIJIL.CQ2();
        c12xj.LIZJ(j);
        this.LLLIL = 0L;
        this.LLLILZ = this.LLLILZJ + 0;
        C786410Ut5.D0(this.LLJILJIL, 8);
        C786410Ut5.D0(this.LLJIJIL, 0);
        this.LLJIJIL.scrollToPosition(0);
        C536320L1q c536320L1q = this.LLJJJJLIIL;
        float f = this.LLJJJJJIL.LIZ;
        c536320L1q.getClass();
        if (!C0IKQ.LIZ(list)) {
            ((ArrayList) c536320L1q.LLILZLL).addAll(list);
            c536320L1q.LLLFZ(f, 0.0f);
        }
        this.LLJJIJIL.EQ2(0.0f);
        if (this.LLLLII.booleanValue()) {
            this.LLLLLIL = 0L;
            this.LLLLL = 0L;
        }
        LJIJJ();
    }

    @Override // X.InterfaceC19767412Vs
    public final void LJIIIZ(boolean z) {
        if (this.LLLLII.booleanValue() == z) {
            return;
        }
        if (!this.LLLLII.booleanValue()) {
            this.LLLLL = this.LLLILZJ;
            this.LLLLLIL = this.LLLIL;
            if (getRecyclerView().LL) {
                LJIIJ();
            }
        }
        this.LLLLII = Boolean.valueOf(z);
        if (z) {
            LJJIJLIJ();
        } else {
            LJJIJIL();
        }
        setFocusOnMode(false);
    }

    public final Drawable LJJIIZI(Boolean bool) {
        int iLIZ = C960203pA.LIZ(R.attr.a04, this.LLJJIJI);
        float fLIZ = C0JAI.LIZ(2.0f, this.LLJJIJI);
        boolean zBooleanValue = bool.booleanValue();
        if (getLayoutDirection() != 0 && C1388580mEq.LIZIZ(this.LLJJIJI)) {
            zBooleanValue = !zBooleanValue;
        }
        if (zBooleanValue) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C426580Go4.LIZLLL(iLIZ, iLIZ, new float[]{fLIZ, fLIZ, 0.0f, 0.0f, 0.0f, 0.0f, fLIZ, fLIZ})});
            layerDrawable.setLayerInset(0, (int) this.LLJJ, 0, 0, 0);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{C426580Go4.LIZLLL(iLIZ, iLIZ, new float[]{0.0f, 0.0f, fLIZ, fLIZ, fLIZ, fLIZ, 0.0f, 0.0f})});
        layerDrawable2.setLayerInset(0, 0, 0, (int) this.LLJJ, 0);
        return layerDrawable2;
    }

    public final long LJJIJ(long j) {
        VideoEditViewModel videoEditViewModel = this.LLJJIJIL;
        long jLIZLLL = 0;
        if (videoEditViewModel != null && videoEditViewModel.zQ2() != null && !this.LLJJIJIL.zQ2().isEmpty()) {
            for (VideoSegment videoSegment : this.LLJJIJIL.zQ2()) {
                if (!videoSegment.isDeleted) {
                    float fLIZLLL = (videoSegment.LIZLLL() - videoSegment.LJII()) / videoSegment.LJI();
                    float f = j;
                    if (f < fLIZLLL) {
                        return (long) (jLIZLLL + (f * videoSegment.LJI()));
                    }
                    jLIZLLL += videoSegment.LIZLLL() - videoSegment.LJII();
                    j = (long) (f - fLIZLLL);
                }
            }
        }
        return jLIZLLL;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setCurrentRotate(int i) {
        C19763212Uc c19763212Uc;
        int i2 = this.LLJLILLLLZIIL;
        if ((i2 == 2 || i2 == 0) && (c19763212Uc = this.LLJLLIL) != null) {
            c19763212Uc.LIZJ = i;
        }
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setDefaultMode(boolean z) {
        this.LLLLII = Boolean.valueOf(z);
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setEditViewHeight(boolean z) {
        super.setEditViewHeight(z);
        if (this.LLLLII.booleanValue()) {
            LJJIJLIJ();
        } else {
            LJJIJIL();
        }
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setExtractFramesInRoughMode(boolean z) {
        this.LLLJ = z;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setLoadThumbnailDirectly(boolean z) {
        this.LLJLLL = z;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setMaxVideoLength(long j) {
        this.LLJJIII = j;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setMinVideoLength(long j) {
        this.LLJJI = j;
    }

    @Override // X.C12XH, X.AbstractC19763912Uj
    public void setMultiEditEnableForStickPointMode(boolean z) {
        this.LLLLLILLIL = z;
    }

    public C12XI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIJIIJI(C12XI c12xi, C0WIY c0wiy) {
        long jLIZLLL;
        VideoEditViewModel videoEditViewModel = c12xi.LLJJIJIL;
        if (videoEditViewModel != null) {
            c12xi.LLJLILLLLZIIL = 2;
            videoEditViewModel.JQ2(2);
            c12xi.LLJLL = ((Integer) c0wiy.LIZIZ).intValue();
            int i = C12VL.LIZIZ;
            c12xi.LLJJI = 500L;
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(c12xi.LLJJIJIL.zQ2(), c12xi.LLJLL);
            C19763212Uc c19763212Uc = c12xi.LLJLLIL;
            if (c19763212Uc == null) {
                c12xi.LLJLLIL = new C19763212Uc(videoSegment);
            } else {
                c19763212Uc.LIZ(videoSegment);
            }
            c12xi.LLLILZLLLI = c12xi.LLLIL;
            c12xi.LLLIZZ = c12xi.LLLILZ;
            c12xi.LLLIILIL = (long) (videoSegment.duration / videoSegment.LJI());
            c12xi.setEditViewHeight(true);
            if (c12xi.LLLLII.booleanValue()) {
                c12xi.LLLL = videoSegment.LIZLLL() - videoSegment.LJII();
                long jLIZLLL2 = videoSegment.LIZLLL() - videoSegment.LJII();
                c12xi.LLLILZJ = jLIZLLL2;
                if (jLIZLLL2 < 1000) {
                    c12xi.LLLILZJ = 1000L;
                }
                c12xi.LLJ.setStartX(c12xi.LLLIIL);
                c12xi.LLIZLLLIL.setStartX((c12xi.LLJILLL - c12xi.LLLIIL) - C12VL.LIZLLL);
                c12xi.LJJI((int) c12xi.LLJ.getStartX(), (int) c12xi.LLIZLLLIL.getStartX());
                C12XJ c12xj = c12xi.LLJJJJJIL;
                c12xj.LIZIZ = c12xi.LLLILZJ;
                c12xj.LIZLLL(videoSegment.LJI(), videoSegment.duration);
                long jLJII = (long) (videoSegment.LJII() / videoSegment.LJI());
                c12xi.LLLIL = jLJII;
                c12xi.LLLILZ = jLJII + c12xi.LLLILZJ;
            } else {
                int i2 = c12xi.LLJLL;
                VideoEditViewModel videoEditViewModel2 = c12xi.LLJJIJIL;
                if (videoEditViewModel2 == null) {
                    jLIZLLL = -1;
                } else {
                    VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(videoEditViewModel2.zQ2(), i2);
                    jLIZLLL = (long) ((videoSegment2.LIZLLL() - videoSegment2.LJII()) / videoSegment2.LJI());
                    Map<String, Boolean> singleEditFirstMap = c12xi.getSingleEditFirstMap();
                    String strLJFF = videoSegment2.LJFF(false);
                    strLJFF.toString();
                    Boolean bool = singleEditFirstMap.get(strLJFF);
                    if (bool == null || !bool.booleanValue()) {
                        jLIZLLL = Math.min(jLIZLLL, C536240L1i.LIZ());
                    }
                }
                long jLJIIJJI = c12xi.LJIIJJI(jLIZLLL, false);
                c12xi.LLLILZJ = jLJIIJJI;
                C12XJ c12xj2 = c12xi.LLJJJJJIL;
                c12xj2.LIZIZ = jLJIIJJI;
                c12xj2.LIZLLL(videoSegment.LJI(), videoSegment.duration);
                long jLJII2 = (long) (videoSegment.LJII() / videoSegment.LJI());
                c12xi.LLLIL = jLJII2;
                c12xi.LLLILZ = jLJII2 + c12xi.LLLILZJ;
            }
            c12xi.LJ();
            C786410Ut5.D0(c12xi.LLJIJIL, 8);
            C786410Ut5.D0(c12xi.LLJILJIL, 0);
            c12xi.LLJILJIL.scrollToPosition(0);
            C536320L1q c536320L1q = c12xi.LLJJL;
            float f = c12xi.LLJJJJJIL.LIZ;
            ((ArrayList) c536320L1q.LLILZLL).clear();
            ((ArrayList) c536320L1q.LLILZLL).add(videoSegment);
            c536320L1q.LLLFZ(f, 0.0f);
            c12xi.LJJIIJ();
            c12xi.LLJJIJIL.LLJJI.setValue(c0wiy);
        }
    }

    @Override // X.InterfaceC19767412Vs
    public final void LIZLLL(C0WIY<Float, Float> c0wiy, List<VideoSegment> list) {
        long jLongValue;
        Float f;
        Float f2;
        VideoEditViewModel videoEditViewModel;
        if (list != null && (videoEditViewModel = this.LLJJIJIL) != null) {
            videoEditViewModel.IQ2(list);
        }
        if (!this.LLLLII.booleanValue()) {
            long jLongValue2 = 0;
            if (c0wiy != null && (f2 = c0wiy.LIZ) != null) {
                jLongValue = f2.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLLLLIL = jLongValue;
            if (c0wiy != null && (f = c0wiy.LIZIZ) != null) {
                jLongValue2 = f.longValue();
            }
            this.LLLLL = jLongValue2;
        }
        LIZIZ();
    }

    public final void LJJIJIIJIL(VideoSegment videoSegment, boolean z) {
        if (!this.LLLLII.booleanValue() && this.LLJLILLLLZIIL == 2) {
            if (z) {
                Map<String, Boolean> singleEditFirstMap = getSingleEditFirstMap();
                String strLJFF = videoSegment.LJFF(false);
                strLJFF.toString();
                singleEditFirstMap.put(strLJFF, Boolean.TRUE);
                return;
            }
            Map<String, Boolean> singleEditFirstMap2 = getSingleEditFirstMap();
            String strLJFF2 = videoSegment.LJFF(false);
            strLJFF2.toString();
            singleEditFirstMap2.remove(strLJFF2);
        }
    }

    public final void LJJIJL(float f, int i) {
        C19763212Uc c19763212Uc = this.LLJLLIL;
        if (c19763212Uc == null) {
            return;
        }
        float f2 = c19763212Uc.LIZLLL;
        c19763212Uc.LIZLLL = f;
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLJJIJIL.zQ2(), i);
        this.LLLIILIL = (long) (videoSegment.duration / f);
        long jLJIIJJI = LJIIJJI(Math.max((long) ((this.LLLILZJ * f2) / f), this.LLJJI), false);
        this.LLLILZJ = jLJIIJJI;
        C12XJ c12xj = this.LLJJJJJIL;
        c12xj.LIZIZ = jLJIIJJI;
        c12xj.LIZLLL(this.LLJLLIL.LIZLLL, videoSegment.duration);
        this.LLJJL.LLLFZ(this.LLJJJJJIL.LIZ, f);
        LJJII();
        long j = (long) (this.LLJLLIL.LIZ / f);
        this.LLLIL = j;
        this.LLLILZ = j + this.LLLILZJ;
    }

    public C12XI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
