package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368640Eco {
    public static float LJJIL = C0FU0.LIZ(2.0f);
    public static float LJJIZ = C0FU0.LIZ(1.0f);
    public static int LJJJ = C0FU0.LIZ(16.0f);
    public final C368630Ecn LIZ;
    public final Function0<AbstractC368710Ecv> LIZIZ;
    public final C368390EcP LIZJ;
    public final boolean LIZLLL;
    public final C368780Ed2 LJ;
    public final C368780Ed2 LJFF;
    public final Rect LJI;
    public final int LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final int LJIILL;
    public final Paint LJIILLIIL;
    public final int LJIIZILJ;
    public final Path LJIJ;
    public final Paint LJIJI;
    public EnumC368970EdL LJIJJ;
    public final ValueAnimator LJIJJLI;
    public final C01GW LJIL;
    public C0E6E LJJ;
    public final RectF LJJI;
    public final RectF LJJIFFI;
    public EnumC368970EdL LJJII;
    public EnumC368970EdL LJJIII;
    public float LJJIIJ;
    public float LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public float LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public float LJJIJIL;
    public Pair<? extends NLETrackSlot, C369110EdZ> LJJIJL;
    public float LJJIJLIJ;

    public final float LIZJ() {
        return this.LIZ.getClipMinDuration$editor_trackpanel_release() * C360610EBv.LIZJ();
    }

    public final AbstractC368710Ecv LIZLLL() {
        return this.LIZIZ.invoke();
    }

    public final void LJFF() {
        float fFloor;
        float fLIZJ;
        float f;
        float timelineScale;
        if (this.LJJIJIIJIL) {
            if (this.LIZLLL) {
                if (this.LJJII == EnumC368970EdL.START) {
                    int i = C368630Ecn.LLLLJI;
                    fFloor = C369020EdQ.LIZ() - ((int) Math.ceil(this.LJJI.left - LJJIZ));
                    fLIZJ = C360610EBv.LIZJ();
                } else {
                    int i2 = C368630Ecn.LLLLJI;
                    fFloor = C369020EdQ.LIZ() - ((int) Math.floor((this.LJJIFFI.right + LJJIZ) + 2));
                    fLIZJ = C360610EBv.LIZJ();
                }
            } else if (this.LJJII == EnumC368970EdL.START) {
                int i3 = C368630Ecn.LLLLJI;
                fFloor = ((int) Math.ceil(this.LJJI.right + LJJIZ)) - C369020EdQ.LIZ();
                fLIZJ = C360610EBv.LIZJ();
            } else {
                int i4 = C368630Ecn.LLLLJI;
                fFloor = ((int) Math.floor((this.LJJIFFI.left - LJJIZ) - 2)) - C369020EdQ.LIZ();
                fLIZJ = C360610EBv.LIZJ();
            }
            float f2 = fFloor / fLIZJ;
            if (this.LIZLLL) {
                f = (this.LJJI.left - this.LJJIFFI.right) - (2 * LJJIZ);
                timelineScale = this.LIZ.getTimelineScale();
            } else {
                f = (this.LJJIFFI.left - this.LJJI.right) - (2 * LJJIZ);
                timelineScale = this.LIZ.getTimelineScale();
            }
            long j = (long) (f / timelineScale);
            InterfaceC368840Ed8 trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
            if (trackGroupActionListener != null) {
                trackGroupActionListener.onClip(this.LJJII, this.LJJIII, j, (long) f2);
            }
        }
    }

    public final float LIZIZ(float f) {
        float fLIZJ;
        NLEResType type;
        float fMin;
        NLETrackSlot first;
        NLESegment mainSegment;
        NLETrackSlot first2;
        Pair<? extends NLETrackSlot, C369110EdZ> pair = this.LJJIJL;
        if (pair != null && (first2 = pair.getFirst()) != null && C351220Dpo.LLLIIIIL(first2)) {
            if (this.LIZLLL) {
                float f2 = (this.LJJI.left - this.LJJIIJZLJL) - LJJIZ;
                if (f2 < this.LJJIJ) {
                    return this.LJJIIZI;
                }
                return f2;
            }
            float f3 = this.LJJI.right + LJJIZ + this.LJJIIJZLJL;
            float f4 = this.LJJIJ;
            if (f3 <= f4) {
                return f3;
            }
            return f4;
        }
        if (this.LIZLLL) {
            fLIZJ = (this.LJJI.left - LJJIZ) - LIZJ();
        } else {
            fLIZJ = this.LJJI.right + LJJIZ + LIZJ();
        }
        if (!this.LIZLLL ? f < fLIZJ : f > fLIZJ) {
            f = fLIZJ;
        }
        Pair<? extends NLETrackSlot, C369110EdZ> pair2 = this.LJJIJL;
        if (pair2 == null || (first = pair2.getFirst()) == null || (mainSegment = first.getMainSegment()) == null || (type = mainSegment.getType()) == null) {
            type = NLEResType.NONE;
        }
        float f5 = this.LJJIIZ;
        if (f5 != 0.0f && (type == NLEResType.AUDIO || type == NLEResType.ALGORITHM_AUDIO)) {
            fMin = Math.min(this.LJJIIJZLJL, f5);
        } else {
            fMin = this.LJJIIJZLJL;
        }
        if (this.LIZLLL) {
            float f6 = this.LJJI.left;
            float f7 = LJJIZ;
            if ((f6 + f7) - f > fMin) {
                f = (f6 - fMin) + f7;
            }
            float f8 = this.LJJIJ;
            if (f < f8) {
                return f8;
            }
        } else {
            float f9 = this.LJJI.right;
            float f10 = LJJIZ;
            if ((f - f9) - f10 > fMin) {
                f = fMin + f9 + f10;
            }
            float f11 = this.LJJIJ;
            if (f > f11) {
                return f11;
            }
        }
        return f;
    }

    public final float LJ(float f) {
        float fLIZJ;
        NLEResType type;
        float fMin;
        NLETrackSlot first;
        NLESegment mainSegment;
        NLETrackSlot first2;
        float f2;
        Pair<? extends NLETrackSlot, C369110EdZ> pair = this.LJJIJL;
        if (pair != null && (first2 = pair.getFirst()) != null && C351220Dpo.LLJJL(first2)) {
            if (this.LIZLLL) {
                f2 = this.LJJIIJ + this.LJJIFFI.right + LJJIZ;
                float f3 = this.LJJIIZI;
                if (f2 > f3) {
                    return f3;
                }
            } else {
                f2 = (this.LJJIFFI.left - LJJIZ) - this.LJJIIJ;
                float f4 = this.LJJIIZI;
                if (f2 < f4) {
                    return f4;
                }
            }
            return f2;
        }
        if (this.LIZLLL) {
            fLIZJ = this.LJJIFFI.right + LJJIZ + LIZJ();
        } else {
            fLIZJ = (this.LJJIFFI.left - LJJIZ) - LIZJ();
        }
        if (!this.LIZLLL ? f > fLIZJ : f < fLIZJ) {
            f = fLIZJ;
        }
        Pair<? extends NLETrackSlot, C369110EdZ> pair2 = this.LJJIJL;
        if (pair2 == null || (first = pair2.getFirst()) == null || (mainSegment = first.getMainSegment()) == null || (type = mainSegment.getType()) == null) {
            type = NLEResType.NONE;
        }
        float f5 = this.LJJIIZ;
        if (f5 != 0.0f && (type == NLEResType.AUDIO || type == NLEResType.ALGORITHM_AUDIO)) {
            fMin = Math.min(this.LJJIIJ, f5);
        } else {
            fMin = this.LJJIIJ;
        }
        if (this.LIZLLL) {
            float f6 = this.LJJIFFI.right;
            float f7 = LJJIZ;
            if (f - (f6 + f7) > fMin) {
                f = fMin + f6 + f7;
            }
            float f8 = this.LJJIIZI;
            if (f > f8) {
                return f8;
            }
        } else {
            float f9 = this.LJJIFFI.left;
            float f10 = LJJIZ;
            if ((f9 - f10) - f > fMin) {
                f = (f9 - f10) - fMin;
            }
            float f11 = this.LJJIIZI;
            if (f < f11) {
                return f11;
            }
        }
        return f;
    }

    public final void LJIIJJI(EnumC368970EdL enumC368970EdL) {
        NLETrackSlot first;
        AbstractC368710Ecv abstractC368710EcvLIZLLL;
        if (this.LJIJJ == enumC368970EdL) {
            return;
        }
        this.LJIJJ = enumC368970EdL;
        if (C368770Ed1.LIZ[enumC368970EdL.ordinal()] == 1) {
            this.LJIJJLI.cancel();
            Pair<? extends NLETrackSlot, C369110EdZ> pair = this.LJJIJL;
            if (pair != null && (first = pair.getFirst()) != null && (abstractC368710EcvLIZLLL = LIZLLL()) != null) {
                abstractC368710EcvLIZLLL.LLILLJJLI = abstractC368710EcvLIZLLL.LJ(first);
                return;
            }
            return;
        }
        AbstractC368710Ecv abstractC368710EcvLIZLLL2 = LIZLLL();
        if (abstractC368710EcvLIZLLL2 != null) {
            abstractC368710EcvLIZLLL2.LLILLJJLI = C13BV.INSTANCE;
        }
        this.LJIJJLI.start();
    }

    public final void LJIIL(Pair<? extends NLETrackSlot, C369110EdZ> pair) {
        NLETrackSlot first;
        NLETrackSlot first2;
        InterfaceC368720Ecw interfaceC368720Ecw;
        C369110EdZ second;
        InterfaceC368720Ecw interfaceC368720Ecw2;
        C369110EdZ second2;
        InterfaceC368720Ecw interfaceC368720Ecw3;
        C369110EdZ second3;
        InterfaceC368720Ecw interfaceC368720Ecw4;
        C369110EdZ second4;
        C369110EdZ second5;
        C369110EdZ second6;
        InterfaceC368720Ecw interfaceC368720Ecw5;
        if (Intrinsics.LJFF(this.LJJIJL, pair)) {
            Pair<? extends NLETrackSlot, C369110EdZ> pair2 = this.LJJIJL;
            if (pair2 != null && (second6 = pair2.getSecond()) != null && (interfaceC368720Ecw5 = second6.LIZIZ) != null) {
                interfaceC368720Ecw5.setItemSelected(true);
                return;
            }
            return;
        }
        Pair<? extends NLETrackSlot, C369110EdZ> pair3 = this.LJJIJL;
        InterfaceC368720Ecw interfaceC368720Ecw6 = null;
        if (pair3 != null) {
            first = pair3.getFirst();
        } else {
            first = null;
        }
        if (pair != null) {
            first2 = pair.getFirst();
        } else {
            first2 = null;
        }
        if (Intrinsics.LJFF(first, first2)) {
            AbstractC367990Ebl abstractC367990Ebl = this.LIZ.LLLJ;
            if (abstractC367990Ebl != null) {
                abstractC367990Ebl.LJIILLIIL(pair, true);
            }
        } else {
            C368630Ecn c368630Ecn = this.LIZ;
            int i = C368630Ecn.LLLLJI;
            AbstractC367990Ebl abstractC367990Ebl2 = c368630Ecn.LLLJ;
            if (abstractC367990Ebl2 != null) {
                abstractC367990Ebl2.LJIILLIIL(pair, false);
            }
        }
        Pair<? extends NLETrackSlot, C369110EdZ> pair4 = this.LJJIJL;
        if (pair4 != null && (second5 = pair4.getSecond()) != null) {
            interfaceC368720Ecw = second5.LIZIZ;
        } else {
            interfaceC368720Ecw = null;
        }
        if (pair != null && (second4 = pair.getSecond()) != null) {
            interfaceC368720Ecw6 = second4.LIZIZ;
        }
        if (!Intrinsics.LJFF(interfaceC368720Ecw, interfaceC368720Ecw6)) {
            Pair<? extends NLETrackSlot, C369110EdZ> pair5 = this.LJJIJL;
            if (pair5 != null && (second3 = pair5.getSecond()) != null && (interfaceC368720Ecw4 = second3.LIZIZ) != null) {
                interfaceC368720Ecw4.setItemSelected(false);
            }
            if (pair != null && (second2 = pair.getSecond()) != null && (interfaceC368720Ecw3 = second2.LIZIZ) != null) {
                interfaceC368720Ecw3.setItemSelected(true);
            }
        } else if (pair != null && (second = pair.getSecond()) != null && (interfaceC368720Ecw2 = second.LIZIZ) != null) {
            interfaceC368720Ecw2.setItemSelected(true);
        }
        this.LJJIJL = pair;
    }

    public static void LJIIIIZZ(InterfaceC368720Ecw interfaceC368720Ecw, InterfaceC368720Ecw interfaceC368720Ecw2) {
        if (Intrinsics.LJFF(interfaceC368720Ecw, interfaceC368720Ecw2)) {
            if (interfaceC368720Ecw != null) {
                interfaceC368720Ecw.setDrawDivider(false);
            }
        } else {
            if (interfaceC368720Ecw2 != null) {
                interfaceC368720Ecw2.setDrawDivider(true);
            }
            if (interfaceC368720Ecw == null) {
                return;
            }
            interfaceC368720Ecw.setDrawDivider(false);
        }
    }

    public final void LJI(float f, boolean z) {
        float f2;
        EnumC368970EdL enumC368970EdL;
        boolean z2;
        float f3;
        float fLIZ;
        float timelineScale;
        float fLIZ2;
        float timelineScale2;
        Long lLIZIZ;
        Float fValueOf;
        float fFloatValue;
        if (this.LIZLLL) {
            f2 = this.LJJIFFI.right + LJJIZ;
            if (f > f2) {
                enumC368970EdL = EnumC368970EdL.START;
            } else {
                enumC368970EdL = EnumC368970EdL.END;
            }
        } else {
            f2 = this.LJJIFFI.left - LJJIZ;
            if (f > f2) {
                enumC368970EdL = EnumC368970EdL.END;
            } else {
                enumC368970EdL = EnumC368970EdL.START;
            }
        }
        this.LJJIII = enumC368970EdL;
        if (f2 != f && f != this.LJJIJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJIJIIJIL = z2;
        this.LJJIJIL = f;
        float fLIZIZ = LIZIZ(f);
        boolean z3 = this.LIZLLL;
        float f4 = this.LJJIIJZLJL + LJJIZ;
        RectF rectF = this.LJJI;
        if (z3) {
            f3 = rectF.left;
        } else {
            f3 = rectF.right;
        }
        if (fLIZIZ != f4 + f3) {
            if (z3) {
                int i = C368630Ecn.LLLLJI;
                fLIZ = C369020EdQ.LIZ() - fLIZIZ;
                timelineScale = this.LIZ.getTimelineScale();
            } else {
                int i2 = C368630Ecn.LLLLJI;
                fLIZ = fLIZIZ - C369020EdQ.LIZ();
                timelineScale = this.LIZ.getTimelineScale();
            }
            float f5 = fLIZ / timelineScale;
            if (this.LIZLLL) {
                fLIZ2 = C369020EdQ.LIZ() - this.LJJIFFI.right;
                timelineScale2 = this.LIZ.getTimelineScale();
            } else {
                fLIZ2 = this.LJJIFFI.left - C369020EdQ.LIZ();
                timelineScale2 = this.LIZ.getTimelineScale();
            }
            float f6 = fLIZ2 / timelineScale2;
            AbstractC368710Ecv abstractC368710EcvLIZLLL = LIZLLL();
            if (abstractC368710EcvLIZLLL != null && (lLIZIZ = abstractC368710EcvLIZLLL.LIZIZ((long) f5, (long) f6)) != null && (fValueOf = Float.valueOf(lLIZIZ.longValue() * this.LIZ.getTimelineScale())) != null) {
                if (this.LIZLLL) {
                    fFloatValue = (this.LJJIFFI.right + LJJIZ) - fValueOf.floatValue();
                } else {
                    fFloatValue = (this.LJJIFFI.left - LJJIZ) + fValueOf.floatValue();
                }
                fLIZIZ = LIZIZ(fFloatValue);
                if (!Intrinsics.LIZLLL(fValueOf, 0.0f) && ((long) fFloatValue) == ((long) fLIZIZ)) {
                    ((InterfaceC369250Edn) this.LJIL.getValue()).LIZ(this.LIZ, C0E4C.VIBRATE_IMPACT_LIGHT);
                }
            }
        }
        if (this.LIZLLL) {
            RectF rectF2 = this.LJJIFFI;
            float f7 = rectF2.right;
            float f8 = LJJIZ;
            float f9 = fLIZIZ - f8;
            rectF2.right = f9;
            rectF2.left = f9 - LJJJ;
            LIZ(fLIZIZ, f7 + f8, z);
            return;
        }
        RectF rectF3 = this.LJJIFFI;
        float f10 = rectF3.left;
        float f11 = LJJIZ;
        float f12 = f10 - f11;
        float f13 = f11 + fLIZIZ;
        rectF3.left = f13;
        rectF3.right = f13 + LJJJ;
        LIZ(fLIZIZ, f12, z);
    }

    public final void LJII(float f, boolean z) {
        float f2;
        EnumC368970EdL enumC368970EdL;
        boolean z2;
        float f3;
        float fLIZ;
        float timelineScale;
        float fLIZ2;
        float timelineScale2;
        Long lLIZIZ;
        Float fValueOf;
        float fFloatValue;
        if (this.LIZLLL) {
            f2 = this.LJJI.left - LJJIZ;
            if (f > f2) {
                enumC368970EdL = EnumC368970EdL.START;
            } else {
                enumC368970EdL = EnumC368970EdL.END;
            }
        } else {
            f2 = this.LJJI.right + LJJIZ;
            if (f > f2) {
                enumC368970EdL = EnumC368970EdL.END;
            } else {
                enumC368970EdL = EnumC368970EdL.START;
            }
        }
        this.LJJIII = enumC368970EdL;
        if (f2 != f && f != this.LJJIJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJIJIIJIL = z2;
        this.LJJIJIL = f;
        float fLJ = LJ(f);
        boolean z3 = this.LIZLLL;
        RectF rectF = this.LJJIFFI;
        if (z3) {
            f3 = rectF.right + LJJIZ + this.LJJIIJ;
        } else {
            f3 = (rectF.left - LJJIZ) - this.LJJIIJ;
        }
        if (fLJ != f3) {
            if (z3) {
                int i = C368630Ecn.LLLLJI;
                fLIZ = C369020EdQ.LIZ() - fLJ;
                timelineScale = this.LIZ.getTimelineScale();
            } else {
                int i2 = C368630Ecn.LLLLJI;
                fLIZ = fLJ - C369020EdQ.LIZ();
                timelineScale = this.LIZ.getTimelineScale();
            }
            float f4 = fLIZ / timelineScale;
            if (this.LIZLLL) {
                fLIZ2 = C369020EdQ.LIZ() - this.LJJI.left;
                timelineScale2 = this.LIZ.getTimelineScale();
            } else {
                fLIZ2 = this.LJJI.right - C369020EdQ.LIZ();
                timelineScale2 = this.LIZ.getTimelineScale();
            }
            float f5 = fLIZ2 / timelineScale2;
            AbstractC368710Ecv abstractC368710EcvLIZLLL = LIZLLL();
            if (abstractC368710EcvLIZLLL != null && (lLIZIZ = abstractC368710EcvLIZLLL.LIZIZ((long) f4, (long) f5)) != null && (fValueOf = Float.valueOf(lLIZIZ.longValue() * this.LIZ.getTimelineScale())) != null) {
                if (this.LIZLLL) {
                    fFloatValue = (this.LJJI.left - LJJIZ) - fValueOf.floatValue();
                } else {
                    fFloatValue = this.LJJI.right + LJJIZ + fValueOf.floatValue();
                }
                fLJ = LJ(fFloatValue);
                if (!Intrinsics.LIZLLL(fValueOf, 0.0f) && fFloatValue == fLJ) {
                    ((InterfaceC369250Edn) this.LJIL.getValue()).LIZ(this.LIZ, C0E4C.VIBRATE_IMPACT_LIGHT);
                }
            }
        }
        if (this.LIZLLL) {
            RectF rectF2 = this.LJJI;
            float f6 = rectF2.left;
            float f7 = LJJIZ;
            float f8 = f6 - f7;
            float f9 = f7 + fLJ;
            rectF2.right = LJJJ + f9;
            rectF2.left = f9;
            LIZ(fLJ, f8, z);
            return;
        }
        RectF rectF3 = this.LJJI;
        float f10 = rectF3.right;
        float f11 = LJJIZ;
        float f12 = fLJ - f11;
        rectF3.left = f12 - LJJJ;
        rectF3.right = f12;
        LIZ(fLJ, f10 + f11, z);
    }

    public final void LJIIJ(InterfaceC368720Ecw interfaceC368720Ecw, Map<NLETrackSlot, C369110EdZ> map) {
        for (Map.Entry<NLETrackSlot, C369110EdZ> entry : map.entrySet()) {
            NLETrackSlot key = entry.getKey();
            if (entry.getValue().LIZIZ == interfaceC368720Ecw) {
                C368630Ecn c368630Ecn = this.LIZ;
                c368630Ecn.LJIIJ(c368630Ecn.LJ(key));
                InterfaceC368840Ed8 trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    trackGroupActionListener.LIZ(key, C0E6E.CLIP, true, false);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.util.Map<com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C369110EdZ> r23, kotlin.Pair<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C369110EdZ> r24) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368640Eco.LJIILIIL(java.util.Map, kotlin.Pair):void");
    }

    public C368640Eco(Context context, C368630Ecn c368630Ecn, AwS549S0100000_5 awS549S0100000_5) {
        C368780Ed2 c368780Ed2LIZLLL;
        C368780Ed2 c368780Ed2LJ;
        int iIntValue;
        this.LIZ = c368630Ecn;
        this.LIZIZ = awS549S0100000_5;
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(context);
        this.LIZJ = c368390EcPLIZ;
        boolean zLIZ = C423170GiZ.LIZ(c368630Ecn.getContext());
        this.LIZLLL = zLIZ;
        if (zLIZ) {
            c368780Ed2LIZLLL = C368130Ebz.LJ(context);
        } else {
            c368780Ed2LIZLLL = C368130Ebz.LIZLLL(context);
        }
        this.LJ = c368780Ed2LIZLLL;
        if (zLIZ) {
            c368780Ed2LJ = C368130Ebz.LIZLLL(context);
        } else {
            c368780Ed2LJ = C368130Ebz.LJ(context);
        }
        this.LJFF = c368780Ed2LJ;
        this.LJI = new Rect(0, 0, 0, 0);
        this.LJII = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJIILJJIL = true;
        this.LJIILL = C0FU0.LIZJ(context);
        Paint paint = new Paint();
        this.LJIILLIIL = paint;
        Integer num = c368390EcPLIZ.LIZJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        this.LJIIZILJ = iIntValue;
        this.LJIJ = new Path();
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(LJJIL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(iIntValue);
        this.LJIJI = paint2;
        EnumC368970EdL enumC368970EdL = EnumC368970EdL.NULL;
        this.LJIJJ = enumC368970EdL;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIJJLI = valueAnimatorOfFloat;
        this.LJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(424));
        this.LJJ = C0E6E.NONE;
        LJJIL = c368390EcPLIZ.LJI;
        LJJIZ = c368390EcPLIZ.LJII;
        LJJJ = C368130Ebz.LJIILJJIL;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(LJJIL);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 45));
        this.LJJI = new RectF();
        this.LJJIFFI = new RectF();
        this.LJJII = enumC368970EdL;
        this.LJJIII = enumC368970EdL;
        int i = C368630Ecn.LLLLJI;
        this.LJJIIZI = C369020EdQ.LIZ();
        this.LJJIJ = 2.1474836E9f;
        this.LJJIJLIJ = 1.0f;
    }

    public final void LIZ(float f, float f2, boolean z) {
        int iLIZ;
        int iLIZ2;
        boolean z2 = false;
        if (z && f == f2) {
            LJIIJJI(EnumC368970EdL.NULL);
            return;
        }
        if (this.LIZLLL) {
            int i = C368630Ecn.LLLLJI;
            iLIZ = C369020EdQ.LIZ() - ((int) f2);
        } else {
            int i2 = C368630Ecn.LLLLJI;
            iLIZ = ((int) f2) - C369020EdQ.LIZ();
        }
        if (this.LIZLLL) {
            iLIZ2 = C369020EdQ.LIZ() - ((int) f);
        } else {
            iLIZ2 = ((int) f) - C369020EdQ.LIZ();
        }
        AbstractC368710Ecv abstractC368710EcvLIZLLL = LIZLLL();
        if (abstractC368710EcvLIZLLL != null && iLIZ2 != iLIZ) {
            this.LJJIJIIJI = true;
            abstractC368710EcvLIZLLL.LIZ();
            int i3 = iLIZ2 - iLIZ;
            if (z) {
                C368630Ecn c368630Ecn = this.LIZ;
                boolean z3 = this.LIZLLL;
                if (z3) {
                    i3 = -i3;
                }
                abstractC368710EcvLIZLLL.LIZLLL(c368630Ecn, i3, 0, false, z3);
            }
        }
        if (this.LJIILIIL) {
            float f3 = this.LJIIJJI;
            float f4 = this.LJIILL - f3;
            float f5 = C360610EBv.LJIIJJI;
            if (f4 <= f5 || f3 <= f5) {
                z2 = true;
            }
            this.LJIILIIL = z2;
        }
        int i4 = C360610EBv.LIZ;
        this.LJJIJLIJ = C360610EBv.LIZ(this.LJIIJJI, this.LJIILL);
        EnumC368970EdL enumC368970EdL = EnumC368970EdL.NULL;
        float f6 = this.LJIILL;
        float f7 = this.LJIIJJI;
        float f8 = f6 - f7;
        float f9 = C360610EBv.LJIIJJI;
        if (f8 <= f9 && (!this.LJIILIIL || f7 - this.LJIIJ > 0.0f)) {
            enumC368970EdL = this.LIZLLL ? EnumC368970EdL.START : EnumC368970EdL.END;
        } else if (f7 <= f9 && (!this.LJIILIIL || f7 - this.LJIIJ < 0.0f)) {
            enumC368970EdL = this.LIZLLL ? EnumC368970EdL.END : EnumC368970EdL.START;
        }
        LJIIJJI(enumC368970EdL);
    }

    public final void LJIIIZ(NLETrackSlot nLETrackSlot, Map<NLETrackSlot, C369110EdZ> map, C0E6E c0e6e) {
        InterfaceC368720Ecw interfaceC368720Ecw;
        C369110EdZ second;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            NLENode nLENode = (NLENode) entry.getKey();
            C369110EdZ c369110EdZ = (C369110EdZ) entry.getValue();
            if (Intrinsics.LJFF(nLENode, nLETrackSlot) || nLENode.getId() == nLETrackSlot.getId()) {
                Pair<? extends NLETrackSlot, C369110EdZ> pair = this.LJJIJL;
                if (pair != null && (second = pair.getSecond()) != null) {
                    interfaceC368720Ecw = second.LIZIZ;
                } else {
                    interfaceC368720Ecw = null;
                }
                LJIIIIZZ(c369110EdZ.LIZIZ, interfaceC368720Ecw);
                LJIIL(new Pair<>(nLENode, c369110EdZ));
                this.LJJ = c0e6e;
            }
        }
        Pair<? extends NLETrackSlot, C369110EdZ> pair2 = this.LJJIJL;
        if (pair2 != null) {
            LJIILIIL(linkedHashMap, pair2);
        }
        this.LIZ.invalidate();
    }
}
