package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Duf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicI2VHandler$handleApplyMagic$1$2", f = "MagicI2VHandler.kt", l = {}, m = "invokeSuspend")
public final class C354230Duf extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C354390Duv LLILLJJLI;
    public final /* synthetic */ C354540DvA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354230Duf(C354390Duv c354390Duv, C354540DvA c354540DvA, InterfaceC1364105Vn<? super C354230Duf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c354390Duv;
        this.LLILLL = c354540DvA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C354230Duf c354230Duf = new C354230Duf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c354230Duf.LL = obj;
        return c354230Duf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEResourceNode resource;
        String extra;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLEVideoEffect nLEVideoEffectLJFF;
        C1C7U.LIZ("MagicI2VHandler@3c68.handleApplyMagic$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) this.LL;
        C354540DvA c354540DvA = this.LLILLL;
        C354240Dug c354240Dug = c354540DvA.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        NLETrackSlot nLETrackSlot2 = c354240Dug.LIZIZ;
        C352250DrT.LJIILJJIL(nLETrackSlot2, str);
        C354260Dui c354260Dui = C354260Dui.LIZ;
        String str2 = c354510Dv7.LIZIZ;
        String str3 = c354510Dv7.LIZJ;
        String str4 = c354510Dv7.LIZ;
        String str5 = c354510Dv7.LJIIIIZZ;
        c354260Dui.getClass();
        C354260Dui.LIZIZ(nLETrackSlot2, str2, str3, str4, str5);
        nLETrackSlot2.setExtra("ep_magic_category_id", c354510Dv7.LJII);
        NLETemplateModel nLETemplateModel = c354540DvA.LIZJ;
        boolean z = true;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null && (nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot)) != null) {
            NLEVideoEffect nLEVideoEffectDynamicCast = NLEVideoEffect.dynamicCast(nLEVideoEffectLJFF.deepClone(true));
            nLEVideoEffectDynamicCast.setExtra("I2V", "I2V");
            nLEVideoEffectDynamicCast.setExtra("ep_magic_resource_id", c354510Dv7.LIZIZ);
            nLEVideoEffectDynamicCast.setExtra("ep_magic_effect_id", c354510Dv7.LIZJ);
            nLEVideoEffectDynamicCast.setExtra("ep_client_magic_resource_path", c354510Dv7.LIZLLL);
            nLEVideoEffectDynamicCast.setExtra("is_from_ep_magic", "true");
            nLETrackSlot2.addVideoEffect(nLEVideoEffectDynamicCast);
            nLETrackSlot2.setExtra("from_ep_create", "true");
        }
        NLETrackSlot nLETrackSlot3 = this.LLILLL.LIZIZ.LIZIZ;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null && ((extra = resource.getExtra("slot_extra_origin_resource_file")) == null || extra.length() == 0)) {
            nLETrackSlot3.setExtra("slot_extra_origin_duration", String.valueOf(nLETrackSlot3.getDuration()));
            nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_start_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipStart()));
            nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_end_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipEnd()));
            resource.setExtra("slot_extra_origin_resource_file", resource.getResourceFile());
            resource.setExtra("slot_extra_origin_resource_width", String.valueOf(resource.getWidth()));
            resource.setExtra("slot_extra_origin_resource_height", String.valueOf(resource.getHeight()));
        }
        if (this.LLILLJJLI.LLILZ == null) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("MagicI2VHandler@3c68.handleApplyMagic$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
