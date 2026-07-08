package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.f;

/* JADX INFO: renamed from: X.0DTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel$loadData$1", f = "TemplateEffectsViewModel.kt", l = {126}, m = "invokeSuspend")
public final class C339660DTg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateEffectsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339660DTg(TemplateEffectsViewModel templateEffectsViewModel, InterfaceC1364105Vn<? super C339660DTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateEffectsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339660DTg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Map<String, String> mapLJJIIJ;
        f fVar;
        Set setLJLIIL;
        int i;
        int i2;
        Object objLIZ = obj;
        C1C7U.LIZ("TemplateEffectsViewModel@8e3c.loadData$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        String message = null;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            this.LLILLJJLI.CQ2(C1641640sp0.LIZIZ());
            final TemplateEffectsViewModel templateEffectsViewModel = this.LLILLJJLI;
            this.LL = 1;
            templateEffectsViewModel.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (!NetworkUtils.isNetworkAvailable(C0CHQ.LIZ) && C0C64.LJIILLIIL().LJIIIZ(31744, "is_create_tab_cache_enabled", true, false)) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC1627350sRx stickerRepository = templateEffectsViewModel.LL.getStickerRepository();
            if (!(stickerRepository instanceof f) || (fVar = (f) stickerRepository) == null || (mapLJJIIJ = fVar.LJJIIJ(false)) == null || !(!mapLJJIIJ.isEmpty())) {
                mapLJJIIJ = null;
            }
            templateEffectsViewModel.LL.getStickerRepository().LJIJJ().LJJJ(0, 0, 0, 0, new IFetchCategoryEffectListener() { // from class: X.08qq
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Exception exception;
                    TemplateEffectsViewModel templateEffectsViewModel2 = templateEffectsViewModel;
                    Exception exception2 = null;
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                    } else {
                        exception = null;
                    }
                    templateEffectsViewModel2.getClass();
                    if (exception != null) {
                        C201955140j.LJIIIZ(C20012313Rx.LIZIZ, "TemplateEffectsViewModel", "fetchAmeAICreateTemplatesV2", exception);
                    } else {
                        C201955140j.LJIIIIZZ(C20012313Rx.LIZIZ, "TemplateEffectsViewModel", "fetchAmeAICreateTemplatesV2");
                    }
                    InterfaceC1364105Vn<Pair<? extends Throwable, ? extends List<? extends Effect>>> interfaceC1364105Vn = c23260099m;
                    if (exceptionResult != null) {
                        exception2 = exceptionResult.getException();
                    }
                    Pair pair = new Pair(exception2, C13BV.INSTANCE);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
                        List<Effect> category_effects = categoryEffects.getCategory_effects();
                        InterfaceC1364105Vn<Pair<? extends Throwable, ? extends List<? extends Effect>>> interfaceC1364105Vn = c23260099m;
                        if (category_effects == null) {
                            category_effects = C13BV.INSTANCE;
                        }
                        Pair pair = new Pair(null, category_effects);
                        C189200o6.m2constructorimpl(pair);
                        interfaceC1364105Vn.resumeWith(pair);
                        return;
                    }
                    InterfaceC1364105Vn<Pair<? extends Throwable, ? extends List<? extends Effect>>> interfaceC1364105Vn2 = c23260099m;
                    Pair pair2 = new Pair(new Exception("category list null"), C13BV.INSTANCE);
                    C189200o6.m2constructorimpl(pair2);
                    interfaceC1364105Vn2.resumeWith(pair2);
                }
            }, "default", "create_new", CardStruct.IStatusCode.DEFAULT, mapLJJIIJ, z);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TemplateEffectsViewModel@8e3c.loadData$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLIZ;
        Throwable th = (Throwable) pair.getFirst();
        List list = (List) pair.getSecond();
        this.LLILLJJLI.getClass();
        if (C339690DTj.LIZ() && C339700DTk.LIZ()) {
            setLJLIIL = C13LQ.LJLIIL(new String[]{"ai_create", "ai_create_i2v", "ai_create_fl2v"});
        } else if (C339690DTj.LIZ()) {
            setLJLIIL = Collections.singleton("ai_create");
        } else if (C339700DTk.LIZ()) {
            setLJLIIL = C13LQ.LJLIIL(new String[]{"ai_create_i2v", "ai_create_fl2v"});
        } else {
            setLJLIIL = C08CX.INSTANCE;
        }
        if (setLJLIIL.isEmpty() || ((list instanceof Collection) && list.isEmpty())) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (C13LP.LJJJJ(C1446840nko.LIZIZ((Effect) it2.next()), setLJLIIL) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = list.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (C1446840nko.LIZLLL((Effect) it3.next()) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        C201955140j.LJIILL(c20012313Rx, "TemplateEffectsViewModel", "aigcTemplateList size " + i);
        C201955140j.LJIILL(c20012313Rx, "TemplateEffectsViewModel", "ameTemplateList size " + i2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Effect effect = (Effect) obj2;
            if (((!setLJLIIL.isEmpty()) && C13LP.LJJJJ(C1446840nko.LIZIZ(effect), setLJLIIL)) || C1446840nko.LIZLLL(effect)) {
                arrayList.add(obj2);
            }
        }
        this.LLILLJJLI.getClass();
        List listSubList = arrayList;
        if (!C339670DTh.LIZ()) {
            boolean zIsEmpty = arrayList.isEmpty();
            listSubList = arrayList;
            if (!zIsEmpty) {
                int size = arrayList.size();
                listSubList = arrayList;
                if (size > 8) {
                    listSubList = arrayList.subList(0, 8);
                }
            }
        }
        if (th != null) {
            TemplateEffectsViewModel templateEffectsViewModel2 = this.LLILLJJLI;
            if (th != null) {
                message = th.getMessage();
            }
            templateEffectsViewModel2.getClass();
            TemplateEffectsViewModel.FQ2(message, false);
            this.LLILLJJLI.CQ2(C1641640sp0.LIZ(new Exception("Error fetching template effects")));
        } else {
            this.LLILLJJLI.getClass();
            TemplateEffectsViewModel.FQ2(null, true);
            this.LLILLJJLI.CQ2(C1641640sp0.LIZJ(new ArrayList(listSubList)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEffectsViewModel@8e3c.loadData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
