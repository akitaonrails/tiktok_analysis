package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370190EfJ extends FrameLayout {
    public static final /* synthetic */ int LLJJ = 0;
    public C370060Ef6 LL;
    public final C01GW LLILLJJLI;
    public C0E48 LLILLL;
    public final float LLILZ;
    public final int LLILZIL;
    public final float LLILZLL;
    public C368910EdF LLIZ;
    public C376330EpD LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public InterfaceC370200EfK LLJIJIL;
    public InterfaceC370210EfL LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;

    public final void LJII() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 9));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 7));
        valueAnimatorOfFloat.start();
    }

    private final float getMaxSelectFrameWidthOnScreen() {
        return this.LLJI - (2 * this.LLILZ);
    }

    public final void LIZLLL() {
        C368910EdF c368910EdF = this.LLIZ;
        if (c368910EdF != null) {
            int scrollX = c368910EdF.getScrollX();
            int rootLeftPadding = c368910EdF.getRootLeftPadding();
            int maxSelectFrameWidthOnScreen = (int) getMaxSelectFrameWidthOnScreen();
            Rect rect = new Rect();
            int iMax = Math.max(scrollX - rootLeftPadding, 0);
            rect.set(iMax, 0, scrollX < rootLeftPadding ? (maxSelectFrameWidthOnScreen - rootLeftPadding) + scrollX : maxSelectFrameWidthOnScreen + iMax, this.LLILZIL);
            c368910EdF.setPreInitRect(rect);
            C368250EcB c368250EcB = c368910EdF.LLILLL;
            if (c368250EcB != null) {
                c368250EcB.invalidate();
            }
        }
    }

    public final boolean LJ() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final long getVideoSelectFrameEndTime() {
        return getVideoSelectFrameStartTime() + C814420VxA.LIZJ((getVideoSelectFrameFromXml().getSelectFrameRect().width() / (this.LLIZ != null ? r0.getVideoFrameScale() : this.LLILZLL)) * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final C370060Ef6 getVideoSelectFrameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_select_frame);
            this.LL = (C370060Ef6) callbackFindViewById;
        }
        return (C370060Ef6) callbackFindViewById;
    }

    public final long getVideoSelectFrameStartTime() {
        NLETrack nLETrackRn;
        C368910EdF c368910EdF = this.LLIZ;
        int scrollX = c368910EdF != null ? c368910EdF.getScrollX() : 0;
        C368910EdF c368910EdF2 = this.LLIZ;
        float videoFrameScale = c368910EdF2 != null ? c368910EdF2.getVideoFrameScale() : this.LLILZLL;
        C0E48 c0e48 = this.LLILLL;
        float maxEnd = (((c0e48 == null || (nLETrackRn = c0e48.Rn()) == null) ? 0L : nLETrackRn.getMaxEnd()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * videoFrameScale;
        float f = scrollX;
        return C814420VxA.LIZJ(((LJ() ? (maxEnd - f) - getVideoSelectFrameRight() : f + getVideoSelectFrameLeft()) / videoFrameScale) * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final void LIZ() {
        float videoSelectFrameLeft = (-getVideoSelectFrameRight()) - this.LLILZ;
        C376330EpD c376330EpD = this.LLIZLLLIL;
        if (c376330EpD != null) {
            if (!LJ()) {
                videoSelectFrameLeft = getVideoSelectFrameLeft() + this.LLILZ;
            }
            C786410Ut5.Xc(c376330EpD, videoSelectFrameLeft);
        }
    }

    public final float getVideoSelectFrameLeft() {
        RectF selectFrameRect;
        C370060Ef6 videoSelectFrameFromXml = getVideoSelectFrameFromXml();
        if (videoSelectFrameFromXml == null || (selectFrameRect = videoSelectFrameFromXml.getSelectFrameRect()) == null) {
            return 0.0f;
        }
        return selectFrameRect.left - this.LLILZ;
    }

    public final float getVideoSelectFrameRight() {
        RectF selectFrameRect;
        C370060Ef6 videoSelectFrameFromXml = getVideoSelectFrameFromXml();
        if (videoSelectFrameFromXml == null || (selectFrameRect = videoSelectFrameFromXml.getSelectFrameRect()) == null) {
            return 0.0f;
        }
        return selectFrameRect.right - this.LLILZ;
    }

    public final C376330EpD getCursor$tools_camera_edit_release() {
        return this.LLIZLLLIL;
    }

    public final C0E48 getEditorContext() {
        return this.LLILLL;
    }

    public final long getLastSeekTimeMs() {
        return this.LLJILLL;
    }

    public final long getLastSeekTimeStamp() {
        return this.LLJILJILJ;
    }

    public final InterfaceC370200EfK getVideoCursorTouchListener() {
        return this.LLJIJIL;
    }

    public final C368910EdF getVideoFrameTrack$tools_camera_edit_release() {
        return this.LLIZ;
    }

    public final InterfaceC370210EfL getVideoSelectFrameMoveListener() {
        return this.LLJILJIL;
    }

    public static void LJIIIIZZ(C370190EfJ c370190EfJ) {
        if (c370190EfJ.getVideoSelectFrameFromXml().getVisibility() != 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(c370190EfJ, 36));
            valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(c370190EfJ, 31));
            valueAnimatorOfFloat.start();
        }
    }

    public final void LIZIZ(boolean z) {
        if (!z) {
            C370060Ef6 videoSelectFrameFromXml = getVideoSelectFrameFromXml();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(videoSelectFrameFromXml);
            videoSelectFrameFromXml.setAlpha(0.0f);
            C786410Ut5.y1(getVideoSelectFrameFromXml(), 4);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 8));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 6));
        valueAnimatorOfFloat.start();
    }

    public final void LJFF(float f) {
        if (getVideoSelectFrameLeft() < 0.0f) {
            getVideoSelectFrameFromXml().getSelectFrameRect().left = this.LLILZ;
            getVideoSelectFrameFromXml().getSelectFrameRect().right = this.LLILZ + f;
            return;
        }
        if (getVideoSelectFrameRight() <= getMaxSelectFrameWidthOnScreen()) {
            return;
        }
        getVideoSelectFrameFromXml().getSelectFrameRect().right = getMaxSelectFrameWidthOnScreen() + this.LLILZ;
        getVideoSelectFrameFromXml().getSelectFrameRect().left = (getMaxSelectFrameWidthOnScreen() + this.LLILZ) - f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[PHI: r1
      0x0010: PHI (r1v1 float) = (r1v0 float), (r1v9 float) binds: [B:6:0x0008, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(float r5) {
        /*
            r4 = this;
            boolean r0 = r4.LLJ
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L10
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L11
        L10:
            r5 = r1
        L11:
            X.0Ef6 r0 = r4.getVideoSelectFrameFromXml()
            android.graphics.RectF r0 = r0.getSelectFrameRect()
            float r3 = r0.width()
            float r3 = r3 * r5
            float r0 = r4.getVideoSelectFrameRight()
            float r1 = -r0
            float r1 = r1 - r3
            float r0 = r4.LLILZ
            float r1 = r1 - r0
            X.0EpD r2 = r4.LLIZLLLIL
            if (r2 == 0) goto L3c
            boolean r0 = r4.LJ()
            if (r0 != 0) goto L39
            float r1 = r4.getVideoSelectFrameLeft()
            float r0 = r4.LLILZ
            float r1 = r1 + r0
            float r1 = r1 + r3
        L39:
            X.C786410Ut5.Xc(r2, r1)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370190EfJ.LJI(float):void");
    }

    public final void setCursor$tools_camera_edit_release(C376330EpD c376330EpD) {
        this.LLIZLLLIL = c376330EpD;
    }

    public final void setEditorContext(C0E48 c0e48) {
        this.LLILLL = c0e48;
    }

    public final void setLastSeekTimeMs(long j) {
        this.LLJILLL = j;
    }

    public final void setLastSeekTimeStamp(long j) {
        this.LLJILJILJ = j;
    }

    public final void setVideoCursorTouchListener(InterfaceC370200EfK interfaceC370200EfK) {
        this.LLJIJIL = interfaceC370200EfK;
    }

    public final void setVideoFrameTrack$tools_camera_edit_release(C368910EdF c368910EdF) {
        this.LLIZ = c368910EdF;
    }

    public final void setVideoSelectFrameFromXml(C370060Ef6 c370060Ef6) {
        this.LL = c370060Ef6;
    }

    public final void setVideoSelectFrameMoveListener(InterfaceC370210EfL interfaceC370210EfL) {
        this.LLJILJIL = interfaceC370210EfL;
    }

    public C370190EfJ(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet, 0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1531));
        this.LLILZ = C0FU0.LIZ(42.0f);
        this.LLILZIL = C0FU0.LIZ(34.0f);
        this.LLILZLL = C0FU0.LIZ(34.0f) / 1000.0f;
        this.LLJ = true;
        this.LLJI = C0FU0.LIZJ(C0EHL.LIZ());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiItemRangeView, 0, 0);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.MultiItemRangeView_marginLeftAndRight, C0FU0.LIZ(42.0f));
            this.LLILZ = dimension;
            typedArrayObtainStyledAttributes.recycle();
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c1h, this, true);
            if ((viewTd instanceof ViewGroup) && viewTd != null) {
                C368910EdF c368910EdF = (C368910EdF) viewTd.findViewById(R.id.video_frame_track);
                this.LLIZ = c368910EdF;
                ViewGroup.LayoutParams layoutParams = c368910EdF != null ? c368910EdF.getLayoutParams() : null;
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int i = (int) dimension;
                    marginLayoutParams.setMarginStart(i);
                    marginLayoutParams.setMarginEnd(i);
                    C368910EdF c368910EdF2 = this.LLIZ;
                    if (c368910EdF2 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368910EdF2);
                        c368910EdF2.setLayoutParams(marginLayoutParams);
                    }
                }
                this.LLIZLLLIL = (C376330EpD) viewTd.findViewById(R.id.video_frame_cursor);
            }
            C376330EpD c376330EpD = this.LLIZLLLIL;
            if (c376330EpD != null) {
                c376330EpD.setOnMoveListener(new AwS441S0200000_5(c376330EpD, this, 8));
                c376330EpD.setOnMoveDownListener(new AwS584S0100000_5(this, 684));
                c376330EpD.setOnMoveUpListener(new AwS584S0100000_5(this, 685));
            }
            getVideoSelectFrameFromXml().setOnMoveDownListener(new AwS584S0100000_5(this, 686));
            getVideoSelectFrameFromXml().setOnMoveListener(new AwS619S0100000_5(this, 25));
            getVideoSelectFrameFromXml().setOnMoveUpListener(new AwS584S0100000_5(this, 687));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void LIZJ(long j, long j2) {
        long maxEnd;
        float f;
        float f2;
        NLETrack nLETrackRn;
        C368910EdF c368910EdF = this.LLIZ;
        if (c368910EdF != null) {
            int scrollX = c368910EdF.getScrollX();
            C0E48 c0e48 = this.LLILLL;
            if (c0e48 != null && (nLETrackRn = c0e48.Rn()) != null) {
                maxEnd = nLETrackRn.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            float videoFrameScale = (maxEnd / j3) * c368910EdF.getVideoFrameScale();
            float videoFrameScale2 = (j2 / j3) * c368910EdF.getVideoFrameScale();
            float videoFrameScale3 = (j / j3) * c368910EdF.getVideoFrameScale();
            if (LJ()) {
                f = ((videoFrameScale - videoFrameScale3) - scrollX) + this.LLILZ;
            } else {
                f = (videoFrameScale3 - scrollX) + this.LLILZ;
            }
            C370060Ef6 videoSelectFrameFromXml = getVideoSelectFrameFromXml();
            RectF selectFrameRect = videoSelectFrameFromXml.getSelectFrameRect();
            if (LJ()) {
                f2 = f - videoFrameScale2;
            } else {
                f2 = f;
            }
            selectFrameRect.left = f2;
            RectF selectFrameRect2 = videoSelectFrameFromXml.getSelectFrameRect();
            if (!LJ()) {
                f += videoFrameScale2;
            }
            selectFrameRect2.right = f;
            videoSelectFrameFromXml.setScale(c368910EdF.getVideoFrameScale());
            videoSelectFrameFromXml.invalidate();
        }
    }
}
