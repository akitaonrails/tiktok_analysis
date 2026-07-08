package X;

import Y.AComparatorS24S0000000_5;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0FUL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUL extends C0FUM {
    public final C19A3 LL;
    public final C1664690tQB<C385730FAl> LLILLJJLI;
    public final C1DRG LLILLL;
    public AbstractC385780FAq LLILZIL;
    public AbstractC385780FAq LLILZLL;
    public AbstractC385780FAq LLIZ;
    public List<AbstractC385780FAq> LLILZ = new ArrayList();
    public final C0FUP LLIZLLLIL = new C0FUP(this);

    public final C0E48 LJJIJIL() {
        return C349830DnZ.LIZ(this.LLILLL);
    }

    public final List<AbstractC385780FAq> LJJIJL() {
        List<AbstractC385780FAq> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (AbstractC385780FAq abstractC385780FAq : list) {
            AbstractC385780FAq abstractC385780FAq2 = abstractC385780FAq;
            if (!(abstractC385780FAq2 instanceof AbstractC383800F3a) || !Intrinsics.LJFF(this.LLILLJJLI.LIZ.LJI.get(((AbstractC383800F3a) abstractC385780FAq2).LJJIZ()), Boolean.FALSE)) {
                arrayList.add(abstractC385780FAq);
            }
        }
        return arrayList;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZLLL() {
        Iterator<AbstractC385780FAq> it2 = LJJIJL().iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJ() {
        Iterator<AbstractC385780FAq> it2 = LJJIJL().iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
        return true;
    }

    public final List<AbstractC383800F3a> LJJIJLIJ() {
        List<AbstractC385780FAq> listLJJIJL = LJJIJL();
        ArrayList<AbstractC385780FAq> arrayList = new ArrayList();
        for (AbstractC385780FAq abstractC385780FAq : listLJJIJL) {
            if (abstractC385780FAq.getPriority() == 100) {
                arrayList.add(abstractC385780FAq);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC385780FAq abstractC385780FAq2 : arrayList) {
            if ((abstractC385780FAq2 instanceof AbstractC383800F3a) && abstractC385780FAq2 != null) {
                arrayList2.add(abstractC385780FAq2);
            }
        }
        return arrayList2;
    }

    public final List<Pair<NLETrack, NLETrackSlot>> LJJIL() {
        VecNLETrackSPtr tracks;
        List listLJLLLL;
        VecNLETrackSPtr tracks2;
        List listLJLLLL2;
        VecNLETrackSPtr tracks3;
        VecNLETrackSPtr tracks4;
        List listLJLLLL3;
        VecNLETrackSPtr tracks5;
        VecNLETrackSlotSPtr slots;
        C0E48 c0e48LJJIJIL = LJJIJIL();
        if (C351420Dq8.LIZLLL(c0e48LJJIJIL != null ? C350870DpF.LJI(c0e48LJJIJIL) : null)) {
            ArrayList arrayList = new ArrayList();
            C0E48 c0e48LJJIJIL2 = LJJIJIL();
            if (c0e48LJJIJIL2 != null && (tracks5 = C350870DpF.LJI(c0e48LJJIJIL2).getTracks()) != null) {
                for (NLETrack nLETrack : tracks5) {
                    if (nLETrack != null && (slots = nLETrack.getSlots()) != null) {
                        for (NLETrackSlot nLETrackSlot : slots) {
                            if (nLETrackSlot != null) {
                                arrayList.add(new Pair(nLETrack, nLETrackSlot));
                            }
                        }
                    }
                }
            }
            return C13LP.LJLLLL(new AComparatorS24S0000000_5(123), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        C0E48 c0e48LJJIJIL3 = LJJIJIL();
        if (c0e48LJJIJIL3 != null && (tracks4 = C350870DpF.LJI(c0e48LJJIJIL3).getTracks()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (NLETrack nLETrack2 : tracks4) {
                if (C351220Dpo.LLLJL(nLETrack2)) {
                    arrayList3.add(nLETrack2);
                }
            }
            List<NLETrack> listLJLLLL4 = C13LP.LJLLLL(new AComparatorS24S0000000_5(124), arrayList3);
            if (listLJLLLL4 != null) {
                for (NLETrack nLETrack3 : listLJLLLL4) {
                    VecNLETrackSlotSPtr slots2 = nLETrack3.getSlots();
                    if (slots2 != null && (listLJLLLL3 = C13LP.LJLLLL(new AComparatorS24S0000000_5(127), slots2)) != null) {
                        Iterator it2 = listLJLLLL3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new Pair(nLETrack3, it2.next()));
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        C0E48 c0e48LJJIJIL4 = LJJIJIL();
        if (c0e48LJJIJIL4 != null && (tracks3 = C350870DpF.LJI(c0e48LJJIJIL4).getTracks()) != null) {
            ArrayList<NLETrack> arrayList5 = new ArrayList();
            for (NLETrack nLETrack4 : tracks3) {
                NLETrack nLETrack5 = nLETrack4;
                if (!C351220Dpo.LLLJL(nLETrack5) && (C351220Dpo.LLLIZZ(nLETrack5) || C351220Dpo.LLJLLIL(nLETrack5))) {
                    arrayList5.add(nLETrack4);
                }
            }
            for (NLETrack nLETrack6 : arrayList5) {
                VecNLETrackSlotSPtr slots3 = nLETrack6.getSlots();
                if (slots3 != null) {
                    Iterator<NLETrackSlot> it3 = slots3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(new Pair(nLETrack6, it3.next()));
                    }
                }
            }
        }
        Iterator it4 = C13LP.LJLLLL(new AComparatorS24S0000000_5(125), arrayList4).iterator();
        while (it4.hasNext()) {
            arrayList2.add(it4.next());
        }
        C0E48 c0e48LJJIJIL5 = LJJIJIL();
        if (c0e48LJJIJIL5 != null && (tracks2 = C350870DpF.LJI(c0e48LJJIJIL5).getTracks()) != null) {
            ArrayList arrayList6 = new ArrayList();
            for (NLETrack nLETrack7 : tracks2) {
                if (C351220Dpo.LLLIIL(nLETrack7)) {
                    arrayList6.add(nLETrack7);
                }
            }
            List<NLETrack> listLJLLLL5 = C13LP.LJLLLL(new AComparatorS24S0000000_5(126), arrayList6);
            if (listLJLLLL5 != null) {
                for (NLETrack nLETrack8 : listLJLLLL5) {
                    VecNLETrackSlotSPtr slots4 = nLETrack8.getSlots();
                    if (slots4 != null && (listLJLLLL2 = C13LP.LJLLLL(new AComparatorS24S0000000_5(128), slots4)) != null) {
                        Iterator it5 = listLJLLLL2.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(new Pair(nLETrack8, it5.next()));
                        }
                    }
                }
            }
        }
        C0E48 c0e48LJJIJIL6 = LJJIJIL();
        if (c0e48LJJIJIL6 != null && (tracks = C350870DpF.LJI(c0e48LJJIJIL6).getTracks()) != null) {
            ArrayList<NLETrack> arrayList7 = new ArrayList();
            for (NLETrack nLETrack9 : tracks) {
                if (nLETrack9.getMainTrack()) {
                    arrayList7.add(nLETrack9);
                }
            }
            for (NLETrack nLETrack10 : arrayList7) {
                VecNLETrackSlotSPtr slots5 = nLETrack10.getSlots();
                if (slots5 != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(129), slots5)) != null) {
                    Iterator it6 = listLJLLLL.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(new Pair(nLETrack10, it6.next()));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        C21645419nQ c21645419nQ2;
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            C0FUP c0fup = this.LLIZLLLIL;
            c0fup.getClass();
            if (abstractC385780FAq.LJJIJIL()) {
                c21645419nQ2 = c0fup.LIZLLL;
            } else {
                c21645419nQ2 = c21645419nQ;
            }
            if (abstractC385780FAq.E2(c21645419nQ2)) {
                this.LLILZLL = abstractC385780FAq;
                return true;
            }
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        MotionEvent motionEventLIZ = this.LLIZLLLIL.LIZ(motionEvent);
        if (motionEventLIZ == null) {
            return false;
        }
        List<AbstractC385780FAq> listLJJIJL = LJJIJL();
        ArrayList<AbstractC385780FAq> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJJIJL) {
            if (((AbstractC385780FAq) obj).getPriority() > 100) {
                arrayList.add(obj);
            }
        }
        for (AbstractC385780FAq abstractC385780FAq : arrayList) {
            if (abstractC385780FAq.LJJIJIL()) {
                motionEvent4 = motionEventLIZ;
            } else {
                motionEvent4 = motionEvent;
            }
            if (abstractC385780FAq.LIZIZ(motionEvent4)) {
                return true;
            }
        }
        List<AbstractC385780FAq> listLJJIJL2 = LJJIJL();
        ArrayList<AbstractC385780FAq> arrayList2 = new ArrayList();
        for (Object obj2 : (ArrayList) listLJJIJL2) {
            if (((AbstractC385780FAq) obj2).getPriority() == 100) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<AbstractC383800F3a> arrayList3 = new ArrayList();
        for (AbstractC385780FAq abstractC385780FAq2 : arrayList2) {
            if ((abstractC385780FAq2 instanceof AbstractC383800F3a) && abstractC385780FAq2 != null) {
                arrayList3.add(abstractC385780FAq2);
            }
        }
        for (Pair<NLETrack, NLETrackSlot> pair : LJJIL()) {
            NLETrack first = pair.getFirst();
            NLETrackSlot second = pair.getSecond();
            for (AbstractC383800F3a abstractC383800F3a : arrayList3) {
                if (abstractC383800F3a.LJJIJIL()) {
                    motionEvent3 = motionEventLIZ;
                } else {
                    motionEvent3 = motionEvent;
                }
                if (abstractC383800F3a.LJJIJL(first, second, motionEvent3)) {
                    C0E48 c0e48LJJIJIL = LJJIJIL();
                    if (c0e48LJJIJIL != null) {
                        c0e48LJJIJIL.S7().LIZIZ(new C358740E4q(second, 0, null, false, 0, 238), "select_slot_event", false);
                    }
                    abstractC383800F3a.LIZIZ(motionEvent3);
                    return true;
                }
            }
        }
        List<AbstractC385780FAq> listLJJIJL3 = LJJIJL();
        ArrayList<AbstractC385780FAq> arrayList4 = new ArrayList();
        for (Object obj3 : (ArrayList) listLJJIJL3) {
            if (((AbstractC385780FAq) obj3).getPriority() < 100) {
                arrayList4.add(obj3);
            }
        }
        for (AbstractC385780FAq abstractC385780FAq3 : arrayList4) {
            if (abstractC385780FAq3.LJJIJIL()) {
                motionEvent2 = motionEventLIZ;
            } else {
                motionEvent2 = motionEvent;
            }
            if (abstractC385780FAq3.LIZIZ(motionEvent2)) {
                return true;
            }
        }
        motionEventLIZ.recycle();
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        AbstractC385780FAq abstractC385780FAq = this.LLIZ;
        if (abstractC385780FAq != null) {
            C0FUP c0fup = this.LLIZLLLIL;
            c0fup.getClass();
            if (abstractC385780FAq.LJJIJIL()) {
                bVar = c0fup.LJ;
            }
            abstractC385780FAq.LJFF(bVar);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        AbstractC385780FAq abstractC385780FAq = this.LLILZLL;
        if (abstractC385780FAq != null) {
            abstractC385780FAq.LJIIIZ(f);
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJIJJ(MotionEvent motionEvent) {
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            abstractC385780FAq.LJIJJ(this.LLIZLLLIL.LIZIZ(motionEvent, abstractC385780FAq));
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.LLILZIL = null;
            this.LLILZLL = null;
            this.LLIZ = null;
        }
        C0FUP c0fup = this.LLIZLLLIL;
        MotionEvent motionEvent2 = c0fup.LIZIZ;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        c0fup.LIZIZ = null;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJJIJIIJIL(MotionEvent motionEvent) {
        C0FUP c0fup = this.LLIZLLLIL;
        MotionEvent motionEventLIZ = c0fup.LIZ(motionEvent);
        if (motionEventLIZ != null) {
            c0fup.LIZJ.onTouchEvent(motionEventLIZ);
            c0fup.LIZLLL.LIZJ(motionEventLIZ);
            c0fup.LJ.LIZJ(motionEventLIZ);
            c0fup.LIZIZ = motionEventLIZ;
        }
        for (AbstractC385780FAq abstractC385780FAq : (ArrayList) LJJIJL()) {
            abstractC385780FAq.LJJIJIIJIL(this.LLIZLLLIL.LIZIZ(motionEvent, abstractC385780FAq));
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        AbstractC385780FAq abstractC385780FAq = this.LLILZLL;
        if (abstractC385780FAq != null) {
            if (!abstractC385780FAq.LJJIJIL()) {
                abstractC385780FAq.LJJLIIIJLJLI(f);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        AbstractC385780FAq abstractC385780FAq = this.LLILZIL;
        if (abstractC385780FAq != null) {
            abstractC385780FAq.LLLLJI(f);
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        AbstractC385780FAq abstractC385780FAq = this.LLIZ;
        if (abstractC385780FAq != null) {
            if (!abstractC385780FAq.LJJIJIL()) {
                abstractC385780FAq.LLLZLZ(bVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            abstractC385780FAq.onDown(this.LLIZLLLIL.LIZIZ(motionEvent, abstractC385780FAq));
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        AbstractC385780FAq abstractC385780FAq = this.LLILZIL;
        if (abstractC385780FAq != null) {
            if (!abstractC385780FAq.LJJIJIL()) {
                abstractC385780FAq.onScale(scaleGestureDetector);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ScaleGestureDetector scaleGestureDetector2;
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            C0FUP c0fup = this.LLIZLLLIL;
            c0fup.getClass();
            if (abstractC385780FAq.LJJIJIL()) {
                scaleGestureDetector2 = c0fup.LIZJ;
            } else {
                scaleGestureDetector2 = scaleGestureDetector;
            }
            if (abstractC385780FAq.onScaleBegin(scaleGestureDetector2)) {
                this.LLILZIL = abstractC385780FAq;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapConfirmed(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FUL.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        MotionEvent motionEventLIZ = this.LLIZLLLIL.LIZ(motionEvent);
        if (motionEventLIZ == null) {
            return false;
        }
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            if (abstractC385780FAq.LJJIJIL()) {
                motionEvent2 = motionEventLIZ;
            } else {
                motionEvent2 = motionEvent;
            }
            abstractC385780FAq.onSingleTapUp(motionEvent2);
        }
        motionEventLIZ.recycle();
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            abstractC385780FAq.onTouchEvent(this.LLIZLLLIL.LIZIZ(motionEvent, abstractC385780FAq));
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        for (AbstractC385780FAq abstractC385780FAq : LJJIJL()) {
            abstractC385780FAq.onUp(this.LLIZLLLIL.LIZIZ(motionEvent, abstractC385780FAq));
        }
        return true;
    }

    public C0FUL(C19A3 c19a3, C1664680tQA c1664680tQA, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1664680tQA;
        this.LLILLL = c1drg;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        b bVar2;
        float x;
        for (AbstractC385780FAq abstractC385780FAq : (ArrayList) LJJIJL()) {
            C0FUP c0fup = this.LLIZLLLIL;
            c0fup.getClass();
            if (abstractC385780FAq.LJJIJIL()) {
                bVar2 = c0fup.LJ;
            } else {
                bVar2 = bVar;
            }
            MotionEvent motionEvent = bVar2.LIZIZ;
            float y = -1.0f;
            if (motionEvent == null) {
                x = -1.0f;
            } else {
                x = motionEvent.getX();
            }
            MotionEvent motionEvent2 = bVar2.LIZIZ;
            if (motionEvent2 != null) {
                y = motionEvent2.getY();
            }
            if (abstractC385780FAq.LLLLLLLLL(bVar2, x, y)) {
                this.LLIZ = abstractC385780FAq;
                return true;
            }
        }
        return false;
    }
}
