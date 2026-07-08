package X;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353810Dtz {
    public static final Map<String, InterfaceC352990Dsf> LIZ = C2097608Jq.LJIIIIZZ(new Pair("bottom_item_edit_speed", new InterfaceC352990Dsf() { // from class: X.0DsR
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (C351220Dpo.LJZ(nLETrackSlot)) {
                return C353880Du6.LIZ(null, null, 3);
            }
            if (nLESegmentVideoDynamicCast != null && Math.abs(nLESegmentVideoDynamicCast.getSpeed() - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_crop", new InterfaceC352990Dsf() { // from class: X.0DsJ
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (r7 == null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (r2.intValue() == X.EnumC375190EnN.FREE.ordinal()) goto L43;
         */
        @Override // X.InterfaceC352990Dsf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C353890Du7 LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
            /*
                r8 = this;
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.getMainSegment()
                if (r0 != 0) goto Lb
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            Lb:
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.getMainSegment()
                com.bytedance.ies.nle.editor_jni.NLESegmentVideo r0 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast(r0)
                r5 = 0
                if (r0 == 0) goto L99
                com.bytedance.ies.nle.editor_jni.NLEStyCrop r7 = r0.getCrop()
                if (r7 != 0) goto L4a
                com.bytedance.ies.nle.editor_jni.NLEStyClip r1 = r0.getClip()
                if (r1 == 0) goto L2a
                int r0 = X.C349360Dmo.LIZJ
                com.bytedance.ies.nle.editor_jni.NLEStyCrop r7 = X.C350670Dov.LIZ(r1)
                if (r7 != 0) goto L4a
            L2a:
                java.lang.String r0 = "ep_crop_mode"
                java.lang.String r0 = r9.getExtra(r0)
                if (r0 == 0) goto L99
                java.lang.Integer r2 = X.C2095008Iq.LJIIJJI(r0)
                if (r2 == 0) goto L99
                X.0EnN r0 = X.EnumC375190EnN.FREE
                int r1 = r0.ordinal()
                int r0 = r2.intValue()
                if (r0 == r1) goto L99
            L44:
                r0 = 3
                X.0Du7 r0 = X.C353880Du6.LIZ(r5, r5, r0)
                return r0
            L4a:
                float r0 = r7.getXLeft()
                r1 = 0
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                r6 = 1008981770(0x3c23d70a, float:0.01)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L97
                r4 = 1
            L5c:
                float r0 = r7.getYUpper()
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L95
                r3 = 1
            L6a:
                float r0 = r7.getXRight()
                r2 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L93
                r1 = 1
            L7a:
                float r0 = r7.getYLower()
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L91
                r0 = 1
            L88:
                if (r4 != 0) goto L44
                if (r3 != 0) goto L44
                if (r1 != 0) goto L44
                if (r0 == 0) goto L2a
                goto L44
            L91:
                r0 = 0
                goto L88
            L93:
                r1 = 0
                goto L7a
            L95:
                r3 = 0
                goto L6a
            L97:
                r4 = 0
                goto L5c
            L99:
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C352770DsJ.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0Du7");
        }
    }), new Pair("bottom_item_edit_video_anim", new InterfaceC352990Dsf() { // from class: X.0DsF
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
        
            if (r0 == false) goto L46;
         */
        @Override // X.InterfaceC352990Dsf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C353890Du7 LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r6) {
            /*
                r5 = this;
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r6.getMainSegment()
                if (r0 != 0) goto Lb
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            Lb:
                boolean r0 = X.C351220Dpo.LLJJL(r6)
                if (r0 != 0) goto L86
                boolean r0 = X.C351220Dpo.LLLIIIIL(r6)
                if (r0 != 0) goto L86
                boolean r0 = X.C351220Dpo.LLJILJIL(r6)
                if (r0 != 0) goto L86
                com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r4 = r6.getVideoAnims()
                boolean r0 = r4.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L93
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L91
                java.util.Iterator r1 = r4.iterator()
            L33:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L91
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLJJJJLIIL(r0)
                if (r0 == 0) goto L33
                r3 = 1
            L46:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8f
                java.util.Iterator r1 = r4.iterator()
            L50:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L8f
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLLIIII(r0)
                if (r0 == 0) goto L50
                r2 = 1
            L63:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8d
                java.util.Iterator r1 = r4.iterator()
            L6d:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L8d
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLJIJIL(r0)
                if (r0 == 0) goto L6d
                r0 = 1
            L80:
                if (r3 != 0) goto L86
                if (r2 != 0) goto L86
                if (r0 == 0) goto L93
            L86:
                r1 = 3
                r0 = 0
                X.0Du7 r0 = X.C353880Du6.LIZ(r0, r0, r1)
                return r0
            L8d:
                r0 = 0
                goto L80
            L8f:
                r2 = 0
                goto L63
            L91:
                r3 = 0
                goto L46
            L93:
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C352730DsF.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0Du7");
        }
    }), new Pair("bottom_item_edit_volume", new InterfaceC352990Dsf() { // from class: X.0Dsd
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && Math.abs(C351220Dpo.LJLLLL(mainSegment) - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_rotate", new InterfaceC352990Dsf() { // from class: X.0DsM
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.hasRotation() && nLETrackSlot.getRotation() != 0.0f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_retouch", new InterfaceC352990Dsf() { // from class: X.0DsL
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (!((ArrayList) C351220Dpo.LJIIJ(nLETrackSlot)).isEmpty()) {
                ArrayList arrayList = (ArrayList) C351220Dpo.LJIIJ(nLETrackSlot);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ArrayList<Pair<String, Integer>> arrayList2 = ((C351410Dq7) it2.next()).LIZ.LIZJ;
                        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            Iterator<Pair<String, Integer>> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (it3.next().getSecond().intValue() != 0) {
                                    return C353880Du6.LIZ(null, null, 3);
                                }
                            }
                        }
                    }
                }
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_adjust_filter", new InterfaceC352990Dsf() { // from class: X.0DsD
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            ArrayList<NLEFilter> arrayList = new ArrayList();
            for (NLEFilter nLEFilter : filters) {
                if (C351220Dpo.LLIIL(nLEFilter)) {
                    arrayList.add(nLEFilter);
                }
            }
            if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                for (NLEFilter nLEFilter2 : arrayList) {
                    NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLEFilter2.getSegment());
                    NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast((NLENode) nLEFilter2.getSegment());
                    if (nLESegmentFilterDynamicCast != null) {
                        if (nLESegmentFilterDynamicCast.getIntensity() == 0.0f) {
                            VecNLEStringFloatPairSPtr adjustParamss = nLESegmentFilterDynamicCast.getAdjustParamss();
                            if (!(adjustParamss instanceof Collection) || !adjustParamss.isEmpty()) {
                                Iterator<NLEStringFloatPair> it2 = adjustParamss.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getSecond() == 0.0f) {
                                    }
                                }
                            }
                        }
                        return C353880Du6.LIZ(null, null, 3);
                    }
                    if (nLESegmentHSLFilterDynamicCast != null && C0BZ6.LIZIZ(nLESegmentHSLFilterDynamicCast)) {
                        return C353880Du6.LIZ(null, null, 3);
                    }
                }
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_adjust_opacity", new InterfaceC352990Dsf() { // from class: X.0DsG
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            NLEKeyframe next;
            VecNLECommonKeyframe keyframes;
            if (Math.abs(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot) - 1.0f) > 0.005f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getKeyframeType() == NLEKeyframeType.Alpha) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEKeyframe nLEKeyframe = next;
                if (nLEKeyframe != null && (keyframes = nLEKeyframe.getKeyframes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLECommonKeyframe> it3 = keyframes.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getValue(), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Math.abs(((float) ((Double) it4.next()).doubleValue()) - 1.0f) > 0.005f) {
                            }
                        }
                    }
                }
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_edit_reduce_noise", new InterfaceC352990Dsf() { // from class: X.0DsW
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (C351220Dpo.LJJLL(nLETrackSlot) != null) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_reverse_video", new InterfaceC352990Dsf() { // from class: X.0DsN
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (C351220Dpo.LLLIL(nLETrackSlot)) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_background", new InterfaceC352990Dsf() { // from class: X.0DsT
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            String strLIZIZ = C351220Dpo.LIZIZ(nLETrackSlot);
            if (strLIZIZ != null) {
                Uri uriFromFile = UriProtector.parse(strLIZIZ);
                if (!Intrinsics.LJFF(uriFromFile.getScheme(), "content")) {
                    uriFromFile = Uri.fromFile(new C0VSJ(strLIZIZ));
                }
                return C353880Du6.LIZ(uriFromFile.toString(), null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_cutout", new InterfaceC352990Dsf() { // from class: X.0DsU
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getAIMatting() == null && !C351220Dpo.LJLZ(nLETrackSlot) && !C351220Dpo.LJZL(nLETrackSlot) && !C351220Dpo.LLIZLLLIL(nLETrackSlot)) {
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_edit_filter", new InterfaceC352990Dsf() { // from class: X.0Dsc
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            String strLJJJJJ;
            UrlModel iconUrl;
            List<String> urlList;
            NLEFilter nLEFilterLJJJI = C351220Dpo.LJJJI(nLETrackSlot);
            if (nLEFilterLJJJI != null) {
                String extra = nLEFilterLJJJI.getExtra("icon_url");
                if (extra != null && extra.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (strLJJJJJ = C351220Dpo.LJJJJJ(nLETrackSlot)) != null) {
                    Effect effectLJ = C365460EUm.LJ(strLJJJJJ);
                    extra = (effectLJ == null || (iconUrl = effectLJ.getIconUrl()) == null || (urlList = iconUrl.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList);
                }
                return C353880Du6.LIZ(extra, null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_segment_effect", new InterfaceC352990Dsf() { // from class: X.0DsI
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            String extra;
            String extra2;
            NLESegmentFilter segment;
            String extra3;
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
            if (videoEffects != null) {
                arrayList = new ArrayList();
                for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                    C351510DqH.LIZ.getClass();
                    if (!C351510DqH.LJJIJIL(nLEVideoEffect)) {
                        arrayList.add(nLEVideoEffect);
                    }
                }
            } else {
                arrayList = null;
            }
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            if (filters != null) {
                arrayList2 = new ArrayList();
                for (NLEFilter nLEFilter : filters) {
                    NLEFilter nLEFilter2 = nLEFilter;
                    if (nLEFilter2 != null) {
                        segment = nLEFilter2.getSegment();
                    } else {
                        segment = null;
                    }
                    if (NLESegmentComposerFilter.dynamicCast((NLENode) segment) != null && (extra3 = nLEFilter2.getExtra("editor_pro_effect_category")) != null && !a0.LJJJIL(extra3)) {
                        arrayList2.add(nLEFilter);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                NLENode nLENode = (NLENode) C13LP.LJJJLL(arrayList);
                if (nLENode != null) {
                    extra2 = nLENode.getExtra("icon_url");
                } else {
                    extra2 = null;
                }
                return C353880Du6.LIZ(extra2, null, 2);
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                NLENode nLENode2 = (NLENode) C13LP.LJJJLL(arrayList2);
                if (nLENode2 != null) {
                    extra = nLENode2.getExtra("icon_url");
                } else {
                    extra = null;
                }
                return C353880Du6.LIZ(extra, null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_magic", new InterfaceC352990Dsf() { // from class: X.0DsV
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            NLEVideoEffect next;
            NLEFilter next2;
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
            if (videoEffects != null) {
                Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJIL(next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            if (filters != null) {
                Iterator<NLEFilter> it3 = filters.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJL(next2)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
            } else {
                next2 = null;
            }
            String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
            String extra2 = nLETrackSlot.getExtra("ep_magic_effect_icon_url");
            if (C1533950q1J.LJ(extra)) {
                return C353880Du6.LIZ(extra2, null, 2);
            }
            if (next == null && next2 == null) {
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(extra2, null, 2);
        }
    }), new Pair("bottom_item_edit_voice_effect", new InterfaceC352990Dsf() { // from class: X.0DsO
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getExtra("extra_voice_chang_effect_id").length() > 0) {
                return C353880Du6.LIZ(nLETrackSlot.getExtra("extra_voice_chang_effect_icon_url"), null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_edit_mask", new InterfaceC352990Dsf() { // from class: X.0Dtx
        public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(289));

        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            NLEMask nLEMask;
            NLESegmentMask segment;
            Object next;
            Integer numValueOf;
            VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
            if (masks != null && (nLEMask = (NLEMask) C13LP.LJJJLL(masks)) != null && (segment = nLEMask.getSegment()) != null && !Intrinsics.LJFF(segment.getMaskType(), "none")) {
                Iterator it2 = ((List) this.LIZ.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C0EN8) next).LIZ, segment.getMaskType())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0EN8 c0en8 = (C0EN8) next;
                if (c0en8 != null) {
                    numValueOf = Integer.valueOf(c0en8.LIZIZ);
                } else {
                    numValueOf = null;
                }
                return C353880Du6.LIZ(null, numValueOf, 1);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_speed", new InterfaceC352990Dsf() { // from class: X.0DsR
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (C351220Dpo.LJZ(nLETrackSlot)) {
                return C353880Du6.LIZ(null, null, 3);
            }
            if (nLESegmentVideoDynamicCast != null && Math.abs(nLESegmentVideoDynamicCast.getSpeed() - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_crop", new InterfaceC352990Dsf() { // from class: X.0DsJ
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot v) {
            /*
                this = this;
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.getMainSegment()
                if (r0 != 0) goto Lb
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            Lb:
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.getMainSegment()
                com.bytedance.ies.nle.editor_jni.NLESegmentVideo r0 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast(r0)
                r5 = 0
                if (r0 == 0) goto L99
                com.bytedance.ies.nle.editor_jni.NLEStyCrop r7 = r0.getCrop()
                if (r7 != 0) goto L4a
                com.bytedance.ies.nle.editor_jni.NLEStyClip r1 = r0.getClip()
                if (r1 == 0) goto L2a
                int r0 = X.C349360Dmo.LIZJ
                com.bytedance.ies.nle.editor_jni.NLEStyCrop r7 = X.C350670Dov.LIZ(r1)
                if (r7 != 0) goto L4a
            L2a:
                java.lang.String r0 = "ep_crop_mode"
                java.lang.String r0 = r9.getExtra(r0)
                if (r0 == 0) goto L99
                java.lang.Integer r2 = X.C2095008Iq.LJIIJJI(r0)
                if (r2 == 0) goto L99
                X.0EnN r0 = X.EnumC375190EnN.FREE
                int r1 = r0.ordinal()
                int r0 = r2.intValue()
                if (r0 == r1) goto L99
            L44:
                r0 = 3
                X.0Du7 r0 = X.C353880Du6.LIZ(r5, r5, r0)
                return r0
            L4a:
                float r0 = r7.getXLeft()
                r1 = 0
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                r6 = 1008981770(0x3c23d70a, float:0.01)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L97
                r4 = 1
            L5c:
                float r0 = r7.getYUpper()
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L95
                r3 = 1
            L6a:
                float r0 = r7.getXRight()
                r2 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L93
                r1 = 1
            L7a:
                float r0 = r7.getYLower()
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L91
                r0 = 1
            L88:
                if (r4 != 0) goto L44
                if (r3 != 0) goto L44
                if (r1 != 0) goto L44
                if (r0 == 0) goto L2a
                goto L44
            L91:
                r0 = 0
                goto L88
            L93:
                r1 = 0
                goto L7a
            L95:
                r3 = 0
                goto L6a
            L97:
                r4 = 0
                goto L5c
            L99:
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C352770DsJ.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0Du7");
        }
    }), new Pair("bottom_item_overlay_edit_volume", new InterfaceC352990Dsf() { // from class: X.0Dsd
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && Math.abs(C351220Dpo.LJLLLL(mainSegment) - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_rotate", new InterfaceC352990Dsf() { // from class: X.0DsM
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.hasRotation() && nLETrackSlot.getRotation() != 0.0f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_retouch", new InterfaceC352990Dsf() { // from class: X.0DsL
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (!((ArrayList) C351220Dpo.LJIIJ(nLETrackSlot)).isEmpty()) {
                ArrayList arrayList = (ArrayList) C351220Dpo.LJIIJ(nLETrackSlot);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ArrayList<Pair<String, Integer>> arrayList2 = ((C351410Dq7) it2.next()).LIZ.LIZJ;
                        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            Iterator<Pair<String, Integer>> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (it3.next().getSecond().intValue() != 0) {
                                    return C353880Du6.LIZ(null, null, 3);
                                }
                            }
                        }
                    }
                }
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_adjust_opacity", new InterfaceC352990Dsf() { // from class: X.0DsG
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            NLEKeyframe next;
            VecNLECommonKeyframe keyframes;
            if (Math.abs(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot) - 1.0f) > 0.005f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getKeyframeType() == NLEKeyframeType.Alpha) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEKeyframe nLEKeyframe = next;
                if (nLEKeyframe != null && (keyframes = nLEKeyframe.getKeyframes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLECommonKeyframe> it3 = keyframes.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getValue(), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Math.abs(((float) ((Double) it4.next()).doubleValue()) - 1.0f) > 0.005f) {
                            }
                        }
                    }
                }
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_overlay_edit_reduce_noise", new InterfaceC352990Dsf() { // from class: X.0DsW
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (C351220Dpo.LJJLL(nLETrackSlot) != null) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_animation", new InterfaceC352990Dsf() { // from class: X.0DsF
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot v) {
            /*
                this = this;
                com.bytedance.ies.nle.editor_jni.NLESegment r0 = r6.getMainSegment()
                if (r0 != 0) goto Lb
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            Lb:
                boolean r0 = X.C351220Dpo.LLJJL(r6)
                if (r0 != 0) goto L86
                boolean r0 = X.C351220Dpo.LLLIIIIL(r6)
                if (r0 != 0) goto L86
                boolean r0 = X.C351220Dpo.LLJILJIL(r6)
                if (r0 != 0) goto L86
                com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r4 = r6.getVideoAnims()
                boolean r0 = r4.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L93
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L91
                java.util.Iterator r1 = r4.iterator()
            L33:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L91
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLJJJJLIIL(r0)
                if (r0 == 0) goto L33
                r3 = 1
            L46:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8f
                java.util.Iterator r1 = r4.iterator()
            L50:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L8f
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLLIIII(r0)
                if (r0 == 0) goto L50
                r2 = 1
            L63:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8d
                java.util.Iterator r1 = r4.iterator()
            L6d:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L8d
                java.lang.Object r0 = r1.next()
                com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
                boolean r0 = X.C351220Dpo.LLJIJIL(r0)
                if (r0 == 0) goto L6d
                r0 = 1
            L80:
                if (r3 != 0) goto L86
                if (r2 != 0) goto L86
                if (r0 == 0) goto L93
            L86:
                r1 = 3
                r0 = 0
                X.0Du7 r0 = X.C353880Du6.LIZ(r0, r0, r1)
                return r0
            L8d:
                r0 = 0
                goto L80
            L8f:
                r2 = 0
                goto L63
            L91:
                r3 = 0
                goto L46
            L93:
                X.0Du7 r0 = X.C353880Du6.LIZIZ()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C352730DsF.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0Du7");
        }
    }), new Pair("bottom_item_overlay_edit_segment_effect", new InterfaceC352990Dsf() { // from class: X.0DsI
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            String extra;
            String extra2;
            NLESegmentFilter segment;
            String extra3;
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
            if (videoEffects != null) {
                arrayList = new ArrayList();
                for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                    C351510DqH.LIZ.getClass();
                    if (!C351510DqH.LJJIJIL(nLEVideoEffect)) {
                        arrayList.add(nLEVideoEffect);
                    }
                }
            } else {
                arrayList = null;
            }
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            if (filters != null) {
                arrayList2 = new ArrayList();
                for (NLEFilter nLEFilter : filters) {
                    NLEFilter nLEFilter2 = nLEFilter;
                    if (nLEFilter2 != null) {
                        segment = nLEFilter2.getSegment();
                    } else {
                        segment = null;
                    }
                    if (NLESegmentComposerFilter.dynamicCast((NLENode) segment) != null && (extra3 = nLEFilter2.getExtra("editor_pro_effect_category")) != null && !a0.LJJJIL(extra3)) {
                        arrayList2.add(nLEFilter);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                NLENode nLENode = (NLENode) C13LP.LJJJLL(arrayList);
                if (nLENode != null) {
                    extra2 = nLENode.getExtra("icon_url");
                } else {
                    extra2 = null;
                }
                return C353880Du6.LIZ(extra2, null, 2);
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                NLENode nLENode2 = (NLENode) C13LP.LJJJLL(arrayList2);
                if (nLENode2 != null) {
                    extra = nLENode2.getExtra("icon_url");
                } else {
                    extra = null;
                }
                return C353880Du6.LIZ(extra, null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_magic", new InterfaceC352990Dsf() { // from class: X.0DsV
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            NLEVideoEffect next;
            NLEFilter next2;
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
            if (videoEffects != null) {
                Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJIL(next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            if (filters != null) {
                Iterator<NLEFilter> it3 = filters.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJL(next2)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
            } else {
                next2 = null;
            }
            String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
            String extra2 = nLETrackSlot.getExtra("ep_magic_effect_icon_url");
            if (C1533950q1J.LJ(extra)) {
                return C353880Du6.LIZ(extra2, null, 2);
            }
            if (next == null && next2 == null) {
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(extra2, null, 2);
        }
    }), new Pair("bottom_item_overlay_edit_mask", new InterfaceC352990Dsf() { // from class: X.0Dtx
        public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(289));

        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            NLEMask nLEMask;
            NLESegmentMask segment;
            Object next;
            Integer numValueOf;
            VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
            if (masks != null && (nLEMask = (NLEMask) C13LP.LJJJLL(masks)) != null && (segment = nLEMask.getSegment()) != null && !Intrinsics.LJFF(segment.getMaskType(), "none")) {
                Iterator it2 = ((List) this.LIZ.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C0EN8) next).LIZ, segment.getMaskType())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0EN8 c0en8 = (C0EN8) next;
                if (c0en8 != null) {
                    numValueOf = Integer.valueOf(c0en8.LIZIZ);
                } else {
                    numValueOf = null;
                }
                return C353880Du6.LIZ(null, numValueOf, 1);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_overlay_edit_cutout", new InterfaceC352990Dsf() { // from class: X.0DsU
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getAIMatting() == null && !C351220Dpo.LJLZ(nLETrackSlot) && !C351220Dpo.LJZL(nLETrackSlot) && !C351220Dpo.LLIZLLLIL(nLETrackSlot)) {
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_overlay_edit_filter", new InterfaceC352990Dsf() { // from class: X.0Dsc
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            String strLJJJJJ;
            UrlModel iconUrl;
            List<String> urlList;
            NLEFilter nLEFilterLJJJI = C351220Dpo.LJJJI(nLETrackSlot);
            if (nLEFilterLJJJI != null) {
                String extra = nLEFilterLJJJI.getExtra("icon_url");
                if (extra != null && extra.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (strLJJJJJ = C351220Dpo.LJJJJJ(nLETrackSlot)) != null) {
                    Effect effectLJ = C365460EUm.LJ(strLJJJJJ);
                    extra = (effectLJ == null || (iconUrl = effectLJ.getIconUrl()) == null || (urlList = iconUrl.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList);
                }
                return C353880Du6.LIZ(extra, null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_text_edit_text_to_speech", new InterfaceC352990Dsf() { // from class: X.0Du1
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.hasExtra("text_tts_id")) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_text_edit_adjust_opacity", new InterfaceC352990Dsf() { // from class: X.0DsG
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            NLEKeyframe next;
            VecNLECommonKeyframe keyframes;
            if (Math.abs(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot) - 1.0f) > 0.005f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getKeyframeType() == NLEKeyframeType.Alpha) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEKeyframe nLEKeyframe = next;
                if (nLEKeyframe != null && (keyframes = nLEKeyframe.getKeyframes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLECommonKeyframe> it3 = keyframes.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getValue(), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Math.abs(((float) ((Double) it4.next()).doubleValue()) - 1.0f) > 0.005f) {
                            }
                        }
                    }
                }
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_captions_edit_adjust_opacity", new InterfaceC352990Dsf() { // from class: X.0DsG
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            NLEKeyframe next;
            VecNLECommonKeyframe keyframes;
            if (Math.abs(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot) - 1.0f) > 0.005f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getKeyframeType() == NLEKeyframeType.Alpha) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEKeyframe nLEKeyframe = next;
                if (nLEKeyframe != null && (keyframes = nLEKeyframe.getKeyframes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLECommonKeyframe> it3 = keyframes.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getValue(), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Math.abs(((float) ((Double) it4.next()).doubleValue()) - 1.0f) > 0.005f) {
                            }
                        }
                    }
                }
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_sticker_edit_adjust_opacity", new InterfaceC352990Dsf() { // from class: X.0DsG
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            boolean z;
            NLEKeyframe next;
            VecNLECommonKeyframe keyframes;
            if (Math.abs(C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot) - 1.0f) > 0.005f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getKeyframeType() == NLEKeyframeType.Alpha) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEKeyframe nLEKeyframe = next;
                if (nLEKeyframe != null && (keyframes = nLEKeyframe.getKeyframes()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLECommonKeyframe> it3 = keyframes.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getValue(), arrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Math.abs(((float) ((Double) it4.next()).doubleValue()) - 1.0f) > 0.005f) {
                            }
                        }
                    }
                }
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_bgm_edit_volume", new InterfaceC352990Dsf() { // from class: X.0Dsd
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && Math.abs(C351220Dpo.LJLLLL(mainSegment) - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_bgm_edit_audio_fade", new InterfaceC352990Dsf() { // from class: X.0DsE
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            long fadeInLength;
            long fadeOutLength;
            Pair pair;
            NLEFilter filterByName = nLETrackSlot.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
            if (filterByName == null) {
                pair = new Pair(0L, 0L);
            } else {
                NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
                if (nLESegmentAudioFadeFilterDynamicCast != null) {
                    fadeInLength = nLESegmentAudioFadeFilterDynamicCast.getFadeInLength();
                    fadeOutLength = nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength();
                } else {
                    fadeInLength = 0;
                    fadeOutLength = 0;
                }
                pair = new Pair(Long.valueOf(fadeInLength), Long.valueOf(fadeOutLength));
            }
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            if (jLongValue <= 0 && jLongValue2 <= 0) {
                return C353880Du6.LIZIZ();
            }
            return C353880Du6.LIZ(null, null, 3);
        }
    }), new Pair("bottom_item_bgm_edit_sound_beats", new InterfaceC352990Dsf() { // from class: X.0Du0
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "audio_stick_points", "");
            if (strLJLJL != null && strLJLJL.length() > 0) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_sound_effect_edit_volume", new InterfaceC352990Dsf() { // from class: X.0Dsd
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && Math.abs(C351220Dpo.LJLLLL(mainSegment) - 1.0f) > 0.01f) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_voiceover_edit_volume", new InterfaceC352990Dsf() { // from class: X.0DsP
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            float fFloatValue;
            Float fLJIIIIZZ;
            if (nLETrackSlot.getMainSegment() == null) {
                return C353880Du6.LIZIZ();
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                float fLJLLLL = C351220Dpo.LJLLLL(mainSegment);
                if (nLETrackSlot.hasExtra("volume_enhance_rate") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_enhance_rate"))) != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                if (Math.abs(fLJLLLL - (fFloatValue * 1.0f)) > 0.01f) {
                    return C353880Du6.LIZ(null, null, 3);
                }
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_voiceover_edit_reduce_noise", new InterfaceC352990Dsf() { // from class: X.0DsW
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (C351220Dpo.LJJLL(nLETrackSlot) != null) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_voiceover_edit_voice_effect", new InterfaceC352990Dsf() { // from class: X.0DsO
        @Override // X.InterfaceC352990Dsf
        public final C353890Du7 LIZ(NLETrackSlot nLETrackSlot) {
            if (nLETrackSlot.getExtra("extra_voice_chang_effect_id").length() > 0) {
                return C353880Du6.LIZ(nLETrackSlot.getExtra("extra_voice_chang_effect_icon_url"), null, 2);
            }
            return C353880Du6.LIZIZ();
        }
    }));
    public static final Map<String, InterfaceC353860Du4> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("bottom_item_root_sound_sync", new InterfaceC353860Du4() { // from class: X.0Du2
        @Override // X.InterfaceC353860Du4
        public final C353890Du7 LIZ(NLEModel nLEModel, C1DRG c1drg) {
            if (C359160E6g.LIZ(nLEModel)) {
                return C353880Du6.LIZ(null, null, 3);
            }
            return C353880Du6.LIZIZ();
        }
    }), new Pair("bottom_item_bgm_edit_lyric", new InterfaceC353860Du4() { // from class: X.0Du5
        @Override // X.InterfaceC353860Du4
        public final C353890Du7 LIZ(NLEModel nLEModel, C1DRG c1drg) {
            List<LyricStickerModel> listI4;
            boolean z;
            LiveData<Boolean> liveDataQ72;
            if (c1drg != null) {
                C0EHC c0ehc = (C0EHC) c1drg.LJIIL(null, C0EHC.class);
                InterfaceC366450EYh interfaceC366450EYh = (InterfaceC366450EYh) c1drg.LJIIL(null, InterfaceC366450EYh.class);
                if (c0ehc != null) {
                    listI4 = c0ehc.i4();
                } else {
                    listI4 = null;
                }
                if (listI4 != null && !listI4.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (interfaceC366450EYh != null && (liveDataQ72 = interfaceC366450EYh.q72()) != null && Intrinsics.LJFF(liveDataQ72.getValue(), Boolean.TRUE)) {
                        return C353880Du6.LIZ(null, null, 3);
                    }
                } else {
                    return C353880Du6.LIZ(null, null, 3);
                }
            }
            return C353880Du6.LIZIZ();
        }
    }));

    public static C353890Du7 LIZ(NLETrackSlot nLETrackSlot, String str) {
        InterfaceC352990Dsf interfaceC352990Dsf;
        if (!C353850Du3.LIZ(null) || (interfaceC352990Dsf = LIZ.get(str)) == null) {
            return null;
        }
        return interfaceC352990Dsf.LIZ(nLETrackSlot);
    }

    public static C353890Du7 LIZIZ(String str, NLEModel nLEModel, C1DRG c1drg) {
        InterfaceC353860Du4 interfaceC353860Du4;
        if (!C353850Du3.LIZ(str) || (interfaceC353860Du4 = LIZIZ.get(str)) == null) {
            return null;
        }
        return interfaceC353860Du4.LIZ(nLEModel, c1drg);
    }
}
