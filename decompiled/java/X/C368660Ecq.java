package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ecq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368660Ecq {
    public final C368630Ecn LIZ;
    public final InterfaceC368720Ecw LIZIZ;
    public final Function0<AbstractC368710Ecv> LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public final int[] LJIILJJIL;
    public final float LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public NLETrackSlot LJIJJLI;
    public long LJIL;
    public final ValueAnimator LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public EnumC368970EdL LJJII;
    public final C01GW LJJIII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1683));
    public EnumC368970EdL LJIILIIL = EnumC368970EdL.NULL;

    public final Context LJ() {
        return this.LIZ.getContext();
    }

    public final AbstractC368710Ecv LJFF() {
        return this.LIZJ.invoke();
    }

    public final boolean LJI() {
        return ((Boolean) this.LJIIIIZZ.getValue()).booleanValue();
    }

    public final void LJIIIZ() {
        float left;
        float videosLength$editor_trackpanel_release;
        int right;
        float right2;
        float videosLength$editor_trackpanel_release2;
        int left2;
        if (this.LIZ.getEnableDragOnX$editor_trackpanel_release()) {
            int i = C368630Ecn.LLLLJI;
            LJ();
            int iLIZ = C369020EdQ.LIZ();
            if (LJI()) {
                float f = iLIZ;
                if (this.LIZLLL.getRight() + this.LJIIL > f) {
                    right2 = iLIZ - this.LIZLLL.getRight();
                } else if (!this.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release()) {
                    videosLength$editor_trackpanel_release2 = f - this.LIZ.getMainVideoLength$editor_trackpanel_release();
                    if (this.LIZLLL.getLeft() + this.LJIIL < videosLength$editor_trackpanel_release2) {
                        left2 = this.LIZLLL.getLeft();
                        right2 = videosLength$editor_trackpanel_release2 - left2;
                    } else {
                        right2 = this.LJIIJ;
                    }
                } else if (this.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release()) {
                    right2 = this.LJIIJ;
                } else {
                    videosLength$editor_trackpanel_release2 = f - this.LIZ.getVideosLength$editor_trackpanel_release();
                    if (this.LIZLLL.getLeft() + this.LJIIL < videosLength$editor_trackpanel_release2) {
                        left2 = this.LIZLLL.getLeft();
                        right2 = videosLength$editor_trackpanel_release2 - left2;
                    } else {
                        right2 = this.LJIIJ;
                    }
                }
                this.LJIIIZ = right2;
            } else {
                float f2 = iLIZ;
                if (this.LIZLLL.getLeft() + this.LJIIL < f2) {
                    left = iLIZ - this.LIZLLL.getLeft();
                } else if (!this.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release()) {
                    videosLength$editor_trackpanel_release = f2 + this.LIZ.getMainVideoLength$editor_trackpanel_release();
                    if (this.LIZLLL.getRight() + this.LJIIL > videosLength$editor_trackpanel_release) {
                        right = this.LIZLLL.getRight();
                        left = videosLength$editor_trackpanel_release - right;
                    } else {
                        left = this.LJIIJ;
                    }
                } else if (this.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release()) {
                    left = this.LJIIJ;
                } else {
                    videosLength$editor_trackpanel_release = f2 + this.LIZ.getVideosLength$editor_trackpanel_release();
                    if (this.LIZLLL.getRight() + this.LJIIL > videosLength$editor_trackpanel_release) {
                        right = this.LIZLLL.getRight();
                        left = videosLength$editor_trackpanel_release - right;
                    } else {
                        left = this.LJIIJ;
                    }
                }
                this.LJIIIZ = left;
            }
            C786410Ut5.Jc(this.LIZLLL, this.LJIIIZ);
            C786410Ut5.Jc(this.LJII, this.LJIIIZ);
        }
    }

    public final void LIZLLL(Map<NLETrackSlot, C369110EdZ> map) {
        float itemHeight$editor_trackpanel_release;
        int paddingTop;
        float paddingTop2;
        NLESegment nLESegment;
        this.LJIJJ = true;
        InterfaceC369050EdT trackDragEventListener$editor_trackpanel_release = this.LIZ.getTrackDragEventListener$editor_trackpanel_release();
        if (trackDragEventListener$editor_trackpanel_release != null && !trackDragEventListener$editor_trackpanel_release.LIZ(this.LJIJ, this.LJIJJLI)) {
            this.LIZ.LJIIIIZZ();
            return;
        }
        NLETrackSlot nLETrackSlot = this.LJIJJLI;
        NLEResType type = null;
        if (nLETrackSlot != null && (nLESegment = (NLESegment) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) != null) {
            type = nLESegment.getType();
        }
        if (type == NLEResType.IMAGE || type == NLEResType.VIDEO) {
            int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
            Iterator<T> it2 = map.entrySet().iterator();
            if (it2.hasNext()) {
                int i = ((C369110EdZ) ((Map.Entry) it2.next()).getValue()).LIZ;
                while (it2.hasNext()) {
                    int i2 = ((C369110EdZ) ((Map.Entry) it2.next()).getValue()).LIZ;
                    if (i < i2) {
                        i = i2;
                    }
                }
                if (i + 1 == iIntValue) {
                    this.LJIJI = true;
                    return;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        this.LJIJI = false;
        int iRint = (int) Math.rint(this.LIZ.getMainVideoDuration() * C360610EBv.LIZJ());
        if (this.LJIIJJI >= 0.0f) {
            itemHeight$editor_trackpanel_release = ((this.LJIJ + 1) * this.LIZ.getItemHeight$editor_trackpanel_release()) + (this.LJIJ * this.LIZ.getItemMargin$editor_trackpanel_release()) + (this.LIZ.getItemMargin$editor_trackpanel_release() * 0.5f);
            paddingTop = this.LIZ.getPaddingTop();
        } else {
            if (this.LJIJ == 0) {
                paddingTop2 = this.LIZ.getPaddingTop() / 2.0f;
                View view = this.LJFF;
                C786410Ut5.LJLLLLLL(0, view);
                int i3 = C368630Ecn.LLLLJI;
                view.getContext();
                int iLIZ = C369020EdQ.LIZ();
                int i4 = (int) paddingTop2;
                view.getContext();
                view.layout(iLIZ, i4, C369020EdQ.LIZ() + iRint, C0FU0.LIZ(2.0f) + i4);
            }
            itemHeight$editor_trackpanel_release = (r2 * this.LIZ.getItemHeight$editor_trackpanel_release()) + ((this.LJIJ - 1) * this.LIZ.getItemMargin$editor_trackpanel_release()) + (this.LIZ.getItemMargin$editor_trackpanel_release() * 0.5f);
            paddingTop = this.LIZ.getPaddingTop();
        }
        paddingTop2 = itemHeight$editor_trackpanel_release + paddingTop;
        View view2 = this.LJFF;
        C786410Ut5.LJLLLLLL(0, view2);
        int i32 = C368630Ecn.LLLLJI;
        view2.getContext();
        int iLIZ2 = C369020EdQ.LIZ();
        int i42 = (int) paddingTop2;
        view2.getContext();
        view2.layout(iLIZ2, i42, C369020EdQ.LIZ() + iRint, C0FU0.LIZ(2.0f) + i42);
    }

    public final void LJIIIIZZ(EnumC368970EdL enumC368970EdL) {
        AbstractC368710Ecv abstractC368710EcvLJFF;
        if (this.LJJII == enumC368970EdL) {
            return;
        }
        this.LJJII = enumC368970EdL;
        if (enumC368970EdL == EnumC368970EdL.NULL) {
            this.LJJ.cancel();
            NLETrackSlot nLETrackSlot = this.LJIJJLI;
            if (nLETrackSlot != null && (abstractC368710EcvLJFF = LJFF()) != null) {
                abstractC368710EcvLJFF.LLILLJJLI = abstractC368710EcvLJFF.LJ(nLETrackSlot);
                return;
            }
            return;
        }
        this.LJJ.start();
        AbstractC368710Ecv abstractC368710EcvLJFF2 = LJFF();
        if (abstractC368710EcvLJFF2 == null) {
            return;
        }
        abstractC368710EcvLJFF2.LLILLJJLI = C13BV.INSTANCE;
    }

    public final int LIZ(int i, int i2) {
        int itemHeight$editor_trackpanel_release = ((this.LIZ.getItemHeight$editor_trackpanel_release() + this.LIZ.getItemMargin$editor_trackpanel_release()) * i) - i2;
        if (itemHeight$editor_trackpanel_release >= 0) {
            int paddingTop = ((this.LIZ.getPaddingTop() + ((i + 1) * (this.LIZ.getItemHeight$editor_trackpanel_release() + this.LIZ.getItemMargin$editor_trackpanel_release()))) - i2) - this.LIZ.getMeasuredHeight();
            if (paddingTop <= 0) {
                return 0;
            }
            return paddingTop;
        }
        return itemHeight$editor_trackpanel_release;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(float r26, java.util.Map<com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C369110EdZ> r27) {
        /*
            Method dump skipped, instruction units count: 1469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368660Ecq.LIZJ(float, java.util.Map):void");
    }

    public C368660Ecq(C368630Ecn c368630Ecn, InterfaceC368720Ecw interfaceC368720Ecw, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = c368630Ecn;
        this.LIZIZ = interfaceC368720Ecw;
        this.LIZJ = awS549S0100000_5;
        this.LIZLLL = interfaceC368720Ecw.getView();
        this.LJ = c368630Ecn.getPlaceHolderView$editor_trackpanel_release();
        this.LJFF = c368630Ecn.getPlugInLine$editor_trackpanel_release();
        this.LJI = c368630Ecn.getTrackGroupDragMask$editor_trackpanel_release();
        this.LJII = c368630Ecn.getSegmentDragDecorateView$editor_trackpanel_release();
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        this.LJIILJJIL = iArr;
        this.LJIILL = C368130Ebz.LJIILLIIL;
        this.LJIIZILJ = ColorProtector.parseColor("#03B1BE");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJJ = valueAnimatorOfFloat;
        this.LJJIFFI = C369230Edl.LIZ / 10;
        this.LJJII = EnumC368970EdL.NULL;
        this.LJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(425));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 46));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 36));
    }

    public static void LJII(List list, float f, Rect rect) {
        float fMin;
        float f2 = 0.0f;
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                Rect rect2 = (Rect) obj;
                float f3 = rect2.left;
                if (f <= rect2.right && f3 <= f) {
                    fMin = 0.0f;
                } else {
                    fMin = Math.min(Math.abs(f - f3), Math.abs(f - rect2.right));
                }
                if (fMin <= f2 || i == 0) {
                    rect.set(rect2);
                    f2 = fMin;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        float fLIZ;
        float fLIZJ;
        float fLIZ2;
        float fLIZJ2;
        Boolean boolValueOf;
        this.LJ.layout(i, i2, i3, i4);
        if (LJI()) {
            int i5 = C368630Ecn.LLLLJI;
            LJ();
            fLIZ = C369020EdQ.LIZ() - i3;
            fLIZJ = C360610EBv.LIZJ();
        } else {
            int i6 = C368630Ecn.LLLLJI;
            LJ();
            fLIZ = i - C369020EdQ.LIZ();
            fLIZJ = C360610EBv.LIZJ();
        }
        long j = (long) (fLIZ / fLIZJ);
        if (LJI()) {
            LJ();
            fLIZ2 = C369020EdQ.LIZ() - i;
            fLIZJ2 = C360610EBv.LIZJ();
        } else {
            LJ();
            fLIZ2 = i3 - C369020EdQ.LIZ();
            fLIZJ2 = C360610EBv.LIZJ();
        }
        long j2 = (long) (fLIZ2 / fLIZJ2);
        InterfaceC369050EdT trackDragEventListener$editor_trackpanel_release = this.LIZ.getTrackDragEventListener$editor_trackpanel_release();
        if (trackDragEventListener$editor_trackpanel_release != null) {
            boolValueOf = Boolean.valueOf(trackDragEventListener$editor_trackpanel_release.LJ(j, this.LJIJJLI, this.LJIJ, j2));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
            this.LIZ.LJII();
        }
    }
}
