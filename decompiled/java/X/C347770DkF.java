package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioLoudnessBalanceFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347770DkF implements InterfaceC391070FUz {
    public final INLEMediaSession LIZ;
    public final Function1<AbstractC348060Dki, Unit> LIZIZ;
    public C347660Dk4 LIZJ;
    public List<C347660Dk4> LIZLLL;
    public C347060Dj6 LJ;
    public C07X6 LJFF;
    public Map<String, C347650Dk3> LJI = new LinkedHashMap();
    public final HashMap<String, C347470Djl> LJII = new HashMap<>();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1091));

    @Override // X.InterfaceC391070FUz
    public final InterfaceC358040E1y LIZ() {
        return (InterfaceC358040E1y) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC391070FUz
    public final List<C347470Djl> LJII() {
        return C13LP.LLIIII(this.LJII.values());
    }

    @Override // X.InterfaceC391070FUz
    public final C07X6 LJJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC391070FUz
    public final C347660Dk4 LJJJJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC391070FUz
    public final C347060Dj6 LJJJJL() {
        return this.LJ;
    }

    @Override // X.InterfaceC391070FUz
    public final List<C347660Dk4> LJJJJLI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC391070FUz
    public final void LJIIIIZZ(final C347470Djl c347470Djl) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347470Djl) { // from class: X.0DjA
            public final C347470Djl LIZIZ;

            {
                this.LIZIZ = c347470Djl;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c347470Djl);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                String uuid;
                NLETrack next;
                NLEFilter nLEFilter;
                String uuid2;
                VecNLEFilterSPtr filters;
                NLEFilter next2;
                Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
                while (true) {
                    uuid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getUUID(), this.LIZIZ.LIZIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null && (filters = nLETrack.getFilters()) != null) {
                    Iterator<NLEFilter> it3 = filters.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getUUID(), this.LIZIZ.LIZJ)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    nLEFilter = next2;
                } else {
                    nLEFilter = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("1.find theTrack");
                if (nLETrack != null) {
                    uuid2 = nLETrack.getUUID();
                } else {
                    uuid2 = null;
                }
                sbLIZ.append(uuid2);
                sbLIZ.append(" theFilter ");
                if (nLEFilter != null) {
                    uuid = nLEFilter.getUUID();
                }
                sbLIZ.append(uuid);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                if (nLEFilter != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" 1.remove theFilter ");
                    sbLIZ2.append(nLEFilter.getUUID());
                    LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    nLETrack.removeFilter(nLEFilter);
                }
            }
        });
        String str = c347470Djl.LIZJ;
        if (str != null) {
            this.LJII.remove(str);
        }
    }

    @Override // X.InterfaceC347190DjJ
    public final void LJIIJJI(NLEModel nLEModel) {
        String strLIZ;
        NLETrack next;
        C347060Dj6 c347060Dj6;
        String resourceFile;
        String resourceFile2;
        String resourceFile3;
        String strLIZ2;
        ((LinkedHashMap) this.LJI).clear();
        this.LIZJ = null;
        this.LIZLLL = null;
        AbstractC348050Dkh<LinkedList<C347650Dk3>> abstractC348050Dkh = new AbstractC348050Dkh<LinkedList<C347650Dk3>>() { // from class: X.0Dk5
            public static C347660Dk4 LIZJ(NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot) {
                Object c098200Yq;
                String str;
                boolean z;
                C347660Dk4 c347660Dk4 = new C347660Dk4();
                c347660Dk4.LJIJI = C348350DlB.LIZJ(nLETrackSlot);
                EnumC356060Dxc enumC356060Dxc = null;
                if (!nLETrackSlot.hasExtra("d_bgmName")) {
                    str = null;
                } else {
                    try {
                        c098200Yq = nLETrackSlot.getExtra("d_bgmName");
                        if (c098200Yq == null) {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    str = (String) c098200Yq;
                }
                c347660Dk4.LJIJJ = str;
                if (nLESegmentAudio.getRepeatCount() == NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()) {
                    z = true;
                } else {
                    z = false;
                }
                c347660Dk4.LJIJJLI = z;
                NLEResType resourceType = nLESegmentAudio.getAVFile().getResourceType();
                if (resourceType != null) {
                    int i = C347680Dk6.LIZ[resourceType.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                enumC356060Dxc = EnumC356060Dxc.MV_MUSIC;
                            }
                        } else {
                            enumC356060Dxc = EnumC356060Dxc.MV_ALGORITHM;
                        }
                    } else {
                        enumC356060Dxc = EnumC356060Dxc.MV_NORMAL;
                    }
                }
                c347660Dk4.LJJIFFI = enumC356060Dxc;
                LIZIZ(c347660Dk4, nLESegmentAudio, nLETrackSlot);
                return c347660Dk4;
            }

            public static void LIZIZ(C347650Dk3 c347650Dk3, NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot) {
                String resourceFile4;
                c347650Dk3.LIZJ = nLETrackSlot.getUUID();
                long timeClipStart = nLESegmentAudio.getTimeClipStart();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                c347650Dk3.LIZLLL = timeClipStart / j;
                c347650Dk3.LJ = nLESegmentAudio.getTimeClipEnd() / j;
                c347650Dk3.LJIIIZ = nLESegmentAudio.getVolume();
                NLEResourceAV aVFile = nLESegmentAudio.getAVFile();
                if (aVFile != null) {
                    resourceFile4 = aVFile.getResourceFile();
                } else {
                    resourceFile4 = null;
                }
                c347650Dk3.LIZIZ = resourceFile4;
                c347650Dk3.LJFF = nLETrackSlot.getStartTime() / j;
                c347650Dk3.LJIIJJI = nLESegmentAudio.getSpeed();
                c347650Dk3.LJIIL = nLESegmentAudio.getKeepTone();
                c347650Dk3.LJII = nLESegmentAudio.getDuration();
                long endTime = -2;
                if (nLETrackSlot.getEndTime() != -2) {
                    endTime = nLETrackSlot.getEndTime() / j;
                }
                c347650Dk3.LJI = endTime;
                c347650Dk3.LJIILL = (float) nLESegmentAudio.getBalancedGain();
                if (nLESegmentAudio.getCurveSpeedPoints() != null && nLESegmentAudio.getCurveSpeedPoints().size() > 0) {
                    c347650Dk3.LJIILLIIL = new ArrayList();
                    int size = nLESegmentAudio.getCurveSpeedPoints().size();
                    for (int i = 0; i < size; i++) {
                        c347650Dk3.LJIILLIIL.add(nLESegmentAudio.getCurveSpeedPoints().get(i));
                    }
                }
            }
        };
        LinkedList<C347650Dk3> linkedList = new LinkedList();
        boolean z = true;
        if (C294040Bfm.LIZ()) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (!TextUtils.isEmpty(C348350DlB.LIZ(nLETrack2)) || u.LJIJI(nLETrack2.getExtra("biz_extra_type"), "bgm", true)) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack3 : arrayList) {
                if (!Intrinsics.LJFF(C348350DlB.LIZ(nLETrack3), "BGM") && !u.LJIJI(nLETrack3.getExtra("biz_extra_type"), "bgm", z) && !Intrinsics.LJFF(C348350DlB.LIZ(nLETrack3), "EDITOR_MUSIC")) {
                    for (NLETrackSlot nLETrackSlot : nLETrack3.getSlots()) {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null && (strLIZ2 = C348350DlB.LIZ(nLETrack3)) != null) {
                            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.valueOf(strLIZ2));
                            C347670Dk5.LIZIZ(c347650Dk3, nLESegmentAudioDynamicCast, nLETrackSlot);
                            linkedList.add(c347650Dk3);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchFromNLE: audioParams ");
                            sbLIZ.append(c347650Dk3);
                            abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        z = true;
                    }
                } else {
                    for (NLETrackSlot nLETrackSlot2 : nLETrack3.getSlots()) {
                        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudioDynamicCast2 != null) {
                            C347660Dk4 c347660Dk4LIZJ = C347670Dk5.LIZJ(nLESegmentAudioDynamicCast2, nLETrackSlot2);
                            linkedList.add(c347660Dk4LIZJ);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetchFromNLE: bgm ");
                            sbLIZ2.append(c347660Dk4LIZJ);
                            abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    z = true;
                }
            }
        } else {
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack4 : tracks2) {
                if (!TextUtils.isEmpty(C348350DlB.LIZ(nLETrack4))) {
                    arrayList2.add(nLETrack4);
                }
            }
            for (NLETrack nLETrack5 : arrayList2) {
                String strLIZ3 = C348350DlB.LIZ(nLETrack5);
                if (!Intrinsics.LJFF(strLIZ3, "BGM") && !Intrinsics.LJFF(strLIZ3, "EDITOR_MUSIC")) {
                    for (NLETrackSlot nLETrackSlot3 : nLETrack5.getSlots()) {
                        NLESegmentAudio nLESegmentAudioDynamicCast3 = NLESegmentAudio.dynamicCast(nLETrackSlot3.getMainSegment());
                        if (nLESegmentAudioDynamicCast3 != null && (strLIZ = C348350DlB.LIZ(nLETrack5)) != null) {
                            C347650Dk3 c347650Dk32 = new C347650Dk3(EnumC355960DxS.valueOf(strLIZ));
                            C347670Dk5.LIZIZ(c347650Dk32, nLESegmentAudioDynamicCast3, nLETrackSlot3);
                            linkedList.add(c347650Dk32);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("fetchFromNLE: audioParams ");
                            sbLIZ3.append(c347650Dk32);
                            abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                } else {
                    for (NLETrackSlot nLETrackSlot4 : nLETrack5.getSlots()) {
                        NLESegmentAudio nLESegmentAudioDynamicCast4 = NLESegmentAudio.dynamicCast(nLETrackSlot4.getMainSegment());
                        if (nLESegmentAudioDynamicCast4 != null) {
                            C347660Dk4 c347660Dk4LIZJ2 = C347670Dk5.LIZJ(nLESegmentAudioDynamicCast4, nLETrackSlot4);
                            linkedList.add(c347660Dk4LIZJ2);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("fetchFromNLE: bgm ");
                            sbLIZ4.append(c347660Dk4LIZJ2);
                            abstractC348050Dkh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (C347650Dk3 c347650Dk33 : linkedList) {
            if ((c347650Dk33 instanceof C347660Dk4) && c347650Dk33 != null) {
                arrayList3.add(c347650Dk33);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        this.LIZLLL = arrayList4;
        C347660Dk4 c347660Dk4 = (C347660Dk4) C13LP.LJJJLL(arrayList4);
        this.LIZJ = c347660Dk4;
        List<C347660Dk4> list = this.LIZLLL;
        if (list != null && c347660Dk4 != null) {
            c347660Dk4.LJJI = list.size() - 1;
        }
        for (C347650Dk3 c347650Dk34 : linkedList) {
            if (!(c347650Dk34 instanceof C347660Dk4)) {
                this.LJI.put(c347650Dk34.LIZJ, c347650Dk34);
            }
        }
        AbstractC348050Dkh<LinkedList<C347470Djl>> abstractC348050Dkh2 = new AbstractC348050Dkh<LinkedList<C347470Djl>>() { // from class: X.0DkG
        };
        LinkedList<C347470Djl> linkedList2 = new LinkedList();
        for (NLETrack nLETrack6 : nLEModel.getTracks()) {
            for (NLEFilter nLEFilter : nLETrack6.getFilters()) {
                if (nLEFilter != null) {
                    NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilterDynamicCast = NLESegmentAudioLoudnessBalanceFilter.dynamicCast((NLENode) nLEFilter.getSegment());
                    if (nLESegmentAudioLoudnessBalanceFilterDynamicCast != null && Intrinsics.LJFF(nLESegmentAudioLoudnessBalanceFilterDynamicCast.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
                        abstractC348050Dkh2.LIZ(" 2.found filter AUDIO_LOUDNESS_BALANCE_FILTER ");
                        C347470Djl c347470Djl = new C347470Djl(nLESegmentAudioLoudnessBalanceFilterDynamicCast.getFilterName());
                        c347470Djl.LIZJ = nLEFilter.getUUID();
                        c347470Djl.LIZIZ = nLETrack6.getUUID();
                        c347470Djl.LJIIIZ = Double.valueOf(nLESegmentAudioLoudnessBalanceFilterDynamicCast.getAvgLoudness());
                        c347470Djl.LJIIJ = Double.valueOf(nLESegmentAudioLoudnessBalanceFilterDynamicCast.getPeakLoudness());
                        c347470Djl.LJIIJJI = Double.valueOf(nLESegmentAudioLoudnessBalanceFilterDynamicCast.getTargetLoudness());
                        linkedList2.add(c347470Djl);
                    }
                    NLESegmentAudioSamiFilter nLESegmentAudioSamiFilterDynamicCast = NLESegmentAudioSamiFilter.dynamicCast((NLENode) nLEFilter.getSegment());
                    if (nLESegmentAudioSamiFilterDynamicCast != null && Intrinsics.LJFF(nLESegmentAudioSamiFilterDynamicCast.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
                        abstractC348050Dkh2.LIZ(" 2.found filter AUDIO_SAMI_FILTER ");
                        C347470Djl c347470Djl2 = new C347470Djl(nLESegmentAudioSamiFilterDynamicCast.getFilterName());
                        c347470Djl2.LIZJ = nLEFilter.getUUID();
                        c347470Djl2.LIZIZ = nLETrack6.getUUID();
                        c347470Djl2.LJIILL = nLESegmentAudioSamiFilterDynamicCast.getSamiParam();
                        c347470Djl2.LJIILIIL = Integer.valueOf(nLESegmentAudioSamiFilterDynamicCast.getSamiType());
                        NLEResourceNode effectSDKFilter = nLESegmentAudioSamiFilterDynamicCast.getEffectSDKFilter();
                        if (effectSDKFilter != null) {
                            resourceFile3 = effectSDKFilter.getResourceFile();
                        } else {
                            resourceFile3 = null;
                        }
                        c347470Djl2.LJIILJJIL = resourceFile3;
                        linkedList2.add(c347470Djl2);
                    }
                    NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLEFilter.getSegment());
                    if (nLESegmentFilterDynamicCast != null) {
                        if (Intrinsics.LJFF(nLESegmentFilterDynamicCast.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
                            abstractC348050Dkh2.LIZ(" 2.found filter AUDIO_DSP_FILTER ");
                            C347470Djl c347470Djl3 = new C347470Djl(nLESegmentFilterDynamicCast.getFilterName());
                            c347470Djl3.LIZJ = nLEFilter.getUUID();
                            c347470Djl3.LIZIZ = nLETrack6.getUUID();
                            NLEResourceNode effectSDKFilter2 = nLESegmentFilterDynamicCast.getEffectSDKFilter();
                            if (effectSDKFilter2 != null) {
                                resourceFile2 = effectSDKFilter2.getResourceFile();
                            } else {
                                resourceFile2 = null;
                            }
                            c347470Djl3.LJIIL = resourceFile2;
                            linkedList2.add(c347470Djl3);
                        }
                        if (Intrinsics.LJFF(nLESegmentFilterDynamicCast.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER())) {
                            abstractC348050Dkh2.LIZ(" 2.found filter AUDIO_DSP_FILTER ");
                            C347470Djl c347470Djl4 = new C347470Djl(nLESegmentFilterDynamicCast.getFilterName());
                            c347470Djl4.LIZJ = nLEFilter.getUUID();
                            c347470Djl4.LIZIZ = nLETrack6.getUUID();
                            NLEResourceNode effectSDKFilter3 = nLESegmentFilterDynamicCast.getEffectSDKFilter();
                            if (effectSDKFilter3 != null) {
                                resourceFile = effectSDKFilter3.getResourceFile();
                            } else {
                                resourceFile = null;
                            }
                            c347470Djl4.LIZLLL = resourceFile;
                            linkedList2.add(c347470Djl4);
                        }
                    }
                    NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilterDynamicCast = NLESegmentAudioVolumeFilter.dynamicCast((NLENode) nLEFilter.getSegment());
                    if (nLESegmentAudioVolumeFilterDynamicCast != null && Intrinsics.LJFF(nLESegmentAudioVolumeFilterDynamicCast.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
                        abstractC348050Dkh2.LIZ(" 2.found filter AUDIO_VOLUME_FILTER ");
                        C347470Djl c347470Djl5 = new C347470Djl(nLESegmentAudioVolumeFilterDynamicCast.getFilterName());
                        c347470Djl5.LIZJ = nLEFilter.getUUID();
                        c347470Djl5.LIZIZ = nLETrack6.getUUID();
                        c347470Djl5.LJIIIIZZ = Float.valueOf(nLESegmentAudioVolumeFilterDynamicCast.getVolume());
                        linkedList2.add(c347470Djl5);
                    }
                }
            }
        }
        for (C347470Djl c347470Djl6 : linkedList2) {
            this.LJII.put(c347470Djl6.LIZJ, c347470Djl6);
        }
        AbstractC348050Dkh<C347060Dj6> abstractC348050Dkh3 = new AbstractC348050Dkh<C347060Dj6>() { // from class: X.0DkH
        };
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (NLETrackMV.dynamicCast((NLENode) next) != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack7 = next;
        if (nLETrack7 != null) {
            nLETrack7.getSortedSlots();
        }
        HashMap map = new HashMap();
        VecNLETrackSPtr tracks3 = nLEModel.getTracks();
        ArrayList arrayList5 = new ArrayList();
        for (NLETrack nLETrack8 : tracks3) {
            NLETrack nLETrack9 = nLETrack8;
            if (nLETrack9.getMainTrack() || Intrinsics.LJFF(C348350DlB.LIZ(nLETrack9), "ORIGIN") || Intrinsics.LJFF(C348350DlB.LIZ(nLETrack9), "KTV_VOICE") || Intrinsics.LJFF(C348350DlB.LIZLLL(nLETrack9), "cutsame")) {
                arrayList5.add(nLETrack8);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList6);
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            NLESegmentAudio nLESegmentAudioDynamicCast5 = NLESegmentAudio.dynamicCast(((NLETrackSlot) it4.next()).getMainSegment());
            if (nLESegmentAudioDynamicCast5 != null) {
                float volume = nLESegmentAudioDynamicCast5.getVolume();
                if (!map.containsKey(Float.valueOf(volume))) {
                    map.put(Float.valueOf(volume), 1);
                } else {
                    map.put(Float.valueOf(volume), Integer.valueOf(((Number) map.get(Float.valueOf(volume))).intValue() + 1));
                }
            }
        }
        if (map.keySet().size() == 0) {
            abstractC348050Dkh3.LIZ("1.original volume nothing ");
            c347060Dj6 = null;
        } else if (map.keySet().size() == 1) {
            abstractC348050Dkh3.LIZ("1.find original volume " + ((Number) C13LP.LJJJJZ(map.keySet())).floatValue() + ' ');
            c347060Dj6 = new C347060Dj6(((Number) C13LP.LJJJJZ(map.keySet())).floatValue());
        } else {
            StringBuilder sb = new StringBuilder();
            for (Float f : map.keySet()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("/ ");
                sbLIZ5.append(f.floatValue());
                sbLIZ5.append(' ');
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            }
            abstractC348050Dkh3.LIZ("1.find multi original volume " + ((Object) sb));
            c347060Dj6 = new C347060Dj6(((Number) C13LP.LJJJJZ(map.keySet())).floatValue());
        }
        this.LJ = c347060Dj6;
    }

    @Override // X.InterfaceC391070FUz
    public final C07X6 LJIILIIL(final C07X6 c07x6) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c07x6) { // from class: X.0Dj7
            public final C07X6 LIZIZ;

            {
                this.LIZIZ = c07x6;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c07x6);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                NLEModel model = nLEEditor.getModel();
                if (model == null) {
                    return;
                }
                VecNLETrackSPtr tracks = model.getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack), "DUB")) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                }
                ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (NLESegmentAudio.dynamicCast(((NLETrackSlot) obj).getMainSegment()) != null) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    for (NLETrackSlot nLETrackSlot : arrayList3) {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            nLESegmentAudioDynamicCast.setVolume(LJII(nLETrackSlot, this.LIZIZ.LIZ));
                        }
                    }
                }
                VecNLETrackSPtr tracks2 = model.getTracks();
                ArrayList arrayList4 = new ArrayList();
                for (NLETrack nLETrack2 : tracks2) {
                    if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack2), "AUDIO_RECORD")) {
                        arrayList4.add(nLETrack2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList5);
                }
                ArrayList<NLETrackSlot> arrayList6 = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (NLESegmentAudio.dynamicCast(((NLETrackSlot) obj2).getMainSegment()) != null) {
                        arrayList6.add(obj2);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    for (NLETrackSlot nLETrackSlot2 : arrayList6) {
                        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudioDynamicCast2 != null) {
                            nLESegmentAudioDynamicCast2.setVolume(LJII(nLETrackSlot2, this.LIZIZ.LIZ));
                        }
                    }
                }
            }

            public static float LJII(NLETrackSlot nLETrackSlot, float f) {
                Float fLJIIIIZZ;
                float fFloatValue;
                float fFloatValue2 = 1.0f;
                if (nLETrackSlot.hasExtra("multi_record_voice_rate")) {
                    Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("multi_record_voice_rate"));
                    if (fLJIIIIZZ2 != null) {
                        fFloatValue = fLJIIIIZZ2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    f *= fFloatValue;
                }
                nLETrackSlot.setExtra("volume_before_enhance", String.valueOf(f));
                if (nLETrackSlot.hasExtra("volume_enhance_rate") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_enhance_rate"))) != null) {
                    fFloatValue2 = fLJIIIIZZ.floatValue();
                }
                return f * fFloatValue2;
            }
        });
        this.LJFF = c07x6;
        return c07x6;
    }

    @Override // X.InterfaceC391070FUz
    public final void LJIJI(C347650Dk3 c347650Dk3) {
        this.LIZIZ.invoke(new C347620Dk0(c347650Dk3));
    }

    @Override // X.InterfaceC391070FUz
    public final C347470Djl LJIJJ(String str) {
        return this.LJII.get(str);
    }

    @Override // X.InterfaceC391070FUz
    public final C347060Dj6 LJIL(final C347060Dj6 c347060Dj6) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347060Dj6) { // from class: X.0Dj4
            public final C347060Dj6 LIZIZ;

            {
                this.LIZIZ = c347060Dj6;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c347060Dj6);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Removed duplicated region for block: B:183:0x046d  */
            /* JADX WARN: Removed duplicated region for block: B:325:0x0467 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:326:0x04a9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:334:0x0416 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:336:0x0416 A[SYNTHETIC] */
            @Override // X.AbstractC348060Dki
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r18) {
                /*
                    Method dump skipped, instruction units count: 1570
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C347040Dj4.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
            }

            public static final float LJIIIIZZ(NLETrackSlot nLETrackSlot, float f) {
                float fFloatValue;
                if (nLETrackSlot.hasExtra("multi_original_voice_rate")) {
                    Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("multi_original_voice_rate"));
                    if (fLJIIIIZZ != null) {
                        fFloatValue = fLJIIIIZZ.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    return f * fFloatValue;
                }
                return f;
            }

            public final void LJII(NLESegmentAudio nLESegmentAudio, float f) {
                Double d = this.LIZIZ.LIZIZ;
                if (d != null) {
                    double dDoubleValue = d.doubleValue();
                    if (dDoubleValue > 0.0d && f <= 1.0f) {
                        nLESegmentAudio.setDbRange(dDoubleValue);
                    }
                }
            }
        });
        this.LJ = c347060Dj6;
        return c347060Dj6;
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJI(final C347060Dj6 c347060Dj6) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347060Dj6) { // from class: X.0Dj5
            public final C347060Dj6 LIZIZ;

            {
                this.LIZIZ = c347060Dj6;
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                NLETrack mainTrack;
                VecNLETrackSlotSPtr slots;
                float fFloatValue;
                NLEModel model = nLEEditor.getModel();
                if (model != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            float f = this.LIZIZ.LIZ;
                            if (nLETrackSlot.hasExtra("multi_original_voice_rate")) {
                                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("multi_original_voice_rate"));
                                if (fLJIIIIZZ != null) {
                                    fFloatValue = fLJIIIIZZ.floatValue();
                                } else {
                                    fFloatValue = 1.0f;
                                }
                                f *= fFloatValue;
                            }
                            Double d = this.LIZIZ.LIZIZ;
                            if (d != null) {
                                double dDoubleValue = d.doubleValue();
                                if (dDoubleValue > 0.0d && f <= 1.0f) {
                                    nLESegmentAudioDynamicCast.setDbRange(dDoubleValue);
                                }
                            }
                            if (!nLESegmentAudioDynamicCast.getAVFile().getHasAudio()) {
                                f = 0.0f;
                            }
                            nLESegmentAudioDynamicCast.setVolume(f);
                        }
                        NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()).setEnableAudio(this.LIZIZ.LIZJ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MainTrackOperation, updateslot  ");
                        sbLIZ.append(nLETrackSlot.getUUID());
                        sbLIZ.append(" slot");
                        LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC391070FUz
    public final C347660Dk4 LJJIIJ(List<C347660Dk4> list) {
        String str;
        C347660Dk4 c347660Dk4;
        C347650Dk3 c347650Dk3;
        Function1<String, Boolean> function1LJIIJJI = C2281551ESb.LIZIZ.LJIIJJI();
        if (list != null && (c347650Dk3 = (C347650Dk3) C13LP.LJJJLL(list)) != null) {
            str = c347650Dk3.LIZIZ;
        } else {
            str = null;
        }
        if (function1LJIIJJI.invoke(str).booleanValue() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C351840Dqo(this, list, null), 3);
            if (list == null || (c347660Dk4 = (C347660Dk4) C13LP.LJJJLL(list)) == null) {
                return null;
            }
            c347660Dk4.LJJI = list.size() - 1;
            return c347660Dk4;
        }
        return LJJL(this, list);
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJIIZI(final C347470Djl c347470Djl) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347470Djl) { // from class: X.0Djj
            public final C347470Djl LIZIZ;

            {
                this.LIZIZ = c347470Djl;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c347470Djl);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                String uuid;
                NLETrack next;
                NLEFilter nLEFilter;
                long jLongValue;
                String strLIZ;
                float fFloatValue;
                int iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get;
                VecNLEFilterSPtr filters;
                NLEFilter next2;
                Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
                while (true) {
                    uuid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getUUID(), this.LIZIZ.LIZIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null && (filters = nLETrack.getFilters()) != null) {
                    Iterator<NLEFilter> it3 = filters.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getUUID(), this.LIZIZ.LIZJ)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    nLEFilter = next2;
                } else {
                    nLEFilter = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 1.find theFilter ");
                if (nLEFilter != null) {
                    uuid = nLEFilter.getUUID();
                }
                sbLIZ.append(uuid);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                if (nLEFilter == null) {
                    LJFF(" 1.find theFilter null ");
                    return;
                }
                String str = this.LIZIZ.LIZ;
                if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
                    NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter = new NLESegmentAudioLoudnessBalanceFilter();
                    nLESegmentAudioLoudnessBalanceFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
                    nLESegmentAudioLoudnessBalanceFilter.setAvgLoudness(this.LIZIZ.LJIIIZ.doubleValue());
                    nLESegmentAudioLoudnessBalanceFilter.setPeakLoudness(this.LIZIZ.LJIIJ.doubleValue());
                    nLESegmentAudioLoudnessBalanceFilter.setTargetLoudness(this.LIZIZ.LJIIJJI.doubleValue());
                    nLEFilter.setSegment(nLESegmentAudioLoudnessBalanceFilter);
                    return;
                }
                if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
                    NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
                    nLESegmentAudioSamiFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
                    nLESegmentAudioSamiFilter.setSamiParam(this.LIZIZ.LJIILL);
                    Integer num = this.LIZIZ.LJIILIIL;
                    if (num != null) {
                        iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get = num.intValue();
                    } else {
                        iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get = NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get();
                    }
                    nLESegmentAudioSamiFilter.setSamiType(iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get);
                    NLEResourceNode nLEResourceNode = new NLEResourceNode();
                    nLEResourceNode.setResourceType(NLEResType.FILTER);
                    nLEResourceNode.setResourceFile(this.LIZIZ.LJIILJJIL);
                    nLESegmentAudioSamiFilter.setEffectSDKFilter(nLEResourceNode);
                    nLEFilter.setSegment(nLESegmentAudioSamiFilter);
                    return;
                }
                if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
                    NLESegmentFilter nLESegmentFilter = new NLESegmentFilter();
                    nLESegmentFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER());
                    NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                    nLEResourceNode2.setResourceType(NLEResType.FILTER);
                    nLEResourceNode2.setResourceFile(this.LIZIZ.LJIIL);
                    nLESegmentFilter.setEffectSDKFilter(nLEResourceNode2);
                    nLEFilter.setSegment(nLESegmentFilter);
                    return;
                }
                if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
                    NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilterDynamicCast = NLESegmentAudioVolumeFilter.dynamicCast((NLENode) nLEFilter.getSegment());
                    if (nLESegmentAudioVolumeFilterDynamicCast == null) {
                        nLESegmentAudioVolumeFilterDynamicCast = new NLESegmentAudioVolumeFilter();
                    }
                    nLESegmentAudioVolumeFilterDynamicCast.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
                    NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
                    nLEResourceNode3.setResourceType(NLEResType.FILTER);
                    nLESegmentAudioVolumeFilterDynamicCast.setEffectSDKFilter(nLEResourceNode3);
                    Float f = this.LIZIZ.LJIIIIZZ;
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    nLESegmentAudioVolumeFilterDynamicCast.setVolume(fFloatValue);
                    nLEFilter.setSegment(nLESegmentAudioVolumeFilterDynamicCast);
                    return;
                }
                Long l = this.LIZIZ.LJ;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                nLEFilter.setStartTime(jLongValue * 1000);
                Long l2 = this.LIZIZ.LJFF;
                long jLongValue2 = -2;
                if (l2 != null && l2.longValue() != -2) {
                    jLongValue2 = this.LIZIZ.LJFF.longValue() * 1000;
                }
                nLEFilter.setEndTime(jLongValue2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" 1.update filter  startTime:");
                sbLIZ2.append(jLongValue);
                sbLIZ2.append(" endTime:");
                sbLIZ2.append(jLongValue2);
                sbLIZ2.append(' ');
                LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                if (nLEFilter.getSegment() == null) {
                    nLEFilter.setSegment(new NLESegmentFilter());
                }
                NLESegmentFilter segment = nLEFilter.getSegment();
                if (segment.getEffectSDKFilter() == null) {
                    segment.setEffectSDKFilter(new NLEResourceNode());
                }
                NLEResourceNode effectSDKFilter = segment.getEffectSDKFilter();
                effectSDKFilter.setResourceType(NLEResType.FILTER);
                effectSDKFilter.setResourceFile(this.LIZIZ.LIZLLL);
                if (C1452960nug.LJIIIZ) {
                    try {
                        C347470Djl c347470Djl2 = this.LIZIZ;
                        strLIZ = C0FGD.LIZ(c347470Djl2.LJI, c347470Djl2.LJII);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C2219091BtD.LIZLLL().LIZIZ(th);
                        strLIZ = "";
                    }
                    effectSDKFilter.setExtra("biz_res_id", strLIZ);
                }
                segment.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
            }
        });
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJIJIIJIL(final C347820DkK c347820DkK) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347820DkK) { // from class: X.0DkJ
            public final C347820DkK LIZIZ;

            {
                this.LIZIZ = c347820DkK;
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                NLETrack next;
                VecNLETrackSlotSPtr slots;
                NLETrackSlot nLETrackSlot;
                NLEModel model = nLEEditor.getModel();
                if (model == null) {
                    return;
                }
                Iterator<NLETrack> it2 = model.getTracks().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(C348350DlB.LIZ(next), "ORIGIN")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null) {
                    nLETrack.clearSlot();
                }
                C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.ORIGIN);
                String str = this.LIZIZ.LIZ;
                c347650Dk3.LIZIZ = str;
                if (VEUtils.getAudioFileInfo(str) != null) {
                    c347650Dk3.LIZLLL = 0L;
                    c347650Dk3.LJ = r0.duration;
                }
                if (VEUtils.getAudioFileInfo(this.LIZIZ.LIZ) != null) {
                    c347650Dk3.LIZLLL = 0L;
                    c347650Dk3.LJ = r0.duration;
                }
                new C347720DkA(c347650Dk3, false).LIZJ(nLEEditor);
                NLETrack mainTrack = model.getMainTrack();
                if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
                    nLETrackSlot.setExtra("has_origin_audio_slot", "true");
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                        if (aVFile != null) {
                            aVFile.setHasAudio(true);
                        }
                        nLESegmentVideoDynamicCast.setVolume(1.0f);
                        nLESegmentVideoDynamicCast.setEnableAudio(false);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJIJIL(final EnumC355960DxS enumC355960DxS) {
        this.LIZIZ.invoke(new AbstractC348060Dki(enumC355960DxS) { // from class: X.0DkB
            public final EnumC355960DxS LIZIZ;
            public NLEPlayerState LIZJ;

            {
                this.LIZIZ = enumC355960DxS;
            }

            @Override // X.AbstractC348060Dki
            public final void LIZ(INLEMediaSession iNLEMediaSession) {
                iNLEMediaSession.getPlayerApi().prepare();
                if (this.LIZJ == NLEPlayerState.STARTED) {
                    iNLEMediaSession.getPlayerApi().play();
                }
            }

            @Override // X.AbstractC348060Dki
            public final void LIZIZ(INLEMediaSession iNLEMediaSession) {
                NLEPlayerState nLEPlayerStateState = iNLEMediaSession.getPlayerApi().state();
                this.LIZJ = nLEPlayerStateState;
                if (nLEPlayerStateState == NLEPlayerState.STARTED) {
                    iNLEMediaSession.getPlayerApi().pause();
                }
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                NLETrack next;
                Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(C348350DlB.LIZ(next), this.LIZIZ.name())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null) {
                    nLEEditor.getModel().removeTrack(nLETrack);
                }
            }
        });
        Map<String, C347650Dk3> map = this.LJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C347650Dk3> entry : map.entrySet()) {
            if (entry.getValue().LIZ != enumC355960DxS) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LJI = new LinkedHashMap(linkedHashMap);
    }

    @Override // X.InterfaceC347190DjJ
    public final void LJJIJLIJ(NLEEditor nLEEditor) {
        LJIIJJI(nLEEditor.getModel());
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJJI(final C347650Dk3 c347650Dk3) {
        this.LIZIZ.invoke(new AbstractC348060Dki(c347650Dk3) { // from class: X.0DkC
            public final C347650Dk3 LIZIZ;
            public NLEPlayerState LIZJ;

            {
                this.LIZIZ = c347650Dk3;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" 0.init ");
                sbLIZ.append(c347650Dk3);
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.AbstractC348060Dki
            public final void LIZ(INLEMediaSession iNLEMediaSession) {
                iNLEMediaSession.getPlayerApi().prepare();
                if (this.LIZJ == NLEPlayerState.STARTED) {
                    iNLEMediaSession.getPlayerApi().play();
                }
            }

            @Override // X.AbstractC348060Dki
            public final void LIZIZ(INLEMediaSession iNLEMediaSession) {
                NLEPlayerState nLEPlayerStateState = iNLEMediaSession.getPlayerApi().state();
                this.LIZJ = nLEPlayerStateState;
                if (nLEPlayerStateState == NLEPlayerState.STARTED) {
                    iNLEMediaSession.getPlayerApi().pause();
                }
            }

            @Override // X.AbstractC348060Dki
            public final void LIZJ(NLEEditor nLEEditor) {
                Pair<NLETrack, NLETrackSlot> pairLIZIZ = C14LJ.LIZIZ(nLEEditor.getModel(), this.LIZIZ.LIZJ);
                if (pairLIZIZ != null) {
                    pairLIZIZ.getFirst().removeSlot(pairLIZIZ.getSecond());
                    if (pairLIZIZ.getFirst().getSlots().isEmpty()) {
                        nLEEditor.getModel().removeTrack(pairLIZIZ.getFirst());
                    }
                }
            }
        });
        this.LJI.remove(c347650Dk3.LIZJ);
    }

    @Override // X.InterfaceC391070FUz
    public final C347650Dk3 LJJJJIZL(EnumC355960DxS enumC355960DxS) {
        Object next;
        Iterator<T> it2 = this.LJI.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C347650Dk3) next).LIZ.name(), enumC355960DxS.name())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C347650Dk3) next;
    }

    @Override // X.InterfaceC391070FUz
    public final C347660Dk4 LJJJJLL(C347660Dk4 c347660Dk4) {
        String str;
        Function1<String, Boolean> function1LJIIJJI = C2281551ESb.LIZIZ.LJIIJJI();
        if (c347660Dk4 != null) {
            str = c347660Dk4.LIZIZ;
        } else {
            str = null;
        }
        if (function1LJIIJJI.invoke(str).booleanValue() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C351810Dql(this, c347660Dk4, null), 3);
            return c347660Dk4;
        }
        return LJJJZ(this, c347660Dk4);
    }

    @Override // X.InterfaceC391070FUz
    public final C347650Dk3 get(String str) {
        return this.LJI.get(str);
    }

    public C347770DkF(INLEMediaSession iNLEMediaSession, AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = iNLEMediaSession;
        this.LIZIZ = awS584S0100000_5;
    }

    public static final C347660Dk4 LJJJZ(C347770DkF c347770DkF, C347660Dk4 c347660Dk4) {
        boolean z;
        List<C347660Dk4> list;
        C347660Dk4 c347660Dk42 = c347770DkF.LIZJ;
        if (c347660Dk42 != null && c347660Dk4 != null && Intrinsics.LJFF(c347660Dk42.LIZIZ, c347660Dk4.LIZIZ) && Intrinsics.LJFF(c347660Dk42.LJIJI, c347660Dk4.LJIJI) && c347660Dk42.LJJI == c347660Dk4.LJJI && c347660Dk42.LJIL == c347660Dk4.LJIL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c347660Dk4 != null) {
                c347770DkF.LIZIZ.invoke(new C347700Dk8(c347660Dk4, null));
            }
        } else {
            c347770DkF.LIZIZ.invoke(new C347750DkD(c347660Dk4));
        }
        c347770DkF.LIZJ = c347660Dk4;
        if (c347660Dk4 == null) {
            c347770DkF.LIZLLL = null;
        } else if (c347660Dk42 != null && c347660Dk42.LJJI == c347660Dk4.LJJI && (list = c347770DkF.LIZLLL) != null && list.size() > 1) {
            List<C347660Dk4> list2 = c347770DkF.LIZLLL;
            if (list2 != null) {
                ListProtector.set(list2, 0, c347660Dk4);
            }
        } else {
            c347770DkF.LIZLLL = C1697810uHb.LJIILJJIL(c347660Dk4);
        }
        return c347770DkF.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C347660Dk4 LJJL(X.C347770DkF r9, java.util.List<X.C347660Dk4> r10) {
        /*
            java.util.List<X.0Dk4> r2 = r9.LIZLLL
            r8 = 0
            r7 = 1
            if (r2 == 0) goto L5b
            if (r10 == 0) goto L5b
            int r1 = r2.size()
            int r0 = r10.size()
            if (r1 != r0) goto L5b
            java.util.List r1 = X.C13LP.LLIILII(r2, r10)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L59
            java.util.Iterator r3 = r1.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r0 = r2.getFirst()
            X.0Dk4 r0 = (X.C347660Dk4) r0
            java.lang.String r1 = r0.LJIJI
            java.lang.Object r0 = r2.getSecond()
            X.0Dk4 r0 = (X.C347660Dk4) r0
            java.lang.String r0 = r0.LJIJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r2.getFirst()
            X.0Dk3 r0 = (X.C347650Dk3) r0
            java.lang.String r1 = r0.LIZIZ
            java.lang.Object r0 = r2.getSecond()
            X.0Dk3 r0 = (X.C347650Dk3) r0
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5b
            goto L20
        L59:
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            r6 = 0
            if (r0 == 0) goto L89
            if (r10 == 0) goto Lb2
            java.util.Iterator r5 = r10.iterator()
        L65:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r4 = r5.next()
            int r3 = r8 + 1
            if (r8 < 0) goto L85
            X.0Dk4 r4 = (X.C347660Dk4) r4
            kotlin.jvm.functions.Function1<X.0Dki, kotlin.Unit> r2 = r9.LIZIZ
            X.0Dk8 r1 = new X.0Dk8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.<init>(r4, r0)
            r2.invoke(r1)
            r8 = r3
            goto L65
        L85:
            X.C1697810uHb.LJIJI()
            throw r6
        L89:
            kotlin.jvm.functions.Function1<X.0Dki, kotlin.Unit> r1 = r9.LIZIZ
            X.0DkD r0 = new X.0DkD
            r0.<init>(r10)
            r1.invoke(r0)
            if (r10 == 0) goto Lb2
        L95:
            java.lang.Object r1 = X.C13LP.LJJJLL(r10)
            X.0Dk4 r1 = (X.C347660Dk4) r1
            if (r1 == 0) goto Lb2
            int r0 = r10.size()
            int r0 = r0 - r7
            r1.LJJI = r0
        La4:
            r9.LIZJ = r1
            if (r10 == 0) goto Lad
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r10)
        Lad:
            r9.LIZLLL = r6
            X.0Dk4 r0 = r9.LIZJ
            return r0
        Lb2:
            r1 = r6
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347770DkF.LJJL(X.0DkF, java.util.List):X.0Dk4");
    }

    @Override // X.InterfaceC391070FUz
    public final String LJI(NLEModel nLEModel, EnumC355960DxS enumC355960DxS) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LIZ(next), enumC355960DxS.name())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null) {
            return null;
        }
        return nLETrack.getUUID();
    }

    @Override // X.InterfaceC391070FUz
    public final String LJIILL(String str, C347470Djl c347470Djl) {
        this.LIZIZ.invoke(new C347460Djk(str, c347470Djl));
        String str2 = c347470Djl.LIZJ;
        if (str2 != null && str2.length() != 0) {
            this.LJII.put(c347470Djl.LIZJ, c347470Djl);
            return c347470Djl.LIZJ;
        }
        return "";
    }

    @Override // X.InterfaceC391070FUz
    public final C347650Dk3 LJJIJ(C347650Dk3 c347650Dk3, boolean z) {
        this.LIZIZ.invoke(new C347720DkA(c347650Dk3, z));
        this.LJI.put(c347650Dk3.LIZJ, c347650Dk3);
        return c347650Dk3;
    }

    @Override // X.InterfaceC391070FUz
    public final void LJJIJL(String str, String str2) {
        List listLLIIII = C13LP.LLIIII(this.LJII.values());
        ArrayList<C347470Djl> arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (Intrinsics.LJFF(((C347470Djl) obj).LIZIZ, str)) {
                arrayList.add(obj);
            }
        }
        for (C347470Djl c347470Djl : arrayList) {
            String str3 = c347470Djl.LIZJ;
            LJIILL(str2, c347470Djl);
            C19719512Dh.LIZJ(this.LJII).remove(str3);
        }
    }
}
