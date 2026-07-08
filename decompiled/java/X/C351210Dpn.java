package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351210Dpn extends C09AY implements Function1<NLETrackSlot, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C351560DqM LLILZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C558340Lv6 LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ NLESegmentVideo LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351210Dpn(boolean z, int i, boolean z2, C351560DqM c351560DqM, C259800zU<NLETrackSlot> c259800zU, C558340Lv6 c558340Lv6, long j, NLESegmentVideo nLESegmentVideo, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = z2;
        this.LLILZ = c351560DqM;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c558340Lv6;
        this.LLIZ = j;
        this.LLIZLLLIL = nLESegmentVideo;
        this.LLJ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NLETrackSlot nLETrackSlot) {
        long j;
        String strLJJLIIIJJI;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        NLEResourceNode resource3;
        String extra;
        NLEResourceNode resource4;
        NLESegmentChromaChannel segment;
        String resourceFile2;
        String resourceId;
        NLESegmentAIMatting segment2;
        C0VSJ c0vsj;
        String resourceFile3;
        NLESegmentVideo nLESegmentVideoLIZ;
        NLESegment mainSegment3;
        NLEResourceNode resource5;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        if (this.LL && (mainSegment3 = nLETrackSlot2.getMainSegment()) != null && (resource5 = mainSegment3.getResource()) != null) {
            resource5.setWidth(this.LLILLJJLI);
        }
        if (this.LLILLL) {
            this.LLILZ.LIZLLL.LIZIZ(C351220Dpo.LLLLLLL(nLETrackSlot2.getStartTime()));
        }
        nLETrackSlot2.setScale(this.LLILZIL.element.getScale());
        nLETrackSlot2.setTransformX(this.LLILZIL.element.getTransformX());
        nLETrackSlot2.setTransformY(this.LLILZIL.element.getTransformY());
        nLETrackSlot2.setRotation(this.LLILZIL.element.getRotation());
        C351220Dpo.LLLLLILLIL(nLETrackSlot2, C351220Dpo.LJJLIIIJLLLLLLLZ(this.LLILZIL.element));
        NLENode nLENode = (NLENode) C13LP.LJJJLL(this.LLILZIL.element.getMasks());
        if (nLENode != null) {
            nLETrackSlot2.addMask(NLEMask.dynamicCast(nLENode.deepClone(true)));
        }
        NLESegmentVideo nLESegmentVideoLIZ2 = C351170Dpj.LIZ(this.LLILZIL.element);
        if (nLESegmentVideoLIZ2 != null) {
            C259800zU<NLETrackSlot> c259800zU = this.LLILZIL;
            if (nLESegmentVideoLIZ2.getClip() != null || nLESegmentVideoLIZ2.getCrop() != null) {
                NLESegmentVideo nLESegmentVideoLIZ3 = C351170Dpj.LIZ(nLETrackSlot2);
                if (nLESegmentVideoLIZ3 != null) {
                    nLESegmentVideoLIZ3.setIsWithEffect(true);
                }
                NLEStyCrop crop = nLESegmentVideoLIZ2.getCrop();
                if (crop != null && (nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot2)) != null) {
                    nLESegmentVideoLIZ.setCrop(NLEStyCrop.dynamicCast(crop.deepClone(true)));
                }
                nLETrackSlot2.setExtra("ep_crop_transX", c259800zU.element.getExtra("ep_crop_transX"));
                nLETrackSlot2.setExtra("ep_crop_transY", c259800zU.element.getExtra("ep_crop_transY"));
                nLETrackSlot2.setExtra("ep_crop_scale", c259800zU.element.getExtra("ep_crop_scale"));
                nLETrackSlot2.setExtra("ep_crop_degree", c259800zU.element.getExtra("ep_crop_degree"));
                nLETrackSlot2.setExtra("ep_crop_ratio", c259800zU.element.getExtra("ep_crop_ratio"));
                nLETrackSlot2.setExtra("ep_crop_mode", c259800zU.element.getExtra("ep_crop_mode"));
                nLETrackSlot2.setExtra("is_editorpro_crop_video", c259800zU.element.getExtra("is_editorpro_crop_video"));
            }
        }
        VecNLEFilterSPtr filters = this.LLILZIL.element.getFilters();
        ArrayList arrayList = new ArrayList();
        for (NLEFilter nLEFilter : filters) {
            if (!C351220Dpo.LLILIL(nLEFilter)) {
                arrayList.add(nLEFilter);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLETrackSlot2.addFilter(NLEFilter.dynamicCast(((NLENode) it2.next()).deepClone(true)));
        }
        VecNLEVideoEffectSPtr videoEffects = this.LLILZIL.element.getVideoEffects();
        ArrayList arrayList2 = new ArrayList();
        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
            if (!Intrinsics.LJFF(nLEVideoEffect.getExtra("is_from_ep_magic"), "true")) {
                arrayList2.add(nLEVideoEffect);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            nLETrackSlot2.addVideoEffect(NLEVideoEffect.dynamicCast(((NLENode) it3.next()).deepClone(true)));
        }
        NLEAIMatting aIMatting = this.LLILZIL.element.getAIMatting();
        String resourceFile4 = null;
        if (aIMatting != null && (segment2 = aIMatting.getSegment()) != null) {
            C351560DqM c351560DqM = this.LLILZ;
            if (segment2.getMattingType() == NLEAIMattingType.TYPE_AI.swigValue() || segment2.getMattingType() == NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue()) {
                InterfaceC351350Dq1 interfaceC351350Dq1LLFII = c351560DqM.LIZ.LLFII();
                NLEResourceNode resourceAlgorithm = segment2.getResourceAlgorithm();
                if (resourceAlgorithm != null && (resourceFile3 = resourceAlgorithm.getResourceFile()) != null) {
                    c0vsj = new C0VSJ(resourceFile3);
                } else {
                    c0vsj = null;
                }
                interfaceC351350Dq1LLFII.LJIL(nLETrackSlot2, c0vsj, segment2.getMattingType(), false, null, null, EnumC356070Dxd.NONE, null);
            }
        }
        VecNLEChromaChannelSPtr chromaChannels = this.LLILZIL.element.getChromaChannels();
        if (chromaChannels != null) {
            C351560DqM c351560DqM2 = this.LLILZ;
            Iterator<NLEChromaChannel> it4 = chromaChannels.iterator();
            while (it4.hasNext()) {
                NLEChromaChannel nLEChromaChannelDynamicCast = NLEChromaChannel.dynamicCast((NLENode) it4.next());
                if (nLEChromaChannelDynamicCast != null && (segment = nLEChromaChannelDynamicCast.getSegment()) != null) {
                    InterfaceC351350Dq1 interfaceC351350Dq1LLFII2 = c351560DqM2.LIZ.LLFII();
                    long color = segment.getColor();
                    float intensity = segment.getIntensity();
                    float shadow = segment.getShadow();
                    NLEResourceNode resource6 = segment.getResource();
                    if (resource6 != null) {
                        resourceFile2 = resource6.getResourceFile();
                    } else {
                        resourceFile2 = null;
                    }
                    NLEResourceNode resource7 = segment.getResource();
                    if (resource7 != null) {
                        resourceId = resource7.getResourceId();
                    } else {
                        resourceId = null;
                    }
                    interfaceC351350Dq1LLFII2.LJLLL(nLETrackSlot2, color, intensity, shadow, resourceId, resourceFile2, null, EnumC356070Dxd.NONE);
                }
            }
        }
        NLESegment mainSegment4 = nLETrackSlot2.getMainSegment();
        if (mainSegment4 != null && (resource3 = mainSegment4.getResource()) != null) {
            NLESegment mainSegment5 = this.LLILZIL.element.getMainSegment();
            if (mainSegment5 != null && (resource4 = mainSegment5.getResource()) != null) {
                extra = resource4.getExtra("ep_ai_generated");
            } else {
                extra = null;
            }
            resource3.setExtra("ep_ai_generated", extra);
        }
        if (C351220Dpo.LLLIL(this.LLILZIL.element)) {
            j = this.LLILZLL.LJ - this.LLIZ;
        } else {
            j = this.LLIZ;
        }
        if (C351220Dpo.LLLIL(this.LLILZIL.element)) {
            NLETrackSlot renderProxy = this.LLILZIL.element.getRenderProxy();
            if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && resourceFile.length() != 0) {
                strLJJLIIIJJI = C351220Dpo.LJJLIIIJJI(this.LLILZIL.element.getRenderProxy().getMainSegment());
                C259800zU<NLETrackSlot> c259800zU2 = this.LLILZIL;
                if (strLJJLIIIJJI.length() == 0) {
                    NLETrackSlot renderProxy2 = c259800zU2.element.getRenderProxy();
                    if (renderProxy2 != null && (mainSegment2 = renderProxy2.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                        resourceFile4 = resource2.getResourceFile();
                    }
                    strLJJLIIIJJI = resourceFile4;
                }
            } else {
                strLJJLIIIJJI = C351220Dpo.LJJLIIIJJI(this.LLIZLLLIL);
            }
        } else {
            strLJJLIIIJJI = this.LLJ;
        }
        nLETrackSlot2.setExtra("freeze_from_uuid", this.LLILZIL.element.getUUID());
        nLETrackSlot2.setExtra("freeze_from_resource_path", strLJJLIIIJJI);
        nLETrackSlot2.setExtra("freeze_timestamp", String.valueOf(j));
        this.LLILZ.LJI = nLETrackSlot2;
        return Unit.LIZ;
    }
}
