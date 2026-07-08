package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.DataSpeechFetchEffectAbility$fetchEffectsOnlyCategory$2$1$1$1", f = "DataSpeechFetchEffectAbility.kt", l = {44}, m = "invokeSuspend")
public final class C2243808qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Object>>, Object> {
    public int LL;
    public final /* synthetic */ C2246808rC LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1635390sev LLILZ;
    public final /* synthetic */ EffectCategoryModel LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ Function2<EffectCategoryModel, Effect, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2243808qi(C2246808rC c2246808rC, String str, InterfaceC1635390sev interfaceC1635390sev, EffectCategoryModel effectCategoryModel, C013C c013c, Function2<? super EffectCategoryModel, ? super Effect, Object> function2, InterfaceC1364105Vn<? super C2243808qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2246808rC;
        this.LLILLL = str;
        this.LLILZ = interfaceC1635390sev;
        this.LLILZIL = effectCategoryModel;
        this.LLILZLL = c013c;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2243808qi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DataSpeechFetchEffectAbility@2da9.fetchEffectsOnlyCategory$2$1$1$1");
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
            final C2246808rC c2246808rC = this.LLILLJJLI;
            String str = this.LLILLL;
            InterfaceC1635390sev interfaceC1635390sev = this.LLILZ;
            final EffectCategoryModel effectCategoryModel = this.LLILZIL;
            boolean z = !this.LLILZLL.element;
            final Function2<EffectCategoryModel, Effect, Object> function2 = this.LLIZ;
            this.LL = 1;
            c2246808rC.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            IFetchCategoryEffectListener iFetchCategoryEffectListener = new IFetchCategoryEffectListener() { // from class: X.08qn
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    int errorCode;
                    String msg;
                    C2246808rC c2246808rC2 = c2246808rC;
                    if (exceptionResult != null) {
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        errorCode = -99999;
                    }
                    c2246808rC2.LIZ = errorCode;
                    C2246808rC c2246808rC3 = c2246808rC;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchEffectByCategory:");
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    } else {
                        msg = null;
                    }
                    sbLIZ.append(msg);
                    c2246808rC3.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC1364105Vn<List<Object>> interfaceC1364105Vn = c23260099m;
                    ArrayList arrayList = new ArrayList();
                    C189200o6.m2constructorimpl(arrayList);
                    interfaceC1364105Vn.resumeWith(arrayList);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    List<Effect> effects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    ArrayList arrayList = new ArrayList();
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
                        Function2<EffectCategoryModel, Effect, Object> function22 = function2;
                        EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
                        Iterator<Effect> it2 = effects.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(function22.invoke(effectCategoryModel2, it2.next()));
                        }
                    }
                    InterfaceC1364105Vn<List<Object>> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(arrayList);
                    interfaceC1364105Vn.resumeWith(arrayList);
                }
            };
            if (z) {
                C1635120seU.LIZIZ(interfaceC1635390sev, str, effectCategoryModel.getKey(), 0, 0, 0, null, iFetchCategoryEffectListener);
            } else {
                C1635120seU.LIZ(0, 0, 0, 0, iFetchCategoryEffectListener, interfaceC1635390sev, str, effectCategoryModel.getKey(), null, null, true);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DataSpeechFetchEffectAbility@2da9.fetchEffectsOnlyCategory$2$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DataSpeechFetchEffectAbility@2da9.fetchEffectsOnlyCategory$2$1$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
