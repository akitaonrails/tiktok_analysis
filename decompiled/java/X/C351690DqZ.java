package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351690DqZ extends AbstractC2255721DQs<C0ENB> implements C0ENB, InterfaceC379610EuV {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1265));
    public final C0ENB LLILLL = this;

    private final C0E48 X1() {
        return (C0E48) this.LLILLJJLI.getValue();
    }

    private final VideoPublishEditModel bb2() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.C0ENB
    public void Ax2() {
        long startTime;
        long startTime2;
        NLECommonKeyframe nLECommonKeyframe;
        C0E48 c0e48X1 = X1();
        if (c0e48X1 == null) {
            return;
        }
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48X1.getPlayer().Jh());
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48X1.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL == null) {
            return;
        }
        c0e48X1.og().LLF(C351220Dpo.LLLLLLJ((long) (C360610EBv.LIZIZ / C360610EBv.LIZJ())));
        if (Ah(jLLLLLLJ) == null) {
            return;
        }
        c0e48X1.og().LJLIIL();
        if (xZ1() && C351220Dpo.LLIIIJ(c0e48X1.LLLLLLIL())) {
            NLETimeSpaceNode value = c0e48X1.og().LJJJJL().getValue();
            if (!(value instanceof NLECommonKeyframe) || (nLECommonKeyframe = (NLECommonKeyframe) value) == null) {
                return;
            }
            startTime2 = nLECommonKeyframe.getTimeOffset();
            startTime = nLETrackSlotLLLLLLIL.getStartTime();
        } else {
            NLETimeSpaceNode value2 = c0e48X1.og().LJJJJL().getValue();
            if (value2 == null) {
                return;
            }
            startTime = nLETrackSlotLLLLLLIL.getStartTime();
            startTime2 = value2.getStartTime();
        }
        long j = startTime + startTime2;
        if (j >= 0) {
            long startTime3 = nLETrackSlotLLLLLLIL.getStartTime();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            c0e48X1.getPlayer().LJJII(C13LZ.LJFF(j, startTime3 + j2, nLETrackSlotLLLLLLIL.getEndTime() - j2), new INLEListenerSeek() { // from class: X.0Dqa
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                public final void onSeekDone(int i) {
                }
            });
        }
    }

    @Override // X.C0ENB
    public boolean X5() {
        InterfaceC351610DqR interfaceC351610DqROg;
        InterfaceC351610DqR interfaceC351610DqROg2;
        if (xZ1()) {
            C0E48 c0e48X1 = X1();
            if (c0e48X1 == null || (interfaceC351610DqROg2 = c0e48X1.og()) == null) {
                return false;
            }
            return interfaceC351610DqROg2.LLFF();
        }
        C0E48 c0e48X12 = X1();
        if (c0e48X12 == null || (interfaceC351610DqROg = c0e48X12.og()) == null) {
            return false;
        }
        return interfaceC351610DqROg.X5();
    }

    @Override // X.C0ENB
    public boolean f80() {
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData<NLETimeSpaceNode> mutableLiveDataLJJJJL;
        C0E48 c0e48X1 = X1();
        if (Ah(c0e48X1 != null ? C351220Dpo.LLLLLLJ(c0e48X1.getPlayer().Jh()) : 0L) != null) {
            return true;
        }
        C0E48 c0e48X12 = X1();
        return (c0e48X12 == null || (interfaceC351610DqROg = c0e48X12.og()) == null || (mutableLiveDataLJJJJL = interfaceC351610DqROg.LJJJJL()) == null || mutableLiveDataLJJJJL.getValue() == null) ? false : true;
    }

    @Override // X.C0ENB
    public boolean xZ1() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        VideoPublishEditModel videoPublishEditModelBb2 = bb2();
        boolean z = false;
        if (videoPublishEditModelBb2 != null && (creativeModel = videoPublishEditModelBb2.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate) {
            z = true;
        }
        return C351230Dpp.LIZLLL(Boolean.valueOf(z));
    }

    public C0ENB W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C351690DqZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0ENB
    public NLETimeSpaceNode Ah(long j) {
        InterfaceC351610DqR interfaceC351610DqROg;
        InterfaceC351610DqR interfaceC351610DqROg2;
        List<NLECommonKeyframe> listLJJLIIIJJIZ;
        if (X1() == null) {
            return null;
        }
        if (xZ1()) {
            C0E48 c0e48X1 = X1();
            if (c0e48X1 == null || (interfaceC351610DqROg2 = c0e48X1.og()) == null || (listLJJLIIIJJIZ = interfaceC351610DqROg2.LJJLIIIJJIZ(j)) == null) {
                return null;
            }
            return (NLETimeSpaceNode) C13LP.LJJJLL(listLJJLIIIJJIZ);
        }
        C0E48 c0e48X12 = X1();
        if (c0e48X12 == null || (interfaceC351610DqROg = c0e48X12.og()) == null) {
            return null;
        }
        return interfaceC351610DqROg.Ah(j);
    }

    @Override // X.C0ENB
    public void yB0(long j) {
        InterfaceC351610DqR interfaceC351610DqROg;
        NLETrackSlot nLETrackSlotAh;
        InterfaceC351610DqR interfaceC351610DqROg2;
        if (xZ1()) {
            C0E48 c0e48X1 = X1();
            if (c0e48X1 != null && (interfaceC351610DqROg2 = c0e48X1.og()) != null) {
                interfaceC351610DqROg2.LLILIL(j);
                return;
            }
            return;
        }
        C0E48 c0e48X12 = X1();
        if (c0e48X12 == null || (interfaceC351610DqROg = c0e48X12.og()) == null || (nLETrackSlotAh = interfaceC351610DqROg.Ah(j)) == null) {
            return;
        }
        interfaceC351610DqROg.LJJIIJ(nLETrackSlotAh);
    }

    @Override // X.C0ENB
    public boolean yv(NLEKeyframeType nLEKeyframeType) {
        InterfaceC351610DqR interfaceC351610DqROg;
        C0E48 c0e48X1 = X1();
        if (c0e48X1 == null || (interfaceC351610DqROg = c0e48X1.og()) == null || !interfaceC351610DqROg.yv(nLEKeyframeType)) {
            return false;
        }
        return true;
    }

    @Override // X.C0ENB
    public void Xb(NLEKeyframeType nLEKeyframeType, boolean z) {
        C0E48 c0e48X1 = X1();
        if (c0e48X1 != null) {
            if (xZ1()) {
                c0e48X1.og().Xb(nLEKeyframeType, z);
            } else {
                c0e48X1.og().LLIILII(z);
            }
        }
    }
}
