package Y;

import X.C0E48;
import X.C0E4T;
import X.C0EVQ;
import X.C0FSX;
import X.C0FSY;
import X.C0FT7;
import X.C0FUG;
import X.C1149000g0Q;
import X.C1602160rnK;
import X.C1826520xdC;
import X.C1954807lC;
import X.C19748612Om;
import X.C19MB;
import X.C1C7U;
import X.C20632315oP;
import X.C21616519il;
import X.C351080Dpa;
import X.C351220Dpo;
import X.C370570Efv;
import X.C375490Enr;
import X.C379560EuQ;
import X.C384570F5z;
import X.C390330FSd;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1466150oFx;
import X.InterfaceC366660EZc;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.infinisticker.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.SpeedFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS38S0300000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) this.l0);
        c19mb.LJIIIZ(R.id.dch, 6, R.id.ukj, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Intrinsics.LJFF(((C384570F5z) this.l1).LLILZLL, Boolean.TRUE) ? 16 : 12))));
        C19748612Om.LIZ((ConstraintLayout) this.l0, (C1149000g0Q) this.l2);
        c19mb.LIZIZ((ConstraintLayout) this.l0);
    }

    public final void LIZ$1() {
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) this.l0);
        c19mb.LJIIIZ(R.id.dch, 6, R.id.tv_start_time, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Intrinsics.LJFF(((C384570F5z) this.l1).LLILZLL, Boolean.TRUE) ? 16 : 12))));
        C19748612Om.LIZ((ConstraintLayout) this.l0, (C1149000g0Q) this.l2);
        c19mb.LIZIZ((ConstraintLayout) this.l0);
    }

    public final void LIZ$2() {
        float measuredWidth;
        float fLIZIZ;
        if (((C0FSY) this.l0).LLILLL.getParent() == null) {
            return;
        }
        RectF stickerBoundingRect = ((BaseStickerModel) this.l1).getStickerBoundingRect();
        int i = C390330FSd.LIZ[((C0FSX) this.l2).ordinal()];
        if (i == 1) {
            PointF pointF = new PointF(stickerBoundingRect.centerX(), stickerBoundingRect.bottom);
            measuredWidth = pointF.x - (((C0FSY) this.l0).LLILLL.getMeasuredWidth() / 2);
            fLIZIZ = pointF.y + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            PointF pointF2 = new PointF(stickerBoundingRect.centerX(), stickerBoundingRect.top);
            measuredWidth = pointF2.x - (((C0FSY) this.l0).LLILLL.getMeasuredWidth() / 2);
            fLIZIZ = (pointF2.y - ((C0FSY) this.l0).LLILLL.getMeasuredHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (((C0FSY) this.l0).LLILLL.getParent() != null) {
            C786410Ut5.Jd(((C0FSY) this.l0).LLILLL, measuredWidth);
            C786410Ut5.Od(((C0FSY) this.l0).LLILLL, fLIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$3() {
        ((SpeedFragment) this.l1).lT().setSelectedAt((((SpeedViewModel) ((SpeedFragment) this.l1).wS()).hasSelectedCurveSpeed() && ((SpeedViewModel) ((SpeedFragment) this.l1).wS()).getCurveSpeedEnabled()) ? 1 : 0);
        ((SpeedFragment) this.l1).mT().LLLILZLLLI().bS(((SpeedFragment) this.l1).LL);
        SpeedFragment speedFragment = (SpeedFragment) this.l1;
        NLETrackSlot nLETrackSlot = ((C351080Dpa) this.l2).LIZ;
        boolean z = nLETrackSlot != null && C351220Dpo.LLJJIJIL(nLETrackSlot);
        if (((SpeedViewModel) speedFragment.wS()).getCurveSpeedEnabled()) {
            C370570Efv c370570EfvUR = speedFragment.mT().LLLJ().UR();
            if (c370570EfvUR != null) {
                c370570EfvUR.setHandleMasked(z);
            }
            speedFragment.mT().LLLILZLLLI().LLJILJIL = !z;
            C1826520xdC c1826520xdCLT = speedFragment.lT();
            float f = !z ? 1.0f : 0.4f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1826520xdCLT);
            c1826520xdCLT.setAlpha(f);
            C20632315oP c20632315oPNT = speedFragment.nT();
            float f2 = z ? 0.4f : 1.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oPNT);
            c20632315oPNT.setAlpha(f2);
            View viewFindViewById = speedFragment.LLLIIII;
            if (viewFindViewById == null) {
                View view = speedFragment.getView();
                viewFindViewById = view != null ? view.findViewById(R.id.h3x) : null;
                speedFragment.LLLIIII = (FrameLayout) viewFindViewById;
            }
            C786410Ut5.LJZ(z ? 0 : 8, (FrameLayout) viewFindViewById);
        }
    }

    public static final void run$0(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("RecordInfiniStickerComponent@b09b.addStickerChangeListenerByType$1");
        try {
            C0FT7 c0ft7 = ((b) aRunnableS38S0300000_5.l0).LLJLILLLLZIIL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            c0ft7.k2((EnumC1466150oFx) aRunnableS38S0300000_5.l1, (C0FUG) aRunnableS38S0300000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordInfiniStickerComponent@b09b.addStickerChangeListenerByType$1");
    }

    public static final void run$1(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("SubtitleAdapter$CaptionViewHolderV2@d452.bind$3$1");
        try {
            aRunnableS38S0300000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubtitleAdapter$CaptionViewHolderV2@d452.bind$3$1");
    }

    public static final void run$2(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("SubtitleAdapter$CaptionViewHolderV2@d452.bind$5$1");
        try {
            aRunnableS38S0300000_5.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubtitleAdapter$CaptionViewHolderV2@d452.bind$5$1");
    }

    public static final void run$3(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("CropAlignComponent@a185.showCover$1$1");
        try {
            ((C375490Enr) aRunnableS38S0300000_5.l0).w2((Bitmap) aRunnableS38S0300000_5.l1, (Function0) aRunnableS38S0300000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CropAlignComponent@a185.showCover$1$1");
    }

    public static final void run$4(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EditorProSlideComponent@f1d1.showSlideGuide$1$2");
        try {
            C0EVQ c0evq = (C0EVQ) aRunnableS38S0300000_5.l0;
            c0evq.LLILLL.cancel();
            int visibility = c0evq.getVisibility();
            c0evq.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0evq);
            C786410Ut5.LJJJLZIJ((C0EVQ) aRunnableS38S0300000_5.l0, (ViewGroup) aRunnableS38S0300000_5.l1);
            ((C379560EuQ) aRunnableS38S0300000_5.l2).LLJJJ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorProSlideComponent@f1d1.showSlideGuide$1$2");
    }

    public static final void run$5(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGuide@28fc.updateGuide$1");
        try {
            aRunnableS38S0300000_5.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGuide@28fc.updateGuide$1");
    }

    public static final void run$6(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.startCompileDelay$2");
        try {
            AudioRecordActivityViewModel audioRecordActivityViewModel = (AudioRecordActivityViewModel) aRunnableS38S0300000_5.l0;
            audioRecordActivityViewModel.LLIZ = false;
            audioRecordActivityViewModel.xQ2((VideoPublishEditModel) aRunnableS38S0300000_5.l2, (C0E48) aRunnableS38S0300000_5.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.startCompileDelay$2");
    }

    public static final void run$7(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBubbleView@25.showAnim$1$1");
        try {
            ((C21616519il) aRunnableS38S0300000_5.l0).LJIIIZ();
            ((C21616519il) aRunnableS38S0300000_5.l1).LJIIIZ();
            C786410Ut5.Pd((ObjectAnimator) aRunnableS38S0300000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBubbleView@25.showAnim$1$1");
    }

    public static final void run$8(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("SpeedFragment@af67.initListener$4$onChanged$lambda$1$$inlined$doOnPreDraw$1");
        try {
            aRunnableS38S0300000_5.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpeedFragment@af67.initListener$4$onChanged$lambda$1$$inlined$doOnPreDraw$1");
    }

    public static final void run$9(ARunnableS38S0300000_5 aRunnableS38S0300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateApplier@dfb.renderSticker$runnable$1$1");
        try {
            ((InterfaceC366660EZc) aRunnableS38S0300000_5.l0).d10(true, (C0E4T) aRunnableS38S0300000_5.l1, (NLEModel) aRunnableS38S0300000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateApplier@dfb.renderSticker$runnable$1$1");
    }

    public ARunnableS38S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
