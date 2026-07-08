package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import ge.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Enq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375480Enq extends i<InterfaceC374950Emz, C375370Enf, C375420Enk, C375460Eno> implements InterfaceC379610EuV, InterfaceC374950Emz {
    public static final int LLJJJ = 8;
    public final C1DRG LLJILJILJ;
    public NLEModel LLJILLL;
    public Pair<Float, Float> LLJJ;
    public final HashMap<String, InterfaceC375350End> LLJJI;
    public volatile C737702uN LLJJIII;
    public Pair<? extends NLETrack, ? extends NLETrackSlot> LLJJIJI;
    public NLEEditor LLJJIJIIJIL;
    public Float LLJJIJIL;

    @Override // X.InterfaceC374950Emz
    public void JI1() {
        i3(AFwS234S0000000_5.get$arr$(564));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C375420Enk> o2() {
        return AFwS191S0000000_5.get$arr$(405);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C375460Eno> w2() {
        return new AwS549S0100000_5(this, 1616);
    }

    public final C737702uN H4() {
        return this.LLJJIII;
    }

    public final Float K4() {
        return this.LLJJIJIL;
    }

    public final NLEEditor O4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC374950Emz
    public void LLJJIJIIJIL(boolean z) {
        i3(new AwS20S0010000_5(z, 68));
    }

    public final void P4(C737702uN c737702uN) {
        this.LLJJIII = c737702uN;
    }

    public final void T4(Float f) {
        this.LLJJIJIL = f;
    }

    public final void Z4(Pair<? extends NLETrack, ? extends NLETrackSlot> pair) {
        this.LLJJIJI = pair;
    }

    public final void d5(NLEEditor nLEEditor) {
        this.LLJJIJIIJIL = nLEEditor;
    }

    @Override // X.InterfaceC374950Emz
    public <T extends InterfaceC375350End> T kG(String str) {
        return (T) this.LLJJI.get(str);
    }

    @Override // X.InterfaceC374950Emz
    public void ow0(String str) {
        for (Map.Entry<String, InterfaceC375350End> entry : this.LLJJI.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), str)) {
                entry.getValue().LJIIJ();
            } else {
                entry.getValue().LJII();
            }
        }
    }

    @Override // X.InterfaceC374950Emz
    public void yc(NLEModel nLEModel) {
        NLETrackSlot second;
        NLETrackSlot nLETrackSlotLIZJ;
        NLETrack trackBySlot;
        this.LLJILLL = nLEModel;
        i3(new AwS584S0100000_5(nLEModel, 1157));
        Pair<NLETrack, NLETrackSlot> pair = T2().LIZIZ;
        if (pair != null && (second = pair.getSecond()) != null && (nLETrackSlotLIZJ = C354870Dvh.LIZJ(nLEModel, second.getUUID())) != null && !Intrinsics.LJFF(nLETrackSlotLIZJ.getStringId(), second.getStringId()) && (trackBySlot = nLEModel.getTrackBySlot(nLETrackSlotLIZJ)) != null) {
            i3(new AwS371S0200000_5(trackBySlot, nLETrackSlotLIZJ, 298));
        }
    }

    public C375480Enq(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        Float fValueOf = Float.valueOf(0.0f);
        this.LLJJ = new Pair<>(fValueOf, fValueOf);
        this.LLJJI = new HashMap<>();
    }

    @Override // X.InterfaceC374950Emz
    public void BY0(long j, boolean z) {
        i3(new AwS24S0000100_5(j, 10));
    }

    @Override // X.InterfaceC374950Emz
    public void NA0(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        i3(new AwS371S0200000_5(nLETrack, nLETrackSlot, 297));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.02uN] */
    public final void k5(final int i, final int i2) {
        final float canvasRatio;
        NLEModel nLEModel = this.LLJILLL;
        if (nLEModel != null) {
            canvasRatio = nLEModel.getCanvasRatio();
        } else {
            canvasRatio = 0.5625f;
        }
        this.LLJJIII = new Object(i, i2, canvasRatio) { // from class: X.02uN
            public final int LIZ;
            public final int LIZIZ;
            public final float LIZJ;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CanvasInfo(viewWidth=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", viewHeight=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", canvasRatio=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (((this.LIZ * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C737702uN)) {
                    return false;
                }
                C737702uN c737702uN = (C737702uN) obj;
                if (this.LIZ == c737702uN.LIZ && this.LIZIZ == c737702uN.LIZIZ && this.LIZJ == c737702uN.LIZJ) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZJ = canvasRatio;
            }
        };
        Pair<Float, Float> pairF4 = F4(canvasRatio, i, i2);
        this.LLJJ = pairF4;
        i3(new AwS584S0100000_5(pairF4, (Pair<Integer, Integer>) 1156));
    }

    @Override // X.InterfaceC374950Emz
    public void vL2(String str, InterfaceC375350End interfaceC375350End) {
        this.LLJJI.put(str, interfaceC375350End);
        i3(new AwS584S0100000_5(C13LP.LLIIII(this.LLJJI.values()), (List<Pair<Long, Float>>) 1155));
    }

    private final Pair<Float, Float> F4(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float fValueOf = Float.valueOf(1280.0f);
        Float fValueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (Math.abs(f5) <= Float.MAX_VALUE && Math.abs(f3) <= Float.MAX_VALUE) {
                return new Pair<>(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new Pair<>(fValueOf2, fValueOf);
        }
        float f6 = f2 / f;
        if (Math.abs(f2) <= Float.MAX_VALUE && Math.abs(f6) <= Float.MAX_VALUE) {
            return new Pair<>(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new Pair<>(fValueOf2, fValueOf);
    }
}
