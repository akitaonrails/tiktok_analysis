package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366040EWs implements InterfaceC379610EuV, InterfaceC366210EXj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZLL;
    public final C0EX2 LLILLJJLI = C0EX2.VIDEO_RELATED;
    public final C348830Dlx LLILZIL = new C348830Dlx();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C366040EWs.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C366040EWs.class, "editorContext", "getEditorContext()Lcom/ss/ugc/android/editor/core/EditorContextApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C366040EWs.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C366040EWs(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC357200DzS.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C0EC7.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        if (!nLETrack.getMainTrack() && !C351220Dpo.LLLLJ(nLETrack)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        NLEModel nLEModel = c0ey3.LIZ;
        C348830Dlx c348830Dlx = this.LLILZIL;
        float voiceVolume = c0ey3.LIZIZ.getVoiceVolume();
        boolean modelMute = c0ey3.LIZIZ.getEditorProModel().getModelMute();
        c348830Dlx.getClass();
        C348830Dlx.LJFF(nLEModel, C348830Dlx.LIZIZ(nLEModel), C348830Dlx.LIZJ(nLEModel), voiceVolume, modelMute);
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        InterfaceC359850E8x interfaceC359850E8xB20;
        InterfaceC359850E8x interfaceC359850E8xB202;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String uuid;
        C361980EHc c361980EHcLJIL;
        C0EY1 c0ey1;
        List<C0EY8> list;
        Object next;
        C1664740tQG c1664740tQG = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        C0EGY c0egy = (C0EGY) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (c0egy != null && (interfaceC359850E8xB202 = c0egy.B20()) != null && (nLETrackSlotLLLLLLIL = ((InterfaceC357200DzS) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1])).LLLLLLIL()) != null && (uuid = nLETrackSlotLLLLLLIL.getUUID()) != null && (c361980EHcLJIL = interfaceC359850E8xB202.LJIL()) != null && (c0ey1 = c0exh.LIZIZ) != null && (list = c0ey1.LIZ) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C0EY8> it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().LIZIZ.getSlots(), arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), uuid)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot != null) {
                for (C361980EHc c361980EHc : (ArrayList) c361980EHcLJIL.LIZ) {
                    Map<String, InterfaceC352990Dsf> map = C353810Dtz.LIZ;
                    interfaceC359850E8xB202.LJIIZILJ(c361980EHc.LJI, C353810Dtz.LIZ(nLETrackSlot, c361980EHc.LJI), false);
                }
            }
        }
        Map<String, InterfaceC352990Dsf> map2 = C353810Dtz.LIZ;
        C353890Du7 c353890Du7LIZIZ = C353810Dtz.LIZIZ("bottom_item_root_sound_sync", c0ey3.LIZ, this.LL);
        C0EGY c0egy2 = (C0EGY) this.LLILLL.getValue(this, LLIZ[0]);
        if (c0egy2 != null && (interfaceC359850E8xB20 = c0egy2.B20()) != null) {
            interfaceC359850E8xB20.LJIIZILJ("bottom_item_root_sound_sync", c353890Du7LIZIZ, false);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        Collection arrayList;
        boolean z;
        List<NLETrack> list;
        NLETrack mainTrack = c0ey3.LIZ.getMainTrack();
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(c0ey3.LIZ);
        C348830Dlx c348830Dlx = this.LLILZIL;
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
        }
        c348830Dlx.getClass();
        Pair pairLJ = C348830Dlx.LJ(mainTrack, null, arrayList2);
        float fFloatValue = ((Number) pairLJ.getFirst()).floatValue();
        boolean zBooleanValue = ((Boolean) pairLJ.getSecond()).booleanValue();
        EditorProModel editorProModel = c0ey3.LIZIZ.getEditorProModel();
        C363500EMy c363500EMy = C363500EMy.LIZ;
        NLEModel nLEModel = c0ey3.LIZ;
        c363500EMy.getClass();
        C362740EKa.LIZ.getClass();
        editorProModel.setHasAudioInAdvanceEdit(C362740EKa.LJFF(nLEModel));
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        if (zBooleanValue) {
            fFloatValue = 0.0f;
        }
        videoPublishEditModel.setVoiceVolume(fFloatValue);
        c0ey3.LIZIZ.getEditorProModel().setModelMute(zBooleanValue);
        C0EXG c0exg = c0exh.LIZLLL;
        if (c0exg != null && (list = c0exg.LIZ) != null) {
            arrayList = new ArrayList();
            Iterator<NLETrack> it3 = list.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getSlots(), arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        VideoPublishEditModel videoPublishEditModel2 = c0ey3.LIZIZ;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            videoPublishEditModel2.isCurrentAutoCutMode();
            z = false;
        } else {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (C351220Dpo.LLI((NLETrackSlot) it4.next())) {
                    z = true;
                    break;
                }
            }
            videoPublishEditModel2.isCurrentAutoCutMode();
            z = false;
        }
        if (videoPublishEditModel2.getVeAudioRecorderParam() == null) {
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.setHasOriginalSound(z);
            audioRecorderParam.setNeedOriginalSound(z);
            videoPublishEditModel2.setVeAudioRecorderParam(audioRecorderParam);
        }
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel2.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setHasOriginalSound(z);
        }
        AudioRecorderParam veAudioRecorderParam2 = videoPublishEditModel2.getVeAudioRecorderParam();
        if (veAudioRecorderParam2 != null) {
            if (!veAudioRecorderParam2.getNeedOriginalSound()) {
                veAudioRecorderParam2.setNeedOriginalSound(!zBooleanValue);
            }
            if (veAudioRecorderParam2.getNeedOriginalSound()) {
                veAudioRecorderParam2.setMuteByAudioCopyright(false);
            }
            veAudioRecorderParam2.setVoiceVolume(videoPublishEditModel2.getVoiceVolume());
        }
        Pair<Integer, Integer> pairLJJII = u4.LJJII(c0ey3.LIZ, false);
        int iIntValue = pairLJJII.getFirst().intValue();
        int iIntValue2 = pairLJJII.getSecond().intValue();
        c0ey3.LIZIZ.setVideoCount(iIntValue);
        c0ey3.LIZIZ.setPhotoCount(iIntValue2);
        VideoPublishEditModel videoPublishEditModel3 = c0ey3.LIZIZ;
        CommonMobParamModel commonMobParamModel = videoPublishEditModel3.creativeModel.commonMobModel;
        commonMobParamModel.originVideoCount = iIntValue;
        commonMobParamModel.originPhotoCount = iIntValue2;
        C0EYI.LIZIZ(videoPublishEditModel3, c0ey3.LIZ);
        C1436990nUv.LJIIJ(c0ey3.LIZIZ, c0ey3.LIZ);
        ((C0EC7) this.LLILZLL.getValue(this, LLIZ[2])).Vi0().LIZIZ(c0ey3.LIZ);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
