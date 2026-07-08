package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12UX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UX extends C12UW {
    public final float LLLLZLL;
    public Function0<Boolean> LLLLZLLIL;
    public Function0<Boolean> LLLLZLLLI;

    @Override // X.C12UW, X.InterfaceC19767412Vs
    public final void LIZIZ() {
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        this.LLLFF.LLLIILIL(this.LLJLL.LIZIZ);
    }

    @Override // X.C12UW
    public final void LJIJI() {
        float startX;
        float startX2;
        if (this.LLJJIJIIJIL == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLJZ.findViewHolderForAdapterPosition(this.LLLFFI.getItemCount() - 1);
        if (this.LLLIILIL == 1) {
            viewHolderFindViewHolderForAdapterPosition = this.LLJLLL.findViewHolderForAdapterPosition(this.LLLFF.getItemCount() - 1);
        }
        if ((viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null) == null) {
            startX = ((this.LLILLJJLI - this.LLJI.getStartX()) - C12UY.LIZJ) + (this.LLJLIL ? this.LLLLZLL : 0.0f);
            if (this.LLJLL.LIZLLL <= getMaxVideoLength()) {
                startX -= this.LLLLLLZZ;
            }
            startX2 = 0.0f;
        } else {
            int[] iArr = {width, 0};
            viewHolderFindViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
            int width = iArr[0] + viewHolderFindViewHolderForAdapterPosition.itemView.getWidth();
            float startX3 = width - this.LLJI.getStartX();
            int i = C12UY.LIZJ;
            startX = startX3 - i;
            if (startX < 0.0f) {
                startX = 0.0f;
            }
            startX2 = (((this.LLILLJJLI - this.LLJI.getStartX()) - startX) - i) + (this.LLJLIL ? this.LLLLZLL : 0.0f);
        }
        int i2 = (int) startX;
        if (!(startX == 0.0f)) {
            i2 += 20;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.LLLLLJLJLL);
        layoutParams.topMargin = this.LLLLLLLLL;
        layoutParams.gravity = 5;
        int i3 = (int) startX2;
        layoutParams.rightMargin = i3;
        layoutParams.setMarginEnd(i3);
        layoutParams.gravity = 8388613;
        C786410Ut5.W5(this.LLJJIJIIJIL, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[PHI: r1
      0x0065: PHI (r1v6 float) = (r1v5 float), (r1v13 float) binds: [B:27:0x0060, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C12UW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            r6 = this;
            android.view.View r0 = r6.LLJJIJI
            if (r0 != 0) goto L5
            return
        L5:
            X.0Uu4 r0 = r6.LLJZ
            r3 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.findViewHolderForAdapterPosition(r3)
            int r1 = r6.LLLIILIL
            r0 = 1
            if (r1 != r0) goto L17
            X.0Uu4 r0 = r6.LLJLLL
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.findViewHolderForAdapterPosition(r3)
        L17:
            if (r4 == 0) goto L80
            android.view.View r0 = r4.itemView
        L1b:
            r5 = 0
            if (r0 != 0) goto L4c
            X.0H4x r0 = r6.LLJIJIL
            float r1 = r0.getStartX()
            boolean r0 = r6.LLJLIL
            if (r0 == 0) goto L65
            float r0 = r6.LLLLZLL
        L2a:
            float r1 = r1 + r0
            r4 = 0
        L2c:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L33
            r3 = 1
        L33:
            int r1 = (int) r1
            if (r3 != 0) goto L38
            int r1 = r1 + 20
        L38:
            int r0 = r6.LLLLLJLJLL
            r2.<init>(r1, r0)
            int r0 = r6.LLLLLLLLL
            r2.topMargin = r0
            r2.leftMargin = r4
            r2.setMarginStart(r4)
            android.view.View r0 = r6.LLJJIJI
            X.C786410Ut5.W5(r0, r2)
            return
        L4c:
            r0 = 2
            int[] r2 = new int[r0]
            android.view.View r0 = r4.itemView
            r0.getLocationOnScreen(r2)
            r0 = r2[r3]
            if (r0 >= 0) goto L67
            X.0H4x r0 = r6.LLJIJIL
            float r1 = r0.getStartX()
            boolean r0 = r6.LLJLIL
            if (r0 == 0) goto L65
            float r0 = r6.LLLLZLL
            goto L2a
        L65:
            r0 = 0
            goto L2a
        L67:
            X.0H4x r0 = r6.LLJIJIL
            float r1 = r0.getStartX()
            r4 = r2[r3]
            float r0 = (float) r4
            float r1 = r1 - r0
            boolean r0 = r6.LLJLIL
            if (r0 == 0) goto L7e
            float r0 = r6.LLLLZLL
        L77:
            float r1 = r1 + r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r1 = 0
            goto L2c
        L7e:
            r0 = 0
            goto L77
        L80:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12UX.LJIL():void");
    }

    @Override // X.C12UW
    public final void LJJIIJ() {
        this.LLIZLLLIL.GQ2(this.LLLIZZ, this.LLLIL);
        C12UV c12uv = this.LLJLL;
        c12uv.LIZ.put(((VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), this.LLLIL)).LJFF(true), Float.valueOf(this.LLLIZZ.LIZLLL));
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLIZLLLIL.zQ2(), this.LLLIL);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJ;
        cutMultiVideoViewModel.LLILLJJLI.put(videoSegment.LJFF(true), 1);
        if (!this.LLJLIL) {
            this.LLIZLLLIL.HQ2(this.LLLIL, getOverXScroll());
            return;
        }
        VideoEditViewModel videoEditViewModel = this.LLIZLLLIL;
        int i = this.LLLIL;
        int overXScroll = getOverXScroll();
        videoEditViewModel.LLJJL.put(((VideoSegment) ListProtector.get(videoEditViewModel.LLJJJJJIL.getValue().getVideoSegmentList(), i)).LJFF(true), Integer.valueOf(overXScroll));
    }

    @Override // X.C12UW
    public final void LJJIIZI() {
        Function0<Boolean> function0 = this.LLLLZLLLI;
        if (function0 == null || function0.invoke().booleanValue()) {
            super.LJJIIZI();
        }
    }

    @Override // X.C12UW, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getLeftSeekingValue() {
        return (long) ((this.LLLIIII + C12UY.LIZJ) * this.LLJLL.LJ);
    }

    @Override // X.C12UW
    public C0WIY<Long, Long> getMultiVideoPlayBoundary() {
        float f = this.LLLIIII;
        int i = C12UY.LIZJ;
        float f2 = this.LLJLL.LJ;
        return new C0WIY<>(Long.valueOf(LJJJJ(this.LLIZLLLIL.CQ2(), (long) ((i + f) * f2))), Long.valueOf(LJJJJ(this.LLIZLLLIL.CQ2(), (long) ((f + i + this.LLLIIIIL) * f2))));
    }

    @Override // X.C12UW, X.AbstractC19763912Uj
    public long getPlayingPosition() {
        return (long) (((this.LLLIIII + this.LLJJJ.getStartX()) - this.LLJIJIL.getStartX()) * this.LLJLL.LJ);
    }

    @Override // X.C12UW, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getRightSeekingValue() {
        return (long) (((this.LLLIIII + this.LLJI.getStartX()) - this.LLJIJIL.getStartX()) * this.LLJLL.LJ);
    }

    @Override // X.C12UW
    public final void LJIIJ() {
        super.LJIIJ();
        this.LLJ.LLILZ.observe(this.LLIZ, new AObserverS231S0100000_29(this, 72));
    }

    @Override // X.C12UW
    public final void LJJIIJZLJL() {
        super.LJJIIJZLJL();
        if (this.LLLILZJ || !this.LLJLIL) {
            return;
        }
        C435250H4x c435250H4x = this.LLJIJIL;
        if (c435250H4x != null) {
            c435250H4x.setImageDrawable(LJJJIL(true));
        }
        C435250H4x c435250H4x2 = this.LLJI;
        if (c435250H4x2 != null) {
            c435250H4x2.setImageDrawable(LJJJIL(false));
        }
    }

    @Override // X.C12UW
    public final void LJJIJIL() {
        super.LJJIJIL();
        HandlerHook.viewPost(this, new ARunnableS129S0100000_29(this, 243));
    }

    @Override // X.C12UW
    public final void LJJIJL() {
        super.LJJIJL();
        HandlerHook.viewPost(this, new ARunnableS129S0100000_29(this, 243));
    }

    @Override // X.C12UW, X.AbstractC19763912Uj
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.C12UW, X.AbstractC19763912Uj, X.InterfaceC19767412Vs
    public long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    @Override // X.C12UW, X.AbstractC19763912Uj
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.C12UW, X.InterfaceC19767412Vs
    public final boolean LJFF() {
        return this.LLJLIL;
    }

    public final Function0<Boolean> getOnSelectMaxTime() {
        return this.LLLLZLLIL;
    }

    public final Function0<Boolean> getOnSelectMinTime() {
        return this.LLLLZLLLI;
    }

    @Override // X.C12UW, X.InterfaceC19767412Vs
    public final void LIZ(List<? extends VideoSegment> list) {
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
        for (VideoSegment videoSegment : list) {
            this.LLJLL.LIZ.put(videoSegment.LJFF(true), Float.valueOf(videoSegment.LJI()));
        }
        this.LLIZLLLIL.vQ2(list);
        this.LLJLL.LIZIZ(this.LLIZLLLIL.zQ2(), this.LLIZLLLIL.CQ2());
        LJIJJLI(0, this.LLLLLLZZ, (this.LLILLJJLI - r0) - C12UY.LIZJ, true);
        C786410Ut5.C0(this.LLJZ, 8);
        this.LLLFFI.LLLIIIIL();
        C786410Ut5.C0(this.LLJLLL, 0);
        this.LLJLLL.scrollToPosition(0);
        C12UP c12up = this.LLLFF;
        HashMap<String, Float> map = this.LLJLL.LIZIZ;
        ((ArrayList) c12up.LLILZLL).addAll(list);
        c12up.LLLIILIL(map);
    }

    @Override // X.C12UW, X.InterfaceC19767412Vs
    public final void LJIIIZ(boolean z) {
        this.LLJLIL = z;
        LJJIIJZLJL();
        if (z) {
            this.LLJIJIL.setOnTouchListener(null);
            this.LLJI.setOnTouchListener(null);
            this.LLJJJ.setOnTouchListener(null);
            this.LLJJJJ = false;
            C786410Ut5.C0(this.LLJLLL, 8);
            return;
        }
        this.LLJIJIL.setOnTouchListener(this);
        this.LLJIJIL.setTag("startSlide");
        this.LLJI.setOnTouchListener(this);
        this.LLJI.setTag("endSlide");
        this.LLJJJ.setOnTouchListener(this);
        this.LLJJJJ = true;
        C786410Ut5.C0(this.LLJLLL, 0);
        HandlerHook.viewPost(this, new ARunnableS129S0100000_29(this, 243));
    }

    @Override // X.C12UW
    public final boolean LJIILL(String str) {
        if (this.LLJLIL) {
            return true;
        }
        return super.LJIILL(str);
    }

    @Override // X.C12UW
    public final void LJJIJLIJ(VideoSegment videoSegment) {
        super.LJJIJLIJ(videoSegment);
        HandlerHook.viewPost(this, new ARunnableS129S0100000_29(this, 243));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    @Override // X.C12UW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(X.C0WIY<java.lang.Integer, java.lang.Integer> r12) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12UX.LJJIL(X.0WIY):void");
    }

    public final Drawable LJJJIL(boolean z) {
        int iLIZ = C960203pA.LIZ(R.attr.a04, this.LLILZLL);
        int color = ColorProtector.parseColor("#FFFFFF");
        float fLIZ = C0JAI.LIZ(2.0f, this.LLILZLL);
        int i = 1;
        if (C1388580mEq.LIZIZ(this.LLILZLL)) {
            if (!z) {
                z = true;
            } else {
                z = false;
            }
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = fLIZ;
            fArr[1] = fLIZ;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fLIZ;
            fArr[7] = fLIZ;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = fLIZ;
            fArr[3] = fLIZ;
            fArr[4] = fLIZ;
            fArr[5] = fLIZ;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        Drawable drawableLIZLLL = C426580Go4.LIZLLL(iLIZ, iLIZ, fArr);
        if (this.LLJLIL) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawableLIZLLL});
            if (z) {
                layerDrawable.setLayerInset(0, (int) this.LLLLZLL, 0, 0, 0);
                return layerDrawable;
            }
            layerDrawable.setLayerInset(0, 0, 0, (int) this.LLLLZLL, 0);
            return layerDrawable;
        }
        Drawable[] drawableArr = new Drawable[4];
        int i2 = 0;
        loop0: while (true) {
            Drawable drawableLIZJ = drawableLIZLLL;
            while (true) {
                drawableArr[i2] = drawableLIZJ;
                i2++;
                if (i2 >= 4) {
                    break loop0;
                }
                if (i2 != 0) {
                    drawableLIZJ = C426580Go4.LIZJ(color, color, 0, 0);
                }
            }
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        int i3 = (int) (this.LLLLLLJ / 3.0f);
        while (true) {
            float f = C12UY.LIZJ / 3.0f;
            float f2 = i * 2.0f;
            float f3 = 3 * 2.0f;
            float f4 = f3 - 1.0f;
            layerDrawable2.setLayerInset(i, (int) ((((f2 - 2.0f) / f4) + 1.0f) * f), i3, (int) (f * (((f3 - f2) / f4) + 1.0f)), i3);
            if (i != 3) {
                i++;
            } else {
                return layerDrawable2;
            }
        }
    }

    public final void setOnSelectMaxTime(Function0<Boolean> function0) {
        this.LLLLZLLIL = function0;
    }

    public final void setOnSelectMinTime(Function0<Boolean> function0) {
        this.LLLLZLLLI = function0;
    }

    public C12UX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLLLZLL = C0JAI.LIZ(6.0f, context);
        setLoadThumbnailDirectly(true);
    }

    @Override // X.C12UW
    public final void LJJIJIIJIL(int i, VideoSegment videoSegment) {
        if (!this.LLJLIL) {
            setEditViewHeight(false);
            C786410Ut5.C0(this.LLJLLL, 0);
        }
        C786410Ut5.C0(this.LLJZ, 8);
        this.LLLFFI.LLLIIIIL();
        if (i != 1) {
            if (i != 2) {
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
                return;
            }
            this.LLJLLL.scrollToPosition(0);
            this.LLLFF.LLLIILIL(this.LLJLL.LIZIZ);
            this.LLIZLLLIL.LLJJIJI.setValue(null);
            return;
        }
        this.LLIZLLLIL.LLJJIII.setValue(null);
    }

    public final long LJJJJ(float f, long j) {
        if (this.LLIZLLLIL.zQ2() != null && !this.LLIZLLLIL.zQ2().isEmpty()) {
            long jLIZLLL = 0;
            for (VideoSegment videoSegment : this.LLIZLLLIL.zQ2()) {
                if (!videoSegment.isDeleted) {
                    float fLIZLLL = (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * f);
                    float f2 = j;
                    if (f2 <= fLIZLLL) {
                        return (long) ((jLIZLLL + (f2 * videoSegment.LJI())) * f);
                    }
                    jLIZLLL += videoSegment.LIZLLL() - videoSegment.LJII();
                    j = (long) (f2 - fLIZLLL);
                }
            }
        }
        return 0L;
    }

    @Override // X.C12UW, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.LLJLIL) {
            setEnabled(true);
        }
        return super.onTouch(view, motionEvent);
    }
}
