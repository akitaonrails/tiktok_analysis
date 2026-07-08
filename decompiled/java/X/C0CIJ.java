package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIJ {
    public static final C0CIJ ADJUST_OPACITY;
    public static final C0CIJ AIGT_FIXED_ASSET;
    public static final C0CIJ CC_UPGRADE_109;
    public static final /* synthetic */ C0CIJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CIJ MAGIC_CUTOUT;
    public static final C0CIJ SEGMENT_EFFECT;
    public static final C0CIJ TEMPLATE_TITLE_EMPTY;
    public static final C0CIJ UGC_AI_CREATE_STYLIZED_FL2V;
    public static final C0CIJ UGC_AI_CREATE_STYLIZED_I2V;
    public static final C0CIJ UGC_AUDIO_FADE;
    public static final C0CIJ UGC_CHROMA_KEY;
    public static final C0CIJ UGC_CUSTOM_CUTOUT;
    public static final C0CIJ UGC_CUTOUT_STROKE;
    public static final C0CIJ UGC_FREEZE;
    public static final C0CIJ UGC_FREE_LAYER;
    public static final C0CIJ UGC_I2V_FRAME;
    public static final C0CIJ UGC_LYRIC;
    public static final C0CIJ UGC_MASK;
    public static final C0CIJ UGC_NEW_AI_CREATE;
    public static final C0CIJ UGC_NEW_AI_CREATE_I2I;
    public static final C0CIJ UGC_PIP_ANIM;
    public static final C0CIJ UGC_PIP_FILTER;
    public static final C0CIJ UGC_PIP_MAGIC;
    public static final C0CIJ UGC_REVERSE_VIDEO;
    public static final C0CIJ UGC_SGT;
    public static final C0CIJ UGC_SLOT_MEDIA_TYPE_ADAPTATION;
    public static final C0CIJ UGC_SWING_KEYFRAME;
    public static final C0CIJ VIDEO_ALPHA;
    public final int LL;

    public static InterfaceC2044707zh<C0CIJ> getEntries() {
        return LLILLL;
    }

    public Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return null;
    }

    public Integer canProduceTemplate(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
        return null;
    }

    static {
        C0CIJ c0cij = new C0CIJ("UGC_PIP_MAGIC", 0, 919390);
        UGC_PIP_MAGIC = c0cij;
        C0CIJ c0cij2 = new C0CIJ("CC_UPGRADE_109", 1, 124867);
        CC_UPGRADE_109 = c0cij2;
        C0CIJ c0cij3 = new C0CIJ("UGC_AUDIO_FADE", 2, 10086);
        UGC_AUDIO_FADE = c0cij3;
        C0CIJ c0cij4 = new C0CIJ("TEMPLATE_TITLE_EMPTY", 3, 237882);
        TEMPLATE_TITLE_EMPTY = c0cij4;
        C0CIJ c0cij5 = new C0CIJ("SEGMENT_EFFECT", 4, 100);
        SEGMENT_EFFECT = c0cij5;
        C0CIJ c0cij6 = new C0CIJ("UGC_CUSTOM_CUTOUT", 5, 570707);
        UGC_CUSTOM_CUTOUT = c0cij6;
        C0CIJ c0cij7 = new C0CIJ("UGC_FREEZE", 6, 123654);
        UGC_FREEZE = c0cij7;
        C0CIJ c0cij8 = new C0CIJ("UGC_REVERSE_VIDEO", 7, 127385);
        UGC_REVERSE_VIDEO = c0cij8;
        C0CIJ c0cij9 = new C0CIJ("UGC_I2V_FRAME", 8, 654321);
        UGC_I2V_FRAME = c0cij9;
        C0CIJ c0cij10 = new C0CIJ("UGC_FREE_LAYER", 9, 9495);
        UGC_FREE_LAYER = c0cij10;
        C0CIJ c0cij11 = new C0CIJ("UGC_SLOT_MEDIA_TYPE_ADAPTATION", 10, 375404);
        UGC_SLOT_MEDIA_TYPE_ADAPTATION = c0cij11;
        C0CIJ c0cij12 = new C0CIJ("UGC_CHROMA_KEY", 11, 220287);
        UGC_CHROMA_KEY = c0cij12;
        C0CIJ c0cij13 = new C0CIJ("AIGT_FIXED_ASSET", 12, 20260601);
        AIGT_FIXED_ASSET = c0cij13;
        C0CIJ c0cij14 = new C0CIJ("UGC_PIP_ANIM", 13, 9494);
        UGC_PIP_ANIM = c0cij14;
        C0CIJ c0cij15 = new C0CIJ() { // from class: X.0Din
            @Override // X.C0CIJ
            public final Integer canProduceTemplate(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
                Boolean boolValueOf;
                VecNLETrackSPtr tracks;
                boolean z2;
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (true) {
                        z2 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLETrack next = it2.next();
                        NLETrack nLETrack = next;
                        if (NLETrackType.VIDEO == nLETrack.getTrackType() && !nLETrack.getMainTrack() && nLETrack.getEnable()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (C351220Dpo.LLIIII((NLETrackSlot) it4.next())) {
                                break;
                            }
                        }
                        z2 = false;
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        z2 = false;
                        boolValueOf = Boolean.valueOf(z2);
                    }
                } else {
                    boolValueOf = null;
                }
                return Integer.valueOf(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0);
            }

            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                boolean z;
                if (NLETrackType.VIDEO == nLETrack.getTrackType() && !nLETrack.getMainTrack() && C351220Dpo.LLIIII(nLETrackSlot)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_PIP_FILTER = c0cij15;
        C0CIJ c0cij16 = new C0CIJ("ADJUST_OPACITY", 15, 71288363);
        ADJUST_OPACITY = c0cij16;
        C0CIJ c0cij17 = new C0CIJ("VIDEO_ALPHA", 16, 911911);
        VIDEO_ALPHA = c0cij17;
        C0CIJ c0cij18 = new C0CIJ() { // from class: X.0CIL
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return Boolean.valueOf(C351220Dpo.LLD(nLETrackSlot));
            }
        };
        UGC_CUTOUT_STROKE = c0cij18;
        C0CIJ c0cij19 = new C0CIJ() { // from class: X.0Dio
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                boolean z = false;
                if (tracks != null && !tracks.isEmpty()) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        VecNLETrackSlotSPtr slots = it2.next().getSlots();
                        if (slots != null && !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it3 = slots.iterator();
                            while (it3.hasNext()) {
                                if (C377880Eri.LJIIJJI(it3.next())) {
                                    z = true;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_NEW_AI_CREATE = c0cij19;
        C0CIJ c0cij20 = new C0CIJ() { // from class: X.0Dip
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                boolean z = false;
                if (tracks != null && !tracks.isEmpty()) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        VecNLETrackSlotSPtr slots = it2.next().getSlots();
                        if (slots != null && !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it3 = slots.iterator();
                            while (it3.hasNext()) {
                                if (C377880Eri.LJIIL(it3.next())) {
                                    z = true;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_NEW_AI_CREATE_I2I = c0cij20;
        C0CIJ c0cij21 = new C0CIJ() { // from class: X.0Erh
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII = C377880Eri.LJII(nLETrackSlot);
                boolean z = false;
                if (editorProAIGCTemplateModelLJII != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_I2V.getType()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_AI_CREATE_STYLIZED_I2V = c0cij21;
        C0CIJ c0cij22 = new C0CIJ() { // from class: X.0Erg
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII = C377880Eri.LJII(nLETrackSlot);
                boolean z = false;
                if (editorProAIGCTemplateModelLJII != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_FL2V.getType()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_AI_CREATE_STYLIZED_FL2V = c0cij22;
        C0CIJ c0cij23 = new C0CIJ() { // from class: X.0Dim
            @Override // X.C0CIJ
            public final Integer canProduceTemplate(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
                Boolean boolValueOf;
                VecNLETrackSPtr tracks;
                boolean z2;
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (NLETrackType.VIDEO == nLETrack2.getTrackType() && nLETrack2.getEnable()) {
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
                            VecNLEMaskSPtr masks = ((NLETrackSlot) it3.next()).getMasks();
                            if (masks != null && !masks.isEmpty()) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        z2 = false;
                        boolValueOf = Boolean.valueOf(z2);
                    }
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    return 1;
                }
                return 0;
            }

            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                VecNLEMaskSPtr masks;
                boolean z = false;
                if (NLETrackType.VIDEO == nLETrack.getTrackType() && (masks = nLETrackSlot.getMasks()) != null && !masks.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        UGC_MASK = c0cij23;
        C0CIJ c0cij24 = new C0CIJ() { // from class: X.0CIM
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return Boolean.valueOf(C351220Dpo.LLIIIJ(nLETrackSlot));
            }
        };
        UGC_SWING_KEYFRAME = c0cij24;
        C0CIJ c0cij25 = new C0CIJ() { // from class: X.0CIN
            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                boolean z = true;
                if (nLETrackSlot.getAIMatting() == null || !C348520DlS.LJFF(nLETrackSlot)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        MAGIC_CUTOUT = c0cij25;
        C0CIJ c0cij26 = new C0CIJ() { // from class: X.0CIK
            @Override // X.C0CIJ
            public final Integer canProduceTemplate(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
                if (C351220Dpo.LLFFF(nLEModel)) {
                    if (!z) {
                        return -1;
                    }
                    return 1;
                }
                return 0;
            }

            @Override // X.C0CIJ
            public final Boolean addFeatureCode(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return Boolean.valueOf(C351220Dpo.LLFFF(nLEModel));
            }
        };
        UGC_LYRIC = c0cij26;
        C0CIJ c0cij27 = new C0CIJ("UGC_SGT", 26, 20260610);
        UGC_SGT = c0cij27;
        C0CIJ[] c0cijArr = {c0cij, c0cij2, c0cij3, c0cij4, c0cij5, c0cij6, c0cij7, c0cij8, c0cij9, c0cij10, c0cij11, c0cij12, c0cij13, c0cij14, c0cij15, c0cij16, c0cij17, c0cij18, c0cij19, c0cij20, c0cij21, c0cij22, c0cij23, c0cij24, c0cij25, c0cij26, c0cij27};
        LLILLJJLI = c0cijArr;
        LLILLL = new C2254308sP(c0cijArr);
    }

    public static C0CIJ[] values() {
        return (C0CIJ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0CIJ valueOf(String str) {
        return (C0CIJ) C08FF.LIZ(C0CIJ.class, str);
    }

    public C0CIJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
