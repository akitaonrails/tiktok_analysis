package X;

import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl$fetchEffectModel$1", f = "TtsReuseServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05WR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<TtsReuseModel> LL;
    public final /* synthetic */ TtsReuseServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WR(List<TtsReuseModel> list, TtsReuseServiceImpl ttsReuseServiceImpl, InterfaceC1364105Vn<? super C05WR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = ttsReuseServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TtsReuseServiceImpl@25ea.fetchEffectModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TtsReuseModel ttsReuseModel : this.LL) {
            if (ttsReuseModel != null) {
                String str = ttsReuseModel.fontResId;
                if (str != null) {
                    Boolean.valueOf(arrayList.add(str));
                }
                String str2 = ttsReuseModel.voiceResId;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", "textfont");
        InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) this.LLILLJJLI.LIZ.getValue();
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.Cg(arrayList, linkedHashMap, new IFetchEffectListByIdsListener() { // from class: X.05WU
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                        for (Effect effect : data) {
                            String effectId = effect.getEffectId();
                            if (effectId != null && effectId.length() != 0) {
                                C05WW c05ww = C05WW.LIZ;
                                String resourceId = effect.getResourceId();
                                synchronized (c05ww) {
                                    if (resourceId != null) {
                                        ConcurrentHashMap<String, Effect> concurrentHashMap = C05WW.LIZJ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("textfont-");
                                        sbLIZ.append(resourceId);
                                        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), effect);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("panel", "speaking-voice");
        InterfaceC1635410sex interfaceC1635410sex2 = (InterfaceC1635410sex) this.LLILLJJLI.LIZ.getValue();
        if (interfaceC1635410sex2 != null) {
            interfaceC1635410sex2.Cg(arrayList2, linkedHashMap2, new IFetchEffectListByIdsListener() { // from class: X.05WV
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                        for (Effect effect : data) {
                            String effectId = effect.getEffectId();
                            if (effectId != null && effectId.length() != 0) {
                                C05WW c05ww = C05WW.LIZ;
                                String resourceId = effect.getResourceId();
                                synchronized (c05ww) {
                                    if (resourceId != null) {
                                        ConcurrentHashMap<String, Effect> concurrentHashMap = C05WW.LIZJ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("speaking-voice-");
                                        sbLIZ.append(resourceId);
                                        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), effect);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchEffectModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
