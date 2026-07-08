package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EYI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        NLEResourceNode effectSDKFilter;
        NLEResourceNode effectSDKEffect;
        ArrayList arrayList = new ArrayList();
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2.getMainTrack() || C351220Dpo.LLLIIL(nLETrack2)) {
                    arrayList2.add(nLETrack);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                        if (videoEffects != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                                String extra = nLEVideoEffect.getExtra("editor_pro_effect_category");
                                if (extra != null && !a0.LJJJIL(extra)) {
                                    arrayList3.add(nLEVideoEffect);
                                }
                            }
                            ArrayList<NLEResourceNode> arrayList4 = new ArrayList();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                NLESegmentEffect segment = ((NLEVideoEffect) it3.next()).getSegment();
                                if (segment != null && (effectSDKEffect = segment.getEffectSDKEffect()) != null) {
                                    arrayList4.add(effectSDKEffect);
                                }
                            }
                            for (NLEResourceNode nLEResourceNode : arrayList4) {
                                arrayList.add(new EditorProEffectInfo(nLEResourceNode.getResourceId(), nLEResourceNode.getResourceName(), nLEResourceNode.getResourceFile()));
                            }
                        }
                        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                        if (filters != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (NLEFilter nLEFilter : filters) {
                                String extra2 = nLEFilter.getExtra("editor_pro_effect_category");
                                if (extra2 != null && !a0.LJJJIL(extra2)) {
                                    arrayList5.add(nLEFilter);
                                }
                            }
                            ArrayList<NLEResourceNode> arrayList6 = new ArrayList();
                            Iterator it4 = arrayList5.iterator();
                            while (it4.hasNext()) {
                                NLESegmentFilter segment2 = ((NLEFilter) it4.next()).getSegment();
                                if (segment2 != null && (effectSDKFilter = segment2.getEffectSDKFilter()) != null) {
                                    arrayList6.add(effectSDKFilter);
                                }
                            }
                            for (NLEResourceNode nLEResourceNode2 : arrayList6) {
                                arrayList.add(new EditorProEffectInfo(nLEResourceNode2.getResourceId(), nLEResourceNode2.getResourceName(), nLEResourceNode2.getResourceFile()));
                            }
                        }
                    }
                }
            }
        }
        videoPublishEditModel.getEditorProModel().setVideoSegmentEffects(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r5 = ((java.util.ArrayList) r15).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r5.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r3 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(((X.C348380DlE) r3).LIZ, r2.getUUID()) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        r3 = (X.C348380DlE) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (r3 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        r1 = r2.getMainSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        r0 = r1.getExtra("nle_extra_resource_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r3.LJIIL = r0;
        r0 = com.bytedance.ies.nle.editor_jni.NLESegmentEffect.dynamicCast(r2.getMainSegment());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        r0 = r0.getEffectSDKEffect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r1 = r0.getResourceTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r1 != com.bytedance.ies.nle.editor_jni.NLEResTag.AMAZING) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        r3 = X.C363510EMz.LIZ(r3, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        r3.setIsNewEngineEffect(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        if (r17 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        r5 = new X.C0EYM();
        r5.LJIIL = r3.getResDir();
        r5.LJIILIIL = r3.getKey();
        r5.LJIILL = r3.getName();
        r5.LJIIIIZZ = r3.getSelectedColor();
        r5.LJIIZILJ = r3.getCategory();
        r5.LJIILLIIL = r3.getDuration();
        r5.LJIJ = r3.getExtra();
        r5.LJ = r3.getUiStartPoint();
        r5.LIZJ = r3.getUiStartPoint();
        r5.LJFF = r3.getUiEndPoint();
        r5.LIZIZ = new java.lang.String[]{r3.getUuid()};
        r5.LJIJJ = r3.getIsNewEngineEffect();
        r5.LJIJI = r3.getAdjustParams();
        r5.LJIILJJIL = r3.getResourceId();
        r5.LJI = 0;
        r5.LJII = r8;
        r5.LJIJJLI = false;
        r17.LIZIZ(r5);
        r0 = r3.getEndPoint();
        r5 = r2.getUUID();
        r2 = X.C0EYM.LIZJ(r0);
        r2.LJFF = r0;
        r2.LJII = r8;
        r2.LIZIZ = new java.lang.String[]{r5};
        r2.LJIJJLI = false;
        r17.LIZIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0181, code lost:
    
        r9.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0186, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r15, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r16, X.C0EYK r17, java.lang.Integer r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EYI.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0EYK, java.lang.Integer, java.util.List):void");
    }
}
