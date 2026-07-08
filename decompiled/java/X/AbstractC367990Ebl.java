package X;

import android.graphics.Canvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC367990Ebl implements InterfaceC369090EdX {
    public static final int LJIILIIL = C360610EBv.LJFF;
    public static final int LJIILJJIL = C360610EBv.LJ;
    public static final int LJIILL = C360610EBv.LJII;
    public final C368630Ecn LIZ;
    public final C368680Ecs LIZIZ;
    public final InterfaceC369580EeK LIZJ;
    public final InterfaceC369170Edf LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1682));
    public boolean LJFF = true;
    public final Map<NLETrackSlot, C369110EdZ> LJI = new LinkedHashMap();
    public final int LJII = C0FU0.LIZ(26.0f);
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final C01GW LJIIJ;
    public int LJIIJJI;
    public int LJIIL;

    public boolean LIZJ() {
        return !(this instanceof C367950Ebh);
    }

    public void LIZLLL(Canvas canvas) {
    }

    public long LJ() {
        return 100L;
    }

    public int LJII() {
        return Integer.MAX_VALUE;
    }

    public void LJIILIIL(NLETrackSlot nLETrackSlot) {
    }

    public void LJIILJJIL() {
    }

    public final int LJIIIIZZ() {
        return this.LIZ.getScrollX();
    }

    public final float LJIIIZ() {
        return this.LIZ.getTimelineScale();
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LJIIJ.getValue()).booleanValue();
    }

    public final boolean LJIIJJI() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public void LJIIL() {
        this.LIZJ.pause();
    }

    public int LJI() {
        return this.LJIIJJI;
    }

    public int LJFF(int i) {
        if (i <= 0) {
            return this.LIZ.getPaddingTop() + (i * (LJI() + this.LJIIL));
        }
        return this.LIZ.getPaddingTop() + ((i - 1) * (LJI() + this.LJIIL)) + LJI() + ((int) (LJI() * 0.33333334f)) + C0FU0.LIZ(1.0f);
    }

    public final void LJIILL(Pair<? extends NLETrackSlot, C369110EdZ> pair) {
        double dFloor;
        int scrollX;
        if (pair == null) {
            return;
        }
        NLETrackSlot first = pair.getFirst();
        int iLJI = pair.getSecond().LIZ * (LJI() + this.LJIIL);
        int scrollY = this.LIZ.getScrollY();
        int iLJI2 = iLJI - scrollY;
        if (iLJI2 >= 0) {
            iLJI2 = ((iLJI + LJI()) - scrollY) - this.LIZ.getMeasuredHeight();
            if (iLJI2 <= 0) {
                iLJI2 = 0;
            }
        }
        this.LIZ.LJIILL(iLJI2);
        long duration = first.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT;
        float fAbs = Math.abs(this.LIZ.getScrollX()) / LJIIIZ();
        if (fAbs < first.getStartTime() / r4) {
            dFloor = Math.ceil((first.getStartTime() / r4) * LJIIIZ());
        } else if (fAbs < (first.getStartTime() / r4) + duration) {
            return;
        } else {
            dFloor = Math.floor(((first.getMeasuredEndTime() / r4) * LJIIIZ()) - 2);
        }
        int i = (int) dFloor;
        if (i >= 0) {
            AbstractC368710Ecv scrollAndAdsorptionHandler = this.LIZ.getScrollAndAdsorptionHandler();
            if (scrollAndAdsorptionHandler != null) {
                scrollAndAdsorptionHandler.LIZ();
            }
            C368680Ecs c368680Ecs = this.LIZIZ;
            if (LJIIJJI()) {
                scrollX = this.LIZ.getScrollX() + i;
            } else {
                scrollX = i - this.LIZ.getScrollX();
            }
            c368680Ecs.LJLLILLLL(scrollX);
        }
    }

    public void LJIILLIIL(Pair<? extends NLETrackSlot, C369110EdZ> pair, boolean z) {
        if (!z && pair != null) {
            this.LIZJ.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        r8.put(r9, java.lang.Integer.valueOf(r6.LIZ));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.util.List r20, com.bytedance.ies.nle.editor_jni.NLETrackSlot r21) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC367990Ebl.LJIIZILJ(java.util.List, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public void LIZIZ(InterfaceC368720Ecw interfaceC368720Ecw, NLETrackSlot nLETrackSlot, int i) {
        interfaceC368720Ecw.setSegment(nLETrackSlot);
        if (interfaceC368720Ecw.getView() instanceof AbstractC368090Ebv) {
            AbstractC368090Ebv abstractC368090Ebv = (AbstractC368090Ebv) interfaceC368720Ecw.getView();
            abstractC368090Ebv.setFrameDelegate(this.LIZLLL);
            abstractC368090Ebv.setListener(new InterfaceC369190Edh() { // from class: X.0EcY
                @Override // X.InterfaceC369190Edh
                public final void LJ() {
                    InterfaceC368620Ecm keyframeListener = this.LIZ.LIZ.getKeyframeListener();
                    if (keyframeListener != null) {
                        keyframeListener.LJ();
                    }
                }

                @Override // X.InterfaceC369190Edh
                public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
                    InterfaceC368620Ecm keyframeListener = this.LIZ.LIZ.getKeyframeListener();
                    if (keyframeListener != null) {
                        keyframeListener.LIZJ(nLETimeSpaceNode);
                    }
                }

                @Override // X.InterfaceC369190Edh
                public final void LIZLLL(long j) {
                    InterfaceC368620Ecm keyframeListener = this.LIZ.LIZ.getKeyframeListener();
                    if (keyframeListener != null) {
                        keyframeListener.LIZLLL(j);
                    }
                }
            });
        }
    }

    public AbstractC367990Ebl(C368630Ecn c368630Ecn, C368680Ecs c368680Ecs, C369220Edk c369220Edk, C368450EcV c368450EcV) {
        this.LIZ = c368630Ecn;
        this.LIZIZ = c368680Ecs;
        this.LIZJ = c369220Edk;
        this.LIZLLL = c368450EcV;
        int i = LJIILJJIL;
        this.LJIIIIZZ = i;
        this.LJIIIZ = LJIILIIL;
        this.LJIIJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(423));
        this.LJIIJJI = i;
        this.LJIIL = LJIILL;
    }
}
