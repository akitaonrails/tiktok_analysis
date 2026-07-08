package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354470Dv3 extends C354220Due implements InterfaceC354500Dv6 {
    public final NLEEditor LL;
    public final INLEPlayer LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public InterfaceC381510ExZ<C381480ExW, C381330ExH> LLILZIL;
    public final int LLILZLL;

    @Override // X.InterfaceC354500Dv6
    public final void LIZ() {
        InterfaceC381510ExZ<C381480ExW, C381330ExH> interfaceC381510ExZ = this.LLILZIL;
        if (interfaceC381510ExZ != null) {
            interfaceC381510ExZ.cancel();
        }
    }

    public /* synthetic */ C354470Dv3(NLEEditor nLEEditor, INLEPlayer iNLEPlayer, String str) {
        this(nLEEditor, iNLEPlayer, str, 30);
    }

    @Override // X.C354220Due, X.AbstractC354420Duy
    public final void LIZJ(C354540DvA c354540DvA, C354550DvB c354550DvB, C354570DvD c354570DvD) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        Map linkedHashMap;
        NLEResourceAV aVFile;
        C354510Dv7 c354510Dv7 = c354540DvA.LIZIZ.LIZ;
        NLETemplateModel nLETemplateModel = c354540DvA.LIZJ;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
            C354260Dui.LIZ.getClass();
            NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot);
            if (nLEVideoEffectLJFF != null && !C357030DzB.LIZ(c354510Dv7)) {
                C354240Dug c354240Dug = c354540DvA.LIZIZ;
                NLETrackSlot nLETrackSlot2 = c354240Dug.LIZIZ;
                C354510Dv7 c354510Dv72 = c354240Dug.LIZ;
                String str = c354510Dv72.LIZIZ;
                String str2 = c354510Dv72.LIZJ;
                String str3 = c354510Dv72.LIZ;
                String str4 = c354510Dv72.LJIIIIZZ;
                String str5 = c354510Dv72.LIZLLL;
                String str6 = c354510Dv72.LJII;
                boolean z = !c354510Dv72.LJIIJ;
                nLEVideoEffectLJFF.setExtra("ep_client_magic_resource_path", str5);
                C354260Dui.LIZIZ(nLETrackSlot2, str, str2, str3, str4);
                nLETrackSlot2.setExtra("ep_magic_category_id", str6);
                NLEVideoEffect nLEVideoEffectDynamicCast = NLEVideoEffect.dynamicCast(nLEVideoEffectLJFF.deepClone(true));
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && aVFile.getResourceFile() != null) {
                    C354270Duj.LIZ(0L, new C354580DvE(nLETrackSlot2, nLEVideoEffectDynamicCast, this, str, str2, z, nLESegmentVideoDynamicCast, c354550DvB, nLETrackSlot));
                    return;
                }
            } else {
                if (c354570DvD == null || (linkedHashMap = c354570DvD.LIZJ) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                c354550DvB.LIZ(new C354570DvD(true, null, linkedHashMap, 2));
                return;
            }
        }
        c354550DvB.LIZ(new C354570DvD(false, EnumC355970DxT.TEMPLATEMODEL_NULL_ERROR, null, 4));
    }

    public C354470Dv3(NLEEditor nLEEditor, INLEPlayer iNLEPlayer, String str, int i) {
        this.LL = nLEEditor;
        this.LLILLJJLI = iNLEPlayer;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZLL = 100 - i;
    }
}
