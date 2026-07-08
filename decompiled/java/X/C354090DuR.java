package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.INLEMattingListener;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.keva.Keva;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS34S1101000_5;
import kotlin.jvm.internal.AwS40S0102000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS90S1000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354090DuR {
    public static C354100DuS LIZIZ;
    public static final CopyOnWriteArraySet<InterfaceC354120DuU> LIZ = new CopyOnWriteArraySet<>();
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static final CopyOnWriteArraySet<String> LJI = new CopyOnWriteArraySet<>();
    public static final Keva LJII = Keva.getRepo("ep_video_cutout_repo");
    public static final Map<String, Long> LJIIIIZZ = new LinkedHashMap();
    public static final Map<String, Float> LJIIIZ = new LinkedHashMap();
    public static C354110DuT LJIIJ = new C354110DuT(null, 31);
    public static final HashMap<String, C354110DuT> LJIIJJI = new HashMap<>();
    public static final Map<String, String> LJIIL = new LinkedHashMap();
    public static final Map<String, String> LJIILIIL = new LinkedHashMap();

    public static boolean LJIIJJI() {
        return C2113008Po.LIZIZ(LIZLLL) && C2113008Po.LIZIZ(LIZJ);
    }

    public static C354110DuT LIZIZ(String str) {
        String str2;
        HashMap<String, C354110DuT> map = LJIIJJI;
        String str3 = "default";
        if (str == null) {
            str2 = "default";
        } else {
            str2 = str;
        }
        if (!map.containsKey(str2)) {
            if (str != null) {
                str3 = str;
            }
            map.put(str3, new C354110DuT(str, 15));
        }
        return map.getOrDefault(str, new C354110DuT(str, 15));
    }

    public static void LIZJ(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                LIZJ(file2);
            }
            C08QA.LJIIZILJ(file);
            return;
        }
        file.delete();
    }

    public static void LIZLLL(C0E48 c0e48) {
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((NLETrackSlot) obj).getAIMatting() != null) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(arrayList3, (List<C349800DnW>) 1716);
            if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.FALSE)).booleanValue()) {
                awS549S0100000_5.invoke();
            } else {
                C1524705y1.LIZ(new AwS549S0100000_5(awS549S0100000_5, 1715));
            }
        }
    }

    public static INLEMediaSession LJIIIIZZ(C0E48 c0e48) {
        if (c0e48 != null && c0e48.We()) {
            return c0e48.f1();
        }
        return null;
    }

    public static List LJIIIZ(C0E48 c0e48) {
        INLEMattingRuntime mattingApi;
        VecString runningTasks;
        INLEMediaSession iNLEMediaSessionLJIIIIZZ = LJIIIIZZ(c0e48);
        if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null && (runningTasks = mattingApi.getRunningTasks()) != null) {
            return runningTasks;
        }
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0DuS] */
    public static void LJIIJ(final C0E48 c0e48) {
        INLEMattingRuntime mattingApi;
        INLEMattingRuntime mattingApi2;
        INLEMattingRuntime mattingApi3;
        if (LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MattingLifecycle - removeMattingListener(");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(')');
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
            INLEMediaSession iNLEMediaSessionLJIIIIZZ = LJIIIIZZ(c0e48);
            if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi3 = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null) {
                mattingApi3.removeMattingListener();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MattingLifecycle - setMattingListener(");
            sbLIZ2.append(LIZIZ);
            sbLIZ2.append(')');
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ2));
            INLEMediaSession iNLEMediaSessionLJIIIIZZ2 = LJIIIIZZ(c0e48);
            if (iNLEMediaSessionLJIIIIZZ2 != null && (mattingApi2 = iNLEMediaSessionLJIIIIZZ2.getMattingApi()) != null) {
                mattingApi2.setMattingListener(LIZIZ);
                return;
            }
            return;
        }
        LIZIZ = new INLEMattingListener() { // from class: X.0DuS
            public long LIZ;
            public int LIZIZ = -1;

            /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onMattingStartedCallback() {
                /*
                    Method dump skipped, instruction units count: 431
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C354100DuS.onMattingStartedCallback():void");
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final boolean shouldInterceptMatting(NLETrackSlot nLETrackSlot) {
                return false;
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingAddedCallback(String str) {
                long currentPosition;
                INLEPlayer playerApi;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MattingLifecycle - onMattingAddedCallback slotUUID=");
                sbLIZ3.append(str);
                sbLIZ3.append("  mattingType = ");
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                sbLIZ3.append(C354090DuR.LJII(c0e48, str));
                C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
                INLEMediaSession iNLEMediaSessionLJIIIIZZ3 = C354090DuR.LJIIIIZZ(c0e48);
                if (iNLEMediaSessionLJIIIIZZ3 != null && (playerApi = iNLEMediaSessionLJIIIIZZ3.getPlayerApi()) != null) {
                    currentPosition = playerApi.getCurrentPosition();
                } else {
                    currentPosition = 0;
                }
                this.LIZ = currentPosition;
                C0E48 c0e482 = c0e48;
                if (c0e482 != null) {
                    C354090DuR.LIZLLL(c0e482);
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingRemovedCallback(String str) {
                EnumC356080Dxe enumC356080Dxe;
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                int iLJII = C354090DuR.LJII(c0e48, str);
                C354110DuT c354110DuTLIZIZ = C354090DuR.LIZIZ(str);
                int i = c354110DuTLIZIZ.LIZIZ;
                if (iLJII == i) {
                    enumC356080Dxe = EnumC356080Dxe.REMOVED;
                } else {
                    enumC356080Dxe = c354110DuTLIZIZ.LIZ;
                }
                c354110DuTLIZIZ.LIZ = enumC356080Dxe;
                if (iLJII == i) {
                    i = -1;
                }
                c354110DuTLIZIZ.LIZIZ = i;
                this.LIZIZ = 0;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MattingLifecycle - onMattingRemovedCallback slotUUID=");
                sbLIZ3.append(str);
                sbLIZ3.append(" mattingType = ");
                sbLIZ3.append(C354090DuR.LJII(c0e48, str));
                C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
                C19719512Dh.LIZJ(C354090DuR.LJIIIZ).remove(str);
                C354090DuR.LJI.remove(str);
                String strValueOf = String.valueOf(str);
                Keva keva = C354090DuR.LJII;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("key_video_cutout_progress_");
                sbLIZ4.append(strValueOf);
                keva.storeFloat(C2188811AlT.LIZIZ(sbLIZ4), 0.0f);
                C1524705y1.LIZJ(new AwS90S1000000_5(str, 4));
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onMattingDoneCallback(float r12, java.lang.String r13) {
                /*
                    Method dump skipped, instruction units count: 358
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C354100DuS.onMattingDoneCallback(float, java.lang.String):void");
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingErrorCallback(int i, String str) {
                C354110DuT c354110DuTLIZIZ = C354090DuR.LIZIZ(str);
                C0E48 c0e482 = c0e48;
                c354110DuTLIZIZ.LIZ = EnumC356080Dxe.ERROR;
                c354110DuTLIZIZ.LIZIZ = C354090DuR.LJII(c0e482, str);
                C354090DuR.LJI.remove(str);
                C1524705y1.LIZJ(new AwS34S1101000_5(i, str, c0e48, 3));
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingClipDoneCallback(String str, float f, float f2) {
                INLEPlayer playerApi;
                NLEPlayerState nLEPlayerStateState;
                NLEPlayerState nLEPlayerStateState2;
                long jLongValue;
                int i;
                INLEMediaSession iNLEMediaSessionLJIIIIZZ3;
                INLEPlayer playerApi2;
                C354090DuR.LIZIZ(str).LIZ = EnumC356080Dxe.CLIP_DONE;
                INLEMediaSession iNLEMediaSessionLJIIIIZZ4 = C354090DuR.LJIIIIZZ(c0e48);
                NLEPlayerState nLEPlayerStateState3 = null;
                if (iNLEMediaSessionLJIIIIZZ4 != null) {
                    playerApi = iNLEMediaSessionLJIIIIZZ4.getPlayerApi();
                } else {
                    playerApi = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MattingLifecycle - onMattingClipDoneCallback  status = ");
                if (playerApi != null) {
                    nLEPlayerStateState = playerApi.state();
                } else {
                    nLEPlayerStateState = null;
                }
                sbLIZ3.append(nLEPlayerStateState);
                sbLIZ3.append(", avg_score：");
                sbLIZ3.append(f2);
                sbLIZ3.append(" slotUUID = ");
                sbLIZ3.append(str);
                C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
                if (playerApi != null) {
                    nLEPlayerStateState2 = playerApi.state();
                } else {
                    nLEPlayerStateState2 = null;
                }
                if (nLEPlayerStateState2 != NLEPlayerState.SEEKING) {
                    if (playerApi != null) {
                        nLEPlayerStateState3 = playerApi.state();
                    }
                    if (nLEPlayerStateState3 != NLEPlayerState.STARTED && (((i = C354090DuR.LJIIJ.LIZIZ) == NLEAIMattingType.TYPE_AI.swigValue() || i == NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue()) && (iNLEMediaSessionLJIIIIZZ3 = C354090DuR.LJIIIIZZ(c0e48)) != null && (playerApi2 = iNLEMediaSessionLJIIIIZZ3.getPlayerApi()) != null)) {
                        playerApi2.seekTime(this.LIZ);
                    }
                }
                if (str != null) {
                    C0E48 c0e482 = c0e48;
                    long jLJ = C354090DuR.LJ(c0e482, str);
                    Map<String, Long> map = C354090DuR.LJIIIIZZ;
                    Long l = (Long) ((LinkedHashMap) map).get(C354090DuR.LJFF(c0e482, str));
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jLJ == 0 && jLongValue > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("cyning-cost ");
                        sbLIZ4.append(jCurrentTimeMillis);
                        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ4));
                        C354090DuR.LIZ(str, jCurrentTimeMillis, c0e482);
                        map.put(C354090DuR.LJFF(c0e482, str), 0L);
                    }
                    Keva keva = C354090DuR.LJII;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("key_video_cutout_progress_");
                    sbLIZ5.append(str);
                    keva.storeFloat(C2188811AlT.LIZIZ(sbLIZ5), 1.0f);
                    keva.storeBoolean(C354090DuR.LJI(c0e482, str), true);
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingErrorCallback(int i, int i2, float f) {
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                C354090DuR.LJIIJ.LIZ = EnumC356080Dxe.ERROR;
                C1524705y1.LIZJ(new AwS40S0102000_5(i, i2, c0e48, 1));
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            public final void onMattingInteractiveMaskCallback(String str, long j, String str2) {
                C0E48 c0e482;
                NLETrackSlot nLETrackSlotLJL;
                NLENode nLENodeDeepClone;
                NLESegmentAIMatting segment;
                C354090DuR.LIZIZ(str).LIZ = EnumC356080Dxe.INTERACTIVE_MASK;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MattingLifecycle - onMattingInteractiveMaskCallback slotUUID=");
                sbLIZ3.append(str);
                sbLIZ3.append(" pts=");
                sbLIZ3.append(j);
                sbLIZ3.append(" mask=");
                sbLIZ3.append(str2);
                sbLIZ3.append("  mattingType = ");
                sbLIZ3.append(C354090DuR.LJII(c0e48, str));
                C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
                if (str != null && (c0e482 = c0e48) != null && (nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e482), str)) != null) {
                    NLEAIMatting aIMatting = nLETrackSlotLJL.getAIMatting();
                    if (aIMatting != null && (segment = aIMatting.getSegment()) != null) {
                        nLENodeDeepClone = segment.deepClone(false);
                    } else {
                        nLENodeDeepClone = null;
                    }
                    NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(nLENodeDeepClone);
                    if (nLESegmentAIMattingDynamicCast != null) {
                        nLESegmentAIMattingDynamicCast.setMattingType(NLEAIMattingType.TYPE_CUSTOM.swigValue());
                        nLESegmentAIMattingDynamicCast.getCustomMattingParam().setRestoreMaskPts(j);
                        nLESegmentAIMattingDynamicCast.getCustomMattingParam().setCustomPath(str2);
                        NLEAIMatting nLEAIMatting = new NLEAIMatting();
                        nLEAIMatting.setSegment(nLESegmentAIMattingDynamicCast);
                        nLETrackSlotLJL.setAIMatting(nLEAIMatting);
                        C1524705y1.LIZJ(new AwS90S1000000_5(str, str2, 3));
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0180 A[PHI: r10
              0x0180: PHI (r10v4 float) = (r10v3 float), (r10v5 float) binds: [B:64:0x0159, B:73:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onMattingProgressCallback(java.lang.String r14, float r15, float r16, boolean r17) {
                /*
                    Method dump skipped, instruction units count: 476
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C354100DuS.onMattingProgressCallback(java.lang.String, float, float, boolean):void");
            }
        };
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MattingLifecycle - setMattingListener(");
        sbLIZ3.append(LIZIZ);
        sbLIZ3.append(')');
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
        INLEMediaSession iNLEMediaSessionLJIIIIZZ3 = LJIIIIZZ(c0e48);
        if (iNLEMediaSessionLJIIIIZZ3 != null && (mattingApi = iNLEMediaSessionLJIIIIZZ3.getMattingApi()) != null) {
            mattingApi.setMattingListener(LIZIZ);
        }
    }

    public static void LJIIL(C0E48 c0e48) {
        INLEMattingRuntime mattingApi;
        NLEModel model;
        VecNLETrackSPtr tracks;
        String workSpace;
        LIZ.clear();
        if (!LJI.isEmpty()) {
            NLEEditor nLEEditorLJI = null;
            if (c0e48 != null) {
                NLEEditor nLEEditorLJI2 = c0e48.LLFII().LJI();
                if (nLEEditorLJI2 != null && (model = nLEEditorLJI2.getModel()) != null && (tracks = model.getTracks()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                    }
                    ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (LJI.contains(((NLENode) obj).getUUID())) {
                            arrayList2.add(obj);
                        }
                    }
                    for (NLETrackSlot nLETrackSlot : arrayList2) {
                        if (nLETrackSlot.getAIMatting() != null && (workSpace = nLETrackSlot.getAIMatting().getSegment().getWorkSpace()) != null && !a0.LJJJIL(workSpace) && new C0VSJ(workSpace).exists()) {
                            C1524705y1.LIZ(new AwS90S1000000_5(workSpace, 5));
                        }
                        nLETrackSlot.setAIMatting(null);
                    }
                }
                nLEEditorLJI = c0e48.LLFII().LJI();
            }
            C350410DoV.LIZ(nLEEditorLJI, true, false);
            LJI.clear();
        }
        INLEMediaSession iNLEMediaSessionLJIIIIZZ = LJIIIIZZ(c0e48);
        if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null) {
            mattingApi.removeAllTask();
        }
    }

    public static void LJIILIIL(C0E48 c0e48) {
        LJIIJ(c0e48);
        LIZ.clear();
        Keva keva = LJII;
        String string = keva.getString("ep_video_cutout_res_inner_path", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cachePath = ");
        sbLIZ.append(string);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (string != null && !a0.LJJJIL(string) && new C0VSJ(string).exists()) {
            LIZJ = string;
        }
        String string2 = keva.getString("ep_video_cutout_res_blend_path", "");
        if (!a0.LJJJIL(LIZLLL) && new C0VSJ(LIZLLL).exists()) {
            LIZLLL = string2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cachePath blendPath = ");
        sbLIZ2.append(LIZLLL);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (c0e48 != null) {
            LIZLLL(c0e48);
        }
    }

    public static void LJIILJJIL(InterfaceC354120DuU interfaceC354120DuU) {
        C355090Dw3.LIZIZ("-----AIMattingManager", "registerMattingListener");
        if (interfaceC354120DuU != null) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = LIZ;
            copyOnWriteArraySet.clear();
            copyOnWriteArraySet.add(interfaceC354120DuU);
        }
    }

    public static void LJIILL(C0E48 c0e48) {
        INLEMattingRuntime mattingApi;
        C355090Dw3.LIZIZ("-----AIMattingManager", "resetAllTask");
        INLEMediaSession iNLEMediaSessionLJIIIIZZ = LJIIIIZZ(c0e48);
        if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null) {
            mattingApi.removeAllTask();
        }
        LJI.clear();
    }

    public static long LJ(C0E48 c0e48, String str) {
        return LJII.getLong(LJFF(c0e48, str), 0L);
    }

    public static String LJFF(C0E48 c0e48, String str) {
        boolean z;
        String strLJI = LJI(c0e48, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCostKeyForSlot slotUUID=");
        sbLIZ.append(str);
        sbLIZ.append(" md5=");
        sbLIZ.append(strLJI);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJI != null && !a0.LJJJIL(strLJI)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_video_cutot_cost_");
            sbLIZ2.append(strLJI);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("key_video_cutot_cost_");
        sbLIZ3.append(str);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJI(C0E48 c0e48, String str) {
        boolean z;
        VecNLETrackSPtr tracks;
        Object next;
        String resourceFile;
        NLEResourceNode resource;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.FALSE)).booleanValue()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJIIL;
            if (linkedHashMap.keySet().contains(str)) {
                return (String) linkedHashMap.get(str);
            }
        }
        if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot != null) {
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                    resourceFile = "";
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) LJIILIIL;
                CharSequence charSequence = (CharSequence) linkedHashMap2.get(resourceFile);
                if (charSequence != null && !a0.LJJJIL(charSequence)) {
                    return (String) linkedHashMap2.get(resourceFile);
                }
                Uri uriLJIILIIL = C2471909mP.LJIILIIL(resourceFile);
                C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
                String strLIZ = C09N5.LIZ(C351010DpT.LIZ().LIZ(), uriLJIILIIL);
                if (C2113008Po.LIZIZ(strLIZ)) {
                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(C20130113pb.LJ(new C0VSJ(strLIZ)), ":", "_", false), ";", "", false);
                    linkedHashMap2.get(str);
                    return strLJJIFFI;
                }
            }
        }
        return null;
    }

    public static int LJII(C0E48 c0e48, String str) {
        NLETrackSlot nLETrackSlotLJL;
        NLESegmentAIMatting segment;
        if (str != null && c0e48 != null && (nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48), str)) != null) {
            NLEAIMatting aIMatting = nLETrackSlotLJL.getAIMatting();
            if (aIMatting != null) {
                segment = aIMatting.getSegment();
            } else {
                segment = null;
            }
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
            if (nLESegmentAIMattingDynamicCast != null) {
                return nLESegmentAIMattingDynamicCast.getMattingType();
            }
        }
        return -1;
    }

    public static void LIZ(String str, long j, C0E48 c0e48) {
        String strLJI = LJI(c0e48, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mating_cost---- key=");
        sbLIZ.append(strLJI);
        sbLIZ.append(' ');
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJI != null && !a0.LJJJIL(strLJI)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_video_cutot_cost_");
            sbLIZ2.append(strLJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            Keva keva = LJII;
            long j2 = keva.getLong(strLIZIZ, 0L);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mating_cost---- key=");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" oldCost = ");
            sbLIZ3.append(j2);
            sbLIZ3.append(" cost = ");
            sbLIZ3.append(j);
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
            keva.storeLong(strLIZIZ, j2 + j);
        }
    }
}
