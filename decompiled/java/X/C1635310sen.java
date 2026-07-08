package X;

import Y.AkS486S0100000_25;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1635310sen extends AbstractC1635300sem<Effect, C1635370set, CategoryEffectModel> {
    public final Function0<InterfaceC1635390sev> LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final int getPosition() {
        return ((C1635370set) this.LIZ.get()).LIZ;
    }

    public final boolean hasNext() {
        return ((C1635370set) this.LIZ.get()).LIZLLL;
    }

    @Override // X.C11T3
    public final C11NZ requestActual(Object obj) {
        C11KS c11ksLJII;
        Pair pair = (Pair) obj;
        final int iIntValue = ((Number) pair.getFirst()).intValue();
        final C1635370set c1635370set = (C1635370set) pair.getSecond();
        if (c1635370set.LJ.length() == 0 && c1635370set.LIZ == 0) {
            c11ksLJII = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0seo
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<C1641660sp2<CategoryEffectModel>> interfaceC2329309At) {
                    InterfaceC1635390sev interfaceC1635390sevInvoke = this.LL.LIZJ.invoke();
                    String str = this.LL.LIZLLL;
                    int i = iIntValue;
                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                    IFetchPanelInfoListener iFetchPanelInfoListener = new IFetchPanelInfoListener() { // from class: X.0seq
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            c11kt.tryOnError(C1635120seU.LJIIIZ(exceptionResult));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(PanelInfoModel panelInfoModel) {
                            CategoryEffectModel categoryEffectModel;
                            PanelInfoModel panelInfoModel2 = panelInfoModel;
                            InterfaceC2329309At<C1641660sp2<CategoryEffectModel>> interfaceC2329309At2 = c11kt;
                            if (panelInfoModel2 != null) {
                                categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
                            } else {
                                categoryEffectModel = null;
                            }
                            interfaceC2329309At2.onSuccess(C1641650sp1.LIZ(categoryEffectModel));
                        }
                    };
                    EffectChannelResponse effectChannelResponse = C1635120seU.LIZ;
                    C1635120seU.LJFF(interfaceC1635390sevInvoke, str, true, "", i, 0, 0, CardStruct.IStatusCode.DEFAULT, false, false, C2097608Jq.LJ(), iFetchPanelInfoListener, false, false, 0, false, 0);
                }
            });
        } else {
            c11ksLJII = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sep
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<C1641660sp2<CategoryEffectModel>> interfaceC2329309At) {
                    C1635310sen c1635310sen = this.LL;
                    if (c1635310sen.LJ) {
                        InterfaceC1635390sev interfaceC1635390sevInvoke = c1635310sen.LIZJ.invoke();
                        String str = this.LL.LIZLLL;
                        C1635370set c1635370set2 = c1635370set;
                        String str2 = c1635370set2.LJ;
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        C1635120seU.LIZ(iIntValue, c1635370set2.LIZ, c1635370set2.LIZIZ, 0, new IFetchCategoryEffectListener() { // from class: X.0ser
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                            public final void onFail(ExceptionResult exceptionResult) {
                                c11kt.tryOnError(C1635120seU.LJIIIZ(exceptionResult));
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(CategoryPageModel categoryPageModel) {
                                CategoryEffectModel categoryEffects;
                                CategoryPageModel categoryPageModel2 = categoryPageModel;
                                InterfaceC2329309At<C1641660sp2<CategoryEffectModel>> interfaceC2329309At2 = c11kt;
                                if (categoryPageModel2 != null) {
                                    categoryEffects = categoryPageModel2.getCategoryEffects();
                                } else {
                                    categoryEffects = null;
                                }
                                interfaceC2329309At2.onSuccess(C1641650sp1.LIZ(categoryEffects));
                            }
                        }, interfaceC1635390sevInvoke, str, str2, c1635370set2.LIZJ, null, true);
                        return;
                    }
                    InterfaceC1635390sev interfaceC1635390sevInvoke2 = c1635310sen.LIZJ.invoke();
                    String str3 = this.LL.LIZLLL;
                    C1635370set c1635370set3 = c1635370set;
                    final C11KT c11kt2 = (C11KT) interfaceC2329309At;
                    C1635120seU.LIZIZ(interfaceC1635390sevInvoke2, str3, c1635370set3.LJ, iIntValue, c1635370set3.LIZ, c1635370set3.LIZIZ, c1635370set3.LIZJ, new IFetchCategoryEffectListener() { // from class: X.0ses
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            c11kt2.tryOnError(C1635120seU.LJIIIZ(exceptionResult));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(CategoryPageModel categoryPageModel) {
                            CategoryEffectModel categoryEffects;
                            CategoryPageModel categoryPageModel2 = categoryPageModel;
                            InterfaceC2329309At<C1641660sp2<CategoryEffectModel>> interfaceC2329309At2 = c11kt2;
                            if (categoryPageModel2 != null) {
                                categoryEffects = categoryPageModel2.getCategoryEffects();
                            } else {
                                categoryEffects = null;
                            }
                            interfaceC2329309At2.onSuccess(C1641650sp1.LIZ(categoryEffects));
                        }
                    });
                }
            });
        }
        return c11ksLJII.LJIL(new AkS486S0100000_25(c1635370set, 33)).LJJIJLIJ();
    }

    @Override // X.AbstractC1635300sem
    public final boolean LJ(C1635370set c1635370set, C1635370set c1635370set2) {
        if (c1635370set.LIZ == c1635370set2.LIZ) {
            return true;
        }
        return false;
    }

    public C1635310sen(Function0 function0, String str, C1635370set c1635370set) {
        super(c1635370set);
        this.LIZJ = function0;
        this.LIZLLL = str;
        this.LJ = true;
    }
}
