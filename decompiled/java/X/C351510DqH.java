package X;

import Y.AComparatorS24S0000000_5;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Size;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaOnDoneWrapper;
import com.bytedance.ies.nle.editor_jni.NLEMediaOnProgressChangedWrapper;
import com.bytedance.ies.nle.editor_jni.NLEMediaReverseUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351510DqH {
    public static final C351510DqH LIZ = new C351510DqH();

    public static NLETrack LIZ(NLEModel nLEModel) {
        int i;
        if (C351220Dpo.LJJIJLIJ(nLEModel).isEmpty()) {
            i = 0;
        } else {
            Iterator<NLETrack> it2 = C351220Dpo.LJJIJLIJ(nLEModel).iterator();
            if (it2.hasNext()) {
                int layer = it2.next().getLayer();
                while (it2.hasNext()) {
                    int layer2 = it2.next().getLayer();
                    if (layer < layer2) {
                        layer = layer2;
                    }
                }
                i = layer + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(false);
        nLETrack.setLayer(i);
        nLETrack.setExtra("track_type", "video_effect");
        nLETrack.setExtraTrackType(NLETrackType.EFFECT);
        nLETrack.setExtra("EffectTrackType", "NORMAL");
        C351220Dpo.LLLLJI(nLETrack);
        nLEModel.addTrack(nLETrack);
        return nLETrack;
    }

    public static boolean LJII(NLEModel nLEModel) {
        int i;
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
        if (listLJJLIIIJLJLI.isEmpty()) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJLJLI, 10));
            Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().getLayer()));
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                while (it3.hasNext()) {
                    int iIntValue2 = ((Number) it3.next()).intValue();
                    if (iIntValue < iIntValue2) {
                        iIntValue = iIntValue2;
                    }
                }
                i = iIntValue + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        if (i < ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
            return true;
        }
        return false;
    }

    public static void LJIIIIZZ(NLEModel nLEModel) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLLLILI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (slots == null || slots.isEmpty()) {
                nLETrack.setEnable(true);
                nLETrack.setExtra("EffectTrackType", "NORMAL");
            }
        }
    }

    public static void LJIJJ(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        if (C351220Dpo.LJZ(nLETrackSlot) && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
            nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipStart() + ((long) (nLETrackSlot.getDuration() * C351220Dpo.LIZ(nLESegmentAudioDynamicCast))));
        }
    }

    public static int LJIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList<NLENode> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        int iMax = 0;
        for (NLENode nLENode : arrayList2) {
            if (nLENode.hasExtra("ep_slot_add_order")) {
                iMax = Math.max(CastIntegerProtector.parseInt(nLENode.getExtra("ep_slot_add_order")), iMax);
            }
        }
        return iMax;
    }

    public static Pair LJJ(NLETrackSlot nLETrackSlot) {
        NLESegmentEffect segment;
        String jsonParam;
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if (videoEffects != null) {
            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                LIZ.getClass();
                if (LJJIJIL(nLEVideoEffect) && (segment = nLEVideoEffect.getSegment()) != null && (jsonParam = segment.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
                    String strOptString = new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url");
                    if (!TextUtils.isEmpty(strOptString)) {
                        return new Pair(nLEVideoEffect, strOptString);
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static String LJJI(NLETrackSlot nLETrackSlot) {
        String extra;
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("ep_curve_speed_name") || (extra = nLETrackSlot.getExtra("ep_curve_speed_name")) == null) {
            return "";
        }
        return extra;
    }

    public static String LJJIFFI(NLETrackSlot nLETrackSlot) {
        if (LJJIL(nLETrackSlot)) {
            return LJJIIJ(nLETrackSlot, Collections.singletonList(NLEResType.IMAGE));
        }
        Pair pairLJJ = LJJ(nLETrackSlot);
        if (pairLJJ != null) {
            return (String) pairLJJ.getSecond();
        }
        return null;
    }

    public static String LJJII(NLETrackSlot nLETrackSlot) {
        boolean z;
        String extra;
        String extra2;
        String extra3;
        if (LJJIJLIJ(nLETrackSlot.getRenderProxy())) {
            NLESegment mainSegment = nLETrackSlot.getRenderProxy().getMainSegment();
            if (mainSegment == null || (extra3 = mainSegment.getExtra("original_effect_name")) == null) {
                return "";
            }
            return extra3;
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if ((videoEffects instanceof Collection) && videoEffects.isEmpty()) {
            z = false;
        } else {
            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                LIZ.getClass();
                if (LJJIJIL(nLEVideoEffect)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        NLENode nLENode = null;
        if (z) {
            Iterator<NLEVideoEffect> it2 = nLETrackSlot.getVideoEffects().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLEVideoEffect next = it2.next();
                LIZ.getClass();
                if (LJJIJIL(next)) {
                    nLENode = next;
                    break;
                }
            }
            NLENode nLENode2 = nLENode;
            if (nLENode2 == null || (extra2 = nLENode2.getExtra("original_effect_name")) == null) {
                return "";
            }
            return extra2;
        }
        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
        if (!(filters instanceof Collection) || !filters.isEmpty()) {
            Iterator<NLEFilter> it3 = filters.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLEFilter next2 = it3.next();
                LIZ.getClass();
                if (LJJIJL(next2)) {
                    Iterator<NLEFilter> it4 = nLETrackSlot.getFilters().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        NLEFilter next3 = it4.next();
                        LIZ.getClass();
                        if (LJJIJL(next3)) {
                            nLENode = next3;
                            break;
                        }
                    }
                    NLENode nLENode3 = nLENode;
                    if (nLENode3 == null || (extra = nLENode3.getExtra("original_effect_name")) == null) {
                        break;
                    }
                    return extra;
                }
            }
        }
        return "";
    }

    public static NLEResourceAV LJJIIJZLJL(NLETrackSlot nLETrackSlot) {
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null) {
            return nLERenderProxySegmentDynamicCast.getAVFile();
        }
        return null;
    }

    public static long LJJIIZI(NLETrackSlot nLETrackSlot) {
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition != null && C347020Dj2.LIZ(endTransition)) {
            return nLETrackSlot.getDuration() - (endTransition.getTransitionDuration() / ((long) 2));
        }
        return nLETrackSlot.getDuration();
    }

    public static long LJJIJIIJI(NLETrackSlot nLETrackSlot) {
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition != null && C347020Dj2.LIZ(endTransition)) {
            return nLETrackSlot.getDuration() - endTransition.getTransitionDuration();
        }
        return nLETrackSlot.getDuration();
    }

    public static boolean LJJIJIIJIL(NLEVideoEffect nLEVideoEffect) {
        NLESegmentEffect segment;
        String jsonParam;
        if (!LJJIJIL(nLEVideoEffect) || (segment = nLEVideoEffect.getSegment()) == null || (jsonParam = segment.getJsonParam()) == null || TextUtils.isEmpty(jsonParam)) {
            return false;
        }
        return !TextUtils.isEmpty(new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url"));
    }

    public static boolean LJJIJIL(NLEVideoEffect nLEVideoEffect) {
        String extra;
        if (nLEVideoEffect.hasExtra("ep_magic_resource_id") && (extra = nLEVideoEffect.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra))) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJL(NLEFilter nLEFilter) {
        String extra;
        if (nLEFilter.hasExtra("ep_magic_resource_id") && (extra = nLEFilter.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra))) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJLIJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("is_from_ep_magic")) {
            return false;
        }
        return Boolean.parseBoolean(nLETrackSlot.getExtra("is_from_ep_magic"));
    }

    public static boolean LJJIL(NLETrackSlot nLETrackSlot) {
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLEResourceAV aVFile;
        String resourceFile;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null && (aVFile = nLERenderProxySegmentDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && (!a0.LJJJIL(resourceFile))) {
            return true;
        }
        return false;
    }

    public static void LJJJI(C0E48 c0e48) {
        NLENode stage;
        NLEModel nLEModelDynamicCast;
        if (c0e48 != null && (stage = C350870DpF.LJI(c0e48).getStage()) != null && (nLEModelDynamicCast = NLEModel.dynamicCast(stage.deepClone(true))) != null) {
            c0e48.LLFII().LJI().setModel(nLEModelDynamicCast);
        }
    }

    public static float LJJJIL(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PointF pointF = (PointF) it2.next();
            NLEPoint nLEPoint = new NLEPoint();
            nLEPoint.setX(pointF.x);
            nLEPoint.setY(pointF.y);
            arrayList.add(nLEPoint);
        }
        return (float) new NLECurveSpeedCalculator(NLECurveSpeedCalculator.segmentPToSequenceP(new VecNLEPointSPtr(arrayList))).getAveCurveSpeedRatio();
    }

    public static void LJJJJ(NLESegmentVideo nLESegmentVideo) {
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.setType(NLECanvasType.COLOR);
        nLEStyCanvas.setColor(ColorProtector.parseColor("#000000"));
        nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
    }

    public static void LIZIZ(long j, C0E48 c0e48) {
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        long maxEnd;
        long j2;
        long jMin;
        Iterator<NLETrack> it2 = C350870DpF.LJI(c0e48).getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLILLL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if ((slots != null && slots.size() > 1) || (sortedSlots = nLETrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots)) == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null || j - nLETrackSlot.getEndTime() > 1000) {
                return;
            }
            NLETrack mainTrack = C350870DpF.LJI(c0e48).getMainTrack();
            if (mainTrack != null) {
                maxEnd = mainTrack.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            if (nLETrackSlot.hasExtra("ep_bgm_shoot_duration")) {
                j2 = CastLongProtector.parseLong(nLETrackSlot.getExtra("ep_bgm_shoot_duration"));
            } else {
                j2 = 0;
            }
            long startTime = (long) (nLETrackSlot.getStartTime() + (C352310DrZ.LIZLLL(j2) / nLESegmentAudioDynamicCast.getAbsSpeed()));
            long startTime2 = (long) (nLETrackSlot.getStartTime() + ((nLESegmentAudioDynamicCast.getResource().getDuration() - nLESegmentAudioDynamicCast.getTimeClipStart()) / nLESegmentAudioDynamicCast.getAbsSpeed()));
            if (j2 == 0) {
                jMin = Math.min(maxEnd, startTime2);
            } else {
                jMin = Math.min(maxEnd, Math.min(startTime, startTime2));
            }
            nLETrackSlot.setEndTime(jMin);
            nLESegmentAudioDynamicCast.setTimeClipEnd((long) (nLESegmentAudioDynamicCast.getTimeClipStart() + ((nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime()) * nLESegmentAudioDynamicCast.getAbsSpeed())));
            nLESegmentAudioDynamicCast.setTimeClipEnd(Math.min(nLESegmentAudioDynamicCast.getTimeClipEnd(), nLESegmentAudioDynamicCast.getResource().getDuration()));
        }
    }

    public static void LJIIIZ(C351510DqH c351510DqH, C0E48 c0e48) {
        c351510DqH.getClass();
        if (c0e48 != null) {
            LJIIJ(C350870DpF.LJI(c0e48), false, new AwS549S0100000_5(c0e48, 1261));
        }
    }

    public static long LJIILJJIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        NLEVideoAnimation next;
        Iterator<NLEVideoAnimation> it2 = nLETrackSlot.getVideoAnims().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLJJJJLIIL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEVideoAnimation nLEVideoAnimation = next;
        if (nLEVideoAnimation != null) {
            return nLEVideoAnimation.getEndTime();
        }
        return LJJIJ(nLETrack, nLETrackSlot);
    }

    public static NLETrack LJIILL(Pair pair, ArrayList arrayList) {
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(83));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NLETrack nLETrack = (NLETrack) it2.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(nLETrack.getSlots());
            if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new AComparatorS24S0000000_5(84));
            }
            if (arrayList2.isEmpty()) {
                return nLETrack;
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() <= jLongValue || nLETimeSpaceNode.getStartTime() >= jLongValue2)) {
                    return nLETrack;
                }
                if (i == 0 && nLETimeSpaceNode.getStartTime() >= jLongValue2) {
                    return nLETrack;
                }
                if (i == arrayList2.size() - 1) {
                    if (nLETimeSpaceNode.getEndTime() <= jLongValue) {
                        return nLETrack;
                    }
                } else {
                    NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                    if (nLETimeSpaceNode.getEndTime() <= jLongValue && jLongValue2 <= nLETimeSpaceNode2.getStartTime()) {
                        return nLETrack;
                    }
                }
            }
        }
        return null;
    }

    public static NLEVideoAnimation LJIJ(NLETrackSlot nLETrackSlot, String str) {
        VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
        NLEVideoAnimation nLEVideoAnimation = null;
        if (videoAnims == null) {
            return null;
        }
        Iterator<NLEVideoAnimation> it2 = videoAnims.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLEVideoAnimation next = it2.next();
            NLEVideoAnimation nLEVideoAnimation2 = next;
            if (nLEVideoAnimation2.hasExtra("anim_type") && Intrinsics.LJFF(str, nLEVideoAnimation2.getExtra("anim_type"))) {
                nLEVideoAnimation = next;
                break;
            }
        }
        return nLEVideoAnimation;
    }

    public static void LJIJI(NLEModel nLEModel, boolean z) {
        VecNLETrackSlotSPtr sortedSlots;
        NLEResourceNode resource;
        NLEResType resourceType;
        NLEResourceNode resource2;
        VecNLETrackSlotSPtr sortedSlots2;
        NLEResourceNode resource3;
        NLEResType resourceType2;
        NLEResourceNode resource4;
        if (z) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (sortedSlots2 = mainTrack.getSortedSlots()) != null) {
                ArrayList<NLETrackSlot> arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                    NLESegment mainSegment = nLETrackSlot.getMainSegment();
                    if (mainSegment != null && (resource4 = mainSegment.getResource()) != null) {
                        resourceType2 = resource4.getResourceType();
                    } else {
                        resourceType2 = null;
                    }
                    if (resourceType2 == NLEResType.IMAGE) {
                        arrayList.add(nLETrackSlot);
                    }
                }
                for (NLETrackSlot nLETrackSlot2 : arrayList) {
                    NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                    if (mainSegment2 != null && (resource3 = mainSegment2.getResource()) != null) {
                        resource3.setDuration(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime());
                    }
                }
                return;
            }
            return;
        }
        long jLongValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.PICTURE_TRACK_TIME, 4000L)).longValue();
        NLETrack mainTrack2 = nLEModel.getMainTrack();
        if (mainTrack2 != null && (sortedSlots = mainTrack2.getSortedSlots()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot3 : sortedSlots) {
                NLESegment mainSegment3 = nLETrackSlot3.getMainSegment();
                if (mainSegment3 != null && (resource2 = mainSegment3.getResource()) != null) {
                    resourceType = resource2.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType == NLEResType.IMAGE) {
                    arrayList2.add(nLETrackSlot3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                NLESegment mainSegment4 = ((NLETrackSlot) it2.next()).getMainSegment();
                if (mainSegment4 != null && (resource = mainSegment4.getResource()) != null) {
                    resource.setDuration(((long) LSPassThroughRecordSizeConfig.DEFAULT) * jLongValue);
                }
            }
        }
    }

    public static NLETrackSlot LJJIII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        if (!nLETrack.getSlots().contains(nLETrackSlot) || (iIndexOf = (sortedSlots = nLETrack.getSortedSlots()).indexOf(nLETrackSlot)) >= sortedSlots.size() - 1) {
            return null;
        }
        return sortedSlots.get(iIndexOf + 1);
    }

    public static String LJJIIJ(NLETrackSlot nLETrackSlot, List list) {
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLEResType resourceType;
        String resourceFile;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null) {
            NLEResourceAV aVFile = nLERenderProxySegmentDynamicCast.getAVFile();
            if (aVFile != null) {
                resourceType = aVFile.getResourceType();
            } else {
                resourceType = null;
            }
            if (C13LP.LJJJJ(resourceType, list)) {
                NLEResourceAV aVFile2 = nLERenderProxySegmentDynamicCast.getAVFile();
                if (aVFile2 != null) {
                    resourceFile = aVFile2.getResourceFile();
                } else {
                    resourceFile = null;
                }
                if (!TextUtils.isEmpty(resourceFile)) {
                    return resourceFile;
                }
            }
        }
        return null;
    }

    public static long LJJIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        boolean z;
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        NLETrackSlot nLETrackSlot2;
        NLESegmentTransition endTransition;
        if (nLETrack != null && nLETrack.getMainTrack()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (sortedSlots = nLETrack.getSortedSlots()) == null || (iIndexOf = sortedSlots.indexOf(nLETrackSlot)) <= 0 || (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(iIndexOf - 1, sortedSlots)) == null || (endTransition = nLETrackSlot2.getEndTransition()) == null || !C347020Dj2.LIZ(endTransition)) {
            return 0L;
        }
        return endTransition.getTransitionDuration() / ((long) 2);
    }

    public static Size LIZJ(Size size, Size size2, Size size3) {
        boolean z;
        float width = size2.getWidth() / size2.getHeight();
        int width2 = size.getWidth();
        int height = size.getHeight();
        if (size.getWidth() <= 0 && size.getHeight() <= 0) {
            width2 = size2.getWidth();
            height = size2.getHeight();
        } else if (size.getWidth() <= 0 && size.getHeight() > 0) {
            width2 = (int) (size.getHeight() * width);
        } else if (size.getWidth() > 0 && size.getHeight() <= 0) {
            height = (int) (size.getWidth() / width);
        }
        if (width2 > height) {
            z = true;
        } else {
            z = false;
        }
        int iMax = Math.max(width2, height);
        int iMin = Math.min(width2, height);
        float f = iMax / iMin;
        int iMax2 = Math.max(size3.getWidth(), size3.getHeight());
        int iMin2 = Math.min(size3.getWidth(), size3.getHeight());
        if (iMax > iMax2 || iMin > iMin2) {
            if (iMax * iMin2 >= iMin * iMax2) {
                iMin = (int) (iMax2 / f);
                iMax = iMax2;
            } else {
                iMax = (int) (iMin2 * f);
                iMin = iMin2;
            }
        }
        if (z) {
            return new Size(iMax, iMin);
        }
        return new Size(iMin, iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZLLL(X.C350780Dp6 r7, com.bytedance.ies.nle.editor_jni.NLETrack r8, long r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351510DqH.LIZLLL(X.0Dp6, com.bytedance.ies.nle.editor_jni.NLETrack, long):long");
    }

    public static long LJ(C350780Dp6 c350780Dp6, NLETrack nLETrack, long j) {
        long j2;
        long jMin;
        Long l;
        NLETrackSlot nLETrackSlot = c350780Dp6.LIZ;
        long j3 = c350780Dp6.LIZIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j3 != 0) {
            j2 = j3;
        } else {
            j2 = 500000;
        }
        long jLJJIJ = LJJIJ(nLETrack, nLETrackSlot);
        long jLJJIIZI = LJJIIZI(nLETrackSlot);
        String str = c350780Dp6.LIZJ;
        NLEVideoAnimation nLEVideoAnimation = null;
        if (Intrinsics.LJFF(str, "in_video_anim")) {
            VecNLEVideoAnimationSPtr videoAnims = c350780Dp6.LIZ.getVideoAnims();
            ArrayList arrayList = new ArrayList();
            for (NLEVideoAnimation nLEVideoAnimation2 : videoAnims) {
                NLEVideoAnimation nLEVideoAnimation3 = nLEVideoAnimation2;
                if (C351220Dpo.LLLIIII(nLEVideoAnimation3) || C351220Dpo.LLJIJIL(nLEVideoAnimation3)) {
                    arrayList.add(nLEVideoAnimation2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Long lValueOf = Long.valueOf(((NLETimeSpaceNode) it2.next()).getStartTime());
                loop1: while (true) {
                    l = lValueOf;
                    while (it2.hasNext()) {
                        lValueOf = Long.valueOf(((NLETimeSpaceNode) it2.next()).getStartTime());
                        if (l.compareTo(lValueOf) > 0) {
                            break;
                        }
                    }
                }
                if (l != null) {
                    jLJJIIZI = l.longValue();
                }
            }
            if (jLJJIIZI < jLJJIJ) {
                return jLJJIJ;
            }
            return Math.min(jLJJIJ + j2, jLJJIIZI);
        }
        if (Intrinsics.LJFF(str, "out_video_anim")) {
            return jLJJIIZI;
        }
        Iterator<NLEVideoAnimation> it3 = c350780Dp6.LIZ.getVideoAnims().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            NLEVideoAnimation next = it3.next();
            if (C351220Dpo.LLLIIII(next)) {
                nLEVideoAnimation = next;
                break;
            }
        }
        NLEVideoAnimation nLEVideoAnimation4 = nLEVideoAnimation;
        if (nLEVideoAnimation4 != null) {
            jMin = nLEVideoAnimation4.getStartTime();
        } else {
            jMin = jLJJIIZI;
        }
        if (j3 != 500000) {
            jMin = Math.min(j + j2, jMin);
        }
        if (jMin <= jLJJIJ) {
            return jLJJIJ;
        }
        return Math.min(jLJJIIZI, jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJFF(X.C350780Dp6 r6, com.bytedance.ies.nle.editor_jni.NLETrack r7, long r8) {
        /*
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = r6.LIZ
            java.lang.String r1 = r6.LIZJ
            java.lang.String r0 = "in_video_anim"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L11
            long r0 = LJJIJ(r7, r3)
            return r0
        L11:
            java.lang.String r0 = "out_video_anim"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r6.LIZ
            com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r0 = r0.getVideoAnims()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L28:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r1 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r1
            boolean r0 = X.C351220Dpo.LLJJJJLIIL(r1)
            if (r0 != 0) goto L41
            boolean r0 = X.C351220Dpo.LLJIJIL(r1)
            if (r0 == 0) goto L28
        L41:
            r5.add(r2)
            goto L28
        L45:
            java.util.Iterator r4 = r5.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r4.next()
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            long r0 = r0.getEndTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L5d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r4.next()
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            long r0 = r0.getEndTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L5d
            r2 = r1
            goto L5d
        L79:
            long r4 = LJJIJ(r7, r3)
            goto L84
        L7e:
            if (r2 == 0) goto L79
            long r4 = r2.longValue()
        L84:
            long r6 = r6.LIZIZ
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r6 = r6 * r0
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L93
            r6 = 500000(0x7a120, double:2.47033E-318)
        L93:
            long r0 = LJJIIZI(r3)
            long r0 = r0 - r6
            long r0 = java.lang.Math.max(r0, r4)
            return r0
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351510DqH.LJFF(X.0Dp6, com.bytedance.ies.nle.editor_jni.NLETrack, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(com.bytedance.ies.nle.editor_jni.NLEModel r14, boolean r15, kotlin.jvm.functions.Function0 r16) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351510DqH.LJIIJ(com.bytedance.ies.nle.editor_jni.NLEModel, boolean, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r4 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r4.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r3 = r4.next();
        r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r2.getLayer() != (r7.size() - 1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2.getSlots().isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.bytedance.ies.nle.editor_jni.NLEModel r8, com.bytedance.ies.nle.editor_jni.NLETrackType r9, java.lang.String r10) {
        /*
            java.util.List r7 = LJJIIZ(r8, r9, r10)
        L4:
            java.util.Iterator r4 = r7.iterator()
        L8:
            boolean r0 = r4.hasNext()
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L5f
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            int r1 = r2.getLayer()
            int r0 = r7.size()
            int r0 = r0 - r6
            if (r1 != r0) goto L8
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r2.getSlots()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8
            if (r3 == 0) goto L5f
            java.util.Iterator r4 = r7.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            int r1 = r2.getLayer()
            int r0 = r7.size()
            int r0 = r0 - r6
            if (r1 != r0) goto L32
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r2.getSlots()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            r5 = r3
        L55:
            com.bytedance.ies.nle.editor_jni.NLETrack r5 = (com.bytedance.ies.nle.editor_jni.NLETrack) r5
            r8.removeTrack(r5)
            java.util.List r7 = LJJIIZ(r8, r9, r10)
            goto L4
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351510DqH.LJIIJJI(com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETrackType, java.lang.String):void");
    }

    public static NLETrack LJIILLIIL(long j, NLEModel nLEModel, long j2) {
        for (NLETrack nLETrack : C351220Dpo.LJJLIIIJLJLI(nLEModel)) {
            LIZ.getClass();
            for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if ((nLETrackSlot2.getStartTime() < j && nLETrackSlot2.getEndTime() > j) || ((nLETrackSlot2.getStartTime() >= j && nLETrackSlot2.getEndTime() <= j2) || (nLETrackSlot2.getStartTime() < j2 && nLETrackSlot2.getEndTime() > j2))) {
                    if (nLETrackSlot == null) {
                        return nLETrack;
                    }
                }
            }
            return nLETrack;
        }
        return null;
    }

    public static List LJJIIZ(NLEModel nLEModel, NLETrackType nLETrackType, String str) {
        int i = C347290DjT.LIZ[nLETrackType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        VecNLETrackSPtr tracks = nLEModel.getTracks();
                        ArrayList arrayList = new ArrayList();
                        for (NLETrack nLETrack : tracks) {
                            NLETrack nLETrack2 = nLETrack;
                            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == nLETrackType && !C351220Dpo.LLIIZ(nLETrack2)) {
                                arrayList.add(nLETrack);
                            }
                        }
                        return arrayList;
                    }
                    return C351220Dpo.LJJIJLIJ(nLEModel);
                }
                return C351220Dpo.LJJLIIIJLJLI(nLEModel);
            }
            if (Intrinsics.LJFF(str, "TEXT")) {
                return C351220Dpo.LJLLI(nLEModel);
            }
            if (Intrinsics.LJFF(str, "INFO")) {
                return C351220Dpo.LJJJLIIL(nLEModel);
            }
            return C351220Dpo.LJLJJLL(nLEModel);
        }
        return C351220Dpo.LJIJJ(nLEModel);
    }

    public static long LJI(C350780Dp6 c350780Dp6, NLETrack nLETrack, boolean z, long j) {
        Long l;
        Long l2;
        NLETrackSlot nLETrackSlot = c350780Dp6.LIZ;
        long jLJJIJ = LJJIJ(nLETrack, nLETrackSlot);
        long jLJJIIZI = LJJIIZI(nLETrackSlot);
        String str = c350780Dp6.LIZJ;
        if (Intrinsics.LJFF(str, "in_video_anim")) {
            return jLJJIJ;
        }
        if (Intrinsics.LJFF(str, "out_video_anim")) {
            VecNLEVideoAnimationSPtr videoAnims = c350780Dp6.LIZ.getVideoAnims();
            ArrayList arrayList = new ArrayList();
            for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                NLEVideoAnimation nLEVideoAnimation2 = nLEVideoAnimation;
                if (C351220Dpo.LLJJJJLIIL(nLEVideoAnimation2) || C351220Dpo.LLJIJIL(nLEVideoAnimation2)) {
                    arrayList.add(nLEVideoAnimation);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Long lValueOf = Long.valueOf(((NLETimeSpaceNode) it2.next()).getEndTime());
                loop1: while (true) {
                    l2 = lValueOf;
                    while (it2.hasNext()) {
                        lValueOf = Long.valueOf(((NLETimeSpaceNode) it2.next()).getEndTime());
                        if (l2.compareTo(lValueOf) < 0) {
                            break;
                        }
                    }
                }
                if (l2 != null) {
                    jLJJIJ = l2.longValue();
                }
            }
            if (jLJJIJ >= jLJJIIZI) {
                jLJJIJ = jLJJIIZI;
            }
            long j2 = c350780Dp6.LIZIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j2 == 0) {
                j2 = 500000;
            }
            return Math.max(jLJJIIZI - j2, jLJJIJ);
        }
        if (!z) {
            return j;
        }
        VecNLEVideoAnimationSPtr videoAnims2 = c350780Dp6.LIZ.getVideoAnims();
        ArrayList arrayList2 = new ArrayList();
        for (NLEVideoAnimation nLEVideoAnimation3 : videoAnims2) {
            if (C351220Dpo.LLJJJJLIIL(nLEVideoAnimation3)) {
                arrayList2.add(nLEVideoAnimation3);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            Long lValueOf2 = Long.valueOf(((NLETimeSpaceNode) it3.next()).getEndTime());
            loop4: while (true) {
                l = lValueOf2;
                while (it3.hasNext()) {
                    lValueOf2 = Long.valueOf(((NLETimeSpaceNode) it3.next()).getEndTime());
                    if (l.compareTo(lValueOf2) < 0) {
                        break;
                    }
                }
            }
            if (l != null) {
                jLJJIJ = l.longValue();
            }
        }
        if (jLJJIJ >= jLJJIIZI) {
            return jLJJIIZI;
        }
        return jLJJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.ies.nle.editor_jni.NLETrack LJIIZILJ(X.C351510DqH r9, X.C0E48 r10, long r11, java.lang.String r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351510DqH.LJIIZILJ(X.0DqH, X.0E48, long, java.lang.String):com.bytedance.ies.nle.editor_jni.NLETrack");
    }

    public static void LJIILIIL(C0E48 c0e48, NLEModel nLEModel, NLETrackSlot nLETrackSlot, List list, String str) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLIZ = C350110Do1.LIZ(nLEModel, nLETrackSlot);
        if (nLETrackSlotLIZ != null) {
            C350730Dp1 c350730Dp1 = new C350730Dp1(list, str, EnumC356090Dxf.AUDIO);
            if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLIIJLIL(nLETrackSlotLIZ, c350730Dp1, EnumC356070Dxd.NONE);
            }
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
            C350110Do1.LJIILL(nLEModel);
        }
    }

    public static boolean LJJIZ(C0E48 c0e48, NLETrackSlot nLETrackSlot, long j, long j2, int i) {
        NLETrackSlot nLETrackSlotLJJIII;
        boolean z;
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        NLETrack trackBySlot = nLEModelLJI.getTrackBySlot(nLETrackSlot);
        if (trackBySlot == null || !C351220Dpo.LLLIIL(trackBySlot) || (nLETrackSlotLJJIII = LJJIII(trackBySlot, nLETrackSlot)) == null || j2 <= nLETrackSlotLJJIII.getStartTime()) {
            return true;
        }
        NLETrack nLETrackLJIILLIIL = LJIILLIIL(j, nLEModelLJI, j2);
        if (nLETrackLJIILLIIL == null) {
            if (!LJII(nLEModelLJI)) {
                return false;
            }
            List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModelLJI);
            int iIndexOf = listLJJLIIIJLJLI.indexOf(trackBySlot);
            if (C351220Dpo.LJJLIIIJLJLI(nLEModelLJI).indexOf(trackBySlot) == r0.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            int layer = trackBySlot.getLayer() + 1;
            nLETrackLJIILLIIL = new NLETrack();
            nLETrackLJIILLIIL.setLayer(layer);
            nLETrackLJIILLIIL.setExtra("track_type", "video");
            nLETrackLJIILLIIL.setMainTrack(false);
            nLETrackLJIILLIIL.setExtraTrackType(NLETrackType.VIDEO);
            nLETrackLJIILLIIL.setExtra("track_layer", String.valueOf(layer));
            nLETrackLJIILLIIL.setExtra("track_extra_pip", "true");
            nLEModelLJI.addTrack(nLETrackLJIILLIIL);
            if (!z) {
                for (NLETrack nLETrack : listLJJLIIIJLJLI.subList(iIndexOf + 1, listLJJLIIIJLJLI.size())) {
                    int layer2 = nLETrack.getLayer() + 1;
                    nLETrack.setLayer(layer2);
                    nLETrack.setExtra("track_layer", String.valueOf(layer2));
                }
            }
        }
        trackBySlot.removeSlot(nLETrackSlot);
        nLETrackSlot.setTransformZ(nLETrackLJIILLIIL.getLayer() + 1);
        nLETrackLJIILLIIL.addSlot(nLETrackSlot);
        c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot, i, null, false, 0, 250), "select_slot_event", false);
        return true;
    }

    public static NLEError LJIJJLI(C351510DqH c351510DqH, String str, String str2, String str3, final INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged, final INLEMediaReverseOnDone iNLEMediaReverseOnDone) {
        Size size;
        c351510DqH.getClass();
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return NLEError.FILE_ACCESS_ERROR;
        }
        int i = videoFileInfo.rotation;
        if (i != 90 && i != 270) {
            size = new Size(videoFileInfo.width, videoFileInfo.height);
        } else {
            size = new Size(videoFileInfo.height, videoFileInfo.width);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(videoFileInfo.duration);
        NLEModel nLEModel = new NLEModel();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(micros);
        nLESegmentVideo.setVolume(1.0f);
        nLESegmentVideo.setRewind(true);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.VIDEO);
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setDuration(timeUnit.toMicros(videoFileInfo.duration));
        nLESegmentVideo.setReversedAVFile(nLEResourceAV);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setStartTime(0L);
        nLETrackSlot.setEndTime(micros - 0);
        nLETrack.addSlotAtEnd(nLETrackSlot);
        nLEModel.addTrack(nLETrack);
        Size sizeLIZJ = LIZJ(new Size(-1, -1), size, new Size(1080, 1920));
        int width = sizeLIZJ.getWidth();
        int height = sizeLIZJ.getHeight();
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("progress_");
            sbLIZ.append(System.currentTimeMillis());
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("done_");
            sbLIZ2.append(System.currentTimeMillis());
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper = new NLEMediaOnProgressChangedWrapper() { // from class: X.0DqK
                @Override // com.bytedance.ies.nle.editor_jni.NLEMediaOnProgressChangedWrapper, com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
                public final void onChanged(double d) {
                    iNLEMediaReverseOnProgressChanged.onChanged(d);
                }
            };
            ConcurrentHashMap<String, Object> concurrentHashMap = C351530DqJ.LIZ;
            concurrentHashMap.put(strLIZIZ, nLEMediaOnProgressChangedWrapper);
            NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper = new NLEMediaOnDoneWrapper() { // from class: X.0DqI
                @Override // com.bytedance.ies.nle.editor_jni.NLEMediaOnDoneWrapper, com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
                public final void onDone(int i2) {
                    iNLEMediaReverseOnDone.onDone(i2);
                    ConcurrentHashMap<String, Object> concurrentHashMap2 = C351530DqJ.LIZ;
                    concurrentHashMap2.remove(strLIZIZ);
                    concurrentHashMap2.remove(strLIZIZ2);
                }
            };
            concurrentHashMap.put(strLIZIZ2, nLEMediaOnDoneWrapper);
            NLEError nLEErrorReverseNLEModel = NLEMediaReverseUtil.reverseNLEModel(nLEModel, str2, nLEMediaOnProgressChangedWrapper, nLEMediaOnDoneWrapper, str3, width, height, true);
            if (nLEErrorReverseNLEModel == NLEError.SUCCESS) {
                return nLEErrorReverseNLEModel;
            }
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_ERROR, "reverseNLEModel failed!");
            }
            concurrentHashMap.remove(strLIZIZ);
            concurrentHashMap.remove(strLIZIZ2);
            return nLEErrorReverseNLEModel;
        }
        NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
        if (logger2 != null) {
            logger2.onLog(LogLevel.LEVEL_ERROR, "reverseNLEModel: out_file or tmp_path is invalid");
        }
        return NLEError.FAILED;
    }
}
