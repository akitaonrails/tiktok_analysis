package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368300EcG {
    public final InterfaceC368470EcX LIZ;
    public final Context LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public long LJ;
    public Function0<Integer> LJFF;
    public final List<Long> LJI;
    public List<NLETrackSlot> LJII;
    public final List<NLECommonKeyframe> LJIIIIZZ;
    public NLETrackSlot LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final Paint LJIIL;
    public final Path LJIILIIL;
    public final C01GW LJIILJJIL;

    public final Long LIZLLL() {
        NLECommonKeyframe nLECommonKeyframe;
        Long lValueOf;
        NLETimeSpaceNode nLETimeSpaceNodeLJIIIZ = this.LIZ.LJIIIZ();
        if (!(nLETimeSpaceNodeLJIIIZ instanceof NLETrackSlot)) {
            nLETimeSpaceNodeLJIIIZ = null;
        }
        if (nLETimeSpaceNodeLJIIIZ != null && (lValueOf = Long.valueOf(nLETimeSpaceNodeLJIIIZ.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) != null) {
            return lValueOf;
        }
        NLETimeSpaceNode nLETimeSpaceNodeLJIIIZ2 = this.LIZ.LJIIIZ();
        if (!(nLETimeSpaceNodeLJIIIZ2 instanceof NLECommonKeyframe) || (nLECommonKeyframe = (NLECommonKeyframe) nLETimeSpaceNodeLJIIIZ2) == null) {
            return null;
        }
        return Long.valueOf(nLECommonKeyframe.getTimeOffset() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public final void LJ(NLETrackSlot nLETrackSlot) {
        this.LJII.clear();
        ((ArrayList) this.LJIIIIZZ).clear();
        ((ArrayList) this.LJI).clear();
        if (!nLETrackSlot.getKeyframes().isEmpty()) {
            VecNLETrackSlotSPtr sortKeyframe = nLETrackSlot.getSortKeyframe();
            this.LJII = sortKeyframe;
            List<Long> list = this.LJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(sortKeyframe, 10));
            Iterator<NLETrackSlot> it2 = sortKeyframe.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
            ((ArrayList) list).addAll(arrayList);
        } else if (!nLETrackSlot.getSwingKeyframes().isEmpty()) {
            List<NLECommonKeyframe> list2 = this.LJIIIIZZ;
            VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLEKeyframe> it3 = swingKeyframes.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getKeyframes(), arrayList2);
            }
            ((ArrayList) list2).addAll(arrayList2);
            List<Long> list3 = this.LJI;
            List<NLECommonKeyframe> list4 = this.LJIIIIZZ;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            Iterator it4 = ((ArrayList) list4).iterator();
            while (it4.hasNext()) {
                arrayList3.add(Long.valueOf(((NLECommonKeyframe) it4.next()).getTimeOffset() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
            ((ArrayList) list3).addAll(C13LP.LJLLJ(C13LP.LJJJJI(arrayList3)));
        }
        this.LIZ.LJFF();
        LJFF(nLETrackSlot);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot r10) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368300EcG.LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public C368300EcG(InterfaceC368470EcX interfaceC368470EcX, Context context) {
        this.LIZ = interfaceC368470EcX;
        this.LIZIZ = context;
        new Rect();
        new Rect();
        new Paint(1);
        this.LJ = -1L;
        this.LJFF = AFwS191S0000000_5.get$arr$(315);
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        this.LJIIIIZZ = new ArrayList();
        this.LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1149));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1150));
        Paint paint = new Paint();
        paint.setShadowLayer(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 1073741824);
        paint.setColor(0);
        this.LJIIL = paint;
        this.LJIILIIL = new Path();
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1148));
    }

    public final Long LIZ(NLETrackSlot nLETrackSlot, float f) {
        if (this.LIZ.getItemWidth() <= 0) {
            return null;
        }
        if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
            f = this.LIZ.getItemWidth() - f;
        }
        float fLIZJ = f + ((C360610EBv.LIZJ() * nLETrackSlot.getStartTime()) / LSPassThroughRecordSizeConfig.DEFAULT);
        if (!nLETrackSlot.getKeyframes().isEmpty()) {
            for (NLETrackSlot nLETrackSlot2 : nLETrackSlot.getKeyframes()) {
                float fLIZJ2 = C360610EBv.LIZJ();
                long startTime = nLETrackSlot2.getStartTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                if (Math.abs((fLIZJ2 * ((startTime / j) + (nLETrackSlot.getStartTime() / j))) - fLIZJ) < C360610EBv.LIZIZ / 2) {
                    return Long.valueOf((nLETrackSlot2.getStartTime() / j) + (nLETrackSlot.getStartTime() / j));
                }
            }
        } else if (!nLETrackSlot.getSwingKeyframes().isEmpty()) {
            Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
            while (it2.hasNext()) {
                for (NLECommonKeyframe nLECommonKeyframe : it2.next().getKeyframes()) {
                    float fLIZJ3 = C360610EBv.LIZJ();
                    long jLLLLLLL = C351220Dpo.LLLLLLL(nLECommonKeyframe.getTimeOffset());
                    long startTime2 = nLETrackSlot.getStartTime();
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    if (Math.abs((fLIZJ3 * (jLLLLLLL + (startTime2 / j2))) - fLIZJ) < C360610EBv.LIZIZ / 2) {
                        return Long.valueOf((nLECommonKeyframe.getTimeOffset() / j2) + (nLETrackSlot.getStartTime() / j2));
                    }
                }
            }
        }
        return null;
    }

    public final void LIZIZ(Canvas canvas, NLETrackSlot nLETrackSlot) {
        if (!this.LIZ.LIZ()) {
            return;
        }
        Long lLIZLLL = LIZLLL();
        this.LIZLLL += this.LIZJ;
        if (!nLETrackSlot.getKeyframes().isEmpty()) {
            Iterator it2 = ((ArrayList) this.LJI).iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (lLIZLLL != null && jLongValue == lLIZLLL.longValue()) {
                    LIZJ((TuxIconDrawable) this.LJIIJJI.getValue(), canvas, nLETrackSlot, jLongValue, this.LIZ.getItemWidth());
                } else {
                    LIZJ((TuxIconDrawable) this.LJIIJ.getValue(), canvas, nLETrackSlot, jLongValue, this.LIZ.getItemWidth());
                }
            }
            return;
        }
        Iterator it3 = ((ArrayList) this.LJI).iterator();
        while (it3.hasNext()) {
            long jLongValue2 = ((Number) it3.next()).longValue();
            if (lLIZLLL != null && jLongValue2 == lLIZLLL.longValue()) {
                LIZJ((TuxIconDrawable) this.LJIIJJI.getValue(), canvas, nLETrackSlot, jLongValue2, this.LIZ.getItemWidth());
            } else {
                LIZJ((TuxIconDrawable) this.LJIIJ.getValue(), canvas, nLETrackSlot, jLongValue2, this.LIZ.getItemWidth());
            }
        }
    }

    public final void LIZJ(TuxIconDrawable tuxIconDrawable, Canvas canvas, NLETrackSlot nLETrackSlot, long j, int i) {
        long startTime = nLETrackSlot.getStartTime();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        int startTime2 = (int) ((((j + (startTime / j2)) - (nLETrackSlot.getStartTime() / j2)) * C360610EBv.LIZJ()) - this.LIZLLL);
        int itemHeight = (int) (this.LIZ.getItemHeight() / 2.0f);
        if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
            Rect bounds = tuxIconDrawable.getBounds();
            int i2 = C360610EBv.LIZIZ / 2;
            bounds.set(i - (startTime2 - i2), itemHeight - i2, i - (startTime2 + i2), i2 + itemHeight);
        } else {
            Rect bounds2 = tuxIconDrawable.getBounds();
            int i3 = C360610EBv.LIZIZ / 2;
            bounds2.set(startTime2 - i3, itemHeight - i3, startTime2 + i3, i3 + itemHeight);
        }
        this.LJIILIIL.reset();
        float f = itemHeight;
        this.LJIILIIL.moveTo(tuxIconDrawable.getBounds().left, f);
        this.LJIILIIL.lineTo(tuxIconDrawable.getBounds().left + (tuxIconDrawable.getBounds().width() / 2.0f), tuxIconDrawable.getBounds().top);
        this.LJIILIIL.lineTo(tuxIconDrawable.getBounds().right, f);
        this.LJIILIIL.lineTo(tuxIconDrawable.getBounds().left + (tuxIconDrawable.getBounds().width() / 2.0f), tuxIconDrawable.getBounds().bottom);
        this.LJIILIIL.close();
        canvas.drawPath(this.LJIILIIL, this.LJIIL);
        tuxIconDrawable.draw(canvas);
    }
}
