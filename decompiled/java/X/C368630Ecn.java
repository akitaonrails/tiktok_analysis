package X;

import Y.ACListenerS140S0100000_5;
import Y.ALAdapterS2S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS283S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0Ecn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368630Ecn extends AbstractC368670Ecr {
    public static final int LLLLJI = C0FU0.LIZ(2.0f);
    public C368630Ecn LLJ;
    public final Paint LLJI;
    public InterfaceC368840Ed8 LLJIJIL;
    public InterfaceC368620Ecm LLJILJIL;
    public InterfaceC367590Eb7 LLJILJILJ;
    public C0E8D LLJILLL;
    public final C368790Ed3 LLJJ;
    public final C368800Ed4 LLJJI;
    public final C01GW LLJJIII;
    public final View LLJJIJI;
    public final View LLJJIJIIJIL;
    public final View LLJJIJIL;
    public final View LLJJJ;
    public NLEModel LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final Map<NLETrackSlot, C369110EdZ> LLLI;
    public long LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public boolean LLLIIIL;
    public TrackShowType LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public Animator LLLIZZ;
    public AbstractC367990Ebl LLLJ;
    public AbstractC368710Ecv LLLJIL;
    public Function1<? super View, Unit> LLLJL;
    public Function1<? super View, Unit> LLLL;
    public Function1<? super View, Unit> LLLLII;
    public Function2<? super NLETrackSlot, ? super View, Boolean> LLLLIIIILLL;
    public InterfaceC369050EdT LLLLIIL;
    public View.OnClickListener LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;

    @Override // X.AbstractC368670Ecr
    public final void LIZ() {
    }

    private final boolean LJIIIZ() {
        return ((Boolean) this.LLLLJ.getValue()).booleanValue();
    }

    private final int getDesireHeight() {
        int size;
        boolean z = getVisibility() == 0;
        boolean z2 = this.LLJJI.getVisibility() == 0;
        if (z || z2) {
            ArrayList arrayListLJ = C1697810uHb.LJ(Boolean.valueOf(z), Boolean.valueOf(z2));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListLJ) {
                if (((Boolean) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size() + this.LLJJJJ;
        } else {
            size = this.LLJJJJ;
        }
        if (this.LLJZIJLIL && size >= 1) {
            size += this.LLJZ;
        } else if (this.LLJLLL && size >= 2) {
            size += 2;
        }
        AbstractC367990Ebl abstractC367990Ebl = this.LLLJ;
        return abstractC367990Ebl != null ? abstractC367990Ebl.LJFF(size) : LJI(size);
    }

    private final InterfaceC369250Edn getHapticFeedback() {
        return (InterfaceC369250Edn) this.LLLLILI.getValue();
    }

    private final int getNullAudioTrackCanvasWidth() {
        return (int) Math.rint(this.LLLIIII * C360610EBv.LIZJ());
    }

    private final int getNullAudioTrackWidth() {
        int iRint = (int) Math.rint((this.LLLIIII - this.LLLIIIIL) * C360610EBv.LIZJ());
        if (iRint < 0) {
            return 0;
        }
        return iRint;
    }

    private final Pair<Integer, Integer> getNullTrackTopBottom() {
        Map<NLETrackSlot, C369110EdZ> map = this.LLLI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((C369110EdZ) it3.next()).LIZ));
        }
        Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList2);
        int iIntValue = ((num == null ? 0 : num.intValue() + 1) * (this.LLJJJJLIIL + this.LLJJL)) + getPaddingTop();
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(this.LLJJJJLIIL + iIntValue));
    }

    private final C368730Ecx getScrollHelper() {
        return (C368730Ecx) this.LLLILZ.getValue();
    }

    public final void LJII() {
        C786410Ut5.Jc(this.LLJJIJI, 0.0f);
        C786410Ut5.ed(this.LLJJIJI, 0.0f);
        C786410Ut5.LJLLLLLL(8, this.LLJJIJI);
    }

    public final void LJIIIIZZ() {
        C786410Ut5.Jc(this.LLJJIJIIJIL, 0.0f);
        C786410Ut5.ed(this.LLJJIJIIJIL, 0.0f);
        C786410Ut5.LJLLLLLL(8, this.LLJJIJIIJIL);
    }

    public final C367830EbV getAudioCollectionTrack() {
        return (C367830EbV) this.LLJJIII.getValue();
    }

    public final C368640Eco getClipHelper() {
        return (C368640Eco) this.LLLIL.getValue();
    }

    public final float getMainVideoLength$editor_trackpanel_release() {
        return this.LLLII * getTimelineScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC368670Ecr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getMaxScrollY() {
        /*
            r5 = this;
            boolean r0 = r5.LLLFFI
            r4 = 0
            if (r0 == 0) goto L9
            r2 = 2147483647(0x7fffffff, float:NaN)
        L8:
            return r2
        L9:
            boolean r0 = r5.LLLFF
            if (r0 == 0) goto L21
            int r2 = r5.getDesireHeight()
            int r0 = r5.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r5.getMeasuredHeight()
            int r2 = r2 - r0
            int r1 = r5.LLJJJJLIIL
        L1d:
            int r2 = r2 + r1
        L1e:
            if (r2 >= 0) goto L8
            return r4
        L21:
            boolean r0 = r5.LLLFZ
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L38
            int r0 = r5.LLJJJJLIIL
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r2 = (int) r1
            int r0 = X.C0FU0.LIZ(r3)
            int r2 = r2 + r0
            int r1 = r5.getDesireHeight()
            goto L1d
        L38:
            X.0Ed3 r0 = r5.LLJJ
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L70
            r1 = 1
        L41:
            X.0Ed4 r0 = r5.LLJJI
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L72
            if (r1 != 0) goto L72
            boolean r0 = r5.LLLILZLLLI
            if (r0 == 0) goto L72
            int r0 = r5.LLJJJJLIIL
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r2 = (int) r1
            int r0 = X.C0FU0.LIZ(r3)
            int r2 = r2 + r0
            int r1 = r5.getDesireHeight()
            int r0 = r5.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r5.getPaddingBottom()
            int r1 = r1 - r0
            int r0 = r5.getMeasuredHeight()
            int r1 = r1 - r0
            goto L1d
        L70:
            r1 = 0
            goto L41
        L72:
            int r2 = r5.getDesireHeight()
            int r0 = r5.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r5.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r5.getMeasuredHeight()
            int r2 = r2 - r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368630Ecn.getMaxScrollY():int");
    }

    public final C368630Ecn getSubTrackGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wdq);
            this.LLJ = (C368630Ecn) callbackFindViewById;
        }
        return (C368630Ecn) callbackFindViewById;
    }

    public final float getVideosLength$editor_trackpanel_release() {
        return 0 * getTimelineScale();
    }

    @Override // android.view.View
    public final void computeScroll() {
        C368730Ecx scrollHelper = getScrollHelper();
        if (scrollHelper.LJIIIIZZ.computeScrollOffset()) {
            C368630Ecn c368630Ecn = scrollHelper.LIZ;
            AbstractC368670Ecr.LIZJ(c368630Ecn, c368630Ecn.getScrollX(), scrollHelper.LJIIIIZZ.getCurrY(), false, false, false, false, 32);
            scrollHelper.LIZ.postInvalidateOnAnimation();
        }
    }

    public final C0E6E getSelectSegmentStyle() {
        return getClipHelper().LJJ;
    }

    public final AbstractC367990Ebl getAdapter$editor_trackpanel_release() {
        return this.LLLJ;
    }

    public final View.OnClickListener getBlankClickListener$editor_trackpanel_release() {
        return this.LLLLIILL;
    }

    public final boolean getCanMoveOutOfMainVideo$editor_trackpanel_release() {
        return this.LLJLIL;
    }

    public final boolean getCanMoveOutOfVideos$editor_trackpanel_release() {
        return this.LLJLILLLLZIIL;
    }

    public final long getClipMinDuration$editor_trackpanel_release() {
        return this.LLJJJJJIL;
    }

    public final NLEModel getCurNLEModelStage() {
        return this.LLJJJIL;
    }

    public final boolean getEnableClip$editor_trackpanel_release() {
        return this.LLLLIILLL;
    }

    public final boolean getEnableDrag$editor_trackpanel_release() {
        return this.LLLLIL;
    }

    public final boolean getEnableDragOnX$editor_trackpanel_release() {
        return this.LLJLLIL;
    }

    public final boolean getEnableDragOnY$editor_trackpanel_release() {
        return this.LLJLL;
    }

    public final boolean getEnableMultiMusicEdit$editor_trackpanel_release() {
        return this.LLLIILIL;
    }

    public final int getItemBgRadius$editor_trackpanel_release() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getItemHeight$editor_trackpanel_release() {
        return this.LLJJJJLIIL;
    }

    public final int getItemMargin$editor_trackpanel_release() {
        return this.LLJJL;
    }

    public final InterfaceC368620Ecm getKeyframeListener() {
        return this.LLJILJIL;
    }

    public final C0E8D getLegacyActionApi$editor_trackpanel_release() {
        return this.LLJILLL;
    }

    public final long getMainVideoDuration() {
        return this.LLLII;
    }

    public final int getMaxTrackNum$editor_trackpanel_release() {
        return this.LLJL;
    }

    public final C368790Ed3 getNullAudioTrack$editor_trackpanel_release() {
        return this.LLJJ;
    }

    public final C368800Ed4 getNullEffectTrack$editor_trackpanel_release() {
        return this.LLJJI;
    }

    public final Function1<View, Unit> getOnClickAudioCollectionTrack$editor_trackpanel_release() {
        return this.LLLLII;
    }

    public final Function1<View, Unit> getOnClickNullAudioTrack() {
        return this.LLLJL;
    }

    public final Function1<View, Unit> getOnClickNullEffectTrack() {
        return this.LLLL;
    }

    public final Function2<NLETrackSlot, View, Boolean> getOnShouldInterceptSlotClickEvent() {
        return this.LLLLIIIILLL;
    }

    public final View getPlaceHolderView$editor_trackpanel_release() {
        return this.LLJJIJI;
    }

    public final View getPlugInLine$editor_trackpanel_release() {
        return this.LLJJIJIIJIL;
    }

    public final AbstractC368710Ecv getScrollAndAdsorptionHandler() {
        return this.LLLJIL;
    }

    public final View getSegmentDragDecorateView$editor_trackpanel_release() {
        return this.LLJJJ;
    }

    public final Map<NLETrackSlot, C369110EdZ> getSegmentParams() {
        return this.LLLI;
    }

    public final int getShowTrackNum$editor_trackpanel_release() {
        return this.LLJZ;
    }

    public final int getTrackCount() {
        return this.LLJJJJ;
    }

    public final InterfaceC369050EdT getTrackDragEventListener$editor_trackpanel_release() {
        return this.LLLLIIL;
    }

    public final InterfaceC368840Ed8 getTrackGroupActionListener() {
        return this.LLJIJIL;
    }

    public final View getTrackGroupDragMask$editor_trackpanel_release() {
        return this.LLJJIJIL;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLJILJILJ;
    }

    public static int LJFF(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final void LIZLLL(boolean z) {
        getScrollHelper().LJIIJ = z;
    }

    public final int LJ(NLETrackSlot nLETrackSlot) {
        int i = -1;
        for (Map.Entry entry : ((LinkedHashMap) this.LLLI).entrySet()) {
            NLENode nLENode = (NLENode) entry.getKey();
            C369110EdZ c369110EdZ = (C369110EdZ) entry.getValue();
            if (nLETrackSlot.getId() == nLENode.getId()) {
                i = c369110EdZ.LIZ;
            }
        }
        return i;
    }

    public final int LJI(int i) {
        if (i <= 0) {
            return getPaddingTop() + (i * (this.LLJJJJLIIL + this.LLJJL));
        }
        int paddingTop = getPaddingTop();
        int i2 = this.LLJJJJLIIL;
        return paddingTop + ((i - 1) * (this.LLJJL + i2)) + i2 + ((int) (i2 * 0.33333334f)) + C0FU0.LIZ(1.0f);
    }

    public final void LJIIJ(int i) {
        int measuredHeight;
        if (i >= 0) {
            int paddingTop = getPaddingTop() + (i * (this.LLJJJJLIIL + this.LLJJL));
            Typeface typeface = C368130Ebz.LIZ;
            C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(getContext());
            int i2 = c368390EcPLIZ.LJI + c368390EcPLIZ.LJII;
            int scrollY = paddingTop - getScrollY();
            if (scrollY >= 0 ? (measuredHeight = (((paddingTop + this.LLJJJJLIIL) + this.LLJJL) - getMeasuredHeight()) - getScrollY()) > 0 : (measuredHeight = scrollY - i2) != 0) {
                LJIILL(measuredHeight);
                return;
            }
        }
        if (getScrollY() > getMaxScrollY()) {
            LJIILL(getScrollY() - getMaxScrollY());
        }
    }

    public final void LJIIJJI(boolean z) {
        C368640Eco clipHelper = getClipHelper();
        if (z) {
            clipHelper.getClass();
            clipHelper.LJJ = C0E6E.LINE;
        } else {
            Pair<? extends NLETrackSlot, C369110EdZ> pair = clipHelper.LJJIJL;
            if (pair != null) {
                C368640Eco.LJIIIIZZ(null, pair.getSecond().LIZIZ);
                clipHelper.LJIIL(null);
                clipHelper.LJJ = C0E6E.NONE;
            }
        }
        clipHelper.LIZ.invalidate();
        this.LLL = false;
        this.LLLF = false;
    }

    public final void LJIIL(NLETrackSlot nLETrackSlot) {
        int paddingTop;
        int iLJ = LJ(nLETrackSlot);
        if (iLJ >= 0 && (paddingTop = ((getPaddingTop() + (iLJ * (this.LLJJJJLIIL + this.LLJJL))) - getScrollY()) - getPaddingTop()) != 0) {
            LJIILL(paddingTop);
        } else if (getScrollY() > getMaxScrollY()) {
            LJIILL(getScrollY() - getMaxScrollY());
        }
    }

    public final void LJIILJJIL(boolean z) {
        int i;
        if (z) {
            C367830EbV audioCollectionTrack = getAudioCollectionTrack();
            int visibility = audioCollectionTrack.getVisibility();
            audioCollectionTrack.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, audioCollectionTrack);
            for (Map.Entry entry : ((LinkedHashMap) this.LLLI).entrySet()) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) entry.getKey();
                View view = ((C369110EdZ) entry.getValue()).LIZIZ.getView();
                if (!C351220Dpo.LLILLIZIL(nLETrackSlot)) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }
        } else {
            C367830EbV audioCollectionTrack2 = getAudioCollectionTrack();
            int visibility2 = audioCollectionTrack2.getVisibility();
            audioCollectionTrack2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, audioCollectionTrack2);
            Iterator it2 = ((LinkedHashMap) this.LLLI).entrySet().iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJLLLLLL(0, ((C369110EdZ) ((Map.Entry) it2.next()).getValue()).LIZIZ.getView());
            }
        }
        requestLayout();
        invalidate();
    }

    public final void LJIILL(int i) {
        C368730Ecx scrollHelper = getScrollHelper();
        if (i == 0) {
            scrollHelper.getClass();
        } else {
            scrollHelper.LJIIIIZZ.startScroll(scrollHelper.LIZ.getScrollX(), scrollHelper.LIZ.getScrollY(), 0, i);
            scrollHelper.LIZ.postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float fRint;
        float fMax;
        C369110EdZ second;
        InterfaceC368720Ecw interfaceC368720Ecw;
        Pair<? extends NLETrackSlot, C369110EdZ> pair;
        NLETrackSlot first;
        float startTime;
        Map<NLETrackSlot, C369110EdZ> map;
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        C368640Eco clipHelper = getClipHelper();
        Pair<? extends NLETrackSlot, C369110EdZ> pair2 = clipHelper.LJJIJL;
        int minTitleWidth = 0;
        if (pair2 != null && (second = pair2.getSecond()) != null && (interfaceC368720Ecw = second.LIZIZ) != null && (pair = clipHelper.LJJIJL) != null && (first = pair.getFirst()) != null) {
            clipHelper.LJIILLIIL.setColor(ColorProtector.parseColor("#FF0F0F0F"));
            boolean zLLLF = C351220Dpo.LLLF(first);
            View view = interfaceC368720Ecw.getView();
            if (!zLLLF) {
                float left = view.getLeft();
                float top = view.getTop();
                float right = view.getRight();
                float bottom = view.getBottom();
                float f = clipHelper.LIZJ.LJ;
                canvas2.drawRoundRect(left, top, right, bottom, f, f, clipHelper.LJIILLIIL);
            }
            if (clipHelper.LIZLLL) {
                startTime = C369020EdQ.LIZ() - ((first.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * clipHelper.LIZ.getTimelineScale());
            } else {
                startTime = ((first.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * clipHelper.LIZ.getTimelineScale()) + C369020EdQ.LIZ();
            }
            C0E6E c0e6e = clipHelper.LJJ;
            C0E6E c0e6e2 = C0E6E.CLIP;
            if (c0e6e == c0e6e2) {
                interfaceC368720Ecw.LIZJ(0);
            } else if (c0e6e == C0E6E.LINE) {
                interfaceC368720Ecw.LIZJ(C0FU0.LIZ(1.0f));
            }
            if (clipHelper.LIZLLL) {
                float f2 = clipHelper.LJJIFFI.right;
                float f3 = C368640Eco.LJJIZ;
                float f4 = f2 + f3;
                RectF rectF = clipHelper.LJJI;
                float f5 = rectF.top + f3;
                float f6 = C368640Eco.LJJIL;
                float f7 = rectF.left - f3;
                interfaceC368720Ecw.LJII(canvas2, f4, f5 + f6, f7, (rectF.bottom - f3) - f6, startTime - f7, startTime - f4, clipHelper.LJJ);
            } else {
                RectF rectF2 = clipHelper.LJJI;
                float f8 = rectF2.right;
                float f9 = C368640Eco.LJJIZ;
                float f10 = f8 + f9;
                float f11 = rectF2.top + f9;
                float f12 = C368640Eco.LJJIL;
                float f13 = clipHelper.LJJIFFI.left - f9;
                interfaceC368720Ecw.LJII(canvas2, f10, f11 + f12, f13, (rectF2.bottom - f9) - f12, f10 - startTime, f13 - startTime, clipHelper.LJJ);
            }
            if (interfaceC368720Ecw.LJ()) {
                AbstractC367990Ebl adapter$editor_trackpanel_release = clipHelper.LIZ.getAdapter$editor_trackpanel_release();
                if (adapter$editor_trackpanel_release != null && (map = adapter$editor_trackpanel_release.LJI) != null) {
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        if (((C369110EdZ) entry.getValue()).LIZIZ.getClass() == interfaceC368720Ecw.getClass()) {
                            if (((C369110EdZ) entry.getValue()).LIZIZ.getView().getVisibility() == 0) {
                                clipHelper.LJIJ.reset();
                                clipHelper.LJIJ.addRoundRect(r2.getLeft(), r2.getTop(), r2.getRight(), r2.getBottom(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), Path.Direction.CCW);
                                canvas2.drawPath(clipHelper.LJIJ, clipHelper.LJIJI);
                            }
                        }
                    }
                }
            } else {
                C0E6E c0e6e3 = clipHelper.LJJ;
                if (c0e6e3 == c0e6e2) {
                    clipHelper.LJIILLIIL.setColor(clipHelper.LJIIZILJ);
                    RectF rectF3 = clipHelper.LJJI;
                    float f14 = rectF3.top;
                    float f15 = C368640Eco.LJJIL / 2.0f;
                    float f16 = f15 + f14;
                    float f18 = rectF3.bottom - f15;
                    if (clipHelper.LIZLLL) {
                        canvas2.drawLine(clipHelper.LJJIFFI.right, f16, rectF3.left, f16, clipHelper.LJIILLIIL);
                        canvas2 = canvas2;
                        canvas2.drawLine(clipHelper.LJJIFFI.right, f18, clipHelper.LJJI.left, f18, clipHelper.LJIILLIIL);
                    } else {
                        canvas2.drawLine(rectF3.right, f16, clipHelper.LJJIFFI.left, f16, clipHelper.LJIILLIIL);
                        canvas2 = canvas2;
                        canvas2.drawLine(clipHelper.LJJI.right, f18, clipHelper.LJJIFFI.left, f18, clipHelper.LJIILLIIL);
                    }
                    clipHelper.LJJI.round(clipHelper.LJI);
                    C368780Ed2 c368780Ed2 = clipHelper.LJ;
                    if (c368780Ed2 != null) {
                        c368780Ed2.setBounds(clipHelper.LJI);
                    }
                    C368780Ed2 c368780Ed22 = clipHelper.LJ;
                    if (c368780Ed22 != null) {
                        c368780Ed22.draw(canvas2);
                    }
                    clipHelper.LJJIFFI.round(clipHelper.LJI);
                    C368780Ed2 c368780Ed23 = clipHelper.LJFF;
                    if (c368780Ed23 != null) {
                        c368780Ed23.setBounds(clipHelper.LJI);
                    }
                    C368780Ed2 c368780Ed24 = clipHelper.LJFF;
                    if (c368780Ed24 != null) {
                        c368780Ed24.draw(canvas2);
                    }
                } else if (c0e6e3 == C0E6E.LINE) {
                    clipHelper.LJIILLIIL.setColor(clipHelper.LJIIZILJ);
                    clipHelper.LJIJ.reset();
                    if (clipHelper.LIZLLL) {
                        Path path = clipHelper.LJIJ;
                        float f19 = clipHelper.LJJIFFI.right;
                        RectF rectF4 = clipHelper.LJJI;
                        float f20 = rectF4.top;
                        float f21 = C368640Eco.LJJIL;
                        float f22 = f20 + f21;
                        float f23 = rectF4.left;
                        float f24 = rectF4.bottom - f21;
                        float f25 = clipHelper.LIZJ.LJ;
                        path.addRoundRect(f19, f22, f23, f24, f25, f25, Path.Direction.CCW);
                    } else {
                        Path path2 = clipHelper.LJIJ;
                        RectF rectF5 = clipHelper.LJJI;
                        float f26 = rectF5.right;
                        float f27 = rectF5.top;
                        float f28 = C368640Eco.LJJIL;
                        float f29 = clipHelper.LJJIFFI.left;
                        float f30 = rectF5.bottom - f28;
                        float f31 = clipHelper.LIZJ.LJ;
                        path2.addRoundRect(f26, f27 + f28, f29, f30, f31, f31, Path.Direction.CCW);
                    }
                    canvas2.drawPath(clipHelper.LJIJ, clipHelper.LJIJI);
                }
            }
        }
        AbstractC367990Ebl abstractC367990Ebl = this.LLLJ;
        if (abstractC367990Ebl != null) {
            abstractC367990Ebl.LIZLLL(canvas2);
        }
        if (getVisibility() == 0 || this.LLJJI.getVisibility() == 0) {
            getContext();
            float fLIZ = C369020EdQ.LIZ();
            if (LJIIIZ()) {
                fRint = -((float) Math.rint(this.LLLIIIIL * C360610EBv.LIZJ()));
            } else {
                fRint = (float) Math.rint(this.LLLIIIIL * C360610EBv.LIZJ());
            }
            float fMin = fLIZ + fRint;
            if (LJIIIZ()) {
                fMax = Math.max(fMin - getNullAudioTrackWidth(), fMin - (getScreenWidth() / 2));
            } else {
                fMax = fMin;
            }
            if (!LJIIIZ()) {
                fMin = Math.min(getNullAudioTrackWidth() + fMin, fMin + (getScreenWidth() / 2));
            }
            float fAbs = Math.abs(fMin - fMax);
            if (getVisibility() == 0) {
                minTitleWidth = getMinTitleWidth();
            } else if (this.LLJJI.getVisibility() == 0) {
                minTitleWidth = this.LLJJI.getMinTitleWidth();
            }
            float f32 = minTitleWidth;
            if (fAbs < f32) {
                if (LJIIIZ()) {
                    getContext();
                    fMin = Math.min(fMin + (f32 - fAbs), C369020EdQ.LIZ());
                } else {
                    getContext();
                    fMax = Math.max(fMax - (f32 - fAbs), C369020EdQ.LIZ());
                }
            }
            if (getVisibility() == 0) {
                C368790Ed3 c368790Ed3 = this.LLJJ;
                float fIntValue = getNullTrackTopBottom().getFirst().intValue();
                float fIntValue2 = getNullTrackTopBottom().getSecond().intValue();
                getContext();
                c368790Ed3.LIZ(canvas2, fMax, fIntValue, fMin, fIntValue2, C369020EdQ.LIZ());
            }
            if (this.LLJJI.getVisibility() == 0) {
                C368800Ed4 c368800Ed4 = this.LLJJI;
                float fIntValue3 = getNullTrackTopBottom().getFirst().intValue();
                float fIntValue4 = getNullTrackTopBottom().getSecond().intValue();
                getContext();
                c368800Ed4.LIZ(canvas2, fMax, fIntValue3, fMin, fIntValue4, C369020EdQ.LIZ());
            }
        }
        if (this.LLLIIIL) {
            float desireHeight = getDesireHeight() - (LLLLJI / 2.0f);
            int desireMaxScrollX = getDesireMaxScrollX();
            getContext();
            canvas2.drawLine(0.0f, desireHeight, desireMaxScrollX + (C369020EdQ.LIZ() * 2), desireHeight, this.LLJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.LLLLIILLL
            r3 = 1
            if (r0 == 0) goto L91
            boolean r0 = r7.LLL
            if (r0 != 0) goto L91
            boolean r0 = r7.LLLF
            if (r0 != 0) goto L91
            X.0Eco r6 = r7.getClipHelper()
            int r5 = r7.getScrollX()
            int r4 = r7.getScrollY()
            r6.getClass()
            if (r8 == 0) goto L91
            int r0 = r8.getAction()
            if (r0 != 0) goto L91
            X.0E6E r1 = r6.LJJ
            X.0E6E r0 = X.C0E6E.CLIP
            if (r1 != r0) goto L91
            float r2 = r8.getX()
            float r0 = (float) r5
            float r2 = r2 + r0
            float r1 = r8.getY()
            float r0 = (float) r4
            float r1 = r1 + r0
            android.graphics.RectF r0 = r6.LJJI
            boolean r0 = r0.contains(r2, r1)
            if (r0 != 0) goto L46
            android.graphics.RectF r0 = r6.LJJIFFI
            boolean r0 = r0.contains(r2, r1)
            if (r0 == 0) goto L91
        L46:
            r0 = 1
        L47:
            r7.LLLILZJ = r0
            if (r0 != 0) goto L82
            if (r8 == 0) goto L93
            boolean r0 = r7.LLLILZLLLI
            if (r0 != 0) goto L93
            X.0Ecx r4 = r7.getScrollHelper()
            r4.getClass()
            int r1 = r8.getAction()
            if (r1 == 0) goto L83
            r0 = 2
            if (r1 != r0) goto L7c
            float r2 = r8.getY()
            float r0 = r4.LIZIZ
            float r2 = r2 - r0
            int r0 = r4.LJ
            float r1 = (float) r0
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L7c
            X.0E6I r0 = X.C0E6I.DRAGGING
            r4.LIZLLL = r0
            X.0Ecn r0 = r4.LIZ
            r0.requestDisallowInterceptTouchEvent(r3)
        L7c:
            X.0E6I r1 = r4.LIZLLL
            X.0E6I r0 = X.C0E6I.DRAGGING
            if (r1 != r0) goto L93
        L82:
            return r3
        L83:
            float r0 = r8.getY()
            r4.LIZIZ = r0
            r4.LIZJ = r0
            android.widget.OverScroller r0 = r4.LJIIIIZZ
            r0.abortAnimation()
            goto L7c
        L91:
            r0 = 0
            goto L47
        L93:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368630Ecn.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368630Ecn.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAdapter(AbstractC367990Ebl abstractC367990Ebl) {
        boolean z;
        boolean zLIZJ;
        int iLJI;
        int i;
        long jLJ;
        if (Intrinsics.LJFF(this.LLLJ, abstractC367990Ebl)) {
            return;
        }
        this.LLLJ = abstractC367990Ebl;
        ((LinkedHashMap) this.LLLI).clear();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C368790Ed3 c368790Ed3 = this.LLJJ;
        View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 108);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
        }
        a aVar = new a(aCListenerS140S0100000_5);
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c368790Ed3);
        }
        c368790Ed3.setOnClickListener(aVar);
        C368800Ed4 c368800Ed4 = this.LLJJI;
        View.OnClickListener aCListenerS140S0100000_52 = new ACListenerS140S0100000_5(this, 109);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_52 = new f(aCListenerS140S0100000_52);
        }
        a aVar2 = new a(aCListenerS140S0100000_52);
        if (c2213981Bky.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c368800Ed4);
        }
        c368800Ed4.setOnClickListener(aVar2);
        C367830EbV audioCollectionTrack = getAudioCollectionTrack();
        View.OnClickListener aCListenerS140S0100000_53 = new ACListenerS140S0100000_5(this, 110);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_53 = new f(aCListenerS140S0100000_53);
        }
        a aVar3 = new a(aCListenerS140S0100000_53);
        if (c2213981Bky.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(audioCollectionTrack);
        }
        audioCollectionTrack.setOnClickListener(aVar3);
        this.LLJJIJIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EdY
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        addView(this.LLJJ);
        addView(this.LLJJI);
        addView(this.LLJJIJI);
        addView(this.LLJJIJIIJIL);
        addView(this.LLJJIJIL);
        addView(this.LLJJJ);
        addView(getAudioCollectionTrack());
        int iLJII = 0;
        setScrollY(0);
        if (abstractC367990Ebl != null) {
            z = !(abstractC367990Ebl instanceof C367970Ebj);
        } else {
            z = false;
        }
        this.LLJLIL = z;
        if (abstractC367990Ebl != null) {
            zLIZJ = abstractC367990Ebl.LIZJ();
        } else {
            zLIZJ = false;
        }
        this.LLJLILLLLZIIL = zLIZJ;
        if (abstractC367990Ebl != null) {
            iLJI = abstractC367990Ebl.LJI();
        } else {
            iLJI = 0;
        }
        this.LLJJJJLIIL = iLJI;
        if (abstractC367990Ebl != null) {
            i = abstractC367990Ebl.LJIIL;
        } else {
            i = 0;
        }
        this.LLJJL = i;
        if (abstractC367990Ebl != null) {
            iLJII = abstractC367990Ebl.LJII();
        }
        this.LLJL = iLJII;
        if (abstractC367990Ebl != null) {
            jLJ = abstractC367990Ebl.LJ();
        } else {
            jLJ = 100;
        }
        this.LLJJJJJIL = jLJ;
    }

    public final void setAllowLastTrackPutFirst(boolean z) {
        this.LLLFZ = z;
    }

    public final void setAudioCollectionCalStrategy$editor_trackpanel_release(Function1<? super ArrayList<Float>, Float> function1) {
        getAudioCollectionTrack().setOnCalcCollectionSingleHeight$editor_trackpanel_release(function1);
    }

    public final void setAudioCollectionLabelPainter$editor_trackpanel_release(InterfaceC369240Edm interfaceC369240Edm) {
        getAudioCollectionTrack().setAudioCollectionLabelPainter$editor_trackpanel_release(interfaceC369240Edm);
    }

    public final void setAudioCollectionWavePainter$editor_trackpanel_release(Function0<? extends InterfaceC367710EbJ> function0) {
        getAudioCollectionTrack().setAudioWavePainterCreator$editor_trackpanel_release(function0);
    }

    public final void setCallback(AbstractC368710Ecv abstractC368710Ecv) {
        this.LLLJIL = abstractC368710Ecv;
    }

    public final void setCanMoveOutOfMainVideo(boolean z) {
        this.LLJLIL = z;
    }

    public final void setClipMinDuration$editor_trackpanel_release(long j) {
        this.LLJJJJJIL = j;
    }

    public final void setCurNLEModelStage(NLEModel nLEModel) {
        this.LLJJJIL = nLEModel;
    }

    public final void setDragOnHorizontalAbility(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setDragOnVerticalAbility(boolean z) {
        this.LLJLL = z;
    }

    public final void setEnableClip$editor_trackpanel_release(boolean z) {
        this.LLLLIILLL = z;
    }

    public final void setEnableDrag$editor_trackpanel_release(boolean z) {
        this.LLLLIL = z;
    }

    public final void setEnableMultiMusicEdit$editor_trackpanel_release(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setForceTrackFirstEnabled(boolean z) {
        this.LLLFFI = z;
    }

    public final void setItemBgRadius$editor_trackpanel_release(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public final void setItemHeight$editor_trackpanel_release(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setItemMargin$editor_trackpanel_release(int i) {
        this.LLJJL = i;
    }

    public final void setKeyframeListener(InterfaceC368620Ecm interfaceC368620Ecm) {
        this.LLJILJIL = interfaceC368620Ecm;
    }

    public final void setLegacyActionApi$editor_trackpanel_release(C0E8D c0e8d) {
        this.LLJILLL = c0e8d;
    }

    public final void setMainVideoDuration(long j) {
        this.LLLII = j;
    }

    public final void setMoveTouchEdge(boolean z) {
        if (this.LLLIIIL != z) {
            if (z) {
                getHapticFeedback().LIZ(this, C0E4C.VIBRATE_IMPACT_LIGHT);
            }
            this.LLLIIIL = z;
            invalidate();
        }
    }

    public final void setNullAudioTrackPainter(InterfaceC369160Ede interfaceC369160Ede) {
        setNullTrackPainter$editor_trackpanel_release(interfaceC369160Ede);
    }

    public final void setNullEffectTrackPainter(InterfaceC369160Ede interfaceC369160Ede) {
        this.LLJJI.setNullTrackPainter$editor_trackpanel_release(interfaceC369160Ede);
    }

    @Override // X.AbstractC368670Ecr
    public void setOnBlankClickListener$editor_trackpanel_release(View.OnClickListener onClickListener) {
        this.LLLLIILL = onClickListener;
    }

    public final void setOnClickAudioCollectionTrack$editor_trackpanel_release(Function1<? super View, Unit> function1) {
        this.LLLLII = function1;
    }

    public final void setOnClickNullAudioTrack(Function1<? super View, Unit> function1) {
        this.LLLJL = function1;
    }

    public final void setOnClickNullEffectTrack(Function1<? super View, Unit> function1) {
        this.LLLL = function1;
    }

    public final void setOnShouldInterceptSlotClickEvent(Function2<? super NLETrackSlot, ? super View, Boolean> function2) {
        this.LLLLIIIILLL = function2;
    }

    public final void setOnlyOne$editor_trackpanel_release(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setRecordingAudio$editor_trackpanel_release(boolean z) {
        this.LLJLLL = z;
    }

    public final void setSelectExtendMusic$editor_trackpanel_release(boolean z) {
        this.LLL = z;
    }

    public final void setSelectMutedMusic$editor_trackpanel_release(boolean z) {
        this.LLLF = z;
    }

    public final void setSelectSegmentStyle(C0E6E c0e6e) {
        C368640Eco clipHelper = getClipHelper();
        clipHelper.LJJ = c0e6e;
        clipHelper.LIZ.invalidate();
    }

    public final void setShowTrackNum$editor_trackpanel_release(int i) {
        this.LLJZ = i;
    }

    public final void setSubTrackGroupFromXml(C368630Ecn c368630Ecn) {
        this.LLJ = c368630Ecn;
    }

    @Override // X.AbstractC368670Ecr
    public void setTimelineScale(float f) {
        if (getTimelineScale() != f) {
            super.setTimelineScale(f);
            Iterator it2 = ((LinkedHashMap) this.LLLI).values().iterator();
            while (it2.hasNext()) {
                ((C369110EdZ) it2.next()).LIZIZ.setTimelineScale(f);
            }
            requestLayout();
            C368640Eco clipHelper = getClipHelper();
            Map<NLETrackSlot, C369110EdZ> map = this.LLLI;
            Pair<? extends NLETrackSlot, C369110EdZ> pair = clipHelper.LJJIJL;
            if (pair != null) {
                clipHelper.LJIILIIL(map, pair);
            }
        }
    }

    public final void setTrackDragEventListener$editor_trackpanel_release(InterfaceC369050EdT interfaceC369050EdT) {
        this.LLLLIIL = interfaceC369050EdT;
    }

    public final void setTrackGroupActionListener(InterfaceC368840Ed8 interfaceC368840Ed8) {
        this.LLJIJIL = interfaceC368840Ed8;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLJILJILJ = interfaceC367590Eb7;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Ecp] */
    public final void setupHolderTouchHandler(final InterfaceC368720Ecw interfaceC368720Ecw) {
        ?? r4 = new InterfaceC370600Efy(interfaceC368720Ecw) { // from class: X.0Ecp
            public final C368660Ecq LIZ;
            public final /* synthetic */ InterfaceC368720Ecw LIZJ;

            @Override // X.InterfaceC370600Efy
            public final boolean LIZ() {
                if (!this.LIZIZ.getEnableDrag$editor_trackpanel_release()) {
                    return false;
                }
                C368630Ecn c368630Ecn = this.LIZIZ;
                return (c368630Ecn.LLL || c368630Ecn.LLLF || !this.LIZJ.LIZ()) ? false : true;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [X.0Ecz] */
            @Override // X.InterfaceC370600Efy
            public final void LIZJ() {
                Animator animatorOfFloat;
                int i;
                float fLIZ;
                float fLIZJ;
                long j;
                float fLIZ2;
                float fLIZJ2;
                float fLIZ3;
                float fLIZJ3;
                float fLIZ4;
                float fLIZJ4;
                ViewGroup viewGroup;
                InterfaceC369050EdT trackDragEventListener$editor_trackpanel_release = this.LIZIZ.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release != null) {
                    trackDragEventListener$editor_trackpanel_release.LIZLLL();
                }
                this.LIZIZ.setDragOnVerticalAbility(true);
                Animator animator = this.LIZIZ.LLLIZZ;
                if (animator != null) {
                    animator.cancel();
                }
                final C368630Ecn c368630Ecn = this.LIZIZ;
                ?? r12 = new Object() { // from class: X.0Ecz
                    public final void LIZ(NLETrackSlot nLETrackSlot) {
                        AbstractC367990Ebl abstractC367990Ebl = c368630Ecn.LLLJ;
                        if (abstractC367990Ebl != null) {
                            abstractC367990Ebl.LJIILIIL(nLETrackSlot);
                        }
                    }

                    public final void LIZIZ(int i2, int i3, NLETrackSlot nLETrackSlot, long j2, long j3, boolean z) {
                        long jAbs = (long) (Math.abs(c368630Ecn.getScrollX()) / c368630Ecn.getTimelineScale());
                        AbstractC367990Ebl abstractC367990Ebl = c368630Ecn.LLLJ;
                        if (abstractC367990Ebl != null) {
                            abstractC367990Ebl.onMove(i2, i3, nLETrackSlot, j2, jAbs, j3, z);
                        }
                    }
                };
                C368660Ecq c368660Ecq = this.LIZ;
                c368660Ecq.getClass();
                c368660Ecq.LJIIIIZZ(EnumC368970EdL.NULL);
                c368660Ecq.LIZIZ.setDrawDivider(true);
                c368660Ecq.LIZ.setMoveTouchEdge(false);
                ViewParent parent = c368660Ecq.LIZLLL.getParent();
                Integer numValueOf = null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    numValueOf = Integer.valueOf(viewGroup.indexOfChild(c368660Ecq.LIZLLL));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("endDrag::indexOfItemView = ");
                sbLIZ.append(numValueOf);
                C355090Dw3.LIZIZ("JFKKKKK", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC369050EdT trackDragEventListener$editor_trackpanel_release2 = c368660Ecq.LIZ.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release2 != null) {
                    if (trackDragEventListener$editor_trackpanel_release2.LIZIZ(c368660Ecq.LJIJJLI, c368660Ecq.LJIJJ ? c368660Ecq.LJIJ < c368660Ecq.LIZ.getTrackCount() ? c368660Ecq.LJIIJJI > 0.0f ? c368660Ecq.LJIJ + 1 : c368660Ecq.LJIJ : c368660Ecq.LIZ.getTrackCount() : c368660Ecq.LJIJ, c368660Ecq.LJIJJ, c368660Ecq.LJ.getVisibility() == 8 && c368660Ecq.LJFF.getVisibility() == 8).LIZ) {
                        c368660Ecq.LJIJI = !r1.LIZIZ;
                    }
                }
                NLETrackSlot nLETrackSlot = c368660Ecq.LJIJJLI;
                if (c368660Ecq.LJIJI || nLETrackSlot == null) {
                    c368660Ecq.LIZIZ.LJIIIIZZ(c368660Ecq.LJIIZILJ);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(c368660Ecq.LIZLLL, (Property<View, Float>) View.ALPHA, c368660Ecq.LJIILL, 1.0f), ObjectAnimator.ofFloat(c368660Ecq.LIZLLL, (Property<View, Float>) View.TRANSLATION_X, c368660Ecq.LJIIIZ, 0.0f), ObjectAnimator.ofFloat(c368660Ecq.LIZLLL, (Property<View, Float>) View.TRANSLATION_Y, c368660Ecq.LJIIJJI, 0.0f));
                    c368660Ecq.LIZ.LJIIJ(c368660Ecq.LJIILLIIL);
                    r12.LIZ(nLETrackSlot);
                    animatorOfFloat = animatorSet;
                } else {
                    if (c368660Ecq.LJIJJ) {
                        i = 2;
                        int left = (int) (c368660Ecq.LIZLLL.getLeft() + c368660Ecq.LJIIIZ);
                        int right = (int) (c368660Ecq.LIZLLL.getRight() + c368660Ecq.LJIIIZ);
                        if (c368660Ecq.LJI()) {
                            int i2 = C368630Ecn.LLLLJI;
                            c368660Ecq.LJ();
                            fLIZ = C369020EdQ.LIZ() - right;
                            fLIZJ = C360610EBv.LIZJ();
                        } else {
                            int i3 = C368630Ecn.LLLLJI;
                            c368660Ecq.LJ();
                            fLIZ = left - C369020EdQ.LIZ();
                            fLIZJ = C360610EBv.LIZJ();
                        }
                        long j2 = (long) (fLIZ / fLIZJ);
                        j = j2 >= 0 ? j2 : 0L;
                        if (c368660Ecq.LJI()) {
                            c368660Ecq.LJ();
                            fLIZ2 = C369020EdQ.LIZ() - left;
                            fLIZJ2 = C360610EBv.LIZJ();
                        } else {
                            c368660Ecq.LJ();
                            fLIZ2 = right - C369020EdQ.LIZ();
                            fLIZJ2 = C360610EBv.LIZJ();
                        }
                        long videosLength$editor_trackpanel_release = (long) (fLIZ2 / fLIZJ2);
                        if (!c368660Ecq.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release() && videosLength$editor_trackpanel_release > c368660Ecq.LIZ.getMainVideoDuration()) {
                            videosLength$editor_trackpanel_release = c368660Ecq.LIZ.getMainVideoDuration();
                        } else if (!c368660Ecq.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release() && videosLength$editor_trackpanel_release > c368660Ecq.LIZ.getVideosLength$editor_trackpanel_release() / c368660Ecq.LIZ.getTimelineScale()) {
                            videosLength$editor_trackpanel_release = (long) (c368660Ecq.LIZ.getVideosLength$editor_trackpanel_release() / c368660Ecq.LIZ.getTimelineScale());
                        }
                        r12.LIZIZ(c368660Ecq.LJIILLIIL, c368660Ecq.LJIJ < c368660Ecq.LIZ.getTrackCount() ? c368660Ecq.LJIIJJI > 0.0f ? c368660Ecq.LJIJ + 1 : c368660Ecq.LJIJ : c368660Ecq.LIZ.getTrackCount(), nLETrackSlot, j, videosLength$editor_trackpanel_release - j, true);
                    } else {
                        c368660Ecq.LIZLLL.layout(c368660Ecq.LJ.getLeft(), c368660Ecq.LJ.getTop(), c368660Ecq.LJ.getRight(), c368660Ecq.LJ.getBottom());
                        C786410Ut5.ed(c368660Ecq.LIZLLL, 0.0f);
                        C786410Ut5.Jc(c368660Ecq.LIZLLL, 0.0f);
                        int left2 = c368660Ecq.LJ.getLeft();
                        int right2 = c368660Ecq.LJ.getRight();
                        if (c368660Ecq.LJI()) {
                            int i4 = C368630Ecn.LLLLJI;
                            c368660Ecq.LJ();
                            fLIZ3 = C369020EdQ.LIZ() - right2;
                            fLIZJ3 = C360610EBv.LIZJ();
                        } else {
                            int i5 = C368630Ecn.LLLLJI;
                            c368660Ecq.LJ();
                            fLIZ3 = left2 - C369020EdQ.LIZ();
                            fLIZJ3 = C360610EBv.LIZJ();
                        }
                        long j3 = (long) (fLIZ3 / fLIZJ3);
                        j = j3 >= 0 ? j3 : 0L;
                        if (c368660Ecq.LJI()) {
                            c368660Ecq.LJ();
                            fLIZ4 = C369020EdQ.LIZ() - left2;
                            fLIZJ4 = C360610EBv.LIZJ();
                        } else {
                            c368660Ecq.LJ();
                            fLIZ4 = right2 - C369020EdQ.LIZ();
                            fLIZJ4 = C360610EBv.LIZJ();
                        }
                        long mainVideoDuration = (long) (fLIZ4 / fLIZJ4);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fromTrackIndex: ");
                        sbLIZ2.append(c368660Ecq.LJIILLIIL);
                        sbLIZ2.append(", toTrackIndex: ");
                        sbLIZ2.append(c368660Ecq.LJIJ);
                        sbLIZ2.append(", start: ");
                        sbLIZ2.append(j);
                        C355090Dw3.LJ("TrackDragHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        if (Math.abs(mainVideoDuration - c368660Ecq.LIZ.getMainVideoDuration()) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)) / C360610EBv.LIZJ()) {
                            mainVideoDuration = c368660Ecq.LIZ.getMainVideoDuration();
                        }
                        i = 2;
                        r12.LIZIZ(c368660Ecq.LJIILLIIL, c368660Ecq.LJIJ, nLETrackSlot, j, mainVideoDuration - j, false);
                    }
                    View view = c368660Ecq.LIZLLL;
                    Property property = View.ALPHA;
                    float[] fArr = new float[i];
                    fArr[0] = c368660Ecq.LJIILL;
                    fArr[1] = 1.0f;
                    animatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                }
                animatorOfFloat.setDuration(100L);
                animatorOfFloat.addListener(new ALAdapterS2S0100000_5(c368660Ecq, 37));
                animatorOfFloat.start();
                c368660Ecq.LJIIIZ = 0.0f;
                c368660Ecq.LJIIJ = 0.0f;
                c368660Ecq.LJIIJJI = 0.0f;
                c368660Ecq.LJIIL = 0.0f;
                c368660Ecq.LJIILLIIL = 0;
                c368660Ecq.LIZ.requestDisallowInterceptTouchEvent(false);
                c368630Ecn.LLLIZZ = animatorOfFloat;
                this.LIZIZ.LLLILZLLLI = false;
                this.LIZJ.LIZLLL(false);
                C786410Ut5.LJLLLLLL(8, this.LIZIZ.getTrackGroupDragMask$editor_trackpanel_release());
                C368630Ecn c368630Ecn2 = this.LIZIZ;
                C786410Ut5.Jc(c368630Ecn2.LLJJJ, 0.0f);
                C786410Ut5.ed(c368630Ecn2.LLJJJ, 0.0f);
                C786410Ut5.LJLLLLLL(8, c368630Ecn2.LLJJJ);
                this.LIZIZ.LJII();
                this.LIZIZ.LJIIIIZZ();
                InterfaceC368840Ed8 trackGroupActionListener = this.LIZIZ.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    trackGroupActionListener.LIZ(null, C0E6E.LINE, false, true);
                }
            }

            @Override // X.InterfaceC370600Efy
            public final void v8() {
                C356980Dz6 c356980Dz6LIZJ;
                AbstractC368710Ecv abstractC368710EcvLJFF;
                ViewGroup viewGroup;
                C368630Ecn c368630Ecn = this.LIZIZ;
                int i = C368630Ecn.LLLLJI;
                c368630Ecn.LJIIJJI(false);
                Animator animator = this.LIZIZ.LLLIZZ;
                if (animator != null) {
                    animator.cancel();
                }
                C368630Ecn c368630Ecn2 = this.LIZIZ;
                C368660Ecq c368660Ecq = this.LIZ;
                Map<NLETrackSlot, C369110EdZ> segmentParams = c368630Ecn2.getSegmentParams();
                c368660Ecq.LIZ.requestDisallowInterceptTouchEvent(true);
                c368660Ecq.LIZ.getLocationOnScreen(c368660Ecq.LJIILJJIL);
                ((InterfaceC369250Edn) c368660Ecq.LJJIII.getValue()).LIZ(c368660Ecq.LIZLLL, C0E4C.VIBRATE_IMPACT_LIGHT);
                Typeface typeface = C368130Ebz.LIZ;
                ViewParent parent = c368660Ecq.LIZLLL.getParent();
                Integer numValueOf = null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    numValueOf = Integer.valueOf(viewGroup.indexOfChild(c368660Ecq.LIZLLL));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("beginDrag::indexOfItemView = ");
                sbLIZ.append(numValueOf);
                C355090Dw3.LIZIZ("JFKKKKK", C2188811AlT.LIZIZ(sbLIZ));
                c368660Ecq.LJ.bringToFront();
                c368660Ecq.LJFF.bringToFront();
                c368660Ecq.LIZLLL.bringToFront();
                c368660Ecq.LJII.bringToFront();
                c368660Ecq.LIZIZ.setDrawDivider(false);
                for (Map.Entry<NLETrackSlot, C369110EdZ> entry : segmentParams.entrySet()) {
                    NLETrackSlot key = entry.getKey();
                    if (entry.getValue().LIZIZ == c368660Ecq.LIZIZ) {
                        c368660Ecq.LJIJJLI = key;
                    }
                }
                for (int paddingTop = c368660Ecq.LIZ.getPaddingTop(); paddingTop < c368660Ecq.LIZLLL.getTop(); paddingTop += c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release() + c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release()) {
                    c368660Ecq.LJIILLIIL++;
                }
                c368660Ecq.LJIJ = c368660Ecq.LJIILLIIL;
                c368660Ecq.LJIIZILJ = c368660Ecq.LIZIZ.LJI();
                c368660Ecq.LJIILIIL = EnumC368970EdL.NULL;
                NLETrackSlot nLETrackSlot = c368660Ecq.LJIJJLI;
                if (nLETrackSlot != null && (abstractC368710EcvLJFF = c368660Ecq.LJFF()) != null) {
                    abstractC368710EcvLJFF.LLILLJJLI = abstractC368710EcvLJFF.LJ(nLETrackSlot);
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c368660Ecq.LIZLLL, (Property<View, Float>) View.ALPHA, 1.0f, c368660Ecq.LJIILL);
                objectAnimatorOfFloat.setDuration(50L);
                C786410Ut5.Pd(objectAnimatorOfFloat);
                c368630Ecn2.LLLIZZ = objectAnimatorOfFloat;
                AbstractC367990Ebl abstractC367990Ebl = this.LIZIZ.LLLJ;
                if (abstractC367990Ebl != null) {
                    abstractC367990Ebl.LJIIL();
                }
                this.LIZIZ.LLLILZLLLI = true;
                this.LIZJ.LIZLLL(true);
                C368630Ecn c368630Ecn3 = this.LIZIZ;
                InterfaceC368720Ecw interfaceC368720Ecw2 = this.LIZJ;
                c368630Ecn3.getClass();
                View view = interfaceC368720Ecw2.getView();
                View view2 = c368630Ecn3.LLJJIJI;
                C786410Ut5.LJLLLLLL(0, view2);
                view2.setZ(0.0f);
                view2.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                InterfaceC369050EdT trackDragEventListener$editor_trackpanel_release = this.LIZIZ.getTrackDragEventListener$editor_trackpanel_release();
                if (trackDragEventListener$editor_trackpanel_release != null && (c356980Dz6LIZJ = trackDragEventListener$editor_trackpanel_release.LIZJ(this.LIZ.LJIJJLI)) != null) {
                    C368630Ecn c368630Ecn4 = this.LIZIZ;
                    c368630Ecn4.setDragOnHorizontalAbility(c356980Dz6LIZJ.LIZ);
                    c368630Ecn4.setDragOnVerticalAbility(c356980Dz6LIZJ.LIZIZ);
                }
                if (C360610EBv.LJIIIZ) {
                    return;
                }
                C368630Ecn c368630Ecn5 = this.LIZIZ;
                InterfaceC368720Ecw interfaceC368720Ecw3 = this.LIZJ;
                c368630Ecn5.getClass();
                View view3 = interfaceC368720Ecw3.getView();
                int i2 = (int) (C368640Eco.LJJIZ + (C368640Eco.LJJIL / 2));
                View view4 = c368630Ecn5.LLJJJ;
                C786410Ut5.LJLLLLLL(0, view4);
                view4.layout(view3.getLeft() - i2, view3.getTop() - i2, view3.getRight() + i2, view3.getBottom() + i2);
            }

            {
                this.LIZJ = interfaceC368720Ecw;
                this.LIZ = new C368660Ecq(this.LIZIZ, interfaceC368720Ecw, new AwS549S0100000_5(this.LIZIZ, 967));
            }

            @Override // X.InterfaceC370600Efy
            public final void LIZIZ(float f, float f2, float f3) {
                int iLIZ;
                boolean z;
                boolean z2;
                int iLJI;
                EnumC368970EdL enumC368970EdL;
                float left;
                float fLIZJ;
                long duration;
                long left2;
                long duration2;
                EnumC368970EdL enumC368970EdL2;
                AbstractC368710Ecv abstractC368710EcvLJFF;
                long jMax;
                C368660Ecq c368660Ecq = this.LIZ;
                Map<NLETrackSlot, C369110EdZ> segmentParams = this.LIZIZ.getSegmentParams();
                if (c368660Ecq.LIZ.getEnableDragOnX$editor_trackpanel_release()) {
                    c368660Ecq.LJIIL += f2;
                    if (c368660Ecq.LJI()) {
                        if (c368660Ecq.LJIIL - c368660Ecq.LJIIJ < 0.0f) {
                            enumC368970EdL = EnumC368970EdL.END;
                        } else {
                            enumC368970EdL = EnumC368970EdL.START;
                        }
                    } else if (c368660Ecq.LJIIL - c368660Ecq.LJIIJ > 0.0f) {
                        enumC368970EdL = EnumC368970EdL.START;
                    } else {
                        enumC368970EdL = EnumC368970EdL.END;
                    }
                    c368660Ecq.LJIILIIL = enumC368970EdL;
                    int measuredWidth = c368660Ecq.LIZ.getMeasuredWidth();
                    int i = c368660Ecq.LJIILJJIL[0];
                    int i2 = C369230Edl.LIZ;
                    if (f > (measuredWidth + i) - i2) {
                        if (c368660Ecq.LJI()) {
                            enumC368970EdL2 = EnumC368970EdL.START;
                        } else {
                            enumC368970EdL2 = EnumC368970EdL.END;
                        }
                    } else if (f < i + i2) {
                        if (c368660Ecq.LJI()) {
                            enumC368970EdL2 = EnumC368970EdL.END;
                        } else {
                            enumC368970EdL2 = EnumC368970EdL.START;
                        }
                    } else {
                        float fLIZJ2 = c368660Ecq.LJIIL - c368660Ecq.LJIIJ;
                        int i3 = C368630Ecn.LLLLJI;
                        c368660Ecq.LJ();
                        int iLIZ2 = C369020EdQ.LIZ();
                        if (c368660Ecq.LJI()) {
                            left = ((c368660Ecq.LIZ.getWidth() - iLIZ2) - c368660Ecq.LIZLLL.getRight()) - c368660Ecq.LJIIL;
                            fLIZJ = C360610EBv.LIZJ();
                        } else {
                            left = (c368660Ecq.LIZLLL.getLeft() + c368660Ecq.LJIIL) - iLIZ2;
                            fLIZJ = C360610EBv.LIZJ();
                        }
                        long j = (long) (left / fLIZJ);
                        NLETrackSlot nLETrackSlot = c368660Ecq.LJIJJLI;
                        if (nLETrackSlot != null) {
                            duration = nLETrackSlot.getDuration();
                        } else {
                            duration = 0;
                        }
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j3 = (duration / j2) + j;
                        if (c368660Ecq.LJI()) {
                            left2 = (long) ((((c368660Ecq.LIZ.getWidth() - iLIZ2) - c368660Ecq.LIZLLL.getRight()) - c368660Ecq.LJIIJ) / C360610EBv.LIZJ());
                        } else {
                            left2 = (long) (((c368660Ecq.LIZLLL.getLeft() + c368660Ecq.LJIIJ) - iLIZ2) / C360610EBv.LIZJ());
                        }
                        NLETrackSlot nLETrackSlot2 = c368660Ecq.LJIJJLI;
                        if (nLETrackSlot2 != null) {
                            duration2 = nLETrackSlot2.getDuration();
                        } else {
                            duration2 = 0;
                        }
                        long j4 = (duration2 / j2) + left2;
                        if (c368660Ecq.LJIJJLI != null && (abstractC368710EcvLJFF = c368660Ecq.LJFF()) != null) {
                            EnumC368970EdL enumC368970EdL3 = c368660Ecq.LJIILIIL;
                            boolean z3 = C0E8Z.LIZ;
                            List<Long> list = abstractC368710EcvLJFF.LLILLJJLI;
                            ArrayList arrayList = new ArrayList();
                            for (Long l : list) {
                                long jLongValue = l.longValue();
                                if (enumC368970EdL3 == EnumC368970EdL.START) {
                                    if (jLongValue <= left2) {
                                        arrayList.add(l);
                                    }
                                } else if (jLongValue >= left2) {
                                    arrayList.add(l);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            long j5 = Long.MIN_VALUE;
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                boolean z4 = C0E8Z.LIZ;
                                if (!zHasNext) {
                                    break;
                                }
                                long jLongValue2 = ((Number) it2.next()).longValue();
                                if (Math.abs(jLongValue2 - j) < ((double) 100) / 1.0d) {
                                    j5 = jLongValue2 - left2;
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Long l2 : list) {
                                long jLongValue3 = l2.longValue();
                                if (enumC368970EdL3 == EnumC368970EdL.START) {
                                    if (jLongValue3 <= j4) {
                                        arrayList2.add(l2);
                                    }
                                } else if (jLongValue3 >= j4) {
                                    arrayList2.add(l2);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            long j6 = Long.MIN_VALUE;
                            while (it3.hasNext()) {
                                long jLongValue4 = ((Number) it3.next()).longValue();
                                if (Math.abs(jLongValue4 - j3) < ((double) 100) / 1.0d) {
                                    j6 = jLongValue4 - j4;
                                }
                            }
                            if (j5 != Long.MIN_VALUE && j6 != Long.MIN_VALUE) {
                                jMax = Math.min(j5, j6);
                            } else {
                                jMax = Math.max(j5, j6);
                            }
                            long jLongValue5 = Long.valueOf(jMax).longValue();
                            if (jLongValue5 != Long.MIN_VALUE) {
                                if (c368660Ecq.LJI()) {
                                    jLongValue5 = -jLongValue5;
                                }
                                fLIZJ2 = C360610EBv.LIZJ() * jLongValue5;
                                if (fLIZJ2 != 0.0f) {
                                    ((InterfaceC369250Edn) c368660Ecq.LJJIII.getValue()).LIZ(c368660Ecq.LIZ, C0E4C.VIBRATE_IMPACT_LIGHT);
                                }
                            }
                        }
                        c368660Ecq.LJIIJ += fLIZJ2;
                        c368660Ecq.LJIIIZ();
                        enumC368970EdL2 = EnumC368970EdL.NULL;
                    }
                    c368660Ecq.LJIIIIZZ(enumC368970EdL2);
                }
                int i4 = -1;
                if (c368660Ecq.LIZ.getEnableDragOnY$editor_trackpanel_release()) {
                    c368660Ecq.LJIIJJI += f3;
                    int scrollY = c368660Ecq.LIZ.getScrollY();
                    int maxTrackNum$editor_trackpanel_release = c368660Ecq.LJIILLIIL;
                    float itemHeight$editor_trackpanel_release = c368660Ecq.LJIIJJI;
                    float f4 = 0.0f;
                    if (itemHeight$editor_trackpanel_release >= 0.0f) {
                        if (itemHeight$editor_trackpanel_release > 0.0f) {
                            while (itemHeight$editor_trackpanel_release > f4) {
                                if (itemHeight$editor_trackpanel_release >= ((c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release() * 2.0f) / 3.0f) + c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release()) {
                                    maxTrackNum$editor_trackpanel_release++;
                                }
                                itemHeight$editor_trackpanel_release -= c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release() + c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release();
                                f4 = 0.0f;
                            }
                        }
                    } else {
                        while (itemHeight$editor_trackpanel_release < f4) {
                            if (itemHeight$editor_trackpanel_release <= (-(((c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release() * 2.0f) / 3.0f) + c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release()))) {
                                maxTrackNum$editor_trackpanel_release--;
                            }
                            itemHeight$editor_trackpanel_release += c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release() + c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release();
                            f4 = 0.0f;
                        }
                    }
                    if (maxTrackNum$editor_trackpanel_release >= c368660Ecq.LIZ.getMaxTrackNum$editor_trackpanel_release()) {
                        maxTrackNum$editor_trackpanel_release = c368660Ecq.LIZ.getMaxTrackNum$editor_trackpanel_release() - 1;
                    }
                    int trackCount = c368660Ecq.LIZ.getTrackCount();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (trackCount <= maxTrackNum$editor_trackpanel_release) {
                        if (c368660Ecq.LJIJ != trackCount && jUptimeMillis - c368660Ecq.LJIL >= 500) {
                            c368660Ecq.LJIL = jUptimeMillis;
                            c368660Ecq.LJIJ = trackCount;
                            iLIZ = c368660Ecq.LIZ(trackCount, scrollY);
                        } else {
                            iLIZ = 0;
                        }
                    } else {
                        if (maxTrackNum$editor_trackpanel_release < 0) {
                            maxTrackNum$editor_trackpanel_release = 0;
                        }
                        iLIZ = c368660Ecq.LIZ(maxTrackNum$editor_trackpanel_release, scrollY);
                        if (iLIZ != 0) {
                            if (jUptimeMillis - c368660Ecq.LJIL < 500) {
                                iLIZ = 0;
                            } else {
                                c368660Ecq.LJIL = jUptimeMillis;
                                c368660Ecq.LJIJ = maxTrackNum$editor_trackpanel_release;
                            }
                        } else {
                            c368660Ecq.LJIJ = maxTrackNum$editor_trackpanel_release;
                        }
                    }
                    c368660Ecq.LJIIJJI += iLIZ;
                    AbstractC368710Ecv abstractC368710EcvLJFF2 = c368660Ecq.LJFF();
                    if (abstractC368710EcvLJFF2 != null) {
                        abstractC368710EcvLJFF2.LIZLLL(c368660Ecq.LIZ, 0, iLIZ, true, c368660Ecq.LJI());
                    }
                    float bottom = c368660Ecq.LJIIJJI;
                    if (c368660Ecq.LIZ.getNullAudioTrack$editor_trackpanel_release().getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c368660Ecq.LIZ.getNullEffectTrack$editor_trackpanel_release().getVisibility() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        iLJI = c368660Ecq.LIZ.getNullAudioTrack$editor_trackpanel_release().getBottom();
                    } else if (z2) {
                        iLJI = c368660Ecq.LIZ.getNullEffectTrack$editor_trackpanel_release().getBottom();
                    } else {
                        ArrayList arrayList3 = new ArrayList(segmentParams.size());
                        Iterator<Map.Entry<NLETrackSlot, C369110EdZ>> it4 = segmentParams.entrySet().iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(it4.next().getValue());
                        }
                        Iterator it5 = arrayList3.iterator();
                        if (it5.hasNext()) {
                            int i5 = ((C369110EdZ) it5.next()).LIZ;
                            while (it5.hasNext()) {
                                int i6 = ((C369110EdZ) it5.next()).LIZ;
                                if (i5 < i6) {
                                    i5 = i6;
                                }
                            }
                            iLJI = c368660Ecq.LIZ.LJI(i5 + 1);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    int i7 = (int) bottom;
                    if (c368660Ecq.LIZLLL.getTop() + i7 <= 0) {
                        bottom = -c368660Ecq.LIZLLL.getTop();
                    } else if (c368660Ecq.LIZLLL.getBottom() + i7 >= iLJI) {
                        bottom = iLJI - c368660Ecq.LIZLLL.getBottom();
                    }
                    c368660Ecq.LJIIJJI = bottom;
                }
                C786410Ut5.ed(c368660Ecq.LIZLLL, c368660Ecq.LJIIJJI);
                C786410Ut5.ed(c368660Ecq.LJII, c368660Ecq.LJIIJJI);
                if (c368660Ecq.LJIJ < c368660Ecq.LIZ.getTrackCount()) {
                    float f5 = f - c368660Ecq.LJIILJJIL[0];
                    int i8 = c368660Ecq.LJIJ - c368660Ecq.LJIILLIIL;
                    float f6 = c368660Ecq.LJIIJJI;
                    int itemHeight$editor_trackpanel_release2 = c368660Ecq.LIZ.getItemHeight$editor_trackpanel_release();
                    int itemMargin$editor_trackpanel_release = c368660Ecq.LIZ.getItemMargin$editor_trackpanel_release();
                    int i9 = itemHeight$editor_trackpanel_release2 + itemMargin$editor_trackpanel_release;
                    if (f6 >= 0.0f) {
                        i4 = 1;
                    }
                    float f7 = i4;
                    float f8 = itemHeight$editor_trackpanel_release2;
                    float f9 = 0.33333334f * f8 * f7;
                    float f10 = f7 * ((f8 * 0.6666667f) + itemMargin$editor_trackpanel_release);
                    if (f6 >= 0.0f) {
                        float f11 = i8 * i9;
                        float f12 = f9 + f11;
                        if (f6 <= f10 + f11 && f12 <= f6) {
                            c368660Ecq.LIZ.LJII();
                            c368660Ecq.LIZLLL(segmentParams);
                            return;
                        } else {
                            c368660Ecq.LIZ.LJIIIIZZ();
                            c368660Ecq.LIZJ(f5, segmentParams);
                            return;
                        }
                    }
                    float f13 = i8 * i9;
                    float f14 = f10 + f13;
                    if (f6 <= f9 + f13 && f14 <= f6) {
                        c368660Ecq.LIZ.LJII();
                        c368660Ecq.LIZLLL(segmentParams);
                    } else if (c368660Ecq.LJIJ == 0 && (c368660Ecq.LIZLLL.getTop() + ((int) c368660Ecq.LJIIJJI) <= 0 || f6 < f14)) {
                        c368660Ecq.LIZ.LJII();
                        c368660Ecq.LIZLLL(segmentParams);
                    } else {
                        c368660Ecq.LIZ.LJIIIIZZ();
                        c368660Ecq.LIZJ(f5, segmentParams);
                    }
                }
            }
        };
        View view = interfaceC368720Ecw.getView();
        view.setOnTouchListener(new ViewOnTouchListenerC370590Efx(r4, new AwS283S0300000_5(view, interfaceC368720Ecw, this, 2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ed3] */
    public C368630Ecn(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJJ = new C368800Ed4(context) { // from class: X.0Ed3
            @Override // X.C368800Ed4
            public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4, int i) {
                super.LIZ(canvas, f, f2, f3, f4, i);
                if (((Boolean) this.LLILZIL.getValue()).booleanValue()) {
                    setDrawRightBounds(getDrawLeftBounds() + getMeasuredWidth());
                } else {
                    setDrawLeftBounds(0.0f);
                }
            }
        };
        this.LLJJI = new C368800Ed4(context, null, 0);
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1684));
        View view = new View(context);
        this.LLJJIJI = view;
        View view2 = new View(context);
        this.LLJJIJIIJIL = view2;
        View view3 = new View(context);
        this.LLJJIJIL = view3;
        View view4 = new View(context);
        this.LLJJJ = view4;
        C369030EdR.LIZJ(this, 0, getPaddingTop(), 0, getPaddingBottom());
        setClickable(true);
        C367830EbV audioCollectionTrack = getAudioCollectionTrack();
        int visibility = audioCollectionTrack.getVisibility();
        audioCollectionTrack.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, audioCollectionTrack);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(LLLLJI);
        paint.setColor(C446980Hfs.LIZ(context, R.color.a1c));
        paint.setAntiAlias(true);
        view.setBackground(C800330VaR.LIZIZ(context, R.drawable.csp));
        view.setBackground(C800330VaR.LIZIZ(context, C368130Ebz.LJIIZILJ));
        C786410Ut5.LJLLLLLL(8, view);
        Integer numLIZIZ = C368130Ebz.LIZIZ(context, Integer.valueOf(R.attr.eh));
        if (numLIZIZ != null) {
            view2.setBackgroundColor(numLIZIZ.intValue());
        }
        C786410Ut5.LJLLLLLL(8, view2);
        view3.setBackground(C800330VaR.LIZIZ(context, R.drawable.biy));
        C786410Ut5.LJLLLLLL(8, view3);
        view4.setBackground(C800330VaR.LIZIZ(context, R.drawable.bix));
        C786410Ut5.LJLLLLLL(8, view4);
        this.LLJJJJJIL = 100L;
        this.LLJLL = true;
        this.LLJLLIL = true;
        this.LLLI = new LinkedHashMap();
        this.LLLIIL = TrackShowType.NORMAL;
        this.LLLIL = C452501pT.LIZIZ(new AwS406S0200000_5(context, this, 167));
        this.LLLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1686));
        this.LLLLIILLL = true;
        this.LLLLIL = true;
        this.LLLLILI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(426));
        this.LLLLJ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1685));
    }

    public final void LJIILIIL(NLETrackSlot nLETrackSlot, C0E6E c0e6e) {
        NLEModel nLEModel;
        NLETrack nLETrackLJLLILLLL;
        VecNLETrackSlotSPtr slots;
        int iLJ = LJ(nLETrackSlot);
        if (iLJ != -1) {
            if (C351220Dpo.LLLF(nLETrackSlot)) {
                this.LLLF = true;
                getClipHelper().LJIIIZ(nLETrackSlot, this.LLLI, C0E6E.LINE);
            } else if (C351220Dpo.LLILLIZIL(nLETrackSlot) && (nLEModel = this.LLJJJIL) != null && (nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModel, nLETrackSlot.getUUID())) != null && ((C351220Dpo.LLILLL(nLETrackLJLLILLLL) || C351220Dpo.LLJILLL(nLETrackLJLLILLLL)) && (slots = nLETrackLJLLILLLL.getSlots()) != null && slots.size() > 1 && !this.LLLIILIL)) {
                this.LLL = true;
                getClipHelper().LJIIIZ(nLETrackSlot, this.LLLI, C0E6E.LINE);
            } else {
                this.LLL = false;
                this.LLLF = false;
                getClipHelper().LJIIIZ(nLETrackSlot, this.LLLI, c0e6e);
            }
            LJIIJ(iLJ);
        }
    }

    @Override // X.AbstractC368670Ecr, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i), FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2));
        if (getAudioCollectionTrack().getVisibility() == 0) {
            Set setKeySet = ((LinkedHashMap) this.LLLI).keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it2 = setKeySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (C351220Dpo.LLILLIZIL((NLETrackSlot) it2.next())) {
                        getAudioCollectionTrack().measure(LJFF((int) Math.rint((getAudioCollectionTrack().getEndTime() - getAudioCollectionTrack().getStartTime()) * C360610EBv.LIZJ())), LJFF(this.LLJJJJLIIL));
                        break;
                    }
                }
            }
            Map<NLETrackSlot, C369110EdZ> map = this.LLLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (!C351220Dpo.LLILLIZIL((NLETrackSlot) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry2.getKey();
                ((C369110EdZ) entry2.getValue()).LIZIZ.getView().measure(LJFF((int) Math.rint(((nLETimeSpaceNode.getMeasuredEndTime() - nLETimeSpaceNode.getMeasuredStartTime()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ())), LJFF(this.LLJJJJLIIL));
            }
        } else {
            for (Map.Entry entry3 : ((LinkedHashMap) this.LLLI).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) entry3.getKey();
                ((C369110EdZ) entry3.getValue()).LIZIZ.getView().measure(LJFF((int) Math.rint(((nLETimeSpaceNode2.getMeasuredEndTime() - nLETimeSpaceNode2.getMeasuredStartTime()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ())), LJFF(this.LLJJJJLIIL));
            }
        }
        if (getVisibility() == 0) {
            measure(LJFF(getNullAudioTrackCanvasWidth()), LJFF(this.LLJJJJLIIL));
        }
        if (this.LLJJI.getVisibility() == 0) {
            this.LLJJI.measure(LJFF(getNullAudioTrackCanvasWidth()), LJFF(this.LLJJJJLIIL));
        }
        Typeface typeface = C368130Ebz.LIZ;
    }

    @Override // X.AbstractC368670Ecr, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC367990Ebl abstractC367990Ebl = this.LLLJ;
        if (abstractC367990Ebl != null) {
            abstractC367990Ebl.LJIILJJIL();
        }
        this.LLLIIIIL = Math.abs((long) Math.ceil(((double) getScrollX()) / ((double) C360610EBv.LIZJ())));
        Iterator it2 = ((LinkedHashMap) this.LLLI).values().iterator();
        while (it2.hasNext()) {
            ((C369110EdZ) it2.next()).LIZIZ.LIZIZ(getScrollX());
        }
        if (getAudioCollectionTrack().getVisibility() == 0) {
            getAudioCollectionTrack().postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContext();
        int iLIZ = C369020EdQ.LIZ();
        if (getAudioCollectionTrack().getVisibility() == 0) {
            long startTime = getAudioCollectionTrack().getStartTime();
            if (LJIIIZ()) {
                int iRint = iLIZ - ((int) Math.rint(startTime * C360610EBv.LIZJ()));
                getAudioCollectionTrack().layout(iRint - getAudioCollectionTrack().getMeasuredWidth(), getPaddingTop(), iRint, getPaddingTop() + this.LLJJJJLIIL);
            } else {
                int iRint2 = ((int) Math.rint(startTime * C360610EBv.LIZJ())) + iLIZ;
                getAudioCollectionTrack().layout(iRint2, getPaddingTop(), getAudioCollectionTrack().getMeasuredWidth() + iRint2, getPaddingTop() + this.LLJJJJLIIL);
            }
            Map<NLETrackSlot, C369110EdZ> map = this.LLLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (!C351220Dpo.LLILLIZIL((NLETrackSlot) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry2.getKey();
                C369110EdZ c369110EdZ = (C369110EdZ) entry2.getValue();
                int paddingTop = getPaddingTop();
                int i5 = c369110EdZ.LIZ;
                int i6 = this.LLJJJJLIIL;
                int i7 = paddingTop + (i5 * (this.LLJJL + i6));
                int i8 = i6 + i7;
                View view = c369110EdZ.LIZIZ.getView();
                long measuredStartTime = nLETimeSpaceNode.getMeasuredStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (LJIIIZ()) {
                    int iRint3 = iLIZ - ((int) Math.rint(measuredStartTime * C360610EBv.LIZJ()));
                    view.layout(iRint3 - view.getMeasuredWidth(), i7, iRint3, i8);
                } else {
                    int iRint4 = ((int) Math.rint(measuredStartTime * C360610EBv.LIZJ())) + iLIZ;
                    view.layout(iRint4, i7, view.getMeasuredWidth() + iRint4, i8);
                }
            }
        } else {
            for (Map.Entry entry3 : ((LinkedHashMap) this.LLLI).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) entry3.getKey();
                C369110EdZ c369110EdZ2 = (C369110EdZ) entry3.getValue();
                int paddingTop2 = getPaddingTop();
                int i9 = c369110EdZ2.LIZ;
                int i10 = this.LLJJJJLIIL;
                int i11 = paddingTop2 + (i9 * (this.LLJJL + i10));
                int i12 = i10 + i11;
                View view2 = c369110EdZ2.LIZIZ.getView();
                long measuredStartTime2 = nLETimeSpaceNode2.getMeasuredStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (LJIIIZ()) {
                    int iRint5 = iLIZ - ((int) Math.rint(measuredStartTime2 * C360610EBv.LIZJ()));
                    view2.layout(iRint5 - view2.getMeasuredWidth(), i11, iRint5, i12);
                } else {
                    int iRint6 = ((int) Math.rint(measuredStartTime2 * C360610EBv.LIZJ())) + iLIZ;
                    view2.layout(iRint6, i11, view2.getMeasuredWidth() + iRint6, i12);
                }
            }
        }
        if (getVisibility() == 0) {
            C368790Ed3 c368790Ed3 = this.LLJJ;
            if (LJIIIZ()) {
                c368790Ed3.layout(iLIZ - c368790Ed3.getMeasuredWidth(), getNullTrackTopBottom().getFirst().intValue(), iLIZ, getNullTrackTopBottom().getSecond().intValue());
            } else {
                c368790Ed3.layout(iLIZ, getNullTrackTopBottom().getFirst().intValue(), c368790Ed3.getMeasuredWidth() + iLIZ, getNullTrackTopBottom().getSecond().intValue());
            }
        }
        if (this.LLJJI.getVisibility() == 0) {
            C368800Ed4 c368800Ed4 = this.LLJJI;
            if (LJIIIZ()) {
                c368800Ed4.layout(iLIZ - c368800Ed4.getMeasuredWidth(), getNullTrackTopBottom().getFirst().intValue(), iLIZ, getNullTrackTopBottom().getSecond().intValue());
            } else {
                c368800Ed4.layout(iLIZ, getNullTrackTopBottom().getFirst().intValue(), c368800Ed4.getMeasuredWidth() + iLIZ, getNullTrackTopBottom().getSecond().intValue());
            }
        }
        Typeface typeface = C368130Ebz.LIZ;
    }
}
