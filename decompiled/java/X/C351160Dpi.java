package X;

import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351160Dpi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC351200Dpm LL;
    public final /* synthetic */ C351190Dpl LLILLJJLI;
    public final /* synthetic */ C351560DqM LLILLL;
    public final /* synthetic */ NLETrackSlot LLILZ;
    public final /* synthetic */ C351180Dpk LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351160Dpi(InterfaceC351200Dpm interfaceC351200Dpm, C351190Dpl c351190Dpl, C351560DqM c351560DqM, NLETrackSlot nLETrackSlot, C351180Dpk c351180Dpk, C013C c013c, long j) {
        super(0);
        this.LL = interfaceC351200Dpm;
        this.LLILLJJLI = c351190Dpl;
        this.LLILLL = c351560DqM;
        this.LLILZ = nLETrackSlot;
        this.LLILZIL = c351180Dpk;
        this.LLILZLL = c013c;
        this.LLIZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLIZLLL;
        String resourceFile;
        NLETrackSlot nLETrackSlot;
        String resourceFile2;
        NLETrackSlot renderProxy;
        String resourceFile3;
        VecNLEPointSPtr segCurveSpeedPoints;
        VecNLEPointSPtr segCurveSpeedPoints2;
        String resourceFile4;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile5;
        String strLLJJJIL;
        InterfaceC351200Dpm interfaceC351200Dpm = this.LL;
        if (interfaceC351200Dpm != null) {
            interfaceC351200Dpm.LIZ(this.LLILLJJLI.LIZJ);
        }
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C350110Do1.LIZIZ(this.LLILLL.LLZ(), this.LLILZ).getFirst();
        if (nLETrackSlot2 != null) {
            C351180Dpk c351180Dpk = this.LLILZIL;
            C351560DqM c351560DqM = this.LLILLL;
            if (C351220Dpo.LLLIL(nLETrackSlot2)) {
                c351180Dpk.LIZJ = C351220Dpo.LJJLIIIJJI(nLETrackSlot2.getMainSegment());
            } else {
                NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null && (resourceFile5 = resource.getResourceFile()) != null && (strLLJJJIL = c351560DqM.LLJJJIL(NLEResType.AUDIO, resourceFile5)) != null && (C2113008Po.LIZIZ(strLLJJJIL) || C351560DqM.LLJJIJIIJIL(resourceFile5, strLLJJJIL) == 0)) {
                    c351180Dpk.LIZJ = strLLJJJIL;
                }
            }
        }
        InterfaceC351200Dpm interfaceC351200Dpm2 = this.LL;
        if (interfaceC351200Dpm2 != null) {
            interfaceC351200Dpm2.LIZ(this.LLILLJJLI.LIZLLL);
        }
        NLEModel nLEModelLLZ = this.LLILLL.LLZ();
        NLETrackSlot nLETrackSlot3 = this.LLILZ;
        C350110Do1.LIZJ.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = C347000Dj0.LIZIZ(nLEModelLLZ, nLETrackSlot3);
        NLESegment mainSegment3 = null;
        if (nLETrackSlotLIZIZ != null && (mainSegment = nLETrackSlotLIZIZ.getMainSegment()) != null) {
            C351180Dpk c351180Dpk2 = this.LLILZIL;
            C351560DqM c351560DqM2 = this.LLILLL;
            if (C351220Dpo.LJJLIIIJJI(mainSegment).length() <= 0 || Intrinsics.LJFF(C351220Dpo.LJJLIIIJJI(mainSegment), mainSegment.getResource().getResourceFile())) {
                String resourceFile6 = mainSegment.getResource().getResourceFile();
                String strLLJJJIL2 = c351560DqM2.LLJJJIL(NLEResType.AUDIO, resourceFile6);
                if (strLLJJJIL2 != null && (C2113008Po.LIZIZ(strLLJJJIL2) || C351560DqM.LLJJIJIIJIL(resourceFile6, strLLJJJIL2) == 0)) {
                    c351180Dpk2.LIZLLL = strLLJJJIL2;
                }
            } else {
                c351180Dpk2.LIZLLL = C351220Dpo.LJJLIIIJJI(mainSegment);
            }
        }
        InterfaceC351200Dpm interfaceC351200Dpm3 = this.LL;
        if (interfaceC351200Dpm3 != null) {
            interfaceC351200Dpm3.LIZ(1.0d);
        }
        C351560DqM c351560DqM3 = this.LLILLL;
        C351180Dpk c351180Dpk3 = this.LLILZIL;
        NLETrackSlot nLETrackSlot4 = this.LLILZ;
        boolean z = this.LLILZLL.element;
        if (!Intrinsics.LJFF(((LinkedHashMap) c351560DqM3.LJII).get(nLETrackSlot4.getUUID()), Boolean.TRUE)) {
            nLETrackSlot4.setAIMatting(null);
            nLETrackSlot4.clearChromaChannel();
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot4.getMainSegment());
            String str = "";
            if (nLESegmentVideoDynamicCast != null) {
                String str2 = c351180Dpk3.LIZ;
                NLEResType type = nLESegmentVideoDynamicCast.getType();
                C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
                C351010DpT.LIZ().getClass();
                C558340Lv6 c558340Lv6LJI = C351220Dpo.LJI(str2, type);
                jLIZLLL = C352310DrZ.LIZLLL(c558340Lv6LJI.LJ);
                int i = c558340Lv6LJI.LIZLLL;
                if (i == 90 || i == 270) {
                    NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                    if (resource2 != null) {
                        resource2.setWidth(c558340Lv6LJI.LIZJ);
                    }
                    NLEResourceNode resource3 = nLESegmentVideoDynamicCast.getResource();
                    if (resource3 != null) {
                        resource3.setHeight(c558340Lv6LJI.LIZIZ);
                    }
                } else {
                    NLEResourceNode resource4 = nLESegmentVideoDynamicCast.getResource();
                    if (resource4 != null) {
                        resource4.setWidth(c558340Lv6LJI.LIZIZ);
                    }
                    NLEResourceNode resource5 = nLESegmentVideoDynamicCast.getResource();
                    if (resource5 != null) {
                        resource5.setHeight(c558340Lv6LJI.LIZJ);
                    }
                }
                if (z) {
                    NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                    if (aVFile == null || (resourceFile4 = aVFile.getResourceFile()) == null) {
                        resourceFile4 = "";
                    }
                    nLESegmentVideoDynamicCast.setExtra("ep_origin_media_path", resourceFile4);
                }
                NLEResourceAV aVFile2 = nLESegmentVideoDynamicCast.getAVFile();
                if (aVFile2 != null) {
                    aVFile2.setResourceFile(c351180Dpk3.LIZ);
                }
                nLETrackSlot4.setExtra("is_ep_reverse_video", String.valueOf(z));
                NLEResourceNode resource6 = nLESegmentVideoDynamicCast.getResource();
                long timeClipEnd = (resource6 == null || nLESegmentVideoDynamicCast.getTimeClipEnd() != resource6.getDuration()) ? jLIZLLL - nLESegmentVideoDynamicCast.getTimeClipEnd() : 0L;
                nLESegmentVideoDynamicCast.setTimeClipEnd(jLIZLLL - nLESegmentVideoDynamicCast.getTimeClipStart());
                nLESegmentVideoDynamicCast.setTimeClipStart(timeClipEnd);
                NLEResourceNode resource7 = nLESegmentVideoDynamicCast.getResource();
                if (resource7 != null) {
                    resource7.setDuration(jLIZLLL);
                }
                nLETrackSlot4.setEndTime(Math.min(nLETrackSlot4.getStartTime() + (((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / (C351220Dpo.LIZ(nLESegmentVideoDynamicCast) * LSPassThroughRecordSizeConfig.DEFAULT))) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), nLETrackSlot4.getEndTime()));
                VecNLETrackSlotSPtr keyframes = nLETrackSlot4.getKeyframes();
                VecNLEKeyframe swingKeyframes = nLETrackSlot4.getSwingKeyframes();
                nLETrackSlot4.clearKeyframe();
                if (keyframes != null && !keyframes.isEmpty()) {
                    ArrayList<NLETimeSpaceNode> arrayList = new ArrayList(C15438062q.LJIJJ(keyframes, 10));
                    Iterator<NLETrackSlot> it2 = keyframes.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(NLETrackSlot.dynamicCast(it2.next().deepClone(true)));
                    }
                    for (NLETimeSpaceNode nLETimeSpaceNode : arrayList) {
                        nLETimeSpaceNode.setStartTime(nLETrackSlot4.getDuration() - nLETimeSpaceNode.getStartTime());
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        nLETrackSlot4.addKeyframe((NLETrackSlot) it3.next());
                    }
                }
                if (swingKeyframes != null && !swingKeyframes.isEmpty()) {
                    nLETrackSlot4.clearSwingKeyframe();
                    for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                        for (NLECommonKeyframe nLECommonKeyframe : nLEKeyframe.getSortedCommonKeyframes()) {
                            nLECommonKeyframe.setTimeOffset(nLETrackSlot4.getDuration() - nLECommonKeyframe.getTimeOffset());
                        }
                        nLETrackSlot4.addSwingKeyframe(nLEKeyframe);
                    }
                }
                NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot4);
                if (nLESegmentVideoLIZ != null && (segCurveSpeedPoints2 = nLESegmentVideoLIZ.getSegCurveSpeedPoints()) != null) {
                    for (NLEPoint nLEPoint : segCurveSpeedPoints2) {
                        nLEPoint.setX(1 - nLEPoint.getX());
                    }
                }
                NLESegmentVideo nLESegmentVideoLIZ2 = C351170Dpj.LIZ(nLETrackSlot4);
                if (nLESegmentVideoLIZ2 != null) {
                    NLESegmentVideo nLESegmentVideoLIZ3 = C351170Dpj.LIZ(nLETrackSlot4);
                    nLESegmentVideoLIZ2.setSegCurveSpeedPoints(new VecNLEPointSPtr((nLESegmentVideoLIZ3 == null || (segCurveSpeedPoints = nLESegmentVideoLIZ3.getSegCurveSpeedPoints()) == null) ? null : C13LP.LJLJJLL(segCurveSpeedPoints)));
                }
                VecNLETrackSPtr tracks = c351560DqM3.LLZ().getTracks();
                ArrayList arrayList2 = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                        arrayList2.add(nLETrack);
                    }
                }
                ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList3);
                }
                for (NLETrackSlot nLETrackSlot5 : arrayList3) {
                    if (C351220Dpo.LLLIIIL(nLETrackSlot5) && nLETrackSlot5.getStartTime() < nLETrackSlot4.getEndTime() && nLETrackSlot4.getStartTime() < nLETrackSlot5.getEndTime()) {
                        nLETrackSlot5.setPinAlgorithmFile(null);
                        nLETrackSlot5.setPinMappingAlgorithmFile(null);
                    }
                }
                mainSegment3 = null;
            } else {
                jLIZLLL = 0;
            }
            if (c351180Dpk3.LIZIZ != null && (renderProxy = nLETrackSlot4.getRenderProxy()) != null && renderProxy.getMainSegment() != null) {
                NLETrackSlot renderProxy2 = nLETrackSlot4.getRenderProxy();
                if (renderProxy2 != null) {
                    mainSegment3 = renderProxy2.getMainSegment();
                }
                NLERenderProxySegment nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment3);
                if (nLERenderProxySegmentDynamicCast != null) {
                    NLEResourceAV aVFile3 = nLERenderProxySegmentDynamicCast.getAVFile();
                    if (aVFile3 == null || (resourceFile3 = aVFile3.getResourceFile()) == null) {
                        resourceFile3 = "";
                    }
                    nLERenderProxySegmentDynamicCast.setExtra("ep_origin_media_path", resourceFile3);
                    NLEResourceAV aVFile4 = nLERenderProxySegmentDynamicCast.getAVFile();
                    if (aVFile4 != null) {
                        aVFile4.setResourceFile(c351180Dpk3.LIZIZ);
                    }
                }
            }
            if (c351180Dpk3.LIZJ != null && (nLETrackSlot = (NLETrackSlot) C350110Do1.LIZIZ(c351560DqM3.LLZ(), nLETrackSlot4).getFirst()) != null) {
                nLETrackSlot.setExtra("is_ep_reverse_video", String.valueOf(z));
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    if (z) {
                        NLEResourceNode resource8 = nLESegmentAudioDynamicCast.getResource();
                        if (resource8 == null || (resourceFile2 = resource8.getResourceFile()) == null) {
                            resourceFile2 = "";
                        }
                        nLESegmentAudioDynamicCast.setExtra("ep_origin_media_path", resourceFile2);
                    }
                    NLEResourceNode resource9 = nLESegmentAudioDynamicCast.getResource();
                    if (resource9 != null) {
                        resource9.setResourceFile(c351180Dpk3.LIZJ);
                    }
                    if (nLESegmentAudioDynamicCast.getTimeClipEnd() > jLIZLLL) {
                        nLESegmentAudioDynamicCast.setTimeClipEnd(jLIZLLL);
                    }
                    long timeClipEnd2 = jLIZLLL - nLESegmentAudioDynamicCast.getTimeClipEnd();
                    nLESegmentAudioDynamicCast.setTimeClipEnd(jLIZLLL - nLESegmentAudioDynamicCast.getTimeClipStart());
                    nLESegmentAudioDynamicCast.setTimeClipStart(timeClipEnd2);
                }
                nLETrackSlot.setEndTime(nLETrackSlot4.getEndTime());
            }
            if (c351180Dpk3.LIZLLL != null) {
                NLEModel nLEModelLLZ2 = c351560DqM3.LLZ();
                C350110Do1.LIZJ.getClass();
                NLETrackSlot nLETrackSlotLIZIZ2 = C347000Dj0.LIZIZ(nLEModelLLZ2, nLETrackSlot4);
                if (nLETrackSlotLIZIZ2 != null) {
                    NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlotLIZIZ2.getMainSegment());
                    if (nLESegmentAudioDynamicCast2 != null) {
                        NLEResourceAV aVFile5 = nLESegmentAudioDynamicCast2.getAVFile();
                        if (aVFile5 != null && (resourceFile = aVFile5.getResourceFile()) != null) {
                            str = resourceFile;
                        }
                        nLESegmentAudioDynamicCast2.setExtra("ep_origin_media_path", str);
                        NLEResourceAV aVFile6 = nLESegmentAudioDynamicCast2.getAVFile();
                        if (aVFile6 != null) {
                            aVFile6.setResourceFile(c351180Dpk3.LIZLLL);
                        }
                        if (nLESegmentAudioDynamicCast2.getTimeClipEnd() > jLIZLLL) {
                            nLESegmentAudioDynamicCast2.setTimeClipEnd(jLIZLLL);
                        }
                        long timeClipEnd3 = jLIZLLL - nLESegmentAudioDynamicCast2.getTimeClipEnd();
                        nLESegmentAudioDynamicCast2.setTimeClipEnd(jLIZLLL - nLESegmentAudioDynamicCast2.getTimeClipStart());
                        nLESegmentAudioDynamicCast2.setTimeClipStart(timeClipEnd3);
                    }
                    nLETrackSlotLIZIZ2.setEndTime(nLETrackSlot4.getEndTime());
                }
            }
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                C351510DqH.LJIIIZ(C351510DqH.LIZ, c351560DqM3.LIZ);
            }
            C350410DoV.LIZLLL((NLEEditor) c351560DqM3.LIZIZ.getValue(), true, C051R.LIZIZ(new C0E1X(C0E1V.REVERSE_VIDEO.getNameId(), null, null, null, null, 30)), false, true);
            C0E55 c0e55 = c351560DqM3.LIZLLL;
            c0e55.LIZIZ(c0e55.Jh());
        }
        InterfaceC351200Dpm interfaceC351200Dpm4 = this.LL;
        if (interfaceC351200Dpm4 != null) {
            interfaceC351200Dpm4.LJ(this.LLILZLL.element);
        }
        InterfaceC351200Dpm interfaceC351200Dpm5 = this.LL;
        if (interfaceC351200Dpm5 != null) {
            interfaceC351200Dpm5.LIZJ();
        }
        this.LLILLL.LIZLLL.LJIJI(C352310DrZ.LIZLLL(this.LLIZ), C351110Dpd.LIZ);
        return Unit.LIZ;
    }
}
