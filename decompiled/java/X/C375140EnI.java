package X;

import Y.ARunnableS4S0500000_5;
import Y.ARunnableS74S0200000_5;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375140EnI implements InterfaceC375300EnY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1505));
    public final NLEEditor LLIZ;
    public FrameLayout LLIZLLLIL;
    public InterfaceC375350End LLJ;
    public NLETrackSlot LLJI;
    public Pair<Integer, Integer> LLJIJIL;
    public C389830FQf LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public final Matrix LLJJIII;
    public final Rect LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public EnumC375190EnN LLJJJ;
    public float LLJJJIL;
    public Pair<Float, Float> LLJJJJ;
    public ValueAnimator LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C375140EnI.class, "previewApiComponent", "getPreviewApiComponent()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/preview/api/CropPreviewApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C375140EnI.class, "nleCropApiComponent", "getNleCropApiComponent()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/api/NLECropApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C375140EnI.class, "bottomApiComponent", "getBottomApiComponent()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C375140EnI.class, "cropPanelApiComponent", "getCropPanelApiComponent()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/croppanel/CropPanelApiComponent;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC375300EnY
    public final void LIZ(Canvas canvas) {
    }

    @Override // X.InterfaceC375300EnY
    public final void LIZIZ(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        return true;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIILIIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        return false;
    }

    public final InterfaceC374920Emw LJIJ() {
        return (InterfaceC374920Emw) this.LLILLL.getValue(this, LLJJJJLIIL[1]);
    }

    public final void LJJI() {
        C389830FQf c389830FQf;
        Rect rect;
        NLETrackSlot nLETrackSlot = this.LLJI;
        if (nLETrackSlot == null || (c389830FQf = this.LLJILJIL) == null || (rect = c389830FQf.getRect()) == null) {
            return;
        }
        if (this.LLJJIJI.width() < rect.width() || this.LLJJIJI.height() < rect.height()) {
            C375260EnU.LIZLLL(nLETrackSlot, 0.0f, 0.0f, Math.max(rect.width() / this.LLJJIJI.width(), rect.height() / this.LLJJIJI.height()));
        }
        LJJIFFI();
        if (this.LLJJIJI.left > rect.left) {
            C375260EnU.LJ(nLETrackSlot, (r0 - r1) / this.LLJIJIL.getFirst().intValue(), 0.0f);
        }
        if (this.LLJJIJI.right < rect.right) {
            C375260EnU.LJ(nLETrackSlot, (r0 - r1) / this.LLJIJIL.getFirst().intValue(), 0.0f);
        }
        if (this.LLJJIJI.top > rect.top) {
            C375260EnU.LJ(nLETrackSlot, 0.0f, (r0 - r1) / this.LLJIJIL.getSecond().intValue());
        }
        if (this.LLJJIJI.bottom < rect.bottom) {
            C375260EnU.LJ(nLETrackSlot, 0.0f, (r0 - r1) / this.LLJIJIL.getSecond().intValue());
        }
    }

    public final void LJJIFFI() {
        Rect rectLJIIJJI = LJIIJJI(this.LLJI);
        if (rectLJIIJJI != null) {
            this.LLJJIJI.set(rectLJIIJJI.left, rectLJIIJJI.top, rectLJIIJJI.right, rectLJIIJJI.bottom);
        }
    }

    public final boolean LJIIL() {
        Rect rect;
        LJJIFFI();
        C389830FQf c389830FQf = this.LLJILJIL;
        if (c389830FQf == null || (rect = c389830FQf.getRect()) == null) {
            return false;
        }
        return this.LLJJIJI.contains(rect);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C375140EnI(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC374950Emz.class, null);
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC374920Emw.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC374530EmJ.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC375030En7.class, null);
        InterfaceC374920Emw interfaceC374920EmwLJIJ = LJIJ();
        this.LLIZ = interfaceC374920EmwLJIJ != null ? interfaceC374920EmwLJIJ.LF2() : null;
        this.LLJIJIL = new Pair<>(0, 0);
        this.LLJILJILJ = 1.0f;
        this.LLJJIII = new Matrix();
        this.LLJJIJI = new Rect();
        this.LLJJJ = EnumC375190EnN.FREE;
        this.LLJJJIL = 1.0f;
        this.LLJJJJ = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    @Override // X.InterfaceC375300EnY
    public final void LJ(FrameLayout frameLayout) {
        this.LLIZLLLIL = null;
        this.LLJ = null;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(this.LLJILJIL, frameLayout);
        }
    }

    public final Rect LJIIJJI(NLETrackSlot nLETrackSlot) {
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC375350End interfaceC375350End = this.LLJ;
        if (interfaceC375350End == null) {
            return null;
        }
        float fIntValue = this.LLJIJIL.getFirst().intValue();
        float fIntValue2 = this.LLJIJIL.getSecond().intValue();
        Float fValueOf = Float.valueOf(fIntValue / fIntValue2);
        Pair pair = new Pair(Float.valueOf(fIntValue), Float.valueOf(fIntValue2));
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            numValueOf = Integer.valueOf(frameLayout.getMeasuredWidth());
        } else {
            numValueOf = null;
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            numValueOf2 = Integer.valueOf(frameLayout2.getMeasuredHeight());
        } else {
            numValueOf2 = null;
        }
        C375170EnL c375170EnLLIZIZ = C375260EnU.LIZIZ(interfaceC375350End, nLETrackSlot, fValueOf, pair, numValueOf, numValueOf2);
        if (c375170EnLLIZIZ == null) {
            return null;
        }
        float f = c375170EnLLIZIZ.LIZJ;
        float f2 = c375170EnLLIZIZ.LIZ;
        float f3 = 2;
        float f4 = f + (f2 / f3);
        float f5 = c375170EnLLIZIZ.LIZLLL;
        float f6 = c375170EnLLIZIZ.LIZIZ;
        float f7 = f5 + (f6 / f3);
        return new Rect((int) (f4 - f2), (int) (f7 - f6), (int) f4, (int) f7);
    }

    public final void LJIILL(boolean z) {
        C1664740tQG c1664740tQG = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        InterfaceC374950Emz interfaceC374950Emz = (InterfaceC374950Emz) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC374950Emz != null) {
            interfaceC374950Emz.LLJJIJIIJIL(z);
        }
        InterfaceC374530EmJ interfaceC374530EmJ = (InterfaceC374530EmJ) this.LLILZ.getValue(this, interfaceC2217461BqaArr[2]);
        if (interfaceC374530EmJ != null) {
            interfaceC374530EmJ.LLJJIJIIJIL(z);
        }
        InterfaceC375030En7 interfaceC375030En7 = (InterfaceC375030En7) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[3]);
        if (interfaceC375030En7 != null) {
            interfaceC375030En7.LLJJIJIIJIL(z);
        }
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJJJJ(MotionEvent motionEvent) {
        float scale;
        Pair<Float, Float> pair;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        this.LLJJIJIIJIL = x / f;
        this.LLJJIJIL = y / f;
        if (motionEvent.getAction() == 0) {
            NLETrackSlot nLETrackSlot = this.LLJI;
            if (nLETrackSlot != null) {
                scale = nLETrackSlot.getScale();
            } else {
                scale = 1.0f;
            }
            this.LLJJJIL = scale;
            NLETrackSlot nLETrackSlot2 = this.LLJI;
            if (nLETrackSlot2 != null) {
                pair = new Pair<>(Float.valueOf(nLETrackSlot2.getTransformX()), Float.valueOf(nLETrackSlot2.getTransformY()));
            } else {
                pair = new Pair<>(fValueOf, fValueOf);
            }
            this.LLJJJJ = pair;
        }
        return false;
    }

    @Override // X.InterfaceC375300EnY
    public final void LIZJ(NLETrackSlot nLETrackSlot, C375170EnL c375170EnL) {
        int iOrdinal;
        NLEResourceAV aVFile;
        this.LLJI = nLETrackSlot;
        C389830FQf c389830FQf = this.LLJILJIL;
        if (c389830FQf == null) {
            return;
        }
        EnumC375190EnN[] enumC375190EnNArrValues = EnumC375190EnN.values();
        Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "ep_crop_mode", null);
        if (numLJJJLZIJ != null) {
            iOrdinal = numLJJJLZIJ.intValue();
        } else {
            iOrdinal = EnumC375190EnN.FREE.ordinal();
        }
        EnumC375190EnN enumC375190EnN = enumC375190EnNArrValues[iOrdinal];
        this.LLJJJ = enumC375190EnN;
        Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_ratio", null);
        this.LLJILJILJ = nLETrackSlot.getScale();
        this.LLJILLL = nLETrackSlot.getTransformX();
        this.LLJJ = nLETrackSlot.getTransformY();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && aVFile.getWidth() > 0 && aVFile.getHeight() > 0) {
            c389830FQf.setOriginRatio(aVFile.getWidth() / aVFile.getHeight());
        }
        HandlerHook.viewPost(c389830FQf, new ARunnableS4S0500000_5(c389830FQf, this, c375170EnL, enumC375190EnN, fLJJJJJL, 0));
    }

    @Override // X.InterfaceC375300EnY
    public final void LJIJJLI(FrameLayout frameLayout, InterfaceC375350End interfaceC375350End) {
        NLEModel model;
        this.LLIZLLLIL = frameLayout;
        this.LLJ = interfaceC375350End;
        NLEEditor nLEEditor = this.LLIZ;
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null) {
            if (Math.abs((frameLayout.getWidth() / model.getCanvasRatio()) - frameLayout.getHeight()) > 1.0f) {
                HandlerHook.viewPost(frameLayout, new ARunnableS74S0200000_5(this, frameLayout, 55));
            }
        }
        final C389830FQf c389830FQf = new C389830FQf(frameLayout.getContext(), null);
        int visibility = c389830FQf.getVisibility();
        c389830FQf.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c389830FQf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c389830FQf);
        c389830FQf.setLayoutParams(layoutParams);
        c389830FQf.setCropListener(new InterfaceC389870FQj() { // from class: X.0EnJ
            public Rect LIZ = new Rect();

            @Override // X.InterfaceC389870FQj
            public final void LIZIZ(EnumC389840FQg enumC389840FQg) {
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZ() {
                this.LIZIZ.LLJJI = true;
                this.LIZ = c389830FQf.getRect();
                C375140EnI c375140EnI = this.LIZIZ;
                c375140EnI.LJIL(c375140EnI.LLJJJ, Collections.singletonList("adjust_white_window"));
            }

            @Override // X.InterfaceC389870FQj
            public final void LJFF() {
                this.LIZIZ.LJIILL(true);
            }

            public final void LJI() {
                Rect rect = c389830FQf.getRect();
                float fMin = Math.min(rect.width() / this.LIZ.width(), rect.height() / this.LIZ.height());
                C375140EnI c375140EnI = this.LIZIZ;
                float f = c375140EnI.LLJILJILJ;
                if (f * fMin > 3.0f) {
                    fMin = 3.0f / f;
                }
                c375140EnI.LLJJIII.reset();
                C375140EnI c375140EnI2 = this.LIZIZ;
                float fFloatValue = (c375140EnI2.LLJILLL * c375140EnI2.LLJIJIL.getFirst().floatValue()) + (this.LIZIZ.LLJIJIL.getFirst().intValue() / 2);
                C375140EnI c375140EnI3 = this.LIZIZ;
                this.LIZIZ.LLJJIII.setScale(fMin, fMin, fFloatValue, (c375140EnI3.LLJJ * c375140EnI3.LLJIJIL.getSecond().floatValue()) + (this.LIZIZ.LLJIJIL.getSecond().intValue() / 2));
                float[] fArr = {this.LIZ.exactCenterX(), this.LIZ.exactCenterY()};
                float[] fArr2 = new float[2];
                this.LIZIZ.LLJJIII.mapPoints(fArr2, fArr);
                C375140EnI c375140EnI4 = this.LIZIZ;
                NLETrackSlot nLETrackSlot = c375140EnI4.LLJI;
                if (nLETrackSlot == null) {
                    return;
                }
                C375260EnU.LIZLLL(nLETrackSlot, (c375140EnI4.LLJILLL + ((((fArr[0] - fArr2[0]) + rect.exactCenterX()) - this.LIZ.exactCenterX()) / this.LIZIZ.LLJIJIL.getFirst().floatValue())) - nLETrackSlot.getTransformX(), (this.LIZIZ.LLJJ + ((((fArr[1] - fArr2[1]) + rect.exactCenterY()) - this.LIZ.exactCenterY()) / this.LIZIZ.LLJIJIL.getSecond().floatValue())) - nLETrackSlot.getTransformY(), (fMin * this.LIZIZ.LLJILJILJ) / nLETrackSlot.getScale());
                if (!this.LIZIZ.LJIIL()) {
                    this.LIZIZ.LJJI();
                }
                NLEEditor nLEEditor2 = this.LIZIZ.LLIZ;
                if (nLEEditor2 != null) {
                    nLEEditor2.commit();
                }
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZJ() {
                LJI();
                NLEEditor nLEEditor2 = this.LIZIZ.LLIZ;
                if (nLEEditor2 != null) {
                    nLEEditor2.done();
                }
                this.LIZIZ.LJIILL(true);
                C375140EnI c375140EnI = this.LIZIZ;
                NLETrackSlot nLETrackSlot = c375140EnI.LLJI;
                if (nLETrackSlot == null) {
                    return;
                }
                c375140EnI.LLJILLL = nLETrackSlot.getTransformX();
                this.LIZIZ.LLJJ = nLETrackSlot.getTransformY();
                this.LIZIZ.LLJILJILJ = nLETrackSlot.getScale();
                this.LIZIZ.LLJJI = false;
            }

            @Override // X.InterfaceC389870FQj
            public final void LJ() {
                LJI();
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZLLL(boolean z) {
                if (z) {
                    this.LIZIZ.LJIILL(false);
                    InterfaceC374920Emw interfaceC374920EmwLJIJ = this.LIZIZ.LJIJ();
                    if (interfaceC374920EmwLJIJ != null) {
                        interfaceC374920EmwLJIJ.pause();
                    }
                    this.LIZIZ.LJJIFFI();
                    c389830FQf.setLimitRect(this.LIZIZ.LLJJIJI);
                }
            }
        });
        if (C293810BfP.LIZ()) {
            c389830FQf.setTouchRegionSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)));
        }
        this.LLJILJIL = c389830FQf;
        frameLayout.addView(c389830FQf);
    }

    public final void LJIL(EnumC375190EnN enumC375190EnN, List<String> list) {
        String str;
        long jQq;
        Pair<Integer, Integer> pair;
        NLEModel nLEModelLJI;
        C0E55 player;
        EditModelProvider.Companion.getClass();
        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
        if (editModel == null) {
            return;
        }
        C0E48 c0e48 = (C0E48) this.LLILZLL.getValue();
        int i = C375060EnA.LIZ[enumC375190EnN.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str = "free";
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "4:3";
                }
            } else {
                str = "16:9";
            }
        } else {
            str = "9:16";
        }
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue() && c0e48 != null && (player = c0e48.getPlayer()) != null) {
            jQq = player.qq();
        } else {
            jQq = -1;
        }
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            if (c0e48 != null) {
                nLEModelLJI = C350870DpF.LJI(c0e48);
            } else {
                nLEModelLJI = null;
            }
            pair = u4.LJJII(nLEModelLJI, false);
        } else {
            pair = new Pair<>(-1, -1);
        }
        C0CNO.LIZ(C15O7.LJI, new C357130DzL(editModel, c0e48, jQq, pair, str, list));
    }

    public final void LJJ(final RectF rectF, final EnumC375190EnN enumC375190EnN) {
        final Rect rect;
        final NLETrackSlot nLETrackSlot;
        C389830FQf c389830FQf = this.LLJILJIL;
        if (c389830FQf == null || (rect = c389830FQf.getRect()) == null || (nLETrackSlot = this.LLJI) == null) {
            return;
        }
        final NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
        final NLETrackSlot nLETrackSlotDynamicCast2 = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
        float scale = nLETrackSlotDynamicCast2.getScale();
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.NONE;
        nLETrackSlotDynamicCast2.setTransformX(0.0f);
        nLETrackSlotDynamicCast2.setTransformY(0.0f);
        nLETrackSlotDynamicCast2.setScale(scale);
        int[] iArr = C350940DpM.LIZ;
        enumC356070Dxd.ordinal();
        if (LJIIJJI(nLETrackSlotDynamicCast2) == null) {
            return;
        }
        float fWidth = rectF.width() / r1.width();
        float fHeight = rectF.height() / r1.height();
        if (r1.height() * fWidth >= rectF.height()) {
            C375260EnU.LIZLLL(nLETrackSlotDynamicCast2, 0.0f, 0.0f, fWidth);
        } else {
            C375260EnU.LIZLLL(nLETrackSlotDynamicCast2, 0.0f, 0.0f, fHeight);
        }
        ValueAnimator valueAnimator = this.LLJJJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJJJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator2 = this.LLJJJJJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0EnK
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    RectF rectF2 = rectF;
                    float f = rectF2.left;
                    Rect rect2 = rect;
                    float f2 = (f - rect2.left) * animatedFraction;
                    float f3 = (rectF2.top - rect2.top) * animatedFraction;
                    float f4 = (rectF2.right - rect2.right) * animatedFraction;
                    float f5 = (rectF2.bottom - rect2.bottom) * animatedFraction;
                    C389830FQf c389830FQf2 = this.LLJILJIL;
                    if (c389830FQf2 != null) {
                        Rect rect3 = rect;
                        c389830FQf2.setRect(new RectF(rect3.left + f2, rect3.top + f3, rect3.right + f4, rect3.bottom + f5));
                    }
                    float scale2 = nLETrackSlotDynamicCast.getScale() + ((nLETrackSlotDynamicCast2.getScale() - nLETrackSlotDynamicCast.getScale()) * animatedFraction);
                    float transformX = nLETrackSlotDynamicCast.getTransformX() + ((nLETrackSlotDynamicCast2.getTransformX() - nLETrackSlotDynamicCast.getTransformX()) * animatedFraction);
                    float transformY = nLETrackSlotDynamicCast.getTransformY() + ((nLETrackSlotDynamicCast2.getTransformY() - nLETrackSlotDynamicCast.getTransformY()) * animatedFraction);
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    C375260EnU.LIZLLL(nLETrackSlot2, transformX - nLETrackSlot2.getTransformX(), transformY - nLETrackSlot.getTransformY(), scale2 / nLETrackSlot.getScale());
                    NLEEditor nLEEditor = this.LLIZ;
                    if (nLEEditor != null) {
                        nLEEditor.commit();
                    }
                    if (animatedFraction >= 1.0f) {
                        C375140EnI c375140EnI = this;
                        EnumC375190EnN enumC375190EnN2 = enumC375190EnN;
                        c375140EnI.LLJJJ = enumC375190EnN2;
                        C389830FQf c389830FQf3 = c375140EnI.LLJILJIL;
                        if (c389830FQf3 != null) {
                            c389830FQf3.setCropMode(enumC375190EnN2);
                        }
                        this.LLJILJILJ = nLETrackSlot.getScale();
                        C375140EnI c375140EnI2 = this;
                        c375140EnI2.LLJILLL = 0.0f;
                        c375140EnI2.LLJJ = 0.0f;
                        c375140EnI2.LJIILL(true);
                        this.LJJIFFI();
                        NLEEditor nLEEditor2 = this.LLIZ;
                        if (nLEEditor2 != null) {
                            nLEEditor2.done();
                        }
                    }
                }
            });
        }
        ValueAnimator valueAnimator3 = this.LLJJJJJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIILJJIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        C389830FQf c389830FQf;
        if (this.LLJILJILJ * f > 3.0f || this.LLJJI || (c389830FQf = this.LLJILJIL) == null) {
            return true;
        }
        InterfaceC374920Emw interfaceC374920EmwLJIJ = LJIJ();
        if (interfaceC374920EmwLJIJ != null) {
            interfaceC374920EmwLJIJ.pause();
        }
        this.LLJJIII.reset();
        this.LLJJIII.setScale(f, f, (this.LLJILLL * this.LLJIJIL.getFirst().floatValue()) + (this.LLJIJIL.getFirst().intValue() / 2), (this.LLJJ * this.LLJIJIL.getSecond().floatValue()) + (this.LLJIJIL.getSecond().intValue() / 2));
        float[] fArr = {this.LLJJIJIIJIL, this.LLJJIJIL};
        float[] fArr2 = new float[2];
        this.LLJJIII.mapPoints(fArr2, fArr);
        float f2 = fArr[0] - fArr2[0];
        float f3 = fArr[1] - fArr2[1];
        C375260EnU.LIZLLL(nLETrackSlot, f2 / this.LLJIJIL.getFirst().floatValue(), f3 / this.LLJIJIL.getSecond().floatValue(), f);
        if (!LJIIL()) {
            if (this.LLJJIJI.width() < c389830FQf.getRect().width() || this.LLJJIJI.height() < c389830FQf.getRect().height()) {
                C375260EnU.LIZLLL(nLETrackSlot, (-f2) / this.LLJIJIL.getFirst().floatValue(), (-f3) / this.LLJIJIL.getSecond().floatValue(), 1.0f);
            }
            LJJI();
        }
        NLEEditor nLEEditor = this.LLIZ;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        this.LLJILLL = nLETrackSlot.getTransformX();
        this.LLJJ = nLETrackSlot.getTransformY();
        this.LLJILJILJ = nLETrackSlot.getScale();
        return true;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LIZLLL(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        if (z3 && Math.abs(this.LLJJJJ.getFirst().floatValue() - this.LLJILLL) > 0.001d && Math.abs(this.LLJJJJ.getSecond().floatValue() - this.LLJJ) > 0.001d) {
            arrayList.add("move");
            NLEEditor nLEEditor = this.LLIZ;
            if (nLEEditor != null) {
                nLEEditor.done();
            }
        }
        if (Math.abs(this.LLJJJIL - this.LLJILJILJ) <= 5.0E-4d) {
            LJIL(this.LLJJJ, arrayList);
            return true;
        }
        if (z4) {
            if (this.LLJJJIL <= this.LLJILJILJ) {
                arrayList.add("zoom in");
                NLEEditor nLEEditor2 = this.LLIZ;
                if (nLEEditor2 != null) {
                    nLEEditor2.done();
                }
            }
            if (this.LLJJJIL > this.LLJILJILJ) {
                arrayList.add("zoom out");
                NLEEditor nLEEditor3 = this.LLIZ;
                if (nLEEditor3 != null) {
                    nLEEditor3.done();
                }
            }
        }
        LJIL(this.LLJJJ, arrayList);
        return true;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        if (i > 1) {
            return false;
        }
        if (this.LLJJI) {
            return true;
        }
        InterfaceC374920Emw interfaceC374920EmwLJIJ = LJIJ();
        if (interfaceC374920EmwLJIJ != null) {
            interfaceC374920EmwLJIJ.pause();
        }
        C375260EnU.LJ(nLETrackSlot, f3, f4);
        if (!LJIIL()) {
            LJJI();
        }
        NLEEditor nLEEditor = this.LLIZ;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        this.LLJILLL = nLETrackSlot.getTransformX();
        this.LLJJ = nLETrackSlot.getTransformY();
        this.LLJILJILJ = nLETrackSlot.getScale();
        return true;
    }
}
