package X;

import Y.AComparatorS24S0000000_5;
import android.graphics.Matrix;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ena, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375320Ena {
    public final C2260311DdV LIZ;
    public final ArrayList<InterfaceC375350End> LIZIZ = new ArrayList<>();
    public NLEModel LIZJ;
    public NLETrackSlot LIZLLL;
    public NLETrack LJ;
    public long LJFF;
    public Pair<Float, Float> LJI;

    public C375320Ena(C2260311DdV c2260311DdV) {
        this.LIZ = c2260311DdV;
        Float fValueOf = Float.valueOf(0.0f);
        this.LJI = new Pair<>(fValueOf, fValueOf);
        c2260311DdV.setOnGestureListener(new InterfaceC2260341DdY() { // from class: X.0Enb
            public final SparseIntArray LIZ = new SparseIntArray();

            @Override // X.InterfaceC2260341DdY
            public final void LIZ() {
            }

            @Override // X.InterfaceC2260341DdY
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC2260341DdY
            public final void LJ() {
            }

            @Override // X.InterfaceC2260341DdY
            public final void LIZJ() {
                ArrayList<InterfaceC375350End> arrayList = this.LIZIZ.LIZIZ;
                ArrayList<InterfaceC375310EnZ> arrayList2 = new ArrayList();
                for (InterfaceC375350End interfaceC375350End : arrayList) {
                    if (this.LIZ.get(interfaceC375350End.hashCode(), -1) != -1) {
                        arrayList2.add(interfaceC375350End);
                    }
                }
                for (InterfaceC375310EnZ interfaceC375310EnZ : arrayList2) {
                    int i = this.LIZ.get(interfaceC375310EnZ.hashCode());
                    interfaceC375310EnZ.LIZLLL((i & 1) != 0, (i & 16) != 0, (i & 256) != 0, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0, (i & 65536) != 0);
                }
                this.LIZ.clear();
            }

            @Override // X.InterfaceC2260341DdY
            public final void LJI() {
                this.LIZ.clear();
            }

            @Override // X.InterfaceC2260341DdY
            public final boolean LIZIZ(MotionEvent motionEvent) {
                InterfaceC375350End interfaceC375350EndLIZ;
                if (motionEvent != null && (interfaceC375350EndLIZ = this.LIZIZ.LIZ(motionEvent, true)) != null) {
                    LJII(interfaceC375350EndLIZ, 16);
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC2260341DdY
            public final boolean LJJJJ(MotionEvent motionEvent) {
                Iterator<InterfaceC375350End> it2 = this.LIZIZ.LIZIZ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJJJJ(motionEvent)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC2260341DdY
            public final void LJJLIIIJLJLI(float f) {
                float f2;
                C375320Ena c375320Ena = this.LIZIZ;
                NLETrack nLETrack = c375320Ena.LJ;
                NLETrackSlot nLETrackSlot = c375320Ena.LIZLLL;
                if (nLETrack != null && nLETrackSlot != null && !c375320Ena.LIZIZ.isEmpty()) {
                    for (InterfaceC375350End interfaceC375350End : this.LIZIZ.LIZIZ) {
                        if (interfaceC375350End.LJI(nLETrack, nLETrackSlot)) {
                            if (interfaceC375350End.LJIIL() == C00B8.ANTICLOCKWISE) {
                                f2 = -f;
                            } else {
                                f2 = f;
                            }
                            if (interfaceC375350End.LJIIIZ(nLETrack, nLETrackSlot, (int) f2)) {
                                LJII(interfaceC375350End, 65536);
                                return;
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC2260341DdY
            public final void onScale(float f) {
                C375320Ena c375320Ena = this.LIZIZ;
                NLETrack nLETrack = c375320Ena.LJ;
                NLETrackSlot nLETrackSlot = c375320Ena.LIZLLL;
                if (nLETrack != null && nLETrackSlot != null && !c375320Ena.LIZIZ.isEmpty()) {
                    for (InterfaceC375350End interfaceC375350End : this.LIZIZ.LIZIZ) {
                        if (interfaceC375350End.LJI(nLETrack, nLETrackSlot) && interfaceC375350End.LJIILJJIL(nLETrack, nLETrackSlot, f)) {
                            LJII(interfaceC375350End, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                            return;
                        }
                    }
                }
            }

            @Override // X.InterfaceC2260341DdY
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                InterfaceC375350End interfaceC375350EndLIZ;
                if (motionEvent == null || (interfaceC375350EndLIZ = this.LIZIZ.LIZ(motionEvent, false)) == null) {
                    return false;
                }
                LJII(interfaceC375350EndLIZ, 1);
                return true;
            }

            public final void LJII(InterfaceC375350End interfaceC375350End, int i) {
                if (this.LIZ.get(interfaceC375350End.hashCode(), -1) == -1) {
                    this.LIZ.put(interfaceC375350End.hashCode(), i);
                } else {
                    this.LIZ.put(interfaceC375350End.hashCode(), i | this.LIZ.get(interfaceC375350End.hashCode()));
                }
            }

            @Override // X.InterfaceC2260341DdY
            public final void LJFF(int i, float f, float f2) {
                float f3;
                float f4;
                C375320Ena c375320Ena = this.LIZIZ;
                NLETrack nLETrack = c375320Ena.LJ;
                NLETrackSlot nLETrackSlot = c375320Ena.LIZLLL;
                if (nLETrack != null && nLETrackSlot != null && !c375320Ena.LIZIZ.isEmpty()) {
                    C375320Ena c375320Ena2 = this.LIZIZ;
                    for (InterfaceC375350End interfaceC375350End : c375320Ena2.LIZIZ) {
                        if (interfaceC375350End.LJI(nLETrack, nLETrackSlot)) {
                            Pair<Float, Float> pair = c375320Ena2.LJI;
                            interfaceC375350End.LJIJ();
                            float f5 = 1.0f * f;
                            interfaceC375350End.LJIJ();
                            float f6 = 1.0f * f2;
                            if (interfaceC375350End.LJIIJJI() != EnumC375280EnW.RIGHT) {
                                float f7 = -1;
                                f3 = f * f7;
                                f5 *= f7;
                            } else {
                                f3 = f;
                            }
                            if (interfaceC375350End.LJIILL() != EnumC375290EnX.DOWN) {
                                float f8 = -1;
                                f4 = f2 * f8;
                                f6 *= f8;
                            } else {
                                f4 = f2;
                            }
                            if (interfaceC375350End.LJIIZILJ(nLETrack, nLETrackSlot, i, f3, f4, f5 / pair.getFirst().floatValue(), f6 / pair.getSecond().floatValue())) {
                                LJII(interfaceC375350End, 256);
                                return;
                            }
                        }
                    }
                }
            }
        });
    }

    public final InterfaceC375350End LIZ(MotionEvent motionEvent, boolean z) {
        NLEModel nLEModel = this.LIZJ;
        if (nLEModel == null) {
            return null;
        }
        long j = this.LJFF;
        Float fValueOf = Float.valueOf(nLEModel.getCanvasRatio());
        if (fValueOf.floatValue() != 0.0f) {
            fValueOf.floatValue();
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            NLEVideoFrameModel cover = nLEModel.getCover();
            if (cover != null && cover.getEnable()) {
                tracks = nLEModel.getCover().getTracks();
            }
            HashMap map = new HashMap();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getEnable()) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList) {
                VecNLETrackSlotSPtr slots = nLETrack2.getSlots();
                ArrayList arrayList2 = new ArrayList();
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    long endTime = Long.MAX_VALUE;
                    if (nLETrackSlot2.getEndTime() != Long.MAX_VALUE) {
                        endTime = nLETrackSlot2.getEndTime() + 1;
                    }
                    if (nLETrackSlot2.getStartTime() <= j && j < endTime) {
                        arrayList2.add(nLETrackSlot);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    map.put(nLETrack2, arrayList2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((NLETrack) entry.getKey()).getTrackType() == NLETrackType.STICKER) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (NLETrack nLETrack3 : C13LP.LJLLLL(new AComparatorS24S0000000_5(154), linkedHashMap.keySet())) {
                List list = (List) map.get(nLETrack3);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC375350End interfaceC375350EndLIZIZ = LIZIZ(nLETrack3, (NLETrackSlot) it2.next(), motionEvent, z);
                        if (interfaceC375350EndLIZIZ != null) {
                            return interfaceC375350EndLIZIZ;
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (((NLETrack) entry2.getKey()).getTrackType() != NLETrackType.STICKER) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (NLETrack nLETrack4 : C13LP.LJLLLL(new AComparatorS24S0000000_5(155), linkedHashMap2.keySet())) {
                List list2 = (List) map.get(nLETrack4);
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC375350End interfaceC375350EndLIZIZ2 = LIZIZ(nLETrack4, (NLETrackSlot) it3.next(), motionEvent, z);
                        if (interfaceC375350EndLIZIZ2 != null) {
                            return interfaceC375350EndLIZIZ2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final InterfaceC375350End LIZIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent, boolean z) {
        boolean zLJIIIIZZ;
        ArrayList<InterfaceC375350End> arrayList = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC375350End interfaceC375350End : arrayList) {
            if (interfaceC375350End.LJI(nLETrack, nLETrackSlot)) {
                arrayList2.add(interfaceC375350End);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            Float fValueOf = null;
            if (!it2.hasNext()) {
                return null;
            }
            InterfaceC375350End interfaceC375350End2 = (InterfaceC375350End) it2.next();
            NLEModel nLEModel = this.LIZJ;
            if (nLEModel != null) {
                fValueOf = Float.valueOf(nLEModel.getCanvasRatio());
            }
            C375170EnL c375170EnLLIZIZ = C375260EnU.LIZIZ(interfaceC375350End2, nLETrackSlot, fValueOf, this.LJI, Integer.valueOf(this.LIZ.getMeasuredWidth()), Integer.valueOf(this.LIZ.getMeasuredHeight()));
            if (c375170EnLLIZIZ != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (nLETrackSlot != null) {
                    float f = x - c375170EnLLIZIZ.LIZJ;
                    float f2 = y - c375170EnLLIZIZ.LIZLLL;
                    Matrix matrix = new Matrix();
                    matrix.setRotate(-c375170EnLLIZIZ.LJ);
                    float[] fArr = {f, f2};
                    matrix.mapPoints(fArr);
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    float f5 = c375170EnLLIZIZ.LIZ / 2.0f;
                    float f6 = c375170EnLLIZIZ.LIZIZ / 2.0f;
                    if ((-f5) <= f3 && f3 <= f5 && (-f6) <= f4 && f4 <= f6) {
                        if (z) {
                            zLJIIIIZZ = interfaceC375350End2.LJIILIIL(nLETrack, nLETrackSlot, motionEvent);
                        } else {
                            zLJIIIIZZ = interfaceC375350End2.LJIIIIZZ(nLETrack, nLETrackSlot, motionEvent);
                        }
                        if (zLJIIIIZZ) {
                            return interfaceC375350End2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
