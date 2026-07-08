package X;

import Y.AObjectS240S0100000_5;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0EqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC377080EqQ extends AbstractC383800F3a implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C19A3 LL;
    public final InterfaceC361710EGb LLILLJJLI;
    public final C1DRG LLILLL;
    public NLETrackSlot LLILZ;
    public C0FFE<? extends StickerModel> LLILZIL;
    public final C1664740tQG LLIZ;
    public long LLILZLL = -1;
    public final AObjectS240S0100000_5 LLIZLLLIL = new AObjectS240S0100000_5(this, 132);
    public final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC377080EqQ.class, "stickerEngineApi", "getStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC385780FAq
    public final boolean LJJIJIL() {
        return true;
    }

    public abstract C0FFE<StickerModel> LJJJJLI(String str);

    public final C0E48 LJJJJJ() {
        return C349830DnZ.LIZ(this.LLILLL);
    }

    public final C0EOK LJJJJLL() {
        return (C0EOK) this.LLIZ.getValue(this, LLJIJIL[0]);
    }

    public final boolean LJJJLIIL() {
        NLETrackSlot nLETrackSlot = this.LLILZ;
        return nLETrackSlot != null && this.LLILZLL >= 0 && nLETrackSlot.getStartTime() <= this.LLILZLL && nLETrackSlot.getEndTime() >= this.LLILZLL;
    }

    public final void LJJJLL() {
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ;
        LiveState<BaseStickerModel> liveState;
        C0FFE<? extends StickerModel> c0ffe = this.LLILZIL;
        if (c0ffe != null && (c1664680tQALJJIJ = c0ffe.LJJIJ()) != null && (liveState = c1664680tQALJJIJ.LJI) != null) {
            liveState.LIZIZ(this.LLIZLLLIL);
        }
        this.LLILZIL = null;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZLLL() {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL;
        return LJJJLIIL() && (gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL()) != null && gestureLayout$OnGestureListenerLJJJJIZL.LIZLLL();
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJ() {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL;
        return LJJJLIIL() && (gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL()) != null && gestureLayout$OnGestureListenerLJJJJIZL.LJ();
    }

    public final void LJJJJ() {
        String uuid;
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ;
        LiveState<BaseStickerModel> liveState;
        LJJJLL();
        NLETrackSlot nLETrackSlot = this.LLILZ;
        if (nLETrackSlot == null || (uuid = nLETrackSlot.getUUID()) == null) {
            return;
        }
        C0FFE<StickerModel> c0ffeLJJJJLI = LJJJJLI(uuid);
        this.LLILZIL = c0ffeLJJJJLI;
        if (c0ffeLJJJJLI == null || (c1664680tQALJJIJ = c0ffeLJJJJLI.LJJIJ()) == null || (liveState = c1664680tQALJJIJ.LJI) == null) {
            return;
        }
        liveState.LIZ(this.LL, this.LLIZLLLIL);
    }

    public final GestureLayout$OnGestureListener LJJJJIZL() {
        C0EOK c0eokLJJJJLL = LJJJJLL();
        if (c0eokLJJJJLL != null) {
            return c0eokLJJJJLL.ac();
        }
        return null;
    }

    public int LJJJJJL() {
        return this.LLJ;
    }

    public int LJJJJL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        C0E55 player;
        if (!LJJJLIIL()) {
            return false;
        }
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null && (player = c0e48LJJJJJ.getPlayer()) != null) {
            player.pause(false);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.E2(c21645419nQ)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        C0E55 player;
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null && (player = c0e48LJJJJJ.getPlayer()) != null) {
            player.pause(false);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.LIZIZ(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL != null) {
            gestureLayout$OnGestureListenerLJJJJIZL.LJFF(bVar);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL != null) {
            gestureLayout$OnGestureListenerLJJJJIZL.LJIIIZ(f);
            return true;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJIJJ(MotionEvent motionEvent) {
        Integer numValueOf;
        LJJJLZIJ(this.LLILZ);
        List listLJIIJJI = C1697810uHb.LJIIJJI(3, 1);
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            numValueOf = null;
        }
        if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
            InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
            Boolean bool = Boolean.FALSE;
            interfaceC361710EGb.Kq2(null, bool, bool, bool);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJJIJIIJIL(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL != null) {
            gestureLayout$OnGestureListenerLJJJJIZL.LJJIJIIJIL(motionEvent);
        }
    }

    @Override // X.AbstractC383800F3a
    public final void LJJJ(long j) {
        this.LLILZLL = j;
        NLETrackSlot nLETrackSlot = this.LLILZ;
        if (nLETrackSlot == null) {
            return;
        }
        long startTime = nLETrackSlot.getStartTime();
        if (j <= nLETrackSlot.getEndTime() && startTime <= j) {
            this.LLILLJJLI.Kq2(Boolean.TRUE, null, null, null);
        } else {
            this.LLILLJJLI.Kq2(Boolean.FALSE, null, null, null);
        }
    }

    @Override // X.AbstractC383800F3a
    public final void LJJJI(NLEModel nLEModel) {
        NLETrackSlot nLETrackSlotLIZ;
        NLETrackSlot nLETrackSlot = this.LLILZ;
        if (nLETrackSlot == null) {
            return;
        }
        if (nLEModel != null) {
            nLETrackSlotLIZ = C346680DiU.LIZ(nLEModel, nLETrackSlot.getUUID());
        } else {
            nLETrackSlotLIZ = null;
        }
        this.LLILZ = nLETrackSlotLIZ;
        if (nLETrackSlotLIZ == null) {
            this.LLILLJJLI.tK2(null);
            InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
            Boolean bool = Boolean.FALSE;
            interfaceC361710EGb.Kq2(bool, bool, bool, bool);
            LJJJLL();
            return;
        }
        LJJJJ();
        LJJJLZIJ(this.LLILZ);
    }

    @Override // X.AbstractC383800F3a
    public final void LJJJIL(NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot;
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null) {
            trackBySlot = C350870DpF.LJI(c0e48LJJJJJ).getTrackBySlot(nLETrackSlot);
        } else {
            trackBySlot = null;
        }
        if (!LJJIL(trackBySlot, nLETrackSlot)) {
            this.LLILZ = null;
            this.LLILLJJLI.tK2(null);
            InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
            Boolean bool = Boolean.FALSE;
            interfaceC361710EGb.Kq2(bool, bool, bool, bool);
            LJJJLL();
            return;
        }
        this.LLILZ = nLETrackSlot;
        LJJJJ();
        LJJJLZIJ(nLETrackSlot);
    }

    public final void LJJJLZIJ(NLETrackSlot nLETrackSlot) {
        C0EO0 c0eo0LJJJJZ;
        if (nLETrackSlot == null || (c0eo0LJJJJZ = LJJJJZ(nLETrackSlot, false)) == null) {
            return;
        }
        this.LLILLJJLI.tK2(c0eo0LJJJJZ);
        long startTime = nLETrackSlot.getStartTime();
        long endTime = nLETrackSlot.getEndTime();
        long j = this.LLILZLL;
        if (startTime <= j && j <= endTime) {
            this.LLILLJJLI.Kq2(Boolean.TRUE, null, null, null);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        if (!LJJJLIIL()) {
            return false;
        }
        this.LLILLJJLI.Kq2(null, null, Boolean.TRUE, null);
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.LJJLIIIJLJLI(f)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL != null) {
            gestureLayout$OnGestureListenerLJJJJIZL.LLLLJI(f);
            return true;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        if (!LJJJLIIL()) {
            return false;
        }
        this.LLILLJJLI.Kq2(null, null, Boolean.TRUE, null);
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.LLLZLZ(bVar)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL;
        if (!LJJJLIIL() || (gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL()) == null || !gestureLayout$OnGestureListenerLJJJJIZL.onDown(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!LJJJLIIL()) {
            return false;
        }
        this.LLILLJJLI.Kq2(null, null, Boolean.TRUE, null);
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.onScale(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C0E55 player;
        if (!LJJJLIIL()) {
            return false;
        }
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null && (player = c0e48LJJJJJ.getPlayer()) != null) {
            player.pause(false);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.onScaleBegin(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C0E55 player;
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null && (player = c0e48LJJJJJ.getPlayer()) != null) {
            player.pause(false);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.onSingleTapConfirmed(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.onSingleTapUp(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL != null) {
            gestureLayout$OnGestureListenerLJJJJIZL.onTouchEvent(motionEvent);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL;
        if (!LJJJLIIL() || (gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL()) == null || !gestureLayout$OnGestureListenerLJJJJIZL.onUp(motionEvent)) {
            return false;
        }
        return true;
    }

    public final C0EO0 LJJJJZ(NLETrackSlot nLETrackSlot, boolean z) {
        String uuid;
        C0EOK c0eokLJJJJLL;
        StickerModel stickerModelTP0;
        Size sizeLIZJ;
        Size sizeLIZJ2;
        float width;
        float width2;
        float height;
        float translateY;
        float f;
        if (nLETrackSlot == null || (uuid = nLETrackSlot.getUUID()) == null || (c0eokLJJJJLL = LJJJJLL()) == null || (stickerModelTP0 = c0eokLJJJJLL.tP0(uuid)) == null) {
            return null;
        }
        BaseStickerModel baseModel = stickerModelTP0.getBaseModel();
        Size sizeLIZJ3 = this.LLILLJJLI.CY1().LIZJ();
        if (sizeLIZJ3 == null || (sizeLIZJ = this.LLILLJJLI.getCanvasSize().LIZJ()) == null || (sizeLIZJ2 = this.LLILLJJLI.uc2().LIZJ()) == null || C363770ENz.LIZJ(sizeLIZJ, sizeLIZJ3, sizeLIZJ2)) {
            return null;
        }
        float width3 = sizeLIZJ.getWidth() / sizeLIZJ3.getWidth();
        int width4 = (sizeLIZJ2.getWidth() - sizeLIZJ.getWidth()) / 2;
        if (z) {
            width2 = sizeLIZJ3.getWidth() / 2;
            width = baseModel.getTranslateX();
        } else {
            width = (sizeLIZJ.getWidth() / 2) + (baseModel.getTranslateX() * width3);
            width2 = width4;
        }
        float f2 = width2 + width;
        if (z) {
            height = sizeLIZJ3.getHeight() / 2;
            translateY = baseModel.getTranslateY();
        } else {
            height = sizeLIZJ.getHeight() / 2;
            translateY = baseModel.getTranslateY() * width3;
        }
        float f3 = height + translateY;
        float width5 = baseModel.getWidth() * baseModel.getScale();
        if (z) {
            f = 1.0f;
        } else {
            f = width3;
        }
        float f4 = width5 * f;
        float height2 = baseModel.getHeight() * baseModel.getScale();
        if (z) {
            width3 = 1.0f;
        }
        return new C0EO0(f4 + LJJJJJL(), (height2 * width3) + LJJJJL(), f2, f3, baseModel.getRotation(), nLETrackSlot.getStartTime(), nLETrackSlot.getEndTime());
    }

    public boolean LJJJJZI(MotionEvent motionEvent, NLETrackSlot nLETrackSlot) {
        C0EO0 c0eo0LJJJJZ = LJJJJZ(nLETrackSlot, true);
        if (c0eo0LJJJJZ == null) {
            return false;
        }
        return C363770ENz.LIZLLL(c0eo0LJJJJZ, motionEvent);
    }

    public AbstractC377080EqQ(C372480Ej0 c372480Ej0, C385710FAj c385710FAj, C1DRG c1drg) {
        this.LL = c372480Ej0;
        this.LLILLJJLI = c385710FAj;
        this.LLILLL = c1drg;
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        c385710FAj.getCanvasSize().LJIIIZ(c372480Ej0, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 723));
    }

    @Override // X.AbstractC383800F3a
    public final boolean LJJIJL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        return LJJJJI(nLETrack, nLETrackSlot, motionEvent);
    }

    @Override // X.AbstractC383800F3a
    public final boolean LJJIJLIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        return LJJJJI(nLETrack, nLETrackSlot, motionEvent);
    }

    public final boolean LJJJJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        if (nLETrackSlot.getStartTime() > this.LLILZLL || nLETrackSlot.getEndTime() < this.LLILZLL || !LJJIL(nLETrack, nLETrackSlot)) {
            return false;
        }
        return LJJJJZI(motionEvent, nLETrackSlot);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        C0E55 player;
        if (!LJJJLIIL()) {
            return false;
        }
        C0E48 c0e48LJJJJJ = LJJJJJ();
        if (c0e48LJJJJJ != null && (player = c0e48LJJJJJ.getPlayer()) != null) {
            player.pause(false);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListenerLJJJJIZL = LJJJJIZL();
        if (gestureLayout$OnGestureListenerLJJJJIZL == null || !gestureLayout$OnGestureListenerLJJJJIZL.LLLLLLLLL(bVar, f, f2)) {
            return false;
        }
        return true;
    }
}
