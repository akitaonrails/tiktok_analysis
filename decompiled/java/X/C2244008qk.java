package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.TTSFetchEffectAbilityFactory$getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2$1$1$1", f = "TTSFetchEffectAbilityFactory.kt", l = {59}, m = "invokeSuspend")
public final class C2244008qk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<ReadTextEffectBean>>, Object> {
    public int LL;
    public final /* synthetic */ C2247008rE LLILLJJLI;
    public final /* synthetic */ EffectCategoryModel LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244008qk(C2247008rE c2247008rE, EffectCategoryModel effectCategoryModel, C013C c013c, InterfaceC1364105Vn<? super C2244008qk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2247008rE;
        this.LLILLL = effectCategoryModel;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2244008qk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("TTSFetchEffectAbilityFactory@5b45.getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C2247008rE c2247008rE = this.LLILLJJLI;
            final EffectCategoryModel effectCategoryModel = this.LLILLL;
            boolean z = !this.LLILZ.element;
            this.LL = 1;
            InterfaceC1635390sev interfaceC1635390sev = c2247008rE.LIZIZ;
            final Map<String, String> map = c2247008rE.LIZ;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            IFetchCategoryEffectListener iFetchCategoryEffectListener = new IFetchCategoryEffectListener() { // from class: X.0929
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    String msg;
                    Map<String, String> map2 = map;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effectCategoryModel.getKey());
                    sbLIZ.append("error_msg");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    Exception exception = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append(':');
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    } else {
                        msg = null;
                    }
                    sbLIZ2.append(msg);
                    sbLIZ2.append(':');
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                    }
                    sbLIZ2.append(exception);
                    map2.put(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC1364105Vn<List<ReadTextEffectBean>> interfaceC1364105Vn = c23260099m;
                    ArrayList arrayList = new ArrayList();
                    C189200o6.m2constructorimpl(arrayList);
                    interfaceC1364105Vn.resumeWith(arrayList);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    Integer numLJIIJJI;
                    CategoryEffectModel categoryEffects;
                    List<Effect> effects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    ArrayList arrayList = new ArrayList();
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
                        EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
                        for (Effect effect : effects) {
                            try {
                                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C2219091BtD.LIZJ().LJII(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
                                if (readTextEffectSpeakerExtra != null) {
                                    readTextEffectSpeakerExtra.speakerName = effect.getName();
                                } else {
                                    readTextEffectSpeakerExtra = new ReadTextEffectSpeakerExtra(false, null, null, null, 0, 0, null, null, null, null, false, 0L, 0L, null, 16383, null);
                                }
                                ReadTextEffectBean readTextEffectBean = new ReadTextEffectBean(effect, readTextEffectSpeakerExtra);
                                readTextEffectBean.category = new TTSCategory(effectCategoryModel2.getId(), effectCategoryModel2.getName(), effectCategoryModel2.getKey(), effectCategoryModel2.getExtra());
                                arrayList.add(readTextEffectBean);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C2219091BtD.LIZLLL().LIZIZ(e);
                            }
                        }
                    }
                    Map<String, String> map2 = map;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effectCategoryModel.getKey());
                    sbLIZ.append("error_msg");
                    map2.put(C2188811AlT.LIZIZ(sbLIZ), "");
                    String str = map.get("all_effect_size");
                    if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                        map.put("all_effect_size", String.valueOf(numLJIIJJI.intValue() + arrayList.size()));
                    } else {
                        map.put("all_effect_size", String.valueOf(arrayList.size()));
                    }
                    InterfaceC1364105Vn<List<ReadTextEffectBean>> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(arrayList);
                    interfaceC1364105Vn.resumeWith(arrayList);
                }
            };
            if (z) {
                C1635120seU.LIZIZ(interfaceC1635390sev, "speaking-voice", effectCategoryModel.getKey(), 0, 0, 0, null, iFetchCategoryEffectListener);
            } else {
                C1635120seU.LIZ(0, 0, 0, 0, iFetchCategoryEffectListener, interfaceC1635390sev, "speaking-voice", effectCategoryModel.getKey(), null, null, true);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TTSFetchEffectAbilityFactory@5b45.getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TTSFetchEffectAbilityFactory@5b45.getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2$1$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<ReadTextEffectBean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
