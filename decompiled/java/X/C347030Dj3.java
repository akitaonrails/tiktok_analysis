package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceGIF;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Dj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347030Dj3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEEditor nLEEditor, HashMap map, Function1 function1) {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        VecNLEVideoAnimationSPtr videoAnims;
        NLEVideoAnimation nLEVideoAnimation;
        NLESegmentVideoAnimation segment;
        String animJsonParam;
        NLESegmentVideoAnimation segment2;
        String str;
        String str2;
        String str3;
        function1.invoke("updatePath: -------------");
        Iterator<NLEResourceNode> it2 = nLEEditor.getModel().getAllResources().iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                NLEResourceNode next = it2.next();
                NLEResourceGIF nLEResourceGIFDynamicCast = NLEResourceGIF.dynamicCast((NLENode) next);
                if (nLEResourceGIFDynamicCast != null) {
                    if (nLEResourceGIFDynamicCast.hasResourceFiles() && nLEResourceGIFDynamicCast.getResourceFiles().size() > 0) {
                        VecString resourceFiles = nLEResourceGIFDynamicCast.getResourceFiles();
                        for (String str4 : resourceFiles) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (map.get(str4) != null) {
                                    resourceFiles.set(i, (String) map.get(str4));
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        nLEResourceGIFDynamicCast.setResourceFiles(resourceFiles);
                    }
                } else {
                    NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) next);
                    if (nLEResourceAVDynamicCast != null) {
                        if (nLEResourceAVDynamicCast.hasFileInfo() && (str3 = (String) map.get(nLEResourceAVDynamicCast.getFileInfo())) != null) {
                            nLEResourceAVDynamicCast.setFileInfo(str3);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("replace hit code 1: src");
                            sbLIZ.append(nLEResourceAVDynamicCast.getFileInfo());
                            sbLIZ.append(" dst");
                            sbLIZ.append(str3);
                            sbLIZ.append(' ');
                            function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (nLEResourceAVDynamicCast.hasReverseResourceFile() && (str2 = (String) map.get(nLEResourceAVDynamicCast.getReverseResourceFile())) != null) {
                            nLEResourceAVDynamicCast.setReverseResourceFile(str2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("replace hit code 2: src");
                            sbLIZ2.append(nLEResourceAVDynamicCast.getReverseResourceFile());
                            sbLIZ2.append(" dst");
                            sbLIZ2.append(str2);
                            sbLIZ2.append(' ');
                            function1.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    if (next.hasResourceFile() && (str = (String) map.get(next.getResourceFile())) != null) {
                        next.setResourceFile(str);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("replace hit code 3: src");
                        sbLIZ3.append(next.getResourceFile());
                        sbLIZ3.append(" dst");
                        sbLIZ3.append(str);
                        sbLIZ3.append(' ');
                        function1.invoke(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            } else {
                NLEModel model = nLEEditor.getModel();
                if (model != null && (tracks = model.getTracks()) != null && (!tracks.isEmpty()) && (nLETrack = (NLETrack) C13LP.LJJJJZI(tracks)) != null && (slots = nLETrack.getSlots()) != null && (!slots.isEmpty()) && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJJZI(slots)) != null && (videoAnims = nLETrackSlot.getVideoAnims()) != null && (!videoAnims.isEmpty()) && (nLEVideoAnimation = (NLEVideoAnimation) C13LP.LJJJJZI(videoAnims)) != null && (segment = nLEVideoAnimation.getSegment()) != null && (animJsonParam = segment.getAnimJsonParam()) != null && animJsonParam.length() != 0) {
                    try {
                        C2096108Jb c2096108Jb = new C2096108Jb(animJsonParam.length());
                        C08EB.LIZ(c2096108Jb, animJsonParam);
                        String string = c2096108Jb.toString();
                        for (Map.Entry entry : map.entrySet()) {
                            if (string != null && a0.LJJIIZI(string, (CharSequence) entry.getKey(), false)) {
                                string = u.LJJIFFI(string, (String) entry.getKey(), (String) entry.getValue(), false);
                            }
                        }
                        NLEVideoAnimation nLEVideoAnimation2 = (NLEVideoAnimation) C13LP.LJJJJZI(videoAnims);
                        if (nLEVideoAnimation2 != null && (segment2 = nLEVideoAnimation2.getSegment()) != null) {
                            segment2.setAnimJsonParam(string);
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }
                nLEEditor.commit();
                nLEEditor.done();
                return;
            }
        }
    }
}
