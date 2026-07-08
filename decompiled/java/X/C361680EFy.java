package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS18S0300100_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361680EFy {
    public static final String LJIIJ(NLEModel nLEModel) {
        String strLJJJJI;
        List<NLESegmentComposerFilter> listLJIIL = C351220Dpo.LJIIL(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (NLESegmentComposerFilter nLESegmentComposerFilter : (ArrayList) listLJIIL) {
            if (nLESegmentComposerFilter != null && (strLJJJJI = C351220Dpo.LJJJJI(nLESegmentComposerFilter)) != null) {
                arrayList.add(strLJJJJI);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIIJJI(NLEModel nLEModel) {
        String resourceName;
        List<NLESegmentComposerFilter> listLJIIL = C351220Dpo.LJIIL(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        Iterator it2 = ((ArrayList) listLJIIL).iterator();
        while (it2.hasNext()) {
            NLEResourceNode effectSDKFilter = ((NLESegmentFilter) it2.next()).getEffectSDKFilter();
            if (effectSDKFilter == null || (resourceName = effectSDKFilter.getResourceName()) == null) {
                resourceName = "";
            }
            arrayList.add(resourceName);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIIL(NLEModel nLEModel) {
        List<NLESegmentComposerFilter> listLJJIJIIJI = C351220Dpo.LJJIJIIJI(nLEModel);
        List<NLESegmentComposerFilter> listLJIIL = C351220Dpo.LJIIL(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        Iterator it2 = ((ArrayList) listLJIIL).iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((ArrayList) listLJJIJIIJI).contains(it2.next()) ? 1 : 0));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((Number) obj).intValue());
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIILIIL(NLEModel nLEModel) {
        List<NLESegmentComposerFilter> listLJIIL = C351220Dpo.LJIIL(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        Iterator it2 = ((ArrayList) listLJIIL).iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(C351220Dpo.LJJIIJ((NLESegmentComposerFilter) it2.next())));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((Number) obj).floatValue());
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final int LJIILJJIL(NLEModel nLEModel) {
        return ((ArrayList) C351220Dpo.LJJIJIIJIL(nLEModel)).size() + ((ArrayList) C351220Dpo.LJLI(nLEModel)).size();
    }

    public static final String LJIILL(NLEModel nLEModel) {
        List<NLESegmentComposerFilter> listLJJIJIIJI = C351220Dpo.LJJIJIIJI(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIJIIJI, 10));
        Iterator it2 = ((ArrayList) listLJJIJIIJI).iterator();
        while (it2.hasNext()) {
            arrayList.add(C351220Dpo.LJJJJI((NLESegmentComposerFilter) it2.next()));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIILLIIL(NLEModel nLEModel) {
        String resourceName;
        List<NLESegmentComposerFilter> listLJJIJIIJI = C351220Dpo.LJJIJIIJI(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIJIIJI, 10));
        Iterator it2 = ((ArrayList) listLJJIJIIJI).iterator();
        while (it2.hasNext()) {
            NLEResourceNode effectSDKFilter = ((NLESegmentFilter) it2.next()).getEffectSDKFilter();
            if (effectSDKFilter == null || (resourceName = effectSDKFilter.getResourceName()) == null) {
                resourceName = "";
            }
            arrayList.add(resourceName);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIIZILJ(NLEModel nLEModel) {
        List<NLESegmentComposerFilter> listLJJIJIIJI = C351220Dpo.LJJIJIIJI(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIJIIJI, 10));
        Iterator it2 = ((ArrayList) listLJJIJIIJI).iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(C351220Dpo.LJJIIJ((NLESegmentComposerFilter) it2.next())));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((Number) obj).floatValue());
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final int LJIJ(NLEModel nLEModel) {
        int size;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            size = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && !C351220Dpo.LLLII(nLETrack) && !C351220Dpo.LLLLIILL(nLETrack)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((NLETrackSlot) obj).getKeyframes().size() > 0) {
                arrayList3.add(obj);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            size += ((NLETrackSlot) it4.next()).getKeyframes().size();
        }
        return size;
    }

    public static final long LJIJI(String str) {
        return C0E5L.LIZ(C0E5L.LIZ.get(str));
    }

    public static final String LJIL(C0E48 c0e48) {
        NLETrack nLETrackPt;
        if (c0e48 == null || (nLETrackPt = c0e48.Pt()) == null) {
            return "";
        }
        if (C351220Dpo.LLLLILI(nLETrackPt)) {
            return "animation";
        }
        if (C351220Dpo.LLJLLIL(nLETrackPt)) {
            return "lyrics";
        }
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL == null) {
            return "";
        }
        int i = C347260DjQ.LIZ[C350870DpF.LJIIIIZZ(nLETrackPt).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        if (C351220Dpo.LLJI(nLETrackPt)) {
                            return "filter";
                        }
                        return "adjust_filter";
                    }
                    return "effect";
                }
                if (C349550Dn7.LJFF(nLETrackSlotLLLLLLIL)) {
                    return "caption";
                }
                if (!C351220Dpo.LLLJL(nLETrackPt)) {
                    if (C351220Dpo.LLJLILLLLZIIL(nLETrackPt) || C351220Dpo.LLJJJJ(nLETrackPt)) {
                        return "sticker";
                    }
                    return "text";
                }
                return "text";
            }
            return "sound";
        }
        if (nLETrackPt.getMainTrack()) {
            return "video";
        }
        return "pip";
    }

    public static final boolean LJJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLLJ(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (C351220Dpo.LJZI((NLETrackSlot) it3.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJI(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null || (slots = mainTrack.getSlots()) == null || slots.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : slots) {
            if (nLETrackSlot.getEndTransition() != null && nLETrackSlot.hasExtra("ep_transition_cache_duration")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIFFI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((NLENode) it3.next()).getExtra("is_editor_pro_speed_used"), "true")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJII(C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            if (nLETrackSlotLLLLLLIL.getKeyframes().size() > 0 || C351220Dpo.LLIIIJ(nLETrackSlotLLLLLLIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJJJJJL(long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "acc_advanced_edit_delete_audio_clip_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_delete_audio_clip_duration", c0lab.LIZ);
    }

    public static final void LJJJLZIJ(final VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null && C372750EjR.LIZJ) {
            final int i = C372750EjR.LIZLLL;
            C372750EjR.LIZLLL = 0;
            C372750EjR.LIZJ = false;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C15O7.LIZJ(new Callable() { // from class: X.090Z
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x00d3
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instruction units count: 237
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C090Z.call():java.lang.Object");
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.ArrayList] */
    public static final LinkedHashMap<String, String> LJJL(NLEModel nLEModel) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        int i = 0;
        if (!Intrinsics.LJFF(nLEModel.getExtra("is_editorpro_keyframe"), "1") && !Boolean.parseBoolean(nLEModel.getExtra("is_editorpro_keyframe"))) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            if (tracks != null) {
                ArrayList<NLENode> arrayList = new ArrayList();
                Iterator<NLETrack> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                }
                if (!arrayList.isEmpty()) {
                    for (NLENode nLENode : arrayList) {
                        if (Intrinsics.LJFF(nLENode.getExtra("is_editorpro_keyframe"), "1") || Boolean.parseBoolean(nLENode.getExtra("is_editorpro_keyframe"))) {
                            int iLJIJ = LJIJ(nLEModel);
                            linkedHashMap.put("is_editorpro_keyframe", "1");
                            linkedHashMap.put("editorpro_keyframe_cnt", String.valueOf(iLJIJ));
                            break;
                        }
                    }
                }
            }
            linkedHashMap.put("is_editorpro_keyframe", CardStruct.IStatusCode.DEFAULT);
        } else {
            int iLJIJ2 = LJIJ(nLEModel);
            linkedHashMap.put("is_editorpro_keyframe", "1");
            linkedHashMap.put("editorpro_keyframe_cnt", String.valueOf(iLJIJ2));
            break;
        }
        List listLJLIL = C13LP.LJLIL(C0E4O.LIZIZ, C0E4O.LIZ);
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(506);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        VecNLETrackSPtr sortedTracks = nLEModel.getSortedTracks();
        if (sortedTracks != null) {
            Iterator<NLETrack> it3 = sortedTracks.iterator();
            while (it3.hasNext()) {
                ((List) c259800zU.element).addAll(it3.next().getSortedSlots());
            }
        }
        Iterable iterable = (Iterable) c259800zU.element;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) aFwS234S0000000_5.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        c259800zU.element = new ArrayList(arrayList2);
        for (String str : (ArrayList) listLJLIL) {
            if (!C0E4O.LIZIZ.contains(str)) {
                List<NLENode> list = (List) c259800zU.element;
                if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (NLENode nLENode2 : list) {
                            if (nLENode2.hasExtra(str) && Intrinsics.LJFF(nLENode2.getExtra(str), "1")) {
                                linkedHashSet.add(str);
                                break;
                            }
                        }
                    }
                } else {
                    linkedHashSet.add(str);
                    break;
                }
            }
            if (C0E4O.LIZIZ.contains(str)) {
                List list2 = (List) c259800zU.element;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    C19719612Di.LJJI(((NLETrackSlot) it4.next()).getKeyframes(), arrayList3);
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it5 = arrayList3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            NLENode nLENode3 = (NLENode) it5.next();
                            if (nLENode3.hasExtra(str) && Intrinsics.LJFF(nLENode3.getExtra(str), "1")) {
                                linkedHashSet.add(str);
                                break;
                            }
                        }
                    }
                }
            }
        }
        String strLIZIZ = "";
        for (Object obj2 : linkedHashSet) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj2;
                if (i == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(',');
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        linkedHashMap.put("editorpro_keyframe_relate_list", strLIZIZ);
        return linkedHashMap;
    }

    public static final void LJJZZIII(long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "acc_advanced_edit_split_video_clip_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_split_video_clip_duration", c0lab.LIZ);
    }

    public static final void LJLJJI(String str) {
        if (((Boolean) C23014090a.LIZ.getValue()).booleanValue() && C1402900mbw.LIZ > 0) {
            if (Intrinsics.LJFF(str, "step1_perf_editor_pro_click_to_on_create_view")) {
                System.currentTimeMillis();
            } else {
                if (!Intrinsics.LJFF(str, "step2_perf_editor_pro_on_create_view")) {
                    return;
                }
                System.currentTimeMillis();
            }
        }
    }

    public static final void LIZ(long j, String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = C0E5L.LIZ;
        concurrentHashMap.put(str, String.valueOf(j + C0E5L.LIZ(concurrentHashMap.get(str))));
    }

    public static final void LIZIZ(NLETrackSlot nLETrackSlot, String str) {
        String strName;
        long jCurrentTimeMillis;
        Long lLJIILIIL;
        NLEResType type;
        NLEResType type2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        String strName2 = null;
        if (mainSegment != null && (type2 = mainSegment.getType()) != null) {
            strName = type2.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append("select_slot_time");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
        if (mainSegment2 != null && (type = mainSegment2.getType()) != null) {
            strName2 = type.name();
        }
        sbLIZ2.append(strName2);
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        ConcurrentHashMap<String, String> concurrentHashMap = C0E5L.LIZ;
        String str2 = concurrentHashMap.get(strLIZIZ);
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        concurrentHashMap.put(strLIZIZ2, String.valueOf(C0E5L.LIZ(concurrentHashMap.get(strLIZIZ2)) + jCurrentTimeMillis));
    }

    public static void LIZJ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel) {
        String str;
        NLEModel nLEModelLJJJZ = C1416310mxZ.LJJJZ(videoPublishEditModel);
        if (nLEModelLJJJZ != null) {
            String str2 = "1";
            if (C357540E0a.LJJI(nLEModelLJJJZ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1403560md0.LJ("is_editor_pro_adjust_filter_used", str);
            if (!C357540E0a.LJJIFFI(nLEModelLJJJZ)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1403560md0.LJ("is_editorpro_autoadjust", str2);
            Pair pairLJ = C357540E0a.LJ(nLEModelLJJJZ);
            if (((Number) pairLJ.getFirst()).intValue() != 0) {
                c1403560md0.LJ("adjust_function_used_cnt", String.valueOf(((Number) pairLJ.getFirst()).intValue()));
            }
            if (((CharSequence) pairLJ.getSecond()).length() > 0) {
                c1403560md0.LJ("adjust_function_feature_list", (String) pairLJ.getSecond());
            }
        }
    }

    public static void LIZLLL(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel) {
        int size;
        int i;
        List<NLETrack> listLJJIJLIJ;
        int i2;
        String extra;
        NLEModel nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel);
        int i3 = 0;
        if (nLEModelLJJLIIIJILLIZJL != null && (listLJJIJLIJ = C351220Dpo.LJJIJLIJ(nLEModelLJJLIIIJILLIZJL)) != null) {
            i3 = 0;
            size = 0;
            i = 0;
            for (NLETrack nLETrack : listLJJIJLIJ) {
                i3++;
                size += nLETrack.getSlots().size();
                VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                if ((slots instanceof Collection) && slots.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (nLETrackSlot != null && nLETrackSlot.getEnable() && (extra = nLETrackSlot.getExtra("slot_extra_is_favorite_resource")) != null && Boolean.parseBoolean(extra) && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                i += i2;
            }
        } else {
            size = 0;
            i = 0;
        }
        c1403560md0.LJ("editor_pro_effect_tracks_cnt", String.valueOf(i3));
        c1403560md0.LJ("editor_pro_effect_clips_cnt", String.valueOf(size));
        c1403560md0.LJ("editor_pro_collection_effect_cnt", String.valueOf(i));
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String nleData;
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (nleData = videoPublishEditModel.getNleData()) != null && nleData.length() != 0) {
            C0CHQ.LIZ().LJJIZ();
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            if (nLEEditorLIZ.getModel() != null) {
                c0lab.LJ("edit_video_duration", String.valueOf(LJIJI("edit_video_duration_total")));
                c0lab.LIZIZ(LJIJI("edit_video_duration_total"), "edit_video_duration");
                c0lab.LIZIZ(LJIJI("adjust_video_speed_duration_total"), "adjust_video_speed_duration");
                c0lab.LIZIZ(LJIJI("adjust_video_curve_speed_duration_total"), "adjust_video_curve_speed_duration");
                c0lab.LIZIZ(LJIJI("add_video_material_duration_total"), "add_video_material_duration");
                c0lab.LIZIZ(LJIJI("adjust_video_volume_duration_total"), "adjust_video_volume_duration");
                c0lab.LIZIZ(LJIJI("start_over_duration_total"), "start_over_duration");
                c0lab.LIZIZ(LJIJI("edit_music_duration_total"), "edit_music_duration");
                c0lab.LIZIZ(LJIJI("add_music_material_duration_total"), "add_music_material_duration");
                c0lab.LIZIZ(LJIJI("add_sound_effect_duration_total"), "add_sound_effect_duration");
                c0lab.LIZIZ(LJIJI("adjust_music_volume_duration_total"), "adjust_music_volume_duration");
                c0lab.LIZIZ(LJIJI("edit_text_duration_total"), "edit_text_duration");
                c0lab.LIZIZ(LJIJI("adjust_text_content_duration_total"), "adjust_text_content_duration");
                c0lab.LIZIZ(LJIJI("edit_tts_duration_total"), "edit_tts_duration");
                c0lab.LIZIZ(LJIJI("edit_captions_duration_total"), "edit_captions_duration");
                c0lab.LIZIZ(LJIJI("add_captions_duration_total"), "add_captions_duration");
                c0lab.LIZIZ(LJIJI("edit_effect_duration_total"), "edit_effect_duration");
                c0lab.LIZIZ(LJIJI("add_effect_duration_total"), "add_effect_duration");
                c0lab.LIZIZ(LJIJI("editor_pro_use_duration_total"), "editor_pro_use_duration");
            }
        }
    }

    public static final C0LAB LJII(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String enterFrom;
        String str;
        if (videoPublishEditModel == null) {
            EditModelProvider.Companion.getClass();
            EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
            if (editModelProviderLIZIZ == null || (videoPublishEditModel = editModelProviderLIZIZ.getEditModel()) == null) {
                return new C0LAB();
            }
        }
        if (!u4.LJIIIIZZ(videoPublishEditModel)) {
            return new C0LAB();
        }
        if (c0e48 == null) {
            return new C0LAB();
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (videoPublishEditModel.getEnterFrom() != null && !Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "")) {
            enterFrom = videoPublishEditModel.getEnterFrom();
        } else {
            enterFrom = "video_edit_page";
        }
        c0labLJFF.LJ("enter_from", enterFrom);
        c0labLJFF.LJ("music_id", videoPublishEditModel.getMusicId());
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str);
        return c0labLJFF;
    }

    public static final void LJIIIZ(long j, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(z ? 1 : 0, "use_cache");
        C20684815ws.LJIILLIIL("download_smarttrim_models", c0lab.LIZ);
    }

    public static final long LJIJJ(NLETrackSlot nLETrackSlot, String str) {
        NLEResType type;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            type = mainSegment.getType();
        } else {
            type = null;
        }
        return LJIJJLI(type, str);
    }

    public static final long LJIJJLI(NLEResType nLEResType, String str) {
        String strName;
        ConcurrentHashMap<String, String> concurrentHashMap = C0E5L.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (nLEResType != null) {
            strName = nLEResType.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append(str);
        return C0E5L.LIZ(concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static final void LJJJJI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        long jQq;
        Pair<Integer, Integer> pair;
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            jQq = c0e48.getPlayer().qq();
        } else {
            jQq = -1;
        }
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        } else {
            pair = new Pair<>(-1, -1);
        }
        C0CNO.LIZ(C15O7.LJI, new AwS18S0300100_5(jQq, videoPublishEditModel, c0e48, pair, 1));
    }

    public static final void LJJJJL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("track_type", LJIL(c0e48));
        C20684815ws.LJIILLIIL("delete_material_invalid_popup", c0labLJFF.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJLIIIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, java.lang.String r6) {
        /*
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r5.getEditorProModel()
            java.lang.String r2 = r0.getOpenEditToolType()
            int r1 = r2.hashCode()
            r0 = -1349063220(0xffffffffaf96edcc, float:-2.7453806E-10)
            if (r1 == r0) goto L7c
            r0 = -50093235(0xfffffffffd03a34d, float:-1.0936048E37)
            if (r1 == r0) goto L73
            r0 = 1376878921(0x52118149, float:1.5623483E11)
            if (r1 != r0) goto L23
            java.lang.String r4 = "new_edit"
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L25
        L23:
            java.lang.String r4 = ""
        L25:
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            java.lang.String r1 = "creation_id"
            java.lang.String r0 = r5.getCreationId()
            r3.LJ(r1, r0)
            java.lang.String r1 = "shoot_way"
            java.lang.String r0 = r5.mShootWay
            r3.LJ(r1, r0)
            java.lang.String r1 = X.C1428470nHB.LJIILIIL(r5)
            java.lang.String r0 = "content_source"
            r3.LJ(r0, r1)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = "shoot_page_edit_tab"
            r3.LJ(r0, r2)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            X.C0MJO.LIZIZ(r0, r3)
            java.lang.String r0 = "exit_from"
            r3.LJ(r0, r4)
            java.lang.String r1 = "is_from_edit_tab"
            java.lang.String r0 = "1"
            r3.LJ(r1, r0)
            java.lang.String r0 = "option"
            r3.LJ(r0, r6)
            java.lang.String r0 = "click_from"
            r3.LJ(r0, r2)
            java.lang.String r1 = "is_editor_pro"
            r0 = 1
            r3.LIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "leave_edit_tab_path_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L73:
            java.lang.String r4 = "captions"
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L25
            goto L23
        L7c:
            java.lang.String r4 = "cutout"
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L25
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361680EFy.LJJLIIIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):void");
    }

    public static final void LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("track_type", LJIL(c0e48));
        C20684815ws.LJIILLIIL("material_too_short_popup", c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        String creationId;
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("is_editor_pro", "1");
        String strLJIILIIL = "";
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (videoPublishEditModel == null || (str2 = videoPublishEditModel.mShootWay) == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_way", str2);
        if (videoPublishEditModel != null) {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        }
        c0lab.LJ("content_source", strLJIILIIL);
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("ep_more_options_panel_click", c0lab.LIZ);
    }

    public static final void LJJLIIIJLJLI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("reduce_noise_apply", c0labLJFF.LIZ);
    }

    public static final void LJJLIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LIZIZ(c0e48.getPlayer().qq(), "duration");
        C20684815ws.LJIILLIIL("save_editor_pro_long_video_toast", c0labLJFF.LIZ);
    }

    public static final void LJLIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C20684815ws.LJIILLIIL("video_reverse_cutout_pop_show", LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1)).LIZ);
    }

    public static final void LJLJI(String str, String str2) {
        C0E5L.LIZ.put(str, str2);
    }

    public static final void LJJIII(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("adjust_guidance_show", c0labLJFF.LIZ);
    }

    public static final void LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("panel", str);
        c0labLJFF.LIZ(1, "is_editor_pro");
        C20684815ws.LJIILLIIL("caption_text_style_entrance_show", c0labLJFF.LIZ);
    }

    public static final void LJJIJIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "play";
        } else {
            str = "pause";
        }
        c0labLJFF.LJ("to_status", str);
        C20684815ws.LJIILLIIL("click_edit_play", c0labLJFF.LIZ);
    }

    public static final void LJJIJL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        NLEResType resourceType;
        String str;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null && (mainSegment = nLETrackSlotLLLLLLIL.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
            resourceType = resource.getResourceType();
        } else {
            resourceType = null;
        }
        NLEResType nLEResType = NLEResType.VIDEO;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (resourceType == nLEResType) {
            str = "1";
        } else if (resourceType == NLEResType.IMAGE) {
            str = "2";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str2 = "1";
        }
        c0labLJFF.LJ("is_from_create_template", str2);
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("select_material_type", str);
        C20684815ws.LJIILLIIL("adjust_preview_click", c0labLJFF.LIZ);
    }

    public static final void LJJIJLIJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        String extra;
        NLETrack nLETrackLIZLLL;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        if (c0e48 == null || (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
            extra = "";
        }
        c0labLJFF.LJ("music_id", extra);
        c0labLJFF.LJ("click_function", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("audio_editing_panel_click", c0labLJFF.LIZ);
    }

    public static final void LJJIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String extra;
        String str;
        NLETrack nLETrackLIZLLL;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        if (c0e48 == null || (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
            extra = "";
        }
        c0labLJFF.LJ("music_id", extra);
        c0labLJFF.LJ("click_function", "reduce_noise");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c0labLJFF.LJ("reduce_noise_switch", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("audio_editing_panel_click", c0labLJFF.LIZ);
    }

    public static final void LJJJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        String str2 = "1";
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_from_create_template", str);
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("level", str2);
        C20684815ws.LJIILLIIL("click_smart_trim", c0labLJFF.LIZ);
    }

    public static final void LJJJJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("click_result", "");
        c0labLJFF.LJ("error_type", str);
        C20684815ws.LJIILLIIL("create_template_error_popup_click", c0labLJFF.LIZ);
    }

    public static final void LJJJJIZL(EnumC375190EnN enumC375190EnN, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        long jQq;
        Pair<Integer, Integer> pair;
        int i = C375060EnA.LIZ[enumC375190EnN.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str = "free";
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "4:3";
                }
            } else {
                str = "16:9";
            }
        } else {
            str = "9:16";
        }
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            jQq = c0e48.getPlayer().qq();
        } else {
            jQq = -1;
        }
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        } else {
            pair = new Pair<>(-1, -1);
        }
        C0CNO.LIZ(C15O7.LJI, new C355630Dwv(videoPublishEditModel, c0e48, jQq, pair, str));
    }

    public static final void LJJJJLL(ShortVideoContext shortVideoContext, String str, Integer num) {
        C0LAB c0lab = new C0LAB();
        if (shortVideoContext != null) {
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        }
        if (str != null) {
            c0lab.LJ("eoy_entrance_type", str);
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "pre_replay_status");
        }
        C20684815ws.LJIILLIIL("eoy_entrance_click", c0lab.LIZ);
    }

    public static final void LJJJJZ(ShortVideoContext shortVideoContext, String str, Integer num) {
        C0LAB c0lab = new C0LAB();
        if (shortVideoContext != null) {
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        }
        if (str != null) {
            c0lab.LJ("eoy_entrance_type", str);
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "pre_replay_status");
        }
        C20684815ws.LJIILLIIL("eoy_entrance_show", c0lab.LIZ);
    }

    public static final void LJJJZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
        c0labLIZIZ.LJ("action_type", str);
        c0labLIZIZ.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLIZIZ.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLIZIZ.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLIZIZ.LIZ(1, "is_editor_pro");
        c0labLIZIZ.LJ("content_type", str2);
        C20684815ws.LJIILLIIL("exit_screen_preview", c0labLIZIZ.LIZ);
    }

    public static final void LJJLI(int i, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "video_zoom_guidance_show";
                }
            } else {
                str = "video_scroll_guidance_show";
            }
        } else {
            str = "keyframe_add_button_guidance_show";
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        C363500EMy.LIZ.getClass();
        c0labLJFF.LIZ(C363500EMy.LJIIJ(videoPublishEditModel) ? 1 : 0, "is_from_create_template");
        C20684815ws.LJIILLIIL(str, c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("action_type", str);
        c0labLJFF.LJ("enter_from", "video_edit_page");
        C20684815ws.LJIILLIIL("photo_magic_guidance", c0labLJFF.LIZ);
    }

    public static final void LJJLJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        String str2 = "1";
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_changed_video_length", str2);
        c0labLJFF.LJ("trim_status", "success");
        C20684815ws.LJIILLIIL("save_smart_trim", c0labLJFF.LIZ);
    }

    public static final void LJJLJLI(long j, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        if (C0E5N.LIZ()) {
            C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
            c0labLJFF.LJFF("is_editor_pro", true);
            c0labLJFF.LIZ(videoPublishEditModel.getVideoLength(), "video_duration");
            c0labLJFF.LIZIZ(j, "duration");
            c0labLJFF.LJ("api_type", "ep_smart_trim");
            C20684815ws.LJIILLIIL("tool_performance_ep_apply_total", c0labLJFF.LIZ);
        }
    }

    public static final void LJLIIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "cancel";
        } else {
            str = "confirm";
        }
        c0labLJFF.LJ("action", str);
        C20684815ws.LJIILLIIL("video_reverse_cutout_pop_click", c0labLJFF.LIZ);
    }

    public static final void LJLIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "zoom_in";
        } else {
            str = "zoom_out";
        }
        c0labLJFF.LJ("action_type", str);
        C20684815ws.LJIILLIIL("zoom_time_line", c0labLJFF.LIZ);
    }

    public static final void LJLILLLLZI(NLETrackSlot nLETrackSlot, String str, String str2) {
        String strName;
        NLEResType type;
        ConcurrentHashMap<String, String> concurrentHashMap = C0E5L.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (type = mainSegment.getType()) != null) {
            strName = type.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append(str);
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static final C0LAB LJFF(long j, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Pair pair) {
        String musicOriginWithCheck;
        if (c0e48 == null) {
            return new C0LAB();
        }
        int i = 0;
        if (((Number) pair.getFirst()).intValue() == -1 && ((Number) pair.getSecond()).intValue() == -1) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (j == -1) {
            j = c0e48.getPlayer().qq();
        }
        if (C298260Bma.LIZ()) {
            musicOriginWithCheck = C1412490mrP.LIZIZ(videoPublishEditModel);
        } else {
            musicOriginWithCheck = videoPublishEditModel.getMusicOriginWithCheck();
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZIZ(j, "creation_duration");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0lab.LJ("prop_list", stickers);
        c0lab.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0lab.LJ("music_selected_from", musicOriginWithCheck);
        if (iIntValue + iIntValue2 > 1) {
            i = 1;
        }
        c0lab.LIZ(i, "is_multi_content");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LJ("is_editor_pro", "1");
        c0lab.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        c0lab.LIZ(videoPublishEditModel.getEditorProModel().getFromPhotoCanvas() ? 1 : 0, "is_from_photo_canvas");
        c0lab.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            c0lab.LJ("draft_way", "general_draft_list");
        } else {
            c0lab.LJ("draft_way", "");
        }
        if (!C123100dR.LIZ(C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel))) {
            return c0lab;
        }
        c0lab.LJ("ep_anchor_type", C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel));
        return c0lab;
    }

    public static final void LJJIIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z, int i) {
        String str;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("level", String.valueOf(i));
        C20684815ws.LJIILLIIL("click_adjust_entrance", c0labLJFF.LIZ);
    }

    public static final void LJJIIZI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, long j, boolean z) {
        String str;
        if (nLEModel != null) {
            C0LAB c0labLIZ = C1402550mbN.LIZ(j, nLEModel, videoPublishEditModel);
            if (z) {
                str = "";
            } else {
                str = "other";
            }
            c0labLIZ.LJ("action_type", str);
            C20684815ws.LJIILLIIL("click_video_trim_cancel", c0labLIZ.LIZ);
        }
    }

    public static final void LJJIJ(VideoPublishEditModel videoPublishEditModel, String str, boolean z, boolean z2) {
        String str2;
        C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
        c0labLIZIZ.LJ("panel_type", str);
        if (z) {
            str2 = "click_x";
        } else {
            str2 = "other";
        }
        c0labLIZIZ.LJ("action_type", str2);
        c0labLIZIZ.LIZ(z2 ? 1 : 0, "is_editor_pro");
        c0labLIZIZ.LIZ(1, "is_multi_track");
        C20684815ws.LJIILLIIL("click_close_panel", c0labLIZIZ.LIZ);
    }

    public static final void LJJIJIIJI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Boolean bool, String str) {
        String str2;
        InitialMobParams initialMobParams = videoPublishEditModel.creativeModel.initialModel.mobParams;
        String str3 = null;
        if (initialMobParams != null) {
            str2 = initialMobParams.enterType;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            str3 = str2;
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LIZ(1, "is_multi_track");
        c0labLJFF.LJ("enter_type", str3);
        c0labLJFF.LJ("effect_entrance_position", videoPublishEditModel.creativeModel.effectEntrancePosition);
        if (C350660Dou.LIZJ()) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                c0labLJFF.LJ("is_video_animation", "1");
            } else {
                c0labLJFF.LJ("is_video_animation", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (str.length() > 0) {
            c0labLJFF.LJ("enter_way", str);
        }
        C20684815ws.LJIILLIIL("click_effect_entrance", c0labLJFF.LIZ);
    }

    public static final void LJJIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z, boolean z2) {
        String str;
        String strLJIL = LJIL(c0e48);
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("track_type", strLJIL);
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LIZ(LJJII(c0e48) ? 1 : 0, "is_editorpro_keyframe");
        c0labLJFF.LIZ(1, "is_multi_track");
        String str2 = "1";
        c0labLJFF.LJ("is_editor_pro", "1");
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_pip", str2);
        if (z2) {
            str = "on";
        } else {
            str = "off";
        }
        c0labLJFF.LJ("reduce_noise_switch", str);
        c0labLJFF.LJ("tab_name", "reduce_noise");
        C20684815ws.LJIILLIIL("click_track_option", c0labLJFF.LIZ);
    }

    public static final void LJJJIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z, boolean z2) {
        String str;
        String str2;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "undo";
        } else {
            str = "redo";
        }
        c0labLJFF.LJ("type", str);
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_editorpro_curve_speed", str2);
        C20684815ws.LJIILLIIL("click_edit_recall", c0labLJFF.LIZ);
    }

    public static final void LJJJJJ(EnumC375190EnN enumC375190EnN, boolean z, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        long jQq;
        Pair<Integer, Integer> pair;
        int i = C375060EnA.LIZ[enumC375190EnN.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str = "free";
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "4:3";
                }
            } else {
                str = "16:9";
            }
        } else {
            str = "9:16";
        }
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            jQq = c0e48.getPlayer().qq();
        } else {
            jQq = -1;
        }
        if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        } else {
            pair = new Pair<>(-1, -1);
        }
        C0CNO.LIZ(C15O7.LJI, new C355620Dwu(videoPublishEditModel, c0e48, jQq, pair, str, z));
    }

    public static final void LJJJJLI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z, boolean z2) {
        String extra;
        String str;
        String str2;
        NLETrack nLETrackLIZLLL;
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        if (c0e48 == null || (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
            extra = "";
        }
        c0labLJFF.LJ("music_id", extra);
        c0labLJFF.LJ("is_editor_pro", "1");
        if (z) {
            str = "settings";
        } else {
            str = "inapp";
        }
        c0labLJFF.LJ("grant_type", str);
        if (z2) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        c0labLJFF.LJ("click_result", str2);
        C20684815ws.LJIILLIIL("dub_access_granted", c0labLJFF.LIZ);
    }

    public static final void LJJLL(String str, long j, int i, Integer num) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        if (i == 1) {
            if (num != null) {
                c0lab.LIZ(num.intValue(), "error_code");
                c0lab.LJ("error_domain", str);
            }
        } else if (i == 2) {
            c0lab.LJ("error_domain", str);
        }
        C20684815ws.LJIILLIIL("smarttrim_success_rate", c0lab.LIZ);
    }

    public static final void LJJIIJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2, String str3) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("from_location", str);
        c0labLJFF.LJ("track_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c0labLJFF.LJ("music_id", str3);
        C20684815ws.LJIILLIIL("back_to_editor_pro", c0labLJFF.LIZ);
    }

    public static final void LJJJJZI(long j, long j2, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String str2;
        String string;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
            c0labLJFF.LJ("track_type", LJIL(c0e48));
            if (C350870DpF.LJI(c0e48).getMainTrack().getSlots().size() > 1) {
                str2 = "multi_single";
            } else {
                str2 = "single";
            }
            c0labLJFF.LJ("trim_type", str2);
            if (C351220Dpo.LLLILZ(c0e48)) {
                string = "pip";
            } else {
                NLETrack mainTrack = C350870DpF.LJI(c0e48).getMainTrack();
                if (mainTrack == null || (string = Integer.valueOf(mainTrack.getSlotIndex(nLETrackSlotLLLLLLIL)).toString()) == null) {
                    string = "-1";
                }
            }
            c0labLJFF.LJ("order", string);
            c0labLJFF.LIZIZ(j, "from_length");
            c0labLJFF.LIZIZ(j2, "to_length");
            c0labLJFF.LJ("action_type", str);
            c0labLJFF.LIZ(LJJII(c0e48) ? 1 : 0, "is_editorpro_keyframe");
            C20684815ws.LJIILLIIL("edit_video_length", c0labLJFF.LIZ);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJJLIIIJLLLLLLLZ(List<String> list, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, Pair<Integer, Integer> pair) {
        VecNLETrackSPtr tracks;
        VecNLETrackSlotSPtr sortedSlots;
        NLESegment mainSegment;
        String extra;
        C0LAB c0labLJFF = LJFF(j, videoPublishEditModel, c0e48, pair);
        c0labLJFF.LJ("music_id", videoPublishEditModel.getMusicId());
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        if (nLEModelLJI.getMainTrack() != null && (tracks = nLEModelLJI.getTracks()) != null && !tracks.isEmpty()) {
            if (!C351220Dpo.LJIL(nLEModelLJI).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                VecNLETrackSPtr tracks2 = nLEModelLJI.getTracks();
                if (tracks2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrack nLETrack : tracks2) {
                        NLETrack nLETrack2 = nLETrack;
                        if (nLETrack2.getEnable() && C351220Dpo.LLJJIII(nLETrack2)) {
                            arrayList2.add(nLETrack);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                        if (slots != null) {
                            for (NLETrackSlot nLETrackSlot : slots) {
                                if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && mainSegment.hasExtra("nleExtraEffectKey")) {
                                    NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                                    if (mainSegment2 == null || (extra = mainSegment2.getExtra("nleExtraEffectKey")) == null) {
                                        extra = "";
                                    }
                                    arrayList.add(extra);
                                }
                            }
                        }
                    }
                }
                c0labLJFF.LJ("effect_id", C351360Dq2.LIZ(arrayList));
            }
            if (!((ArrayList) C351220Dpo.LJLIL(nLEModelLJI)).isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((ArrayList) C351220Dpo.LJLIL(nLEModelLJI)).iterator();
                while (it3.hasNext()) {
                    VecNLETrackSlotSPtr slots2 = ((NLETrack) it3.next()).getSlots();
                    if (slots2 != null) {
                        for (NLETrackSlot nLETrackSlot2 : slots2) {
                            if (nLETrackSlot2 != null && nLETrackSlot2.hasExtra("ep_audio_music_id")) {
                                String extra2 = nLETrackSlot2.getExtra("ep_audio_music_id");
                                if (extra2 == null) {
                                    extra2 = "";
                                }
                                arrayList3.add(extra2);
                            }
                        }
                    }
                }
                c0labLJFF.LJ("sound_effect_id", C351360Dq2.LIZ(arrayList3));
            }
            ArrayList arrayList4 = new ArrayList();
            NLETrack mainTrack = nLEModelLJI.getMainTrack();
            if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                for (NLETrackSlot nLETrackSlot3 : sortedSlots) {
                    C354260Dui.LIZ.getClass();
                    for (String str : C354260Dui.LJII(nLETrackSlot3)) {
                        if (!a0.LJJJIL(str)) {
                            arrayList4.add(str);
                        }
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                c0labLJFF.LJ("magic_id", C351360Dq2.LIZ(arrayList4));
                c0labLJFF.LJ("magic_res_id", C351370Dq3.LIZJ(C351370Dq3.LIZIZ(nLEModelLJI, AFwS234S0000000_5.get$arr$(504))));
            }
            c0labLJFF.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
            c0labLJFF.LIZ(u4.LJJIZ(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab_captions");
            C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLJFF);
            C0MJO.LIZ(c0labLJFF, videoPublishEditModel);
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str2 : list) {
                switch (str2.hashCode()) {
                    case -1381970834:
                        if (str2.equals("bottom_item_root_ai_create")) {
                            str2 = "ai_create";
                        }
                        break;
                    case -1273019357:
                        if (str2.equals("bottom_item_root_adjust_filter")) {
                            str2 = "adjust_filter";
                        }
                        break;
                    case -934571088:
                        if (str2.equals("bottom_item_root_sound_sync")) {
                            str2 = "sound_sync";
                        }
                        break;
                    case -537412131:
                        if (str2.equals("bottom_item_root_filter")) {
                            str2 = "filter";
                        }
                        break;
                    case -515611784:
                        if (str2.equals("bottom_item_root_sticker")) {
                            str2 = "sticker";
                        }
                        break;
                    case -459287747:
                        if (str2.equals("bottom_item_root_effects")) {
                            str2 = "effect";
                        }
                        break;
                    case -149662040:
                        if (str2.equals("bottom_item_root_magic")) {
                            str2 = "magic";
                        }
                        break;
                    case -143690230:
                        if (str2.equals("bottom_item_root_sound")) {
                            str2 = "sound";
                        }
                        break;
                    case 283352715:
                        if (str2.equals("bottom_item_root_overlay")) {
                            str2 = "overlay";
                        }
                        break;
                    case 1927214113:
                        if (str2.equals("bottom_item_root_caption")) {
                            str2 = "caption";
                        }
                        break;
                    case 2073146799:
                        if (str2.equals("bottom_item_root_edit")) {
                            str2 = "edit";
                        }
                        break;
                    case 2073595090:
                        if (str2.equals("bottom_item_root_text")) {
                            str2 = "text";
                        }
                        break;
                }
                arrayList5.add(str2);
            }
            c0labLJFF.LJ("tab_name", C351360Dq2.LIZ(arrayList5));
            C20684815ws.LJIILLIIL("editorpro_panel_show", c0labLJFF.LIZ);
        }
    }

    public static final void LJJZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2, Boolean bool, Boolean bool2) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("tab_name", str);
        c0labLJFF.LJ("track_type", LJIL(c0e48));
        if (bool != null) {
            c0labLJFF.LIZ(bool.booleanValue() ? 1 : 0, "is_from_new_panel");
        }
        if (bool2 != null) {
            c0labLJFF.LIZ(bool2.booleanValue() ? 1 : 0, "level");
        }
        C20684815ws.LJIILLIIL(str2, c0labLJFF.LIZ);
    }

    public static void LJLI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, boolean z, int i, int i2) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLESegmentVideo nLESegmentVideoLIZ;
        NLEResourceAV aVFile;
        String str;
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && (nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlotLLLLLLIL)) != null && (aVFile = nLESegmentVideoLIZ.getAVFile()) != null) {
            C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_cancel", str);
            c0labLJFF.LIZIZ(j, "cost");
            c0labLJFF.LIZIZ(aVFile.getWidth(), "width");
            c0labLJFF.LIZIZ(aVFile.getHeight(), "height");
            c0labLJFF.LIZIZ(aVFile.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "resource_duration");
            c0labLJFF.LIZ(i, "error_code");
            C20684815ws.LJIILLIIL("ep_video_reverse_duration", c0labLJFF.LIZ);
        }
    }

    public static final void LJJJLIIL(VideoPublishEditModel videoPublishEditModel, String str, boolean z, NLEModel nLEModel, boolean z2, Boolean bool, boolean z3) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String clickFrom;
        String str7;
        String str8;
        String str9;
        NLEResType type;
        VecNLETrackSlotSPtr sortedSlots;
        C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
        String str10 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_from_text", str2);
        c0labLIZIZ.LJ("action_type", str);
        c0labLIZIZ.LJ("seek_count", nLEModel.getExtra("editor_pro_seek_count"));
        c0labLIZIZ.LIZIZ((nLEModel.getMeasuredEndTime() - nLEModel.getMeasuredStartTime()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "edit_timeline_total_duration");
        c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getCopyrightClaimShowing() ? 1 : 0, "is_copyright_claim");
        c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.SHORT_VIDEO.getScene())) ? 1 : 0, "is_short_video");
        c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.ECOMMERCE.getScene())) ? 1 : 0, "is_ecommerce_video");
        if (z2) {
            str3 = "slide";
        } else {
            str3 = "icon";
        }
        c0labLIZIZ.LJ("exit_method", str3);
        c0labLIZIZ.LJI(C1402900mbw.LIZ(videoPublishEditModel));
        c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.LONG_VIDEO.getScene())) ? 1 : 0, "is_long_video");
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        VecNLETrackSPtr sortedTracks = nLEModel.getSortedTracks();
        if (sortedTracks != null) {
            Iterator<NLETrack> it2 = sortedTracks.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().getSortedSlots());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                C354260Dui.LIZ.getClass();
                for (String str11 : C354260Dui.LJII(nLETrackSlot)) {
                    if (a0.LJJJIL(str11)) {
                        str11 = "null";
                    }
                    arrayList2.add(str11);
                }
            }
        }
        C351360Dq2.LIZ(arrayList2);
        long jLJIJI = LJIJI("add_video_material_duration") + 0;
        long jLJIJI2 = LJIJI("start_over_duration") + 0;
        long jLJIJI3 = LJIJI("caption_edit_all_duration");
        if (C351220Dpo.LJJJJZI(nLEModel) > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        NLEResType nLEResType = NLEResType.VIDEO;
        long jLJIJJLI = LJIJJLI(nLEResType, "edit_video_duration") + 0;
        long jLJIJJLI2 = LJIJJLI(nLEResType, "adjust_video_speed_duration") + 0;
        long jLJIJJLI3 = LJIJJLI(nLEResType, "adjust_video_curve_speed_duration") + 0;
        long jLJIJJLI4 = LJIJJLI(nLEResType, "adjust_video_volume_duration") + 0;
        long jLJIJJLI5 = LJIJJLI(nLEResType, "edit_crop_duration") + 0;
        long jLJIJJLI6 = LJIJJLI(nLEResType, "add_magic_duration") + 0;
        NLEResType nLEResType2 = NLEResType.AUDIO;
        long jLJIJJLI7 = LJIJJLI(nLEResType2, "edit_music_duration") + 0;
        long jLJIJJLI8 = LJIJJLI(nLEResType2, "add_music_material_duration") + 0;
        long jLJIJJLI9 = LJIJJLI(nLEResType2, "adjust_music_volume_duration") + 0;
        long jLJIJJLI10 = LJIJJLI(nLEResType2, "adjust_sound_duration") + 0;
        long jLJIJJLI11 = LJIJJLI(NLEResType.SOUND, "add_sound_effect_duration") + 0;
        NLEResType nLEResType3 = NLEResType.EFFECT;
        long jLJIJJLI12 = LJIJJLI(nLEResType3, "edit_effect_duration") + 0;
        long jLJIJJLI13 = LJIJJLI(nLEResType3, "add_effect_duration") + 0;
        NLEResType nLEResType4 = NLEResType.TEXT_STICKER;
        long jLJIJJLI14 = LJIJJLI(nLEResType4, "edit_text_duration") + 0;
        long jLJIJJLI15 = LJIJJLI(nLEResType4, "adjust_text_content_duration") + 0;
        long jLJIJJLI16 = LJIJJLI(nLEResType4, "edit_tts_duration") + 0;
        long jLJIJJLI17 = LJIJJLI(nLEResType4, "edit_captions_duration") + 0;
        long jLJIJI4 = LJIJI("add_captions_duration") + 0;
        int i = 0;
        int i2 = 0;
        for (NLETrackSlot nLETrackSlot2 : arrayList) {
            NLESegment mainSegment = nLETrackSlot2.getMainSegment();
            if (mainSegment != null && (type = mainSegment.getType()) != null) {
                int i3 = C348720Dlm.LIZ[type.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && C357660E0m.LJIIIZ(nLETrackSlot2)) {
                        i = 1;
                    }
                } else if (C351220Dpo.LJZI(nLETrackSlot2)) {
                    i2 = 1;
                }
            }
        }
        long jLJIJI5 = LJIJI("add_animation_duration") + 0;
        if (C350660Dou.LIZJ()) {
            jLJIJJLI13 += jLJIJI5;
        }
        long j = jLJIJJLI17 + jLJIJI3;
        c0labLIZIZ.LJ("edit_video_duration", String.valueOf(jLJIJJLI));
        c0labLIZIZ.LJ("adjust_video_speed_duration", String.valueOf(jLJIJJLI2));
        c0labLIZIZ.LJ("adjust_video_curve_speed_duration", String.valueOf(jLJIJJLI3));
        c0labLIZIZ.LJ("add_video_material_duration", String.valueOf(jLJIJI));
        c0labLIZIZ.LJ("adjust_video_volume_duration", String.valueOf(jLJIJJLI4));
        if (jLJIJJLI5 != 0) {
            c0labLIZIZ.LJ("edit_crop_duration", String.valueOf(jLJIJJLI5));
        }
        if (jLJIJJLI6 != 0) {
            c0labLIZIZ.LJ("add_magic_duration", String.valueOf(jLJIJJLI6));
        }
        c0labLIZIZ.LJ("start_over_duration", String.valueOf(jLJIJI2));
        c0labLIZIZ.LIZ(i2, "is_editor_pro_curve_speed_used");
        c0labLIZIZ.LJ("edit_music_duration", String.valueOf(jLJIJJLI7));
        c0labLIZIZ.LJ("add_music_material_duration", String.valueOf(jLJIJJLI8));
        c0labLIZIZ.LJ("add_sound_effect_duration", String.valueOf(jLJIJJLI11));
        c0labLIZIZ.LJ("adjust_music_volume_duration", String.valueOf(jLJIJJLI9));
        c0labLIZIZ.LJ("adjust_sound_duration", String.valueOf(jLJIJJLI10));
        c0labLIZIZ.LIZ(i, "is_editor_pro_beats_used");
        c0labLIZIZ.LJ("is_editor_pro_sticker", str4);
        c0labLIZIZ.LJ("edit_text_duration", String.valueOf(jLJIJJLI14));
        c0labLIZIZ.LJ("adjust_text_content_duration", String.valueOf(jLJIJJLI15));
        c0labLIZIZ.LJ("edit_tts_duration", String.valueOf(jLJIJJLI16));
        c0labLIZIZ.LJ("edit_captions_duration", String.valueOf(j));
        c0labLIZIZ.LJ("add_captions_duration", String.valueOf(jLJIJI4));
        c0labLIZIZ.LJ("edit_effect_duration", String.valueOf(jLJIJJLI12));
        c0labLIZIZ.LJ("add_effect_duration", String.valueOf(jLJIJJLI13));
        c0labLIZIZ.LJ("add_animation_duration", String.valueOf(jLJIJI5));
        LIZ(jLJIJJLI, "edit_video_duration_total");
        LIZ(jLJIJJLI2, "adjust_video_speed_duration_total");
        LIZ(jLJIJJLI3, "adjust_video_curve_speed_duration_total");
        LIZ(jLJIJI, "add_video_material_duration_total");
        LIZ(jLJIJJLI4, "adjust_video_volume_duration_total");
        LIZ(jLJIJJLI5, "edit_crop_duration_total");
        LIZ(jLJIJJLI6, "add_magic_duration_total");
        LIZ(jLJIJI2, "start_over_duration_total");
        LIZ(jLJIJJLI7, "edit_music_duration_total");
        LIZ(jLJIJJLI8, "add_music_material_duration_total");
        LIZ(jLJIJJLI11, "add_sound_effect_duration_total");
        LIZ(jLJIJJLI9, "adjust_music_volume_duration_total");
        LIZ(jLJIJJLI14, "edit_text_duration_total");
        LIZ(jLJIJJLI15, "adjust_text_content_duration_total");
        LIZ(jLJIJJLI16, "edit_tts_duration_total");
        LIZ(j, "edit_captions_duration_total");
        LIZ(jLJIJI4, "add_captions_duration_total");
        LIZ(jLJIJJLI12, "edit_effect_duration_total");
        LIZ(jLJIJJLI13, "add_effect_duration_total");
        long jLJIJI6 = LJIJI("exit_ep_time") - LJIJI("enter_editor_pro_time");
        c0labLIZIZ.LJ("editor_pro_use_duration", String.valueOf(jLJIJI6));
        LIZ(jLJIJI6, "editor_pro_use_duration_total");
        c0labLIZIZ.LJI(LJJL(nLEModel));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_from_create_template", str5);
        if (bool != null) {
            if (bool.booleanValue()) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLIZIZ.LJ("is_used_edit", str9);
        }
        if (Intrinsics.LJFF(str, "click_edit_save") && C0EI7.LIZIZ(videoPublishEditModel, nLEModel)) {
            c0labLIZIZ.LJ("is_editor_pro_ai_voice_used", "1");
        }
        c0labLIZIZ.LIZ(((ArrayList) C351220Dpo.LJJIJIIJIL(nLEModel)).size() + ((ArrayList) C351220Dpo.LJLI(nLEModel)).size(), "editpro_filter_cnt");
        C363500EMy.LIZ.getClass();
        int iLJFF = C363500EMy.LJFF(nLEModel);
        if (iLJFF > 0) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_editorpro_reduce_noise", str6);
        c0labLIZIZ.LIZ(iLJFF, "reduce_noise_used_cnt");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C351370Dq3.LIZ(nLEModel, linkedHashMap);
        c0labLIZIZ.LJI(linkedHashMap);
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLIZIZ);
        C0MJO.LIZ(c0labLIZIZ, videoPublishEditModel);
        c0labLIZIZ.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
        if (z3) {
            clickFrom = "ai_video_tool";
        } else {
            clickFrom = videoPublishEditModel.getEditorProModel().getClickFrom();
        }
        c0labLIZIZ.LJ("click_from", clickFrom);
        if (C357540E0a.LJJIFFI(nLEModel)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_editorpro_autoadjust", str7);
        if (C357540E0a.LJJIII(nLEModel)) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_editorpro_pip_video_animation", str8);
        if (C357540E0a.LJIIIZ(null, nLEModel, 1) <= 0) {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_use_video_animation", str10);
        C0ECD.LIZ(nLEModel, c0labLIZIZ);
        C20684815ws.LJIILLIIL("exit_video_trim", c0labLIZIZ.LIZ);
    }

    public static final void LJL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, String str, int i, int i2, long j2) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LIZIZ(j, "duration");
        c0labLJFF.LJ(Scene.SCENE_SERVICE, str);
        c0labLJFF.LIZ(i, "pic_cnt");
        c0labLJFF.LIZ(i2, "video_cnt");
        c0labLJFF.LIZIZ(j2, "total_import_duration");
        C20684815ws.LJIILLIIL("tool_performance_edit_pro_upload", c0labLJFF.LIZ);
    }

    public static void LJJJI(String str, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str2, boolean z, boolean z2, Boolean bool, Map map, int i) {
        String str3;
        String str4;
        String str5;
        AIGenerationType aIGenerationTypeLIZJ;
        Map mapLJ = map;
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 64) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        NLETrackSlot nLETrackSlotLLLLLLIL = null;
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 512) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        String strLJIL = LJIL(c0e48);
        if (!a0.LJJJIL(strLJIL)) {
            str2 = strLJIL;
        }
        String str6 = "1";
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z2) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_pip", str4);
        c0labLJFF.LJ("track_type", str2);
        c0labLJFF.LJ("tab_name", str);
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LJ("is_from_create_template", str3);
        c0labLJFF.LIZ(LJJII(c0e48) ? 1 : 0, "is_editorpro_keyframe");
        c0labLJFF.LIZ(1, "is_multi_track");
        c0labLJFF.LIZ(0, "is_cc");
        if (Intrinsics.LJFF(str, "modify_video")) {
            IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
            if (iAIPlaygroundMobServiceLIZ == null || (aIGenerationTypeLIZJ = iAIPlaygroundMobServiceLIZ.LIZJ(videoPublishEditModel)) == null) {
                aIGenerationTypeLIZJ = AIGenerationType.NONE;
            }
            if (aIGenerationTypeLIZJ != AIGenerationType.NONE) {
                if (c0e48 != null) {
                    nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                }
                if (C0E5J.LJFF(nLETrackSlotLLLLLLIL)) {
                    c0labLJFF.LJ("ai_video_tool_name", C380220EvU.LIZ(aIGenerationTypeLIZJ));
                }
            }
        }
        if (Intrinsics.LJFF(str, "delete") && Intrinsics.LJFF(str2, "video")) {
            c0labLJFF.LJFF("is_editor_pro_curve_speed_used", z);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_from_create_template", str5);
        }
        if (Intrinsics.LJFF(str, "lyrics")) {
            if (!C1444810nhX.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel)) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("music_lyrics_status", str6);
        }
        if (!mapLJ.isEmpty()) {
            c0labLJFF.LJI(mapLJ);
        }
        C20684815ws.LJIILLIIL("click_track_option", c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        C0LAB c0labLJFF = LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        String str7 = "1";
        c0labLJFF.LJ("is_editor_pro", "1");
        if (!z) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_pip", str7);
        c0labLJFF.LJ("error_type", str);
        c0labLJFF.LJ("tab_name", str2);
        c0labLJFF.LJ("magic_id", str3);
        c0labLJFF.LJ("magic_res_id", str4);
        c0labLJFF.LJ("magic_type", str5);
        c0labLJFF.LJ("tab_panel_name", str6);
        c0labLJFF.LJ("enter_from", "video_edit_page");
        C20684815ws.LJIILLIIL("magic_apply_fail_popup", c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJILLIZJL(int i, Integer num, String str, long j, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("feature", str5);
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("resource_id", str2);
        c0lab.LJ("resource_name", str3);
        c0lab.LJ("gameplay_type", str4);
        if (i == 1) {
            if (num != null) {
                c0lab.LIZ(num.intValue(), "error_code");
                c0lab.LJ("error_domain", str);
            }
        } else if (i == 2) {
            c0lab.LJ("error_domain", str);
        }
        if (Intrinsics.LJFF(str4, "combine") && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                    c0lab.LJ(entry.getKey(), entry.getValue());
                }
            }
        }
        C20684815ws.LJIILLIIL("magic_success_rate", c0lab.LIZ);
    }

    public static final void LJJLIIJ(VideoPublishEditModel videoPublishEditModel, long j, long j2, int i, boolean z, NLEModel nLEModel, String str, boolean z2, boolean z3) {
        int size;
        String str2;
        List<MultiEditVideoSegmentRecordData> list;
        if (videoPublishEditModel.getCurMultiEditVideoRecordData() != null) {
            LJJJLIIL(videoPublishEditModel, "click_edit_save", false, nLEModel, z2, Boolean.valueOf(z), z3);
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            int size2 = size + videoPublishEditModel.getEditorProModel().getPipResourcePaths().size();
            C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
            c0labLIZIZ.LIZIZ(j2, "from_video_length");
            c0labLIZIZ.LIZIZ(j, "to_video_length");
            c0labLIZIZ.LIZ(i, "from_video_segments");
            c0labLIZIZ.LIZ(size2, "to_video_segments");
            c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getCopyrightClaimShowing() ? 1 : 0, "is_copyright_claim");
            c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.SHORT_VIDEO.getScene())) ? 1 : 0, "is_short_video");
            c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.ECOMMERCE.getScene())) ? 1 : 0, "is_ecommerce_video");
            c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.LONG_VIDEO.getScene())) ? 1 : 0, "is_long_video");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLIZIZ.LJ("is_used_edit", str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C351370Dq3.LIZ(nLEModel, linkedHashMap);
            c0labLIZIZ.LJI(linkedHashMap);
            c0labLIZIZ.LIZ(1, "is_editor_pro");
            if (str != null) {
                c0labLIZIZ.LJ("content_type", str);
            }
            C20684815ws.LJIILLIIL("save_video_trim", c0labLIZIZ.LIZ);
        }
    }
}
