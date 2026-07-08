package X;

import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMattingTask$handleResourceForSlot$2", f = "TemplateMattingTask.kt", l = {}, m = "invokeSuspend")
public final class C353320DtC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<NLETrackSlot> LL;
    public final /* synthetic */ HashMap<String, Effect> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353320DtC(List<? extends NLETrackSlot> list, HashMap<String, Effect> map, String str, InterfaceC1364105Vn<? super C353320DtC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = map;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353320DtC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String unzipPath;
        String unzipPath2;
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment;
        String unzipPath3;
        C1C7U.LIZ("TemplateMattingTask@e9a9.handleResourceForSlot$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        HashMap<String, Effect> map = this.LLILLJJLI;
        NLEResType nLEResType = NLEResType.AI_MATTING_BLEND;
        nLEResourceNode.setResourceType(nLEResType);
        Effect effect = map.get("7550979354717590017");
        if (effect != null) {
            unzipPath = effect.getUnzipPath();
        } else {
            unzipPath = null;
        }
        nLEResourceNode.setResourceFile(unzipPath);
        nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ("7550979354717590017", "editor_pro_cutout"));
        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
        HashMap<String, Effect> map2 = this.LLILLJJLI;
        nLEResourceNode2.setResourceType(nLEResType);
        Effect effect2 = map2.get("7550959958905328144");
        if (effect2 != null) {
            unzipPath2 = effect2.getUnzipPath();
        } else {
            unzipPath2 = null;
        }
        nLEResourceNode2.setResourceFile(unzipPath2);
        nLEResourceNode2.setExtra("biz_res_id", C0FGD.LIZ("7550959958905328144", "editor_pro_cutout"));
        List<NLETrackSlot> list = this.LL;
        HashMap<String, Effect> map3 = this.LLILLJJLI;
        String str = this.LLILLL;
        for (NLETrackSlot nLETrackSlot : list) {
            if (nLETrackSlot != null && (aIMatting = nLETrackSlot.getAIMatting()) != null && (segment = aIMatting.getSegment()) != null) {
                segment.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModeNormal);
                segment.setMattingType(NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue());
                if (segment.getBlend() == null) {
                    NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
                    nLEResourceNode3.setResourceType(NLEResType.AI_MATTING_BLEND);
                    Effect effect3 = map3.get("7328289135402160641");
                    if (effect3 != null) {
                        unzipPath3 = effect3.getUnzipPath();
                    } else {
                        unzipPath3 = null;
                    }
                    nLEResourceNode3.setResourceFile(unzipPath3);
                    nLEResourceNode3.setExtra("biz_res_id", NLETemplateSource.LJIIIIZZ.getMattingBlendUrs());
                    segment.setBlend(nLEResourceNode3);
                }
                segment.setBlendCutout(nLEResourceNode);
                segment.setBlendMask(nLEResourceNode2);
                NLEResourceNode nLEResourceNode4 = new NLEResourceNode();
                nLEResourceNode4.setResourceFile(str);
                nLEResourceNode4.setResourceType(NLEResType.AI_MATTING);
                nLEResourceNode4.setExtra("biz_res_id", NLETemplateSource.LJIIIIZZ.getMattingModelUrs());
                segment.setResourceAlgorithm(nLEResourceNode4);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateMattingTask@e9a9.handleResourceForSlot$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
