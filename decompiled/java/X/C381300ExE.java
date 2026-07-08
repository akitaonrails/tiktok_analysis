package X;

import Y.ARunnableS4S0500000_5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS47S0000100_5;

/* JADX INFO: renamed from: X.0ExE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381300ExE extends AbstractC538070L8j {
    public final boolean LJII;
    public InterfaceC381510ExZ<C381480ExW, C381330ExH> LJIIIIZZ;
    public final Map<NLETrackSlot, Map<String, String>> LJIIIZ = new LinkedHashMap();
    public final C054G LJIIJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "COMBINE_EFFECT";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        super.cancel();
        InterfaceC381510ExZ<C381480ExW, C381330ExH> interfaceC381510ExZ = this.LJIIIIZZ;
        if (interfaceC381510ExZ != null) {
            interfaceC381510ExZ.cancel();
        }
        C2296808zG.LIZJ(this.LJIIJ, null);
    }

    public C381300ExE(boolean z) {
        this.LJII = z;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        Set<Integer> setLIZIZ;
        super.LJIIZILJ(c0fqs);
        ((LinkedHashMap) this.LJIIIZ).clear();
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            LIZJ(c0fqs, null);
            return false;
        }
        if (C358630E4f.LIZ()) {
            if (c0fqs.LJIIJJI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("COMBINE_EFFECT");
                sbLIZ.append(": NLETemplateModel is NULL");
                LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ), 4));
                return false;
            }
            C0F1S c0f1s = c0fqs.LIZIZ;
            if (c0f1s == null || c0f1s.LIZ.length() <= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("COMBINE_EFFECT");
                sbLIZ2.append(": ");
                sbLIZ2.append(c0fqs.LIZIZ);
                LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ2), 4));
                return false;
            }
        }
        LJJIJIIJI(c0fqs, 0, c0fqs.LJIL, null);
        return false;
    }

    public final void LJJIJIIJI(C0FQS c0fqs, int i, List<C381340ExI> list, C381330ExH c381330ExH) {
        NLETrackSlot nLETrackSlot;
        if (LJJIIJZLJL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("executeSerial: isFinished. index=");
            sbLIZ.append(i);
            sbLIZ.append(", total=");
            sbLIZ.append(list.size());
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c0fqs.LJJIIJ == null) {
            return;
        }
        C381340ExI c381340ExI = (C381340ExI) C13LP.LJJJLZIJ(i, list);
        if (c381340ExI != null && (nLETrackSlot = c381340ExI.LIZ) != null) {
            LJJIJ(i, list, c0fqs, nLETrackSlot, c381340ExI, 0);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("executeSerial: End. index=");
        sbLIZ2.append(i);
        sbLIZ2.append(", total=");
        sbLIZ2.append(list.size());
        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
        C23250099c.LIZLLL(this.LJIIJ, null, null, new C380420Evo(list, this, c0fqs, c381330ExH, null), 3);
    }

    public final void LJJIJ(int i, List<C381340ExI> list, C0FQS c0fqs, NLETrackSlot nLETrackSlot, C381340ExI c381340ExI, int i2) {
        INLEPlayer iNLEPlayer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeSerial: index=");
        sbLIZ.append(i);
        sbLIZ.append(", total=");
        sbLIZ.append(list.size());
        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
        AwS47S0000100_5 awS47S0000100_5 = new AwS47S0000100_5(System.currentTimeMillis(), 1);
        C381410ExP c381410ExP = c0fqs.LJIJ;
        if (c381410ExP != null) {
            iNLEPlayer = c381410ExP.LIZJ;
        } else {
            iNLEPlayer = null;
        }
        C381280ExC c381280ExC = new C381280ExC(this, i, list, awS47S0000100_5, c0fqs, c381340ExI, nLETrackSlot, i2);
        if (iNLEPlayer != null) {
            long startTime = nLETrackSlot.getStartTime() + (nLETrackSlot.getDuration() / ((long) 2));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TemplateCombineEffectTaskV0 seekToSlot --");
            sbLIZ2.append(startTime);
            sbLIZ2.append("-----");
            C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ2));
            iNLEPlayer.seekTime(startTime);
            C786410Ut5.LJJZZIII(this.LJIIJJI, new ARunnableS4S0500000_5(this, new C013C(), iNLEPlayer, nLETrackSlot, c381280ExC, 1));
        }
    }
}
