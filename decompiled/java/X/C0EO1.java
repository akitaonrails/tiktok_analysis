package X;

import android.graphics.PointF;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0EO1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EO1 extends AbstractC383800F3a implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C19A3 LL;
    public final InterfaceC361710EGb LLILLJJLI;
    public final C1DRG LLILLL;
    public NLETrackSlot LLILZ;
    public NLETrack LLILZIL;
    public long LLILZLL = -1;
    public final C054G LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664750tQH LLJI;
    public final C1664740tQG LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public Float LLJILLL;
    public final C0EO2 LLJJ;
    public final C0ZDN LLJJI;
    public double LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final NLEEditor LLJJJ;
    public final C0ELW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EO1.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EO1.class, "keyFrameAPI", "getKeyFrameAPI()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EO1.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C0EO4 LJJJJI() {
        C0EOH c0eohJa;
        C0EOK c0eok = (C0EOK) this.LLJ.getValue(this, LLJJJJ[0]);
        if (c0eok == null || (c0eohJa = c0eok.Ja()) == null) {
            return null;
        }
        return c0eohJa.LIZIZ();
    }

    public final C0E48 LJJJJIZL() {
        return C349830DnZ.LIZ(this.LLILLL);
    }

    public final NLEModel LJJJJJ() {
        if (this.LLJJIJI || this.LLJJIJIIJIL || this.LLJJIJIL) {
            return this.LLJJJ.getModel();
        }
        C0E48 c0e48LJJJJIZL = LJJJJIZL();
        if (c0e48LJJJJIZL != null) {
            return C350870DpF.LJI(c0e48LJJJJIZL);
        }
        return null;
    }

    public final boolean LJJJJL() {
        return ((Boolean) this.LLJILJIL.getValue()).booleanValue();
    }

    public final boolean LJJJJLL() {
        C0E55 player;
        NLETrackSlot nLETrackSlot = this.LLILZ;
        if (nLETrackSlot == null || this.LLILZLL < 0 || nLETrackSlot.getStartTime() > this.LLILZLL || nLETrackSlot.getEndTime() < this.LLILZLL) {
            return false;
        }
        C0E48 c0e48LJJJJIZL = LJJJJIZL();
        if (c0e48LJJJJIZL == null || (player = c0e48LJJJJIZL.getPlayer()) == null) {
            return true;
        }
        player.pause(false);
        return true;
    }

    @Override // X.AbstractC383800F3a
    public final C0ELW LJJIZ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        return LJJJJLL();
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        C0E55 player;
        C0E48 c0e48LJJJJIZL = LJJJJIZL();
        if (c0e48LJJJJIZL != null && (player = c0e48LJJJJIZL.getPlayer()) != null) {
            player.pause(false);
        }
        return LJJJJLI(motionEvent, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f8  */
    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EO1.LJIJJ(android.view.MotionEvent):void");
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
        if (C351220Dpo.LLF(nLETrackSlot) || C351220Dpo.LLIIIJ(nLETrackSlot)) {
            LJJJJZ(this.LLILZIL, this.LLILZ);
        }
    }

    @Override // X.AbstractC383800F3a
    public final void LJJJI(NLEModel nLEModel) {
        NLETrackSlot nLETrackSlotLIZ;
        NLETrack trackBySlot;
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
        if (nLEModel != null) {
            trackBySlot = nLEModel.getTrackBySlot(nLETrackSlotLIZ);
        } else {
            trackBySlot = null;
        }
        this.LLILZIL = trackBySlot;
        NLETrackSlot nLETrackSlot2 = this.LLILZ;
        if (nLETrackSlot2 == null) {
            this.LLILLJJLI.tK2(null);
            InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
            Boolean bool = Boolean.FALSE;
            interfaceC361710EGb.Kq2(bool, bool, bool, bool);
            return;
        }
        LJJJJZ(trackBySlot, nLETrackSlot2);
    }

    @Override // X.AbstractC383800F3a
    public final void LJJJIL(NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot;
        NLEModel nLEModelLJJJJJ = LJJJJJ();
        if (nLEModelLJJJJJ != null) {
            trackBySlot = nLEModelLJJJJJ.getTrackBySlot(nLETrackSlot);
        } else {
            trackBySlot = null;
        }
        if (!LJJIL(trackBySlot, nLETrackSlot)) {
            this.LLILZ = null;
            this.LLILZIL = null;
            this.LLILLJJLI.tK2(null);
            InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
            Boolean bool = Boolean.FALSE;
            interfaceC361710EGb.Kq2(bool, bool, bool, bool);
            return;
        }
        LJJJJZ(trackBySlot, nLETrackSlot);
    }

    public final boolean LJJJJJL(String str) {
        C0E2C c0e2cLIZIZ;
        C0E48 c0e48LJJJJIZL = LJJJJIZL();
        if (c0e48LJJJJIZL != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LJJJJIZL, (C0EB6) this.LLJIJIL.getValue(this, LLJJJJ[2]))) != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, str)) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        NLETrackSlot nLETrackSlot = this.LLILZ;
        if (nLETrackSlot == null) {
            return false;
        }
        this.LLJJIJIL = true;
        InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
        Boolean bool = Boolean.TRUE;
        interfaceC361710EGb.Kq2(null, bool, bool, null);
        this.LLJJIII += Math.toDegrees(f);
        if (nLETrackSlot.getRotation() != ((float) (((double) nLETrackSlot.getRotation()) + this.LLJJIII))) {
            this.LLILLJJLI.Kq2(null, null, null, bool);
            AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLIZLLLIL = C23250099c.LIZLLL(this.LLIZ, null, null, new C314600CUw(this, null), 3);
            float fLIZIZ = this.LLJJ.LIZIZ(-nLETrackSlot.getRotation(), -((float) this.LLJJIII), 90);
            if (!C351220Dpo.LLF(nLETrackSlot) && !C351220Dpo.LLFF(nLETrackSlot, NLEKeyframeType.Video)) {
                fLIZIZ = C363770ENz.LJ(fLIZIZ);
            }
            float f2 = -fLIZIZ;
            if (nLETrackSlot.getRotation() != f2 && Math.abs(f2) % 90 == 0.0f) {
                this.LLJJI.LIZ(0);
            }
            nLETrackSlot.setRotation(f2);
            this.LLJJIII = 0.0d;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        NLETrackSlot nLETrackSlot;
        Size sizeLIZJ;
        if (bVar.LJIIL <= 1 && (nLETrackSlot = this.LLILZ) != null && (sizeLIZJ = this.LLILLJJLI.getCanvasSize().LIZJ()) != null) {
            int width = sizeLIZJ.getWidth();
            Size sizeLIZJ2 = this.LLILLJJLI.getCanvasSize().LIZJ();
            if (sizeLIZJ2 != null) {
                int height = sizeLIZJ2.getHeight();
                this.LLJJIJI = true;
                InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
                Boolean bool = Boolean.TRUE;
                interfaceC361710EGb.Kq2(null, bool, bool, null);
                PointF pointF = new PointF(nLETrackSlot.getTransformX(), nLETrackSlot.getTransformY());
                PointF pointF2 = bVar.LJIIJJI;
                PointF pointFLIZ = this.LLJJ.LIZ(pointF, new PointF(pointF2.x / width, pointF2.y / height));
                NLETrackSlot nLETrackSlot2 = this.LLILZ;
                if (nLETrackSlot2 != null) {
                    nLETrackSlot2.setTransformX(pointFLIZ.x);
                }
                NLETrackSlot nLETrackSlot3 = this.LLILZ;
                if (nLETrackSlot3 != null) {
                    nLETrackSlot3.setTransformY(pointFLIZ.y);
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Float fValueOf;
        if (!this.LLJJIJIIJIL) {
            NLETrackSlot nLETrackSlot = this.LLILZ;
            if (nLETrackSlot != null) {
                fValueOf = Float.valueOf(nLETrackSlot.getScale());
            } else {
                fValueOf = null;
            }
            this.LLJILLL = fValueOf;
        }
        this.LLJJIJIIJIL = true;
        InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
        Boolean bool = Boolean.TRUE;
        interfaceC361710EGb.Kq2(null, bool, bool, null);
        NLETrackSlot nLETrackSlot2 = this.LLILZ;
        if (nLETrackSlot2 != null) {
            nLETrackSlot2.setScale(nLETrackSlot2.getScale() * scaleGestureDetector.getScaleFactor());
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return LJJJJLL();
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C0E55 player;
        C0E48 c0e48LJJJJIZL = LJJJJIZL();
        if (c0e48LJJJJIZL != null && (player = c0e48LJJJJIZL.getPlayer()) != null) {
            player.pause(false);
        }
        return LJJJJLI(motionEvent, this.LLILZ);
    }

    @Override // X.AbstractC383800F3a
    public final boolean LJJIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (nLETrack == null || nLETrackSlot == null || nLETrack.getTrackType() != NLETrackType.VIDEO || C351220Dpo.LLJJI(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    public final boolean LJJJJLI(MotionEvent motionEvent, NLETrackSlot nLETrackSlot) {
        C0EO0 c0eo0LIZIZ = C363770ENz.LIZIZ(nLETrackSlot, this.LLILLJJLI.getCanvasSize().LIZJ(), this.LLILLJJLI.uc2().LIZJ());
        if (c0eo0LIZIZ == null) {
            return false;
        }
        return C363770ENz.LIZLLL(c0eo0LIZIZ, motionEvent);
    }

    public final void LJJJJZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        C0E48 c0e48LJJJJIZL;
        InterfaceC351610DqR interfaceC351610DqROg;
        if (nLETrackSlot != null && nLETrack != null && ((C351220Dpo.LLF(nLETrackSlot) || C351220Dpo.LLIIIJ(nLETrackSlot)) && (c0e48LJJJJIZL = LJJJJIZL()) != null && (interfaceC351610DqROg = c0e48LJJJJIZL.og()) != null)) {
            interfaceC351610DqROg.LLIFFJFJJ(this.LLILZLL, nLETrack, nLETrackSlot);
        }
        C0EO0 c0eo0LIZIZ = C363770ENz.LIZIZ(nLETrackSlot, this.LLILLJJLI.getCanvasSize().LIZJ(), this.LLILLJJLI.uc2().LIZJ());
        if (c0eo0LIZIZ == null) {
            return;
        }
        this.LLILZ = nLETrackSlot;
        this.LLILZIL = nLETrack;
        this.LLILLJJLI.tK2(c0eo0LIZIZ);
        NLETrackSlot nLETrackSlot2 = this.LLILZ;
        if (nLETrackSlot2 == null) {
            return;
        }
        long startTime = nLETrackSlot2.getStartTime();
        long endTime = nLETrackSlot2.getEndTime();
        long j = this.LLILZLL;
        boolean z = true;
        if (startTime <= j && j <= endTime) {
            NLETrack nLETrack2 = this.LLILZIL;
            if ((nLETrack2 == null || !C351220Dpo.LLLIIL(nLETrack2)) && C352250DrT.LJIILIIL(nLETrackSlot2)) {
                z = false;
            }
            this.LLILLJJLI.Kq2(Boolean.valueOf(z), null, null, null);
        }
    }

    public C0EO1(C372480Ej0 c372480Ej0, C385710FAj c385710FAj, C1DRG c1drg) {
        this.LL = c372480Ej0;
        this.LLILLJJLI = c385710FAj;
        this.LLILLL = c1drg;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, C0ENB.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, C0EB6.class, null);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 824));
        C0EO2 c0eo2 = new C0EO2();
        float fLIZIZ = C418440Gaw.LIZIZ(3) / C1415610mwR.LIZIZ();
        float fLIZIZ2 = C418440Gaw.LIZIZ(3) / C1415610mwR.LIZIZ();
        c0eo2.LJII = fLIZIZ;
        c0eo2.LJIIIIZZ = fLIZIZ2;
        c0eo2.LJIIIZ = 5.0f;
        c0eo2.LJIIJ = -1.0f;
        this.LLJJ = c0eo2;
        this.LLJJI = new C0ZDN(C0CHQ.LIZ);
        this.LLJJJ = C346630DiP.LIZ();
        this.LLJJJIL = C0ELW.VIDEO;
        c385710FAj.getCanvasSize().LJIIIZ(c372480Ej0, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 724));
    }

    @Override // X.AbstractC383800F3a
    public final boolean LJJIJL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        return LJJJJ(nLETrack, nLETrackSlot, motionEvent);
    }

    @Override // X.AbstractC383800F3a
    public final boolean LJJIJLIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        if ((!LJJJJJL("free_layer_panel") || !nLETrack.getMainTrack()) && !LJJJJJL("retouch_panel")) {
            return LJJJJ(nLETrack, nLETrackSlot, motionEvent);
        }
        return false;
    }

    public final boolean LJJJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        if (nLETrackSlot.getStartTime() > this.LLILZLL || nLETrackSlot.getEndTime() < this.LLILZLL || !LJJIL(nLETrack, nLETrackSlot)) {
            return false;
        }
        return LJJJJLI(motionEvent, nLETrackSlot);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        return LJJJJLL();
    }
}
