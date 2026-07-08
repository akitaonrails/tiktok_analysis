package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.12AI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel$1", f = "EffectRecommendationCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C12AI extends C09AX implements Function2<C12AL, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EffectRecommendationCardViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12AI(EffectRecommendationCardViewModel effectRecommendationCardViewModel, InterfaceC1364105Vn<? super C12AI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectRecommendationCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C12AI c12ai = new C12AI(this.LLILLJJLI, interfaceC1364105Vn);
        c12ai.LL = obj;
        return c12ai;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C12AJ c12ajLIZ;
        Integer numValueOf;
        C1C7U.LIZ("EffectRecommendationCardViewModel@8ad5.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C12AL c12al = (C12AL) this.LL;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LLILLJJLI;
        effectRecommendationCardViewModel.getClass();
        C12AJ c12ajLIZ2 = null;
        Integer numValueOf2 = null;
        if (c12al instanceof C12AQ) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectRecommendationCardViewModel), null, null, new C12AF(((C12AQ) c12al).LIZ, effectRecommendationCardViewModel, null), 3);
        } else if (c12al instanceof C12AO) {
            C12AO c12ao = (C12AO) c12al;
            String str = c12ao.LIZIZ;
            if (str != null) {
                SmartRoute smartRouteLIZ = C1394200mNu.LIZ.LIZ(c12ao.LIZJ, str, "homepage_hot");
                smartRouteLIZ.withParam(FollowStatusChangeMethod.PARAM_UID, str);
                smartRouteLIZ.open();
                Integer num = c12ao.LIZ;
                if (num != null) {
                    numValueOf2 = Integer.valueOf(num.intValue() + 1);
                }
                C1449260noi.LJ("click_recommend_card", C197101129r.LIZIZ(numValueOf2, str, "prop_three_card"));
                C12AJ value = effectRecommendationCardViewModel.LLIZ.getValue();
                if (value != null) {
                    Object value2 = effectRecommendationCardViewModel.LLILLJJLI.getValue();
                    String str2 = value.LJFF;
                    value2.getClass();
                    C12AW.LIZJ(str2);
                }
            }
        } else if (c12al instanceof C12AN) {
            C12AN c12an = (C12AN) c12al;
            String str3 = c12an.LIZIZ;
            if (str3 != null) {
                ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJFF(c12an.LIZJ, Collections.singletonList(str3), new C116L(null, "prop_recommend_card", null, false, null, "homepage_hot", "click_prop_publish", null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, 0, -195), ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                Integer num2 = c12an.LIZ;
                if (num2 != null) {
                    numValueOf = Integer.valueOf(num2.intValue() + 1);
                } else {
                    numValueOf = null;
                }
                C1449260noi.LJ("commerce_prop_click", C197101129r.LIZIZ(numValueOf, str3, "prop_three_card"));
                C12AJ value3 = effectRecommendationCardViewModel.LLIZ.getValue();
                if (value3 != null) {
                    Object value4 = effectRecommendationCardViewModel.LLILLJJLI.getValue();
                    String str4 = value3.LJFF;
                    value4.getClass();
                    C12AW.LIZJ(str4);
                }
            }
        } else if (c12al instanceof C12AS) {
            if (C0XF1.LIZLLL(((C12AS) c12al).LIZ)) {
                effectRecommendationCardViewModel.yQ2();
                MutableLiveData<C12AJ> mutableLiveData = effectRecommendationCardViewModel.LLIZ;
                C12AJ value5 = mutableLiveData.getValue();
                if (value5 != null) {
                    c12ajLIZ2 = C12AJ.LIZ(value5, null, null, null, null, null, null, false, null, 191);
                }
                mutableLiveData.setValue(c12ajLIZ2);
            }
        } else if (c12al instanceof C12AM) {
            effectRecommendationCardViewModel.LLILZ = true;
            C12AM c12am = (C12AM) c12al;
            if (C0XF1.LIZLLL(c12am.LIZ)) {
                effectRecommendationCardViewModel.yQ2();
                effectRecommendationCardViewModel.xQ2();
            } else {
                MutableLiveData<C12AJ> mutableLiveData2 = effectRecommendationCardViewModel.LLIZ;
                C12AJ value6 = mutableLiveData2.getValue();
                if (value6 != null) {
                    c12ajLIZ = C12AJ.LIZ(value6, null, null, null, null, null, null, true, null, 191);
                } else {
                    c12ajLIZ = null;
                }
                mutableLiveData2.setValue(c12ajLIZ);
            }
            effectRecommendationCardViewModel.zQ2(c12am.LIZIZ, c12am.LIZJ, AFwS229S0000000_2.get$arr$(768));
        } else if (c12al instanceof C12AP) {
            effectRecommendationCardViewModel.LLILZ = false;
            effectRecommendationCardViewModel.LLILZIL = false;
            effectRecommendationCardViewModel.wQ2().pause();
            effectRecommendationCardViewModel.zQ2(((C12AP) c12al).LIZ, null, AFwS229S0000000_2.get$arr$(769));
        } else if (c12al instanceof C12AU) {
            effectRecommendationCardViewModel.wQ2().stop();
        } else if (c12al instanceof C12AR) {
            effectRecommendationCardViewModel.wQ2().resume();
            effectRecommendationCardViewModel.zQ2(((C12AR) c12al).LIZ, null, AFwS229S0000000_2.get$arr$(770));
        } else if (c12al instanceof C12AT) {
            effectRecommendationCardViewModel.xQ2();
            effectRecommendationCardViewModel.yQ2();
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectRecommendationCardViewModel@8ad5.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C12AL c12al, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c12al, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
