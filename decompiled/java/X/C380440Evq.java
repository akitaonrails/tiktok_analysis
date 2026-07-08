package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Evq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplateMagicProcessComponent$restoreNLEModelSlots$2$2", f = "TemplateMagicProcessComponent.kt", l = {}, m = "invokeSuspend")
public final class C380440Evq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NLETrackSlot LL;
    public final /* synthetic */ C381340ExI LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380440Evq(NLETrackSlot nLETrackSlot, C381340ExI c381340ExI, NLETrackSlot nLETrackSlot2, InterfaceC1364105Vn<? super C380440Evq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = c381340ExI;
        this.LLILLL = nLETrackSlot2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380440Evq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String jsonParam;
        C1C7U.LIZ("TemplateMagicProcessComponent@2539.restoreNLEModelSlots$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLETrackSlot nLETrackSlot = this.LL;
        if (nLETrackSlot != null) {
            nLETrackSlot.addVideoEffect(this.LLILLJJLI.LIZIZ);
        }
        NLETrackSlot nLETrackSlot2 = this.LLILLL;
        if (nLETrackSlot2 != null) {
            nLETrackSlot2.addVideoEffect(this.LLILLJJLI.LIZIZ);
        }
        NLETrackSlot renderProxy = this.LLILLJJLI.LIZ.getRenderProxy();
        if (renderProxy != null) {
            NLETrackSlot nLETrackSlot3 = this.LL;
            NLETrackSlot nLETrackSlot4 = this.LLILLL;
            C381340ExI c381340ExI = this.LLILLJJLI;
            if (nLETrackSlot3 != null) {
                nLETrackSlot3.setRenderProxy(renderProxy);
            }
            if (nLETrackSlot4 != null) {
                nLETrackSlot4.setRenderProxy(renderProxy);
            }
            c381340ExI.LIZIZ.setEnable(false);
            NLEVideoEffect nLEVideoEffect = c381340ExI.LIZIZ;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_magic_i2i_disable_effect_display", true, false)) {
                NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLEVideoEffect.getSegment());
                if (nLESegmentEffectDynamicCast != null) {
                    jsonParam = nLESegmentEffectDynamicCast.getJsonParam();
                } else {
                    jsonParam = null;
                }
                JSONObject jSONObject = new JSONObject(jsonParam);
                if (jSONObject.has("editing_effect_can_display")) {
                    jSONObject.put("editing_effect_can_display", false);
                    if (nLESegmentEffectDynamicCast != null) {
                        nLESegmentEffectDynamicCast.setJsonParam(C786410Ut5.J3(jSONObject));
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateMagicProcessComponent@2539.restoreNLEModelSlots$2$2");
        return unit;
    }
}
